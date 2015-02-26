package com.capgemini.wsrvc.services.handler.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.capgemini.wsrvc.services.bean.test.TestInput;
import com.capgemini.wsrvc.services.bean.test.TestOutput;
import com.capgemini.wsrvc.services.handler.TestHandler;
import com.capgemini.wsrvc.services.exceptions.ErreurFonctionnelleException;
import com.capgemini.wsrvc.services.exceptions.ErreurTechniqueException;

/**
 * Implementation services test.
 */
@Service
@Scope("singleton")
public class TestHandlerImpl extends AbstractHandlerImpl implements
        TestHandler {

    private static final Logger LOG = LoggerFactory
            .getLogger(TestHandlerImpl.class);

    @Override
    public TestOutput test(
            final TestInput in)
            throws ErreurFonctionnelleException, ErreurTechniqueException {
        LOG.debug("Service Test.test execute");

        TestOutput out = new TestOutput();
		if (in != null) {
			out.setId(in.getId());
		}
        return out;
    }

    @Override
    public String ping() throws ErreurFonctionnelleException,
            ErreurTechniqueException {
        LOG.debug("Service Test.ping execute");
        return "OK";
    }

}
