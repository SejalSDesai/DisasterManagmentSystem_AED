/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.VolunteerOrganization;
import UI.EventMakerWorkArea.*;
import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.EventMaker.EventMaker;
import Business.Organization.EventMakerOrganization;
import Business.Organization.Organization;
import Business.Organization.VolunteerOrganization;
import Business.UserAccount.UserAccount;
import Business.Volunteer.Volunteer;
import Business.WorkQueue.NGOWorkRequest;
import Business.WorkQueue.VictimWorkRequest;
import Business.WorkQueue.WorkQueue;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ruchi
 */
public class DashboardVolunteer extends javax.swing.JPanel {

    /**
     * Creates new form DashboardVolunteer
     */
     private JPanel userProcessContainer;
    private UserAccount account;
    private Organization organization;
    private Enterprise enterprise;
    private Ecosystem system;
    private Volunteer vm;
    
    public DashboardVolunteer(JPanel userProcessContainer,UserAccount account,Organization organization,Enterprise enterprise,Ecosystem system) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.account=account;
        this.organization=organization;
        this.enterprise=enterprise;
        this.system=system;
    
    for (Volunteer volunteer:((VolunteerOrganization)organization).getVolunteerList().getvolList())
        {
            if (account.getEmployee().getempName().equals(volunteer.getvolName())) {
                 vm=volunteer;
                 
                System.out.println("Volunteer Name" + vm.getvolName());
            }
            
        }
        
        
            if(vm.getWorkqueue()== null){
            WorkQueue w = new WorkQueue();
            vm.setWorkqueue(w);
            
        }
        populateTableEvent();
    }
    
    public void populateTableEvent()
    {
         DefaultTableModel model = (DefaultTableModel) tblEventNGO.getModel();
        
        model.setRowCount(0);
        
        
        for (WorkRequest work : system.getWorkQueue().getWorkRequestList()){
           if(work instanceof NGOWorkRequest){ 
            Object[] row = new Object[10];
            row[0] = work;
            row[1] = ((NGOWorkRequest) work).getDescription();
            row[2] =  work.getRequestDate();
            row[3] = ((NGOWorkRequest) work).getLocation();
            row[4] = ((NGOWorkRequest) work).getvRequired();
            row[5] =  ((NGOWorkRequest) work).getvAcquired();
            
            model.addRow(row);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDesc = new javax.swing.JTextArea();
        txtLoc = new javax.swing.JTextField();
        txtTitle = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtVolunteer = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEventNGO = new javax.swing.JTable();
        btnJoinEvent = new javax.swing.JButton();
        btnView = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Volunteer Dashboard");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, 0))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "View", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 0, 24))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setOpaque(false);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Title");

        txtDesc.setColumns(20);
        txtDesc.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtDesc.setRows(5);
        txtDesc.setEnabled(false);
        jScrollPane2.setViewportView(txtDesc);

        txtLoc.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtLoc.setForeground(new java.awt.Color(153, 0, 153));
        txtLoc.setEnabled(false);

        txtTitle.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtTitle.setForeground(new java.awt.Color(153, 0, 153));
        txtTitle.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Location");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Description");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Date");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Volunteer Required");

        txtVolunteer.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtVolunteer.setForeground(new java.awt.Color(153, 0, 153));
        txtVolunteer.setEnabled(false);

        txtDate.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtDate.setForeground(new java.awt.Color(153, 0, 153));
        txtDate.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtTitle, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtLoc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)))
                .addGap(98, 98, 98)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtVolunteer, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                    .addComponent(txtDate))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtVolunteer, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtLoc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        tblEventNGO.setBackground(new java.awt.Color(204, 204, 204));
        tblEventNGO.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblEventNGO.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Event Name", "Description", "Location", "Date", "Volunteer Required", "Volunteer acquired"
            }
        ));
        jScrollPane1.setViewportView(tblEventNGO);

        btnJoinEvent.setBackground(new java.awt.Color(0, 0, 0));
        btnJoinEvent.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btnJoinEvent.setForeground(new java.awt.Color(255, 255, 255));
        btnJoinEvent.setText("Join Event");
        btnJoinEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJoinEventActionPerformed(evt);
            }
        });

        btnView.setBackground(new java.awt.Color(0, 0, 0));
        btnView.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btnView.setForeground(new java.awt.Color(255, 255, 255));
        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(225, 225, 225)
                .addComponent(btnJoinEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(297, 297, 297))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(btnJoinEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(101, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnJoinEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJoinEventActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblEventNGO.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select the row to assign the account", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            NGOWorkRequest p = (NGOWorkRequest) tblEventNGO.getValueAt(selectedRow, 0);

            p.setvRequired(p.getvRequired()-1);
            p.setvAcquired(p.getvAcquired()+1);
            p.setVolunteer(vm);

            JOptionPane.showMessageDialog(null, "You Successfully registered for an Event!");

            populateTableEvent();

        }

    }//GEN-LAST:event_btnJoinEventActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblEventNGO.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select the row to assign the account", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {

            NGOWorkRequest p = (NGOWorkRequest) tblEventNGO.getValueAt(selectedRow, 0);
            txtTitle.setText(p.getTitle());
            txtDesc.setText(p.getDescription());
            txtLoc.setText(p.getLocation());
            txtDate.setText(p.getRequestDate().toString());
            txtVolunteer.setText(String.valueOf(p.getvRequired()));
        }
    }//GEN-LAST:event_btnViewActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnJoinEvent;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblEventNGO;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextArea txtDesc;
    private javax.swing.JTextField txtLoc;
    private javax.swing.JTextField txtTitle;
    private javax.swing.JTextField txtVolunteer;
    // End of variables declaration//GEN-END:variables
}
