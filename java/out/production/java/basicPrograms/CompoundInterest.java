package out.production.java.basicPrograms;

public class CompoundInterest {

    public static void main(String[] args) {
        double principal = 15000;
        double rate = 6.2;
        int  time = 3;

        double amount = principal * (Math.pow((1 + rate / 100), time)) - 1;

        System.out.println(amount);



    }




}
