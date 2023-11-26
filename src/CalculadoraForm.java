public class CalculadoraForm extends javax.swing.JFrame {

    public CalculadoraForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        Resultado = new javax.swing.JTextField();
        ButtonSair = new javax.swing.JButton();
        label1 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        TextNumber1 = new javax.swing.JTextField();
        TextNumber2 = new javax.swing.JTextField();
        ButtonSomar = new javax.swing.JButton();
        ButtonSubtrair = new javax.swing.JButton();
        ButtonMultiplicar = new javax.swing.JButton();
        ButtonDividir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setForeground(new java.awt.Color(102, 102, 102));

        title.setBackground(new java.awt.Color(90, 63, 40));
        title.setFont(new java.awt.Font("Lucida Handwriting", 1, 36)); // NOI18N
        title.setForeground(new java.awt.Color(153, 51, 255));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Calculadora");

        label3.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        label3.setForeground(new java.awt.Color(102, 102, 102));
        label3.setText("Resultado:");

        Resultado.setBackground(new java.awt.Color(153, 153, 255));
        Resultado.setFont(new java.awt.Font("Sitka Text", 2, 18)); // NOI18N
        Resultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResultadoActionPerformed(evt);
            }
        });

        ButtonSair.setBackground(new java.awt.Color(102, 102, 255));
        ButtonSair.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        ButtonSair.setForeground(new java.awt.Color(204, 204, 255));
        ButtonSair.setText("Sair e encerrar");
        ButtonSair.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.pink, java.awt.Color.white));
        ButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSairActionPerformed(evt);
            }
        });

        label1.setBackground(new java.awt.Color(102, 102, 102));
        label1.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        label1.setForeground(new java.awt.Color(102, 102, 102));
        label1.setText("Primeiro número:");

        label2.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        label2.setForeground(new java.awt.Color(102, 102, 102));
        label2.setText("Segundo número:");

        TextNumber1.setBackground(new java.awt.Color(153, 153, 255));
        TextNumber1.setFont(new java.awt.Font("Sitka Text", 2, 18)); // NOI18N
        TextNumber1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextNumber1ActionPerformed(evt);
            }
        });

        TextNumber2.setBackground(new java.awt.Color(153, 153, 255));
        TextNumber2.setFont(new java.awt.Font("Sitka Text", 2, 18)); // NOI18N

        ButtonSomar.setBackground(new java.awt.Color(153, 153, 255));
        ButtonSomar.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        ButtonSomar.setForeground(new java.awt.Color(102, 102, 102));
        ButtonSomar.setText("+");
        ButtonSomar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 102, 255)));
        ButtonSomar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSomarActionPerformed(evt);
            }
        });

        ButtonSubtrair.setBackground(new java.awt.Color(153, 153, 255));
        ButtonSubtrair.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 24)); // NOI18N
        ButtonSubtrair.setForeground(new java.awt.Color(102, 102, 102));
        ButtonSubtrair.setText("-");
        ButtonSubtrair.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 102, 255)));
        ButtonSubtrair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSubtrairActionPerformed(evt);
            }
        });

        ButtonMultiplicar.setBackground(new java.awt.Color(153, 153, 255));
        ButtonMultiplicar.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 24)); // NOI18N
        ButtonMultiplicar.setForeground(new java.awt.Color(102, 102, 102));
        ButtonMultiplicar.setText("x");
        ButtonMultiplicar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 102, 255)));
        ButtonMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonMultiplicarActionPerformed(evt);
            }
        });

        ButtonDividir.setBackground(new java.awt.Color(153, 153, 255));
        ButtonDividir.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 24)); // NOI18N
        ButtonDividir.setForeground(new java.awt.Color(102, 102, 102));
        ButtonDividir.setText("/");
        ButtonDividir.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 102, 255)));
        ButtonDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDividirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(ButtonSomar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonSubtrair, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(ButtonSair, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label1)
                            .addComponent(label2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TextNumber1, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                            .addComponent(TextNumber2)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(label3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                        .addComponent(Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label1)
                    .addComponent(TextNumber1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextNumber2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ButtonDividir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ButtonMultiplicar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ButtonSomar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ButtonSubtrair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Resultado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addComponent(ButtonSair)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextNumber1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextNumber1ActionPerformed

    }//GEN-LAST:event_TextNumber1ActionPerformed

    private void ButtonSubtrairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSubtrairActionPerformed
        double n1=Double.parseDouble(this.TextNumber1.getText());
        double n2=Double.parseDouble(this.TextNumber2.getText());
        double subtrair=n1-n2;
        this.Resultado.setText(""+subtrair);
    }//GEN-LAST:event_ButtonSubtrairActionPerformed

    private void ButtonSomarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSomarActionPerformed
        double n1=Double.parseDouble(this.TextNumber1.getText());
        double n2=Double.parseDouble(this.TextNumber2.getText());
        double somar=n1+n2;
        this.Resultado.setText(""+somar);
    }//GEN-LAST:event_ButtonSomarActionPerformed

    private void ResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResultadoActionPerformed
 
    }//GEN-LAST:event_ResultadoActionPerformed

    private void ButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ButtonSairActionPerformed

    private void ButtonDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDividirActionPerformed
        double n1=Double.parseDouble(this.TextNumber1.getText());
        double n2=Double.parseDouble(this.TextNumber2.getText());
        double dividir=n1/n2;
        this.Resultado.setText(""+dividir);
    }//GEN-LAST:event_ButtonDividirActionPerformed

    private void ButtonMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMultiplicarActionPerformed
        double n1=Double.parseDouble(this.TextNumber1.getText());
        double n2=Double.parseDouble(this.TextNumber2.getText());
        double multiplicar=n1*n2;
        this.Resultado.setText(""+multiplicar);
    }//GEN-LAST:event_ButtonMultiplicarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonDividir;
    private javax.swing.JButton ButtonMultiplicar;
    private javax.swing.JButton ButtonSair;
    private javax.swing.JButton ButtonSomar;
    private javax.swing.JButton ButtonSubtrair;
    private javax.swing.JTextField Resultado;
    private javax.swing.JTextField TextNumber1;
    private javax.swing.JTextField TextNumber2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}