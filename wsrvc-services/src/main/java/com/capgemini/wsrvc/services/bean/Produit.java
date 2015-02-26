package com.capgemini.wsrvc.services.bean;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.capgemini.wsrvc.services.enums.CodeProduit;

@XmlRootElement(name = "produit")
@XmlType(propOrder={"id", "description", "code","list"})

public class Produit {

	@XmlAttribute(name="id")
	private int id;
	
	@XmlAttribute(name="description")
	private String description;
	
	@XmlAttribute(name="code")
	private CodeProduit code;
	
	@XmlElementWrapper(name="chaines")
	@XmlElement(name="chaine")
	private List<String> list;
	
	public CodeProduit getCode() {
		return code;
	}
	public void setCode(CodeProduit code) {
		this.code = code;
	}
	public List<String> getList() {
		return list;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
