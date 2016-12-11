/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg412_budgetapp;

import javax.swing.JOptionPane;

/**
 *
 * @author aim5627
 */
public class Analytics_NavigationUI extends javax.swing.JFrame {

    AnalyticsCntl parent;
    String username;
           
    /**
     * Creates new form Analytics_NavigationUI
     */
    public Analytics_NavigationUI() {
        System.out.println("Analytics_NavigationUI.constructor1");
        initComponents();
    }
    
    public Analytics_NavigationUI(AnalyticsCntl p, String u) {
        System.out.println("Analytics_NavigationUI.constructor2");
        parent = p;
        username = u;
        initComponents();
        ChartBtn.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CategoryBtn = new javax.swing.JButton();
        BudgetBtn = new javax.swing.JButton();
        ChartBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        printBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeWindow(evt);
            }
        });

        CategoryBtn.setText("View Purchases by Category");
        CategoryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoryBtnActionPerformed(evt);
            }
        });

        BudgetBtn.setText("View Budget History");
        BudgetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BudgetBtnActionPerformed(evt);
            }
        });

        ChartBtn.setText("Charts");
        ChartBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChartBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel1.setText("Analytics");

        backBtn.setText("back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        printBtn.setText("Print Transaction History To a Text File");
        printBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CategoryBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addComponent(BudgetBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(61, 61, 61)
                .addComponent(ChartBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backBtn)
                .addContainerGap())
            .addComponent(printBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ChartBtn)
                        .addComponent(backBtn)))
                .addGap(18, 18, 18)
                .addComponent(printBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BudgetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CategoryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CategoryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoryBtnActionPerformed
        System.out.println("Analytics_NavigationUI.CategoryBtnActionPerformed");
        parent.showAnalytics_CategoryPurchasesUI();
        this.dispose();
    }//GEN-LAST:event_CategoryBtnActionPerformed

    private void BudgetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BudgetBtnActionPerformed
        System.out.println("Analytics_NavigationUI.BudgetBtnActionPerformed");
        parent.showAnalytics_BudgetUI();
        this.dispose();
    }//GEN-LAST:event_BudgetBtnActionPerformed

    private void ChartBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChartBtnActionPerformed
        System.out.println("Analytics_NavigationUI.ChartBtnActionPerformed");
        parent.showAnalytics_ChartsUI();
        this.dispose();
    }//GEN-LAST:event_ChartBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        System.out.println("Analytics_NavigationUI.backBtnActionPerformed");
        parent.backBtnPressed();
        this.dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    private void printBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printBtnActionPerformed
        System.out.println("Analytics_NavigationUI.printBtnActionPerformed");
        parent.writeHistory();
        
//        if(isSaved)
//        {
//            JOptionPane.showMessageDialog(null, "Histroy saved to 'history.txt'", 
//                    "Saving", JOptionPane.INFORMATION_MESSAGE);
//        }
//        
//        else
//        {
//            JOptionPane.showMessageDialog(null, "Histroy not saved", 
//                    "Saving Error", JOptionPane.INFORMATION_MESSAGE);
//        }
    }//GEN-LAST:event_printBtnActionPerformed

    private void closeWindow(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeWindow
        System.out.println("Analytics_NavigationUI.closeWindow");
        parent.closeWindow();
    }//GEN-LAST:event_closeWindow

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
            java.util.logging.Logger.getLogger(Analytics_NavigationUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Analytics_NavigationUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Analytics_NavigationUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Analytics_NavigationUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Analytics_NavigationUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BudgetBtn;
    private javax.swing.JButton CategoryBtn;
    private javax.swing.JButton ChartBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton printBtn;
    // End of variables declaration//GEN-END:variables
}
