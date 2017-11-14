package com.n1books.pilot;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.n1books.pilot.di.MessageBean;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="beaninit.xml")
public class BeanJUnitTest {

	@Autowired
	ApplicationContext context;
	
	@Test
	public void testSayHello() {
		MessageBean mbean = (MessageBean) context.getBean("mbean");
		assertEquals("Hello~", mbean.sayHello());
	}
}
