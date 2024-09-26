import java.util.Scanner;
public class LeapYearChecker {

    public boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true; // Divisible by 400, so it's a leap year
                } else {
                    return false; // Divisible by 100 but not by 400, not a leap year
                }
            } else {
                return true; // Divisible by 4 but not by 100, so it's a leap year
            }
        } else {
            return false; // Not divisible by 4, not a leap year
        }
    }

    public static void main(String[] args) {
        LeapYearChecker checker = new LeapYearChecker();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        if (checker.isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}