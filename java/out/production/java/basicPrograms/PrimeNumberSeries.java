package out.production.java.basicPrograms;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PrimeNumberSeries {
    public static void main(String[] args) {


       /* System.out.println("enter number");

        Scanner sc = new Scanner(System.in);

        int num=sc.nextInt();

        if(num<=1){
            System.out.println("not prime");
            return;
        }

        int count=0;
        for (int i=2;i<num/2;i++){

            if(num%i==0){
               count++;
               break;
            }

        }

        if(count==1){
            System.out.println("not prime");

        }else{

            System.out.println("prime");
        }

        //fermet little theorem
        */



                int start = 10;
                int end = 50;
                for (int i = start; i <= end; i++) {
                    if (i <= 1) {
                        continue;
                    }
                    boolean isPrime = true;
                    for (int j = 2; j <= i/2; j++) {
                        if (i % j == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                    if (isPrime) {
                        System.out.print(i +"\t");
                    }
                }
            }
        }





