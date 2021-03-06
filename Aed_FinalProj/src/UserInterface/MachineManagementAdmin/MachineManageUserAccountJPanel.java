/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.MachineManagementAdmin;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Kiran
 */
public class MachineManageUserAccountJPanel extends javax.swing.JPanel {

    
    private JPanel container;
    private Enterprise enterprise;

    public MachineManageUserAccountJPanel(JPanel container, Enterprise enterprise) {
        initComponents();
        this.enterprise = enterprise;
        this.container = container;

        popOrganizationComboBox();
        popData();
    }

    public void popOrganizationComboBox() {
        jcbOrg.removeAllItems();

        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            jcbOrg.addItem(organization);
        }
    }

    public void populateEmployeeComboBox(Organization organization) {
        jcbOrgEmp.removeAllItems();

        for (Employee employee : organization.getEmployeeDirectory().getEmployeeList()) {
            jcbOrgEmp.addItem(employee);
        }
    }

    private void populateRoleComboBox(Organization o) {
        jcbRole.removeAllItems();
        for (Role role : o.getSupportedRole()) {
            jcbRole.addItem(role);
        }
    }

    public void popData() {

        DefaultTableModel model = (DefaultTableModel) tblNetwork.getModel();

        model.setRowCount(0);

        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            for (UserAccount ua : organization.getUserAccountDirectory().getUserAccountList()) {
                Object row[] = new Object[2];
                row[0] = ua;
                row[1] = ua.getRole();
                ((DefaultTableModel) tblNetwork.getModel()).addRow(row);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jcbRole = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblCustomername1 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNetwork = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        btnCreateNetwork = new javax.swing.JButton();
        jcbOrg = new javax.swing.JComboBox();
        btnBack = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jcbOrgEmp = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        jcbRole.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(jcbRole);
        jcbRole.setBounds(440, 310, 208, 29);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 153, 0));
        jLabel6.setText("Activity:");
        add(jLabel6);
        jLabel6.setBounds(10, 11, 56, 16);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 0, 51));
        jLabel11.setText("Role");
        add(jLabel11);
        jLabel11.setBounds(380, 320, 27, 15);

        lblCustomername1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblCustomername1.setForeground(new java.awt.Color(0, 102, 0));
        lblCustomername1.setText("User Account");
        add(lblCustomername1);
        lblCustomername1.setBounds(72, 11, 87, 16);

        txtPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(txtPassword);
        txtPassword.setBounds(440, 390, 207, 27);

        tblNetwork.setBackground(new java.awt.Color(204, 255, 204));
        tblNetwork.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tblNetwork.setForeground(new java.awt.Color(102, 0, 102));
        tblNetwork.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "User Name", "Role"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblNetwork);

        add(jScrollPane1);
        jScrollPane1.setBounds(220, 60, 540, 130);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 0, 51));
        jLabel12.setText("Password");
        add(jLabel12);
        jLabel12.setBounds(350, 400, 59, 15);

        btnCreateNetwork.setBackground(new java.awt.Color(0, 153, 153));
        btnCreateNetwork.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnCreateNetwork.setForeground(new java.awt.Color(255, 255, 255));
        btnCreateNetwork.setText("Create User Account");
        btnCreateNetwork.setMaximumSize(new java.awt.Dimension(200, 200));
        btnCreateNetwork.setMinimumSize(new java.awt.Dimension(200, 200));
        btnCreateNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateNetworkActionPerformed(evt);
            }
        });
        add(btnCreateNetwork);
        btnCreateNetwork.setBounds(390, 460, 223, 39);

        jcbOrg.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcbOrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbOrgActionPerformed(evt);
            }
        });
        add(jcbOrg);
        jcbOrg.setBounds(440, 230, 208, 29);

        btnBack.setBackground(new java.awt.Color(0, 153, 153));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("<<");
        btnBack.setMaximumSize(new java.awt.Dimension(200, 200));
        btnBack.setMinimumSize(new java.awt.Dimension(200, 200));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack);
        btnBack.setBounds(10, 480, 55, 39);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 0, 51));
        jLabel8.setText("Organization");
        add(jLabel8);
        jLabel8.setBounds(330, 230, 78, 15);

        txtUserName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtUserName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUserNameKeyPressed(evt);
            }
        });
        add(txtUserName);
        txtUserName.setBounds(440, 350, 207, 27);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 0, 51));
        jLabel9.setText("UserName");
        add(jLabel9);
        jLabel9.setBounds(350, 360, 59, 15);

        jcbOrgEmp.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(jcbOrgEmp);
        jcbOrgEmp.setBounds(440, 270, 208, 29);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 0, 51));
        jLabel10.setText("Employee");
        add(jLabel10);
        jLabel10.setBounds(350, 270, 58, 15);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateNetworkActionPerformed
        // TODO add your handling code here:
        String userName = txtUserName.getText();
        String password = txtPassword.getText();
        if (!((userName.equals("") || (password.equals(""))))) {
            if (EcoSystem.checkIfUsernameIsUnique(userName)) {
                Organization organization = (Organization) jcbOrg.getSelectedItem();
                Employee employee = (Employee) jcbOrgEmp.getSelectedItem();
                Role role = (Role) jcbRole.getSelectedItem();

                organization.getUserAccountDirectory().createUserAccount(userName, password, employee, role);

                popData();
            } else {
                JOptionPane.showMessageDialog(null, "Please enter unique username", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Enter value", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnCreateNetworkActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtUserNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserNameKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtUserNameKeyPressed

    private void jcbOrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbOrgActionPerformed
        // TODO add your handling code here:
        Organization org = (Organization) jcbOrg.getSelectedItem();
        if (org != null) {
            populateEmployeeComboBox(org);
            populateRoleComboBox(org);
        }

    }//GEN-LAST:event_jcbOrgActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreateNetwork;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox jcbOrg;
    private javax.swing.JComboBox jcbOrgEmp;
    private javax.swing.JComboBox jcbRole;
    private javax.swing.JLabel lblCustomername1;
    private javax.swing.JTable tblNetwork;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
