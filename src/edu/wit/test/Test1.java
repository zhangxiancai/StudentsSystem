package edu.wit.test;

import edu.wit.dao.IStudentDao;
import edu.wit.factory.Factory;
import edu.wit.services.StudentService;
import edu.wit.xml.XmlHelper;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		XmlHelper.parseXml();
		String classname=XmlHelper.get("studentDao1");
		System.out.println(classname);
		try {
			Factory fac=(Factory)Class.forName(classname).newInstance();
			IStudentDao dao=fac.createStudentDao();
			StudentService stuser=new StudentService();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
