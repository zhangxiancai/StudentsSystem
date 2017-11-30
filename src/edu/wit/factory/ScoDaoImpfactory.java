package edu.wit.factory;

import edu.wit.dao.IScoreDao;
import edu.wit.dao.IStudentDao;
import edu.wit.dao.ScoreDaoImp;

public class ScoDaoImpfactory extends Factory {

	@Override
	public IStudentDao createStudentDao() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IScoreDao createScoreDao() {
		
		return new ScoreDaoImp();
	}

}
