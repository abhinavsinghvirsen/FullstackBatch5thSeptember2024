package out.production.java;

import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {

        //Scanner s = new Scanner(System.in);

      /*  String name[]; //declaration

        name= new String[3]; //construction of array

        for (int i=0;i<name.length;i++){
            System.out.println("enter name of your friend");
            name[i]="abhinav"+i;
        }


        // System.out.println(name.toString());


         for (int i=0;i<name.length;i++){

             System.out.println(name[i]);
         }*/



       /* int arr[] = new int[5];

        for (int i=0;i<arr.length;i++){
            System.out.println("enter name of your number");
            arr[i]=s.nextInt();
        }

        for (int i=0;i<arr.length;i++){

            System.out.println(arr[i]);
        }
*/


      /*  int rooms[]={234,456,666,777};

        for (int i=0;i<rooms.length;i++){

            System.out.println(rooms[i]);
        }*/

      /* int ppl[]=new int[8];
        System.out.println("enter the price of 8 product");
        for (int i=0;i<ppl.length;i++){
            System.out.println("price of produt ="+i);

            ppl[i]=s.nextInt();
        }

         int sum=0;
        for (int i=0;i<ppl.length;i++){

            sum=sum+ppl[i];
        }
        System.out.println(sum);*/




      /* int arr[]= new int[30];


        System.out.println(arr.length);*/


       /* int arr[] = {1,3};

        arr=null;*/


        System.out.println(args.length);

        for(int i=0;i<args.length;i++){

            System.out.println(args[i]);
        }


        char ch[]= new char[3];
        ch[0]='A';
        ch[1]='b';
        ch[2]='c';
        System.out.println(ch);


      for(int i=args.length-1;i>=0;i--){
          System.out.println(args[i]);

      }


      for(char val:ch){

          System.out.println(val);

      }



      for(String temp:args){
          System.out.println(temp);
        }




       int arr[]= new int[]{2,4,4,4,4,44,6,7,7,7,11};

        for(int i=0;i<args.length;i=i+2){

            System.out.println(args[i]);
        }


      int total= sum(new int[]{4,5,5});

        System.out.println(total);
    }

    public static int sum(int ccc[]){

        int sum=0;
        for(int a:ccc){

            sum=sum+a;
        }


        return sum;
    }

}
