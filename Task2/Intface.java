
interface A {
    void meth1();
    void meth2();
}


class MyClass implements A {
    public void meth1() {
        System.out.println(" meth1() in MyClass");
    }

    public void meth2() {
        System.out.println(" meth2() in MyClass");
    }
}


public class Intface{
    public static void main(String[] args) {
        A string = new MyClass();
        string.meth1();
        string.meth2();
    }
}
