package edu.wit.dao;

import java.util.List;
import java.util.Map;

import edu.wit.entity.Student;
import edu.wit.entity.Subject;

public class ScoreDaoImp implements IScoreDao {

	@Override
	public List<Map<String,Object>> selectScore(Student stu) throws Exception {
		String sql="select studentName 姓名 ,cname 课程名称,studentresult 考试成绩, examdate 考试时间"
				+ " from result, student ,course"
				+ " where result.studentno=student.studentNo and course.CID=result.CID and student.studentno=?";
		
		
		return DBUtil.executeQuery(sql, stu.getStuNo());
		
		
	}
	

}
