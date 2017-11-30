package edu.wit.entity;

import java.io.Serializable;

public class Subject implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int cID;
	private String cName;
	private int classHour;
	public Subject(){};
	public Subject(int cID, String cName, int classHour) {
		super();
		this.cID = cID;
		this.cName = cName;
		this.classHour = classHour;
	}
	public int getcID() {
		return cID;
	}
	public void setcID(int cID) {
		this.cID = cID;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public int getClassHour() {
		return classHour;
	}
	public void setClassHour(int classHour) {
		this.classHour = classHour;
	}
}
