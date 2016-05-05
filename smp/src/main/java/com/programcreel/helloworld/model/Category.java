package com.programcreel.helloworld.model;

public class Category 
{
	int pno;
	String pname;
	int pqty;
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPqty() {
		return pqty;
	}
	public void setPqty(int pqty) {
		this.pqty = pqty;
	}
	public Category(int pno,String pname,int pqty) 
	{
		this.pno=pno;
		this.pname=pname;
		this.pqty=pqty;
	}
}
