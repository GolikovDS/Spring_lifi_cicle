package ru.gds.CallBackFun;


public abstract class SomeClassCallBack2 {

    protected abstract void callBack();


    void doSomething() throws InterruptedException {
        System.out.println("Выполняется работа");
        Thread.sleep(500);

        // вызываем метод обратного вызова
        callBack();
    }


}
