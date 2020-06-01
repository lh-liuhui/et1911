package com.etoak.interceptor;

import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.headers.Header;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.namespace.QName;

public class AnthInInterceptor extends AbstractPhaseInterceptor<SoapMessage> {
    public AnthInInterceptor() {
        super(Phase.PRE_INVOKE);
    }

    @Override
    public void handleMessage(SoapMessage message) throws Fault {
        //获取header
        Header header = message.getHeader(new QName("et1911"));
        if(header!=null){
            Element et1911=(Element) header.getObject();

            //获取name节点的文本值
            NodeList nameNodeList = et1911.getElementsByTagName("name");
            String name = nameNodeList.item(0).getTextContent();

            //获取password节点的文本值
            NodeList passwordNodeList = et1911.getElementsByTagName("password");
            String password = passwordNodeList.item(0).getTextContent();

            //判断用户名和密码
            if("et1911".equals(name) && "123456".equals(password)){
                System.out.println("验证通过");
                return;
            }
        }
        System.out.println("验证失败");
        throw new Fault(new IllegalAccessException("用户名或密码错误"));
    }
}
