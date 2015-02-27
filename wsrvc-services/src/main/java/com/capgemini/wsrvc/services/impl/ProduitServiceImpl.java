package com.capgemini.wsrvc.services.impl;

import java.util.Collection;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.capgemini.wsrvc.services.ProduitService;
import com.capgemini.wsrvc.services.bean.Produit;
import com.capgemini.wsrvc.services.exceptions.ErreurFonctionnelleException;
import com.capgemini.wsrvc.services.exceptions.ErreurTechniqueException;
import com.capgemini.wsrvc.services.handler.ProduitHandler;

@WebService
public class ProduitServiceImpl implements ProduitService {

	private static final Logger LOG = LoggerFactory
            .getLogger(ProduitServiceImpl.class);
	
	private ProduitHandler handler;
	
	

	@Override
	@WebMethod
	public Produit get(int id, Boolean option)
			throws ErreurFonctionnelleException, ErreurTechniqueException {
		// TODO Auto-generated method stub
		LOG.debug("Execution du service GET produit");
		return handler.get(id, option);
	}

	@Override
	@WebMethod
	public Produit post(Produit produit) throws ErreurFonctionnelleException,
			ErreurTechniqueException {
		// TODO Auto-generated method stub
		LOG.debug("Execution du service POST produit");
		return handler.post(produit);
	}

	@Override
	@WebMethod
	public Produit put(int id , Produit produit) throws ErreurFonctionnelleException,
			ErreurTechniqueException {
		// TODO Auto-generated method stub
		LOG.debug("Execution du service PUT produit");
		return handler.put(id, produit);
	}
	

	@Override
	@WebMethod
	public void delete(int id) throws ErreurFonctionnelleException,
			ErreurTechniqueException {
		// TODO Auto-generated method stub
		LOG.debug("Execution du service DELETE produit");
		handler.delete(id);
	}
	
	@Override
	public Collection<Produit> getAll() throws ErreurFonctionnelleException,
			ErreurTechniqueException {
		// TODO Auto-generated method stub
		LOG.debug("Execution du service GET ALL produits");
		return handler.getAll();
	}
	
//	@Override
//	public Map<Integer,Produit> search() throws ErreurFonctionnelleException,
//			ErreurTechniqueException {
//		// TODO Auto-generated method stub
//		LOG.debug("Execution du service SEARCH produits");
//		return handler.getAll();
//	}
	
	
	public void setHandler(ProduitHandler phandler)	{
		this.handler = phandler;
	}

	public ProduitHandler getHandler() {
		return handler;
	}
	
}
