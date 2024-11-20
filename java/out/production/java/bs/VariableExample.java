package out.production.java.bs;

public class VariableExample {
    public static void main(String[] args) {

       System.out.println(Student.pincode);

        Student obj = new Student();
        //System.out.println(obj.name);// null
       // obj.name="abhinav";
        System.out.println(obj.pincode+"pin main"); // abhinav

        /*System.out.println(obj.pincode); //0
        Student.pincode=123456;
        System.out.println(obj.pincode);*/

    }
}


class Student{

  //  String name; //instance variable null
  // static  int roll=10; // instance  10

   static int pincode =30; //0

    {
        int roll=50; //local variable
        System.out.println("IB"+roll);  //initialization or instance block
        String a; //local variable
    }

    static {
        int pincode=100;
        int roll=60;  //local
        System.out.println("SB"+pincode);

    }

}
