package out.production.java;

public class MethodExample {

    public static void main(String[] args) {

        Sample obj = new Sample();

        int  result = obj.m2(3); //actual argument  //calling  caller

        System.out.println(result);


    }

}

class Sample{

    int a ;
    int b;

    public void m1(){
        System.out.println("m1");

    }

    public int  m2(int x){ //formal arguemnt calling
        System.out.println(x);

        return x*x;

    }

    public static void m3(){


    }
    public static void m4(){


    }




}
