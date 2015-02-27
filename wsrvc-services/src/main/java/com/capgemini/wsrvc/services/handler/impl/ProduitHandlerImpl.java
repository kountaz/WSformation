package com.capgemini.wsrvc.services.handler.impl;

import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.capgemini.wsrvc.services.CacheService;
import com.capgemini.wsrvc.services.bean.Produit;
import com.capgemini.wsrvc.services.exceptions.ErreurFonctionnelleException;
import com.capgemini.wsrvc.services.exceptions.ErreurTechniqueException;
import com.capgemini.wsrvc.services.handler.ProduitHandler;

@Service
public class ProduitHandlerImpl implements ProduitHandler {


	private CacheService cache;
	
	private static final Logger LOG = LoggerFactory
            .getLogger(ProduitHandlerImpl.class);
	@Override
	public Produit get(int id, Boolean option)
			throws ErreurFonctionnelleException, ErreurTechniqueException {
		// TODO Auto-generated method stub
		LOG.debug("WebMethod GET =>  id : "+id);
		return cache.getProduit(id);
	}

	@Override
	public Produit post(Produit produit)
			throws ErreurFonctionnelleException, ErreurTechniqueException {
		// TODO Auto-generated method stub
		LOG.debug("WebMethod POST =>  id : "+produit.getId()+"   Description : "+produit.getDescription());
		return cache.postProduit(produit);
	}

	@Override
	public Produit put(final int id , Produit produit) throws ErreurFonctionnelleException,
			ErreurTechniqueException {
		// TODO Auto-generated method stub
		LOG.debug("WebMethod PUT =>  id : "+produit.getId()+"   Description : "+produit.getDescription());
		return cache.putProduit(id,produit);
	}

	@Override
	public void delete(int id) throws ErreurFonctionnelleException,
			ErreurTechniqueException {
		// TODO Auto-generated method stub
		LOG.debug("WebMethod DELETE =>  id : "+id);
		cache.deleteProduit(id);
	}

	@Override
	public Collection<Produit> getAll() throws ErreurFonctionnelleException,
			ErreurTechniqueException {
		// TODO Auto-generated method stub
		LOG.debug("WebMethod GET ALL ");
		LOG.debug("Liste des produits stockés dans le cache");
		Collection<Produit> list = cache.getAllProduit();
		if (LOG.isDebugEnabled()) {
			for (Produit p : list) {
				LOG.debug(p.toString());
			}
		}
		return list;
	}
	
	public void setCache(final CacheService pcache)	{
		this.cache = pcache;
	}
	public CacheService getCache() {
		return cache;
	}
}
