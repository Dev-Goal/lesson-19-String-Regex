package exercise.exercie_7;

import java.util.Scanner;

public class PhoneNumberExampleTest {
    public static void main(String[] args) {
        PhoneNumberExample phoneNumberExample = new PhoneNumberExample();
        Scanner scanner = new Scanner(System.in);
        String phonenumber;
        while (true) {
            System.out.print("Nhập vào số điện thoại: ");
            phonenumber = scanner.nextLine();
            if (phoneNumberExample.validate(phonenumber)) {
                System.out.println("Số điện thoại " + phonenumber + " hợp lệ");
            } else {
                System.out.println("Số điện thoại " + phonenumber + " không hợp lệ");
            }
        }
    }
}
