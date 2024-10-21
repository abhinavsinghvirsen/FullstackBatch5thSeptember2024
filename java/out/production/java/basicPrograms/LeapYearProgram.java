package out.production.java.basicPrograms;

public class LeapYearProgram {

    public static void main(String[] args) {

        int year = 2026;

        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {

            System.out.println(year +" is a leap year.");

        } else {

            System.out.println(year + " is not a leap year.");

        }



    }
}
