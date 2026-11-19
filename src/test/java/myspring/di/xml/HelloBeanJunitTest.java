package myspring.di.xml;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloBeanJunitTest {

	@Test
	void hello() {
		//1. Bean Container 객체생성
		BeanFactory factory = new GenericXmlApplicationContext("classpath:spring-beans.xml");
		//2. Hello Bean을 Container 에게 요청하기
		Hello hello = (Hello)factory.getBean("hello");
	}
}
