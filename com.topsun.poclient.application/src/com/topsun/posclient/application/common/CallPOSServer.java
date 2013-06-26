package com.topsun.posclient.application.common;

import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

/**
 * 
 * @author Dong
 *
 */
public class CallPOSServer {
	
	/**
	 * 
	 */
	static String URL = "http://localhost:11080/posserver";
	
	/**
	 * 
	 * @param path
	 * @param args
	 */
	public void call(String path, Object args){
		Client c = Client.create();
		WebResource r = c.resource(URL+path);
		ClientResponse response = r.type(MediaType.APPLICATION_XML).put(ClientResponse.class, args);
		
		System.out.println( response.getHeaders().get("Content-Type"));
		System.out.println(response.getStatus() );
		String entity = response.getEntity(String.class);
		System.out.println(entity);
		
		
		ClientResponse sss = r.type(MediaType.APPLICATION_XML).put(ClientResponse.class, args); 
		
//		ClientResponse response = r.path(URL+path).accept(MediaType.APPLICATION_XML)
//		   .put(ClientResponse.class, c);
	}
}
