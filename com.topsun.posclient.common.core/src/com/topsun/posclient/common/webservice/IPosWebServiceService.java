package com.topsun.posclient.common.webservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * @author Lilei
 *
 */
@WebServiceClient(name = "IPosWebServiceService", 
                  wsdlLocation = "PosWebService.wsdl",
                  targetNamespace = "http://service.pos.webservice.topsunit.com/") 
public class IPosWebServiceService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://service.pos.webservice.topsunit.com/", "IPosWebServiceService");
    public final static QName IPosWebServicePort = new QName("http://service.pos.webservice.topsunit.com/", "IPosWebServicePort");
    static {
        URL url = null;
        try {
            url = new URL("PosWebService.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(IPosWebServiceService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "PosWebService.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public IPosWebServiceService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public IPosWebServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public IPosWebServiceService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    /**
     *
     * @return
     *     returns IPosWebService
     */
    @WebEndpoint(name = "IPosWebServicePort")
    public IPosWebService getIPosWebServicePort() {
        return super.getPort(IPosWebServicePort, IPosWebService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IPosWebService
     */
    @WebEndpoint(name = "IPosWebServicePort")
    public IPosWebService getIPosWebServicePort(WebServiceFeature... features) {
        return super.getPort(IPosWebServicePort, IPosWebService.class, features);
    }

}
