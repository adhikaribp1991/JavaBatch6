package com.syntax.class20_1;

public class PractiseRepl {
	static String maxLength(String[] words){
		int index=0;
	    int largestLength=words[0].length();
	    for(int i=0;i<words.length;i++) {
	    	if(words[i].length()>largestLength) {
	    		index=i;
	    		
	    		
	    	}
	    	
	    }
	    return words[index];
	  }
	  
		
		public static void main(String[] args) {
			String[] arr = {"hey","yolo","hi","this is long"};
			System.out.println(maxLength(arr));
			//should print "this is long"
			
		}
		
	}
