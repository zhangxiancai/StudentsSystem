package edu.wit.factory;

import edu.wit.xml.XmlHelper;
import edu.wit.dao.*;

public abstract class Factory {
	public abstract IStudentDao createStudentDao();
	
//	public abstract void createSubjectDao();
//	
	public abstract IScoreDao createScoreDao();
	
	public static Factory getFactory(String name)
	{
		
		Factory factory=null;
		XmlHelper.parseXml();
		String classname=XmlHelper.get(name);
		
		try {
			factory= (Factory)Class.forName(classname).newInstance();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return factory;
	}
	
	
}
