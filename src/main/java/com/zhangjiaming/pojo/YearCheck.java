package com.zhangjiaming.pojo;

import java.math.BigInteger;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class YearCheck {

	private Integer id;
	
	private String keyword;
	
	private String message;
	
	private String company;
	
	private String thing;
	
	private String address;
	
	private Double registMoney;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date create_time;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date yearcheck_date;
	
	private Integer yearcheck_status;
	
	private String ps;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getThing() {
		return thing;
	}

	public void setThing(String thing) {
		this.thing = thing;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Double getRegistMoney() {
		return registMoney;
	}

	public void setRegistMoney(Double registMoney) {
		this.registMoney = registMoney;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public Date getYearcheck_date() {
		return yearcheck_date;
	}

	public void setYearcheck_date(Date yearcheck_date) {
		this.yearcheck_date = yearcheck_date;
	}

	public Integer getYearcheck_status() {
		return yearcheck_status;
	}

	public void setYearcheck_status(Integer yearcheck_status) {
		this.yearcheck_status = yearcheck_status;
	}

	public String getPs() {
		return ps;
	}

	public void setPs(String ps) {
		this.ps = ps;
	}

	@Override
	public String toString() {
		return "YearCheck [id=" + id + ", keyword=" + keyword + ", message=" + message + ", company=" + company
				+ ", thing=" + thing + ", address=" + address + ", registMoney=" + registMoney + ", create_time="
				+ create_time + ", yearcheck_date=" + yearcheck_date + ", yearcheck_status=" + yearcheck_status
				+ ", ps=" + ps + "]";
	}

	public YearCheck(Integer id, String keyword, String message, String company, String thing, String address,
			Double registMoney, Date create_time, Date yearcheck_date, Integer yearcheck_status, String ps) {
		super();
		this.id = id;
		this.keyword = keyword;
		this.message = message;
		this.company = company;
		this.thing = thing;
		this.address = address;
		this.registMoney = registMoney;
		this.create_time = create_time;
		this.yearcheck_date = yearcheck_date;
		this.yearcheck_status = yearcheck_status;
		this.ps = ps;
	}

	public YearCheck() {
		super();
	}

}
