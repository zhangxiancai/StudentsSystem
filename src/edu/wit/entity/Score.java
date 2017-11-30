package edu.wit.entity;

import java.io.Serializable;

public class Score implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int scoreId;
	private int studentNO;
	private int subjectNO;
	private int score;
	public Score(){};
	public Score(int scoreId, int studentNO, int subjectNO, int score) {
		super();
		this.scoreId = scoreId;
		this.studentNO = studentNO;
		this.subjectNO = subjectNO;
		this.score = score;
	}
	public int getScoreId() {
		return scoreId;
	}
	public void setScoreId(int scoreId) {
		this.scoreId = scoreId;
	}
	public int getStudentNO() {
		return studentNO;
	}
	public void setStudentNO(int studentNO) {
		this.studentNO = studentNO;
	}
	public int getSubjectNO() {
		return subjectNO;
	}
	public void setSubjectNO(int subjectNO) {
		this.subjectNO = subjectNO;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
}
