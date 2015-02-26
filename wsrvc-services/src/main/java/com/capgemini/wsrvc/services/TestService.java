package com.capgemini.wsrvc.services;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.capgemini.wsrvc.services.bean.test.TestInput;
import com.capgemini.wsrvc.services.bean.test.TestOutput;
import com.capgemini.wsrvc.services.exceptions.ErreurFonctionnelleException;
import com.capgemini.wsrvc.services.exceptions.ErreurTechniqueException;

/**
 * Interface services enrolement.
 */
@WebService
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@Produces({ "application/json" })
@Consumes({ "application/json" })
@Path("/")
public interface TestService {

	/**
	 * Service test.
	 * 
	 * @param in
	 *            input
	 * @return output
	 * @throws ErreurFonctionnelleException
	 *             erreur fonctionnelle
	 * @throws ErreurTechniqueException
	 *             erreur technique
	 */
	@WebMethod
	@POST
	@Path("/test")
	TestOutput test(TestInput in)
			throws ErreurFonctionnelleException, ErreurTechniqueException;

	/**
	 * Service ping.
	 * 
	 * @return "OK"
	 * @throws ErreurFonctionnelleException
	 *             erreur fonctionnelle
	 * @throws ErreurTechniqueException
	 *             erreur technique
	 */
	@WebMethod
	@GET
	@Path("/ping")
	String ping() throws ErreurFonctionnelleException, ErreurTechniqueException;

}
