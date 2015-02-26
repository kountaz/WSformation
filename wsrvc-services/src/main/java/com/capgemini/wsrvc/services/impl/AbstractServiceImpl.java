package com.capgemini.wsrvc.services.impl;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Context;
import javax.xml.ws.WebServiceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * @author JCORTES
 * 
 */
public abstract class AbstractServiceImpl {

	private static final Logger LOG = LoggerFactory
			.getLogger(AbstractServiceImpl.class);

	/**
	 * @return the log
	 */
	protected static final Logger getLog() {
		return LOG;
	}

	@Context
	private ServletContext context;
	@Context
	private HttpServletRequest request;

	@Resource
	private WebServiceContext wsContext;

	/**
	 * @return the request
	 */
	public final HttpServletRequest getRequest() {
		return request;
	}

}
