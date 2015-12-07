package com.softserveinc.test;

import static org.junit.Assert.*;

import java.nio.channels.AsynchronousServerSocketChannel;
import java.util.List;
import java.util.Properties;

import javax.ejb.EJB;
import javax.ejb.embeddable.EJBContainer;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.softserveinc.entity.Author;
import com.softserveinc.facade.AuthorFacade;



public class AuthorTest {
	
//	@EJB
//	static AuthorFacade authorFacade;
//	
//	@BeforeClass
//	public static void setUpClass() throws NamingException {
//		
//	}
//	
//	@AfterClass
//	public static void tearDownClass() {
//
//	}
//	
////	@EJB
////	AuthorFacade authorFacade;
//	
////	protected void setUp() throws Exception {
////		Context context = new InitialContext();
////		authorFacade = (AuthorFacade)context.lookup("java:app/Stable/StableEntityAccess!ebj.eao.StableEntityAccess");
////	
////
////	
////	}
//
//	
//	@Test
//	public void createTest() throws NamingException {
//	
//		int a = 1;
//		int b = 1;
//		assertEquals(a, b);
//		
//	
//	}

}
