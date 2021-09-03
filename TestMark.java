package com.raystec.jdbc.rb;

import javax.print.attribute.TextSyntax;

import JDBC.MarksheetBean;
import JDBC.MarksheetModel;

public class TestMark {

	public static void main(String[] args) throws Exception {
	testAdd();
	}
	public static void testAdd() throws Exception {
		Marksheet msb= new Marksheet();
		
		msb.setID(11);
		msb.setRollNo("C108");
		msb.setFname("HITESH");
		msb.setLname("KUMAR");
		msb.setPhy(65);
		msb.setChem(80);
		msb.setMath(95);
		
		MarkModel md= new MarkModel();
	
		md.add(msb);
		
		
	}
}
