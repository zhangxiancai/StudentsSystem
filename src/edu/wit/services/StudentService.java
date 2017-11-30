package edu.wit.services;

import java.util.List;
import java.util.Map;

import edu.wit.dao.IScoreDao;
import edu.wit.dao.IStudentDao;
import edu.wit.dao.StudentDaoImp;
import edu.wit.entity.Student;
import edu.wit.factory.Factory;

public class StudentService {

	private IStudentDao dao=Factory.getFactory("studentDao1").createStudentDao();
	private IScoreDao dao2=Factory.getFactory("scoreDao1").createScoreDao();
	
	
	
	public int registerStudentInfo(Student student) {   
		return 0;
	}
	public int updateStudentInfo(Student student) throws Exception { 
		return dao.updateStudent(student);
	}
	public Student login(Student stu) throws Exception {
		return dao.selectStu(stu);
	}
	
	public List<Map<String,Object>> selectScore(Student stu) throws Exception{   
	
	 return dao2.selectScore(stu);
	}
}
