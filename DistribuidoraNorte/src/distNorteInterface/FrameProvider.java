/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distNorteInterface;

/**
 *
 * @author fmollea
 */
public class FrameProvider extends javax.swing.JFrame {

    /**
     * Creates new form FrameProvider
     */
    public FrameProvider() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelTittle = new javax.swing.JLabel();
        ExitButtin = new javax.swing.JButton();
        mainButton = new javax.swing.JButton();
        clientButton = new javax.swing.JButton();
        productButton = new javax.swing.JButton();
        invoicetButton = new javax.swing.JButton();
        buyButton = new javax.swing.JButton();
        searchButton = new javax.swing.JButton();
        fondHightLabel = new javax.swing.JLabel();
        fondLeftLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(760, 675));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelTittle.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        LabelTittle.setForeground(new java.awt.Color(255, 255, 255));
        LabelTittle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelTittle.setText("Proveedores");
        LabelTittle.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(LabelTittle, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 200, -1));

        ExitButtin.setBackground(new java.awt.Color(102, 0, 0));
        ExitButtin.setForeground(new java.awt.Color(204, 204, 204));
        ExitButtin.setText("X");
        ExitButtin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtinActionPerformed(evt);
            }
        });
        getContentPane().add(ExitButtin, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 0, -1, -1));

        mainButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/distNorteInterface/images/main.jpg"))); // NOI18N
        mainButton.setPreferredSize(new java.awt.Dimension(100, 100));
        getContentPane().add(mainButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        clientButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/distNorteInterface/images/client2.jpg"))); // NOI18N
        clientButton.setPreferredSize(new java.awt.Dimension(100, 100));
        getContentPane().add(clientButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        productButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/distNorteInterface/images/product2.jpg"))); // NOI18N
        productButton.setPreferredSize(new java.awt.Dimension(100, 100));
        getContentPane().add(productButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        invoicetButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/distNorteInterface/images/invoice2.jpg"))); // NOI18N
        invoicetButton.setPreferredSize(new java.awt.Dimension(100, 100));
        getContentPane().add(invoicetButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        buyButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/distNorteInterface/images/buy2.jpg"))); // NOI18N
        buyButton.setPreferredSize(new java.awt.Dimension(100, 100));
        getContentPane().add(buyButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, -1, -1));

        searchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/distNorteInterface/images/search2.jpg"))); // NOI18N
        searchButton.setPreferredSize(new java.awt.Dimension(100, 100));
        getContentPane().add(searchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, -1, -1));

        fondHightLabel.setBackground(new java.awt.Color(235, 235, 235));
        fondHightLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/distNorteInterface/images/background.jpg"))); // NOI18N
        getContentPane().add(fondHightLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 675));

        fondLeftLabel.setBackground(new java.awt.Color(235, 235, 235));
        fondLeftLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/distNorteInterface/images/background.jpg"))); // NOI18N
        getContentPane().add(fondLeftLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 80));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitButtinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtinActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitButtinActionPerformed

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
            java.util.logging.Logger.getLogger(FrameProvider.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameProvider.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameProvider.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameProvider.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameProvider().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExitButtin;
    private javax.swing.JLabel LabelTittle;
    private javax.swing.JButton buyButton;
    private javax.swing.JButton clientButton;
    private javax.swing.JLabel fondHightLabel;
    private javax.swing.JLabel fondLeftLabel;
    private javax.swing.JButton invoicetButton;
    private javax.swing.JButton mainButton;
    private javax.swing.JButton productButton;
    private javax.swing.JButton searchButton;
    // End of variables declaration//GEN-END:variables
}
