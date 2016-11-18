package ru.gds.Simple;


import org.springframework.beans.factory.BeanCreationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class mainApp {

    public static void main(String[] args) throws InterruptedException {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("spring-config.xml");
        context.registerShutdownHook();          //можно сделать так тогда destroy автоматический, а можно вручную вызвать context.destroy()
        context.refresh();

//        SimpleBean parent = (SimpleBean) context.getBean("parentBean");
//        SimpleBean child = (SimpleBean) context.getBean("childBean");
//
//        System.out.println("parent: \name = " + parent.getName()  + "\nage = " + parent.getAge());
//        System.out.println("parent: \name = " + child.getName()  + "\nage = " + child.getAge());


        SimpleBean simpleBeanl = getBean("sb1", context);
        SimpleBean simpleBean2 = getBean("sb2", context);
        SimpleBean simpleBeanЗ = getBean("sb3", context);

        simpleBean2.someOperation();
        Thread.sleep(1000);

//        context.destroy();

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
