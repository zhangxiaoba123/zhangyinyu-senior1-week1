package com.bw.domain;

public class Goods_type {

	private Integer tid;
	private String tname;
	public Goods_type(Integer tid, String tname) {
		super();
		this.tid = tid;
		this.tname = tname;
	}
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public Goods_type() {
		super();
	}
	@Override
	public String toString() {
		return "Goods_type [tid=" + tid + ", tname=" + tname + "]";
	}
	
}
