
package view;

import controller.SpendSmartController;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.statistics.HistogramDataset;


public class SpendSmartApp extends javax.swing.JFrame {
    String username;
    public SpendSmartApp() {
        initComponents();
        showPieChart();
    }
    public SpendSmartApp(String name) {
        initComponents();
        showPieChart();
        this.username = name;
        nameText.setText("Welcome, "+ name);
        showUser(name);
        showExpences(name);
        welcomeUser(name);
    }

    public void showPieChart() {

        // create dataset
        DefaultPieDataset barDataset = new DefaultPieDataset();
        barDataset.setValue("Need", new Double(50));
        barDataset.setValue("Want", new Double(30));
        barDataset.setValue("Savings", new Double(20));

        // create chart
        JFreeChart piechart = ChartFactory.createPieChart("Your Expences Should Look Like This:", barDataset, false, true, false);
        PiePlot piePlot = (PiePlot) piechart.getPlot();

        // changing pie chart blocks colors
        piePlot.setSectionPaint("a", new Color(92, 158, 173));
        piePlot.setBackgroundPaint(new Color(92, 158, 173));

        // create chartPanel to display chart(graph)
        ChartPanel barChartPanel = new ChartPanel(piechart);
        panelBarChart.removeAll();
        panelBarChart.add(barChartPanel, BorderLayout.CENTER);
        panelBarChart.validate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nameText = new javax.swing.JLabel();
        tabHome = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        tabProfile = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        tabReport = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        tabLogout = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        report = new javax.swing.JPanel();
        panelBarChart = new javax.swing.JPanel();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        monthText = new com.toedter.calendar.JMonthChooser();
        jLabel14 = new javax.swing.JLabel();
        updateChargeBtn = new javax.swing.JButton();
        balanceText = new javax.swing.JFormattedTextField();
        monthlyBudgetText = new javax.swing.JFormattedTextField();
        savings = new javax.swing.JFormattedTextField();
        enterChargeBtn = new javax.swing.JButton();
        showExpensesBtn = new javax.swing.JButton();
        profile = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        firstNameText = new javax.swing.JTextField();
        lastNameText = new javax.swing.JTextField();
        usernameText = new javax.swing.JTextField();
        currentPasswordText = new javax.swing.JPasswordField();
        confirmPasswordText = new javax.swing.JPasswordField();
        newPasswordText = new javax.swing.JPasswordField();
        updateBtn = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        emailText = new javax.swing.JTextField();
        home = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        expenceText = new javax.swing.JTextField();
        descriptionText = new javax.swing.JTextField();
        typeComboBox = new javax.swing.JComboBox<>();
        addBtn = new javax.swing.JButton();
        modifyBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        dateText = new com.toedter.calendar.JDateChooser();
        welcomeHome = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(91, 158, 173));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/resources/SPEND SMART LONG.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/resources/user.png"))); // NOI18N

        nameText.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        nameText.setText("user ");

        tabHome.setBackground(new java.awt.Color(141, 185, 214));
        tabHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabHomeMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel3.setText("Home");

