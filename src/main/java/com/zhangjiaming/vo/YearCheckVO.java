package com.zhangjiaming.vo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.zhangjiaming.pojo.YearCheck;

public class YearCheckVO extends YearCheck {

	private Double startRegistMoney;
	
	private Double endRegistMoney;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date startCreate_time;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date endCreate_time;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date startYearcheck_date;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date endYearcheck_date;

	public Double getStartRegistMoney() {
		return startRegistMoney;
	}

	public void setStartRegistMoney(Double startRegistMoney) {
		this.startRegistMoney = startRegistMoney;
	}

	public Double getEndRegistMoney() {
		return endRegistMoney;
	}

	public void setEndRegistMoney(Double endRegistMoney) {
		this.endRegistMoney = endRegistMoney;
	}

	public Date getStartCreate_time() {
		return startCreate_time;
	}

	public void setStartCreate_time(Date startCreate_time) {
		this.startCreate_time = startCreate_time;
	}

	public Date getEndCreate_time() {
		return endCreate_time;
	}

	public void setEndCreate_time(Date endCreate_time) {
		this.endCreate_time = endCreate_time;
	}

	public Date getStartYearcheck_date() {
		return startYearcheck_date;
	}

	public void setStartYearcheck_date(Date startYearcheck_date) {
		this.startYearcheck_date = startYearcheck_date;
	}

	public Date getEndYearcheck_date() {
		return endYearcheck_date;
	}

	public void setEndYearcheck_date(Date endYearcheck_date) {
		this.endYearcheck_date = endYearcheck_date;
	}

	@Override
	public String toString() {
		return "YearCheckVO [startRegistMoney=" + startRegistMoney + ", endRegistMoney=" + endRegistMoney
				+ ", startCreate_time=" + startCreate_time + ", endCreate_time=" + endCreate_time
				+ ", startYearcheck_date=" + startYearcheck_date + ", endYearcheck_date=" + endYearcheck_date + "]";
	}
	
	
}
