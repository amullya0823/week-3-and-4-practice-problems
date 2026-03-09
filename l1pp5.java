import java.util.Scanner;

public class l1pp5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        boolean canVote = (age >= 18);

        System.out.println("Can the person vote? " + canVote);
    }
}