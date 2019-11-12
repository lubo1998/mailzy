/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mailzy;

import javax.swing.*;
import net.atlanticbb.tantlinger.shef.*;


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


    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mailList = new javax.swing.JScrollPane();
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
        detailsPanel.setLayout(detailsPanelLayout);
        detailsPanelLayout.setHorizontalGroup(
            detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailsPanelLayout.createSequentialGroup()
                .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mailTextPane)
                    .addGroup(detailsPanelLayout.createSequentialGroup()
                        .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(subjectLabel)
                            .addComponent(toLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(fromLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(toInput)
                            .addComponent(fromInput, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
                            .addComponent(subjectInput))))
                .addContainerGap())
        );
        detailsPanelLayout.setVerticalGroup(
            detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, detailsPanelLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fromInput, javax.swing.GroupLayout.PREFERRED_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(fromLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(toLabel)
                    .addComponent(toInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subjectInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subjectLabel))
                .addGap(18, 18, 18)
                .addComponent(mailTextPane, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        newMailBtn.setText("New mail");

        javax.swing.GroupLayout speechPanelLayout = new javax.swing.GroupLayout(speechPanel);
        speechPanel.setLayout(speechPanelLayout);
        speechPanelLayout.setHorizontalGroup(
            speechPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(newMailBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        speechPanelLayout.setVerticalGroup(
            speechPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(speechPanelLayout.createSequentialGroup()
                .addComponent(newMailBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(mailList, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                    .addComponent(speechPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(detailsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(speechBtn)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(mailList)
                    .addComponent(detailsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(speechPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(speechBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel detailsPanel;
    private javax.swing.JTextField fromInput;
    private javax.swing.JLabel fromLabel;
    private javax.swing.JScrollPane mailList;
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
    // End of variables declaration//GEN-END:variables
}
