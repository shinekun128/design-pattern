package cn.ponyzhang.designpattern.template;

public abstract class SoyMilk {

    protected final void make(){
        select();
        add();
        soak();
        beat();
        System.out.println("finish the manufactare of soymilk");
    }

    protected void select(){
        System.out.println("first : select fresh soybeans");
    }

    protected abstract void add();

    protected void soak(){
        System.out.println("third : soak the soybeans");
    }

    protected void beat(){
        System.out.println("fourth : beat the soy");
    }
}
