import java.awt.event.*; 
import java.io.*;
import javax.swing.*;

public class sudokupuzzle extends JFrame {
    // declaring variables for JFrame
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField34;
    private javax.swing.JTextField jTextField35;
    private javax.swing.JTextField jTextField36;
    private javax.swing.JTextField jTextField37;
    private javax.swing.JTextField jTextField38;
    private javax.swing.JTextField jTextField39;
    private javax.swing.JTextField jTextField40;
    private javax.swing.JTextField jTextField41;
    private javax.swing.JTextField jTextField42;
    private javax.swing.JTextField jTextField43;
    private javax.swing.JTextField jTextField44;
    private javax.swing.JTextField jTextField45;
    private javax.swing.JTextField jTextField46;
    private javax.swing.JTextField jTextField47;
    private javax.swing.JTextField jTextField48;
    private javax.swing.JTextField jTextField49;
    private javax.swing.JTextField jTextField50;
    private javax.swing.JTextField jTextField51;
    private javax.swing.JTextField jTextField52;
    private javax.swing.JTextField jTextField53;
    private javax.swing.JTextField jTextField54;
    private javax.swing.JTextField jTextField55;
    private javax.swing.JTextField jTextField56;
    private javax.swing.JTextField jTextField57;
    private javax.swing.JTextField jTextField58;
    private javax.swing.JTextField jTextField59;
    private javax.swing.JTextField jTextField60;
    private javax.swing.JTextField jTextField61;
    private javax.swing.JTextField jTextField62;
    private javax.swing.JTextField jTextField63;
    private javax.swing.JTextField jTextField64;
    private javax.swing.JTextField jTextField65;
    private javax.swing.JTextField jTextField66;
    private javax.swing.JTextField jTextField67;
    private javax.swing.JTextField jTextField68;
    private javax.swing.JTextField jTextField69;
    private javax.swing.JTextField jTextField70;
    private javax.swing.JTextField jTextField71;
    private javax.swing.JTextField jTextField72;
    private javax.swing.JTextField jTextField73;
    private javax.swing.JTextField jTextField74;
    private javax.swing.JTextField jTextField75;
    private javax.swing.JTextField jTextField76;
    private javax.swing.JTextField jTextField77;
    private javax.swing.JTextField jTextField78;
    private javax.swing.JTextField jTextField79;
    private javax.swing.JTextField jTextField80;
    private javax.swing.JTextField jTextField81;
    private javax.swing.JTextField jTextField82;
    private javax.swing.JTextField jTextField83;
    private javax.swing.JButton solveButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton restButton;
        
    
    public sudokupuzzle() {
        jFrameComponents();
    }
    
