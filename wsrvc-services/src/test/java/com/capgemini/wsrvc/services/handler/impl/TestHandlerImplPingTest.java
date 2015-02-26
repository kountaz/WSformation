package com.capgemini.wsrvc.services.handler.impl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

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
public class TestHandlerImplPingTest {

    private static TestHandler service;

    private static final String OK = "OK";

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
    public void testPing() throws ErreurFonctionnelleException,
            ErreurTechniqueException {
        try {
            Assert.assertEquals(OK, service.ping());
        } catch (ErreurFonctionnelleException e) {
            Assert.fail("Erreur non prévue");
        }
    }

}
