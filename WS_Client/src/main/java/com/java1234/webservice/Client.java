package com.java1234.webservice;

import java.util.List;

import com.java1234.webservice.impl.HelloWorldImplService;

public class Client {
	public static void main(String[] args) {
		HelloWorldImplService service = new HelloWorldImplService();
		HelloWorld hello = service.getHelloWorldImplPort();
		System.out.println(hello.say("ketty"));
		User user = new User();
		user.setName("jack");
		List<Role> list =hello.getRoleByUid(user);
		for (Role role : list) {
			System.out.println(role.getRoleId()+":"+role.getRoleName());
		}
		
		MyRoleArray arrays = hello.getRoles();
		List<MyRole> roles = arrays.item;
		for (MyRole myRole : roles) {
			System.out.print(myRole.getKey());
			List<Role> listRole= myRole.getValue();
			for (Role role : listRole) {
				System.out.print(role.getRoleName()+"==");
			}
			System.out.println("--------------");
		}
	}
}
