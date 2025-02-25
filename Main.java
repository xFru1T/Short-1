import java.util.Scanner;
class Short {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Print 1 short number: ");
        short num1 = scanner.nextShort();
        System.out.print("Print 2 short number: ");
        short num2 = scanner.nextShort();
        int result = num1 % num2;
        System.out.println("The remainder of the number: " + result);
        }
    }
