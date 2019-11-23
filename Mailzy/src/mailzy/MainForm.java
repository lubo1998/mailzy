/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mailzy;

import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;
import mailzy.storage.SQLiteConnector;
import net.atlanticbb.tantlinger.shef.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


/**
 *
 * @author hrist
 */
public class MainForm extends javax.swing.JFrame {

    /**
     * Creates new form MainForm
     */
    public MainForm() {
        initComponents();
        this.setVisible(true);
        this.connection = null;
        this.mailListDetails = new ArrayList<String[]>();
        this.mailList.setModel(new DefaultListModel<String>());
        try {
            this.connection = new SQLiteConnector();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(this, "A Database connection error occured!");
            System.exit(1);
        }
        
        String senderMail = "l.alexandrov@ue-varna.bg";
        //TODO: Fetch credentials from file
        
        try {
            this.connection.query("SELECT * FROM mails WHERE sender = '"+ senderMail+"'");
            ResultSet rs = this.connection.fetch();
            while(rs.next()){
                String[] row = new String[]{  
                    rs.getString("sender"),
                    rs.getString("reciever"),
                    rs.getString("recieved_at"),
                    rs.getString("subject"),
                    rs.getString("mail")
                };
                this.mailListDetails.add(row);
                ((DefaultListModel<String>) this.mailList.getModel()).addElement(row[3]);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(this, "A Database query error occured!");
            System.exit(1);
        }
        //TODO: Fetch data from SMTP, show in application and insert in db (cache)
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        detailsPanel = new javax.swing.JPanel();
        fromLabel = new javax.swing.JLabel();
        toLabel = new javax.swing.JLabel();
        subjectLabel = new javax.swing.JLabel();
        mailTextPane = new javax.swing.JScrollPane();
        mailText = new javax.swing.JEditorPane();
        toInput = new javax.swing.JTextField();
        fromInput = new javax.swing.JTextField();
        subjectInput = new javax.swing.JTextField();
        speechPanel = new javax.swing.JPanel();
        newMailBtn = new javax.swing.JButton();
        newMailBtn.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        	}
        });
        speechBtn = new javax.swing.JToggleButton();
        mainMenuBar = new javax.swing.JMenuBar();
        mailMenu = new javax.swing.JMenu();
        newMailItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fromLabel.setText("From:");

        toLabel.setText("To:");

        subjectLabel.setText("Subject:");

        mailText.setContentType("text/html");
        mailText.setEditorKit(null);
        mailTextPane.setViewportView(mailText);
        mailText.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout detailsPanelLayout = new javax.swing.GroupLayout(detailsPanel);
        detailsPanelLayout.setHorizontalGroup(
        	detailsPanelLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(detailsPanelLayout.createSequentialGroup()
        			.addGroup(detailsPanelLayout.createParallelGroup(Alignment.LEADING)
        				.addGroup(detailsPanelLayout.createSequentialGroup()
        					.addGroup(detailsPanelLayout.createParallelGroup(Alignment.LEADING)
        						.addComponent(subjectLabel)
        						.addComponent(toLabel, Alignment.TRAILING)
        						.addComponent(fromLabel, Alignment.TRAILING))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(detailsPanelLayout.createParallelGroup(Alignment.LEADING)
        						.addComponent(toInput, GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
        						.addComponent(fromInput, GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
        						.addComponent(subjectInput, GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)))
        				.addComponent(mailTextPane, GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE))
        			.addContainerGap())
        );
        detailsPanelLayout.setVerticalGroup(
        	detailsPanelLayout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(detailsPanelLayout.createSequentialGroup()
        			.addGap(1)
        			.addGroup(detailsPanelLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(fromInput, GroupLayout.PREFERRED_SIZE, 31, Short.MAX_VALUE)
        				.addComponent(fromLabel))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(detailsPanelLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(toLabel)
        				.addComponent(toInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(detailsPanelLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(subjectInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(subjectLabel))
        			.addGap(18)
        			.addComponent(mailTextPane, GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE))
        );
        detailsPanel.setLayout(detailsPanelLayout);

        newMailBtn.setText("New mail");

        javax.swing.GroupLayout speechPanelLayout = new javax.swing.GroupLayout(speechPanel);
        speechPanelLayout.setHorizontalGroup(
        	speechPanelLayout.createParallelGroup(Alignment.TRAILING)
        		.addComponent(newMailBtn, GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );
        speechPanelLayout.setVerticalGroup(
        	speechPanelLayout.createParallelGroup(Alignment.TRAILING)
        		.addComponent(newMailBtn, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
        );
        speechPanel.setLayout(speechPanelLayout);

        speechBtn.setText("Speech");

        mailMenu.setText("New Mail");
        mailMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mailMenuActionPerformed(evt);
            }
        });

        newMailItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        newMailItem.setText("New");
        newMailItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newMailItemActionPerformed(evt);
            }
        });
        mailMenu.add(newMailItem);

        mainMenuBar.add(mailMenu);

        setJMenuBar(mainMenuBar);
        
        mailList = new JList();
        
        JPanel jPanelMenu = new JPanel();
        jPanelMenu.setBackground(Color.ORANGE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(jPanelMenu, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(mailList, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE))
        				.addComponent(speechPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(10)
        					.addComponent(detailsPanel, GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE))
        				.addGroup(layout.createSequentialGroup()
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(speechBtn))))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jPanelMenu, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addComponent(mailList, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
        				.addComponent(detailsPanel, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(speechPanel, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        				.addComponent(speechBtn, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)))
        );
        
        JLabel lblMenu = new JLabel("Menu");
        lblMenu.setForeground(Color.YELLOW);
        lblMenu.setBackground(new Color(255, 0, 0));
        lblMenu.addMouseListener(new MouseAdapter() {
        	
        	int x = 210;
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		
        		//System.out.println( jPanelMenu.getLocationOnScreen().getY() - getContentPane().getLocationOnScreen().getY());
                System.out.println(jPanelMenu.getSize().height);
        		if (x == 210) {
            		//jPanelMenu.setSize(jPanelMenu.getSize().w,jPanelMenu.getSize().height);
                            Thread th = new Thread() {
                @Override
                public void run() {
                    for (int i = 210; i >= 40; i--) {
                        try {
                            Thread.sleep(5);
                        } catch (InterruptedException ex) {
                            
                        }
                        jPanelMenu.setSize(i,jPanelMenu.getSize().height);
                        
                    }
                    System.out.println(lblMenu.getLocation());
                    
                    lblMenu.setLocation(5, 10);
            }
            			
            			
         
                            };th.start();
                            x=0;
        } 
        		System.out.println("DONE");
        	}
        	@Override
        	public void mouseEntered(MouseEvent e) {
        		lblMenu.setBackground(Color.black);
        	}
        });
        GroupLayout gl_jPanelMenu = new GroupLayout(jPanelMenu);
        gl_jPanelMenu.setHorizontalGroup(
        	gl_jPanelMenu.createParallelGroup(Alignment.TRAILING)
        		.addGroup(gl_jPanelMenu.createSequentialGroup()
        			.addContainerGap(144, Short.MAX_VALUE)
        			.addComponent(lblMenu, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap())
        );
        gl_jPanelMenu.setVerticalGroup(
        	gl_jPanelMenu.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_jPanelMenu.createSequentialGroup()
        			.addGap(10)
        			.addComponent(lblMenu, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(416, Short.MAX_VALUE))
        );
        jPanelMenu.setLayout(gl_jPanelMenu);
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mailMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mailMenuActionPerformed

        
    }//GEN-LAST:event_mailMenuActionPerformed

    private void newMailItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newMailItemActionPerformed
        HTMLEditorPane editor = new HTMLEditorPane();
        JFrame frame = new JFrame();
        JMenuBar menuBar = new JMenuBar();
        menuBar.add(editor.getEditMenu());
        menuBar.add(editor.getFormatMenu());
        menuBar.add(editor.getInsertMenu());
        frame.setJMenuBar(menuBar);

        frame.setTitle("New Mail");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.getContentPane().add(editor);
        frame.setVisible(true);
    }//GEN-LAST:event_newMailItemActionPerformed
    private ArrayList<String[]> mailListDetails;
    private SQLiteConnector connection;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel detailsPanel;
    private javax.swing.JTextField fromInput;
    private javax.swing.JLabel fromLabel;
    private javax.swing.JMenu mailMenu;
    private javax.swing.JEditorPane mailText;
    private javax.swing.JScrollPane mailTextPane;
    private javax.swing.JMenuBar mainMenuBar;
    private javax.swing.JButton newMailBtn;
    private javax.swing.JMenuItem newMailItem;
    private javax.swing.JToggleButton speechBtn;
    private javax.swing.JPanel speechPanel;
    private javax.swing.JTextField subjectInput;
    private javax.swing.JLabel subjectLabel;
    private javax.swing.JTextField toInput;
    private javax.swing.JLabel toLabel;
    private JList mailList;
}
