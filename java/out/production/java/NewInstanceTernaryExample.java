package out.production.java;

public class NewInstanceTernaryExample {

    public static void main(String[] args) {


      /*  Student ram = new Student();
        Teacher kalyan = new Teacher();

        checkIsStudent(kalyan);
        checkIsStudent(ram);
        int Object=5;



        int a=40;
        int b=30;

        int result = a>b ? a : b ;

        System.out.println(result);



        Object obj = 10>20 ? 10 : "Twenty";

        System.out.println(obj);*/

/*

        int a=100;
        int b=24;
        int c =122;

        int max = (a>b) ?  ( (a>c)?a:c)     :    ((b>c) ?b:c);
        System.out.println(max);*/



    /*    int     obj = 10>20 ? 10 : 40;


        int x = 100>20 ? 10 : "Twenty";

        System.out.println(obj);
        */



/*
        int a=100;

        int b=200;

        System.out.println(a&b);*/


     int a=6;
     int result =a & 6;
     System.out.println(result);

     int b=3;// 0011
     int c =4;//0100
     int nresult = b|c;//0111
     System.out.println(nresult); //0

        int x=12; // 1100
        int y=10; //1010
        int z=x&y; //1000
        System.out.println(z); //8


        int num=6;//110
        int num2=3;//011


        int res=num^num2;//101=5
        System.out.println(res);

        int xc=5; //5*2
        int resultt=xc <<3;
        System.out.println(resultt);//40

        int zx=-16;
        int rs=zx >>>2; // -8
        System.out.println(rs);
























    }

    public static void checkIsStudent(Object th){

        System.out.println(th instanceof Student);



    }


}

class Student{

    int roll;

}
class Teacher{



}
