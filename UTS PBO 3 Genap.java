public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private double salary;

    // Constructor untuk menginisialisasi Employee
    public Employee(int id, String firstName, String lastName, double salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    // Getter untuk id
    public int getId() {
        return id;
    }

    // Getter untuk firstName
    public String getFirstName() {
        return firstName;
    }

    // Getter untuk lastName
    public String getLastName() {
        return lastName;
    }

    // Getter untuk salary
    public double getSalary() {
        return salary;
    }

    // Setter untuk salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Method untuk mendapatkan nama lengkap
    public String getName() {
        return firstName + " " + lastName;
    }

    // Method untuk menaikkan gaji dengan persentase tertentu
    public void raiseSalary(double percent) {
        if (percent > 0) {
            salary += salary * (percent / 100);
        } else {
            System.out.println("Persentase kenaikan gaji harus lebih besar dari 0.");
        }
    }

    // Method untuk menampilkan informasi karyawan
    public void displayEmployeeInfo() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + getName());
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        // Membuat objek Employee
        Employee emp = new Employee(1, "John", "Doe", 5000.0);

        // Menampilkan informasi karyawan awal
        System.out.println("Initial Employee Information:");
        emp.displayEmployeeInfo();

        // Menaikkan gaji karyawan
        emp.raiseSalary(10.0);

        // Menampilkan informasi karyawan setelah kenaikan gaji
        System.out.println("\nEmployee Information After Raise:");
        emp.displayEmployeeInfo();
    }
}
