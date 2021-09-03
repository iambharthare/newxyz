package com.raystec.jdbc.rb;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleHindi {

	public static void main(String[] args) {
		ResourceBundle rb= ResourceBundle.getBundle("com.raystec.jdbc.rb.app", new Locale("hi"));
		System.out.println(rb.getString("greeting"));

	}

}
