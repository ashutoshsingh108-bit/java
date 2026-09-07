public class Patient {
    int patientId;
    String name;
    int age;
    double temperature; // in °F

    public Patient(int patientId, String name, int age, double temperature) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.temperature = temperature;
    }

    public void checkFever() {
        if (temperature > 100.4) {
            System.out.println("Status: Fever");
        } else {
            System.out.println("Status: Normal");
        }
    }

    public void displayPatient() {
        System.out.println("ID: " + patientId + " | Name: " + name + " | Age: " + age + " | Temp: " + temperature + "°F");
    }

    public static void main(String[] args) {
        Patient patient1 = new Patient(101, "Rahul Sharma", 28, 101.2);
        Patient patient2 = new Patient(102, "Priya Singh", 35, 98.6);

        // Patient 1 Check
        patient1.displayPatient();
        patient1.checkFever();

        System.out.println("-----------------------------------");

        // Patient 2 Check
        patient2.displayPatient();
        patient2.checkFever();
    }
}