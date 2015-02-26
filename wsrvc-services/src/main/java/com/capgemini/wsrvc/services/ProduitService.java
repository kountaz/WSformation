package com.capgemini.wsrvc.services;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import com.capgemini.wsrvc.services.bean.Produit;
import com.capgemini.wsrvc.services.exceptions.ErreurFonctionnelleException;
import com.capgemini.wsrvc.services.exceptions.ErreurTechniqueException;

@WebService
@Path("/Produits")
@Produces({ "application/json" })
@Consumes({ "application/json" })
public interface ProduitService {

	@WebMethod
	@GET
	@Path("/{id}")
	public Produit get(@PathParam("id") final int id ,@DefaultValue("true") @QueryParam("option") Boolean option) throws ErreurFonctionnelleException, ErreurTechniqueException;
	
	@WebMethod
	@POST
	@Path("/")
	public Produit post(final Produit produit) throws ErreurFonctionnelleException, ErreurTechniqueException;
	
	@WebMethod
	@PUT
	@Path("/{id}")
	public Produit put(@PathParam("id") final int id , final Produit produit) throws ErreurFonctionnelleException, ErreurTechniqueException;
	
	@WebMethod
	@DELETE
	@Path("/{id}")
	public void delete(@PathParam("id") final int id) throws ErreurFonctionnelleException, ErreurTechniqueException;
	
	
}
