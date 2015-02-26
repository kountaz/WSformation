package com.capgemini.wsrvc.services.bean.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.capgemini.wsrvc.services.bean.AbstractServiceInput;

/**
 * Bean d'input pour le service test.
 */
@XmlRootElement(name = "testInput")
public class TestInput extends AbstractServiceInput {

	/**
	 * La liste des propriété suivante ne doivent pas etre échappé.
	 */
	private final List<String> propertyNotToEscape = new ArrayList<String>(
			Arrays.asList(new String[] { "id" }));

	private String id;

	/**
	 * @return the id
	 */
	@XmlElement(required = true)
	public final String getId() {
		return id;
	}

	/**
	 * @param aId
	 *            the id to set
	 */
	public final void setId(final String aId) {
		id = aId;
	}

	@Override
	protected List<String> getPropertyNotToEscape() {
		return propertyNotToEscape;
	}

}
