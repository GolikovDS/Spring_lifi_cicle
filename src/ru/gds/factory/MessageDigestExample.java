package ru.gds.factory;


import org.springframework.context.support.GenericXmlApplicationContext;

public class MessageDigestExample {
    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext("spring-config.xml");

        MessageDigester messageDigester = (MessageDigester) context.getBean("digester");
        messageDigester.digest("Hello Word!");
    }
}
