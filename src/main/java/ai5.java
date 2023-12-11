import java.awt.Color;
import static java.lang.Integer.max;
import static java.lang.Integer.min;
import javax.swing.JButton;
import javax.swing.JOptionPane;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author leen
 */
public class ai5 extends javax.swing.JFrame {
private JButton[][] boardButtons;
    /**
     * Creates new form ai5
     */
private String HUMAN = "X";
private String AI = "O";
private String currentPlayer =HUMAN;
private String result;
 private int xCount=0;
 private int oCount=0;
 private static final int ALPHA = Integer.MIN_VALUE;
    private static final int PETA = Integer.MAX_VALUE;

int i = 0;
int j = 0;

    public ai5() {
        initComponents();
           boardButtons = new JButton[3][3]; 
        
     boardButtons[0][0]=jButton2;
     boardButtons[0][1]=jButton10;
     boardButtons[0][2]=jButton3;
     boardButtons[1][0]=jButton4;
      boardButtons[1][1]=jButton5;
       boardButtons[1][2]=jButton6;
        boardButtons[2][0]=jButton7;
        boardButtons[2][1]=jButton8;
        boardButtons[2][2]=jButton9;
        currentPlayer = HUMAN;
      // bestMove();
    }
 private void gameScore()
    {
        
        jbplayerx.setText(String.valueOf(xCount));
        jbplayero.setText(String.valueOf(oCount));
    }
    
    
    private Object checkWinner() {
    Object winner = " ";

  // horizontal
  for (int i = 0; i < 3; i++) {
    if (boardButtons[i][0].getText()== boardButtons[i][1].getText() && boardButtons[i][1].getText()== boardButtons[i][2].getText()&&boardButtons[i][0].getText()!=" ") {
      winner = boardButtons[i][0];
      
      JOptionPane.showMessageDialog(this,"winning","Tic Tac Toe",
            JOptionPane.INFORMATION_MESSAGE);
          boardButtons[i][0].setBackground(Color.GREEN);
         boardButtons[i][1].setBackground(Color.GREEN);
          boardButtons[i][2].setBackground(Color.GREEN);
          
          
          if(boardButtons[i][0].getText()=="X"){
               
          xCount++;
           gameScore();
          }
          else if(boardButtons[i][0].getText()=="O"){
               
          oCount++;
          gameScore();
          }    
    }
  }

  // Vertical
  for (int i = 0; i < 3; i++) {
    if (boardButtons[0][i].getText()== boardButtons[1][i].getText() && boardButtons[1][i].getText()== boardButtons[2][i].getText()&&boardButtons[0][i].getText()!=" ") {
      winner = boardButtons[0][i];
      
       JOptionPane.showMessageDialog(this,"winning","Tic Tac Toe",
            JOptionPane.INFORMATION_MESSAGE);
          boardButtons[0][i].setBackground(Color.GREEN);
         boardButtons[1][i].setBackground(Color.GREEN);
          boardButtons[2][i].setBackground(Color.GREEN);
          if (boardButtons[0][i].getText()=="X"){
          xCount++;
           gameScore();
          }
          else if (boardButtons[0][i].getText()=="O"){
          oCount++;
           gameScore();
          }
    }
  }

  // Diagonal
  if(boardButtons[0][0].getText()== boardButtons[1][1].getText()&& boardButtons[1][1].getText()== boardButtons[2][2].getText()&&boardButtons[0][0].getText()!=" ") {
    winner = boardButtons[0][0];
    
     JOptionPane.showMessageDialog(this,"winning","Tic Tac Toe",
            JOptionPane.INFORMATION_MESSAGE);
          boardButtons[0][0].setBackground(Color.GREEN);
         boardButtons[1][1].setBackground(Color.GREEN);
          boardButtons[2][2].setBackground(Color.GREEN);
          if (boardButtons[0][0].getText()=="X"){
          xCount++;
           gameScore();
          }
          else if (boardButtons[0][0].getText()=="O"){
          oCount++;
           gameScore();
          }
  }
  
  if (boardButtons[2][0].getText()== boardButtons[1][1].getText() && boardButtons[1][1].getText()== boardButtons[0][2].getText()&&boardButtons[2][0].getText()!=" ") {
    winner = boardButtons[2][0];
    
     JOptionPane.showMessageDialog(this,"winning","Tic Tac Toe",
            JOptionPane.INFORMATION_MESSAGE);
          boardButtons[2][0].setBackground(Color.GREEN);
         boardButtons[1][1].setBackground(Color.GREEN);
          boardButtons[0][2].setBackground(Color.GREEN);
          if (boardButtons[2][0].getText()=="X"){
          xCount++;
           gameScore();
          }
          else if (boardButtons[2][0].getText()=="O"){
          oCount++;
           gameScore();
          }
  }

  int openSpots = 0;
  for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 3; j++) {
      if (boardButtons[i][j].getText() == " ") {
        openSpots++;
      }
    }
  }

  if (winner==" " && openSpots == 0) {
      
      
    return "tie";
    
  } else {
    return winner;
  }
}
    
    
     private void bestMove() {
  // AI to make its turn
 
  int bestScore = Integer.MIN_VALUE;
  int move = 0;
    int move1 = 0;

  for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 3; j++) {
      // Is the spot available
      if (boardButtons[i][j].getText() == " ") {
           
        boardButtons[i][j].setText(AI);
        int score = ALPHAPETA(boardButtons, 10, false,Integer.MIN_VALUE,Integer.MAX_VALUE);
        boardButtons[i][j].setText(" ");
        if (score > bestScore) {
           
          bestScore = score;
          move = i;
           move1 = j;

        }
      }
    }
  }
  
  boardButtons[move][move1].setText(AI);
  currentPlayer = HUMAN;
 
}

     
private int scores(String result){
    if(result=="X"){
        return 1;
    }
    else if(result=="O"){
        return -1;
    }
    else
    {
     return 0;   
    }

}


