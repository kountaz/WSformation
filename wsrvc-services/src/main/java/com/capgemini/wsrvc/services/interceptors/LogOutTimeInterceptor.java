package com.capgemini.wsrvc.services.interceptors;

import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;

/**
 * 
 * @author JCORTES
 * 
 */
public class LogOutTimeInterceptor extends AbstractPhaseInterceptor<Message> {

    /**
     * constructeur.
     */
    public LogOutTimeInterceptor() {
        super(Phase.SEND);
    }

    @Override
    public void handleMessage(final Message message) throws Fault {
//            monitor.endCall();
    }

}
