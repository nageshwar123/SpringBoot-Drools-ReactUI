package com.Nagesh.drools.model;

//import lombok.Data;

// @Data
public class appli {
	
	private int score;
	private String status;
	private boolean succ;
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public boolean isSucc() {
		return succ;
	}
	public void setSucc(boolean succ) {
		this.succ = succ;
	}
	
	
}
