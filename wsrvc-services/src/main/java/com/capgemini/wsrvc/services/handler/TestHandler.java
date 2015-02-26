package com.capgemini.wsrvc.services.handler;

import com.capgemini.wsrvc.services.bean.test.TestInput;
import com.capgemini.wsrvc.services.bean.test.TestOutput;
import com.capgemini.wsrvc.services.exceptions.ErreurFonctionnelleException;
import com.capgemini.wsrvc.services.exceptions.ErreurTechniqueException;

/**
 * Interface services test.
 */
public interface TestHandler {

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
	TestOutput test(TestInput in) throws ErreurFonctionnelleException,
			ErreurTechniqueException;

	/**
	 * Service ping.
	 * 
	 * @return "OK"
	 * @throws ErreurFonctionnelleException
	 *             erreur fonctionnelle
	 * @throws ErreurTechniqueException
	 *             erreur technique
	 */
	String ping() throws ErreurFonctionnelleException, ErreurTechniqueException;

}
