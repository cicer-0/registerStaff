public abstract class Staff extends Person {
  private double salary;
  private ENWorkArea workArea;
  private String workerCode;
  private int hoursPerWeek;

  public int getHoursPerWeek() {
    return hoursPerWeek;
  }

  public void setHoursPerWeek(int hoursPerWeek) {
    this.hoursPerWeek = hoursPerWeek;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  public ENWorkArea getWorkArea() {
    return workArea;
  }

  public String getWorkArea_TXT() {
    String txt = new String();
    switch (workArea) {
      case PROFESSOR:
        txt = "PROFESSOR";
        break;
      case ADMINISTRATOR:
        txt = "ADMINISTRATOR";
        break;
      case INTERN:
        txt = "INTERN";
        break;
    }
    return txt;
  }

  public void setWorkArea(ENWorkArea workArea) {
    this.workArea = workArea;
  }

  public String getWorkerCode() {
    return workerCode;
  }

  public void setWorkerCode(String workerCode) {
    this.workerCode = workerCode;
  }

  public Staff() {
    super();
    this.salary = 0;
    this.workerCode = new String();
  }

  public Staff(
      String DNI,
      String dateOfBirth,
      String lastName,
      String motherLastName,
      String names,
      ENWorkArea workArea,
      String workerCode,
      double salary,
      int hoursPerWeek) {
    super(DNI, dateOfBirth, motherLastName, lastName, names);
    this.workArea = workArea;
    this.workerCode = new String(workerCode);
    this.salary = salary;
    this.hoursPerWeek = hoursPerWeek;
  }

  @Override
  public String toString() {
    String text = new String("");
    text += ("DNI : " + this.getDNI() + "\n");
    text += ("Date of birth : " + this.getDateOfBirth() + "\n");
    text += ("Last name : " + this.getLastName() + "\n");
    text += ("Mother's last name : " + this.getMotherLastName() + "\n");
    text += ("Names : " + this.getNames() + "\n");
    text += ("Work area : " + this.getWorkArea_TXT() + "\n");
    text += ("Worker Code : " + this.getWorkerCode() + "\n");
    text += ("Salary : " + this.getSalary() + "\n");
    text += ("Hours per week : " + this.getHoursPerWeek() + "\n");
    return text;
  }
}
