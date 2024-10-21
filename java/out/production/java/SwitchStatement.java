package out.production.java;

public class SwitchStatement {


    public static void main(String[] args) {


       /* byte a=8;

        switch (a){

            case 0:
                System.out.println("sunday");
                break;
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wed");
                break;
            case 4:
                System.out.println("thur");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            default:
                System.out.println("wrong input please enter number in between 0 to 6");
        }*/


/*
         int a=65;



         switch (a){

             case 'A':
                 System.out.println("A");
             default:
                 System.out.println("no match");
         }
         */

       /*  String choice="infotech";
         switch (choice){


             case "infotech":
                 System.out.println("for info tech need 30%");
             case "ibm":
                 System.out.println("for ibm you need 70%");
                 break;
             case "abc":
                 System.out.println("exmaple ");
             case "abc":
                 System.out.println("exmaple ");

             default:
                 System.out.println("default");



         }
         */


       /* int a =99;
        int b=33;
        switch(b){

            case a:
                System.out.println("try");


        }
         */



  int a=10;
  final int X=20;

  switch(a){

      case 10:
          System.out.println("Ten");
          break;

      case X:
          System.out.println("twenty");
      case 'A':
              System.out.println("65 ==A");
              break;

      case 10+20+23:
          System.out.println("53...."); break;
      default:
          System.out.println("break");
  }



  char ch='Z';

  if(ch>=65 && ch<=90){

      switch(ch){

          case 'A':
          case 'E':
          case 'I':
          case 'O':
          case 'U':
              System.out.println("vowels");
              break;
          default:
              System.out.println("consonant");

      }



  }else{

      System.out.println("enter valid input ");
  }
















/*String day = "Monday";
int dayNumber;

switch (day) {
    case "Monday":
        dayNumber = 1;
        break;
    case "Tuesday":
        dayNumber = 2;
        break;
    // ... cases for other days
    default:
        dayNumber = 0;
}*/


        /*String day = "Monday";
int dayNumber = switch (day) {
    case "Monday" -> 1;
    case "Tuesday" -> 2;
    // ... cases for other days
    default -> 0;
};*/


        /*int dayNumber = switch (day) {
    case "Monday", "Wednesday", "Friday" -> 1;
    case "Tuesday", "Thursday", "Saturday" -> 2;
    default -> 0;
};*/


        /*int dayNumber = switch (day) {
    case "Monday" -> 1;
    case "Tuesday" -> 2;
    default -> {
        System.out.println("Unknown day");
        yield 0;
    }
};*/


        /*String day = "Tuesday";
        switch (day) {
            case "Monday":
                System.out.println("Week day");
                break;
            case "Tuesday":
                System.out.println("Week day");
                break;
            case "Wednesday":
                System.out.println("Week day");
                break;
            case "Thursday":
                System.out.println("Week day");
                break;
            case "Friday":
                System.out.println("Week day");
                break;
            case "Saturday":
                System.out.println("Weekend");
                break;
            case "Sunday":
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Unknown");
        }*/

        /*enum DAYS {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
DAYS days = DAYS.SUNDAY;
switch (days) {
    case MONDAY:
        System.out.println("Weekdays");
        break;
    case TUESDAY:
        System.out.println("Weekdays");
        break;
    case WEDNESDAY:
        System.out.println("Weekdays");
        break;
    case THURSDAY:
        System.out.println("Weekdays");
        break;
    case FRIDAY:
        System.out.println("Weekdays");
        break;
    case SATURDAY:
        System.out.println("Weekends");
        break;
    case SUNDAY:
        System.out.println("Weekends");
        break;
    default:
        System.out.println("Unknown");
}*/

        //Return value through break keyword JAVA 12
     /*   return  switch (day) {
            case "Monday":
                break "Weekday";
            case "Tuesday":
                break "Weekday";
            case "Wednesday":
                break "Weekday";
            case "Thursday":
                break "Weekday";
            case "Friday":
                break "Weekday";
            case "Saturday":
                break "Weekend";
            case "Sunday":
                break "Weekend";
            default:
                break "Unknown";
        };*/

        /*This word was replaced by “yield" later in Java 13.

return  switch (day) {
    case "Monday":
        yield  "Weekday";
    case "Tuesday":
        yield "Weekday";
    case "Wednesday":
        yield "Weekday";
    case "Thursday":
        yield "Weekday";
    case "Friday":
        yield "Weekday";
    case "Saturday":
        yield "Weekend";
    case "Sunday":
        yield "Weekend";
    default:
        yield "Unknown";
};
Return value through arrow operator :

Further instead of returning values using break keyword , Java 12 introduced arrow operators as a simple alternative:

return  switch (day) {
            case "Monday"-> "Week day";
            case "Tuesday"-> "Week day";
            case "Wednesday"->"Week day";
            case "Thursday"->"Week day";
            case "Friday"->"Week day";
            case "Saturday"-> "Weekend";
            case "Sunday"-> "Weekend";
            default->"Unknown";
        };
*/

    }



}
