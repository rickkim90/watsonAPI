package com.n1books.pilot;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.google.gson.Gson;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="beaninit.xml")
public class GSonTest {
	@Autowired
	ApplicationContext context;

	@Test
	public void testGSON() {
		Gson gson = new Gson();
		assertEquals("1", gson.toJson(1));            // ==> 1
//		assertEquals(1, gson.toJson(new Integer(1))); // ==> ?
		assertEquals("abcd",gson.toJson("abcd"));       // ==> "abcd"
		assertEquals(10,gson.toJson(new Long(10))); // ==> 10
//		int[] values = { 1 };
//		assertEquals(1,gson.toJson(values));       // ==> [1]
	}
}
