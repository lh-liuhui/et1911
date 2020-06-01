package com.etoak;

import com.etoak.service.MobileCodeWSSoap;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

public class CxfClientlx {
    public static void main(String[] args) {
        JaxWsProxyFactoryBean factory=new JaxWsProxyFactoryBean();
        factory.setAddress("http://ws.webxml.com.cn/WebServices/MobileCodeWS.asmx?wsdl");
        factory.setServiceClass(MobileCodeWSSoap.class);
        MobileCodeWSSoap soap=(MobileCodeWSSoap) factory.create();
        System.out.println(soap.getMobileCodeInfo("18754857251",""));
    }
}
