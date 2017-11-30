package edu.wit.factory;

import edu.wit.dao.IScoreDao;
import edu.wit.dao.IStudentDao;
import edu.wit.dao.StudentDaoImp;

public  class StuDaoImpfactory extends Factory {

	public IStudentDao createStudentDao() {
		return new StudentDaoImp();

	}

	@Override
	public IScoreDao createScoreDao() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
