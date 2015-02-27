package com.capgemini.wsrvc.services;

import java.util.Collection;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.capgemini.wsrvc.services.bean.Produit;
import com.capgemini.wsrvc.services.exceptions.ErreurFonctionnelleException;
import com.capgemini.wsrvc.services.exceptions.ErreurTechniqueException;

@Service
@Scope("singleton")
public interface CacheService {

	public Produit getProduit(final int id) throws ErreurFonctionnelleException, ErreurTechniqueException;
	
	public Produit postProduit(final Produit produit) throws ErreurFonctionnelleException, ErreurTechniqueException;
	
	public Produit putProduit(final int id , final Produit produit) throws ErreurFonctionnelleException, ErreurTechniqueException;
	
	public void deleteProduit(final int id) throws ErreurFonctionnelleException, ErreurTechniqueException;
	
	public Collection<Produit> getAllProduit();
	
}
