import java.util.Scanner;

public class Main {

    // Recursive method to solve the Tower of Hanoi
    public static void solveHanoi(int n, char source, char destination, char auxiliary) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }
        // Move n-1 disks from source to auxiliary
        solveHanoi(n - 1, source, auxiliary, destination);

        // Move the nth disk from source to destination
        System.out.println("Move disk " + n + " from " + source + " to " + destination);

        // Move the n-1 disks from auxiliary to destination
        solveHanoi(n - 1, auxiliary, destination, source);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Tower of Hanoi game!");
        System.out.print("Enter the number of disks: ");
        int numberOfDisks = scanner.nextInt();

        // Validate input
        if (numberOfDisks <= 0) {
            System.out.println("The number of disks must be greater than 0.");
            return;
        }

        System.out.println("Solving Tower of Hanoi with " + numberOfDisks + " disks...");
        solveHanoi(numberOfDisks, 'A', 'C', 'B'); // A = Source, C = Destination, B = Auxiliary
        System.out.println("Tower of Hanoi solved!");
    }
}
