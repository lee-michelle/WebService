package com.hyan.test;

import com.hyan.client.ServiceHello;
import com.hyan.client.ServiceHelloService;

public class ServiceTest {

	public static void main(String[] args) {
		ServiceHello hello = new ServiceHelloService().getServiceHelloPort();
		String name = hello.getValue("wangmiao");
		System.out.println(name);
	}
}
