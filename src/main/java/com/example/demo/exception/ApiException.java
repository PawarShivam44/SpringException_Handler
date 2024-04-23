package com.example.demo.exception;

import java.time.LocalDate;

public class ApiException {

	private String errMsg;
	
	private Integer errCode;
	
	private LocalDate time;

	public String getErrMsg() {
		return errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}

	public Integer getErrCode() {
		return errCode;
	}

	public void setErrCode(Integer errCode) {
		this.errCode = errCode;
	}

	public LocalDate getTime() {
		return time;
	}

	public void setTime(LocalDate time) {
		this.time = time;
	}

	public ApiException(String errMsg, Integer errCode, LocalDate time) {
		super();
		this.errMsg = errMsg;
		this.errCode = errCode;
		this.time = time;
	}

	
	
}
