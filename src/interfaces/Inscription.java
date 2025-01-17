package interfaces;


import Tools.ConnectionManager;
import Tools.EncryptPassword;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;


public class Inscription extends javax.swing.JFrame {
    
    
	// Les �l�ments de connection à la base de donn�es 
    Connection connection = null;       
    ResultSet rs = null;                
    ResultSet rs2 = null;
    PreparedStatement ps = null;
    EncryptPassword encryptPwd;
    
    
    //------------ Cosnstructeur ----------
    public Inscription() throws SQLException, ClassNotFoundException {
        initComponents();
        this.errorLbl.setVisible(false);
        
        
        //--------- Se connecter à la BDD 
        connection = ConnectionManager.getConnection();
    
        
        //----- Centrer la fenetre 
        Dimension screenSize,frameSize;
        int x,y;
        screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frameSize=getSize();
        x=(screenSize.width-frameSize.width)/2;
        y=(screenSize.height-frameSize.height)/2;
        setLocation(x, y);
        
        //------ mettre la fenetre non Resizable
        this.setResizable(false);
        
        //------ Icon de frame
        Image icon = Toolkit.getDefaultToolkit().getImage(Inscription.class.getResource("/images/o3.png"));  
        this.setIconImage(icon);  
        
        //------ Titre de frame
        this.setTitle("Inscription");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {

    	contentPane = new javax.swing.JPanel();
        titleLbl = new javax.swing.JLabel();
        emailLbl = new javax.swing.JLabel();
        passwordLbl = new javax.swing.JLabel();
        emailTxt = new javax.swing.JTextField();
        passwordTxt = new javax.swing.JPasswordField();
        nomTxt = new javax.swing.JTextField();
        nomLbl = new javax.swing.JLabel();
        inscriptionBtn = new javax.swing.JButton();
        errorLbl = new javax.swing.JLabel();
        exit = new javax.swing.JButton();
        connexionBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(197, 170, 200));

        contentPane.setBackground(new java.awt.Color(197, 170, 200));
        contentPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleLbl.setBackground(new java.awt.Color(255, 153, 0));
        titleLbl.setFont(new java.awt.Font("Charlemagne Std", 1, 36)); // NOI18N
        titleLbl.setForeground(new java.awt.Color(128, 100, 131));
        titleLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLbl.setText("creez votre compte !");
        contentPane.add(titleLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 370, 50));

        emailLbl.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        emailLbl.setText("E-mail :");
        contentPane.add(emailLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 127, 41));

        passwordLbl.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        passwordLbl.setText("Mot de passe :");
        contentPane.add(passwordLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, 42));

        emailTxt.setBackground(new java.awt.Color(250, 249, 241));
        emailTxt.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        emailTxt.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        emailTxt.setToolTipText("Entrer votre e-mail ici");
        contentPane.add(emailTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 140, 250, 41));

        passwordTxt.setBackground(new java.awt.Color(250, 249, 241));
        passwordTxt.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        passwordTxt.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        contentPane.add(passwordTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 210, 250, 42));

        nomTxt.setBackground(new java.awt.Color(250, 249, 241));
        nomTxt.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        nomTxt.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        contentPane.add(nomTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 70, 250, 41));

        nomLbl.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        nomLbl.setText("Nom :");
        contentPane.add(nomLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 127, 41));

        inscriptionBtn.setBackground(new java.awt.Color(128, 100, 131));
        inscriptionBtn.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        inscriptionBtn.setForeground(new java.awt.Color(0, 0, 0));
        inscriptionBtn.setText("S'inscrire");
        inscriptionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inscriptionBtnActionPerformed(evt);
            }
        });
        contentPane.add(inscriptionBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, -1, 40));

        errorLbl.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        errorLbl.setForeground(new java.awt.Color(255, 0, 0));
        errorLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        errorLbl.setText("Ce compte d�j� existe !");
        contentPane.add(errorLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 150, -1, 31));

        exit.setBackground(new java.awt.Color(128, 100, 131));
        exit.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        exit.setForeground(new java.awt.Color(0, 0, 0));
        exit.setText("Quitter");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        contentPane.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, 95, 41));

        connexionBtn.setBackground(new java.awt.Color(128, 100, 131));
        connexionBtn.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        connexionBtn.setForeground(new java.awt.Color(0, 0, 0));
        connexionBtn.setText("Se connecter");
        connexionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connexionBtnActionPerformed(evt);
            }
        });
        contentPane.add(connexionBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, -1, 41));
        contentPane.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(477, 79, 225, 199));
        contentPane.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 90, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(contentPane, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
     }// </editor-fold>                        
    

     //------------ Button d'inscription ----------
    private void inscriptionBtnActionPerformed(java.awt.event.ActionEvent evt) {
        String nomUser = this.nomTxt.getText();
        String emailUser = this.emailTxt.getText();
        String passwordUser = this.passwordTxt.getText();
        
        try {
            try {
                encryptPwd = new EncryptPassword();
            } catch (Exception ex) {
                Logger.getLogger(Authentification.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.errorLbl.setVisible(false);
            
            //------- la requete d'insertion
            String qry = "insert into user(nomUser, emailUser, passwordUser) values(? , ?, ?)";
            ps = connection.prepareStatement(qry);
            ps.setString(1, nomUser);
            ps.setString(2, emailUser);
            ps.setString(3, encryptPwd.encrypt(passwordUser));
            ps.executeUpdate();
            
            //------- On s'authentifier en recuperant l'email et le password
            Authentification auth = new Authentification(emailUser, passwordUser);
            auth.setVisible(true);
            
            dispose();  //-----fermer la fen�tre
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            this.errorLbl.setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Inscription.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

     //------------ Button Quitter ----------
    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        dispose();    
    }

     //------------ Button de connexion ----------
    private void connexionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connexionBtnActionPerformed

        try {
            Authentification auth = new Authentification();
            auth.setVisible(true);
            this.dispose();
            
        } catch (SQLException ex) {
            Logger.getLogger(Inscription.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Inscription.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton connexionBtn;
    private javax.swing.JPanel contentPane;
    private javax.swing.JLabel emailLbl;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JLabel errorLbl;
    private javax.swing.JButton exit;
    private javax.swing.JButton inscriptionBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel nomLbl;
    private javax.swing.JTextField nomTxt;
    private javax.swing.JLabel passwordLbl;
    private javax.swing.JPasswordField passwordTxt;
    private javax.swing.JLabel titleLbl;
    // End of variables declaration//GEN-END:variables
}
