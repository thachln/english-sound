/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.JOptionPane;
/**
 *
 * @author User
 */
public class Caculator extends javax.swing.JFrame implements GetData{

    /**
     * Creates new form Caculator
     */
    public Caculator() {
        initComponents();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bien_a = new javax.swing.JTextField();
        bien_b = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        thuchien = new javax.swing.JButton();
        lammoi = new javax.swing.JButton();
        nhapthemso = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ketqua = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        cachthuccong = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(255, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 64, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("E:\\black\\Truyen\\OT28yks.png")); // NOI18N
        jLabel1.setText("CHÀO MỪNG CÁC EM HỌC SINH LỚP 3 ĐẾN VỚI PHẦN MỀM CỘNG 2 SỐ");
        jLabel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Các em hãy nhập số đầu tiên vào đây");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Các em hãy nhập số thứ hai vào đây");

        bien_a.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        bien_b.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("+");

        thuchien.setBackground(new java.awt.Color(0, 0, 255));
        thuchien.setText("THỰC HIỆN PHÉP TÍNH");
        thuchien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thuchienActionPerformed(evt);
            }
        });

        lammoi.setBackground(new java.awt.Color(255, 255, 0));
        lammoi.setText("LÀM LẠI");
        lammoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lammoiActionPerformed(evt);
            }
        });

        nhapthemso.setBackground(new java.awt.Color(0, 255, 0));
        nhapthemso.setText("NHẬP THÊM SỐ MỚI");
        nhapthemso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nhapthemsoActionPerformed(evt);
            }
        });

        ketqua.setEditable(false);
        ketqua.setColumns(20);
        ketqua.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        ketqua.setRows(5);
        ketqua.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        ketqua.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                ketquaAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(ketqua);

        cachthuccong.setEditable(false);
        cachthuccong.setColumns(20);
        cachthuccong.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        cachthuccong.setRows(5);
        jScrollPane2.setViewportView(cachthuccong);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(bien_a, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 199, Short.MAX_VALUE)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(186, 186, 186)
                        .addComponent(bien_b, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(154, 154, 154))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addGap(142, 142, 142)))))
                .addGap(92, 92, 92))
            .addGroup(layout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addComponent(thuchien, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(182, 182, 182)
                .addComponent(lammoi, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(172, 172, 172)
                .addComponent(nhapthemso, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bien_b, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bien_a, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(thuchien, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lammoi, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nhapthemso, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void thuchienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thuchienActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        String pattern = "\\d+";
        boolean p1;
        boolean p2;
        String s1 = bien_a.getText();
        String s2 = bien_b.getText();
        p1 = s1.matches(pattern);
        p2 = s2.matches(pattern);
        if (!p1) {
            JOptionPane.showMessageDialog(rootPane,"Trong chuỗi số " +" ' "+ s1 +" ' "+" có chưa kí tự đặc biệt");
        }
        
        if (!p2) {
            JOptionPane.showMessageDialog(rootPane,"Trong chuỗi số " +" ' "+ s2 +" ' "+ " có chưa kí tự đặc biệt");
        }
        MyBigNumber mybignumber =  new MyBigNumber(this);
        String sum = mybignumber.sum(s1, s2);
        ketqua.setText(sum);
    }//GEN-LAST:event_thuchienActionPerformed

    private void lammoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lammoiActionPerformed
        // TODO add your handling code here:
        bien_a.setText("");
        bien_b.setText("");
        ketqua.setText("");
        
        cachthuccong.setText("");
    }//GEN-LAST:event_lammoiActionPerformed

    private void ketquaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_ketquaAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_ketquaAncestorAdded

    private void nhapthemsoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nhapthemsoActionPerformed
        // TODO add your handling code here:
        String ab = ketqua.getText();
        bien_a.setText(ab);
        bien_b.setText("");
        String pattern = "\\d+";
        boolean p1;
        boolean p2;
        String s1 = bien_a.getText();
        String s2 = bien_b.getText();
        p1 = s1.matches(pattern);
        p2 = s2.matches(pattern);
        if (!p1) {
            JOptionPane.showMessageDialog(rootPane,"Trong chuỗi số " +" ' "+ s1 +" ' "+" có chưa kí tự đặc biệt");
        }
        
        if (!p2) {
            JOptionPane.showMessageDialog(rootPane,"Trong chuỗi số " +" ' "+ s2 +" ' "+ " có chưa kí tự đặc biệt");
        }
        MyBigNumber mybignumber =  new MyBigNumber(this);
        String sum = mybignumber.sum(s1, s2);
        ketqua.setText(sum);
    }//GEN-LAST:event_nhapthemsoActionPerformed

  
    /**cac cong thuc cong la cai nao dau
     * cai do la cho in cach thuc cộng ak in buoc 1 buoc 2 cac kieu
     * nó đó, m dat ten la gi trong day
     * tao kiem ko ra
     * 
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Caculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Caculator().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bien_a;
    private javax.swing.JTextField bien_b;
    private javax.swing.JTextArea cachthuccong;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextArea ketqua;
    private javax.swing.JButton lammoi;
    private javax.swing.JButton nhapthemso;
    private javax.swing.JButton thuchien;
    // End of variables declaration//GEN-END:variables


    /**
     *
     */

    /**
     *
     * @param msg
     */
    @Override
    public void takeandgive(String msg) {
        cachthuccong.setText(msg);
    }



}
