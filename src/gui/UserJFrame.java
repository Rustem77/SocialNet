/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import ServiceLayer.UserCatalog;
import ServiceLayer.UserException;
import business.User;
import db.DataDBException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author Brasha
 */
public class UserJFrame extends javax.swing.JFrame {

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    private final User currentUser;
    private AboutUserJPanel aboutUserJPanel;
    private FriendsJPanel friendsJPanel;
    private UsersJPanel usersJPanel;
    private ApproveReqJPanel approveReqJPanel;
    private MessegesJPanel messagesJPanel;
    private GroupJPanel1 groupJPanel;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        userPlus = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Друзья");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Сообщения");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Группы");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setText("Моя страница");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        userPlus.setText("0");
        userPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userPlusActionPerformed(evt);
            }
        });

        jButton4.setText("Пользователи");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(344, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userPlus))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(userPlus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addGap(187, 187, 187))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        aboutUserJPanel.setVisible(false);
        usersJPanel.setVisible(false);
        approveReqJPanel.setVisible(false);
        messagesJPanel.setVisible(false);
        groupJPanel.setVisible(false);
        friendsJPanel.setVisible(true);
        friendsJPanel.pressed();
        updateInfo();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        friendsJPanel.setVisible(false);
        usersJPanel.setVisible(false);
        approveReqJPanel.setVisible(false);
        messagesJPanel.setVisible(false);
        groupJPanel.setVisible(false);
        aboutUserJPanel.setVisible(true);
        updateInfo();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void userPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userPlusActionPerformed
        friendsJPanel.setVisible(false);
        usersJPanel.setVisible(false);
        aboutUserJPanel.setVisible(false);
        messagesJPanel.setVisible(false);
        groupJPanel.setVisible(false);
        approveReqJPanel.setVisible(true);
        updateInfo();
    }//GEN-LAST:event_userPlusActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        friendsJPanel.setVisible(false);
        usersJPanel.setVisible(false);
        aboutUserJPanel.setVisible(false);
        approveReqJPanel.setVisible(false);
        groupJPanel.setVisible(false);
        messagesJPanel.setVisible(true);
        messagesJPanel.startPress();
        updateInfo();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        friendsJPanel.setVisible(false);
        usersJPanel.setVisible(false);
        aboutUserJPanel.setVisible(false);
        approveReqJPanel.setVisible(false);
        messagesJPanel.setVisible(false);
        groupJPanel.pressed();
        groupJPanel.setVisible(true);
        updateInfo();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        aboutUserJPanel.setVisible(false);
        friendsJPanel.setVisible(false);
        approveReqJPanel.setVisible(false);
        messagesJPanel.setVisible(false);
        groupJPanel.setVisible(false);
        usersJPanel.setVisible(true);
        usersJPanel.pressed();
        updateInfo();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void updateInfo()
    {
        UserCatalog uc = new UserCatalog();
        int countUser=0;
        try {
            countUser = uc.getRequestTo(currentUser).size();
        } catch (UserException ex) {
            Logger.getLogger(UserJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        userPlus.setText("+"+String.valueOf(countUser));
        approveReqJPanel.updateElements();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton userPlus;
    // End of variables declaration//GEN-END:variables

    public UserJFrame(User user) {
        initComponents();
        currentUser = user;
        aboutUserJPanel = new AboutUserJPanel();
        this.add(aboutUserJPanel);
        aboutUserJPanel.addContent(user);
        
        friendsJPanel = new FriendsJPanel(user);
        this.add(friendsJPanel);
        friendsJPanel.setVisible(false);
        
        approveReqJPanel = new ApproveReqJPanel(user);
        this.add(approveReqJPanel);
        approveReqJPanel.setVisible(false);
        
        messagesJPanel=new MessegesJPanel(user);
        this.add(messagesJPanel);
        messagesJPanel.setVisible(false);
        
        groupJPanel = new GroupJPanel1(user);
        this.add(groupJPanel);
        groupJPanel.setVisible(false);
        
            usersJPanel = new UsersJPanel(user);
        this.add(usersJPanel);
        usersJPanel.setVisible(false);
        updateInfo();
        
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.setVisible(true);
    }
}
