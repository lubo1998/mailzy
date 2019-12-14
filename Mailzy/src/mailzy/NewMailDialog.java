/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mailzy;


import java.util.Date;
import net.atlanticbb.tantlinger.shef.HTMLEditorPane;

/**
 *
 * @author lalexandrov
 */
public class NewMailDialog extends javax.swing.JDialog {


	
	
    /**
     * Creates new form NewMailDialog
     */
    public NewMailDialog(java.awt.Frame parent, boolean modal, Mail blankMail) {
        super(parent, modal);
        initComponents();
        menuBar.add(editor.getEditMenu());
        menuBar.add(editor.getFormatMenu());
        menuBar.add(editor.getInsertMenu());
        
        this.getContentPane().setLayout(null);
        
        labelFrom.setBounds(10,5,50,20);
        labelFrom.setText("From");
        labelTo.setText("To");
        labelSubject.setText("Subject");
		labelTo.setBounds(10,25,50,20);
		labelSubject.setBounds(10,45,50,20);
		textFrom.setBounds(70,5,300,20);
		textTo.setBounds(70,25,300,20);
		textSubject.setBounds(70,45,300,20);
		
		this.getContentPane().add(labelFrom);
		this.getContentPane().add(labelTo);
		this.getContentPane().add(labelSubject);
		this.getContentPane().add(textFrom);
		this.getContentPane().add(textTo);
		this.getContentPane().add(textSubject);
		
		
        button.setBounds(680,665,100,40);
        this.getContentPane().add(button);
        editor.setBounds(0, 80, 780, 600);
        this.getContentPane().add(editor);
        this.setVisible(true);
        
        //blankMail.to= this.to;
        blankMail.body= this.body;
        blankMail.from=this.from;
        blankMail.subject=this.subject;
        blankMail.lastModified=this.date;
    }
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
    	labelFrom = new javax.swing.JLabel();
    	labelTo = new javax.swing.JLabel();
    	labelSubject = new javax.swing.JLabel();
    	
    	textFrom = new javax.swing.JTextField();
    	textTo = new javax.swing.JTextField();
    	textSubject = new javax.swing.JTextField();
    	
        button = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();

        setTitle("New Mail");
        setName("New Mail"); // NOI18N
        setPreferredSize(new java.awt.Dimension(800, 770));
        setResizable(false);

        button.setText("Send");
        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActionPerformed(evt);
                
            }
        });
        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(291, Short.MAX_VALUE)
                .addComponent(button)
                .addGap(66, 66, 66))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(button)
                .addContainerGap(145, Short.MAX_VALUE))
        );

        button.getAccessibleContext().setAccessibleName("button");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActionPerformed
        //TODO: Check if all fields are valid
        this.setVisible(false);
        String toEmail = textTo.getText();
        String subject = textSubject.getText();
        String body = editor.getText();
        String from = textFrom.getText();
        this.subject = subject;
        this.body = body;
        this.from = from;
        this.date = date;
        this.to = toEmail;
        //this.getContentPane().setBackground(Color.red); //Test
    }//GEN-LAST:event_buttonActionPerformed
    
    
    private HTMLEditorPane editor = new HTMLEditorPane();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public String body = null;
    public String from = null;
    public String subject = null;
    public String to=null;
    public Date date = new Date();
    private javax.swing.JButton button;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JLabel labelFrom;
    private javax.swing.JLabel labelTo;
    private javax.swing.JLabel labelSubject;
    private javax.swing.JTextField textFrom;
    private javax.swing.JTextField textTo;
    private javax.swing.JTextField textSubject;
    // End of variables declaration//GEN-END:variables
}
