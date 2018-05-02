package com.simple_template.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App  {
    public static void main( String[] args ) {
       
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	
    	//Vehicle obj = (Vehicle) context.getBean("vehicle"); // ar fii luat car
    	Vehicle obj = (Vehicle) context.getBean("bike");
    	
    	
    	
//    	Tyre obj2 = (Tyre) context.getBean("tyre");
//    	obj.drive();
//    	
//    	System.out.println(obj2.getBrand());
    	
    	
    	// using Autowired example
    	Car myCar = (Car) context.getBean("car");
    	System.out.println(myCar.toString() + " " + myCar.getTyre());
    }
}
