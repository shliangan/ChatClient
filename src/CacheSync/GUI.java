/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CacheSync;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author shanliang
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
        jButtonSync.setEnabled(false);
        jButtonDisconnect.setEnabled(false);
        jTextAreaMessage.setEditable(false);
        jTextAreaSuggestion.setEditable(false);
        jButtonConnect.setEnabled(false);
        jButtonSearch.setEnabled(false);
        jButtonDisconnectServer.setEnabled(false);
        
        
        
        jTextFieldSearchBar.getDocument().addDocumentListener(new DocumentListener(){
            @Override
            public void insertUpdate(DocumentEvent de) {
                if (jTextFieldSearchBar.getText().isEmpty()){ getSuggestions((null));}
                if (!jTextFieldSearchBar.getText().isEmpty()){getSuggestions(jTextFieldSearchBar.getText());}

                //System.out.println(txtIn.getText());
            }

            @Override
            public void removeUpdate(DocumentEvent de) {
                if (jTextFieldSearchBar.getText().isEmpty()) {getSuggestions(null);}
                if (!jTextFieldSearchBar.getText().isEmpty()) {getSuggestions(jTextFieldSearchBar.getText());}
            }

            @Override
            public void changedUpdate(DocumentEvent de) {
            //Plain text components don't fire these events.
            }
        });
        
        
        
        
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelConnection = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldIP = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldPort = new javax.swing.JTextField();
        jButtonConnect = new javax.swing.JButton();
        jButtonDisconnect = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaMessage = new javax.swing.JTextArea();
        jButtonSync = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldPortServer = new javax.swing.JTextField();
        jButtonConnectServer = new javax.swing.JButton();
        jButtonDisconnectServer = new javax.swing.JButton();
        jTextFieldPath = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButtonPath = new javax.swing.JButton();
        jPanelCache = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldSearchBar = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButtonSearch = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaSuggestion = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("IP Address:");

        jTextFieldIP.setText("127.0.0.1");

        jLabel2.setText("Port:");

        jTextFieldPort.setText("9999");

        jButtonConnect.setText("Connect");
        jButtonConnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConnectActionPerformed(evt);
            }
        });

        jButtonDisconnect.setText("Disconnect");
        jButtonDisconnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDisconnectActionPerformed(evt);
            }
        });

        jTextAreaMessage.setColumns(20);
        jTextAreaMessage.setRows(5);
        jScrollPane1.setViewportView(jTextAreaMessage);

        jButtonSync.setText("Sync");
        jButtonSync.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSyncActionPerformed(evt);
            }
        });

        jLabel5.setText("Client:");

        jLabel6.setText("Server:");

        jLabel7.setText("Port:");

        jTextFieldPortServer.setText("9999");
        jTextFieldPortServer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPortServerActionPerformed(evt);
            }
        });

        jButtonConnectServer.setText("Connect");
        jButtonConnectServer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConnectServerActionPerformed(evt);
            }
        });

        jButtonDisconnectServer.setText("Disconnect");
        jButtonDisconnectServer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDisconnectServerActionPerformed(evt);
            }
        });

        jTextFieldPath.setText("DC1-sampleQueries.txt");
        jTextFieldPath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPathActionPerformed(evt);
            }
        });

        jLabel8.setText("Textfile Path:");

        jButtonPath.setText("Load");
        jButtonPath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPathActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelConnectionLayout = new javax.swing.GroupLayout(jPanelConnection);
        jPanelConnection.setLayout(jPanelConnectionLayout);
        jPanelConnectionLayout.setHorizontalGroup(
            jPanelConnectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConnectionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
            .addComponent(jButtonSync, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelConnectionLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanelConnectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelConnectionLayout.createSequentialGroup()
                        .addComponent(jButtonConnect, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonDisconnect))
                    .addGroup(jPanelConnectionLayout.createSequentialGroup()
                        .addGroup(jPanelConnectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelConnectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(jPanelConnectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextFieldIP, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                                .addComponent(jTextFieldPort)))))
                .addGap(35, 35, 35)
                .addComponent(jLabel8)
                .addGroup(jPanelConnectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelConnectionLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanelConnectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelConnectionLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelConnectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelConnectionLayout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jTextFieldPortServer)))
                            .addGroup(jPanelConnectionLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButtonConnectServer, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonDisconnectServer)))
                        .addGap(17, 17, 17))
                    .addGroup(jPanelConnectionLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldPath, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonPath, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))))
        );
        jPanelConnectionLayout.setVerticalGroup(
            jPanelConnectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConnectionLayout.createSequentialGroup()
                .addGroup(jPanelConnectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelConnectionLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(1, 1, 1)
                        .addGroup(jPanelConnectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelConnectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelConnectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonConnect)
                            .addComponent(jButtonDisconnect)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelConnectionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelConnectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTextFieldPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonPath))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addGap(1, 1, 1)
                        .addGroup(jPanelConnectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTextFieldPortServer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelConnectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonConnectServer)
                            .addComponent(jButtonDisconnectServer))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonSync, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Connection", jPanelConnection);

        jLabel3.setText("Search Bar:");

        jTextFieldSearchBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSearchBarActionPerformed(evt);
            }
        });

        jLabel4.setText("Suggestion:");

        jButtonSearch.setText("Search");
        jButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchActionPerformed(evt);
            }
        });

        jTextAreaSuggestion.setColumns(20);
        jTextAreaSuggestion.setRows(5);
        jScrollPane2.setViewportView(jTextAreaSuggestion);

        javax.swing.GroupLayout jPanelCacheLayout = new javax.swing.GroupLayout(jPanelCache);
        jPanelCache.setLayout(jPanelCacheLayout);
        jPanelCacheLayout.setHorizontalGroup(
            jPanelCacheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCacheLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCacheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanelCacheLayout.createSequentialGroup()
                        .addGroup(jPanelCacheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldSearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE))))
        );
        jPanelCacheLayout.setVerticalGroup(
            jPanelCacheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCacheLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCacheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldSearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jButtonSearch))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cache", jPanelCache);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSearchActionPerformed

    private void jButtonSyncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSyncActionPerformed
        // TODO add your handling code here:
        Payload load = new Payload(1, Initialize.filter, null);
        client.send(load);
    }//GEN-LAST:event_jButtonSyncActionPerformed

    private void jTextFieldPortServerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPortServerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPortServerActionPerformed

    private void jTextFieldSearchBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSearchBarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSearchBarActionPerformed

    private void jButtonDisconnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDisconnectActionPerformed
        // TODO add your handling code here:
        jButtonConnect.setEnabled(true);
        jButtonDisconnect.setEnabled(false);
        client.stop();
    }//GEN-LAST:event_jButtonDisconnectActionPerformed

    private void jButtonConnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConnectActionPerformed
            client=new ChatClient(jTextFieldIP.getText(), Integer.parseInt(jTextFieldPort.getText()), this);
                jButtonSync.setEnabled(true);
                jButtonConnect.setEnabled(false);
                jButtonDisconnect.setEnabled(true);
                
    }//GEN-LAST:event_jButtonConnectActionPerformed

    private void jButtonConnectServerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConnectServerActionPerformed
        // TODO add your handling code here:
        server = new ChatServer(Integer.parseInt(jTextFieldPortServer.getText()), GUI.this);
        jButtonConnect.setEnabled(true);
        jPanelCache.setEnabled(true);
        jButtonSearch.setEnabled(true);
        jButtonDisconnectServer.setEnabled(true);
        jButtonConnectServer.setEnabled(false);
    }//GEN-LAST:event_jButtonConnectServerActionPerformed

    private void jButtonDisconnectServerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDisconnectServerActionPerformed
        try {
            // TODO add your handling code here:
            server.stop();
        } catch (IOException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        jButtonConnectServer.setEnabled(true);
        jButtonDisconnectServer.setEnabled(false);
    }//GEN-LAST:event_jButtonDisconnectServerActionPerformed

    private void jTextFieldPathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPathActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPathActionPerformed

    private void jButtonPathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPathActionPerformed
        // TODO add your handling code here:
        if (Initialize.buildStructure(jTextFieldPath.getText()))
            jTextAreaMessage.append("\nDone adding elements.");
    }//GEN-LAST:event_jButtonPathActionPerformed
    
    public void setTextMessage(String message){
        
        jTextAreaMessage.append("\n"+ message);
    }
    
