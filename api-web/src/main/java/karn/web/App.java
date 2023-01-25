package karn.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@ComponentScan("karn")
@ImportResource("classpath:spring-beans.xml")
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        ApplicationContext applicationContext = SpringApplication.run(App.class,args);
        System.out.println(applicationContext.getBean("mybean"));
    }
}