private int ALPHAPETA(JButton boardButtons[][],int depth,boolean isMaximizing,int ALPHA,int PETA) {
    
   result = (String) checkWinner();
  if (result != null) {
    return scores(result);
  }
 
  if (isMaximizing) {
     
    int bestScore = Integer.MIN_VALUE;
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        // Is the spot available?
        if (boardButtons[i][j].getText() == " ") {
          
          boardButtons[i][j].setText(AI);
          int score = ALPHAPETA(boardButtons, depth - 1, false,ALPHA,PETA);
          boardButtons[i][j].setText(" ");
          bestScore = max(score, bestScore);
           ALPHA = Math.max(ALPHA, bestScore);
          if (PETA <= ALPHA) {
            break;
          }
        }
      }
    }
    return bestScore;
  } 
  else {
    int bestScore =Integer.MAX_VALUE;
     
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        // Is the spot available?
        if (boardButtons[i][j].getText() == " ") {
           
          boardButtons[i][j].setText(HUMAN);
          int score = ALPHAPETA(boardButtons, depth - 1, true,ALPHA,PETA);
           boardButtons[i][j].setText(" ");
          bestScore = min(score, bestScore);
          if (PETA <= ALPHA) {
            break;
          }
        }
      }
    }
    return bestScore;
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
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 510, 70));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ALPHA BETA");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\leen\\Desktop\\11c.jpg")); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1260, 820));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1260, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 820, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

        jButton2.setText(" ");
        jButton10.setText(" ");
        jButton3.setText(" ");
        jButton4.setText(" ");
        jButton5.setText(" ");
        jButton6.setText(" ");
        jButton7.setText(" ");
        jButton8.setText(" ");
        jButton9.setText(" ");

        jButton2.setBackground(Color.LIGHT_GRAY);
        jButton10.setBackground(Color.LIGHT_GRAY);
        jButton3.setBackground(Color.LIGHT_GRAY);
        jButton4.setBackground(Color.LIGHT_GRAY);
        jButton5.setBackground(Color.LIGHT_GRAY);
        jButton6.setBackground(Color.LIGHT_GRAY);
        jButton7.setBackground(Color.LIGHT_GRAY);
        jButton8.setBackground(Color.LIGHT_GRAY);
        jButton9.setBackground(Color.LIGHT_GRAY);

        currentPlayer = HUMAN;
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

        jButton2.setText(" ");
        jButton10.setText(" ");
        jButton3.setText(" ");
        jButton4.setText(" ");
        jButton5.setText(" ");
        jButton6.setText(" ");
        jButton7.setText(" ");
        jButton8.setText(" ");
        jButton9.setText(" ");

        jButton2.setBackground(Color.LIGHT_GRAY);
        jButton10.setBackground(Color.LIGHT_GRAY);
        jButton3.setBackground(Color.LIGHT_GRAY);
        jButton4.setBackground(Color.LIGHT_GRAY);
        jButton5.setBackground(Color.LIGHT_GRAY);
        jButton6.setBackground(Color.LIGHT_GRAY);
        jButton7.setBackground(Color.LIGHT_GRAY);
        jButton8.setBackground(Color.LIGHT_GRAY);
        jButton9.setBackground(Color.LIGHT_GRAY);
        currentPlayer = HUMAN;
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
        if (currentPlayer == HUMAN) {

            // Human make turn
            // If valid turn
            if (boardButtons[0][0].getText() == " ") {
                boardButtons[0][0].setText(HUMAN);

                currentPlayer = AI;

                bestMove();
            }
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if (currentPlayer == HUMAN) {

            // jButton3.setText(HUMAN);
            // Human make turn
            // If valid turn
            if (boardButtons[0][2].getText() == " ") {

                boardButtons[0][2].setText(HUMAN);
                currentPlayer = AI;
                bestMove();
            }
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        if (currentPlayer == HUMAN) {

            // Human make turn
            // If valid turn
            if (boardButtons[1][0].getText() == " ") {
                boardButtons[1][0].setText(HUMAN);
                currentPlayer = AI;
                bestMove();
            }
        }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        if (currentPlayer == HUMAN) {

            // Human make turn
            // If valid turn
            if (boardButtons[1][1].getText() == " ") {
                boardButtons[1][1].setText(HUMAN);
                currentPlayer = AI;
                bestMove();
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        if (currentPlayer == HUMAN) {

            // Human make turn
            // If valid turn
            if (boardButtons[1][2].getText() == " ") {
                boardButtons[1][2].setText(HUMAN);
                currentPlayer = AI;
                bestMove();
            }
        }

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        if (currentPlayer == HUMAN) {

            // Human make turn
            // If valid turn
            if (boardButtons[2][0].getText() == " ") {
                boardButtons[2][0].setText(HUMAN);
                currentPlayer = AI;
                bestMove();
            }
        }

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        if (currentPlayer == HUMAN) {

            // Human make turn
            // If valid turn
            if (boardButtons[2][1].getText() == " ") {
                boardButtons[2][1].setText(HUMAN);
                currentPlayer = AI;
                bestMove();
            }
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        if (currentPlayer == HUMAN) {

            // Human make turn
            // If valid turn
            if (boardButtons[2][2].getText() == " ") {
                boardButtons[2][2].setText(HUMAN);
                currentPlayer = AI;
                bestMove();
            }
        }

    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        if (currentPlayer == HUMAN) {

            // Human make turn
            // If valid turn
            if (boardButtons[0][1].getText() == " ") {
                boardButtons[0][1].setText(HUMAN);
                currentPlayer = AI;
                bestMove();
            }
        }

    }//GEN-LAST:event_jButton10ActionPerformed

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
            java.util.logging.Logger.getLogger(ai5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ai5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ai5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ai5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ai5().setVisible(true);
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
