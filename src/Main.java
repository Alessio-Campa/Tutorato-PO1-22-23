public class Main {
    int a;
    int b;
    int id = 0;
    static int s = 0;

    Main(int var, int b){
        System.out.println(var);
        this.id = Main.s++;
        this.a = var;
        this.b = b;
        //this.method(this.a, this.b);
        //this.reference(this);
    }

    Main(String a, int b){
        this(1, 1);
        this.a *= 2;
    }

    Main(int a, String b){
        this.a = a;
        this.b = b.length();
    }

    void method(int y, int z){
        int x = y + z;
        System.out.println(x);
    }

    static void staticMethod(int y, int z){
        int x = y + z;
        System.out.println(x);
    }

    void reference(Main m){

    }

    public static void main(String[] args) {
        Main m = new Main(10, 100);
        Main m1 = new Main(1,1);
        m.method(10, 11);
        Main.staticMethod(10, 11);

        Main.s = 100;
        Main.s = 200;
        System.out.println(Main.s);
    }

}
