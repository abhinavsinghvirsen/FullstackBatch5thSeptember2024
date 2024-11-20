package out.production.java.bs;

public class MethodOverloading {


    final static public void main(String...args) {


        MethoExample obj = new MethoExample();
        obj.m1(1);
        obj.m1(10.0d);
        obj.m1(4,5,6,7);

        main(new int[]{1});

    }
    static public void main(int[] args) {


        System.out.println("hello");

    }

    static public void main(byte[] args) {


        System.out.println("hello");

    }
}


class MethoExample{

    public void m1(int... nums) {


        System.out.println("Varargs method  " + java.util.Arrays.toString(nums));
    }
    public void m1(int num) {
        System.out.println("Primitive int  " + num);
    }

    public void m1(Integer num) {
        System.out.println("Wrapper Integer  " + num);
    }

    public void m1(double num) {
        System.out.println("Primitive double  " + num);
    }






}