package com.beto.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {  //SPRING CONTEXT'I AYAGA KALDIRIYORUZ.
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
    
    }
}
