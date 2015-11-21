package org.informatika.service.util;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.filter.HTTPBasicAuthFilter;
import com.sun.jersey.core.util.MultivaluedMapImpl;

import javax.ws.rs.core.MediaType;

/**
 * Created by baharudinafif on 11/21/15.
 */
public class RequestCall {
//    public static ClientResponse sendPost() {
//
//    }
//
//    public static ClientResponse sendGet() {
//
//    }

    public static ClientResponse sendEmail(String to, String subject, String content) {
        Client client = Client.create();
        client.addFilter(new HTTPBasicAuthFilter("api",
                "key-55f519ef4f246aa7992343cc72b7ef81"));
        WebResource webResource =
                client.resource("https://api.mailgun.net/v3/mailgun.baharudinafif.com" +
                        "/messages");
        MultivaluedMapImpl formData = new MultivaluedMapImpl();
        formData.add("from", "Admmin - Asset Lifecycle Management <admin@mailgun.baharudinafif.com>");
        formData.add("to", "baharudinafifsn@gmail.com");
        formData.add("to", to);
        formData.add("subject", subject);
        formData.add("text", content);
        return webResource.type(MediaType.APPLICATION_FORM_URLENCODED).
                post(ClientResponse.class, formData);
    }
}
