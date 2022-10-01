public class Professor extends Staff {
  private String profession;

  public Professor() {
    super();
    profession = new String();
  }

  public Professor(Staff staff) {
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

  public Professor(
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
    this.profession = new String(profession);
  }

  public String getProfession() {
    return profession;
  }

  public void setProfession(String profession) {
    this.profession = profession;
  }

  public void toTeach() {
    System.out.println("I find myself teaching");
  }

  public void toRate() {
    System.out.println("I find myself qualifying");
  }
}
