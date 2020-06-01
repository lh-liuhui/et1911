package com.etoak.queue;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;

public class HelloProducer {

	public static void main(String[] args) throws JMSException {
		//创建ConnectionFactory(用户名，密码，链接地址)
		ConnectionFactory factory=new ActiveMQConnectionFactory(null,null,"tcp://localhost:61616");
		
		//通过ConnectionFactory创建Connection
		Connection connection = factory.createConnection();
		connection.start();
		
		//通过Connection创建Session(是否启用事务，客户端签收的)
		Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
		
		//通过Session创建Destination
		//如果队列不存在，那么activemq会自动创建
		Queue helloQueue = session.createQueue("hello");
		
		//通过Session创建消息生产者
		MessageProducer producer = session.createProducer(helloQueue);
		
		//通过Sessio创建消息
		TextMessage msg = session.createTextMessage("这是第一个Hello word消息");
		
		//使用消息发送者发送消息
		producer.send(msg);
		producer.close();
		session.close();
		connection.close();
		System.out.println("ok");
	}

}
