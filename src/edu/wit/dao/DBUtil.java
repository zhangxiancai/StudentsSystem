package edu.wit.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DBUtil {

	public static Connection getConnection() throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/myschool?useSSL=false", "root", "123456");
		return conn;
	}
	public static int executeUpdate(String sql)  throws Exception {
		int rows = 0;		
		Connection conn = getConnection();
		Statement stmt  =conn.createStatement();
		rows = stmt.executeUpdate(sql);
		closeAll(conn, stmt, null);
		return rows;
	}
	
	
	
	public static void closeAll(Connection conn,Statement stmt,ResultSet res) throws SQLException {
		if(res!=null){
			res.close();
		}
		if(stmt!=null){
			stmt.close();
		}
		if(conn!=null&&!conn.isClosed()){
			conn.close();
		}
	}
	
	public static int executePreparedUpdate(String sql,Object...objs)  throws Exception {
	
		Connection conn = getConnection();
		PreparedStatement pre=conn.prepareStatement(sql);
		for (int i = 0; i < objs.length; i++) {
			pre.setObject(i+1, objs[i]);
		}
	    int row= pre.executeUpdate();
	    closeAll(conn,pre,null);
	    return row;
	}
	public static List<Map<String,Object>> executeQuery(String sql,Object...objs) throws Exception
	{
		Connection conn = getConnection();
		PreparedStatement pre=conn.prepareStatement(sql);
		for (int i = 0; i < objs.length; i++) {
			pre.setObject(i+1, objs[i]);
		}
		ResultSet res=pre.executeQuery();
		ResultSetMetaData meta=res.getMetaData();
		int temp=meta.getColumnCount();
		List<Map<String,Object>> maps=new ArrayList<>();
		while(res.next())
		{
			Map<String,Object> map=new HashMap<String,Object>();
		    for(int i=1;i<=temp;i++)
		    {
		    	String key=meta.getColumnLabel(i);
		    	Object obj=res.getObject(i);
		    	map.put(key,obj);
		    }
		    maps.add(map);
			
		}
		
		closeAll(conn, pre, res);
		return maps;
		
		
	}
	
	
	
	
	
	
	
}