        javax.swing.GroupLayout tabHomeLayout = new javax.swing.GroupLayout(tabHome);
        tabHome.setLayout(tabHomeLayout);
        tabHomeLayout.setHorizontalGroup(
            tabHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabHomeLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(131, 131, 131))
        );
        tabHomeLayout.setVerticalGroup(
            tabHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabHomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabProfile.setBackground(new java.awt.Color(141, 185, 214));
        tabProfile.setPreferredSize(new java.awt.Dimension(112, 47));
        tabProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabProfileMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel4.setText("Profile");

        javax.swing.GroupLayout tabProfileLayout = new javax.swing.GroupLayout(tabProfile);
        tabProfile.setLayout(tabProfileLayout);
        tabProfileLayout.setHorizontalGroup(
            tabProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabProfileLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tabProfileLayout.setVerticalGroup(
            tabProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabProfileLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabReport.setBackground(new java.awt.Color(141, 185, 214));
        tabReport.setPreferredSize(new java.awt.Dimension(112, 47));
        tabReport.setRequestFocusEnabled(false);
        tabReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabReportMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel5.setText("Report");

        javax.swing.GroupLayout tabReportLayout = new javax.swing.GroupLayout(tabReport);
        tabReport.setLayout(tabReportLayout);
        tabReportLayout.setHorizontalGroup(
            tabReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabReportLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(125, 125, 125))
        );
        tabReportLayout.setVerticalGroup(
            tabReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabReportLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabLogout.setBackground(new java.awt.Color(141, 185, 214));
        tabLogout.setPreferredSize(new java.awt.Dimension(112, 47));
        tabLogout.setRequestFocusEnabled(false);
        tabLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabLogoutMouseClicked(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel23.setText("Log Out");

        javax.swing.GroupLayout tabLogoutLayout = new javax.swing.GroupLayout(tabLogout);
        tabLogout.setLayout(tabLogoutLayout);
        tabLogoutLayout.setHorizontalGroup(
            tabLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabLogoutLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(115, 115, 115))
        );
        tabLogoutLayout.setVerticalGroup(
            tabLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabLogoutLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tabHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tabProfile, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
            .addComponent(tabReport, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
            .addComponent(tabLogout, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(60, 60, 60)))
                .addGap(39, 39, 39))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(68, 68, 68))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabProfile, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabReport, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabLogout, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                .addGap(185, 185, 185))
        );

        report.setBackground(new java.awt.Color(141, 185, 214));
        report.setPreferredSize(new java.awt.Dimension(1000, 500));

        panelBarChart.setBackground(new java.awt.Color(49, 97, 114));
        panelBarChart.setPreferredSize(new java.awt.Dimension(300, 300));
        panelBarChart.setLayout(new java.awt.BorderLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/resources/4dd08877-ee28-4402-a3a9-85f1c2bc44a8.png"))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel11.setText("Balance:");

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel12.setText("Monthly Budget:");

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel13.setText("Savings:");

        monthText.setPreferredSize(new java.awt.Dimension(200, 20));

        jLabel14.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel14.setText("Month:");

        updateChargeBtn.setBackground(new java.awt.Color(49, 97, 114));
        updateChargeBtn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        updateChargeBtn.setText("Update");
        updateChargeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateChargeBtnActionPerformed(evt);
            }
        });

        balanceText.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));

        monthlyBudgetText.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));

        savings.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));

        enterChargeBtn.setBackground(new java.awt.Color(49, 97, 114));
        enterChargeBtn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        enterChargeBtn.setText("Enter");
        enterChargeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterChargeBtnActionPerformed(evt);
            }
        });

        showExpensesBtn.setBackground(new java.awt.Color(49, 97, 114));
        showExpensesBtn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        showExpensesBtn.setText("Show Months Expenses!");
        showExpensesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showExpensesBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout reportLayout = new javax.swing.GroupLayout(report);
        report.setLayout(reportLayout);
        reportLayout.setHorizontalGroup(
            reportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, reportLayout.createSequentialGroup()
                .addGroup(reportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(reportLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelBarChart, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, reportLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(reportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(reportLayout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                                .addGap(149, 149, 149)
                                .addComponent(monthText, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10))
                            .addGroup(reportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(reportLayout.createSequentialGroup()
                                    .addComponent(jLabel12)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(monthlyBudgetText, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(reportLayout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(balanceText, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(reportLayout.createSequentialGroup()
                                    .addComponent(jLabel13)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(savings, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(reportLayout.createSequentialGroup()
                                    .addComponent(updateChargeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(showExpensesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(enterChargeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                        .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        reportLayout.setVerticalGroup(
            reportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(reportLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(reportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                    .addGroup(reportLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(monthText, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(reportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(balanceText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(reportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(monthlyBudgetText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(reportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(savings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(enterChargeBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(reportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(updateChargeBtn)
                    .addGroup(reportLayout.createSequentialGroup()
                        .addComponent(showExpensesBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(1, 1, 1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(reportLayout.createSequentialGroup()
                .addComponent(jCalendar1, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                .addGap(57, 57, 57)
                .addComponent(panelBarChart, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                .addContainerGap())
        );

        profile.setBackground(new java.awt.Color(141, 185, 214));
        profile.setPreferredSize(new java.awt.Dimension(1000, 500));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/resources/undraw_Join_re_w1lh__1_-removebg-preview.png"))); // NOI18N
        jLabel15.setText("jLabel15");

        jLabel16.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabel16.setText("Modify Your Profile Here:");

        jLabel17.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        jLabel17.setText("First Name:");

        jLabel18.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        jLabel18.setText("Last Name:");

        jLabel19.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        jLabel19.setText("Username:");

        jLabel20.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        jLabel20.setText("Current Password:");

        jLabel21.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        jLabel21.setText("New Password:");

        jLabel22.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        jLabel22.setText("Confirm Password:");

        firstNameText.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 12)); // NOI18N
        firstNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameTextActionPerformed(evt);
            }
        });

        lastNameText.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 12)); // NOI18N
        lastNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameTextActionPerformed(evt);
            }
        });

        usernameText.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 12)); // NOI18N
        usernameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTextActionPerformed(evt);
            }
        });

        currentPasswordText.setMinimumSize(new java.awt.Dimension(7, 22));
        currentPasswordText.setPreferredSize(new java.awt.Dimension(7, 22));

        confirmPasswordText.setMinimumSize(new java.awt.Dimension(7, 22));
        confirmPasswordText.setPreferredSize(new java.awt.Dimension(7, 22));
        confirmPasswordText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmPasswordTextActionPerformed(evt);
            }
        });

        newPasswordText.setMinimumSize(new java.awt.Dimension(7, 22));
        newPasswordText.setPreferredSize(new java.awt.Dimension(7, 22));

        updateBtn.setBackground(new java.awt.Color(70, 138, 163));
        updateBtn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        updateBtn.setText("Update!");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        jLabel24.setText("Email:");

        emailText.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 12)); // NOI18N
        emailText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout profileLayout = new javax.swing.GroupLayout(profile);
        profile.setLayout(profileLayout);
        profileLayout.setHorizontalGroup(
            profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profileLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(profileLayout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
                        .addGap(537, 537, 537))
                    .addGroup(profileLayout.createSequentialGroup()
                        .addGroup(profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(updateBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
                            .addGroup(profileLayout.createSequentialGroup()
                                .addGroup(profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(profileLayout.createSequentialGroup()
                                        .addGroup(profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel22)
                                            .addComponent(jLabel20))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(newPasswordText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                                    .addComponent(currentPasswordText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(usernameText, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(emailText, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lastNameText, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(firstNameText, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(confirmPasswordText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(98, 98, 98)))
                        .addGap(219, 219, 219)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 305, Short.MAX_VALUE))))
        );
        profileLayout.setVerticalGroup(
            profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, profileLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel16)
                .addGroup(profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(profileLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(firstNameText))
                    .addGroup(profileLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastNameText))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(profileLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(profileLayout.createSequentialGroup()
                        .addGroup(profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailText))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(profileLayout.createSequentialGroup()
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(profileLayout.createSequentialGroup()
                                .addComponent(usernameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(currentPasswordText, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(newPasswordText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(confirmPasswordText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(47, 47, 47)
                        .addComponent(updateBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(230, 230, 230))))
        );

        home.setBackground(new java.awt.Color(91, 158, 173));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Expences", "Description", "Type", "Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        expenceText.setBackground(new java.awt.Color(91, 158, 173));
        expenceText.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 12)); // NOI18N
        expenceText.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Expences", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI Semibold", 1, 10), new java.awt.Color(255, 255, 255))); // NOI18N

        descriptionText.setBackground(new java.awt.Color(91, 158, 173));
        descriptionText.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 12)); // NOI18N
        descriptionText.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Description", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI Semibold", 1, 10), new java.awt.Color(255, 255, 255))); // NOI18N
        descriptionText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descriptionTextActionPerformed(evt);
            }
        });

        typeComboBox.setBackground(new java.awt.Color(91, 158, 173));
        typeComboBox.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 10)); // NOI18N
        typeComboBox.setForeground(new java.awt.Color(91, 158, 173));
        typeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rent", "Insurance ", "Utilities ", "Transportation ", "Grocery expenses", "Home ", "Travel expenses" }));
        typeComboBox.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Type", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI Semibold", 1, 10))); // NOI18N

        addBtn.setBackground(new java.awt.Color(141, 185, 214));
        addBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/resources/plus.png"))); // NOI18N
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        modifyBtn.setBackground(new java.awt.Color(141, 185, 214));
        modifyBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/resources/modify.png"))); // NOI18N
        modifyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyBtnActionPerformed(evt);
            }
        });

        deleteBtn.setBackground(new java.awt.Color(141, 185, 214));
        deleteBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/resources/delete.png"))); // NOI18N
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        welcomeHome.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 48)); // NOI18N
        welcomeHome.setText("Welcome, User!");

        javax.swing.GroupLayout homeLayout = new javax.swing.GroupLayout(home);
        home.setLayout(homeLayout);
        homeLayout.setHorizontalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(homeLayout.createSequentialGroup()
                        .addComponent(expenceText, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(descriptionText, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(typeComboBox, 0, 178, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateText, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(modifyBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(homeLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(welcomeHome, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        homeLayout.setVerticalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(welcomeHome, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(modifyBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(expenceText)
                        .addComponent(descriptionText)
                        .addComponent(typeComboBox))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homeLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(dateText, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(home, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(report, javax.swing.GroupLayout.DEFAULT_SIZE, 939, Short.MAX_VALUE)))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(profile, javax.swing.GroupLayout.DEFAULT_SIZE, 924, Short.MAX_VALUE)
                    .addGap(15, 15, 15)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(report, javax.swing.GroupLayout.DEFAULT_SIZE, 557, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(profile, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {                                       
                Object date = dateText.getDate();
                String description = descriptionText.getText();
                String type = (String) typeComboBox.getSelectedItem();
                String expense = expenceText.getText();
                SpendSmartController controller = new SpendSmartController();
                if(controller.enterExpense(this.username, expense, description, type, (Date) date) == true) {
                    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                    model.addRow(new Object[]{expense,description,type,date});
                }else {
                    JOptionPane.showMessageDialog(this, "Something went wrong.");
                    Date dateNull = null;
                    dateText.setDate(dateNull);
                    descriptionText.setText("");
                    expenceText.setText("");
                    typeComboBox.setSelectedItem("");
                }
    }                                      

    private void modifyBtnActionPerformed(java.awt.event.ActionEvent evt) {                                          
                int selectedRow = jTable1.getSelectedRow();
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                if (selectedRow != -1) { // Check if a row is selected                 
                   
                    model.setValueAt(expenceText.getText(), selectedRow, 0);
                    model.setValueAt(descriptionText.getText(), selectedRow, 1);
                    model.setValueAt((String) typeComboBox.getSelectedItem(), selectedRow, 2);
                    model.setValueAt(dateText.getDate(), selectedRow, 3);
                }
                
                SpendSmartController controller = new SpendSmartController();
                if(controller.enterExpense(this.username, expenceText.getText(), descriptionText.getText(),(String)typeComboBox.getSelectedItem(), dateText.getDate())) {
                    JOptionPane.showMessageDialog(this, "updated !.");
                }else {
                    JOptionPane.showMessageDialog(this, "Something went wrong.");
                }            
    }                                         

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {                                     
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int selectedRow = jTable1.getSelectedRow();
        String expence = jTable1.getValueAt(selectedRow, 0).toString();
        String description = jTable1.getValueAt(selectedRow, 1).toString(); 
        String type = jTable1.getValueAt(selectedRow, 2).toString();                      
        Object dateObj = jTable1.getValueAt(selectedRow, 3); 
        
        descriptionText.setText(description);
        typeComboBox.setSelectedItem(type);
        expenceText.setText(expence);
    }                                    

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {                                          

        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow != -1) { 
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.removeRow(selectedRow);
            SpendSmartController controller = new SpendSmartController();
            if(controller.deleteExpense(expenceText.getText(), descriptionText.getText(), (String) typeComboBox.getSelectedItem(), dateText.getDate())){
                JOptionPane.showMessageDialog(this, "Deleted.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
        }
    }                                         

    private void emailTextActionPerformed(java.awt.event.ActionEvent evt) {}                                         
    private void confirmPasswordTextActionPerformed(java.awt.event.ActionEvent evt) {}                                                   
    private void usernameTextActionPerformed(java.awt.event.ActionEvent evt) {}                                            
    private void lastNameTextActionPerformed(java.awt.event.ActionEvent evt) {}                                            
    private void firstNameTextActionPerformed(java.awt.event.ActionEvent evt) {}                                             
    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {                                          

        String firstname = firstNameText.getText();
        String lastname = lastNameText.getText();
        String username = usernameText.getText();
        String email = emailText.getText();
        String currentPassword = new String(currentPasswordText.getPassword());
        String newPassword = new String(newPasswordText.getPassword());
        String confirmPassword = new String(confirmPasswordText.getPassword());
        
        SpendSmartController controller = new SpendSmartController();
        if (firstname == null || firstname.isEmpty()) {JOptionPane.showMessageDialog(this, "First Name is empty.");}
        if (lastname == null || lastname.isEmpty()) {JOptionPane.showMessageDialog(this, "Last Name is empty.");}
        if (username == null || username.isEmpty()) { JOptionPane.showMessageDialog(this, "Username is empty.");}
        if (email == null || email.isEmpty()) {JOptionPane.showMessageDialog(this, "Email is empty.");}
        if (newPassword.equals(confirmPassword)) {JOptionPane.showMessageDialog(this, "passwords are not matching.");}
        if(controller.updateUser(firstname, lastname, this.username,username, email, newPassword)) {
                JOptionPane.showMessageDialog(this, "updated !.");
        }else {
            JOptionPane.showMessageDialog(this, "Something went wrong.");
        }
    }                                         

    private void updateChargeBtnActionPerformed(java.awt.event.ActionEvent evt) {                                                
       Long balanceLong = (Long) balanceText.getValue();
        Long monthlyBudgetLong = (Long) monthlyBudgetText.getValue();

        double balance = balanceLong != null ? balanceLong.doubleValue() : 0.0;
        double monthlyBudget = monthlyBudgetLong != null ? monthlyBudgetLong.doubleValue() : 0.0;
        int month=monthText.getMonth();
        SpendSmartController controller = new SpendSmartController();
        if(controller.updateCharge(this.username, balance, month, monthlyBudget)) {
                JOptionPane.showMessageDialog(this, "updated !.");
        }else {
            JOptionPane.showMessageDialog(this, "Something went wrong.");
        }
    }                                               

    private void enterChargeBtnActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
        Long balanceLong = (Long) balanceText.getValue();
        Long monthlyBudgetLong = (Long) monthlyBudgetText.getValue();

        double balance = balanceLong != null ? balanceLong.doubleValue() : 0.0;
        double monthlyBudget = monthlyBudgetLong != null ? monthlyBudgetLong.doubleValue() : 0.0;
    
        int month=monthText.getMonth();
        SpendSmartController controller = new SpendSmartController();
        if(controller.enterCharge(this.username, balance,monthlyBudget,month) == true) {
            JOptionPane.showMessageDialog(this, "Entered!");
        }else {
            JOptionPane.showMessageDialog(this, "Something went wrong.");
            
        }
    }                                              

    private void showExpensesBtnActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
        int month = monthText.getMonth();
        SpendSmartController controller = new SpendSmartController();
        ResultSet data = controller.fetchReport(this.username,month);
        boolean foundData = false;
        try{
           
        while(data.next()){
            String balance = data.getString("montantCharge");
            String monthlyBudget = data.getString("budgetMensuel");
            
            balanceText.setText(balance);
            monthlyBudgetText.setText(monthlyBudget);  
             foundData = true;
        }
        if (!foundData) {
        JOptionPane.showMessageDialog(this, "No data available for the selected month.");
        }
        }catch(Exception e){
            
        }  
    }                                               
    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt){}
    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt){}
    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt){}
    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt){}
    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt){}
    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt){}
    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt){}
    private void jPasswordField2ActionPerformed(java.awt.event.ActionEvent evt){}
    public void descriptionTextActionPerformed(java.awt.event.ActionEvent evt){}
    public void balanceTextActionPerformed(java.awt.event.ActionEvent evt){}
    public void  monthlyBudgetTextActionPerformed(java.awt.event.ActionEvent evt){}
    public void savingsTextActionPerformed(java.awt.event.ActionEvent evt){}
    

    
    private void tabHomeMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_tabHomeMouseClicked
        // TODO add your handling code here:
        home.setVisible(true);
        report.setVisible(false);
        profile.setVisible(false);
    }// GEN-LAST:event_tabHomeMouseClicked

    private void tabProfileMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_tabProfileMouseClicked
        // TODO add your handling code here:
        home.setVisible(false);
        report.setVisible(false);
        profile.setVisible(true);
    }// GEN-LAST:event_tabProfileMouseClicked

    private void tabReportMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_tabReportMouseClicked
        // TODO add your handling code here:
        home.setVisible(false);
        report.setVisible(true);
        profile.setVisible(false);
    }// GEN-LAST:event_tabReportMouseClicked

    private void tabLogoutMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_tabLogoutMouseClicked
        // TODO add your handling code here:
        Login login = new Login();
        login.show();
        dispose();
    }
    private void showExpences(String username){
        SpendSmartController controller = new SpendSmartController();
        ResultSet data = controller.fetchData(this.username);
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        try{
        while(data.next()){
            String expense = data.getString("montant");
            String description = data.getString("description");
            String type = data.getString("typeExpense");
            Date date = data.getDate("date");
            
            model.addRow(new Object[]{expense,description,type,date});
        }
        }catch(Exception e){
            
        }   
    }
    
    public void showUser(String username){
        SpendSmartController controller = new SpendSmartController();
        ResultSet data = controller.fetchUser(this.username);
        try{
        while(data.next()){
            String firstName = data.getString("prenom");
            String lastName = data.getString("nom");
            String oldUsername = data.getString("username");
            String email = data.getString("email");
            String password = data.getString("password");
            
            firstNameText.setText(firstName);
            lastNameText.setText(lastName);
            usernameText.setText(oldUsername);
            emailText.setText(email);
            usernameText.setText(username);
            currentPasswordText.setText(password);
        }
        }catch(Exception e){
            
        }  
    }
    public void welcomeUser(String username){
        SpendSmartController controller = new SpendSmartController();
        ResultSet data = controller.fetchUser(this.username);
        try{
        while(data.next()){
            String firstName = data.getString("prenom");
            String lastName = data.getString("nom");
            welcomeHome.setText("Welcome, "+firstName+"\u0020"+ lastName + "!");
              
        }
        }catch(Exception e){
        } 
        
    }
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SpendSmartApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SpendSmartApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SpendSmartApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SpendSmartApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SpendSmartApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton addBtn;
    private javax.swing.JFormattedTextField balanceText;
    private javax.swing.JPasswordField confirmPasswordText;
    private javax.swing.JPasswordField currentPasswordText;
    private com.toedter.calendar.JDateChooser dateText;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTextField descriptionText;
    private javax.swing.JTextField emailText;
    private javax.swing.JButton enterChargeBtn;
    private javax.swing.JTextField expenceText;
    private javax.swing.JTextField firstNameText;
    private javax.swing.JPanel home;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField lastNameText;
    private javax.swing.JButton modifyBtn;
    private com.toedter.calendar.JMonthChooser monthText;
    private javax.swing.JFormattedTextField monthlyBudgetText;
    private javax.swing.JLabel nameText;
    private javax.swing.JPasswordField newPasswordText;
    private javax.swing.JPanel panelBarChart;
    private javax.swing.JPanel profile;
    private javax.swing.JPanel report;
    private javax.swing.JFormattedTextField savings;
    private javax.swing.JButton showExpensesBtn;
    private javax.swing.JPanel tabHome;
    private javax.swing.JPanel tabLogout;
    private javax.swing.JPanel tabProfile;
    private javax.swing.JPanel tabReport;
    private javax.swing.JComboBox<String> typeComboBox;
    private javax.swing.JButton updateBtn;
    private javax.swing.JButton updateChargeBtn;
    private javax.swing.JTextField usernameText;
    private javax.swing.JLabel welcomeHome;
    // End of variables declaration                   
}
