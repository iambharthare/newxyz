package com.raystec.jdbc.rb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ResourceBundle;

public class MarkModel {
	
	
	public void add(Marksheet m) throws Exception {
		ResourceBundle rb= ResourceBundle.getBundle("com.raystec.jdbc.rb.app");
		Class.forName(rb.getString("driver"));
		Connection conn= DriverManager.getConnection(rb.getString("url"), rb.getString("username"), rb.getString("password"));
		conn.setAutoCommit(false);
		PreparedStatement ps= conn.prepareStatement("Insert into marksheet values(?,?,?,?,?,?,?)");

		ps.setInt(1, m.getID());
		ps.setString(2, m.getRollNo());
		ps.setString(3, m.getFname());
		ps.setString(4, m.getLname());
		ps.setInt(5, m.getPhy());
		ps.setInt(6, m.getChem());
		ps.setInt(7, m.getMath());
		
		ps.execute();
		conn.commit();
		System.out.println("DONE INSERTION");
		ps.close();
		conn.close();
		
	}

}
