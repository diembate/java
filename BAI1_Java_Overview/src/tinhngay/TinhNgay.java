package tinhngay;

import java.util.Scanner;

public class TinhNgay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month: ");
        int month = scanner.nextInt();
        switch (month) {
            case 2:
                System.out.println("The month '2' has 28 or 29 days!");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("has 31 day!");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("has 30 day!");
                break;
            default:
                System.out.print("Invalid input!");
                break;

        }

    }
}
