package ru.gds.i18n;


import org.springframework.context.support.GenericXmlApplicationContext;

public class MessageSourceDemo {
    public static void main(String[] args) {

        GenericXmlApplicationContext context = new GenericXmlApplicationContext("spring-config.xml");

//        Locale locale_ru = new Locale("ru", "RU");
        //Locale locale_en = new Locale("en", "EN");

       // System.out.println(context.getMessage("msg", null, locale_en));
//        System.out.println(context.getMessage("msg", null, locale_ru));



    }


}
