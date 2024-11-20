package out.production.java.bs;

public class MethodOveloadinCase {

    public static void main(String... args) {

        MethodOveloadinCase obj = new MethodOveloadinCase();


        obj.bill("Abhinav", 10,20);


    }
    //var args

    double bill(String name, double... a) {

        System.out.println("A");
        return  10.0;
    }



    double bill(String x ,double y){

        System.out.println("B");


          return  10.9;


    }









}
