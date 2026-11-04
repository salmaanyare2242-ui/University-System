public class Main {
    public static void main(String[] args) {
        UniversityPayrollSystem payroll = new UniversityPayrollSystem();

        FullTimeLecturer lecturer1 =
                new FullTimeLecturer("L001", "Ahmed", 1500, 300, 200);
        FullTimeLecturer lecturer2 =
                new FullTimeLecturer("L002", "Mohamed", 1800, 400, 300);

        PartTimeLecturer lecturer3 =
                new PartTimeLecturer("L003", "Ali", 40, 15);
        PartTimeLecturer lecturer4 =
                new PartTimeLecturer("L004", "Hassan", 30, 20);

        payroll.addLecturer(lecturer1);
        payroll.addLecturer(lecturer2);
        payroll.addLecturer(lecturer3);
        payroll.addLecturer(lecturer4);

        payroll.displayAllLecturers();
        payroll.displayHighestPaidLecturer();

        System.out.println("\nTotal Full-Time Payroll: "
                + payroll.calculateFullTimePayroll());
        System.out.println("Total Part-Time Payroll: "
                + payroll.calculatePartTimePayroll());

        payroll.displayLecturersEarningMoreThanThreshold(2000);
    }
}
