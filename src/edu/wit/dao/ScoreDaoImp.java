package edu.wit.dao;

import java.util.List;
import java.util.Map;

import edu.wit.entity.Student;
import edu.wit.entity.Subject;

public class ScoreDaoImp implements IScoreDao {

	@Override
	public List<Map<String,Object>> selectScore(Student stu) throws Exception {
		String sql="select studentName ���� ,cname �γ�����,studentresult ���Գɼ�, examdate ����ʱ��"
				+ " from result, student ,course"
				+ " where result.studentno=student.studentNo and course.CID=result.CID and student.studentno=?";
		
		
		return DBUtil.executeQuery(sql, stu.getStuNo());
		
		
	}
	

}
