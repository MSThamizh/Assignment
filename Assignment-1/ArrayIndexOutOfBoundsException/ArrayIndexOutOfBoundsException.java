package com.thoughtfocus.ArrayIndexOutOfBoundsException;

public class ArrayIndexOutOfBoundsException {
	public static void main(String args[])
    {
		System.out.println ("Start");
		int a[] = new int[10];
		try{            
            a[11] = 15; 
        }
        catch(Exception e){
            e.printStackTrace();
        }
        System.out.println ("End");
    }
}

