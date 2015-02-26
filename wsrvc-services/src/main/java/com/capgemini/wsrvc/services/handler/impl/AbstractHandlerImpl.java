package com.capgemini.wsrvc.services.handler.impl;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Context;

import org.apache.cxf.jaxrs.ext.MessageContext;

public class AbstractHandlerImpl {

	@Context
	private MessageContext context;

	/**
	 * Retourn la requête http
	 * 
	 * @return HttpServletRequest
	 */
	public HttpServletRequest getRequest() {
		try {
			return context.getHttpServletRequest();
		} catch (NullPointerException e) {
			return null;
		}
	}

	/**
	 * @return the context
	 */
	public final MessageContext getContext() {
		return context;
	}

	/**
	 * @param context
	 *            the context to set
	 */
	public final void setContext(MessageContext context) {
		this.context = context;
	}
}
