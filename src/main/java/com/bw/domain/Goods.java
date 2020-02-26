package com.bw.domain;

import java.util.List;

public class Goods {

	private Integer id;
	private String name;
	private String name1;
	private double price;
	private String measure;
	private Integer num;
	private String label;
	private String pic;
	
	private List<Goods_type> type;
	private List<Goods_brand> brand;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName1() {
		return name1;
	}
	public void setName1(String name1) {
		this.name1 = name1;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getMeasure() {
		return measure;
	}
	public void setMeasure(String measure) {
		this.measure = measure;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	public List<Goods_type> getType() {
		return type;
	}
	public void setType(List<Goods_type> type) {
		this.type = type;
	}
	public List<Goods_brand> getBrand() {
		return brand;
	}
	public void setBrand(List<Goods_brand> brand) {
		this.brand = brand;
	}
	public Goods(Integer id, String name, String name1, double price, String measure, Integer num, String label,
			String pic, List<Goods_type> type, List<Goods_brand> brand) {
		super();
		this.id = id;
		this.name = name;
		this.name1 = name1;
		this.price = price;
		this.measure = measure;
		this.num = num;
		this.label = label;
		this.pic = pic;
		this.type = type;
		this.brand = brand;
	}
	public Goods() {
		super();
	}
	@Override
	public String toString() {
		return "Goods [id=" + id + ", name=" + name + ", name1=" + name1 + ", price=" + price + ", measure=" + measure
				+ ", num=" + num + ", label=" + label + ", pic=" + pic + ", type=" + type + ", brand=" + brand + "]";
	}
	
	
	
	
}
