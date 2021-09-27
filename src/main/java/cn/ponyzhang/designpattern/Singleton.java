package cn.ponyzhang.designpattern;

public class Singleton {
    //volatile作用，禁止指令重排序，防止c线程直接返回，实际instance指向地址暂未赋值
    private static volatile Singleton instance;

    public static Singleton getSingleton(){
        if(instance == null){
            synchronized (Singleton.class){
                //第二层校验，b线程拿到锁后会再次造对象
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
