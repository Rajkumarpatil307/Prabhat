package com.First;




public class Hello {

	public static void main(String[] args) {
		String str="Hello World";
		 String revString="";
		 for (int i=0;i<str.length();i++) {
			 revString=str.charAt(i)+revString;
		 }
		System.out.println(revString);
	}

}
