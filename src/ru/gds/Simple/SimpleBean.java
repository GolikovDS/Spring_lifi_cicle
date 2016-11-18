package ru.gds.Simple;
/*
Жизненный цикл можно применять только к синглитону. Для прототипа вызовы инсталяции и дистроя не будет.
Очередность вызова:
1 По аннотации
2 По наследованию от InitializingBean - инициализация, DisposableBean - удаление
3 По конфигу xml функция  init-method="init(имя вызываемого метода)" destroy-method="destroys(имя вызываемого метода)"
 */

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class SimpleBean implements InitializingBean, DisposableBean, BeanNameAware{

    private static final String DEFAULT_NAME = "Luke Skywalker";
    private String name;
    private int age = Integer.MIN_VALUE;
    private String beanName;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @PostConstruct
    public void initPost(){
        System.out.println("@PostConstruct init im fest");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesBean metod im center");
    }
    public void init() {
        System.out.println("init metod im last\n\n");
//        if (name == null) {
//            System.out.println("Using default name");
//            name = DEFAULT_NAME;
//        }
//
//        if (age == Integer.MIN_VALUE) {
//            throw new IllegalArgumentException(
//                    "Уои must set the age property of any beans of type "
//                            + SimpleBean.class);
//        }
    }


    @PreDestroy
    public void destroyAnnotation(){
        System.out.println("@PreDestroy annotation metod fest");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean destroy metod center");
    }

    public void destroys(){
        System.out.println("Destroy metod                last\n");
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nAge: " + age;
    }
////////////////////////////////////////////////////////////////////////////
    /*Получить имя бина*///
    //////////////////////
    @Override
    public void setBeanName(String s) {
        beanName = s;
    }

    public void someOperation () {
        System.out.println("Bean [" + beanName + "] - someOperation () ");
}
}
