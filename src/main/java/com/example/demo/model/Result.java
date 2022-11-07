package com.example.demo.model;

public class Result {
	private String result;
	private Long userId;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public Result(String result,Long userId) {
		super();
		this.result = result;
		this.userId = userId;
	}

	public Result() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
