package com.beto.tester;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = {
//    "classpath:test-spring-db.xml",
//    "classpath:test-config.xml"})
public class AppTest {

    @Test
    public void launchJob() throws Exception {
        try {
            ApplicationContext context = new ClassPathXmlApplicationContext("test-config.xml");
            Assert.assertFalse(context==null);
        }catch (Exception e){
            System.out.println();
            System.out.println();
            System.out.println("-----------------------------------------------");
            System.out.println("------------------ERROR-------------------");
            System.err.println("TEST ERROR : Maybe you are change the Database Jar." +
                               " It's default mysql !!!");
            System.out.println("-----------------------------------------------");
            System.out.println();
            System.out.println();
            e.printStackTrace();
        }

    }
}
