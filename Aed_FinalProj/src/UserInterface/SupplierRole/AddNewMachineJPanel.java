/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SupplierRole;

import Business.EcoSystem;
import Business.Machine.Machine;
import Business.Machine.Machine.MachineType;
import Business.Supplier.Supplier;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Komal
 */
public class AddNewMachineJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddNewMachineJPanel
     */
    private JPanel container;
    private EcoSystem business;
    private UserAccount ua;
    private Supplier s;
    public AddNewMachineJPanel(JPanel container,UserAccount ua,Supplier s, EcoSystem business) {
        initComponents();
        this.container = container;
        this.business = business;
        this.ua=ua;
        this.s=s;
        populateMachineType();
        populateSupplierTable();
    }
    
    public void populateMachineType()
    {
        jcbMachineType.removeAllItems();;
        for(MachineType type : Machine.MachineType.values())
        {
            jcbMachineType.addItem(type);
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

        jLabel6 = new javax.swing.JLabel();
        lblCustomername1 = new javax.swing.JLabel();
        txtMachineName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jcbMachineType = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        btnAddMachine = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSupplierMachineDetails = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 0, 0));
        jLabel6.setText("Activity:");
        add(jLabel6);
        jLabel6.setBounds(10, 11, 56, 16);

        lblCustomername1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblCustomername1.setForeground(new java.awt.Color(153, 153, 153));
        lblCustomername1.setText("Add New Machine");
        add(lblCustomername1);
        lblCustomername1.setBounds(72, 11, 114, 16);

        txtMachineName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtMachineName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMachineNameActionPerformed(evt);
            }
        });
        txtMachineName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMachineNameKeyPressed(evt);
            }
        });
        add(txtMachineName);
        txtMachineName.setBounds(155, 76, 285, 27);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 0, 51));
        jLabel9.setText("Machine Name");
        add(jLabel9);
        jLabel9.setBounds(10, 81, 87, 15);

        jcbMachineType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(jcbMachineType);
        jcbMachineType.setBounds(155, 35, 178, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 0, 51));
        jLabel11.setText("Machine Type");
        add(jLabel11);
        jLabel11.setBounds(10, 47, 83, 15);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 0, 51));
        jLabel12.setText("Quantity");
        add(jLabel12);
        jLabel12.setBounds(10, 119, 54, 15);

        txtQuantity.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantityActionPerformed(evt);
            }
        });
        txtQuantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtQuantityKeyPressed(evt);
            }
        });
        add(txtQuantity);
        txtQuantity.setBounds(155, 114, 285, 27);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 0, 51));
        jLabel13.setText("Unit Price");
        add(jLabel13);
        jLabel13.setBounds(10, 152, 58, 15);

        txtPrice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceActionPerformed(evt);
            }
        });
        txtPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPriceKeyPressed(evt);
            }
        });
        add(txtPrice);
        txtPrice.setBounds(155, 147, 285, 27);

        btnAddMachine.setBackground(new java.awt.Color(0, 153, 153));
        btnAddMachine.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnAddMachine.setForeground(new java.awt.Color(255, 255, 255));
        btnAddMachine.setText("Add Machine");
        btnAddMachine.setMaximumSize(new java.awt.Dimension(200, 200));
        btnAddMachine.setMinimumSize(new java.awt.Dimension(200, 200));
        btnAddMachine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddMachineActionPerformed(evt);
            }
        });
        add(btnAddMachine);
        btnAddMachine.setBounds(210, 200, 170, 40);

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
        btnBack.setBounds(10, 448, 55, 39);

        tblSupplierMachineDetails.setBackground(new java.awt.Color(204, 255, 204));
        tblSupplierMachineDetails.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tblSupplierMachineDetails.setForeground(new java.awt.Color(102, 0, 102));
        tblSupplierMachineDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Machine", "Code", "Quantity", "Unit Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblSupplierMachineDetails);

        add(jScrollPane1);
        jScrollPane1.setBounds(90, 300, 641, 142);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(153, 0, 51));
        jLabel14.setText("Machine Catalog");
        add(jLabel14);
        jLabel14.setBounds(90, 280, 101, 15);
    }// </editor-fold>//GEN-END:initComponents

    private void txtMachineNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMachineNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMachineNameActionPerformed

    private void txtMachineNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMachineNameKeyPressed
        // TODO add your handling code here:
        int key = evt.getKeyCode();
        if ((key >= evt.VK_0 && key <= evt.VK_9) || (key >= evt.VK_NUMPAD0 && key <= evt.VK_NUMPAD9)) {
            txtMachineName.setEditable(false);
            txtMachineName.setBackground(Color.red);
        } else {
            txtMachineName.setEditable(true);
            txtMachineName.setBackground(Color.WHITE);
        }

    }//GEN-LAST:event_txtMachineNameKeyPressed

    private void txtQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantityActionPerformed

    private void txtQuantityKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQuantityKeyPressed
        // TODO add your handling code here:
        
        int key = evt.getKeyCode();
        if ((key >= evt.VK_0 && key <= evt.VK_9) || (key >= evt.VK_NUMPAD0 && key <= evt.VK_NUMPAD9) || (key == evt.VK_BACK_SPACE)) {
            txtQuantity.setEditable(true);
            txtQuantity.setBackground(Color.white);
        } else {
            txtQuantity.setEditable(false);
            txtQuantity.setBackground(Color.red);
        }
    }//GEN-LAST:event_txtQuantityKeyPressed

    private void txtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceActionPerformed

    private void txtPriceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPriceKeyPressed
        // TODO add your handling code here:
        
        int key = evt.getKeyCode();
        if ((key >= evt.VK_0 && key <= evt.VK_9) || (key >= evt.VK_NUMPAD0 && key <= evt.VK_NUMPAD9) || (key == evt.VK_BACK_SPACE)) {
            txtPrice.setEditable(true);
            txtPrice.setBackground(Color.white);
        } else {
            txtPrice.setEditable(false);
            txtPrice.setBackground(Color.red);
        }
    }//GEN-LAST:event_txtPriceKeyPressed

    public void populateSupplierTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblSupplierMachineDetails.getModel();
        dtm.setRowCount(0);
        for (Machine m : s.getMachineList().getMachineCatalog()) {
            Object row[] = new Object[4];
            row[0] = m.getName();
            row[1] = m.getCode();
            row[2] = m.getQuantity();
            row[3] = m.getPrice();

            dtm.addRow(row);
        }
    }
    private void btnAddMachineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMachineActionPerformed
    
        
        String machineName = txtMachineName.getText();
        String qty = txtQuantity.getText();
        String price = txtPrice.getText();
        Machine.MachineType type = (Machine.MachineType) jcbMachineType.getSelectedItem();

        int temp = 0;

        if (type == null) {
            JOptionPane.showMessageDialog(null, "Please select a machine type");
            return;
        }
        if (!((machineName.equals("") || (qty.equals("")) || (price.equals(""))))) {
            for (Machine m : s.getMachineList().getMachineCatalog()) {
                if (machineName.equals(m.getName())) {
                    temp = 1;
                    m.setQuantity(m.getQuantity() + Integer.parseInt(qty));
                }
            }
            if (temp == 0) {
                Machine m = s.getMachineList().addMachine();
                m.setName(machineName);
                m.setQuantity(Integer.parseInt(qty));
                m.setPrice(Integer.parseInt(price));
                m.setType(type.getValue());
                Date today = new Date();
                DateFormat oDateFormat = new SimpleDateFormat("MM-dd-yyyy");
                String todayDate = oDateFormat.format(today);
                m.setDateOfEntry(today);
                m.setDateOfEntryInString(todayDate);
            }
            populateSupplierTable();
            txtMachineName.setText("");
            txtPrice.setText("");
            txtQuantity.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Please input value");
        }
    }//GEN-LAST:event_btnAddMachineActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout)container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddMachine;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox jcbMachineType;
    private javax.swing.JLabel lblCustomername1;
    private javax.swing.JTable tblSupplierMachineDetails;
    private javax.swing.JTextField txtMachineName;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtQuantity;
    // End of variables declaration//GEN-END:variables
}
