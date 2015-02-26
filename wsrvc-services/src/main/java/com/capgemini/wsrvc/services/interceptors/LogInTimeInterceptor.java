package com.capgemini.wsrvc.services.interceptors;

import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.message.Exchange;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;

/**
 * 
 * @author JCORTES
 * 
 */
public class LogInTimeInterceptor extends AbstractPhaseInterceptor<Message> {

    /**
     * constructeur.
     */
    public LogInTimeInterceptor() {
        super(Phase.RECEIVE);
    }

    @Override
    public void handleMessage(final Message message) throws Fault {
            Exchange exchange = message.getExchange();
            String appel = (String) exchange.getInMessage().get(
                    "org.apache.cxf.request.uri");
//            monitor.beginCall();
    }

}
