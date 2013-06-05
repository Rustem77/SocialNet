/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import business.Group;
import business.GroupMessage;
import business.User;
import db.DataDBException;
import db.MessagesDBWorker;
import db.groupInvDBWorker;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Brasha
 */
public class AboutGroupJPanel1 extends javax.swing.JPanel {

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelID = new javax.swing.JLabel();
        jLabelFName = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelID.setText("ID");

        jLabelFName.setText("Name");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("ID группы:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Имя:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("О группе:");

        jTextArea1.setColumns(20);
        jTextArea1.setEditable(false);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jScrollPane2.setViewportView(jList1);

        jButton1.setText("Написать");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Удалить");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addComponent(jTextField1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelFName)
                            .addComponent(jLabelID)))
                    .addComponent(jLabel8)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelID)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabelFName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    private User user;
    private Group group;
    MessagesDBWorker mdb = new MessagesDBWorker();
    Vector elements = new Vector<String>();
    ArrayList<GroupMessage> GML = new ArrayList<>();
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            if(jTextField1.getText()!=null)
                mdb.insertGroupMessage(user, group, jTextField1.getText());
            else
                JOptionPane.showMessageDialog(null, "Невозможно отправить пустое сообщение!", "Ошибка", 1);
        } catch (DataDBException ex) {
            JOptionPane.showMessageDialog(null, "Ошибка при отправке сообщения!", "Ошибка", 1);
        }
        try {
            GML = mdb.GetGroupMessageTo(group.getID());
            int size = GML.size();
            for(int i=0;i<size;i++)
            {
                elements.add(GML.get(i).getSender().getFirstName() + " " + GML.get(i).getSender().getLastName()+": "+GML.get(i).getMessageData());
            }
        
            jList1.setListData(elements);
        } catch (DataDBException ex) {
            JOptionPane.showMessageDialog(null, "Ошибка при отображении сообщений!", "Ошибка", 1);
        }
        this.updateUI();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(user.getID() == group.getAdminID())
        {
            try
        {
               try {
                mdb.DeleteMessage(GML.get(jList1.getSelectedIndex()).getMessageID());
                try {
                    GML = mdb.GetGroupMessageTo(group.getID());
                    int size = GML.size();
                    for (int i = 0; i < size; i++) {
                        elements.add(GML.get(i).getSender().getFirstName() + " " + GML.get(i).getSender().getLastName() + ": " + GML.get(i).getMessageData());
                    }

                    jList1.setListData(elements);
                    jList1.updateUI();
                } catch (DataDBException ex) {
                    JOptionPane.showMessageDialog(null, "Ошибка при отображении сообщений!", "Ошибка", 1);
                }
            } catch (DataDBException ex) {
                JOptionPane.showMessageDialog(null, "Ошибка при удалении сообщения!", "Ошибка", 1);
            }
            
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            JOptionPane.showMessageDialog(null, "Ни одно сообщение не выбрано", "Ошибка", 1);
        }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelFName;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

     /**
     * Creates new form NewJPanel
     */
    public AboutGroupJPanel1() {
        initComponents();
        setBounds(10,20,280,280);
    }
    
    public void addContent(Group gr, User us)
    {
        group =gr;
        user=us;
        jLabelID.setText(String.valueOf(group.getID()));
        jLabelFName.setText(group.getName());
        jTextArea1.setText(group.getAbout());
        try {
            GML = mdb.GetGroupMessageTo(group.getID());
            int size = GML.size();
            for(int i=0;i<size;i++)
            {
                elements.add(GML.get(i).getSender().getFirstName() + " " + GML.get(i).getSender().getLastName()+": "+GML.get(i).getMessageData());
            }
        
            jList1.setListData(elements);
        } catch (DataDBException ex) {
            JOptionPane.showMessageDialog(null, "Ошибка при отображении сообщений!", "Ошибка", 1);
        }
        groupInvDBWorker gidb = new groupInvDBWorker("jdbc:derby://localhost:1527/SocialNetwork", "pabragin", "147896321");
        try {
            boolean contains = false;
            int i=0;
            for(i=0;i<gidb.GetAllUser(group.getID()).size();i++)
            {
                if(gidb.GetAllUser(group.getID()).get(0).getID()==user.getID())
                    contains = true;
            }
            if(contains)
            {
                
                jPanel1.setVisible(true);
                if(group.getAdminID() == user.getID())
                    jButton2.setVisible(true);
                else 
                    jButton2.setVisible(false);
            }
            else
                jPanel1.setVisible(false);
        } catch (DataDBException ex) {
            Logger.getLogger(AboutGroupJPanel1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
