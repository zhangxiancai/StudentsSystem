package edu.wit.dao;

import edu.wit.entity.Student;

public interface IStudentDao {

	public Student selectStu(Student stu) throws Exception;
	
	public Student selectStu(int stuNo);
	
    public int updateStudent(Student stu) throws Exception;
    
	public int deleteStudent(Student stu);
	
	
}
