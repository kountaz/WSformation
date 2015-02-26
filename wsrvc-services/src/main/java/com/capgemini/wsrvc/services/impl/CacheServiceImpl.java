package com.capgemini.wsrvc.services.impl;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.capgemini.wsrvc.services.CacheService;
import com.capgemini.wsrvc.services.bean.Produit;
import com.capgemini.wsrvc.services.enums.CodeErreurFonctionnelle;
import com.capgemini.wsrvc.services.exceptions.ErreurFonctionnelleException;
import com.capgemini.wsrvc.services.exceptions.ErreurTechniqueException;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;

@Service
@Scope("singleton")
public class CacheServiceImpl implements CacheService	{
	
	private static final Logger LOG = LoggerFactory
            .getLogger(CacheServiceImpl.class);
	
	private Cache<Integer, Produit> cache;
	
	public CacheServiceImpl(int size)	{
		
		LOG.debug("Constructeur size cache : "+size);
		this.cache = CacheBuilder.newBuilder()
			    .maximumSize(size)
			    .build();
	}
	
	public CacheServiceImpl()	{
		this(50);
	}
	
	
	@Override
	public Produit getProduit(int id) throws ErreurFonctionnelleException,
			ErreurTechniqueException {
		// TODO Auto-generated method stub
		Produit p = cache.getIfPresent(id);
		if	(p==null)	{
			throw new ErreurFonctionnelleException(CodeErreurFonctionnelle.CF12 , null);
		}
		return p;
	}

	@Override
	public Produit postProduit(Produit produit)
			throws ErreurFonctionnelleException, ErreurTechniqueException {
		// TODO Auto-generated method stub
		cache.put(produit.getId(), produit);
		return cache.getIfPresent(produit.getId());
	}

	@Override
	public Produit putProduit(int id , Produit produit)
			throws ErreurFonctionnelleException, ErreurTechniqueException {
		// TODO Auto-generated method stub
		cache.put(id,produit);
		return cache.getIfPresent(id);
	}

	@Override
	public void deleteProduit(int id) throws ErreurFonctionnelleException,
			ErreurTechniqueException {
		// TODO Auto-generated method stub
		cache.invalidate(id);
	}

}
