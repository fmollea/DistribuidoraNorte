/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distNorteInterface;

import java.awt.event.KeyEvent;
import java.util.Locale;

/**
 *
 * @author fmollea
 */
public class FrameSearch extends javax.swing.JFrame {

    /**
     * Creates new form FrameSearch
     */
    public FrameSearch() {
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
        ExitButtin2 = new javax.swing.JButton();
        mainButton = new javax.swing.JButton();
        clientButton = new javax.swing.JButton();
        providerButton = new javax.swing.JButton();
        produtButton = new javax.swing.JButton();
        InvoiceButton = new javax.swing.JButton();
        buyButton = new javax.swing.JButton();
        fondLeftLabel = new javax.swing.JLabel();
        fondHightLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelTittle.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        LabelTittle.setForeground(new java.awt.Color(255, 255, 255));
        LabelTittle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelTittle.setText("Busquedas");
        LabelTittle.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(LabelTittle, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 200, -1));

        ExitButtin2.setBackground(new java.awt.Color(102, 0, 0));
        ExitButtin2.setForeground(new java.awt.Color(204, 204, 204));
        ExitButtin2.setText("X");
        ExitButtin2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtin2ActionPerformed(evt);
            }
        });
        getContentPane().add(ExitButtin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 0, -1, -1));

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

        produtButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/distNorteInterface/images/product2.jpg"))); // NOI18N
        produtButton.setPreferredSize(new java.awt.Dimension(100, 100));
        produtButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                produtButtonMouseClicked(evt);
            }
        });
        produtButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                produtButtonKeyPressed(evt);
            }
        });
        getContentPane().add(produtButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        InvoiceButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/distNorteInterface/images/invoice2.jpg"))); // NOI18N
        InvoiceButton.setPreferredSize(new java.awt.Dimension(100, 100));
        InvoiceButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InvoiceButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                InvoiceButtonMouseEntered(evt);
            }
        });
        InvoiceButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                InvoiceButtonKeyPressed(evt);
            }
        });
        getContentPane().add(InvoiceButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, -1, -1));

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
        getContentPane().add(buyButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, -1, -1));

        fondLeftLabel.setBackground(new java.awt.Color(235, 235, 235));
        fondLeftLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/distNorteInterface/images/background.jpg"))); // NOI18N
        fondLeftLabel.setText("Ventas");
        getContentPane().add(fondLeftLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 80));

        fondHightLabel.setBackground(new java.awt.Color(235, 235, 235));
        fondHightLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/distNorteInterface/images/background.jpg"))); // NOI18N
        getContentPane().add(fondHightLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 675));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitButtin2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtin2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitButtin2ActionPerformed

    private void mainButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mainButtonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
           FrameMain main = new FrameMain();
           main.setVisible(true);
           this.setVisible(false);
       }
    }//GEN-LAST:event_mainButtonKeyPressed

    private void mainButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainButtonMouseClicked
        FrameMain main = new FrameMain();
        main.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mainButtonMouseClicked

    private void clientButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_clientButtonKeyPressed
         if (evt.getKeyCode() == KeyEvent.VK_ENTER){
           FrameClient client = new FrameClient();
           client.setVisible(true);
           this.setVisible(false);
       }
    }//GEN-LAST:event_clientButtonKeyPressed

    private void clientButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientButtonMouseClicked
        FrameClient clien = new FrameClient();
        clien.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_clientButtonMouseClicked

    private void providerButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_providerButtonKeyPressed
         if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            FrameProvider frameProvider = new FrameProvider();
            frameProvider.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_providerButtonKeyPressed

    private void providerButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_providerButtonMouseClicked
        FrameProvider frameProvider = new FrameProvider();
        frameProvider.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_providerButtonMouseClicked

    private void produtButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_produtButtonKeyPressed
         if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            FrameProduct frameProduct = new FrameProduct();
            frameProduct.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_produtButtonKeyPressed

    private void produtButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_produtButtonMouseClicked
        FrameProduct frameProduct = new FrameProduct();
        frameProduct.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_produtButtonMouseClicked

    private void InvoiceButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_InvoiceButtonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){    
            FrameInvoice frameInvoice = new FrameInvoice();
            frameInvoice.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_InvoiceButtonKeyPressed

    private void InvoiceButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InvoiceButtonMouseEntered
        
    }//GEN-LAST:event_InvoiceButtonMouseEntered

    private void InvoiceButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InvoiceButtonMouseClicked
        FrameInvoice frameInvoice = new FrameInvoice();
        frameInvoice.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_InvoiceButtonMouseClicked

    private void buyButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buyButtonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){    
            FrameBuy frameBuy = new FrameBuy();
            frameBuy.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_buyButtonKeyPressed

    private void buyButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buyButtonMouseClicked
        FrameBuy frameBuy = new FrameBuy();
        frameBuy.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_buyButtonMouseClicked

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
            java.util.logging.Logger.getLogger(FrameSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameSearch().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExitButtin2;
    private javax.swing.JButton InvoiceButton;
    private javax.swing.JLabel LabelTittle;
    private javax.swing.JButton buyButton;
    private javax.swing.JButton clientButton;
    private javax.swing.JLabel fondHightLabel;
    private javax.swing.JLabel fondLeftLabel;
    private javax.swing.JButton mainButton;
    private javax.swing.JButton produtButton;
    private javax.swing.JButton providerButton;
    // End of variables declaration//GEN-END:variables
}
