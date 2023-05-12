import java.util.Scanner;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Saldo tidak mencukupi");
        }
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membuat objek BankAccount dengan saldo awal 500.000
        BankAccount account = new BankAccount("1234567890", 1000000);

        boolean exitProgram = false;

        while (!exitProgram) {
            // Menampilkan menu
            System.out.println("Pilih opsi:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Keluar");

            // Mengambil input dari pengguna
            System.out.print("Masukkan opsi: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Masukkan jumlah yang akan disetor: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Masukkan jumlah yang akan ditarik: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    exitProgram = true;
                    break;
                default:
                    System.out.println("Opsi tidak valid");
                    break;
            }

            // Mencetak saldo akhir
            System.out.println("Saldo akhir: " + account.getBalance());
            System.out.println();
        }

        scanner.close();
    }
}
