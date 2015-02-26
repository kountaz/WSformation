package com.capgemini.wsrvc.services.client;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Bean d'output pour le service enrolerPush.
 */
@XmlRootElement(name = "enrolerPushOutput")
public class TestOutput {

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
