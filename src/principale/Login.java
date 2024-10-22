/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package principale;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


/**
 *
 * @author ANDRY
 */
public final class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        Connect();
        ImageIcon myimage = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("user-interface.png")));
        Image img1 = myimage.getImage();
        Dimension labelSize = icon.getPreferredSize();
        Image img2 = img1.getScaledInstance(labelSize.width, labelSize.height, Image.SCALE_SMOOTH);
        ImageIcon i = new ImageIcon(img2);
        icon.setIcon(i);
        identifiant.setText("");
        motdepasse.setText("");
        identifiant.requestFocus();
    }
    
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    
    
    public void Connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/reservationchambre", "root", "");
        }
        catch(ClassNotFoundException | SQLException ex) {
            System.out.println("erreur");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        identifiant = new javax.swing.JTextField();
        motdepasse = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        icon = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 61, -1, -1));

        identifiant.setBackground(new java.awt.Color(51, 51, 51));
        identifiant.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        identifiant.setForeground(new java.awt.Color(255, 255, 255));
        identifiant.setText("Identifiant");
        identifiant.setBorder(null);
        identifiant.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                identifiantFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                identifiantFocusLost(evt);
            }
        });
        jPanel1.add(identifiant, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 293, 40));

        motdepasse.setBackground(new java.awt.Color(51, 51, 51));
        motdepasse.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        motdepasse.setForeground(new java.awt.Color(255, 255, 255));
        motdepasse.setText("Mot de passe");
        motdepasse.setBorder(null);
        motdepasse.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                motdepasseFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                motdepasseFocusLost(evt);
            }
        });
        jPanel1.add(motdepasse, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 293, 40));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 310, 20));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 310, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principale/Pics/lock-white.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 20, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principale/Pics/user-white.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 20, 30));

        jPanel2.setBackground(new java.awt.Color(255, 102, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("    Se connecter");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, 130, 40));

        icon.setPreferredSize(new java.awt.Dimension(180, 170));
        jPanel1.add(icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 180, 170));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 560));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principale/Pics/hotel7.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 560));

        setSize(new java.awt.Dimension(1125, 606));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void identifiantFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_identifiantFocusGained
        
    }//GEN-LAST:event_identifiantFocusGained

    private void identifiantFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_identifiantFocusLost
        //
    }//GEN-LAST:event_identifiantFocusLost

    private void motdepasseFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_motdepasseFocusGained
        
    }//GEN-LAST:event_motdepasseFocusGained

    private void motdepasseFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_motdepasseFocusLost
        //
    }//GEN-LAST:event_motdepasseFocusLost

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        
        /*Acceuil form1 = new Acceuil();
        form1.setVisible(true);
        this.setVisible(false);*/
        String var1 = identifiant.getText();
        String var2 = motdepasse.getText();
        if (!"".equals(var1) && !"".equals(var2)) {
        try {
            String query = "SELECT * FROM utilisateur WHERE Identifiant=? AND Motdepasse=?";
            pst = (PreparedStatement) con.prepareStatement(query);
            pst.setString(1, var1);
            pst.setString(2, var2);
            rs = pst.executeQuery();
            if (rs.next()){
                Acceuil form1 = new Acceuil();
                form1.setVisible(true);
                this.setVisible(false);
            }
            else {
                identifiant.setText("");
                motdepasse.setText("");
                identifiant.requestFocus();
                JOptionPane.showMessageDialog(null, "Utilisateur non spécifié !");
           
            }
        }
        catch (SQLException e){
            System.out.println("Erreur");
        }
        }
        else {
            JOptionPane.showMessageDialog(null, "Champ(s) vide(s) !");
        }
    }//GEN-LAST:event_jLabel5MouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel icon;
    private javax.swing.JTextField identifiant;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField motdepasse;
    // End of variables declaration//GEN-END:variables
}
