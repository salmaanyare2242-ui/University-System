public class FullTimeLecturer extends Lecturer {
    private double basicSalary;
    private double researchAllowance;
    private double administrativeAllowance;

    public FullTimeLecturer(String lecturerId, String name,
                            double basicSalary, double researchAllowance,
                            double administrativeAllowance) {
        super(lecturerId, name);
        this.basicSalary = basicSalary;
        this.researchAllowance = researchAllowance;
        this.administrativeAllowance = administrativeAllowance;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getResearchAllowance() {
        return researchAllowance;
    }

    public void setResearchAllowance(double researchAllowance) {
        this.researchAllowance = researchAllowance;
    }

    public double getAdministrativeAllowance() {
        return administrativeAllowance;
    }

    public void setAdministrativeAllowance(double administrativeAllowance) {
        this.administrativeAllowance = administrativeAllowance;
    }

    @Override
    public double calculateSalary() {
        return basicSalary + researchAllowance + administrativeAllowance;
    }

    @Override
    public void displayInformation() {
        System.out.println("Lecturer Type: Full Time");
        System.out.println("Lecturer ID: " + getLecturerId());
        System.out.println("Name: " + getName());
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Research Allowance: " + researchAllowance);
        System.out.println("Administrative Allowance: " + administrativeAllowance);
        System.out.println("Total Salary: " + calculateSalary());
    }
}
