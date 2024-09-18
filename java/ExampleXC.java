public class ExampleXC {

     boolean b1;
     byte b2;
     short s;
     int a;
     long b;
     float f;
     double d;
     String name;


     void metho1(){

         System.out.println(b1); //false
         System.out.println(b2);//0
         System.out.println(s);//0
         System.out.println(a);//0
         System.out.println(b);//0.0
         System.out.println(f);//0.0
         System.out.println(d);//0.0
         System.out.println(name);//null


     }


    public static void main(String[] args) {


        ExampleXC obj = new ExampleXC();
        obj.metho1();





    }


}

