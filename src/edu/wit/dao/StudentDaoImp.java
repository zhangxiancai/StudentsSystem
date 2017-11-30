package edu.wit.dao;

import java.util.List;
import java.util.Map;

import edu.wit.entity.Student;

public class StudentDaoImp extends DBUtil implements IStudentDao {

	@Override
	public Student selectStu(Student stu) throws Exception {
		Student stu2=null;
		List<Map<String,Object>> results=null;
		String sql=
				"select studentno ,studentName,phone,loginPwd from student where studentno=? and loginPwd=?";

		results=executeQuery(sql, stu.getStuNo(),stu.getStuPwd());
		if(results.size()>0)
		{
			stu2=new Student();
		stu2.setStuNo(Integer.valueOf(results.get(0).get("studentno").toString()));
		stu2.setStuName(results.get(0).get("studentName").toString());
		stu2.setPhone(results.get(0).get("phone").toString());
		stu2.setStuPwd(results.get(0).get("loginPwd").toString());
		}
		return stu2;
	}

	@Override
	public Student selectStu(int stuNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateStudent(Student stu) throws Exception {
		String sql="update student set loginPwd=?,phone=? where studentno=?";
		int a=DBUtil.executePreparedUpdate(sql, stu.getStuPwd(),stu.getPhone(),stu.getStuNo());
		return a;
	}

	@Override
	public int deleteStudent(Student stu) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