    private void jFrameComponents() {
        setTitle("Sudoku Solver");
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        jTextField26 = new javax.swing.JTextField();
        jTextField27 = new javax.swing.JTextField();
        jTextField28 = new javax.swing.JTextField();
        jTextField29 = new javax.swing.JTextField();
        jTextField30 = new javax.swing.JTextField();
        jTextField31 = new javax.swing.JTextField();
        jTextField32 = new javax.swing.JTextField();
        jTextField33 = new javax.swing.JTextField();
        jTextField34 = new javax.swing.JTextField();
        jTextField35 = new javax.swing.JTextField();
        jTextField36 = new javax.swing.JTextField();
        jTextField37 = new javax.swing.JTextField();
        jTextField38 = new javax.swing.JTextField();
        jTextField39 = new javax.swing.JTextField();
        jTextField40 = new javax.swing.JTextField();
        jTextField41 = new javax.swing.JTextField();
        jTextField42 = new javax.swing.JTextField();
        jTextField43 = new javax.swing.JTextField();
        jTextField44 = new javax.swing.JTextField();
        jTextField45 = new javax.swing.JTextField();
        jTextField46 = new javax.swing.JTextField();
        jTextField47 = new javax.swing.JTextField();
        jTextField48 = new javax.swing.JTextField();
        jTextField49 = new javax.swing.JTextField();
        jTextField50 = new javax.swing.JTextField();
        jTextField51 = new javax.swing.JTextField();
        jTextField52 = new javax.swing.JTextField();
        jTextField53 = new javax.swing.JTextField();
        jTextField54 = new javax.swing.JTextField();
        jTextField55 = new javax.swing.JTextField();
        jTextField56 = new javax.swing.JTextField();
        jTextField57 = new javax.swing.JTextField();
        jTextField58 = new javax.swing.JTextField();
        jTextField59 = new javax.swing.JTextField();
        jTextField60 = new javax.swing.JTextField();
        jTextField61 = new javax.swing.JTextField();
        jTextField62 = new javax.swing.JTextField();
        jTextField63 = new javax.swing.JTextField();
        jTextField64 = new javax.swing.JTextField();
        jTextField65 = new javax.swing.JTextField();
        jTextField66 = new javax.swing.JTextField();
        jTextField67 = new javax.swing.JTextField();
        jTextField68 = new javax.swing.JTextField();
        jTextField69 = new javax.swing.JTextField();
        jTextField70 = new javax.swing.JTextField();
        jTextField71 = new javax.swing.JTextField();
        jTextField72 = new javax.swing.JTextField();
        jTextField73 = new javax.swing.JTextField();
        jTextField74 = new javax.swing.JTextField();
        jTextField75 = new javax.swing.JTextField();
        jTextField76 = new javax.swing.JTextField();
        jTextField77 = new javax.swing.JTextField();
        jTextField78 = new javax.swing.JTextField();
        jTextField79 = new javax.swing.JTextField();
        jTextField80 = new javax.swing.JTextField();
        jTextField81 = new javax.swing.JTextField();
        jTextField82 = new javax.swing.JTextField();
        jTextField83 = new javax.swing.JTextField();
        solveButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        restButton = new javax.swing.JButton();
        
        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 36));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        
        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 36));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        
        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 36));
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        
        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 36));
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        
        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 36));
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        
        jTextField6.setFont(new java.awt.Font("Tahoma", 0, 36));
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        
        jTextField7.setFont(new java.awt.Font("Tahoma", 0, 36));
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        
        jTextField8.setFont(new java.awt.Font("Tahoma", 0, 36));
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        
        jTextField9.setFont(new java.awt.Font("Tahoma", 0, 36));
        jTextField9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        
        jTextField10.setFont(new java.awt.Font("Tahoma", 0, 36));
        jTextField10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        
        jTextField11.setFont(new java.awt.Font("Tahoma", 0, 36));
        jTextField11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        
        jTextField12.setFont(new java.awt.Font("Tahoma", 0, 36));
        jTextField12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        
        jTextField13.setFont(new java.awt.Font("Tahoma", 0, 36));
        jTextField13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        
        jTextField14.setFont(new java.awt.Font("Tahoma", 0, 36));
        jTextField14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        
        jTextField15.setFont(new java.awt.Font("Tahoma", 0, 36));
        jTextField15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        
        jTextField16.setFont(new java.awt.Font("Tahoma", 0, 36));
        jTextField16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        
        jTextField17.setFont(new java.awt.Font("Tahoma", 0, 36));
        jTextField17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        
        jTextField18.setFont(new java.awt.Font("Tahoma", 0, 36));
        jTextField18.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        
        jTextField19.setFont(new java.awt.Font("Tahoma", 0, 36));
        jTextField19.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        
        jTextField20.setFont(new java.awt.Font("Tahoma", 0, 36));
        jTextField20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        
        jTextField21.setFont(new java.awt.Font("Tahoma", 0, 36));
        jTextField21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        
        jTextField22.setFont(new java.awt.Font("Tahoma", 0, 36));
        jTextField22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        
        jTextField23.setFont(new java.awt.Font("Tahoma", 0, 36));
        jTextField23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        
        jTextField24.setFont(new java.awt.Font("Tahoma", 0, 36));
        jTextField24.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        
        jTextField25.setFont(new java.awt.Font("Tahoma", 0, 36));
        jTextField25.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        
        jTextField26.setFont(new java.awt.Font("Tahoma", 0, 36));
        jTextField26.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        
        jTextField27.setFont(new java.awt.Font("Tahoma", 0, 36));
        jTextField27.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        
        jTextField28.setFont(new java.awt.Font("Tahoma", 0, 36));
        jTextField28.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        
        jTextField29.setFont(new java.awt.Font("Tahoma", 0, 36));
        jTextField29.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        
        jTextField30.setFont(new java.awt.Font("Tahoma", 0, 36));
        jTextField30.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        
        jTextField31.setFont(new java.awt.Font("Tahoma", 0, 36));
        jTextField31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        
        jTextField32.setFont(new java.awt.Font("Tahoma", 0, 36));
        jTextField32.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        
        jTextField33.setFont(new java.awt.Font("Tahoma", 0, 36));
        jTextField33.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        
        jTextField34.setFont(new java.awt.Font("Tahoma", 0, 36));
        jTextField34.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        
        jTextField35.setFont(new java.awt.Font("Tahoma", 0, 36));
        jTextField35.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        
        jTextField36.setFont(new java.awt.Font("Tahoma", 0, 36));
        jTextField36.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        
        jTextField37.setFont(new java.awt.Font("Tahoma", 0, 36));
        jTextField37.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        
        jTextField38.setFont(new java.awt.Font("Tahoma", 0, 36));
        jTextField38.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        
        jTextField39.setFont(new java.awt.Font("Tahoma", 0, 36));
        jTextField39.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        
        jTextField40.setFont(new java.awt.Font("Tahoma", 0, 36));
        jTextField40.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        
        jTextField41.setFont(new java.awt.Font("Tahoma", 0, 36));
        jTextField41.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        
        jTextField42.setFont(new java.awt.Font("Tahoma", 0, 36));
        jTextField42.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        
        jTextField43.setFont(new java.awt.Font("Tahoma", 0, 36));
        jTextField43.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        
        jTextField44.setFont(new java.awt.Font("Tahoma", 0, 36));
        jTextField44.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        
        jTextField45.setFont(new java.awt.Font("Tahoma", 0, 36));
        jTextField45.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        
        jTextField46.setFont(new java.awt.Font("Tahoma", 0, 36));
        jTextField46.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        
        jTextField47.setFont(new java.awt.Font("Tahoma", 0, 36));
        jTextField47.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        
        jTextField48.setFont(new java.awt.Font("Tahoma", 0, 36));
        jTextField48.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        
        jTextField49.setFont(new java.awt.Font("Tahoma", 0, 36));
        jTextField49.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        
        jTextField50.setFont(new java.awt.Font("Tahoma", 0, 36));
        jTextField50.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        
        jTextField51.setFont(new java.awt.Font("Tahoma", 0, 36));
        jTextField51.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        
        jTextField52.setFont(new java.awt.Font("Tahoma", 0, 36));
        jTextField52.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        
        jTextField53.setFont(new java.awt.Font("Tahoma", 0, 36));
        jTextField53.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        
        jTextField54.setFont(new java.awt.Font("Tahoma", 0, 36));
        jTextField54.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        
        jTextField55.setFont(new java.awt.Font("Tahoma", 0, 36));
        jTextField55.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        
        jTextField56.setFont(new java.awt.Font("Tahoma", 0, 36));
        jTextField56.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        
        jTextField57.setFont(new java.awt.Font("Tahoma", 0, 36));
        jTextField57.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        
        jTextField58.setFont(new java.awt.Font("Tahoma", 0, 36));
        jTextField58.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        
        jTextField59.setFont(new java.awt.Font("Tahoma", 0, 36));
        jTextField59.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        
        jTextField60.setFont(new java.awt.Font("Tahoma", 0, 36));
        jTextField60.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        
        jTextField61.setFont(new java.awt.Font("Tahoma", 0, 36));
        jTextField61.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        
        jTextField62.setFont(new java.awt.Font("Tahoma", 0, 36));
        jTextField62.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        
        jTextField63.setFont(new java.awt.Font("Tahoma", 0, 36));
        jTextField63.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        
        jTextField64.setFont(new java.awt.Font("Tahoma", 0, 36));
        jTextField64.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        
        jTextField65.setFont(new java.awt.Font("Tahoma", 0, 36));
        jTextField65.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        
        jTextField66.setFont(new java.awt.Font("Tahoma", 0, 36));
        jTextField66.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        
        jTextField67.setFont(new java.awt.Font("Tahoma", 0, 36));
        jTextField67.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        
        jTextField68.setFont(new java.awt.Font("Tahoma", 0, 36));
        jTextField68.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        
        jTextField69.setFont(new java.awt.Font("Tahoma", 0, 36));
        jTextField69.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        
        jTextField70.setFont(new java.awt.Font("Tahoma", 0, 36));
        jTextField70.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        
        jTextField71.setFont(new java.awt.Font("Tahoma", 0, 36));
        jTextField71.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        
        jTextField72.setFont(new java.awt.Font("Tahoma", 0, 36));
        jTextField72.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        
        jTextField73.setFont(new java.awt.Font("Tahoma", 0, 36));
        jTextField73.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        
        jTextField74.setFont(new java.awt.Font("Tahoma", 0, 36));
        jTextField74.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        
        jTextField75.setFont(new java.awt.Font("Tahoma", 0, 36));
        jTextField75.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        
        jTextField76.setFont(new java.awt.Font("Tahoma", 0, 36));
        jTextField76.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        
        jTextField77.setFont(new java.awt.Font("Tahoma", 0, 36));
        jTextField77.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        
        jTextField78.setFont(new java.awt.Font("Tahoma", 0, 36));
        jTextField78.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        
        jTextField79.setFont(new java.awt.Font("Tahoma", 0, 36));
        jTextField79.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        
        jTextField80.setFont(new java.awt.Font("Tahoma", 0, 36));
        jTextField80.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        
        jTextField81.setFont(new java.awt.Font("Tahoma", 0, 36));
        jTextField81.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        
        jTextField82.setFont(new java.awt.Font("Tahoma", 0, 36));
        jTextField82.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        
        jTextField83.setFont(new java.awt.Font("Tahoma", 0, 36));
        jTextField83.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        
        solveButton.setText("Solve Sudoku");
        solveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solveButtonActionPerformed(evt);
            }
        });
        
        restButton.setText("Reset Board");
        restButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restButtonActionPerformed(evt);
            }
        });
        
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("Enter the numbers in the correct position and click the \"Solve Sudoku\" button to solve the sudoku.");
        jTextArea1.setToolTipText("");
        jTextArea1.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jTextArea1);
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1))
                                .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(0, 0, 0)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jTextField3)
                                                .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(0, 0, 0)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(0, 0, 0)
                                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(0, 0, 0)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(1, 1, 1)
                                            .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jTextField40, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(jTextField41, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(jTextField47, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextField54, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                        .addComponent(jTextField53, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                        .addComponent(jTextField39, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addComponent(jTextField55, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addComponent(jTextField56, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addComponent(jTextField57, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField64, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField65, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(jTextField34, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(jTextField37, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jTextField43, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, 0)
                                            .addComponent(jTextField48, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jTextField42, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, 0)
                                            .addComponent(jTextField49, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jTextField35, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jTextField44, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jTextField50, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jTextField38, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jTextField45, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jTextField51, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jTextField36, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jTextField46, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jTextField52, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField58, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField59, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, 0)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField68, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField66, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField67, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField8)
                                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, 0)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField72, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField74, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTextField75, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, 0)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField80, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField73, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField79, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextField61, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(jTextField60, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                            .addGap(0, 0, 0)
                            .addComponent(jTextField69, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jTextField76, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jTextField81, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextField63, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                .addComponent(jTextField62, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addGap(0, 0, 0)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jTextField70, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(jTextField77, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addComponent(jTextField82, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jTextField71, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(jTextField78, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(jTextField83, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(solveButton)
                            .addComponent(restButton, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(solveButton)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField40)
                                    .addComponent(jTextField28)
                                    .addComponent(jTextField41)
                                    .addComponent(jTextField47)
                                    .addComponent(jTextField53)
                                    .addComponent(jTextField58, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField43, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jTextField64, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jTextField34, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, 0)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jTextField68, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jTextField75, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jTextField80, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jTextField37, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jTextField42, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jTextField65, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(jTextField49)
                                                .addComponent(jTextField39)
                                                .addComponent(jTextField60, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField48, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField54, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField59, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField67, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField74, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField79, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextField73, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField72, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField66, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)))
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField81, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField76, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField31)
                                .addComponent(jTextField35)
                                .addComponent(jTextField44)
                                .addComponent(jTextField50)
                                .addComponent(jTextField55)
                                .addComponent(jTextField61)
                                .addComponent(jTextField69, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField70, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField32, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                .addComponent(jTextField38, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                .addComponent(jTextField45, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                .addComponent(jTextField51, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                .addComponent(jTextField56)
                                .addComponent(jTextField62))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField77, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField82, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField33, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                .addComponent(jTextField36, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                .addComponent(jTextField46, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                .addComponent(jTextField52, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                .addComponent(jTextField57)
                                .addComponent(jTextField63))
                            .addComponent(jTextField71, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField78, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField83, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(restButton)
                        .addGap(43, 43, 43)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
        );

        pack();
        setVisible(true);
    }
    
    private int[] findEmpty (int[][] board) {
        int[] position = new int [2];
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                if (board[r][c] == -1) {
                    position[0] = r;
                    position[1] = c;
                    return position;
                }
            }
        }
        
        position[0] = -2;
        position[1] = -2;
        return position;
    }
    
    private boolean checkValid (int[][] board, int row, int col, int trialNum) {
        int[] currentRow = new int [9];
        for (int i = 0; i < 9; i++) {
            currentRow[i] = board[row][i];
        }
        for (int i = 0; i < 9; i++) {
            if (trialNum == currentRow[i]){
                return false;
            }     
        }
        
        int[] currentCol = new int [9];
        for (int i = 0 ; i < 9 ; i++) {
            currentCol[i] = board[i][col];
        }

        for (int i = 0 ; i < 9 ; i++) {
            if (trialNum == currentCol [i]) {
                return false;
            }
        }
        
        int rowStart = (int) ((Math.floor (row / 3)) * 3);
        int colStart = (int) ((Math.floor (col / 3)) * 3);
        
        for (int r = rowStart ; r < (rowStart + 3) ; r++) {
            for (int c = colStart ; c < (colStart + 3) ; c++) {
                if (board[r][c] == trialNum) {
                    return false;
                }
            }
        }

        return true;
    }
    
    private boolean solveBoard (int[][] board) {
        int position[] = findEmpty(board);
        int row = position[0];
        int col = position[1];
        
        if (row == -2) {
            return true;
        }
        
        for (int trialNum = 1; trialNum < 10; trialNum++) {
            if (checkValid (board, row, col, trialNum) == true) {
                board[row][col] = trialNum;
                if (solveBoard(board) == true) {
                    return true;
                }
            }
            board[row][col] = -1;
        }
        
        return false;
    }
    private void solveButtonActionPerformed(java.awt.event.ActionEvent evt) {                                         
        int[][] board = new int [9][9];
        String input;
        
        // row 1
        input = jTextField1.getText();
        if (input.equals("")) {
            board[0][0] = -1;
        } else {
            board[0][0] = Integer.parseInt(jTextField1.getText());
        }
        
        input = jTextField2.getText();
        if (input.equals("")){
            board[0][1] = -1;
        } else {
            board[0][1] = Integer.parseInt(jTextField2.getText());
        }
        
        input = jTextField3.getText();
        if (input.equals("")) {
            board[0][2] = -1;
        } else {
            board[0][2] = Integer.parseInt(jTextField3.getText());
        }
        
        input = jTextField4.getText();
        if (input.equals("")) {
            board[0][3] = -1;
        } else {
            board[0][3] = Integer.parseInt(jTextField4.getText());
        }
        
        input = jTextField5.getText();
        if (input.equals("")) {
            board[0][4] = -1;
        } else {
            board[0][4] = Integer.parseInt(jTextField5.getText());
        }
        
        input = jTextField6.getText();
        if (input.equals("")) {
            board[0][5] = -1;
        } else {
            board[0][5] = Integer.parseInt(jTextField6.getText());
        }
        
        input = jTextField7.getText();
        if (input.equals("")) {
            board[0][6] = -1;
        } else {
            board[0][6] = Integer.parseInt(jTextField7.getText());
        }
        
        input = jTextField8.getText();
        if (input.equals("")) {
            board[0][7] = -1;
        } else {
            board[0][7] = Integer.parseInt(jTextField8.getText());
        }
        
        input = jTextField9.getText();
        if (input.equals("")) {
            board[0][8] = -1;
        } else {
            board[0][8] = Integer.parseInt(jTextField9.getText());
        }
        
        
        // row 2
        input = jTextField10.getText();
        if (input.equals("")) {
            board[1][0] = -1;
        } else {
            board[1][0] = Integer.parseInt(jTextField10.getText());
        }
        
        input = jTextField11.getText();
        if (input.equals("")) {
            board[1][1] = -1;
        } else {
            board[1][1] = Integer.parseInt(jTextField11.getText());
        }
        
        input = jTextField12.getText();
        if (input.equals("")) {
            board[1][2] = -1;
        } else {
            board[1][2] = Integer.parseInt(jTextField12.getText());
        }
        
        input = jTextField13.getText();
        if (input.equals("")) {
            board[1][3] = -1;
        } else {
            board[1][3] = Integer.parseInt(jTextField13.getText());
        }
        
        input = jTextField14.getText();
        if (input.equals("")) {
            board[1][4] = -1;
        } else {
            board[1][4] = Integer.parseInt(jTextField14.getText());
        }
        
        input = jTextField15.getText();
        if (input.equals("")) {
            board[1][5] = -1;
        } else {
            board[1][5] = Integer.parseInt(jTextField15.getText());
        }
        
        input = jTextField16.getText();
        if (input.equals("")) {
            board[1][6] = -1;
        } else {
            board[1][6] = Integer.parseInt(jTextField16.getText());
        }
        
        input = jTextField17.getText();
        if (input.equals("")) {
            board[1][7] = -1;
        } else {
            board[1][7] = Integer.parseInt(jTextField17.getText());
        }
        
        input = jTextField18.getText();
        if (input.equals("")) {
            board[1][8] = -1;
        } else {
            board[1][8] = Integer.parseInt(jTextField18.getText());
        }
        
        
        // row 3
        input = jTextField19.getText();
        if (input.equals("")) {
            board[2][0] = -1;
        } else {
            board[2][0] = Integer.parseInt(jTextField19.getText());
        }
        
        input = jTextField20.getText();
        if (input.equals("")) {
            board[2][1] = -1;
        } else {
            board[2][1] = Integer.parseInt(jTextField20.getText());
        }
        
        input = jTextField21.getText();
        if (input.equals("")) {
            board[2][2] = -1;
        } else {
            board[2][2] = Integer.parseInt(jTextField21.getText());
        }
        
        input = jTextField22.getText();
        if (input.equals("")) {
            board[2][3] = -1;
        } else {
            board[2][3] = Integer.parseInt(jTextField22.getText());
        }
        
        input = jTextField23.getText();
        if (input.equals("")) {
            board[2][4] = -1;
        } else {
            board[2][4] = Integer.parseInt(jTextField23.getText());
        }
        
        input = jTextField24.getText();
        if (input.equals("")) {
            board[2][5] = -1;
        } else {
            board[2][5] = Integer.parseInt(jTextField24.getText());
        }
        
        input = jTextField25.getText();
        if (input.equals("")) {
            board[2][6] = -1;
        } else {
            board[2][6] = Integer.parseInt(jTextField25.getText());
        }
        
        input = jTextField26.getText();
        if (input.equals("")) {
            board[2][7] = -1;
        } else {
            board[2][7] = Integer.parseInt(jTextField26.getText());
        }
        
        input = jTextField27.getText();
        if (input.equals("")) {
            board[2][8] = -1;
        } else {
            board[2][8] = Integer.parseInt(jTextField27.getText());
        }
        
        
        // row 4
        input = jTextField28.getText();
        if (input.equals("")) {
            board[3][0] = -1;
        } else {
            board[3][0] = Integer.parseInt(jTextField28.getText());
        }
        
        input = jTextField40.getText();
        if (input.equals("")) {
            board[3][1] = -1;
        } else {
            board[3][1] = Integer.parseInt(jTextField40.getText());
        }
        
        input = jTextField41.getText();
        if (input.equals("")) {
            board[3][2] = -1;
        } else {
            board[3][2] = Integer.parseInt(jTextField41.getText());
        }
        
        input = jTextField47.getText();
        if (input.equals("")) {
            board[3][3] = -1;
        } else {
            board[3][3] = Integer.parseInt(jTextField47.getText());
        }
        
        input = jTextField53.getText();
        if (input.equals("")) {
            board[3][4] = -1;
        } else {
            board[3][4] = Integer.parseInt(jTextField53.getText());
        }
        
        input = jTextField58.getText();
        if (input.equals("")) {
            board[3][5] = -1;
        } else {
            board[3][5] = Integer.parseInt(jTextField58.getText());
        }
        
        input = jTextField66.getText();
        if (input.equals("")) {
            board[3][6] = -1;
        } else {
            board[3][6] = Integer.parseInt(jTextField66.getText());
        }
        
        input = jTextField72.getText();
        if (input.equals("")) {
            board[3][7] = -1;
        } else {
            board[3][7] = Integer.parseInt(jTextField72.getText());
        }
        
        input = jTextField73.getText();
        if (input.equals("")) {
            board[3][8] = -1;
        } else {
            board[3][8] = Integer.parseInt(jTextField73.getText());
        }
        
        
        // row 5
        input = jTextField64.getText();
        if (input.equals("")) {
            board[4][0] = -1;
        } else {
            board[4][0] = Integer.parseInt(jTextField64.getText());
        }
        
        input = jTextField29.getText();
        if (input.equals("")) {
            board[4][1] = -1;
        } else {
            board[4][1] = Integer.parseInt(jTextField29.getText());
        }
        
        input = jTextField34.getText();
        if (input.equals("")) {
            board[4][2] = -1;
        } else {
            board[4][2] = Integer.parseInt(jTextField34.getText());
        }
        
        input = jTextField43.getText();
        if (input.equals("")) {
            board[4][3] = -1;
        } else {
            board[4][3] = Integer.parseInt(jTextField43.getText());
        }
        
        input = jTextField54.getText();
        if (input.equals("")) {
            board[4][4] = -1;
        } else {
            board[4][4] = Integer.parseInt(jTextField54.getText());
        }
        
        input = jTextField59.getText();
        if (input.equals("")) {
            board[4][5] = -1;
        } else {
            board[4][5] = Integer.parseInt(jTextField59.getText());
        }
        
        input = jTextField67.getText();
        if (input.equals("")) {
            board[4][6] = -1;
        } else {
            board[4][6] = Integer.parseInt(jTextField67.getText());
        }
        
        input = jTextField74.getText();
        if (input.equals("")) {
            board[4][7] = -1;
        } else {
            board[4][7] = Integer.parseInt(jTextField74.getText());
        }
        
        input = jTextField79.getText();
        if (input.equals("")) {
            board[4][8] = -1;
        } else {
            board[4][8] = Integer.parseInt(jTextField79.getText());
        }
        
        
        // row 6
        input = jTextField65.getText();
        if (input.equals("")) {
            board[5][0] = -1;
        } else {
            board[5][0] = Integer.parseInt(jTextField65.getText());
        }
        
        input = jTextField30.getText();
        if (input.equals("")) {
            board[5][1] = -1;
        } else {
            board[5][1] = Integer.parseInt(jTextField30.getText());
        }
        
        input = jTextField37.getText();
        if (input.equals("")) {
            board[5][2] = -1;
        } else {
            board[5][2] = Integer.parseInt(jTextField37.getText());
        }
        
        input = jTextField42.getText();
        if (input.equals("")) {
            board[5][3] = -1;
        } else {
            board[5][3] = Integer.parseInt(jTextField42.getText());
        }
        
        input = jTextField49.getText();
        if (input.equals("")) {
            board[5][4] = -1;
        } else {
            board[5][4] = Integer.parseInt(jTextField49.getText());
        }
        
        input = jTextField60.getText();
        if (input.equals("")) {
            board[5][5] = -1;
        } else {
            board[5][5] = Integer.parseInt(jTextField60.getText());
        }
        
        input = jTextField68.getText();
        if (input.equals("")) {
            board[5][6] = -1;
        } else {
            board[5][6] = Integer.parseInt(jTextField68.getText());
        }
        
        input = jTextField75.getText();
        if (input.equals("")) {
            board[5][7] = -1;
        } else {
            board[5][7] = Integer.parseInt(jTextField75.getText());
        }
        
        input = jTextField80.getText();
        if (input.equals("")) {
            board[5][8] = -1;
        } else {
            board[5][8] = Integer.parseInt(jTextField80.getText());
        }
        
        
        // row 7
        input = jTextField31.getText();
        if (input.equals("")) {
            board[6][0] = -1;
        } else {
            board[6][0] = Integer.parseInt(jTextField31.getText());
        }
        
        input = jTextField35.getText();
        if (input.equals("")) {
            board[6][1] = -1;
        } else {
            board[6][1] = Integer.parseInt(jTextField35.getText());
        }
        
        input = jTextField44.getText();
        if (input.equals("")) {
            board[6][2] = -1;
        } else {
            board[6][2] = Integer.parseInt(jTextField44.getText());
        }
        
        input = jTextField50.getText();
        if (input.equals("")) {
            board[6][3] = -1;
        } else {
            board[6][3] = Integer.parseInt(jTextField50.getText());
        }
        
        input = jTextField55.getText();
        if (input.equals("")) {
            board[6][4] = -1;
        } else {
            board[6][4] = Integer.parseInt(jTextField55.getText());
        }
        
        input = jTextField61.getText();
        if (input.equals("")) {
            board[6][5] = -1;
        } else {
            board[6][5] = Integer.parseInt(jTextField61.getText());
        }
        
        input = jTextField69.getText();
        if (input.equals("")) {
            board[6][6] = -1;
        } else {
            board[6][6] = Integer.parseInt(jTextField69.getText());
        }
        
        input = jTextField76.getText();
        if (input.equals("")) {
            board[6][7] = -1;
        } else {
            board[6][7] = Integer.parseInt(jTextField76.getText());
        }
        
        input = jTextField81.getText();
        if (input.equals("")) {
            board[6][8] = -1;
        } else {
            board[6][8] = Integer.parseInt(jTextField81.getText());
        }
        
        
        // row 8
        input = jTextField32.getText();
        if (input.equals("")) {
            board[7][0] = -1;
        } else {
            board[7][0] = Integer.parseInt(jTextField32.getText());
        }
        
        input = jTextField38.getText();
        if (input.equals("")) {
            board[7][1] = -1;
        } else {
            board[7][1] = Integer.parseInt(jTextField38.getText());
        }
        
        input = jTextField45.getText();
        if (input.equals("")) {
            board[7][2] = -1;
        } else {
            board[7][2] = Integer.parseInt(jTextField45.getText());
        }
        
        input = jTextField51.getText();
        if (input.equals("")) {
            board[7][3] = -1;
        } else {
            board[7][3] = Integer.parseInt(jTextField51.getText());
        }
        
        input = jTextField56.getText();
        if (input.equals("")) {
            board[7][4] = -1;
        } else {
            board[7][4] = Integer.parseInt(jTextField56.getText());
        }
        
        input = jTextField62.getText();
        if (input.equals("")) {
            board[7][5] = -1;
        } else {
            board[7][5] = Integer.parseInt(jTextField62.getText());
        }
        
        input = jTextField70.getText();
        if (input.equals("")) {
            board[7][6] = -1;
        } else {
            board[7][6] = Integer.parseInt(jTextField70.getText());
        }
        
        input = jTextField77.getText();
        if (input.equals("")) {
            board[7][7] = -1;
        } else {
            board[7][7] = Integer.parseInt(jTextField77.getText());
        }
        
        input = jTextField82.getText();
        if (input.equals("")) {
            board[7][8] = -1;
        } else {
            board[7][8] = Integer.parseInt(jTextField82.getText());
        }
        
        
        // row 9
        input = jTextField33.getText();
        if (input.equals("")) {
            board[8][0] = -1;
        } else {
            board[8][0] = Integer.parseInt(jTextField33.getText());
        }
        
        input = jTextField36.getText();
        if (input.equals("")) {
            board[8][1] = -1;
        } else {
            board[8][1] = Integer.parseInt(jTextField36.getText());
        }
        
        input = jTextField46.getText();
        if (input.equals("")) {
            board[8][2] = -1;
        } else {
            board[8][2] = Integer.parseInt(jTextField46.getText());
        }
        
        input = jTextField52.getText();
        if (input.equals("")) {
            board[8][3] = -1;
        } else {
            board[8][3] = Integer.parseInt(jTextField52.getText());
        }
        
        input = jTextField57.getText();
        if (input.equals("")) {
            board[8][4] = -1;
        } else {
            board[8][4] = Integer.parseInt(jTextField57.getText());
        }
        
        input = jTextField63.getText();
        if (input.equals("")) {
            board[8][5] = -1;
        } else {
            board[8][5] = Integer.parseInt(jTextField63.getText());
        }
        
        input = jTextField71.getText();
        if (input.equals("")) {
            board[8][6] = -1;
        } else {
            board[8][6] = Integer.parseInt(jTextField71.getText());
        }
        
        input = jTextField78.getText();
        if (input.equals("")) {
            board[8][7] = -1;
        } else {
            board[8][7] = Integer.parseInt(jTextField78.getText());
        }
        
        input = jTextField83.getText();
        if (input.equals("")) {
            board[8][8] = -1;
        } else {
            board[8][8] = Integer.parseInt(jTextField83.getText());
        }
        
        if (solveBoard (board) == false) {
            jTextArea1.setText("Sorry this sudoku has has no solution");
        } else {
            jTextField1.setText(Integer.toString(board[0][0]));
            jTextField2.setText(Integer.toString(board[0][1]));
            jTextField3.setText(Integer.toString(board[0][2]));
            jTextField4.setText(Integer.toString(board[0][3]));
            jTextField5.setText(Integer.toString(board[0][4]));
            jTextField6.setText(Integer.toString(board[0][5]));
            jTextField7.setText(Integer.toString(board[0][6]));
            jTextField8.setText(Integer.toString(board[0][7]));
            jTextField9.setText(Integer.toString(board[0][8]));
            
            jTextField10.setText(Integer.toString(board[1][0]));
            jTextField11.setText(Integer.toString(board[1][1]));
            jTextField12.setText(Integer.toString(board[1][2]));
            jTextField13.setText(Integer.toString(board[1][3]));
            jTextField14.setText(Integer.toString(board[1][4]));
            jTextField15.setText(Integer.toString(board[1][5]));
            jTextField16.setText(Integer.toString(board[1][6]));
            jTextField17.setText(Integer.toString(board[1][7]));
            jTextField18.setText(Integer.toString(board[1][8]));
            
            jTextField19.setText(Integer.toString(board[2][0]));
            jTextField20.setText(Integer.toString(board[2][1]));
            jTextField21.setText(Integer.toString(board[2][2]));
            jTextField22.setText(Integer.toString(board[2][3]));
            jTextField23.setText(Integer.toString(board[2][4]));
            jTextField24.setText(Integer.toString(board[2][5]));
            jTextField25.setText(Integer.toString(board[2][6]));
            jTextField26.setText(Integer.toString(board[2][7]));
            jTextField27.setText(Integer.toString(board[2][8]));
            
            jTextField28.setText(Integer.toString(board[3][0]));
            jTextField40.setText(Integer.toString(board[3][1]));
            jTextField41.setText(Integer.toString(board[3][2]));
            jTextField47.setText(Integer.toString(board[3][3]));
            jTextField53.setText(Integer.toString(board[3][4]));
            jTextField58.setText(Integer.toString(board[3][5]));
            jTextField66.setText(Integer.toString(board[3][6]));
            jTextField72.setText(Integer.toString(board[3][7]));
            jTextField73.setText(Integer.toString(board[3][8]));
           
            jTextField64.setText(Integer.toString(board[4][0]));
            jTextField29.setText(Integer.toString(board[4][1]));
            jTextField34.setText(Integer.toString(board[4][2]));
            jTextField43.setText(Integer.toString(board[4][3]));
            jTextField54.setText(Integer.toString(board[4][4]));
            jTextField59.setText(Integer.toString(board[4][5]));
            jTextField67.setText(Integer.toString(board[4][6]));
            jTextField74.setText(Integer.toString(board[4][7]));
            jTextField79.setText(Integer.toString(board[4][8]));
           
            jTextField65.setText(Integer.toString(board[5][0]));
            jTextField30.setText(Integer.toString(board[5][1]));
            jTextField37.setText(Integer.toString(board[5][2]));
            jTextField42.setText(Integer.toString(board[5][3]));
            jTextField49.setText(Integer.toString(board[5][4]));
            jTextField60.setText(Integer.toString(board[5][5]));
            jTextField68.setText(Integer.toString(board[5][6]));
            jTextField75.setText(Integer.toString(board[5][7]));
            jTextField80.setText(Integer.toString(board[5][8]));
            
            jTextField31.setText(Integer.toString(board[6][0]));
            jTextField35.setText(Integer.toString(board[6][1]));
            jTextField44.setText(Integer.toString(board[6][2]));
            jTextField50.setText(Integer.toString(board[6][3]));
            jTextField55.setText(Integer.toString(board[6][4]));
            jTextField61.setText(Integer.toString(board[6][5]));
            jTextField69.setText(Integer.toString(board[6][6]));
            jTextField76.setText(Integer.toString(board[6][7]));
            jTextField81.setText(Integer.toString(board[6][8]));
            
            jTextField32.setText(Integer.toString(board[7][0]));
            jTextField38.setText(Integer.toString(board[7][1]));
            jTextField45.setText(Integer.toString(board[7][2]));
            jTextField51.setText(Integer.toString(board[7][3]));
            jTextField56.setText(Integer.toString(board[7][4]));
            jTextField62.setText(Integer.toString(board[7][5]));
            jTextField70.setText(Integer.toString(board[7][6]));
            jTextField77.setText(Integer.toString(board[7][7]));
            jTextField82.setText(Integer.toString(board[7][8]));
            
            jTextField33.setText(Integer.toString(board[8][0]));
            jTextField36.setText(Integer.toString(board[8][1]));
            jTextField46.setText(Integer.toString(board[8][2]));
            jTextField52.setText(Integer.toString(board[8][3]));
            jTextField57.setText(Integer.toString(board[8][4]));
            jTextField63.setText(Integer.toString(board[8][5]));
            jTextField71.setText(Integer.toString(board[8][6]));
            jTextField78.setText(Integer.toString(board[8][7]));
            jTextField83.setText(Integer.toString(board[8][8]));
            
            jTextArea1.setText("This sudoku is solvable! Here is the solution");
            
        }
    }
    
    private void restButtonActionPerformed(java.awt.event.ActionEvent evt) {                                         
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        jTextField8.setText("");
        jTextField9.setText("");
        
        jTextField10.setText("");
        jTextField11.setText("");
        jTextField12.setText("");
        jTextField13.setText("");
        jTextField14.setText("");
        jTextField15.setText("");
        jTextField16.setText("");
        jTextField17.setText("");
        jTextField18.setText("");
        
        jTextField19.setText("");
        jTextField20.setText("");
        jTextField21.setText("");
        jTextField22.setText("");
        jTextField23.setText("");
        jTextField24.setText("");
        jTextField25.setText("");
        jTextField26.setText("");
        jTextField27.setText("");
            
        jTextField28.setText("");
        jTextField40.setText("");
        jTextField41.setText("");
        jTextField47.setText("");
        jTextField53.setText("");
        jTextField58.setText("");
        jTextField66.setText("");
        jTextField72.setText("");
        jTextField73.setText("");
           
        jTextField64.setText("");
        jTextField29.setText("");
        jTextField34.setText("");
        jTextField43.setText("");
        jTextField54.setText("");
        jTextField59.setText("");
        jTextField67.setText("");
        jTextField74.setText("");
        jTextField79.setText("");
       
        jTextField65.setText("");
        jTextField30.setText("");
        jTextField37.setText("");
        jTextField42.setText("");
        jTextField49.setText("");
        jTextField60.setText("");
        jTextField68.setText("");
        jTextField75.setText("");
        jTextField80.setText("");
        
        jTextField31.setText("");
        jTextField35.setText("");
        jTextField44.setText("");
        jTextField50.setText("");
        jTextField55.setText("");
        jTextField61.setText("");
        jTextField69.setText("");
        jTextField76.setText("");
        jTextField81.setText("");
            
        jTextField32.setText("");
        jTextField38.setText("");
        jTextField45.setText("");
        jTextField51.setText("");
        jTextField56.setText("");
        jTextField62.setText("");
        jTextField70.setText("");
        jTextField77.setText("");
        jTextField82.setText("");
            
        jTextField33.setText("");
        jTextField36.setText("");
        jTextField46.setText("");
        jTextField52.setText("");
        jTextField57.setText("");
        jTextField63.setText("");
        jTextField71.setText("");
        jTextField78.setText("");
        jTextField83.setText("");
        
        jTextArea1.setText("Enter the numbers in the correct position and click the \"Solve Sudoku\" button to solve the sudoku.");
    } 
    
    public static void main (String args[]){
        sudokupuzzle frame = new sudokupuzzle();
    }
}