package com.wipro.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import com.wipro.beans.WishMessageGenerator;
@SuppressWarnings("deprecation")
public class SetterInjectionTest {
	public static void main(String[] args)
	{
		FileSystemResource res=new FileSystemResource("src/main/java/com/wipro/cfgs/applicationContext.xml");
		XmlBeanFactory factory=new XmlBeanFactory(res);
		System.out.println("------------------------");
		Object obj=factory.getBean("wmg");
		WishMessageGenerator generator=(WishMessageGenerator)obj;
		System.out.println("------------------------");
		String msg=generator.generateWishMessage("Dhoni");
		System.out.println("Wish Message is::"+msg);
	}

}