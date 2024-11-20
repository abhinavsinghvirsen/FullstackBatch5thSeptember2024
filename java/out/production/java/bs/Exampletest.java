package out.production.java.bs;

public class Exampletest {

    public static void main(String[] args) {
        Test obj = new Test();
    }
}

class Test{


    int a=35;
    static int b=57;
    int c=58;

    {
      // int c=30;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c); //30


    }

    static {

        System.out.println("static block ");

    }


        }
