import java.util.Scanner;

// 1. Payment interface
interface PaymentMethod {
    void pay(double amount);
}

// 2. Card payment implementation
class CardPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Processing card payment...");
        System.out.println("Payment of Rs. " + amount
                + " completed using Card.");
    }
}

// 3. UPI payment implementation
class UpiPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Processing UPI payment...");
        System.out.println("Payment of Rs. " + amount
                + " completed using UPI.");
    }
}

// 4. Wallet payment implementation
class WalletPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Processing wallet payment...");
        System.out.println("Payment of Rs. " + amount
                + " completed using Wallet.");
    }
}

// 5. Main payment application
public class PaymentApplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PaymentMethod payment = null;

        System.out.println("===== PAYMENT APPLICATION =====");
        System.out.println("1. Card Payment");
        System.out.println("2. UPI Payment");
        System.out.println("3. Wallet Payment");
        System.out.print("Choose your payment method: ");

        int choice = sc.nextInt();

        System.out.print("Enter amount: Rs. ");
        double amount = sc.nextDouble();

        if (amount <= 0) {
            System.out.println("Invalid amount!");
            sc.close();
            return;
        }

        switch (choice) {
            case 1:
                payment = new CardPayment();
                break;

            case 2:
                payment = new UpiPayment();
                break;

            case 3:
                payment = new WalletPayment();
                break;

            default:
                System.out.println("Invalid payment method!");
                sc.close();
                return;
        }

        System.out.println("\n===== PAYMENT STATUS =====");
        payment.pay(amount);

        sc.close();
    }
}
