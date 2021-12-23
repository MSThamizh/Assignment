package com.thoughtfocus.ArthmeticException;

public class ArithmeticException{
    public static void main(String args[])
    {
    	System.out.println("Start");
    	int a = 1, b = 0;
        try {
            int c = a/b;  
            System.out.println ("Division is = " + c);
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        System.out.println("End");
    }
}
