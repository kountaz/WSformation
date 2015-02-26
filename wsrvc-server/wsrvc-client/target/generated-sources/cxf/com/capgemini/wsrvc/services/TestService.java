package com.capgemini.wsrvc.services;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.5
 * 2015-02-26T16:42:50.957+01:00
 * Generated source version: 2.7.5
 * 
 */
@WebService(targetNamespace = "http://services.wsrvc.capgemini.com/", name = "TestService")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface TestService {

    @WebResult(name = "pingResponse", targetNamespace = "http://services.wsrvc.capgemini.com/", partName = "pingResponse")
    @WebMethod
    public java.lang.String ping() throws ErreurTechniqueException, ErreurFonctionnelleException;

    @WebResult(name = "testResponse", targetNamespace = "http://services.wsrvc.capgemini.com/", partName = "testResponse")
    @WebMethod
    public TestOutput test(
        @WebParam(partName = "test", name = "test", targetNamespace = "http://services.wsrvc.capgemini.com/")
        TestInput test
    ) throws ErreurTechniqueException, ErreurFonctionnelleException;
}
