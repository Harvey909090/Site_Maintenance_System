package Main_Frame;

import Salary.SalarySlip;
import Site.Site_Panel;
import Login.AddNewLogin;
import Login.Login;
import New_Engineer_Pane.NewEngineerPane;
import Search_Engineer.SearchEngineer;
import Update.UpdatePanel;

public class MainOfficeManagement extends javax.swing.JFrame {

    Login login=null;
    FontPanel fontPanel = null;
    NewEngineerPane newEngineer = null;
    SearchEngineer searchEngineer = null;
    Site_Panel Site = null;
    SalarySlip salary = null;
    UpdatePanel updatePanel = null;
    AddNewLogin loginPanel = null;
    
    public MainOfficeManagement(Login login, String userName) {
        this.login = login;
        initComponents();
        loadPanels();
        usernameLabel.setText("Username: "+userName);
        fontPanel.setVisible(true);
    }    
    
    private void loadPanels()
    {
        // Add New Login        
        loginPanel = new AddNewLogin();
        backbonePanel.add(loginPanel);
        loginPanel.setSize(1349, 675);
        
        //font_panel
        fontPanel = new FontPanel();
        backbonePanel.add(fontPanel);
        fontPanel.setSize(1349, 675);
        
        //new_employee
        newEngineer = new NewEngineerPane();
        backbonePanel.add(newEngineer);
        newEngineer.setSize(1359, 675);
        
        //search_employee
        searchEngineer = new SearchEngineer();
        backbonePanel.add(searchEngineer);
        searchEngineer.setSize(1349, 675);
        
        //dailyWork_panel
        Site = new Site_Panel();
        backbonePanel.add(Site);
        Site.setSize(1349, 675);
        
        //salary_Slip
        salary = new SalarySlip();
        backbonePanel.add(salary);
        salary.setSize(1349, 675);
        
        //update_panel
        updatePanel = new UpdatePanel();
        backbonePanel.add(updatePanel);
        updatePanel.setSize(1349, 675);
        
        hidePanels();
    }
    
    private void hidePanels()
    {
        newEngineer.setVisible(false);
        searchEngineer.setVisible(false);
        Site.setVisible(false);
        salary.setVisible(false);
        updatePanel.setVisible(false);
        fontPanel.setVisible(false);
        loginPanel.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        backbonePanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        newEmployeeButton = new javax.swing.JButton();
        searchEmployeeButton = new javax.swing.JButton();
        workButton = new javax.swing.JButton();
        salarySlipsButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        goBackButton = new javax.swing.JButton();
        LoginButton = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Sitka Text", 1, 32)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gamemarkstudio/images/1.png"))); // NOI18N
        jLabel1.setToolTipText("Home");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("SITE MANAGEMENT SYSTEM");

        usernameLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        usernameLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        usernameLabel.setText("Username_Here");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 102));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        backbonePanel.setBackground(new java.awt.Color(255, 255, 255));
        backbonePanel.setName(""); // NOI18N

        javax.swing.GroupLayout backbonePanelLayout = new javax.swing.GroupLayout(backbonePanel);
        backbonePanel.setLayout(backbonePanelLayout);
        backbonePanelLayout.setHorizontalGroup(
            backbonePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1005, Short.MAX_VALUE)
        );
        backbonePanelLayout.setVerticalGroup(
            backbonePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        newEmployeeButton.setBackground(new java.awt.Color(255, 255, 255));
        newEmployeeButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        newEmployeeButton.setText("New Engineer");
        newEmployeeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        newEmployeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newEmployeeButtonActionPerformed(evt);
            }
        });

        searchEmployeeButton.setBackground(new java.awt.Color(255, 255, 255));
        searchEmployeeButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        searchEmployeeButton.setText("Search Engineer");
        searchEmployeeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchEmployeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchEmployeeButtonActionPerformed(evt);
            }
        });

        workButton.setBackground(new java.awt.Color(255, 255, 255));
        workButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        workButton.setText("Site");
        workButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        workButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                workButtonActionPerformed(evt);
            }
        });

        salarySlipsButton.setBackground(new java.awt.Color(255, 255, 255));
        salarySlipsButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        salarySlipsButton.setText("Salary");
        salarySlipsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salarySlipsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salarySlipsButtonActionPerformed(evt);
            }
        });

        updateButton.setBackground(new java.awt.Color(255, 255, 255));
        updateButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        updateButton.setText("Update");
        updateButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        goBackButton.setBackground(new java.awt.Color(255, 255, 255));
        goBackButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        goBackButton.setText("Logout");
        goBackButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        goBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackButtonActionPerformed(evt);
            }
        });

        LoginButton.setBackground(new java.awt.Color(255, 255, 255));
        LoginButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LoginButton.setText("Login");
        LoginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(newEmployeeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchEmployeeButton, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                    .addComponent(workButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(updateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(goBackButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LoginButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(salarySlipsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(newEmployeeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(searchEmployeeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(workButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(salarySlipsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(goBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(125, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(backbonePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 838, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(usernameLabel))))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addComponent(backbonePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 667, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchEmployeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchEmployeeButtonActionPerformed
        hidePanels();
        searchEngineer.setVisible(true);
    }//GEN-LAST:event_searchEmployeeButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        hidePanels();
        updatePanel.setVisible(true);
    }//GEN-LAST:event_updateButtonActionPerformed

    private void goBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackButtonActionPerformed
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_goBackButtonActionPerformed

    private void newEmployeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newEmployeeButtonActionPerformed
        hidePanels();
        newEngineer.setVisible(true);
    }//GEN-LAST:event_newEmployeeButtonActionPerformed

    private void workButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_workButtonActionPerformed
        hidePanels();
        Site.setVisible(true);
    }//GEN-LAST:event_workButtonActionPerformed

    private void salarySlipsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salarySlipsButtonActionPerformed
        hidePanels();
        salary.setVisible(true);
        
    }//GEN-LAST:event_salarySlipsButtonActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        hidePanels();
        fontPanel.setVisible(true);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
       hidePanels();
       loginPanel.setVisible(true);
    }//GEN-LAST:event_LoginButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LoginButton;
    private javax.swing.JPanel backbonePanel;
    private javax.swing.JButton goBackButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton newEmployeeButton;
    private javax.swing.JButton salarySlipsButton;
    private javax.swing.JButton searchEmployeeButton;
    private javax.swing.JButton updateButton;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JButton workButton;
    // End of variables declaration//GEN-END:variables
}