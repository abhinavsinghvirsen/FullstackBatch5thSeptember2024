package out.production.java;

public class doWhile {

    public static void main(String[] args) {

        //do while


       /* int i=0;
        do{

            System.out.println(i);
            i++;


        }while (i<=10);*/


        /*int i=0;  //intialization
        do{

            System.out.println(i);
            i++;//updation


        }while (true); //condition*/


  /*int b=300;
  int i=200;

        do{

            System.out.println("hello  print without condition check");

        }while(200>300);
*/



        int i=0;
        do{
           int j=0;
           do{
               System.out.print(" * ");
               j++;

           }while(j<=i);
            System.out.println();
            i++;
        }while(i<5);

    }
}
