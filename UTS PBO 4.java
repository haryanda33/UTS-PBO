import java.util.Scanner;

// Kelas PhysicsMathFormulas untuk menghitung berbagai rumus
public class PhysicsMathFormulas {

    // Constructor default
    public PhysicsMathFormulas() {
        System.out.println("PhysicsMathFormulas instance created.");
    }

    // Constructor untuk menghitung kecepatan rata-rata
    public PhysicsMathFormulas(double distance, double time) {
        double velocity = calculateVelocity(distance, time);
        System.out.println("Kecepatan rata-rata: " + velocity + " m/s");
    }

    // Constructor untuk menghitung energi kinetik
    public PhysicsMathFormulas(double mass, double velocity, boolean isKineticEnergy) {
        if (isKineticEnergy) {
            double kineticEnergy = calculateKineticEnergy(mass, velocity);
            System.out.println("Energi kinetik: " + kineticEnergy + " Joules");
        }
    }

    // Constructor untuk menghitung gaya
    public PhysicsMathFormulas(double mass, double acceleration, String force) {
        if (force.equals("force")) {
            double forceValue = calculateForce(mass, acceleration);
            System.out.println("Gaya: " + forceValue + " Newtons");
        }
    }

    // Method untuk menghitung kecepatan rata-rata
    public double calculateVelocity(double distance, double time) {
        return distance / time;
    }

    // Method untuk menghitung energi kinetik
    public double calculateKineticEnergy(double mass, double velocity) {
        return 0.5 * mass * velocity * velocity;
    }

    // Method untuk menghitung gaya
    public double calculateForce(double mass, double acceleration) {
        return mass * acceleration;
    }

    // Overloaded method untuk menghitung luas lingkaran
    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Overloaded method untuk menghitung luas persegi panjang
    public double calculateArea(double length, double width) {
        return length * width;
    }

    // Overloaded method untuk menghitung volume kubus
    public double calculateVolume(double side) {
        return side * side * side;
    }

    // Overloaded method untuk menghitung volume balok
    public double calculateVolume(double length, double width, double height) {
        return length * width * height;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membuat instance default
        PhysicsMathFormulas formulas = new PhysicsMathFormulas();

        // Menghitung kecepatan rata-rata
        System.out.print("Masukkan jarak (dalam meter): ");
        double distance = scanner.nextDouble();
        System.out.print("Masukkan waktu (dalam detik): ");
        double time = scanner.nextDouble();
        new PhysicsMathFormulas(distance, time);

        // Menghitung energi kinetik
        System.out.print("Masukkan massa (dalam kilogram): ");
        double mass = scanner.nextDouble();
        System.out.print("Masukkan kecepatan (dalam m/s): ");
        double velocity = scanner.nextDouble();
        new PhysicsMathFormulas(mass, velocity, true);

        // Menghitung gaya
        System.out.print("Masukkan percepatan (dalam m/s^2): ");
        double acceleration = scanner.nextDouble();
        new PhysicsMathFormulas(mass, acceleration, "force");

        // Menghitung luas lingkaran
        System.out.print("Masukkan jari-jari lingkaran (dalam meter): ");
        double radius = scanner.nextDouble();
        double circleArea = formulas.calculateArea(radius);
        System.out.println("Luas lingkaran: " + circleArea + " meter persegi");

        // Menghitung luas persegi panjang
        System.out.print("Masukkan panjang persegi panjang (dalam meter): ");
        double length = scanner.nextDouble();
        System.out.print("Masukkan lebar persegi panjang (dalam meter): ");
        double width = scanner.nextDouble();
        double rectangleArea = formulas.calculateArea(length, width);
        System.out.println("Luas persegi panjang: " + rectangleArea + " meter persegi");

        // Menghitung volume kubus
        System.out.print("Masukkan sisi kubus (dalam meter): ");
        double side = scanner.nextDouble();
        double cubeVolume = formulas.calculateVolume(side);
        System.out.println("Volume kubus: " + cubeVolume + " meter kubik");

        // Menghitung volume balok
        System.out.print("Masukkan panjang balok (dalam meter): ");
        length = scanner.nextDouble();
        System.out.print("Masukkan lebar balok (dalam meter): ");
        width = scanner.nextDouble();
        System.out.print("Masukkan tinggi balok (dalam meter): ");
        double height = scanner.nextDouble();
        double cuboidVolume = formulas.calculateVolume(length, width, height);
        System.out.println("Volume balok: " + cuboidVolume + " meter kubik");

        scanner.close();
    }
}
