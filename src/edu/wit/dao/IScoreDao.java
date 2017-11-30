package edu.wit.dao;

import java.util.List;
import java.util.Map;

import edu.wit.entity.Student;
import edu.wit.entity.Subject;

public interface IScoreDao {

	public List<Map<String,Object>> selectScore(Student stu) throws Exception;
}
