package Views;

import java.sql.*;
import Models.Usuario;
import Controllers.UsuarioControle;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author bruno
 */
public class LoginRegistro extends javax.swing.JFrame {

    // instaciar logo no inicio para não precisar reescrever mais linhas de código.
    Usuario usuario = new Usuario();
    UsuarioControle controle = new UsuarioControle();

    public LoginRegistro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nomeUsuario = new javax.swing.JTextField();
        senhaUsuario = new javax.swing.JTextField();
        loginBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nomeRegistro = new javax.swing.JTextField();
        senhaRegistro = new javax.swing.JTextField();
        confirmarSenha = new javax.swing.JTextField();
        emailRegistro = new javax.swing.JTextField();
        registrarBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nome:");

        jLabel2.setText("Senha:");

        loginBtn.setText("Entrar");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Login");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(147, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(loginBtn)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nomeUsuario)
                            .addComponent(senhaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(143, 143, 143))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(254, 254, 254)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel3)
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(senhaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(loginBtn)
                .addContainerGap(116, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Login", jPanel1);

        jLabel4.setText("Nome:");

        jLabel5.setText("Senha:");

        jLabel6.setText("Confirmar senha:");

        jLabel7.setText("Email:");

        registrarBtn.setText("Registrar");
        registrarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(18, 18, 18)
                            .addComponent(nomeRegistro))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addGap(18, 18, 18)
                            .addComponent(emailRegistro))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(18, 18, 18)
                            .addComponent(confirmarSenha))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(18, 18, 18)
                            .addComponent(senhaRegistro)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(registrarBtn)))
                .addGap(157, 157, 157))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(nomeRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(senhaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(confirmarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(emailRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(registrarBtn)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Registrar", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed

        String nome, senha;

        // pegar valores digitados e armazenar nas variáveis 'nome' e 'senha'
        nome = nomeUsuario.getText();
        senha = senhaUsuario.getText();

        try {

            // caso os campos estiverem vazios, irá mostrar mensagem de erro
            if (nome.equals("")) {
                JOptionPane.showMessageDialog(null, "Campo nome precisa estar preenchido.");

            } else if (senha.equals("")) {
                JOptionPane.showMessageDialog(null, "Campo senha precisa estar preenchido.");

            // senão irá fazer a verificação se os campos estiverem corretos    
            } else {
                usuario.setNome(nome);
                usuario.setSenha(senha);

                ResultSet rs = controle.autenticacao(usuario);

                // se o resultset estiver correto (não nulo), a verificação irá ser completa
                // e iremos abrir uma nova jframe pegando o nome do usuário
                if (rs.next()) {
                    Logado view = new Logado();
                    // criamos um metodo para pegar o nome para mostrar na jframe logado
                    view.pegarNome(usuario);
                    view.setVisible(true);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "senha ou usuario incorretos");
                }

            }

            // caso houver algum erro de syntax ou referente a instruções SQL irá nos mostrar um erro    
        } catch (HeadlessException | SQLException ex) {
            System.out.println("Ocorreu um erro de login: " + ex.getMessage());
        }

    }//GEN-LAST:event_loginBtnActionPerformed

    private void registrarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarBtnActionPerformed

        String nome, senha, email, confirmar;

        nome = nomeRegistro.getText();
        senha = senhaRegistro.getText();
        email = emailRegistro.getText();
        confirmar = confirmarSenha.getText();

        try {

            // se algum ou todos os campos estiverem vazios, mensagem de erro
            if (nome.equals("") || senha.equals("") || email.equals("") || confirmar.equals("")) {
                JOptionPane.showMessageDialog(null, "Todos os campos devem estar preenchidos.");

                // senão se a senha não for igual a confirmar senha, mensagem de erro    
            } else if (!confirmar.equals(senha)) {
                JOptionPane.showMessageDialog(null, "As senhas não conferem.");

                // senão segue o registro    
            } else {

                usuario.setNome(nome);
                usuario.setSenha(senha);
                usuario.setEmail(email);

                controle.registrarUsuario(usuario);
                JOptionPane.showMessageDialog(null, "Usuário " + nome + " registrado com sucesso!");

            }

        } catch (HeadlessException e) {
            System.out.println("Ocorreu um erro de registro na view registrar: " + e.getMessage());
        }

    }//GEN-LAST:event_registrarBtnActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new LoginRegistro().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField confirmarSenha;
    private javax.swing.JTextField emailRegistro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton loginBtn;
    private javax.swing.JTextField nomeRegistro;
    private javax.swing.JTextField nomeUsuario;
    private javax.swing.JButton registrarBtn;
    private javax.swing.JTextField senhaRegistro;
    private javax.swing.JTextField senhaUsuario;
    // End of variables declaration//GEN-END:variables
}
