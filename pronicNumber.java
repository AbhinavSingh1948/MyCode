
public class pronicNumber {
    public static void main(String[] args) {
        scanner scanner = new scanner (System.in);
        System.out.print("Enter a number to check if it's a Pronic number: ");
        int num = scanner.nextInt();
        scanner.close();

        if (isPronic(num)) {
            System.out.println(num + " is a Pronic number.");
        } else {
            System.out.println(num + " is not a Pronic number.");
        }
    }

    public static boolean isPronic(int num) {
        int sqrt = (int) Math.sqrt(num);
        return (sqrt * (sqrt + 1) == num);
    }
}