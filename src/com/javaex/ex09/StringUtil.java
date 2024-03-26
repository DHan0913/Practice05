package com.javaex.ex09;

public class StringUtil {
    
    public static String concatString(String[] strArray){
    	String resultStr="";   
    		for (String str : strArray) {
    			resultStr+=(str); 
            }
            
    			return resultStr; 
        }
    

}
