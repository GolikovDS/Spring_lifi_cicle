package ru.gds.CallBackFun;



public class MainApp {
    public static void main(String[] args) throws InterruptedException {
        SomeClassCallBack2 someClassCallBack2 = new SomeClassCallBack2() {
            @Override
            public void callBack() {
                System.out.println("CALLBACK is WORK");
            }
        };

        someClassCallBack2.doSomething();
    }

}
