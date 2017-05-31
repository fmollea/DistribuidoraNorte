/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distNorteInterface;

import java.awt.event.KeyEvent;

/**
 *
 * @author fmollea
 */
public class FrameProduct extends javax.swing.JFrame {

    /**
     * Creates new form FrameProduct
     */
    public FrameProduct() {
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
        mainButton = new javax.swing.JButton();
        fondLeftLabel = new javax.swing.JLabel();
        clientButton = new javax.swing.JButton();
        providerButton = new javax.swing.JButton();
        invoicetButton = new javax.swing.JButton();
        buyButton = new javax.swing.JButton();
        searchButton = new javax.swing.JButton();
        fondHightLabel = new javax.swing.JLabel();
        ExitButtin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(760, 675));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelTittle.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        LabelTittle.setForeground(new java.awt.Color(255, 255, 255));
        LabelTittle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelTittle.setText("Productos");
        LabelTittle.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(LabelTittle, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 200, -1));

        mainButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/distNorteInterface/images/main.jpg"))); // NOI18N
        mainButton.setPreferredSize(new java.awt.Dimension(100, 100));
        mainButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mainButtonMouseClicked(evt);
            }
        });
        mainButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                mainButtonKeyPressed(evt);
            }
        });
        getContentPane().add(mainButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        fondLeftLabel.setBackground(new java.awt.Color(235, 235, 235));
        fondLeftLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/distNorteInterface/images/background.jpg"))); // NOI18N
        getContentPane().add(fondLeftLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 80));

        clientButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/distNorteInterface/images/client2.jpg"))); // NOI18N
        clientButton.setPreferredSize(new java.awt.Dimension(100, 100));
        clientButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clientButtonMouseClicked(evt);
            }
        });
        clientButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                clientButtonKeyPressed(evt);
            }
        });
        getContentPane().add(clientButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        providerButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/distNorteInterface/images/provider2.jpg"))); // NOI18N
        providerButton.setPreferredSize(new java.awt.Dimension(100, 100));
        providerButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                providerButtonMouseClicked(evt);
            }
        });
        providerButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                providerButtonKeyPressed(evt);
            }
        });
        getContentPane().add(providerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        invoicetButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/distNorteInterface/images/invoice2.jpg"))); // NOI18N
        invoicetButton.setPreferredSize(new java.awt.Dimension(100, 100));
        invoicetButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                invoicetButtonMouseClicked(evt);
            }
        });
        invoicetButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                invoicetButtonKeyPressed(evt);
            }
        });
        getContentPane().add(invoicetButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        buyButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/distNorteInterface/images/buy2.jpg"))); // NOI18N
        buyButton.setPreferredSize(new java.awt.Dimension(100, 100));
        buyButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buyButtonMouseClicked(evt);
            }
        });
        buyButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                buyButtonKeyPressed(evt);
            }
        });
        getContentPane().add(buyButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, -1, -1));

        searchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/distNorteInterface/images/search2.jpg"))); // NOI18N
        searchButton.setPreferredSize(new java.awt.Dimension(100, 100));
        searchButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchButtonMouseClicked(evt);
            }
        });
        searchButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchButtonKeyPressed(evt);
            }
        });
        getContentPane().add(searchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, -1, -1));

        fondHightLabel.setBackground(new java.awt.Color(235, 235, 235));
        fondHightLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/distNorteInterface/images/background.jpg"))); // NOI18N
        getContentPane().add(fondHightLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 675));

        ExitButtin.setBackground(new java.awt.Color(102, 0, 0));
        ExitButtin.setForeground(new java.awt.Color(204, 204, 204));
        ExitButtin.setText("X");
        ExitButtin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtinActionPerformed(evt);
            }
        });
        getContentPane().add(ExitButtin, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitButtinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtinActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitButtinActionPerformed

    private void mainButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mainButtonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
           FrameMain main = new FrameMain();
           main.setVisible(true);
           dispose();
        }
    }//GEN-LAST:event_mainButtonKeyPressed

    private void mainButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainButtonMouseClicked
        FrameMain main = new FrameMain();
        main.setVisible(true);
        dispose();
    }//GEN-LAST:event_mainButtonMouseClicked

    private void clientButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_clientButtonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            FrameClient frameClient = new FrameClient();
            frameClient.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_clientButtonKeyPressed

    private void clientButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientButtonMouseClicked
        FrameClient client = new FrameClient();
        client.setVisible(true);
        dispose();
    }//GEN-LAST:event_clientButtonMouseClicked

    private void providerButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_providerButtonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            FrameProvider frameProvider = new FrameProvider();
            frameProvider.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_providerButtonKeyPressed

    private void providerButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_providerButtonMouseClicked
        FrameProvider frameProvider = new FrameProvider();
        frameProvider.setVisible(true);
        dispose();
    }//GEN-LAST:event_providerButtonMouseClicked

    private void invoicetButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_invoicetButtonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){    
            FrameInvoice frameInvoice = new FrameInvoice();
            frameInvoice.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_invoicetButtonKeyPressed

    private void invoicetButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_invoicetButtonMouseClicked
        FrameInvoice frameInvoice = new FrameInvoice();
        frameInvoice.setVisible(true);
        dispose();
    }//GEN-LAST:event_invoicetButtonMouseClicked

    private void buyButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buyButtonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){    
            FrameBuy frameBuy = new FrameBuy();
            frameBuy.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_buyButtonKeyPressed

    private void buyButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buyButtonMouseClicked
        FrameBuy frameBuy = new FrameBuy();
        frameBuy.setVisible(true);
        dispose();
    }//GEN-LAST:event_buyButtonMouseClicked

    private void searchButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchButtonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){      
            FrameSearch frameSearch = new FrameSearch();
            frameSearch.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_searchButtonKeyPressed

    private void searchButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchButtonMouseClicked
        FrameSearch frameSearch = new FrameSearch();
        frameSearch.setVisible(true);
        dispose();
    }//GEN-LAST:event_searchButtonMouseClicked

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
            java.util.logging.Logger.getLogger(FrameProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameProduct().setVisible(true);
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
    private javax.swing.JButton providerButton;
    private javax.swing.JButton searchButton;
    // End of variables declaration//GEN-END:variables
}
