package practiceSort._topK问题;

public class Ha360 {
    public static void main(String[] args) {
        new A();
    }
}
class B  {
    static {
        System.out.println("sB");
    }
    public B(){
        System.out.println("pB");
    }
}

class A extends B {
    static {
        System.out.println("sA");
    }
    public A(){
        System.out.println("pA");
    }
}
