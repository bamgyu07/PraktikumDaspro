package Jobsheet05;

import java.util.Scanner;

public class PemilihanHari03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String dayName, dayType;
        System.out.println("Input day name: ");
        dayName = sc.nextLine();

        switch (dayName.toLowerCase()) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                dayType = "Weekday";
                break;
            case "saturday":
            case "sunday":
                dayType = "Weekend";
                break; 
            default:
                dayType = "Invalid day name";
        }
        System.out.println(dayName + " is a " + dayType);
    }
}
