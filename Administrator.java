public class Administrator extends Staff {
  private String position;

  public Administrator() {
    super();
    this.position = new String();
  }

  public Administrator(Staff staff) {
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

  public Administrator(
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
    this.position = new String(position);
  }

  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  public void useSIAF() {
    System.out.println("I find myself using SIAF");
  }

  public void processExpenses() {
    System.out.println("I am processing expenses");
  }
}
