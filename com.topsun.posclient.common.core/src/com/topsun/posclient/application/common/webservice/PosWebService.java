package com.topsun.posclient.application.common.webservice;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;

@WebServiceClient(name = "PosWebService", wsdlLocation = "poswebservice.wsdl", targetNamespace = "http://service.pos.webservice.topsunit.com/")
public class PosWebService extends Service {

	public final static URL WSDL_LOCATION;

	public final static QName SERVICE = new QName("http://service.pos.webservice.topsunit.com/", "PosWebService");
	public final static QName IPosServicePort = new QName("http://service.pos.webservice.topsunit.com/", "IPosServicePort");
	
	static {
        URL url = PosWebService.class.getResource("poswebservice.wsdl");
        if (url == null) {
            url = PosWebService.class.getClassLoader().getResource("poswebservice.wsdl");
        } 
        if (url == null) {
            java.util.logging.Logger.getLogger(PosWebService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "deployWebService1.wsdl");
        }       
        WSDL_LOCATION = url;
    }

	public PosWebService(URL wsdlLocation) {
		super(wsdlLocation, SERVICE);
	}

	public PosWebService(URL wsdlLocation, QName serviceName) {
		super(wsdlLocation, serviceName);
	}

	public PosWebService() {
		super(WSDL_LOCATION, SERVICE);
	}

	/**
	 * 
	 * @return returns IPosService
	 */
	@WebEndpoint(name = "IPosServicePort")
	public IPosService getIPosServicePort() {
		return super.getPort(IPosServicePort, IPosService.class);
	}

	/**
	 * 
	 * @param features
	 *            A list of {@link javax.xml.ws.WebServiceFeature} to configure
	 *            on the proxy. Supported features not in the
	 *            <code>features</code> parameter will have their default
	 *            values.
	 * @return returns IPosService
	 */
	@WebEndpoint(name = "IPosServicePort")
	public IPosService getIPosServicePort(WebServiceFeature... features) {
		return super.getPort(IPosServicePort, IPosService.class, features);
	}

}
