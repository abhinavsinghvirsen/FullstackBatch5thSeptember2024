package out.production.java.bs;

import java.sql.SQLOutput;

public class ConstrutorExample {

    public static void main(String[] args) {

        StudentT obj = new StudentT(44,"nimai");
        System.out.println(obj.roll);
        System.out.println(obj.name);
        System.out.println(obj.School);
        StudentT obj4 = new StudentT(444,"AKS");
        System.out.println(obj4.roll);
        System.out.println(obj4.name);
        System.out.println(obj4.School);

        StudentT obj2= new StudentT();
        System.out.println(obj2.roll);
        System.out.println(obj2.name);

        StudentT obj3= new StudentT(456);
        System.out.println(obj3.roll);
        System.out.println(obj3.name);



    }
}

class StudentT{

    int roll;
    String name;
    String School;

     StudentT(int roll,String name){
       this.roll=roll;
       this.name=name;
       this.School="MNPS";

    }

    StudentT(){
        this.roll=45;
        this.name="Abhinav";

    }

    StudentT(int roll){
        this.roll=roll;


    }



}
