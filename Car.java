import java.util.Scanner;

public class Car {
    private String brand;
    private String model;
    private int year;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void startEngine() {
        System.out.println("Car engine started");
    }

    public void stopEngine() {
        System.out.println("Car engine stopped");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membuat objek Car
        Car car = new Car("Honda", "Cary", 1999);

        // Menampilkan menu
        System.out.println("Pilih opsi:");
        System.out.println("1. Start Engine");
        System.out.println("2. Stop Engine");

        // Mengambil input dari pengguna
        System.out.print("Masukkan opsi: ");
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                car.startEngine();
                break;
            case 2:
                car.stopEngine();
                break;
            default:
                System.out.println("Opsi tidak valid");
                break;
        }

        scanner.close();
    }
}
