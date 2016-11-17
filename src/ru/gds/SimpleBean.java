package ru.gds;


import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;

public class SimpleBean implements InitializingBean{

    private static final String DEFAULT_NAME = "Luke Skywalker";
    private String name;
    private int age = Integer.MIN_VALUE;

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




    @Override
    public String toString() {
        return "Name: " + name + "\nAge: " + age;
    }


}
