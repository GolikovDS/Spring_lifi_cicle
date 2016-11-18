package ru.gds.CallBackFun;


public class SomeClassCallBack {

    public interface MyCallBack {
        public void callBack();
    }

    MyCallBack callback;

    public void registerCallBack(MyCallBack callback){
        this.callback = callback;
    }

    void doSomething() throws InterruptedException {
        System.out.println("Выполняется работа");
        Thread.sleep(500);

        // вызываем метод обратного вызова
        callback.callBack();
    }


}
