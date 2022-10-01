public abstract class Person {
  private String DNI;
  private String dateOfBirth;
  private String lastName;
  private String motherLastName;
  private String names;

  public Person() {
  }

  public Person(
      String DNI,
      String dateOfBirth,
      String motherLastName,
      String lastName,
      String names) {
    this.DNI = new String(DNI);
    this.dateOfBirth = new String(dateOfBirth);
    this.motherLastName = new String(motherLastName);
    this.lastName = new String(lastName);
    this.names = new String(names);
  }

  public String getDNI() {
    return DNI;
  }

  public void setDNI(String dNI) {
    DNI = dNI;
  }

  public String getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getMotherLastName() {
    return motherLastName;
  }

  public void setMotherLastName(String motherLastName) {
    this.motherLastName = motherLastName;
  }

  public String getNames() {
    return names;
  }

  public void setNames(String names) {
    this.names = names;
  }

  public abstract String toString();
}
