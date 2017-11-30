package edu.wit.entity;

import java.io.Serializable;

public class Student implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int stuNo;
	private String stuName;
	private String stuPwd;
	private String email;
	private String phone;
	public Student(){};
	public Student(int stuNo, String stuName, String stuPwd, String email,
			String phone) {
		super();
		this.stuNo = stuNo;
		this.stuName = stuName;
		this.stuPwd = stuPwd;
		this.email = email;
		this.phone = phone;
	}
	public int getStuNo() {
		return stuNo;
	}
	public void setStuNo(int stuNo) {
		this.stuNo = stuNo;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getStuPwd() {
		return stuPwd;
	}
	public void setStuPwd(String stuPwd) {
		this.stuPwd = stuPwd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}
