package com.decorator.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import com.decorator.lowercasefile.LowerCaseInputStream;

public class InputTest {
	public static void main(String[] args) throws IOException {
		int c;
		InputStream ip = new FileInputStream(InputTest.class.getResource("/text.txt").getFile());
		ip = new LowerCaseInputStream(ip);
		StringBuffer strBf = new StringBuffer();
		
		while((c = ip.read()) > -1){
			strBf.append((char)c);
		}
		System.out.println(strBf.toString());
		
		ip.close();
	}

}
