package distNorteInterface;

import com.sun.glass.events.KeyEvent;
import distNorteInterface.clientPanels.PanelAddClient;
import distNorteInterface.clientPanels.PanelDeleteClient;
import distNorteInterface.clientPanels.PanelListClient;
import distNorteInterface.clientPanels.PanelSearchClient;
import distNorteInterface.clientPanels.PanelUpdateClient;
import java.awt.*;  
import javax.swing.*;


/**
 *
 * @author fmollea
 */
public class FrameClient extends javax.swing.JFrame {

    
    public FrameClient() {
        initComponents();
        initPanels();
        this.getContentPane().setBackground(Color.white);
        setIconImage(new ImageIcon(getClass().getResource("images/logo100.jpg")).getImage());
        this.setLocationRelativeTo(null);
    }
    
    public void initPanels(){
        panelAddClient = new PanelAddClient();
        getContentPane().add(panelAddClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, -1, -1));
        
        panelUpdateClient = new PanelUpdateClient();
        getContentPane().add(panelUpdateClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, -1, -1));
        
        panelDeleteClient = new PanelDeleteClient();
        getContentPane().add(panelDeleteClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, -1, -1));
        
        panelListClient = new PanelListClient();
        getContentPane().add(panelListClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, -1, -1));
        
        panelSearchClient = new PanelSearchClient();
        getContentPane().add(panelSearchClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, -1, -1));
    }
    
    public void hidePanels(){
        panelAddClient.setVisible(false);
        panelUpdateClient.setVisible(false);
        panelDeleteClient.setVisible(false);
        panelListClient.setVisible(false);
        panelSearchClient.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        createButton1 = new javax.swing.JButton();
        updateButton1 = new javax.swing.JButton();
        listButton1 = new javax.swing.JButton();
        dropButton1 = new javax.swing.JButton();
        listButton = new javax.swing.JButton();
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
        sButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        lButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        labelIcon = new javax.swing.JLabel();

        createButton1.setText("Cargar");
        createButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButton1ActionPerformed(evt);
            }
        });

        updateButton1.setText("Modificar");
        updateButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButton1ActionPerformed(evt);
            }
        });

        listButton1.setText("Listar");
        listButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listButton1ActionPerformed(evt);
            }
        });

        dropButton1.setText("Eliminar");
        dropButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dropButton1ActionPerformed(evt);
            }
        });

        listButton.setText("Buscar");
        listButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listButtonActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Clientes\n");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImages(null);
        setMinimumSize(new java.awt.Dimension(760, 675));
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
        SearchButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchButtonMouseClicked(evt);
            }
        });
        SearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButtonActionPerformed(evt);
            }
        });
        SearchButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                SearchButtonKeyPressed(evt);
            }
        });
        getContentPane().add(SearchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, -1, -1));

        BuyButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/distNorteInterface/images/buy2.jpg"))); // NOI18N
        BuyButton.setPreferredSize(new java.awt.Dimension(100, 100));
        BuyButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BuyButtonMouseClicked(evt);
            }
        });
        BuyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuyButtonActionPerformed(evt);
            }
        });
        BuyButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BuyButtonKeyPressed(evt);
            }
        });
        getContentPane().add(BuyButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, -1, -1));

        InvoiceButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/distNorteInterface/images/invoice2.jpg"))); // NOI18N
        InvoiceButton.setPreferredSize(new java.awt.Dimension(100, 100));
        InvoiceButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InvoiceButtonMouseClicked(evt);
            }
        });
        InvoiceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InvoiceButtonActionPerformed(evt);
            }
        });
        InvoiceButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                InvoiceButtonKeyPressed(evt);
            }
        });
        getContentPane().add(InvoiceButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        fondHightLabel.setBackground(new java.awt.Color(235, 235, 235));
        fondHightLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/distNorteInterface/images/background.jpg"))); // NOI18N
        getContentPane().add(fondHightLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 675));

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

        sButton.setText("Buscar");
        sButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sButtonMouseClicked(evt);
            }
        });
        sButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                sButtonKeyPressed(evt);
            }
        });
        getContentPane().add(sButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(628, 80, 128, 50));

        addButton.setText("Crear");
        addButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addButtonMouseClicked(evt);
            }
        });
        addButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                addButtonKeyPressed(evt);
            }
        });
        getContentPane().add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 128, 50));

        updateButton.setText("Modificar");
        updateButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateButtonMouseClicked(evt);
            }
        });
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        updateButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                updateButtonKeyPressed(evt);
            }
        });
        getContentPane().add(updateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 80, 128, 50));

        lButton.setText("Listar");
        lButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lButtonMouseClicked(evt);
            }
        });
        lButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lButtonKeyPressed(evt);
            }
        });
        getContentPane().add(lButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, 128, 50));

        deleteButton.setText("Eliminar");
        deleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteButtonMouseClicked(evt);
            }
        });
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        deleteButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                deleteButtonKeyPressed(evt);
            }
        });
        getContentPane().add(deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 80, 128, 50));

        labelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/distNorteInterface/images/logoDN.jpg"))); // NOI18N
        getContentPane().add(labelIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, -1, -1));

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
        dispose();
    }//GEN-LAST:event_MainButtonMouseClicked

    private void ExitButtinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtinActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitButtinActionPerformed

    private void MainButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MainButtonKeyPressed
       if (evt.getKeyCode() == KeyEvent.VK_ENTER){
           FrameMain main = new FrameMain();
           main.setVisible(true);
           dispose();
       }
    }//GEN-LAST:event_MainButtonKeyPressed

    private void ProviderButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ProviderButtonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            FrameProvider frameProvider = new FrameProvider();
            frameProvider.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_ProviderButtonKeyPressed

    private void ProviderButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProviderButtonMouseClicked
        FrameProvider frameProvider = new FrameProvider();
        frameProvider.setVisible(true);
        dispose();
    }//GEN-LAST:event_ProviderButtonMouseClicked

    private void ProductButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductButtonMouseClicked
        FrameProduct frameProduct = new FrameProduct();
        frameProduct.setVisible(true);
        dispose();
    }//GEN-LAST:event_ProductButtonMouseClicked

    private void ProductButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ProductButtonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            FrameProduct frameProduct = new FrameProduct();
            frameProduct.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_ProductButtonKeyPressed

    private void InvoiceButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InvoiceButtonMouseClicked
        FrameInvoice frameInvoice = new FrameInvoice();
        frameInvoice.setVisible(true);
        dispose();
    }//GEN-LAST:event_InvoiceButtonMouseClicked

    private void InvoiceButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_InvoiceButtonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){    
            FrameInvoice frameInvoice = new FrameInvoice();
            frameInvoice.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_InvoiceButtonKeyPressed

    private void BuyButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuyButtonMouseClicked
        FrameBuy frameBuy = new FrameBuy();
        frameBuy.setVisible(true);
        dispose();
    }//GEN-LAST:event_BuyButtonMouseClicked

    private void BuyButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BuyButtonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){    
            FrameBuy frameBuy = new FrameBuy();
            frameBuy.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_BuyButtonKeyPressed

    private void SearchButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchButtonMouseClicked
        FrameSearch frameSearch = new FrameSearch();
        frameSearch.setVisible(true);
        dispose();
    }//GEN-LAST:event_SearchButtonMouseClicked

    private void SearchButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchButtonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){      
            FrameSearch frameSearch = new FrameSearch();
            frameSearch.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_SearchButtonKeyPressed

    private void listButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listButtonActionPerformed

    private void createButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_createButton1ActionPerformed

    private void updateButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateButton1ActionPerformed

    private void dropButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dropButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dropButton1ActionPerformed

    private void listButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listButton1ActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void addButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButtonMouseClicked
        hidePanels();
        panelAddClient.setVisible(true);
        labelIcon.setVisible(false);
          
    }//GEN-LAST:event_addButtonMouseClicked

    private void addButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addButtonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            hidePanels();
            panelAddClient.setVisible(true);
            labelIcon.setVisible(false);
        }
    }//GEN-LAST:event_addButtonKeyPressed

    private void updateButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_updateButtonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            hidePanels();
            panelUpdateClient.setVisible(true);
            labelIcon.setVisible(false);
        }
    }//GEN-LAST:event_updateButtonKeyPressed

    private void updateButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateButtonMouseClicked
        hidePanels();
        panelUpdateClient.setVisible(true);
        labelIcon.setVisible(false);
    }//GEN-LAST:event_updateButtonMouseClicked

    private void deleteButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_deleteButtonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            hidePanels();
            panelDeleteClient.setVisible(true);
            labelIcon.setVisible(false);
        }
    }//GEN-LAST:event_deleteButtonKeyPressed

    private void deleteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteButtonMouseClicked
        hidePanels();
        panelDeleteClient.setVisible(true);
        labelIcon.setVisible(false);
    }//GEN-LAST:event_deleteButtonMouseClicked

    private void lButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lButtonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            hidePanels();
            panelListClient.setVisible(true);
            labelIcon.setVisible(false);
        }
    }//GEN-LAST:event_lButtonKeyPressed

    private void lButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lButtonMouseClicked
        hidePanels();
        panelListClient.setVisible(true);
        labelIcon.setVisible(false);
    }//GEN-LAST:event_lButtonMouseClicked

    private void sButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sButtonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            hidePanels();
            panelSearchClient.setVisible(true);
            labelIcon.setVisible(false);
        }
    }//GEN-LAST:event_sButtonKeyPressed

    private void sButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sButtonMouseClicked
        hidePanels();
        panelSearchClient.setVisible(true);
        labelIcon.setVisible(false);
    }//GEN-LAST:event_sButtonMouseClicked

   
    private PanelAddClient panelAddClient;
    private PanelUpdateClient panelUpdateClient;
    private PanelDeleteClient panelDeleteClient;
    private PanelListClient panelListClient;
    private PanelSearchClient panelSearchClient;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BuyButton;
    private javax.swing.JButton ExitButtin;
    private javax.swing.JButton InvoiceButton;
    private javax.swing.JLabel LabelTittle;
    private javax.swing.JButton MainButton;
    private javax.swing.JButton ProductButton;
    private javax.swing.JButton ProviderButton;
    private javax.swing.JButton SearchButton;
    private javax.swing.JButton addButton;
    private javax.swing.JButton createButton1;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton dropButton1;
    private javax.swing.JLabel fondHightLabel;
    private javax.swing.JLabel fondLeftLabel;
    private javax.swing.JButton lButton;
    private javax.swing.JLabel labelIcon;
    private javax.swing.JButton listButton;
    private javax.swing.JButton listButton1;
    private javax.swing.JButton sButton;
    private javax.swing.JButton updateButton;
    private javax.swing.JButton updateButton1;
    // End of variables declaration//GEN-END:variables
}
