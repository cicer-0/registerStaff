import java.util.HashSet;
import java.util.Scanner;

class ProgramOne {
  private static Scanner scn;
  public static HashSet<Professor> collegeProfessor = new HashSet<Professor>();
  public static HashSet<Administrator> collegeAdministrator = new HashSet<Administrator>();
  public static HashSet<Intern> collegeIntern = new HashSet<Intern>();
  public static int totalHoursOfWork = 0;

  private static Staff recordStaff() {
    Staff staff = new Staff() {
    };
    int hoursOfWork = 0;
    scn.nextLine();
    System.out.println("DNI: ");
    staff.setDNI(scn.nextLine());
    System.out.println("Date of birth: ");
    staff.setDateOfBirth(scn.nextLine());
    System.out.println("Last name: ");
    staff.setLastName(scn.nextLine());
    System.out.println("Mother's last name: ");
    staff.setMotherLastName(scn.nextLine());
    System.out.println("Names: ");
    staff.setNames(scn.nextLine());
    System.out.println("Worker code: ");
    staff.setWorkerCode(scn.nextLine());
    System.out.println("Salary: ");
    staff.setSalary(scn.nextDouble());
    System.out.println("Hours per week: ");
    hoursOfWork = scn.nextInt();
    totalHoursOfWork += hoursOfWork;
    staff.setHoursPerWeek(hoursOfWork);
    return staff;
  }

  private static void recordStaffsofArea(ENWorkArea area) {
    int numberOfStaff = 0;
    String areaName = new String();
    switch (area) {
      case PROFESSOR:
        areaName = "professors";
        break;
      case ADMINISTRATOR:
        areaName = "administrators";

        break;
      case INTERN:
        areaName = "interns";
        break;
    }
    System.out.println("How many " + areaName + " work at the university?: ");
    numberOfStaff = scn.nextInt();
    for (int i = 0; i < numberOfStaff; i++) {
      if (area == ENWorkArea.PROFESSOR) {
        Professor aux = new Professor(ProgramOne.recordStaff());
        System.out.println("Profession: ");
        aux.setWorkArea(ENWorkArea.PROFESSOR);
        scn.nextLine();
        aux.setProfession(scn.nextLine());
        collegeProfessor.add(aux);
      }
      if (area == ENWorkArea.ADMINISTRATOR) {
        Administrator aux = new Administrator(ProgramOne.recordStaff());
        System.out.println("Position: ");
        aux.setWorkArea(ENWorkArea.ADMINISTRATOR);
        scn.nextLine();
        aux.setPosition(scn.nextLine());
        collegeAdministrator.add(aux);
      }
      if (area == ENWorkArea.INTERN) {
        Intern aux = new Intern(ProgramOne.recordStaff());
        System.out.println("Specialty: ");
        aux.setWorkArea(ENWorkArea.INTERN);
        scn.nextLine();
        aux.setSpecialty(scn.nextLine());
        collegeIntern.add(aux);
      }
    }
  }

  public static void recordData() {
    scn = new Scanner(System.in);
    ProgramOne.recordStaffsofArea(ENWorkArea.PROFESSOR);
    ProgramOne.recordStaffsofArea(ENWorkArea.ADMINISTRATOR);
    ProgramOne.recordStaffsofArea(ENWorkArea.INTERN);
    scn.close();
  }
}

public class exam1CLI {
  public static void main(String[] args) {
    ProgramOne.recordData();
    System.out.println();
    for (Professor staff : ProgramOne.collegeProfessor) {
      System.out.println(staff.toString());
    }
    for (Administrator staff : ProgramOne.collegeAdministrator) {
      System.out.println(staff.toString());
    }
    for (Intern staff : ProgramOne.collegeIntern) {
      System.out.println(staff.toString());
    }
    System.out.println("Total hours staff work at the university at week: " +
        ProgramOne.totalHoursOfWork);
  }
}
