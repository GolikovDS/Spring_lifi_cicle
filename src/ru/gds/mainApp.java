package ru.gds;


import org.springframework.beans.factory.BeanCreationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class mainApp {

    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("spring-config.xml");
        context.refresh();

//        SimpleBean parent = (SimpleBean) context.getBean("parentBean");
//        SimpleBean child = (SimpleBean) context.getBean("childBean");
//
//        System.out.println("parent: \name = " + parent.getName()  + "\nage = " + parent.getAge());
//        System.out.println("parent: \name = " + child.getName()  + "\nage = " + child.getAge());


        SimpleBean simpleBeanl = getBean("sb1", context);
        SimpleBean simpleBean2 = getBean("sb2", context);
        SimpleBean simpleBeanЗ = getBean("sb3", context);

    }


    private static SimpleBean getBean(String beanName, ApplicationContext ctx) {
        try {
            SimpleBean bean = (SimpleBean) ctx.getBean(beanName);
//            System.out.println(bean);
            return bean;
        } catch (BeanCreationException ex) {
            System.out.println("An error occured in bean configuration: "
                    + ex.getMessage());
            return null;
        }
    }
}
