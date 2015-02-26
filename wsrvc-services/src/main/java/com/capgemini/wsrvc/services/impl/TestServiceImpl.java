package com.capgemini.wsrvc.services.impl;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.capgemini.wsrvc.services.TestService;
import com.capgemini.wsrvc.services.bean.test.TestInput;
import com.capgemini.wsrvc.services.bean.test.TestOutput;
import com.capgemini.wsrvc.services.handler.TestHandler;
import com.capgemini.wsrvc.services.exceptions.ErreurFonctionnelleException;
import com.capgemini.wsrvc.services.exceptions.ErreurTechniqueException;

/**
 * Implementation services test.
 */
@WebService
public class TestServiceImpl extends AbstractServiceImpl implements
		TestService {

	private TestHandler handler;

	@Override
	@WebMethod
	public TestOutput test(
			final TestInput in)
			throws ErreurFonctionnelleException, ErreurTechniqueException {
		return handler.test(in);
	}

	@Override
	@WebMethod
	public String ping() throws ErreurFonctionnelleException,
			ErreurTechniqueException {
		return handler.ping();
	}

	/**
	 * @param aHandler
	 *            the handler to set
	 */
	public void setHandler(final TestHandler aHandler) {
		handler = aHandler;
	}
}