//    public String getTextSend(){
//        
//        return jTextAreaSend.getText();
//    }
    public int getTextPort(){
       return Integer.parseInt(jTextFieldPort.getText());
    }
    
private void getSuggestions(String typed){
   //Clear previous
        topSuggestions = null;
         
        //Get array of current suggestions and build output string
        if (typed != null){
        currentSuggestions = SetInterface.st.keysWithPrefixWeight(typed.toLowerCase());
        for (String s: currentSuggestions) {
                if (s==null && topSuggestions == null)      topSuggestions = "No further suggestions\n";
                if (s==null && topSuggestions != null)      topSuggestions += "\n";
                if (s!=null && topSuggestions != null)      topSuggestions += s + "\n";
                if (s!=null && topSuggestions == null)      topSuggestions = s + "\n";
        }
        jTextAreaSuggestion.setText(topSuggestions);
    }
    if (typed == null) jTextAreaSuggestion.setText("");
}
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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConnect;
    private javax.swing.JButton jButtonConnectServer;
    private javax.swing.JButton jButtonDisconnect;
    private javax.swing.JButton jButtonDisconnectServer;
    private javax.swing.JButton jButtonPath;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JButton jButtonSync;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanelCache;
    private javax.swing.JPanel jPanelConnection;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextAreaMessage;
    private javax.swing.JTextArea jTextAreaSuggestion;
    private javax.swing.JTextField jTextFieldIP;
    private javax.swing.JTextField jTextFieldPath;
    private javax.swing.JTextField jTextFieldPort;
    private javax.swing.JTextField jTextFieldPortServer;
    private javax.swing.JTextField jTextFieldSearchBar;
    // End of variables declaration//GEN-END:variables
    ChatClient client=new ChatClient();
    ChatServer server;
    private String[] currentSuggestions;
    private String topSuggestions; 
}
