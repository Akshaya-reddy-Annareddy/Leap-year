import java.util.*;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        if (year % 4 == 0){
            System.out.println("It is leap year");
        }else{
            System.out.println("It is not a leap year");
        }
    }
}




