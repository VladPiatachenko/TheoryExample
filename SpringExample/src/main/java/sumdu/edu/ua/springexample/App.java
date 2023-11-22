/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sumdu.edu.ua.springexample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Oksana
 */
public class App {
    public static void main(String[] args){
        ApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml");
        
        Soda a=(Soda) factory.getBean("soda");
        a.info();
    }
}
