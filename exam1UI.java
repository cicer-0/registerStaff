import java.util.HashSet;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;

public class exam1UI extends JFrame {
    private JLabel abstractBannerJLB;
    private JLabel salaryJLB;
    private JLabel hourWeekJLB;
    private JLabel addJLB;
    private JLabel totalHourJLB;
    private JLabel DNIJLB;
    private JLabel dateBirthJLB;
    private JLabel lastNameJLB;
    private JLabel motherLastNameJLB;
    private JLabel namesJLB;
    private JLabel workAreaJLB;
    private JLabel workerCodeJLB;
    private JPanel formJPN;
    private JScrollPane registerJSPN;
    private JTable registerJT;
    private JTextField DNIJTF;
    private JTextField dateBirthJTF;
    private JTextField lastNameJTF;
    private JTextField motherLastNameJTF;
    private JTextField namesJTF;
    private JTextField workAreaJTF;
    private JTextField workerCodeJTF;
    private JTextField salaryJTF;
    private JTextField hourWeekJTF;

    private DefaultTableModel dataRegister;
    public HashSet<Professor> collegeProfessor;
    public HashSet<Administrator> collegeAdministrator;
    public HashSet<Intern> collegeIntern;
    public int totalHoursOfWork;

    public exam1UI() {
        initComponents();
        this.initListener();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void initComponents() {

        {
            registerJSPN = new JScrollPane();
            registerJT = new JTable();
            formJPN = new JPanel();
            DNIJLB = new JLabel();
            DNIJTF = new JTextField();
            dateBirthJTF = new JTextField();
            dateBirthJLB = new JLabel();
            lastNameJLB = new JLabel();
            lastNameJTF = new JTextField();
            motherLastNameJLB = new JLabel();
            motherLastNameJTF = new JTextField();
            namesJLB = new JLabel();
            namesJTF = new JTextField();
            workAreaJLB = new JLabel();
            workAreaJTF = new JTextField();
            workerCodeJLB = new JLabel();
            workerCodeJTF = new JTextField();
            salaryJLB = new JLabel();
            salaryJTF = new JTextField();
            hourWeekJLB = new JLabel();
            hourWeekJTF = new JTextField();
            addJLB = new JLabel();
            abstractBannerJLB = new JLabel();
            totalHourJLB = new JLabel();
        }
        collegeProfessor = new HashSet<Professor>();
        collegeAdministrator = new HashSet<Administrator>();
        collegeIntern = new HashSet<Intern>();
        totalHoursOfWork = 0;

        Object[][] data = new Object[][] {};
        String[] nombreDeColumnas = new String[] {
                "DNI", "Date of birth", "Last name", "Mother's last name", "Names", "Work area", "Worker Code",
                "Salary",
                "Hours per week"
        };
        dataRegister = new DefaultTableModel(data, nombreDeColumnas) {
            Class[] types = new Class[] {
                    java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class,
                    java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class,
                    java.lang.Integer.class
            };
            boolean[] canEdit = new boolean[] {
                    false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };
        registerJT.setModel(dataRegister);
        registerJSPN.setViewportView(registerJT);

        DNIJLB.setText("DNI");

        dateBirthJLB.setText("Date of birth");

        lastNameJLB.setText("Last name");

        motherLastNameJLB.setText("Mother's last name");

        namesJLB.setText("Names");

        workAreaJLB.setText("Work area");

        workerCodeJLB.setText("Worker Code");

        salaryJLB.setText("Salary");

        hourWeekJLB.setText("Hours per week");

        addJLB.setIcon(new ImageIcon(getClass().getResource("./assets/agregar.png"))); // NOI18N
        addJLB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        {
            GroupLayout jPanel1Layout = new GroupLayout(formJPN);
            formJPN.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                    jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                            .addComponent(namesJLB, GroupLayout.PREFERRED_SIZE, 79,
                                                    GroupLayout.PREFERRED_SIZE)
                                            .addComponent(DNIJLB, GroupLayout.PREFERRED_SIZE, 79,
                                                    GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lastNameJLB, GroupLayout.PREFERRED_SIZE, 79,
                                                    GroupLayout.PREFERRED_SIZE)
                                            .addComponent(dateBirthJLB, GroupLayout.PREFERRED_SIZE, 104,
                                                    GroupLayout.PREFERRED_SIZE)
                                            .addComponent(motherLastNameJLB, GroupLayout.PREFERRED_SIZE, 157,
                                                    GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                            .addComponent(DNIJTF, GroupLayout.PREFERRED_SIZE, 173,
                                                    GroupLayout.PREFERRED_SIZE)
                                            .addComponent(dateBirthJTF, GroupLayout.PREFERRED_SIZE, 173,
                                                    GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lastNameJTF, GroupLayout.PREFERRED_SIZE, 173,
                                                    GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGroup(jPanel1Layout
                                                            .createParallelGroup(GroupLayout.Alignment.LEADING)
                                                            .addComponent(namesJTF, GroupLayout.PREFERRED_SIZE, 173,
                                                                    GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(motherLastNameJTF, GroupLayout.PREFERRED_SIZE,
                                                                    173,
                                                                    GroupLayout.PREFERRED_SIZE))
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 51,
                                                            Short.MAX_VALUE)
                                                    .addComponent(addJLB)))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                            .addComponent(salaryJLB, GroupLayout.PREFERRED_SIZE, 79,
                                                    GroupLayout.PREFERRED_SIZE)
                                            .addComponent(workAreaJLB, GroupLayout.PREFERRED_SIZE, 79,
                                                    GroupLayout.PREFERRED_SIZE)
                                            .addComponent(hourWeekJLB, GroupLayout.PREFERRED_SIZE, 142,
                                                    GroupLayout.PREFERRED_SIZE)
                                            .addComponent(workerCodeJLB, GroupLayout.PREFERRED_SIZE, 132,
                                                    GroupLayout.PREFERRED_SIZE))
                                    .addGap(29, 29, 29)
                                    .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                            .addComponent(hourWeekJTF, GroupLayout.PREFERRED_SIZE, 173,
                                                    GroupLayout.PREFERRED_SIZE)
                                            .addComponent(salaryJTF, GroupLayout.PREFERRED_SIZE, 173,
                                                    GroupLayout.PREFERRED_SIZE)
                                            .addComponent(workerCodeJTF, GroupLayout.PREFERRED_SIZE, 173,
                                                    GroupLayout.PREFERRED_SIZE)
                                            .addComponent(workAreaJTF, GroupLayout.PREFERRED_SIZE, 173,
                                                    GroupLayout.PREFERRED_SIZE))
                                    .addGap(40, 40, 40)));
            jPanel1Layout.setVerticalGroup(
                    jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                            .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout
                                                    .createSequentialGroup()
                                                    .addComponent(DNIJTF)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(dateBirthJTF)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(lastNameJTF, GroupLayout.PREFERRED_SIZE, 45,
                                                            GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(motherLastNameJTF, GroupLayout.PREFERRED_SIZE, 45,
                                                            GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(namesJTF, GroupLayout.PREFERRED_SIZE, 45,
                                                            GroupLayout.PREFERRED_SIZE))
                                            .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout
                                                    .createSequentialGroup()
                                                    .addGroup(jPanel1Layout
                                                            .createParallelGroup(GroupLayout.Alignment.LEADING)
                                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                                    .addComponent(DNIJLB, GroupLayout.PREFERRED_SIZE,
                                                                            45,
                                                                            GroupLayout.PREFERRED_SIZE)
                                                                    .addPreferredGap(
                                                                            LayoutStyle.ComponentPlacement.RELATED,
                                                                            GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                    .addComponent(dateBirthJLB,
                                                                            GroupLayout.PREFERRED_SIZE, 45,
                                                                            GroupLayout.PREFERRED_SIZE)
                                                                    .addGap(18, 18, 18)
                                                                    .addComponent(lastNameJLB,
                                                                            GroupLayout.PREFERRED_SIZE, 45,
                                                                            GroupLayout.PREFERRED_SIZE)
                                                                    .addGap(18, 18, 18)
                                                                    .addComponent(motherLastNameJLB,
                                                                            GroupLayout.PREFERRED_SIZE, 45,
                                                                            GroupLayout.PREFERRED_SIZE))
                                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                                    .addGroup(jPanel1Layout
                                                                            .createParallelGroup(
                                                                                    GroupLayout.Alignment.TRAILING)
                                                                            .addGroup(jPanel1Layout
                                                                                    .createSequentialGroup()
                                                                                    .addComponent(workAreaJLB,
                                                                                            GroupLayout.PREFERRED_SIZE,
                                                                                            45,
                                                                                            GroupLayout.PREFERRED_SIZE)
                                                                                    .addGap(63, 63, 63))
                                                                            .addComponent(workerCodeJLB,
                                                                                    GroupLayout.PREFERRED_SIZE, 45,
                                                                                    GroupLayout.PREFERRED_SIZE))
                                                                    .addGap(18, 18, 18)
                                                                    .addComponent(salaryJLB, GroupLayout.PREFERRED_SIZE,
                                                                            45,
                                                                            GroupLayout.PREFERRED_SIZE)
                                                                    .addGap(18, 18, 18)
                                                                    .addComponent(hourWeekJLB,
                                                                            GroupLayout.PREFERRED_SIZE, 45,
                                                                            GroupLayout.PREFERRED_SIZE)))
                                                    .addGap(18, 18, 18)
                                                    .addComponent(namesJLB, GroupLayout.PREFERRED_SIZE, 45,
                                                            GroupLayout.PREFERRED_SIZE))
                                            .addGroup(GroupLayout.Alignment.TRAILING,
                                                    jPanel1Layout.createSequentialGroup()
                                                            .addGap(0, 0, Short.MAX_VALUE)
                                                            .addComponent(addJLB))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGroup(jPanel1Layout
                                                            .createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                                    .addComponent(workAreaJTF,
                                                                            GroupLayout.PREFERRED_SIZE, 45,
                                                                            GroupLayout.PREFERRED_SIZE)
                                                                    .addGap(63, 63, 63))
                                                            .addComponent(workerCodeJTF, GroupLayout.PREFERRED_SIZE, 45,
                                                                    GroupLayout.PREFERRED_SIZE))
                                                    .addGap(18, 18, 18)
                                                    .addComponent(salaryJTF, GroupLayout.PREFERRED_SIZE, 45,
                                                            GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(hourWeekJTF, GroupLayout.PREFERRED_SIZE, 45,
                                                            GroupLayout.PREFERRED_SIZE)
                                                    .addGap(0, 0, Short.MAX_VALUE)))
                                    .addContainerGap()));

            abstractBannerJLB.setText("Total hours staff work at the university at week: ");

            totalHourJLB.setText("0");

            GroupLayout layout = new GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                    layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                            .addComponent(formJPN, GroupLayout.Alignment.TRAILING,
                                                    GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(registerJSPN, GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                    .addComponent(abstractBannerJLB)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(totalHourJLB, GroupLayout.PREFERRED_SIZE, 28,
                                                            GroupLayout.PREFERRED_SIZE)
                                                    .addGap(0, 0, Short.MAX_VALUE)))
                                    .addContainerGap()));
            layout.setVerticalGroup(
                    layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(formJPN, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
                                            GroupLayout.PREFERRED_SIZE)
                                    .addGap(47, 47, 47)
                                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                            .addComponent(abstractBannerJLB, GroupLayout.DEFAULT_SIZE,
                                                    GroupLayout.DEFAULT_SIZE,
                                                    Short.MAX_VALUE)
                                            .addComponent(totalHourJLB, GroupLayout.DEFAULT_SIZE,
                                                    GroupLayout.DEFAULT_SIZE,
                                                    Short.MAX_VALUE))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(registerJSPN, GroupLayout.PREFERRED_SIZE, 316,
                                            GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap()));
            pack();
        }
    }

    public void initListener() {
        addJLB.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int workarea = Integer.parseInt(workAreaJTF.getText());
                ENWorkArea area = ENWorkArea.valueOf(workarea);
                int hoursPerWeek = Integer.parseInt(hourWeekJTF.getText());
                double salary = Double.parseDouble(salaryJTF.getText());
                Staff staff = new Staff() {
                };
                staff.setDNI(DNIJTF.getText());
                staff.setDateOfBirth(dateBirthJTF.getText());
                staff.setLastName(lastNameJTF.getText());
                staff.setMotherLastName(motherLastNameJTF.getText());
                staff.setNames(namesJTF.getText());
                staff.setWorkerCode(workerCodeJTF.getText());
                staff.setWorkArea(area);
                staff.setSalary(salary);
                totalHoursOfWork += hoursPerWeek;
                staff.setHoursPerWeek(hoursPerWeek);
                if (area == ENWorkArea.PROFESSOR) {
                    Professor p = new Professor(staff);
                    collegeProfessor.add(p);
                }
                if (area == ENWorkArea.ADMINISTRATOR) {
                    Administrator a = new Administrator(staff);
                    collegeAdministrator.add(a);
                }
                if (area == ENWorkArea.INTERN) {
                    Intern i = new Intern(staff);
                    collegeIntern.add(i);
                }
                dataRegister.addRow(new Object[] {
                        staff.getDNI(),
                        staff.getDateOfBirth(),
                        staff.getLastName(),
                        staff.getMotherLastName(),
                        staff.getNames(),
                        staff.getWorkArea_TXT(),
                        staff.getWorkerCode(),
                        staff.getSalary(),
                        staff.getHoursPerWeek(),
                });
                totalHourJLB.setText(String.valueOf(totalHoursOfWork));
                workAreaJTF.setText("");
                hourWeekJTF.setText("");
                salaryJTF.setText("");
                DNIJTF.setText("");
                dateBirthJTF.setText("");
                lastNameJTF.setText("");
                motherLastNameJTF.setText("");
                namesJTF.setText("");
                workerCodeJTF.setText("");
            }
        });

    }

    public static void main(String args[]) {
        exam1UI window = new exam1UI();
        window.setVisible(true);
    }

}
