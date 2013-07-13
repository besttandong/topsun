package com.topsun.posclient.common.webservice.test;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.4
 * 2013-07-12T14:38:38.312-07:00
 * Generated source version: 2.7.4
 * 
 */
@WebServiceClient(name = "Services", 
                  wsdlLocation = "file:/D:/work/topsun/code/topsun/com.topsun.posclient.common.core/src/com/topsun/posclient/common/webservice/service.wsdl",
                  targetNamespace = "http://tempuri.org/") 
public class Services extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://tempuri.org/", "Services");
    public final static QName BasicHttpBindingIRMSServices = new QName("http://tempuri.org/", "BasicHttpBinding_IRMSServices");
    static {
        URL url = null;
        try {
            url = new URL("file:/D:/work/topsun/code/topsun/com.topsun.posclient.common.core/src/com/topsun/posclient/common/webservice/service.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(Services.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/D:/work/topsun/code/topsun/com.topsun.posclient.common.core/src/com/topsun/posclient/common/webservice/service.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public Services(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public Services(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Services() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    /**
     *
     * @return
     *     returns IRMSServices
     */
    @WebEndpoint(name = "BasicHttpBinding_IRMSServices")
    public IRMSServices getBasicHttpBindingIRMSServices() {
        return super.getPort(BasicHttpBindingIRMSServices, IRMSServices.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IRMSServices
     */
    @WebEndpoint(name = "BasicHttpBinding_IRMSServices")
    public IRMSServices getBasicHttpBindingIRMSServices(WebServiceFeature... features) {
        return super.getPort(BasicHttpBindingIRMSServices, IRMSServices.class, features);
    }

}