package com.etoak.service;

import javax.jws.WebService;

@WebService //表示这是一个web service接口
public interface HelloService {
    String sayHello(String name);
}
