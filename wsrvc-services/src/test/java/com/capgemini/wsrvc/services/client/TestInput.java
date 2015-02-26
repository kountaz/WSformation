package com.capgemini.wsrvc.services.client;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Bean d'input pour le service enrolerPush.
 */
@XmlRootElement(name = "testInput")
public class TestInput {

    private String id;

    /**
     * @return the id
     */
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

}
