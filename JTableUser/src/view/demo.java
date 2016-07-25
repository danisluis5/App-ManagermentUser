/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import bean.User;
import controller.ControllerUser;
import java.util.Random;
import javax.swing.JOptionPane;
/**
 *
 * @author vuongluis
 */
public class demo extends javax.swing.JFrame {
    private ControllerUser controller;
    /**
     * Creates new form demo
     */
    public demo() {
        initComponents();
        controller = new ControllerUser(tableUser);
        controller.loadTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RightPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableUser = new javax.swing.JTable();
        LeftPanel = new javax.swing.JPanel();
        Center = new javax.swing.JPanel();
        Top = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfUser = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cbTrangThai = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        tfPass = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        NavigationButton = new javax.swing.JPanel();
        btThem = new javax.swing.JButton();
        btSua = new javax.swing.JButton();
        btNhapLai = new javax.swing.JButton();
        btXoa = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        tffId = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tffUser = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tffName = new javax.swing.JTextField();
        TimKiem = new javax.swing.JPanel();
        btTimKiem = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("frame"); // NOI18N

        RightPanel.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(5, 2, 2, 2, new java.awt.Color(214, 217, 222)), javax.swing.BorderFactory.createEtchedBorder()));

        tableUser.setAutoCreateRowSorter(true);
        tableUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableUserMouseClicked(evt);
            }
        });
        tableUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tableUserKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tableUser);
        if (tableUser.getColumnModel().getColumnCount() > 0) {
            tableUser.getColumnModel().getColumn(0).setResizable(false);
            tableUser.getColumnModel().getColumn(1).setResizable(false);
            tableUser.getColumnModel().getColumn(2).setResizable(false);
            tableUser.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout RightPanelLayout = new javax.swing.GroupLayout(RightPanel);
        RightPanel.setLayout(RightPanelLayout);
        RightPanelLayout.setHorizontalGroup(
            RightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
        );
        RightPanelLayout.setVerticalGroup(
            RightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        LeftPanel.setBackground(new java.awt.Color(214, 217, 222));
        LeftPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Form chức năng", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(72, 172, 73))); // NOI18N
        LeftPanel.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout CenterLayout = new javax.swing.GroupLayout(Center);
        Center.setLayout(CenterLayout);
        CenterLayout.setHorizontalGroup(
            CenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );
        CenterLayout.setVerticalGroup(
            CenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 129, Short.MAX_VALUE)
        );

        LeftPanel.add(Center, java.awt.BorderLayout.CENTER);

        jLabel1.setText("ID người dùng:");

        tfId.setEditable(false);
        tfId.setBackground(new java.awt.Color(222, 225, 230));
        tfId.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, null, null, new java.awt.Color(204, 204, 204)));

        jLabel2.setText("Tên đăng nhập:");

        tfUser.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, null, null, new java.awt.Color(204, 204, 204)));

        jLabel3.setText("Kích hoạt:");

        cbTrangThai.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jLabel4.setText("Mật khẩu:");

        tfPass.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel5.setText("Họ và tên:");

        tfName.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        NavigationButton.setBorder(javax.swing.BorderFactory.createMatteBorder(20, 10, 20, 10, new java.awt.Color(214, 217, 224)));
        NavigationButton.setLayout(new java.awt.GridLayout(1, 4, 5, 0));

        btThem.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add-icon.gif"))); // NOI18N
        btThem.setText("Thêm");
        btThem.setMargin(new java.awt.Insets(2, 1, 2, 1));
        btThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThemActionPerformed(evt);
            }
        });
        NavigationButton.add(btThem);

        btSua.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit-icon.gif"))); // NOI18N
        btSua.setText("Sữa");
        btSua.setMargin(new java.awt.Insets(2, 1, 2, 1));
        NavigationButton.add(btSua);

        btNhapLai.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btNhapLai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit.gif"))); // NOI18N
        btNhapLai.setText("Nhập lại");
        btNhapLai.setMargin(new java.awt.Insets(2, 1, 2, 1));
        btNhapLai.setPreferredSize(new java.awt.Dimension(100, 21));
        btNhapLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNhapLaiActionPerformed(evt);
            }
        });
        NavigationButton.add(btNhapLai);

        btXoa.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/del.gif"))); // NOI18N
        btXoa.setText("Xóa");
        btXoa.setMargin(new java.awt.Insets(2, 1, 2, 1));
        btXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXoaActionPerformed(evt);
            }
        });
        NavigationButton.add(btXoa);

        javax.swing.GroupLayout TopLayout = new javax.swing.GroupLayout(Top);
        Top.setLayout(TopLayout);
        TopLayout.setHorizontalGroup(
            TopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TopLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(TopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPass, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(TopLayout.createSequentialGroup()
                        .addComponent(tfUser, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbTrangThai)))
                .addContainerGap(38, Short.MAX_VALUE))
            .addComponent(NavigationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        TopLayout.setVerticalGroup(
            TopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TopLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(TopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfUser, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(cbTrangThai))
                .addGap(15, 15, 15)
                .addGroup(TopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfPass, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(TopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(NavigationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        LeftPanel.add(Top, java.awt.BorderLayout.PAGE_START);

        jPanel3.setPreferredSize(new java.awt.Dimension(390, 186));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Tìm kiếm");

        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(214, 217, 224), 2, true), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED)));

        jLabel7.setText("ID:");

        tffId.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel8.setText("Tên đăng nhập:");

        tffUser.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel9.setText("Họ và tên:");

        tffName.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        TimKiem.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 120, 3, 120, new java.awt.Color(214, 217, 224)));
        TimKiem.setLayout(new java.awt.BorderLayout());

        btTimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search-icon.png"))); // NOI18N
        btTimKiem.setText("Tìm kiếm");
        btTimKiem.setPreferredSize(new java.awt.Dimension(60, 23));
        TimKiem.add(btTimKiem, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tffName, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tffId, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tffUser, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(tffId, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(tffUser, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tffName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LeftPanel.add(jPanel3, java.awt.BorderLayout.PAGE_END);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(LeftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RightPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(LeftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableUserMouseClicked
        this.setForm();
    }//GEN-LAST:event_tableUserMouseClicked

    private void tableUserKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableUserKeyReleased
        this.setForm();
    }//GEN-LAST:event_tableUserKeyReleased

    private void btThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThemActionPerformed
        if(tfUser.getText().isEmpty()){
            JOptionPane.showMessageDialog(new demo(), "Nhập tên đăng nhập","Thông báo",JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(tfPass.getText().isEmpty()){
            JOptionPane.showMessageDialog(new demo(), "Nhập mật khẩu","Thông báo",JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(tfName.getText().isEmpty()){
            JOptionPane.showMessageDialog(new demo(), "Nhập họ và tên","Thông báo",JOptionPane.WARNING_MESSAGE);
            return;
        }
        int id = new Random().nextInt(99)+1;
        String username = tfUser.getText();
        String hoTen = tfName.getText();
        boolean active = cbTrangThai.isSelected();
        User objUser = new User(id,username,hoTen,active);
        int result = controller.addItem(objUser);
        if(result > 0){
            resetForm();
            JOptionPane.showMessageDialog(rootPane, "Thêm thành công", "Thông báo", JOptionPane.WARNING_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(rootPane, "Lỗi khi thêm", "Thông báo", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btThemActionPerformed

    private void btXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXoaActionPerformed
        int row = tableUser.getSelectedRow();
        try{
            int id = Integer.parseInt(tfId.getText().toString());
            int result = controller.deleteItem(id,row);
            if(result > 0){
                resetForm();
                JOptionPane.showMessageDialog(rootPane, "Xóa thành công", "Thông báo", JOptionPane.WARNING_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(rootPane, "Lỗi khi xóa", "Thông báo", JOptionPane.WARNING_MESSAGE);
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Vui lòng chọn bản ghi muốn xóa","Thông báo",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btXoaActionPerformed

    private void btNhapLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNhapLaiActionPerformed
        this.resetForm();
    }//GEN-LAST:event_btNhapLaiActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(demo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(demo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(demo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(demo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new demo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Center;
    private javax.swing.JPanel LeftPanel;
    private javax.swing.JPanel NavigationButton;
    private javax.swing.JPanel RightPanel;
    private javax.swing.JPanel TimKiem;
    private javax.swing.JPanel Top;
    private javax.swing.JButton btNhapLai;
    private javax.swing.JButton btSua;
    private javax.swing.JButton btThem;
    private javax.swing.JButton btTimKiem;
    private javax.swing.JButton btXoa;
    private javax.swing.JCheckBox cbTrangThai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableUser;
    private javax.swing.JTextField tfId;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfPass;
    private javax.swing.JTextField tfUser;
    private javax.swing.JTextField tffId;
    private javax.swing.JTextField tffName;
    private javax.swing.JTextField tffUser;
    // End of variables declaration//GEN-END:variables

    private void setForm() {
        int row = tableUser.getSelectedRow();
        int id = Integer.parseInt(tableUser.getValueAt(row, 0).toString());
        String username = tableUser.getValueAt(row, 1).toString();
        String hoTen = tableUser.getValueAt(row, 2).toString();
        boolean active = (boolean) tableUser.getValueAt(row, 3);
        
        tfId.setText(id+"");
        tfUser.setText(username);
        tfName.setText(hoTen);
        cbTrangThai.setSelected(active);
    }
    
    public void resetForm(){
        tfId.setText("");
        tfName.setText("");
        tfUser.setText("");
        tfPass.setText("");
        cbTrangThai.setSelected(false);
        tfUser.requestFocus();
    }
}