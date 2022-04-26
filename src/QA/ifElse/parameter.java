package QA.ifElse;

public class parameter {

    int display(){
        return 5;
    }

    int show(){
        return 7;
    }
    public static void myMethod() {
        System.out.println("I just got executed!");
    }
    public static void myPhone(){
        System.out.println("i got it");
    }

    public static void age(int a, int b){
        int sum= a+b;
        System.out.println(sum);
    }
    public static void ask(int x, int y){
        int mul= x*y;
        System.out.println(mul);
    }




    public static void main(String[] args) {
        myMethod();
        myPhone();
        int a =5;
        int b =4;
        age(a,b);

        int x =5;
        int y =4;
        ask(x,y);

        parameter t = new parameter();
        System.out.println(t.display());

        parameter s = new parameter();
        System.out.println(s.show());



    }
}

