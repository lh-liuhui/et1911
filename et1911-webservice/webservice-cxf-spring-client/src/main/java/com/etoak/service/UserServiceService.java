package com.etoak.service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.18
 * 2020-06-01T11:16:33.407+08:00
 * Generated source version: 3.1.18
 * 
 */
@WebServiceClient(name = "UserServiceService", 
                  wsdlLocation = "http://localhost:8080/ws/user?wsdl",
                  targetNamespace = "http://service.etoak.com/") 
public class UserServiceService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://service.etoak.com/", "UserServiceService");
    public final static QName UserServicePort = new QName("http://service.etoak.com/", "UserServicePort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/ws/user?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(UserServiceService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://localhost:8080/ws/user?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public UserServiceService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public UserServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public UserServiceService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public UserServiceService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public UserServiceService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public UserServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns UserService
     */
    @WebEndpoint(name = "UserServicePort")
    public UserService getUserServicePort() {
        return super.getPort(UserServicePort, UserService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns UserService
     */
    @WebEndpoint(name = "UserServicePort")
    public UserService getUserServicePort(WebServiceFeature... features) {
        return super.getPort(UserServicePort, UserService.class, features);
    }

}
