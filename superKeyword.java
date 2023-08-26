// Super KeyWord

class A {
    // int a = 10;
    void show(){
        System.out.println("Hello Viewer");
    }
}
class B extends A {
    int a = 20;
    void show() {
        
        // System.out.println(a);
        // System.out.println(super.a);

        super.show();
        System.out.println("Hello List");


    }
}
class Test {
    public static void main(String[] args) {
        B n = new B();
        n.show();
    }
}