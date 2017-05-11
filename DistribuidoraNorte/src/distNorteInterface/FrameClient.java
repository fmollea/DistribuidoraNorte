/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distNorteInterface;

import com.sun.glass.events.KeyEvent;

/**
 *
 * @author fmollea
 */
public class FrameClient extends javax.swing.JFrame {

    /**
     * Creates new form FrameClient
     */
    public FrameClient() {
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

        ProviderButton = new javax.swing.JButton();
        ProductButton = new javax.swing.JButton();
        MainButton = new javax.swing.JButton();
        SearchButton = new javax.swing.JButton();
        BuyButton = new javax.swing.JButton();
        InvoiceButton = new javax.swing.JButton();
        fondHightLabel = new javax.swing.JLabel();
        LabelTittle = new javax.swing.JLabel();
        ExitButtin = new javax.swing.JButton();
        fondLeftLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(730, 700));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ProviderButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/distNorteInterface/images/provider2.jpg"))); // NOI18N
        ProviderButton.setPreferredSize(new java.awt.Dimension(100, 100));
        ProviderButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProviderButtonMouseClicked(evt);
            }
        });
        ProviderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProviderButtonActionPerformed(evt);
            }
        });
        ProviderButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ProviderButtonKeyPressed(evt);
            }
        });
        getContentPane().add(ProviderButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        ProductButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/distNorteInterface/images/product2.jpg"))); // NOI18N
        ProductButton.setPreferredSize(new java.awt.Dimension(100, 100));
        ProductButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductButtonMouseClicked(evt);
            }
        });
        ProductButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductButtonActionPerformed(evt);
            }
        });
        ProductButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ProductButtonKeyPressed(evt);
            }
        });
        getContentPane().add(ProductButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        MainButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/distNorteInterface/images/main.jpg"))); // NOI18N
        MainButton.setToolTipText("");
        MainButton.setPreferredSize(new java.awt.Dimension(100, 100));
        MainButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MainButtonMouseClicked(evt);
            }
        });
        MainButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainButtonActionPerformed(evt);
            }
        });
        MainButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                MainButtonKeyPressed(evt);
            }
        });
        getContentPane().add(MainButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        SearchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/distNorteInterface/images/search2.jpg"))); // NOI18N
        SearchButton.setPreferredSize(new java.awt.Dimension(100, 100));
        SearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButtonActionPerformed(evt);
            }
        });
        getContentPane().add(SearchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, -1, -1));

        BuyButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/distNorteInterface/images/buy2.jpg"))); // NOI18N
        BuyButton.setPreferredSize(new java.awt.Dimension(100, 100));
        BuyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuyButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BuyButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, -1, -1));

        InvoiceButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/distNorteInterface/images/invoice2.jpg"))); // NOI18N
        InvoiceButton.setPreferredSize(new java.awt.Dimension(100, 100));
        InvoiceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InvoiceButtonActionPerformed(evt);
            }
        });
        getContentPane().add(InvoiceButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        fondHightLabel.setBackground(new java.awt.Color(235, 235, 235));
        fondHightLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/distNorteInterface/images/background.jpg"))); // NOI18N
        getContentPane().add(fondHightLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 680));

        LabelTittle.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        LabelTittle.setForeground(new java.awt.Color(255, 255, 255));
        LabelTittle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelTittle.setText("Clientes");
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

        fondLeftLabel.setBackground(new java.awt.Color(235, 235, 235));
        fondLeftLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/distNorteInterface/images/background.jpg"))); // NOI18N
        getContentPane().add(fondLeftLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 80));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ProviderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProviderButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProviderButtonActionPerformed

    private void MainButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MainButtonActionPerformed

    private void ProductButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProductButtonActionPerformed

    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchButtonActionPerformed

    private void BuyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuyButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BuyButtonActionPerformed

    private void InvoiceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InvoiceButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InvoiceButtonActionPerformed

    private void MainButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MainButtonMouseClicked
        FrameMain main = new FrameMain();
        main.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MainButtonMouseClicked

    private void ExitButtinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtinActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitButtinActionPerformed

    private void MainButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MainButtonKeyPressed
       if (evt.getKeyCode() == KeyEvent.VK_ENTER){
           FrameMain main = new FrameMain();
           main.setVisible(true);
           this.setVisible(false);
       }
    }//GEN-LAST:event_MainButtonKeyPressed

    private void ProviderButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ProviderButtonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            FrameProvider frameProvider = new FrameProvider();
            frameProvider.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_ProviderButtonKeyPressed

    private void ProviderButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProviderButtonMouseClicked
        FrameProvider frameProvider = new FrameProvider();
        frameProvider.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ProviderButtonMouseClicked

    private void ProductButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductButtonMouseClicked
        FrameProduct frameProduct = new FrameProduct();
        frameProduct.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ProductButtonMouseClicked

    private void ProductButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ProductButtonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            FrameProduct frameProduct = new FrameProduct();
            frameProduct.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_ProductButtonKeyPressed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BuyButton;
    private javax.swing.JButton ExitButtin;
    private javax.swing.JButton InvoiceButton;
    private javax.swing.JLabel LabelTittle;
    private javax.swing.JButton MainButton;
    private javax.swing.JButton ProductButton;
    private javax.swing.JButton ProviderButton;
    private javax.swing.JButton SearchButton;
    private javax.swing.JLabel fondHightLabel;
    private javax.swing.JLabel fondLeftLabel;
    // End of variables declaration//GEN-END:variables
}
