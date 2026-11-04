public class PartTimeLecturer extends Lecturer {
    private double teachingHours;
    private double hourlyRate;

    public PartTimeLecturer(String lecturerId, String name,
                            double teachingHours, double hourlyRate) {
        super(lecturerId, name);
        this.teachingHours = teachingHours;
        this.hourlyRate = hourlyRate;
    }

    public double getTeachingHours() {
        return teachingHours;
    }

    public void setTeachingHours(double teachingHours) {
        this.teachingHours = teachingHours;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return teachingHours * hourlyRate;
    }

    @Override
    public void displayInformation() {
        System.out.println("Lecturer Type: Part Time");
        System.out.println("Lecturer ID: " + getLecturerId());
        System.out.println("Name: " + getName());
        System.out.println("Teaching Hours: " + teachingHours);
        System.out.println("Hourly Rate: " + hourlyRate);
        System.out.println("Total Salary: " + calculateSalary());
    }
}
