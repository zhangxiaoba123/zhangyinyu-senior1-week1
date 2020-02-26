package com.bw.domain;

public class condition {

	private Integer pageNum;
	
	private String tname;
	private String bname;
	private double p1;
	private double p2;
	
	private String name;

	public Integer getPageNum() {
		return pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public double getP1() {
		return p1;
	}

	public void setP1(double p1) {
		this.p1 = p1;
	}

	public double getP2() {
		return p2;
	}

	public void setP2(double p2) {
		this.p2 = p2;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public condition() {
		super();
	}

	public condition(Integer pageNum, String tname, String bname, double p1, double p2, String name) {
		super();
		this.pageNum = pageNum;
		this.tname = tname;
		this.bname = bname;
		this.p1 = p1;
		this.p2 = p2;
		this.name = name;
	}

	@Override
	public String toString() {
		return "condition [pageNum=" + pageNum + ", tname=" + tname + ", bname=" + bname + ", p1=" + p1 + ", p2=" + p2
				+ ", name=" + name + "]";
	}
	
}
