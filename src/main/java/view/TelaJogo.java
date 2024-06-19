/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import classes.Tabuleiro;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author vinic
 */
public class TelaJogo extends javax.swing.JFrame {

    public Tabuleiro tabuleiro = new Tabuleiro();
    public ServerSocket serverSocket;
    public Socket socket;
    public ObjectOutputStream output;
    public ObjectInputStream input;

    public String player;

    /**
     * Creates new form TelaJogo
     */
    public TelaJogo() {
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

        Btn4 = new javax.swing.JButton();
        Btn1 = new javax.swing.JButton();
        Btn2 = new javax.swing.JButton();
        Btn7 = new javax.swing.JButton();
        Btn5 = new javax.swing.JButton();
        Btn8 = new javax.swing.JButton();
        Btn3 = new javax.swing.JButton();
        Btn6 = new javax.swing.JButton();
        Btn9 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        startServer = new javax.swing.JButton();
        Connect = new javax.swing.JButton();
        IpConexao = new javax.swing.JTextField();
        Close = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jogo da Velha");
        setResizable(false);

        Btn4.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        Btn4.setEnabled(false);
        Btn4.setPreferredSize(new java.awt.Dimension(75, 75));
        Btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn4ActionPerformed(evt);
            }
        });

        Btn1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        Btn1.setEnabled(false);
        Btn1.setPreferredSize(new java.awt.Dimension(75, 75));
        Btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn1MouseClicked(evt);
            }
        });
        Btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn1ActionPerformed(evt);
                BTN1AP(evt);
            }
        });

        Btn2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        Btn2.setEnabled(false);
        Btn2.setPreferredSize(new java.awt.Dimension(75, 75));
        Btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn2ActionPerformed(evt);
            }
        });

        Btn7.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        Btn7.setEnabled(false);
        Btn7.setPreferredSize(new java.awt.Dimension(75, 75));
        Btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn7ActionPerformed(evt);
            }
        });

        Btn5.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        Btn5.setEnabled(false);
        Btn5.setPreferredSize(new java.awt.Dimension(75, 75));
        Btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn5ActionPerformed(evt);
            }
        });

        Btn8.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        Btn8.setEnabled(false);
        Btn8.setPreferredSize(new java.awt.Dimension(75, 75));
        Btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn8ActionPerformed(evt);
            }
        });

        Btn3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        Btn3.setEnabled(false);
        Btn3.setPreferredSize(new java.awt.Dimension(75, 75));
        Btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn3ActionPerformed(evt);
            }
        });

        Btn6.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        Btn6.setEnabled(false);
        Btn6.setPreferredSize(new java.awt.Dimension(75, 75));
        Btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn6ActionPerformed(evt);
            }
        });

        Btn9.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        Btn9.setEnabled(false);
        Btn9.setPreferredSize(new java.awt.Dimension(75, 75));
        Btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn9ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Jogo da Velha");

        startServer.setText("Start Server");
        startServer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startServerActionPerformed(evt);
            }
        });

        Connect.setText("Connect");
        Connect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConnectActionPerformed(evt);
            }
        });

        Close.setText("Close");
        Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(startServer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(IpConexao, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Connect)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Close)))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81)
                .addComponent(startServer)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Connect)
                    .addComponent(IpConexao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Close))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn9ActionPerformed
        Btn9.setText(player);
        this.tabuleiro.setB9(player);
        FuncaoButton();
    }//GEN-LAST:event_Btn9ActionPerformed

    private void startServerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startServerActionPerformed
        iniciarServidor();
    }//GEN-LAST:event_startServerActionPerformed

    private void ConnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConnectActionPerformed
        try {
            conectarNoServidor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_ConnectActionPerformed

    private void CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseActionPerformed
        try {
            finalizarGame();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_CloseActionPerformed

    private void Btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn8ActionPerformed
        Btn8.setText(player);
        this.tabuleiro.setB8(player);
        FuncaoButton();
    }//GEN-LAST:event_Btn8ActionPerformed

    private void Btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn1ActionPerformed
        Btn1.setText(player);
        this.tabuleiro.setB1(player);
        FuncaoButton();
    }//GEN-LAST:event_Btn1ActionPerformed

    private void Btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn2ActionPerformed
        Btn2.setText(player);
        this.tabuleiro.setB2(player);
        FuncaoButton();
    }//GEN-LAST:event_Btn2ActionPerformed

    private void Btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn3ActionPerformed
        Btn3.setText(player);
        this.tabuleiro.setB3(player);
        FuncaoButton();
    }//GEN-LAST:event_Btn3ActionPerformed

    private void Btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn4ActionPerformed
        Btn4.setText(player);
        this.tabuleiro.setB4(player);
        FuncaoButton();
    }//GEN-LAST:event_Btn4ActionPerformed

    private void Btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn5ActionPerformed
        Btn5.setText(player);
        this.tabuleiro.setB5(player);
        FuncaoButton();
    }//GEN-LAST:event_Btn5ActionPerformed

    private void Btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn6ActionPerformed
        Btn6.setText(player);
        this.tabuleiro.setB6(player);
        FuncaoButton();
    }//GEN-LAST:event_Btn6ActionPerformed

    private void Btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn7ActionPerformed
        Btn7.setText(player);
        this.tabuleiro.setB7(player);
        FuncaoButton();
    }//GEN-LAST:event_Btn7ActionPerformed

    private void BTN1AP(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN1AP
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN1AP

    private void Btn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn1MouseClicked
        
    }//GEN-LAST:event_Btn1MouseClicked

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
            java.util.logging.Logger.getLogger(TelaJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaJogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn1;
    private javax.swing.JButton Btn2;
    private javax.swing.JButton Btn3;
    private javax.swing.JButton Btn4;
    private javax.swing.JButton Btn5;
    private javax.swing.JButton Btn6;
    private javax.swing.JButton Btn7;
    private javax.swing.JButton Btn8;
    private javax.swing.JButton Btn9;
    private javax.swing.JButton Close;
    private javax.swing.JButton Connect;
    private javax.swing.JTextField IpConexao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton startServer;
    // End of variables declaration//GEN-END:variables
    
    private void FuncaoButton(){
        try {
            bloqueiaCampos();
            this.output.writeObject(this.tabuleiro);
            VerificaVitoria();
            new Thread(() -> {
                try {
                    this.tabuleiro = (Tabuleiro) this.input.readObject();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                atualizarTabuleiro();
                VerificaVitoria();
            }).start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void iniciarServidor() {
        int port = 13456;
        this.player = "X";

        try {
            serverSocket = new ServerSocket(port);
            System.out.println("Servidor aguardando conexões na porta");

            Socket cliente = serverSocket.accept();
            System.out.println("Cliente conectado! ");

            input = new ObjectInputStream(cliente.getInputStream());
            output = new ObjectOutputStream(cliente.getOutputStream());

            liberaCampos();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void conectarNoServidor() throws ClassNotFoundException {
        String serverAddress = IpConexao.getText();
        int serverPort = 13456;
        this.player = "O";

        try {
            socket = new Socket(serverAddress, serverPort);
            System.out.println("Conectado ao servidor em " + serverAddress + ":" + serverPort);

            output = new ObjectOutputStream(socket.getOutputStream());
            input = new ObjectInputStream(socket.getInputStream());

            tabuleiro = (Tabuleiro) input.readObject();
            System.out.println("Aguardanado o servidor jogar pela primeira vez...");
            liberaCampos();
            atualizarTabuleiro();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void bloqueiaCampos() {
        Btn1.setEnabled(false);
        Btn2.setEnabled(false);
        Btn3.setEnabled(false);
        Btn4.setEnabled(false);
        Btn5.setEnabled(false);
        Btn6.setEnabled(false);
        Btn7.setEnabled(false);
        Btn8.setEnabled(false);
        Btn9.setEnabled(false);
    }

    private void liberaCampos() {
        Btn1.setEnabled(true);
        Btn2.setEnabled(true);
        Btn3.setEnabled(true);
        Btn4.setEnabled(true);
        Btn5.setEnabled(true);
        Btn6.setEnabled(true);
        Btn7.setEnabled(true);
        Btn8.setEnabled(true);
        Btn9.setEnabled(true);
    }

    private void finalizarGame() throws IOException {
        //Desconectar de tudo
        System.out.println("Finalizado pelo cliente.");
        bloqueiaCampos();
        this.input.close();
        this.output.close();

        this.socket.close();

    }

    private synchronized void atualizarTabuleiro() {
        if (this.tabuleiro.getB1().equals("") == false) {
            Btn1.setText(this.tabuleiro.getB1());
            Btn1.setEnabled(false);
        } else {
            Btn1.setEnabled(true);
        }
        if (this.tabuleiro.getB2().equals("") == false) {
            Btn2.setText(this.tabuleiro.getB2());
            Btn2.setEnabled(false);
        } else {
            Btn2.setEnabled(true);
        }
        if (this.tabuleiro.getB3().equals("") == false) {
            Btn3.setText(this.tabuleiro.getB3());
            Btn3.setEnabled(false);
        } else {
            Btn3.setEnabled(true);
        }
        if (this.tabuleiro.getB4().equals("") == false) {
            Btn4.setText(this.tabuleiro.getB4());
            Btn4.setEnabled(false);
        } else {
            Btn4.setEnabled(true);
        }
        if (this.tabuleiro.getB5().equals("") == false) {
            Btn5.setText(this.tabuleiro.getB5());
            Btn5.setEnabled(false);
        } else {
            Btn5.setEnabled(true);
        }
        if (this.tabuleiro.getB6().equals("") == false) {
            Btn6.setText(this.tabuleiro.getB6());
            Btn6.setEnabled(false);
        } else {
            Btn6.setEnabled(true);
        }
        if (this.tabuleiro.getB7().equals("") == false) {
            Btn7.setText(this.tabuleiro.getB7());
            Btn7.setEnabled(false);
        } else {
            Btn7.setEnabled(true);
        }
        if (this.tabuleiro.getB8().equals("") == false) {
            Btn8.setText(this.tabuleiro.getB8());
            Btn8.setEnabled(false);
        } else {
            Btn8.setEnabled(true);
        }
        if (this.tabuleiro.getB9().equals("") == false) {
            Btn9.setText(this.tabuleiro.getB9());
            Btn9.setEnabled(false);
        } else {
            Btn9.setEnabled(true);
        }
    }

    private void VerificaVitoria() {
        if (Btn1.getText().equals("X") && Btn2.getText().equals("X") && Btn3.getText().equals("X")
                || Btn1.getText().equals("O") && Btn2.getText().equals("O") && Btn3.getText().equals("O")) {
            String vencedor = Btn1.getText();
            Vitoria(vencedor);
        }else if(Btn4.getText().equals("X") && Btn5.getText().equals("X") && Btn6.getText().equals("X")|| 
                 Btn4.getText().equals("O") && Btn5.getText().equals("O") && Btn6.getText().equals("O")){
            String vencedor = Btn4.getText();
            Vitoria(vencedor);
        }else if(Btn7.getText().equals("X") && Btn8.getText().equals("X") && Btn9.getText().equals("X")|| 
                 Btn7.getText().equals("O") && Btn8.getText().equals("O") && Btn9.getText().equals("O")){
            String vencedor = Btn7.getText();
            Vitoria(vencedor);
        }else if(Btn1.getText().equals("X") && Btn4.getText().equals("X") && Btn7.getText().equals("X")|| 
                 Btn1.getText().equals("O") && Btn4.getText().equals("O") && Btn7.getText().equals("O")){
            String vencedor = Btn1.getText();
            Vitoria(vencedor);
        }else if(Btn2.getText().equals("X") && Btn5.getText().equals("X") && Btn8.getText().equals("X")|| 
                 Btn2.getText().equals("O") && Btn5.getText().equals("O") && Btn8.getText().equals("O")){
            String vencedor = Btn2.getText();
            Vitoria(vencedor);
        }else if(Btn3.getText().equals("X") && Btn6.getText().equals("X") && Btn9.getText().equals("X")|| 
                 Btn3.getText().equals("O") && Btn6.getText().equals("O") && Btn9.getText().equals("O")){
            String vencedor = Btn3.getText();
            Vitoria(vencedor);
        }else if(Btn1.getText().equals("X") && Btn5.getText().equals("X") && Btn9.getText().equals("X")|| 
                 Btn1.getText().equals("O") && Btn5.getText().equals("O") && Btn9.getText().equals("O")){
            String vencedor = Btn1.getText();
            Vitoria(vencedor);
        }else if(Btn3.getText().equals("X") && Btn5.getText().equals("X") && Btn7.getText().equals("X")|| 
                 Btn3.getText().equals("O") && Btn5.getText().equals("O") && Btn7.getText().equals("O")){
            String vencedor = Btn3.getText();
            Vitoria(vencedor);
        }
    }

    private void Vitoria(String vencedor) {
        try {
            JOptionPane.showMessageDialog(rootPane, "o Jogador " + vencedor + " Ganhou!");
            finalizarGame();
            bloqueiaCampos();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void Thread(JButton btn) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                new Thread(() -> {
                    Btn2.setText(player);
                }).start();
            }
        }).start();
    }

}
