package com.capgemini.wsrvc.services.handler;

import java.util.Collection;

import com.capgemini.wsrvc.services.bean.Produit;
import com.capgemini.wsrvc.services.exceptions.ErreurFonctionnelleException;
import com.capgemini.wsrvc.services.exceptions.ErreurTechniqueException;

public interface ProduitHandler {

	public Produit get(final int id ,Boolean option) throws ErreurFonctionnelleException, ErreurTechniqueException;

	public Produit post(final Produit produit) throws ErreurFonctionnelleException, ErreurTechniqueException;
	
	public Produit put(final int id , final Produit produit) throws ErreurFonctionnelleException, ErreurTechniqueException;
	
	public void delete(final int id) throws ErreurFonctionnelleException, ErreurTechniqueException;
	
	public Collection<Produit> getAll() throws ErreurFonctionnelleException, ErreurTechniqueException;

}
