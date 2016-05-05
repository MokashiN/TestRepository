package com.programcreek.helloworld.CategoryVO;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.programcreel.helloworld.model.Category;

public class CategoryDaoImpl implements CategoryVO
{
	
	public String createData()
	{
		Category c1=new Category(101,"Car Toy",10);
		Category c2=new Category(102,"Racing Car",20);
		Category c3=new Category(103,"Doll ",25);
		Category c4=new Category(104,"Hair Dresser",30);
		Category c5=new Category(105,"PQR",25);

		System.out.println(c1.getPno());
		System.out.println(c1.getPname());
		System.out.println(c1.getPqty());
		
		List<Category> ca1 = new ArrayList<Category>();
		ca1.add(c1);
		ca1.add(c2);
		ca1.add(c3);
		ca1.add(c4);
		ca1.add(c5);
		
		Gson g=new GsonBuilder().create();
		String data=g.toJson(ca1);
		return data;
		
	}
	public String createData1()
	{
		Category c6=new Category(1001,"A",100);
		Category c7=new Category(1002,"B",120);
		Category c8=new Category(1003,"C",150);
		Category c9=new Category(1004,"D",200);
		Category c10=new Category(1005,"E",250);

		System.out.println(c6.getPno());
		System.out.println(c7.getPname());
		System.out.println(c8.getPqty());
		
		List<Category> ca2 = new ArrayList<Category>();
		ca2.add(c6);
		ca2.add(c7);
		ca2.add(c8);
		ca2.add(c9);
		ca2.add(c10);
		
		Gson g1=new GsonBuilder().create();
		String data1=g1.toJson(ca2);
		return data1;
		
	}
	public String createData2()
	{
		Category c11=new Category(1001,"P",100);
		Category c12=new Category(1002,"Q",120);
		Category c13=new Category(1003,"R",150);
		Category c14=new Category(1004,"S",200);
		Category c15=new Category(1005,"T",250);

		System.out.println(c11.getPno());
		System.out.println(c11.getPname());
		System.out.println(c11.getPqty());
		
		List<Category> ca3 = new ArrayList<Category>();
		ca3.add(c11);
		ca3.add(c12);
		ca3.add(c13);
		ca3.add(c14);
		ca3.add(c15);
		
		Gson g1=new GsonBuilder().create();
		String data1=g1.toJson(ca3);
		return data1;
		
	}
}
