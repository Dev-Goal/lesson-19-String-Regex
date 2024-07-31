package exercise.exercie_6;

import java.util.Scanner;

public class ClassExampleTest {
//    private static final String[] className = new String[] {"C0223G","A0323K","M0318G","P0323A","C0524I1"};

    public static void main(String[] args) {
        ClassExample classExample = new ClassExample();
        Scanner scanner = new Scanner(System.in);
        String className;
        while (true) {
            System.out.print("Class: ");
            className = scanner.nextLine();
            if (classExample.validate(className)) {
                System.out.println("Class " + className + " valid ");
//                return;
            } else {
                System.out.println("Class " + className + " invalid");
            }
        }
    }
}
