/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg412_budgetapp;

/**
 *
 * @author aim5627
 */
public class CategoryNavigationUI extends javax.swing.JFrame {
    String username;
    CategoryCntl parent;
    /**
     * Creates new form CategoryNavigationUI
     */
    public CategoryNavigationUI() {
        System.out.println("CategoryNavigationUI.constructor1");
        initComponents();
    }
    
    public CategoryNavigationUI(CategoryCntl cc, String u)
    {
        System.out.println("CategoryNavigationUI.constructor2");
        initComponents();
        parent = cc;
        username = u;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        createCategorytBtn = new javax.swing.JButton();
        editCategoryBtn = new javax.swing.JButton();
        categoryLbl = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeWindow(evt);
            }
        });

        createCategorytBtn.setText("Create Category");
        createCategorytBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createCategorytBtnActionPerformed(evt);
            }
        });

        editCategoryBtn.setText("Edit Category");
        editCategoryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editCategoryBtnActionPerformed(evt);
            }
        });

        categoryLbl.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        categoryLbl.setText("Category");

        backBtn.setText("back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(createCategorytBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(editCategoryBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(categoryLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backBtn)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(categoryLbl)
                    .addComponent(backBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(createCategorytBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editCategoryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createCategorytBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createCategorytBtnActionPerformed
        System.out.println("CategoryNavigationUI.createCategorytBtnActionPerformed");
        //CategoryCntl theCategoryCntl = new CategoryCntl(username, 1);
        parent.showNewCategory();
        this.dispose();
    }//GEN-LAST:event_createCategorytBtnActionPerformed

    private void editCategoryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editCategoryBtnActionPerformed
        System.out.println("CategoryNavigationUI.editCategoryBtnActionPerformed");
        //CategoryCntl theCategoryCntl = new CategoryCntl(username, 1);
        parent.showEditCategory();
        this.dispose();
    }//GEN-LAST:event_editCategoryBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        System.out.println("CategoryNavigationUI.backBtnActionPerformed");
        parent.toNavigationUI();
        this.dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    private void closeWindow(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeWindow
        System.out.println("CategoryNavigationUI.closeWindow");
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
            java.util.logging.Logger.getLogger(CategoryNavigationUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CategoryNavigationUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CategoryNavigationUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CategoryNavigationUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CategoryNavigationUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel categoryLbl;
    private javax.swing.JButton createCategorytBtn;
    private javax.swing.JButton editCategoryBtn;
    // End of variables declaration//GEN-END:variables
}
