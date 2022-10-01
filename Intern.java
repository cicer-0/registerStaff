public class Intern extends Staff {
  private String specialty;

  public Intern() {
    super();
    this.specialty = new String();
  }

  public Intern(Staff staff) {
    super(
        staff.getDNI(),
        staff.getDateOfBirth(),
        staff.getLastName(),
        staff.getMotherLastName(),
        staff.getNames(),
        staff.getWorkArea(),
        staff.getWorkerCode(),
        staff.getSalary(),
        staff.getHoursPerWeek());
  }

  public Intern(
      String DNI,
      String dateOfBirth,
      String lastName,
      String motherLastName,
      String names,
      ENWorkArea workArea,
      String workerCode,
      double salary,
      String profession,
      int hoursPerWeek) {
    super(DNI, dateOfBirth, lastName, motherLastName, names, workArea, workerCode, salary, hoursPerWeek);
    this.specialty = new String(specialty);
  }

  public String getSpecialty() {
    return specialty;
  }

  public void setSpecialty(String specialty) {
    this.specialty = specialty;
  }

  public void typingData() {
    System.out.println("I find myself typing data");
  }

  public void controlAttendance() {
    System.out.println("controlling attendance");
  }
}
