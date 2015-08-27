
package javabeanlab;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;


public class CalculatorForm extends javax.swing.JFrame implements ActionListener{

    int functionCounter = 0;
    
    double test = 0;
    double answer = 0;
    boolean buttonToggle = false;

    String operation;
    
    boolean add = false;
    boolean subtract = false;
    boolean multiply = false;
    boolean divide = false;
    boolean equals = false;

    public CalculatorForm() {
        initComponents();
        
        btn0.addActionListener(this);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);
        btnDecimalPoint.addActionListener(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jIntegerField1 = new javabeanlab.JIntegerField();
        jPanel2 = new javax.swing.JPanel();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btnMinus = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btnMult = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnDecimalPoint = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnDivide = new javax.swing.JButton();
        btnEqual = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setBackground(new java.awt.Color(0, 0, 0));
        setPreferredSize(new java.awt.Dimension(350, 375));
        setResizable(false);

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setPreferredSize(new java.awt.Dimension(50, 31));
        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new java.awt.GridLayout(2, 0, 0, -4));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(51, 51, 51));
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField1.setToolTipText("");
        jTextField1.setBorder(null);
        jTextField1.setPreferredSize(new java.awt.Dimension(10, 25));
        jPanel1.add(jTextField1);

        jIntegerField1.setBackground(new java.awt.Color(51, 51, 51));
        jIntegerField1.setBorder(null);
        jIntegerField1.setForeground(new java.awt.Color(255, 255, 255));
        jIntegerField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jIntegerField1.setAlignmentX(2.5F);
        jIntegerField1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel1.add(jIntegerField1);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 5, 5));
        jPanel2.setPreferredSize(new java.awt.Dimension(40, 40));
        jPanel2.setLayout(new java.awt.GridLayout(4, 4));

        btn7.setBackground(new java.awt.Color(0, 51, 255));
        btn7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn7.setForeground(new java.awt.Color(255, 255, 255));
        btn7.setText("7");
        btn7.setPreferredSize(new java.awt.Dimension(60, 60));
        jPanel2.add(btn7);

        btn8.setBackground(new java.awt.Color(0, 51, 255));
        btn8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn8.setForeground(new java.awt.Color(255, 255, 255));
        btn8.setText("8");
        btn8.setPreferredSize(new java.awt.Dimension(60, 60));
        jPanel2.add(btn8);

        btn9.setBackground(new java.awt.Color(0, 51, 255));
        btn9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn9.setForeground(new java.awt.Color(255, 255, 255));
        btn9.setText("9");
        btn9.setPreferredSize(new java.awt.Dimension(60, 60));
        jPanel2.add(btn9);

        btnAdd.setBackground(new java.awt.Color(0, 102, 255));
        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("+");
        btnAdd.setPreferredSize(new java.awt.Dimension(60, 60));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel2.add(btnAdd);

        btn4.setBackground(new java.awt.Color(0, 51, 255));
        btn4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn4.setForeground(new java.awt.Color(255, 255, 255));
        btn4.setText("4");
        btn4.setPreferredSize(new java.awt.Dimension(60, 60));
        jPanel2.add(btn4);

        btn5.setBackground(new java.awt.Color(0, 51, 255));
        btn5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn5.setForeground(new java.awt.Color(255, 255, 255));
        btn5.setText("5");
        btn5.setPreferredSize(new java.awt.Dimension(60, 60));
        jPanel2.add(btn5);

        btn6.setBackground(new java.awt.Color(0, 51, 255));
        btn6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn6.setForeground(new java.awt.Color(255, 255, 255));
        btn6.setText("6");
        btn6.setPreferredSize(new java.awt.Dimension(60, 60));
        jPanel2.add(btn6);

        btnMinus.setBackground(new java.awt.Color(0, 102, 255));
        btnMinus.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnMinus.setForeground(new java.awt.Color(255, 255, 255));
        btnMinus.setText("-");
        btnMinus.setPreferredSize(new java.awt.Dimension(60, 60));
        btnMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinusActionPerformed(evt);
            }
        });
        jPanel2.add(btnMinus);

        btn1.setBackground(new java.awt.Color(0, 51, 255));
        btn1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn1.setForeground(new java.awt.Color(255, 255, 255));
        btn1.setText("1");
        btn1.setPreferredSize(new java.awt.Dimension(60, 60));
        jPanel2.add(btn1);

        btn2.setBackground(new java.awt.Color(0, 51, 255));
        btn2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn2.setForeground(new java.awt.Color(255, 255, 255));
        btn2.setText("2");
        btn2.setPreferredSize(new java.awt.Dimension(60, 60));
        jPanel2.add(btn2);

        btn3.setBackground(new java.awt.Color(0, 51, 255));
        btn3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn3.setForeground(new java.awt.Color(255, 255, 255));
        btn3.setText("3");
        btn3.setPreferredSize(new java.awt.Dimension(60, 60));
        jPanel2.add(btn3);

        btnMult.setBackground(new java.awt.Color(0, 102, 255));
        btnMult.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnMult.setForeground(new java.awt.Color(255, 255, 255));
        btnMult.setText("*");
        btnMult.setPreferredSize(new java.awt.Dimension(60, 60));
        btnMult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultActionPerformed(evt);
            }
        });
        jPanel2.add(btnMult);

        btn0.setBackground(new java.awt.Color(0, 51, 255));
        btn0.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn0.setForeground(new java.awt.Color(255, 255, 255));
        btn0.setText("0");
        btn0.setPreferredSize(new java.awt.Dimension(60, 60));
        jPanel2.add(btn0);

        btnDecimalPoint.setBackground(new java.awt.Color(51, 153, 255));
        btnDecimalPoint.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnDecimalPoint.setForeground(new java.awt.Color(255, 255, 255));
        btnDecimalPoint.setText(".");
        jPanel2.add(btnDecimalPoint);

        btnClear.setBackground(new java.awt.Color(0, 51, 255));
        btnClear.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("C");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel2.add(btnClear);

        btnDivide.setBackground(new java.awt.Color(0, 102, 255));
        btnDivide.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnDivide.setForeground(new java.awt.Color(255, 255, 255));
        btnDivide.setText("/");
        btnDivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivideActionPerformed(evt);
            }
        });
        jPanel2.add(btnDivide);

        btnEqual.setBackground(new java.awt.Color(51, 153, 255));
        btnEqual.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnEqual.setForeground(new java.awt.Color(255, 255, 255));
        btnEqual.setText("=");
        btnEqual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEqualActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(140, 140, 140)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void setAllToFalse(){
        equals = false;
        add = false;
        subtract = false;
        multiply = false;
        divide = false;
        buttonToggle= false;  
    }
    
    public void resetTextFields(){
        insInteger("0");
        insText("");
    }
    
    public void resetAnswerCounter(){
        answer = 0;
        functionCounter = 0;
    }
    
    public void resetOperation(){
        operation = "";
    }
    
    public void setOperation(String s){
        operation = s;
    }
    
    public void insText(String s){
        jTextField1.setText(s);
    }
    
    public void insInteger(String s){
        jIntegerField1.setText(s);
    }
     
    public String getText(){
        return jTextField1.getText();
    }
    
    public String getInteger(){
        return jIntegerField1.getText();
    }
    
    public void add(){
        answer += Double.parseDouble(getInteger());
    }
    
    public void subtract(){
        answer -= Double.parseDouble(getInteger());                                               
    }  
    
    public void divide(){                                           
        answer /= Double.parseDouble(getInteger());
    }
    
    public void multiply(){         
        answer *= Double.parseDouble(getInteger());
    }
    
    public void fcInc(){
        functionCounter++;
    }
    
    public void fcReset(){
        functionCounter = 0;
    }
    
    public String db2String(double d){
        return Double.toString(d);
    }
    
    public double str2Double(String s){
        return Double.parseDouble(s);
    }
    
    public Object getActCom(JButton b){
        return b.getActionCommand();
    }
    
    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        resetTextFields();
        resetAnswerCounter();
        setAllToFalse();
        resetOperation();
    }//GEN-LAST:event_btnClearActionPerformed
    
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        add = true;
        
        if(subtract){
            subtract();
            insText(getText()+getInteger()+getActCom(btnAdd));
            insInteger(db2String(answer));    
        }
  
        else if(multiply){
            multiply();
            insText(getText()+getInteger()+getActCom(btnAdd));
            insInteger(db2String(answer));
        }
   
        else if(divide){
            divide();
            insText(getText() + getInteger()+getActCom(btnAdd));
            insText(getText()+getInteger()+getActCom(btnAdd));
            insInteger(db2String(answer));
        }
        
        else if(equals){
            insText(getText()+getInteger()+getActCom(btnAdd));
        }else{
            insText(getText() + getInteger()+getActCom(btnAdd));
        }
        
        if(functionCounter < 1){
            answer = str2Double(getInteger());
        }else if(functionCounter>0 && multiply == false && divide == false && subtract == false){
            add();
            insInteger(db2String(answer));
        }
        
        multiply = false;
        divide = false;
        subtract = false;
        buttonToggle = true;
        
        setOperation("+");
        fcInc();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinusActionPerformed
        subtract = true;
        
        if(add){
             add();
             insText(getText() + getInteger()+getActCom(btnMinus));
             insInteger(db2String(answer));    
        }

        else if(multiply){
            multiply();
            insText(getText() + getInteger()+getActCom(btnMinus));
            insInteger(db2String(answer));
        }
      
        else if(divide){
            divide();
            insText(getText() + getInteger()+getActCom(btnMinus));
            insInteger(db2String(answer));
        }
        
        else if(equals){
            insText(getText() + getInteger()+getActCom(btnMinus));
        }
        
        // add operation to top right of jtextfield 1
        else if(getInteger().length() == 0){
            insText(getText() + getActCom(btnMinus)+getInteger());
        }else{
            insText(getText() + getInteger()+getActCom(btnMinus));
        }
        
        if(functionCounter < 1){
            answer = str2Double(getInteger()); 
        }else if(functionCounter>1 && add == false && multiply == false && divide ==false){
            subtract();
            insInteger(db2String(answer));
        }
        
        add = false;
        multiply = false;
        divide = false;
        buttonToggle = true;
        
        setOperation("-");
        fcInc();
    }//GEN-LAST:event_btnMinusActionPerformed

    private void btnMultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultActionPerformed
        multiply = true;
        
        if(subtract){
            subtract();
            insText(getText() + getInteger()+getActCom(btnMult));
            insInteger(db2String(answer));
        }
  
        else if(add){
            add();
            insText(getText() + getInteger()+getActCom(btnMult));
            insInteger(db2String(answer));
        }
   
        else if(divide){
            divide();
            insText(getText() + getInteger()+getActCom(btnMult));
            insInteger(db2String(answer));
        }
        
        else if(equals){
            insText(getText() + getInteger()+getActCom(btnMult));
        }else{
            insText(getText() + getInteger()+getActCom(btnMult));
        }
        
        if(functionCounter < 1){
            answer = str2Double(getInteger());
        }else if(functionCounter>0 && subtract == false && add == false && divide == false){
            multiply();
            insInteger(db2String(answer));
        }
        
        subtract = false;
        add = false;
        divide = false;
        buttonToggle = true;
        
        setOperation("*");
        fcInc();
    }//GEN-LAST:event_btnMultActionPerformed

    private void btnEqualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEqualActionPerformed

        equals = true;
        
        if(operation.equals("*") && multiply){
            multiply();
        }
        
        else if(operation.equals("+") && add){
            add();
        }
        
        else if(operation.equals("-") && subtract){
            subtract();
        }
        
        else if(operation.endsWith("/") && divide){
            divide();
        }
     
        setAllToFalse();
        fcReset();
        resetOperation();
        resetTextFields();
        insInteger(db2String(answer));
        
    }//GEN-LAST:event_btnEqualActionPerformed

    private void btnDivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivideActionPerformed
         divide = true;
        
        if(subtract){
            subtract();
            insText(getText() + getInteger()+getActCom(btnDivide));
            insInteger(db2String(answer));    
        }
  
        else if(multiply){
            multiply();
            insText(getText() + getInteger()+getActCom(btnDivide));
            insInteger(db2String(answer));
        }
   
        else if(add){
            add();
            insText(getText() + getInteger()+getActCom(btnDivide));
            insInteger(db2String(answer));
        }
      
        else if(equals){
            insText(getText() + getInteger()+getActCom(btnDivide));
        }else{
            insText(getText() + getInteger()+" "+getActCom(btnDivide)+" "); 
        }

        if(functionCounter < 1){
            answer = str2Double(getInteger());
        } else if(functionCounter>0 && add == false && multiply == false && subtract == false) {
            divide();
            insInteger(db2String(answer));
        }

        add = false;
        multiply = false;
        subtract = false;
        buttonToggle = true;
        
        setOperation("/");
        fcInc();
    }//GEN-LAST:event_btnDivideActionPerformed

    
    public static void main(String args[])  {
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
            java.util.logging.Logger.getLogger(CalculatorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculatorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculatorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculatorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculatorForm().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDecimalPoint;
    private javax.swing.JButton btnDivide;
    private javax.swing.JButton btnEqual;
    private javax.swing.JButton btnMinus;
    private javax.swing.JButton btnMult;
    private javabeanlab.JIntegerField jIntegerField1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object input =  ae.getSource();
            
        if(input == btn0){
            if(functionCounter == 0 && getInteger().equals("0")|| buttonToggle){
                    insInteger("");
                    buttonToggle=false;
            }
            insInteger(getInteger()+getActCom(btn0));
        }
        
        else if(input == btn1){

            if(functionCounter == 0 && getInteger().equals("0")|| buttonToggle){
                    insInteger("");
                    buttonToggle=false;
            }
            insInteger(getInteger()+getActCom(btn1));        
        }
        
        else if(input == btn2){
            if(functionCounter == 0 && getInteger().equals("0") || buttonToggle){
                    insInteger("");
                    buttonToggle=false;
            }
            insInteger(getInteger()+getActCom(btn2));
        }
        
        else if(input == btn3){
            if(functionCounter == 0 && getInteger().equals("0") || buttonToggle){
                    insInteger("");
                    buttonToggle=false;
            }
            insInteger(getInteger()+getActCom(btn3));
        }
        
        else if(input == btn4){
            if(functionCounter == 0 && getInteger().equals("0") || buttonToggle){
                    insInteger("");
                    buttonToggle=false;
            }
            insInteger(getInteger()+getActCom(btn4));  
        }
        
        else if(input == btn5){
            if(functionCounter == 0 && getInteger().equals("0") || buttonToggle){
                    insInteger("");
                    buttonToggle=false;
            }
            insInteger(getInteger()+getActCom(btn5));
        }
        
        else if(input == btn6){
            if(functionCounter == 0 && getInteger().equals("0") || buttonToggle){
                    insInteger("");
                    buttonToggle=false;
            }
            insInteger(getInteger()+getActCom(btn6)); 
        }
        
        else if(input == btn7){
            if(functionCounter == 0 && getInteger().equals("0") || buttonToggle){
                    insInteger("");
                    buttonToggle=false;
            }
            insInteger(getInteger()+getActCom(btn7));
            
        }
        
        else if(input == btn8){
            if(functionCounter == 0 && getInteger().equals("0") || buttonToggle){
                    insInteger("");
                    buttonToggle=false;
            }
            insInteger(getInteger()+getActCom(btn8));
            
        }
        
        else if(input == btn9){
            if(functionCounter == 0 && getInteger().equals("0") || buttonToggle){
                    insInteger("");
                    buttonToggle=false;
            }
            insInteger(getInteger()+getActCom(btn9));
            
        }
        
        else if(input == btnDecimalPoint){
            if(functionCounter == 0 && getInteger().equals("0") || buttonToggle){
                    insInteger("");
                    buttonToggle=false;
                    insInteger(getInteger()+"0.");
            }else{
                insInteger(getInteger()+".");
            }
        }
        
        
    }
    
}
