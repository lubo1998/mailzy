/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mailzy;


import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import mailzy.storage.Authenticator;
import java.awt.Toolkit;


/**
 *
 * @author hrist
 */
public class LoginForm extends javax.swing.JDialog {
    
    /**
     * Creates new form LoginForm
     */
    public LoginForm(JFrame frame, Authenticator authenticator) {
        super(frame, true);
        setIconImage(Toolkit.getDefaultToolkit().getImage(LoginForm.class.getResource("/swing/images/imgonline-com-ua-resize-aIgUusatZM6xk.png")));
        //setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);  //just for testing
        initComponents();
        this.authenticator = authenticator;
        this.setResizable(false);
        passwordVisible.setVisible(false);
        account.setText("Enter your account");
        
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        loginIcon = new javax.swing.JLabel();
        passwordIcon = new javax.swing.JLabel();
        emailIcon1 = new javax.swing.JLabel();
        account = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        passwordVisible = new javax.swing.JLabel();
        loginButton1 = new javax.swing.JButton();
        gmailLabel = new javax.swing.JLabel();
        abvLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        rememberMe = new javax.swing.JCheckBox();
        outlookLabel = new javax.swing.JLabel();
        errorLabel = new javax.swing.JLabel();

        setTitle("Login");
        setBackground(new java.awt.Color(255, 255, 255));
        setFocusCycleRoot(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setPreferredSize(new java.awt.Dimension(400, 727));

        jPanel2.setBackground(new java.awt.Color(29, 44, 99));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Mailzy");
        jLabel1.setMaximumSize(new java.awt.Dimension(150, 50));
        jLabel1.setMinimumSize(new java.awt.Dimension(150, 50));
        jLabel1.setName("LOGO"); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(150, 50));

        loginIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_login_127px_1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(loginIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loginIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE))
                .addContainerGap())
        );

        passwordIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_password_80px.png"))); // NOI18N

        emailIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_send_hot_list_80px.png"))); // NOI18N

        account.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        account.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        account.setText("Enter you account");
        account.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                accountFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                accountFocusLost(evt);
            }
        });

        password.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        password.setText("SamplePassword");
        password.setPreferredSize(new java.awt.Dimension(93, 28));
        password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordFocusLost(evt);
            }
        });

        passwordVisible.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_invisible_40px.png"))); // NOI18N
        passwordVisible.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordVisibleMouseClicked(evt);
            }
        });

        loginButton1.setBackground(new java.awt.Color(29, 44, 99));
        loginButton1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        loginButton1.setForeground(new java.awt.Color(255, 255, 255));
        loginButton1.setText("Login");
        loginButton1.setToolTipText("");
        loginButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButton1ActionPerformed(evt);
            }
        });

        gmailLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_gmail_35px_1.png"))); // NOI18N
        gmailLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gmailLabelMouseClicked(evt);
            }
        });

        abvLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        abvLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/abv-logo.png"))); // NOI18N
        abvLabel.setMaximumSize(new java.awt.Dimension(20, 20));
        abvLabel.setMinimumSize(new java.awt.Dimension(20, 20));
        abvLabel.setPreferredSize(new java.awt.Dimension(20, 20));
        abvLabel.setRequestFocusEnabled(false);
        abvLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                abvLabelMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Register");

        rememberMe.setSelected(true);
        rememberMe.setText("Remember me");

        outlookLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_microsoft_outlook_35px_1.png"))); // NOI18N
        outlookLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                outlookLabelMouseClicked(evt);
            }
        });

        errorLabel.setForeground(new java.awt.Color(255, 51, 51));
        errorLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(emailIcon1)
                        .addGap(18, 18, 18)
                        .addComponent(account, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(passwordIcon)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(loginButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(passwordVisible, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(errorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rememberMe)
                                    .addGap(40, 40, 40))))))
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(gmailLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(outlookLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(abvLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(account, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(emailIcon1)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(48, 48, 48)
                            .addComponent(passwordVisible))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(25, 25, 25)
                            .addComponent(passwordIcon)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(loginButton1)
                .addGap(16, 16, 16)
                .addComponent(errorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rememberMe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(outlookLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gmailLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(abvLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
        ImageIcon iconVisible = new ImageIcon(getClass().getResource("..//swing//images//icons8_eye_40px.png"));
        //ImageIcon iconInvisible = new ImageIcon(getClass().getResource("icons8_invisible_40px.png")); // another way but must png file exist in mailzy folder
        ImageIcon iconInvisible = new ImageIcon(getClass().getResource("..//swing//images//icons8_invisible_40px.png"));
        
        
    private void passwordVisibleMouseClicked(java.awt.event.MouseEvent evt) {  //Change text to * or * to text on click and change icons                                                   
    	if(passwdVisibleClicked==false){
            password.setEchoChar((char)0);
            passwdVisibleClicked=true;
            passwordVisible.setIcon(iconVisible);
        }
        else{
            password.setEchoChar('*');
            passwdVisibleClicked=false;
            passwordVisible.setIcon(iconInvisible);
        }
    }
    
    private void gmailLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gmailLabelMouseClicked
        // TODO add your handling code here:
        String url = "https://accounts.google.com/signup/v2/webcreateaccount?service=accountsettings&continue=https%3A%2F%2Fmyaccount.google.com%2Fb%2F110810760468130681345%2F%3Futm_source%3Dsign_in_no_continue%26nlr%3D1%26pageId%3Dnone&dsh=S-1710728375%3A1574237796118791&gmb=exp&biz=false&flowName=GlifWebSignIn&flowEntry=SignUp";
        if(Desktop.isDesktopSupported()){
            Desktop desktop = Desktop.getDesktop();
            try {
                desktop.browse(new URI(url));
            } catch (IOException | URISyntaxException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }else{
            Runtime runtime = Runtime.getRuntime();
            try {
                runtime.exec("xdg-open " + url);
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    
    }//GEN-LAST:event_gmailLabelMouseClicked

    private void abvLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_abvLabelMouseClicked
        // TODO add your handling code here:
        String url = "https://passport.abv.bg/app/profiles/registration";
        if(Desktop.isDesktopSupported()){
            Desktop desktop = Desktop.getDesktop();
            try {
                desktop.browse(new URI(url));
            } catch (IOException | URISyntaxException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }else{
            Runtime runtime = Runtime.getRuntime();
            try {
                runtime.exec("xdg-open " + url);
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_abvLabelMouseClicked

    private void outlookLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_outlookLabelMouseClicked
        // TODO add your handling code here:
        String url = "https://signup.live.com/?lic=1";
        if(Desktop.isDesktopSupported()){
            Desktop desktop = Desktop.getDesktop();
            try {
                desktop.browse(new URI(url));
            } catch (IOException | URISyntaxException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }else{
            Runtime runtime = Runtime.getRuntime();
            try {
                runtime.exec("xdg-open " + url);
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_outlookLabelMouseClicked

    private void loginButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButton1ActionPerformed
        if( account.getText().isBlank() || String.valueOf(password.getPassword()).isBlank() 
        || "Enter your account".equals(account.getText())){
            errorLabel.setText("Plese enter email and password!");
        } else{             
            String fullAccount=account.getText();
            int firstIndex = fullAccount.indexOf("@");
            //System.out.println("First occurrence of char @"+ 
            //      " is found at : " + firstIndex); 
            char[] passwordText =  password.getPassword();
            if(firstIndex>0){
                String mailSystem=fullAccount.substring(fullAccount.lastIndexOf("@")+1);
                System.out.println("Mail System " + mailSystem); //print only text after @
                try {
                    this.authenticator.saveCredentials(fullAccount, String.valueOf(passwordText));
                    this.authenticator.setforgetOnExit(!rememberMe.isSelected());
                    this.setVisible(false);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this,"Something went wrong!");
                    System.exit(1);
                } finally {
                    for(int i=0; i<passwordText.length; i++)
                        passwordText[i] = '*'; //Due to security reasons! Reccomended by .getPassword() doc.
                }
            } else {
                System.out.println("No Mail System");
                JOptionPane.showMessageDialog(this,"Please enter valid email!");
            }

        }
    }//GEN-LAST:event_loginButton1ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        System.exit(0);
    }//GEN-LAST:event_formWindowClosing

    private void passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusGained
        if("SamplePassword".equals(String.valueOf(password.getPassword()))){
            password.setText("");
        }
        passwordVisible.setVisible(true);
    }//GEN-LAST:event_passwordFocusGained

    private void accountFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_accountFocusGained
        if("Enter your account".equals(account.getText()))
            account.setText("");
    }//GEN-LAST:event_accountFocusGained

    private void accountFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_accountFocusLost
        if(account.getText().isBlank()){
            account.setText("Enter your account");
        }
    }//GEN-LAST:event_accountFocusLost

    private void passwordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusLost
        if(password.getPassword().length == 0){
            password.setText("SamplePassword");
        }
        passwordVisible.setVisible(false);
    }//GEN-LAST:event_passwordFocusLost
    
        
        

    private boolean passwdVisibleClicked = false;
    private final Authenticator authenticator;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel abvLabel;
    private javax.swing.JTextField account;
    private javax.swing.JLabel emailIcon1;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JLabel gmailLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton loginButton1;
    private javax.swing.JLabel loginIcon;
    private javax.swing.JLabel outlookLabel;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel passwordIcon;
    private javax.swing.JLabel passwordVisible;
    private javax.swing.JCheckBox rememberMe;
    // End of variables declaration//GEN-END:variables
}
