package com.capgemini.wsrvc.services.handler.impl;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.capgemini.wsrvc.services.CacheService;
import com.capgemini.wsrvc.services.ProduitService;
import com.capgemini.wsrvc.services.bean.Produit;
import com.capgemini.wsrvc.services.enums.CodeProduit;
import com.capgemini.wsrvc.services.exceptions.ErreurFonctionnelleException;
import com.capgemini.wsrvc.services.exceptions.ErreurTechniqueException;
import com.capgemini.wsrvc.services.impl.CacheServiceImpl;
import com.capgemini.wsrvc.services.impl.ProduitServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/*-context.xml" })
public class ProduitHandlerImplTest {

	private Produit p1;
	
	private ProduitService service;
	
	@Before
	public void setUp() throws Exception {
		
		if	(service==null)	{
			service = new ProduitServiceImpl();
	    	((ProduitServiceImpl) service).setHandler(new ProduitHandlerImpl());
		}
		
		List<String> list = new ArrayList<String>();
		list.add("test1");
		list.add("test2");
		
		p1 = new Produit();
		p1.setId(1);
		p1.setDescription("produit 1");
		p1.setCode(CodeProduit.TYPE1);
		p1.setList(list);
		
		CacheService cache = Mockito.mock(CacheServiceImpl.class);
		
		Mockito.when(cache.getProduit(1)).thenReturn(p1);
    	((ProduitHandlerImpl)((ProduitServiceImpl) service).getHandler()).setCache(cache);
		
	}
	 
    @Test
    public void testGet() throws ErreurFonctionnelleException,ErreurTechniqueException {
    	
    	Produit p2 = service.get(p1.getId(), true);
    	
    	Assert.assertNotNull(p2);
    	
    	Assert.assertEquals(p2.getId(), p1.getId());
    	Assert.assertEquals(p2.getDescription(), p1.getDescription());
    	Assert.assertEquals(p2.getCode(), p1.getCode());
    	
    	
    	
    	
    }

}
