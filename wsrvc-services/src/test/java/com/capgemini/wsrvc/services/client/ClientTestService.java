package com.capgemini.wsrvc.services.client;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.InputStreamRequestEntity;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.RequestEntity;
import org.json.JSONObject;

import com.capgemini.wsrvc.services.utils.JaxbUtils;

/**
 * Client de test de service.
 * 
 */
public final class ClientTestService {

    private static final String HOST_MSG = "localhost";

    private static final int MAXCODEOK = 299;

    /**
     * Constructeur privée.
     */
    private ClientTestService() {
        super();
    }

    /**
     * 
     * @param args
     *            param
     * @throws Exception
     *             ex
     */
    public static void main(final String[] args) throws Exception {
        ClientTestService
                .post("http://"
                        + ClientTestService.HOST_MSG
                        + ":8080/wsrvc-services/services/Test/rest/v1/test",
                        "{\"testInput\":{\"id\":\"aaaaaaaaaa\"}}");

        TestInput input = new TestInput();
        input.setId("bbbbbbbbbb");
        ClientTestService
        .post("http://"
                + ClientTestService.HOST_MSG
                + ":8080/wsrvc-services/services/Test/rest/v1/test",
                input);

        JSONObject jsonInput = new JSONObject();
        JSONObject testInput = new JSONObject();
        testInput.put("id", "cccccccccc");
        jsonInput.put("testInput", testInput);
        ClientTestService
        .post("http://"
                + ClientTestService.HOST_MSG
                + ":8080/wsrvc-services/services/Test/rest/v1/test",
                jsonInput);

    }

    /**
     * @param url
     *            l'url du service REST
     * @param in
     *            un objet à sérialiser en json
     * @return le body de la réponse du service
     */
    static String post(final String url, final Object in) {
        String retour = null;
        try {
            String input = JaxbUtils.objToJsonStr(in);
            InputStream is = new ByteArrayInputStream(input.getBytes("UTF-8"));
            PostMethod post = new PostMethod(url);
            post.addRequestHeader("Accept", "application/json");
            post.addRequestHeader("NUMHOMOLOGATION", "APPMOBILE");
            RequestEntity entity = new InputStreamRequestEntity(is,
                    "application/json");
            post.setRequestEntity(entity);
            HttpClient httpclient = new HttpClient();
            try {
                System.out.println("***** in *****");
                System.out.println(input);
                int result = httpclient.executeMethod(post);
                System.out.println("***** out *****");
                System.out.println("Response status code: " + result);
                retour = post.getResponseBodyAsString();
                if (retour != null) {
                    System.out.println("Response body: ");
                    System.out.println(retour);
                    if (result > MAXCODEOK) {
                        retour = null;
                    }
                }
            } finally {
                // Release current connection to the connection pool once you
                // are done
                post.releaseConnection();
            }
        } catch (Exception e) {
            System.err.println("***** err *****");
            System.err.println(e);
        }
        return retour;
    }

    /**
     * @param url
     *            l'url du service REST
     * @param input
     *            le json à envoyer
     * @return le body de la réponse du service
     */
    static String post(final String url, final JSONObject input) {
    	return post(url, (input!=null?input.toString():null));
    }

    /**
     * @param url
     *            l'url du service REST
     * @param input
     *            le json à envoyer
     * @return le body de la réponse du service
     */
    static String post(final String url, final String input) {
        String retour = null;
        try {
            InputStream is = new ByteArrayInputStream(input.getBytes("UTF-8"));
            PostMethod post = new PostMethod(url);
            post.addRequestHeader("Accept", "application/json");
            RequestEntity entity = new InputStreamRequestEntity(is,
                    "application/json");
            post.setRequestEntity(entity);
            HttpClient httpclient = new HttpClient();
            try {
                System.out.println("***** in *****");
                System.out.println(input);
                int result = httpclient.executeMethod(post);
                System.out.println("***** out *****");
                System.out.println("Response status code: " + result);
                retour = post.getResponseBodyAsString();
                if (retour != null) {
                    System.out.println("Response body: ");
                    System.out.println(retour);
                    if (result > MAXCODEOK) {
                        retour = null;
                    }
                }
            } finally {
                // Release current connection to the connection pool once you
                // are done
                post.releaseConnection();
            }
        } catch (Exception e) {
            System.err.println("***** err *****");
            System.err.println(e);
        }
        return retour;
    }

}
