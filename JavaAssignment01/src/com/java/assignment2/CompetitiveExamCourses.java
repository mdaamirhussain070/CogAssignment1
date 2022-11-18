package com.java.assignment2;

public class CompetitiveExamCourses {
	
	private int courseId;
	private String courseName;
	private String courceTeacher;
	private int courseDuration;
	private double totalFee;
	public CompetitiveExamCourses(int courseId, String courseName, String courceTeacher, int courseDuration,
			double totalFee) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.courceTeacher = courceTeacher;
		this.courseDuration = courseDuration;
		this.totalFee = totalFee;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourceTeacher() {
		return courceTeacher;
	}
	public void setCourceTeacher(String courceTeacher) {
		this.courceTeacher = courceTeacher;
	}
	public int getCourseDuration() {
		return courseDuration;
	}
	public void setCourseDuration(int courseDuration) {
		this.courseDuration = courseDuration;
	}
	public double getTotalFee() {
		return totalFee;
	}
	public void setTotalFee(double totalFee) {
		this.totalFee = totalFee;
	}
	@Override
	public String toString() {
		return "CompetitiveExamCourses [courseId=" + courseId + ", courseName=" + courseName + ", courceTeacher="
				+ courceTeacher + ", courseDuration=" + courseDuration + ", totalFee=" + totalFee + "]";
	}
	
	
	
	

}
