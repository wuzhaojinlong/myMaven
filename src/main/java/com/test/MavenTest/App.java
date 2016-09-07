package com.test.MavenTest;

import java.util.Date;
import java.util.Random;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Random a=new Random();
    	Date b=new Date();
    	System.out.println("当前时间："+b.toLocaleString());
    	System.out.println(a.nextInt());
        System.out.println( "Hello World!" );
    }
}
