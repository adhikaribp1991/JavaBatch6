package com.syntax.class13;

public class Java {

	static String surround(String s,String c){
		String newString=s.replace(c, "("+c+")");
		
		
			return newString;
	}
			//test case below (dont change):
			public static void main(String[] args){
				System.out.println(surround("abcabcabc","c")); //"ab(c)ab(c)ab(c)"
				System.out.println(surround("technology","o")); //"techn(o)l(o)gy"
			}
		}