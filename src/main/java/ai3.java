
import static com.sun.java.accessibility.util.AWTEventMonitor.addActionListener;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class ai3 extends javax.swing.JFrame {

    /**
     * Creates new form ai3
     */
     private String startGame="X";
      private String winner="";
    private int xCount=0;
    private int oCount=0;
    private int bestscore=0;
    boolean checker;
    private String AI="O";
    private String human="X";
     
    
    
    public ai3() {
        initComponents();
    }
    
     private void gameScore()
    {
        
        jbplayerx.setText(String.valueOf(xCount));
        jbplayero.setText(String.valueOf(oCount));
    }
     
     
     
    private void next_turn()
    {
       
      
      for (int i = 0; i < 1; i++) {
        if(jButton2.getText() == ""){
           
             jButton2.setText(AI); 
              break;
        } 
        
        if(jButton3.getText() == ""){
             jButton3.setText(AI);
             break;
        } 
        if(jButton4.getText() == ""){
             jButton4.setText(AI);
             break;
        } 
        if(jButton5.getText() == ""){
             jButton5.setText(AI);
             break;
        } 
        if(jButton6.getText() == ""){
             jButton6.setText(AI);
             break;
        } 
        if(jButton7.getText() == ""){
             jButton7.setText(AI);
             break;
        } 
        if(jButton8.getText() == ""){
             jButton8.setText(AI);
             break;
        } 
        if(jButton9.getText() == ""){
             jButton9.setText(AI);
             break;
        } 
        if(jButton10.getText() == ""){
             jButton10.setText(AI);
             break;
        } 
      }
    }
     
    
   
    
     private String choose_player()
    {
        
       
          return human;
          
       
     
    }
     
    private void winningGame(){
         winner = null;
         String b2=jButton2.getText();
         String b10=jButton10.getText();
         String b3=jButton3.getText();
         String b4=jButton4.getText();
         String b5=jButton5.getText();
         String b6=jButton6.getText();
         String b7=jButton7.getText();
         String b8=jButton8.getText();
         String b9=jButton9.getText();
         
         //HORIZONTAL X&O
         
         
         if(b2==("X") && b10==("X") && b3==("X"))
         {
         JOptionPane.showMessageDialog(this,"Player X win","Tic Tac Toe",
            JOptionPane.INFORMATION_MESSAGE);
          jButton2.setBackground(Color.ORANGE);
          jButton10.setBackground(Color.ORANGE);
          jButton3.setBackground(Color.ORANGE);
          
          xCount++;
          gameScore();
          winner = "X";
         }
         
         if(b4==("X") && b5==("X") && b6==("X"))
         {
         JOptionPane.showMessageDialog(this,"Player X win","Tic Tac Toe",
            JOptionPane.INFORMATION_MESSAGE);
          jButton4.setBackground(Color.CYAN);
          jButton5.setBackground(Color.CYAN);
          jButton6.setBackground(Color.CYAN);
          
          xCount++;
          gameScore();
          winner = "X";
         }
         
          if(b7==("X") && b8==("X") && b9==("X"))
         {
         JOptionPane.showMessageDialog(this,"Player X win","Tic Tac Toe",
            JOptionPane.INFORMATION_MESSAGE);
          jButton7.setBackground(Color.GREEN);
          jButton8.setBackground(Color.GREEN);
          jButton9.setBackground(Color.GREEN);
          
          xCount++;
          gameScore();
          winner = "X";
         }
         
           if(b2==("O") && b10==("O") && b3==("O"))
         {
         JOptionPane.showMessageDialog(this,"Player O win","Tic Tac Toe",
            JOptionPane.INFORMATION_MESSAGE);
          jButton2.setBackground(Color.ORANGE);
          jButton10.setBackground(Color.ORANGE);
          jButton3.setBackground(Color.ORANGE);
          
          oCount++;
          gameScore();
          winner = "O";
         }
         
         if(b4==("O") && b5==("O") && b6==("O"))
         {
         JOptionPane.showMessageDialog(this,"Player O win","Tic Tac Toe",
            JOptionPane.INFORMATION_MESSAGE);
          jButton4.setBackground(Color.CYAN);
          jButton5.setBackground(Color.CYAN);
          jButton6.setBackground(Color.CYAN);
          
          oCount++;
          gameScore();
          winner = "0";
         }
         
          if(b7==("O") && b8==("O") && b9==("O"))
         {
         JOptionPane.showMessageDialog(this,"Player O win","Tic Tac Toe",
            JOptionPane.INFORMATION_MESSAGE);
          jButton7.setBackground(Color.GREEN);
          jButton8.setBackground(Color.GREEN);
          jButton9.setBackground(Color.GREEN);
          
          oCount++;
          gameScore();
          winner = "O";
         }
          
          //VERTICAL X&O
          
           if(b2==("X") && b4==("X") && b7==("X"))
         {
         JOptionPane.showMessageDialog(this,"Player X win","Tic Tac Toe",
            JOptionPane.INFORMATION_MESSAGE);
          jButton2.setBackground(Color.GREEN);
          jButton4.setBackground(Color.GREEN);
          jButton7.setBackground(Color.GREEN);
          
          xCount++;
          gameScore();
          winner = "X";
         }
           
            if(b10==("X") && b5==("X") && b8==("X"))
         {
         JOptionPane.showMessageDialog(this,"Player X win","Tic Tac Toe",
            JOptionPane.INFORMATION_MESSAGE);
          jButton10.setBackground(Color.GREEN);
          jButton5.setBackground(Color.GREEN);
          jButton8.setBackground(Color.GREEN);
          
          xCount++;
          gameScore();
          winner = "X";
         }
            
             if(b3==("X") && b6==("X") && b9==("X"))
         {
         JOptionPane.showMessageDialog(this,"Player X win","Tic Tac Toe",
            JOptionPane.INFORMATION_MESSAGE);
          jButton3.setBackground(Color.GREEN);
          jButton6.setBackground(Color.GREEN);
          jButton9.setBackground(Color.GREEN);
          
          xCount++;
          gameScore();
          winner = "X";
         }
             
               if(b2==("O") && b4==("O") && b7==("O"))
         {
         JOptionPane.showMessageDialog(this,"Player O win","Tic Tac Toe",
            JOptionPane.INFORMATION_MESSAGE);
          jButton2.setBackground(Color.GREEN);
          jButton4.setBackground(Color.GREEN);
          jButton7.setBackground(Color.GREEN);
          
          oCount++;
          gameScore();
          winner = "O";
         }
           
            if(b10==("O") && b5==("O") && b8==("O"))
         {
         JOptionPane.showMessageDialog(this,"Player O win","Tic Tac Toe",
            JOptionPane.INFORMATION_MESSAGE);
          jButton10.setBackground(Color.GREEN);
          jButton5.setBackground(Color.GREEN);
          jButton8.setBackground(Color.GREEN);
          
          oCount++;
          gameScore();
          winner = "O";
         }
            
             if(b3==("O") && b6==("O") && b9==("O"))
         {
         JOptionPane.showMessageDialog(this,"Player O win","Tic Tac Toe",
            JOptionPane.INFORMATION_MESSAGE);
          jButton3.setBackground(Color.GREEN);
          jButton6.setBackground(Color.GREEN);
          jButton9.setBackground(Color.GREEN);
          
          oCount++;
          gameScore();
          winner = "O";
         }
         
             //DIAGONAL X&O
             
                  if(b2==("X") && b5==("X") && b9==("X"))
         {
         JOptionPane.showMessageDialog(this,"Player X win","Tic Tac Toe",
            JOptionPane.INFORMATION_MESSAGE);
          jButton2.setBackground(Color.GREEN);
          jButton5.setBackground(Color.GREEN);
          jButton9.setBackground(Color.GREEN);
          
          xCount++;
          gameScore();
          winner = "X";
         } 
               
                    if(b3==("X") && b5==("X") && b7==("X"))
         {
         JOptionPane.showMessageDialog(this,"Player X win","Tic Tac Toe",
            JOptionPane.INFORMATION_MESSAGE);
          jButton3.setBackground(Color.GREEN);
          jButton5.setBackground(Color.GREEN);
          jButton7.setBackground(Color.GREEN);
          
          xCount++;
          gameScore();
          winner = "X";
         } 
             
               if(b2==("O") && b5==("O") && b9==("O"))
         {
         JOptionPane.showMessageDialog(this,"Player O win","Tic Tac Toe",
            JOptionPane.INFORMATION_MESSAGE);
          jButton2.setBackground(Color.GREEN);
          jButton5.setBackground(Color.GREEN);
          jButton9.setBackground(Color.GREEN);
          
          oCount++;
          gameScore();
          winner = "O";
         } 
               
                    if(b3==("O") && b5==("O") && b7==("O"))
         {
         JOptionPane.showMessageDialog(this,"Player O win","Tic Tac Toe",
            JOptionPane.INFORMATION_MESSAGE);
          jButton3.setBackground(Color.GREEN);
          jButton5.setBackground(Color.GREEN);
          jButton7.setBackground(Color.GREEN);
          
          oCount++;
          gameScore();
          winner = "0";
         } 
          if(winner == null && b2!="" &&b3!=""&&b4!=""&&b5!=""&&b6!=""&&b7!=""&&b8!=""&&b9!=""&&b10!="")
          {
              JOptionPane.showMessageDialog(this,"DRAW","Tic Tac Toe",
            JOptionPane.INFORMATION_MESSAGE);
             winner = null;
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
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jbplayero = new javax.swing.JLabel();
        jbplayerx = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1100, 738));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(20, 162, 209));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(20, 162, 209));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Player X");
        jPanel6.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 130, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Player O");
        jPanel6.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 110, 30));

        jbplayero.setBackground(new java.awt.Color(255, 255, 255));
        jbplayero.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbplayero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jbplayero.setText("0");
        jbplayero.setOpaque(true);
        jPanel6.add(jbplayero, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 160, 40));

        jbplayerx.setBackground(new java.awt.Color(255, 255, 255));
        jbplayerx.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbplayerx.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jbplayerx.setText("0");
        jbplayerx.setOpaque(true);
        jPanel6.add(jbplayerx, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 160, 40));

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 340, 140));

        jPanel7.setBackground(new java.awt.Color(20, 162, 209));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setText("NEW GAME");
        jButton1.setBorderPainted(false);
        jButton1.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton1.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 320, 60));

        jButton12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton12.setText("RESET");
        jButton12.setBorderPainted(false);
        jButton12.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton12.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 150, 50));

        jButton13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton13.setText("GO BACK");
        jButton13.setBorderPainted(false);
        jButton13.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton13.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 150, 50));

        jPanel3.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 340, 150));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 200, 420, 370));

        jPanel4.setBackground(new java.awt.Color(20, 162, 209));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton2.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 100, 80));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        jButton3.setBorderPainted(false);
        jButton3.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton3.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 100, 80));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        jButton4.setBorderPainted(false);
        jButton4.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton4.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 100, 80));

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        jButton5.setBorderPainted(false);
        jButton5.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton5.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 100, 80));

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        jButton6.setBorderPainted(false);
        jButton6.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton6.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 100, 80));

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        jButton7.setBorderPainted(false);
        jButton7.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton7.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 100, 80));

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        jButton8.setBorderPainted(false);
        jButton8.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton8.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 100, 80));

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        jButton9.setBorderPainted(false);
        jButton9.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton9.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 100, 80));

        jButton10.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        jButton10.setBorderPainted(false);
        jButton10.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton10.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 100, 80));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 390, 370));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ONE PLAYER TIC TAC TOE");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 510, 70));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("EASY");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, 90, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\leen\\Desktop\\11c.jpg")); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, 1260, 820));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1260, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private JFrame frame;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        jButton2.setEnabled(true);
        jButton10.setEnabled(true);
        jButton3.setEnabled(true);
        jButton4.setEnabled(true);
        jButton5.setEnabled(true);
        jButton6.setEnabled(true);
        jButton7.setEnabled(true);
        jButton8.setEnabled(true);
        jButton9.setEnabled(true);

        jbplayerx.setText("0");
        jbplayero.setText("0");
        xCount=0;
        oCount=0;

        jButton2.setText("");
        jButton10.setText("");
        jButton3.setText("");
        jButton4.setText("");
        jButton5.setText("");
        jButton6.setText("");
        jButton7.setText("");
        jButton8.setText("");
        jButton9.setText("");

        jButton2.setBackground(Color.LIGHT_GRAY);
        jButton10.setBackground(Color.LIGHT_GRAY);
        jButton3.setBackground(Color.LIGHT_GRAY);
        jButton4.setBackground(Color.LIGHT_GRAY);
        jButton5.setBackground(Color.LIGHT_GRAY);
        jButton6.setBackground(Color.LIGHT_GRAY);
        jButton7.setBackground(Color.LIGHT_GRAY);
        jButton8.setBackground(Color.LIGHT_GRAY);
        jButton9.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        jButton2.setEnabled(true);
        jButton10.setEnabled(true);
        jButton3.setEnabled(true);
        jButton4.setEnabled(true);
        jButton5.setEnabled(true);
        jButton6.setEnabled(true);
        jButton7.setEnabled(true);
        jButton8.setEnabled(true);
        jButton9.setEnabled(true);

        jButton2.setText("");
        jButton10.setText("");
        jButton3.setText("");
        jButton4.setText("");
        jButton5.setText("");
        jButton6.setText("");
        jButton7.setText("");
        jButton8.setText("");
        jButton9.setText("");

        jButton2.setBackground(Color.LIGHT_GRAY);
        jButton10.setBackground(Color.LIGHT_GRAY);
        jButton3.setBackground(Color.LIGHT_GRAY);
        jButton4.setBackground(Color.LIGHT_GRAY);
        jButton5.setBackground(Color.LIGHT_GRAY);
        jButton6.setBackground(Color.LIGHT_GRAY);
        jButton7.setBackground(Color.LIGHT_GRAY);
        jButton8.setBackground(Color.LIGHT_GRAY);
        jButton9.setBackground(Color.LIGHT_GRAY);

    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        ai aQ =new ai();
        aQ.show();//display ai2 here
        dispose(); //close current frame(ai1) after open ai2
        /** frame=new JFrame("Exite");
        if(JOptionPane.showConfirmDialog(frame,"confirm if you want to exite","Tic Tac Toe",
            JOptionPane.YES_NO_OPTION  )==JOptionPane.YES_NO_OPTION)
    {
        System.exit(0);
        }**/
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(jButton2.getText() == ""){

            jButton2.setText(startGame);

            if (startGame.equalsIgnoreCase("X"))
            {
                checker=false;
            }
            else
            {
                checker=true;
            }
            choose_player();
            next_turn();
            winningGame();
    }//GEN-LAST:event_jButton2ActionPerformed
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if(jButton3.getText() == ""){
            jButton3.setText(startGame);
            if (startGame.equalsIgnoreCase("X"))
            {
                checker=false;
            }
            else
            {
                checker=true;
            }
            choose_player();
            next_turn();
            winningGame();
    }//GEN-LAST:event_jButton3ActionPerformed
    }
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        if(jButton4.getText() == ""){
            jButton4.setText(startGame);
            if (startGame.equalsIgnoreCase("X"))
            {
                checker=false;
            }
            else
            {
                checker=true;
            }
            choose_player();
            next_turn();
            winningGame();
    }//GEN-LAST:event_jButton4ActionPerformed
    }
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        if(jButton5.getText() == ""){
            jButton5.setText(startGame);
            if (startGame.equalsIgnoreCase("X"))
            {
                checker=false;
            }
            else
            {
                checker=true;
            }
            choose_player();
            next_turn();
            winningGame();
    }//GEN-LAST:event_jButton5ActionPerformed
    }
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        if(jButton6.getText() == ""){
            jButton6.setText(startGame);
            if (startGame.equalsIgnoreCase("X"))
            {
                checker=false;
            }
            else
            {
                checker=true;
            }
            choose_player();
            next_turn();
            winningGame();
    }//GEN-LAST:event_jButton6ActionPerformed
    }
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        if(jButton7.getText() == ""){
            jButton7.setText(startGame);
            if (startGame.equalsIgnoreCase("X"))
            {
                checker=false;
            }
            else
            {
                checker=true;
            }
            choose_player();
            next_turn();
            winningGame();
    }//GEN-LAST:event_jButton7ActionPerformed
    }
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        if(jButton8.getText() == ""){
            jButton8.setText(startGame);
            if (startGame.equalsIgnoreCase("X"))
            {
                checker=false;
            }
            else
            {
                checker=true;
            }
            choose_player();
            next_turn();
            winningGame();
    }//GEN-LAST:event_jButton8ActionPerformed
    }
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        if(jButton9.getText() == ""){
            jButton9.setText(startGame);
            if (startGame.equalsIgnoreCase("X"))
            {
                checker=false;
            }
            else
            {
                checker=true;
            }
            choose_player();
            next_turn();
            winningGame();
    }//GEN-LAST:event_jButton9ActionPerformed
    }
    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        if(jButton10.getText() == ""){
            jButton10.setText(startGame);
            if (startGame.equalsIgnoreCase("X"))
            {
                checker=false;
            }
            else
            {
                checker=true;
            }
            choose_player();
            next_turn();
            winningGame();
    }//GEN-LAST:event_jButton10ActionPerformed
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
            java.util.logging.Logger.getLogger(ai3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ai3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ai3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ai3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ai3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel jbplayero;
    private javax.swing.JLabel jbplayerx;
    // End of variables declaration//GEN-END:variables
}
