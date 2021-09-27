package cn.ponyzhang.designpattern.singleton;

public class DoubleCheckSingleton {
    //volatile作用，禁止指令重排序，防止c线程直接返回，实际instance指向地址暂未赋值
    private static volatile DoubleCheckSingleton instance;

    public static DoubleCheckSingleton getSingleton(){
        if(instance == null){
            synchronized (DoubleCheckSingleton.class){
                //第二层校验，b线程拿到锁后会再次造对象
                if(instance == null){
                    instance = new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}
