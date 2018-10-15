package com.jettjia.springbootlesson1start;

import com.jettjia.springbootlesson1start.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootLesson1StartApplicationTests {

	@Autowired
	private Person person;

	@Test
	public void contextLoads() {
		System.out.println(person);
	}

	@Autowired
	ApplicationContext ioc;

	@Test
	public void testHelloService() {
        boolean b = ioc.containsBean("helloService02");
        System.out.println(b);
    }
}