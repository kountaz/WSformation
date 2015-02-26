package com.capgemini.wsrvc.services.handler.impl;

import javax.servlet.http.HttpServletRequest;

import org.apache.cxf.jaxrs.ext.MessageContext;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.capgemini.wsrvc.services.bean.test.TestInput;
import com.capgemini.wsrvc.services.bean.test.TestOutput;
import com.capgemini.wsrvc.services.exceptions.ErreurFonctionnelleException;
import com.capgemini.wsrvc.services.exceptions.ErreurTechniqueException;
import com.capgemini.wsrvc.services.handler.TestHandler;

/**
 * 
 * @author JCORTES
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/*-context.xml" })
public class TestHandlerImplTestTest {

	private static TestHandler service;

	/**
	 * setup.
	 * 
	 * @throws Exception
	 *             exception
	 */
	@Before
	public void setUp() throws Exception {
		if (service == null) {
			service = new TestHandlerImpl();
			MessageContext context = Mockito.mock(MessageContext.class);
			HttpServletRequest req = Mockito.mock(HttpServletRequest.class);
			Mockito.when(req.getRemoteAddr()).thenReturn("192.168.0.10");
			Mockito.when(req.getRequestedSessionId()).thenReturn("1234");
			Mockito.when(context.getHttpServletRequest()).thenReturn(req);
			((TestHandlerImpl) service).setContext(context);
		}
	}

	/**
	 * 
	 * @throws ErreurFonctionnelleException
	 *             exF
	 * @throws ErreurTechniqueException
	 *             exT
	 */
	@Test
	public void testTest()
			throws ErreurFonctionnelleException, ErreurTechniqueException {
		try {
			TestInput in = new TestInput();
			in.setId("123456789");
			TestOutput out = service.test(in);
			Assert.assertNotNull(out);
			Assert.assertEquals(in.getId(), out.getId());
		} catch (ErreurFonctionnelleException e) {
			Assert.fail("Erreur non prévue");
		} catch (ErreurTechniqueException e) {
			Assert.fail("Erreur non prévue");
		}
	}

}
