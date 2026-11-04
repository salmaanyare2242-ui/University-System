import java.util.ArrayList;

public class UniversityPayrollSystem {
    private ArrayList<Lecturer> lecturers;

    public UniversityPayrollSystem() {
        lecturers = new ArrayList<>();
    }

    public void addLecturer(Lecturer lecturer) {
        lecturers.add(lecturer);
        System.out.println("Lecturer added successfully!");
    }

    public void displayAllLecturers() {
        System.out.println("\n===== ALL LECTURERS =====");
        for (Lecturer lecturer : lecturers) {
            lecturer.displayInformation();
            System.out.println("------------------------");
        }
    }

    public void displayHighestPaidLecturer() {
        if (lecturers.isEmpty()) {
            System.out.println("No lecturers found!");
            return;
        }

        Lecturer highestPaid = lecturers.get(0);
        for (Lecturer lecturer : lecturers) {
            if (lecturer.calculateSalary() > highestPaid.calculateSalary()) {
                highestPaid = lecturer;
            }
        }

        System.out.println("\n===== HIGHEST PAID LECTURER =====");
        highestPaid.displayInformation();
    }

    public double calculateFullTimePayroll() {
        double total = 0;
        for (Lecturer lecturer : lecturers) {
            if (lecturer instanceof FullTimeLecturer) {
                total += lecturer.calculateSalary();
            }
        }
        return total;
    }

    public double calculatePartTimePayroll() {
        double total = 0;
        for (Lecturer lecturer : lecturers) {
            if (lecturer instanceof PartTimeLecturer) {
                total += lecturer.calculateSalary();
            }
        }
        return total;
    }

    public void displayLecturersEarningMoreThanThreshold(double threshold) {
        System.out.println("\n===== LECTURERS EARNING MORE THAN " + threshold + " =====");
        boolean found = false;

        for (Lecturer lecturer : lecturers) {
            if (lecturer.calculateSalary() > threshold) {
                lecturer.displayInformation();
                System.out.println("------------------------");
                found = true;
            }
        }

        if (!found) {
            System.out.println("No lecturer found!");
        }
    }
}
