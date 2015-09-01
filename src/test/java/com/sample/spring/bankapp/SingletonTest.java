package com.sample.spring.bankapp;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertNotSame;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sample.spring.bankapp.controller.FixedDepositController;
import com.sample.spring.bankapp.dao.FixedDepositDao;

public class SingletonTest {
	private static ApplicationContext context;
	
	@BeforeClass
	public static void init() {
		context = new ClassPathXmlApplicationContext("classpath:META-INF/spring/applicationContext.xml");
	}
	
	@Test
	public void testInstance() {
		FixedDepositController controller1 = (FixedDepositController) context.getBean("controller");
		FixedDepositController controller2 = (FixedDepositController) context.getBean("controller");
		assertSame("Different FixedDepositController instance", controller1, controller2);
	}
	
	@Test
	public void testReference() {
		FixedDepositController controller = (FixedDepositController) context.getBean("controller");
		FixedDepositDao dao1 = controller.getFixedDepositService().getFixedDepositDao();
		FixedDepositDao dao2 = (FixedDepositDao) context.getBean("dao");
		assertSame("Different FixedDepositDao instance", dao2, dao1);
	}

	
	@Test
	public void testSingletonScope() {
		ApplicationContext anotherContext = new ClassPathXmlApplicationContext("classpath:META-INF/spring/applicationContext.xml");

		FixedDepositController controller1 = (FixedDepositController) anotherContext.getBean("controller");
		FixedDepositController controller2 = (FixedDepositController) context.getBean("controller");
		assertNotSame("Same FixedDepositController instance", controller1, controller2);
	}
	
	@Test
	public void testSingletonScopePerBeanDef() {
		FixedDepositDao dao1 = (FixedDepositDao) context.getBean("oneDao");
		FixedDepositDao dao2 = (FixedDepositDao) context.getBean("anotherDao");
		assertNotSame("Same FixedDepositDao instance", dao2, dao1);
	}
}
