/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gerenciador;

import java.util.Random;

/**
 *
 * @author igorfael3
 */
public class GerenciadorDeTarefas extends javax.swing.JFrame {
    
    Random randomNumber = new Random();
    
    Integer cpuValue, cpuValueMin, cpuSumMed, cpuAmountMed, cpuValueMax;
    Integer diskValue, diskValueMin, diskSumMed, diskAmountMed, diskValueMax;
    Integer ramValue, ramValueMin, ramSumMed, ramAmountMed, ramValueMax;
    Integer virtualValue, virtualValueMin, virtualSumMed,virtualAmountMed, virtualValueMax;
    Double cpuValueExt, cpuValueMed; 
    Double diskValueMed;
    Double ramValueExt, ramValueMed;
    Double virtualValueExt, virtualValueMed;
    /**
     * Creates new form GerenciadorDeTarefas
     */
    public GerenciadorDeTarefas() {
        initComponents();
        initValues();
        printValues();
    }
    
    public void initValues() {
        cpuValue = randomNumber.nextInt(101);
        cpuValueMin = cpuValue;
        cpuValueMed = Double.valueOf(cpuValue);
        cpuSumMed = cpuValue;
        cpuAmountMed = 1;
        cpuValueMax = cpuValue;
        
        diskValue = randomNumber.nextInt(101);
        diskValueMin = diskValue;
        diskValueMed = Double.valueOf(diskValue);
        diskSumMed = diskValue;
        diskAmountMed = 1;
        diskValueMax = diskValue;
        
        ramValue = randomNumber.nextInt(101);
        ramValueMin = ramValue;
        ramValueMed = Double.valueOf(ramValue);
        ramSumMed = ramValue;
        ramAmountMed = 1;
        ramValueMax = ramValue;
        
        virtualValue = randomNumber.nextInt(101);
        virtualValueMin = virtualValue;
        virtualValueMed = Double.valueOf(virtualValue);
        virtualSumMed = virtualValue;
        virtualAmountMed = 1;
        virtualValueMax = virtualValue;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnAll = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        jpnCpu = new javax.swing.JPanel();
        lblCpu = new javax.swing.JLabel();
        jpbCpu = new javax.swing.JProgressBar();
        lblMinCpu = new javax.swing.JLabel();
        lblMinValueCpu = new javax.swing.JLabel();
        lblMedValueCpu = new javax.swing.JLabel();
        lblMedCpu = new javax.swing.JLabel();
        lblMaxCpu = new javax.swing.JLabel();
        lblMaxValueCpu = new javax.swing.JLabel();
        lblValueCpuExt = new javax.swing.JLabel();
        jpnRam = new javax.swing.JPanel();
        lblRam = new javax.swing.JLabel();
        jpbRam = new javax.swing.JProgressBar();
        lblMinRam = new javax.swing.JLabel();
        lblMinValueRam = new javax.swing.JLabel();
        lblMedValueRam = new javax.swing.JLabel();
        lblMedRam = new javax.swing.JLabel();
        lblMaxRam = new javax.swing.JLabel();
        lblMaxValueRam = new javax.swing.JLabel();
        lblValueRamExt = new javax.swing.JLabel();
        jpnDisk = new javax.swing.JPanel();
        lblDisk = new javax.swing.JLabel();
        jpbDisk = new javax.swing.JProgressBar();
        lblMinDisk = new javax.swing.JLabel();
        lblMinValueDisk = new javax.swing.JLabel();
        lblMedValueDisk = new javax.swing.JLabel();
        lblMedDisk = new javax.swing.JLabel();
        lblMaxDisk = new javax.swing.JLabel();
        lblMaxValueDisk = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        jpnRam1 = new javax.swing.JPanel();
        lblVirtual = new javax.swing.JLabel();
        jpbVirtual = new javax.swing.JProgressBar();
        lblMinVirtual = new javax.swing.JLabel();
        lblMinValueVirtual = new javax.swing.JLabel();
        lblMedValueVirtual = new javax.swing.JLabel();
        lblMedVirtual = new javax.swing.JLabel();
        lblMaxVirtual = new javax.swing.JLabel();
        lblMaxValueVirtual = new javax.swing.JLabel();
        lblValueVirtualExt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jpnAll.setBackground(new java.awt.Color(30, 30, 47));

        lblTitle.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(204, 204, 204));
        lblTitle.setText("Gerenciador de Tarefas");

        jpnCpu.setBackground(new java.awt.Color(38, 41, 59));

        lblCpu.setForeground(new java.awt.Color(204, 204, 204));
        lblCpu.setText("CPU:");

        jpbCpu.setForeground(new java.awt.Color(30, 30, 47));
        jpbCpu.setStringPainted(true);

        lblMinCpu.setForeground(new java.awt.Color(204, 204, 204));
        lblMinCpu.setText("Min:");

        lblMinValueCpu.setForeground(new java.awt.Color(204, 204, 204));
        lblMinValueCpu.setText("0");

        lblMedValueCpu.setForeground(new java.awt.Color(204, 204, 204));
        lblMedValueCpu.setText("0");

        lblMedCpu.setForeground(new java.awt.Color(204, 204, 204));
        lblMedCpu.setText("Med:");

        lblMaxCpu.setForeground(new java.awt.Color(204, 204, 204));
        lblMaxCpu.setText("Max:");

        lblMaxValueCpu.setForeground(new java.awt.Color(204, 204, 204));
        lblMaxValueCpu.setText("0");

        lblValueCpuExt.setForeground(new java.awt.Color(204, 204, 204));
        lblValueCpuExt.setText("0GHz");

        javax.swing.GroupLayout jpnCpuLayout = new javax.swing.GroupLayout(jpnCpu);
        jpnCpu.setLayout(jpnCpuLayout);
        jpnCpuLayout.setHorizontalGroup(
            jpnCpuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnCpuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnCpuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpbCpu, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                    .addGroup(jpnCpuLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblMinCpu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMinValueCpu, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblMedCpu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMedValueCpu, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblMaxCpu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMaxValueCpu, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpnCpuLayout.createSequentialGroup()
                        .addComponent(lblCpu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblValueCpuExt)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jpnCpuLayout.setVerticalGroup(
            jpnCpuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnCpuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnCpuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCpu)
                    .addComponent(lblValueCpuExt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpbCpu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnCpuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnCpuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblMedCpu)
                        .addComponent(lblMedValueCpu))
                    .addGroup(jpnCpuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblMaxCpu)
                        .addComponent(lblMaxValueCpu))
                    .addGroup(jpnCpuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblMinCpu)
                        .addComponent(lblMinValueCpu)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpnRam.setBackground(new java.awt.Color(38, 41, 59));

        lblRam.setForeground(new java.awt.Color(204, 204, 204));
        lblRam.setText("Memória:");

        jpbRam.setForeground(new java.awt.Color(30, 30, 47));
        jpbRam.setStringPainted(true);

        lblMinRam.setForeground(new java.awt.Color(204, 204, 204));
        lblMinRam.setText("Min:");

        lblMinValueRam.setForeground(new java.awt.Color(204, 204, 204));
        lblMinValueRam.setText("0");

        lblMedValueRam.setForeground(new java.awt.Color(204, 204, 204));
        lblMedValueRam.setText("0");

        lblMedRam.setForeground(new java.awt.Color(204, 204, 204));
        lblMedRam.setText("Med:");

        lblMaxRam.setForeground(new java.awt.Color(204, 204, 204));
        lblMaxRam.setText("Max:");

        lblMaxValueRam.setForeground(new java.awt.Color(204, 204, 204));
        lblMaxValueRam.setText("0");

        lblValueRamExt.setForeground(new java.awt.Color(204, 204, 204));
        lblValueRamExt.setText("0GB");

        javax.swing.GroupLayout jpnRamLayout = new javax.swing.GroupLayout(jpnRam);
        jpnRam.setLayout(jpnRamLayout);
        jpnRamLayout.setHorizontalGroup(
            jpnRamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnRamLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnRamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpbRam, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                    .addGroup(jpnRamLayout.createSequentialGroup()
                        .addComponent(lblRam)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblValueRamExt)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jpnRamLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblMinRam)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMinValueRam, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(lblMedRam)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMedValueRam, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblMaxRam)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMaxValueRam, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jpnRamLayout.setVerticalGroup(
            jpnRamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnRamLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnRamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRam)
                    .addComponent(lblValueRamExt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpbRam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnRamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnRamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblMedRam)
                        .addComponent(lblMedValueRam)
                        .addComponent(lblMaxRam)
                        .addComponent(lblMaxValueRam))
                    .addGroup(jpnRamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblMinRam)
                        .addComponent(lblMinValueRam)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jpnDisk.setBackground(new java.awt.Color(38, 41, 59));

        lblDisk.setForeground(new java.awt.Color(204, 204, 204));
        lblDisk.setText("DIsco:");

        jpbDisk.setForeground(new java.awt.Color(30, 30, 47));
        jpbDisk.setStringPainted(true);

        lblMinDisk.setForeground(new java.awt.Color(204, 204, 204));
        lblMinDisk.setText("Min:");

        lblMinValueDisk.setForeground(new java.awt.Color(204, 204, 204));
        lblMinValueDisk.setText("0");

        lblMedValueDisk.setForeground(new java.awt.Color(204, 204, 204));
        lblMedValueDisk.setText("0");

        lblMedDisk.setForeground(new java.awt.Color(204, 204, 204));
        lblMedDisk.setText("Med:");

        lblMaxDisk.setForeground(new java.awt.Color(204, 204, 204));
        lblMaxDisk.setText("Max:");

        lblMaxValueDisk.setForeground(new java.awt.Color(204, 204, 204));
        lblMaxValueDisk.setText("0");

        javax.swing.GroupLayout jpnDiskLayout = new javax.swing.GroupLayout(jpnDisk);
        jpnDisk.setLayout(jpnDiskLayout);
        jpnDiskLayout.setHorizontalGroup(
            jpnDiskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnDiskLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnDiskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnDiskLayout.createSequentialGroup()
                        .addComponent(lblDisk)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jpbDisk, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                    .addGroup(jpnDiskLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblMinDisk)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMinValueDisk, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblMedDisk)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMedValueDisk, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblMaxDisk)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMaxValueDisk, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jpnDiskLayout.setVerticalGroup(
            jpnDiskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnDiskLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDisk)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpbDisk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnDiskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMinDisk)
                    .addComponent(lblMinValueDisk)
                    .addComponent(lblMedDisk)
                    .addComponent(lblMedValueDisk)
                    .addComponent(lblMaxDisk)
                    .addComponent(lblMaxValueDisk))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        btnUpdate.setBackground(new java.awt.Color(38, 41, 59));
        btnUpdate.setForeground(new java.awt.Color(204, 204, 204));
        btnUpdate.setText("Atualizar Dados");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jpnRam1.setBackground(new java.awt.Color(38, 41, 59));

        lblVirtual.setForeground(new java.awt.Color(204, 204, 204));
        lblVirtual.setText("Memória Virtual:");

        jpbVirtual.setForeground(new java.awt.Color(30, 30, 47));
        jpbVirtual.setStringPainted(true);

        lblMinVirtual.setForeground(new java.awt.Color(204, 204, 204));
        lblMinVirtual.setText("Min:");

        lblMinValueVirtual.setForeground(new java.awt.Color(204, 204, 204));
        lblMinValueVirtual.setText("0");

        lblMedValueVirtual.setForeground(new java.awt.Color(204, 204, 204));
        lblMedValueVirtual.setText("0");

        lblMedVirtual.setForeground(new java.awt.Color(204, 204, 204));
        lblMedVirtual.setText("Med:");

        lblMaxVirtual.setForeground(new java.awt.Color(204, 204, 204));
        lblMaxVirtual.setText("Max:");

        lblMaxValueVirtual.setForeground(new java.awt.Color(204, 204, 204));
        lblMaxValueVirtual.setText("0");

        lblValueVirtualExt.setForeground(new java.awt.Color(204, 204, 204));
        lblValueVirtualExt.setText("0GB");

        javax.swing.GroupLayout jpnRam1Layout = new javax.swing.GroupLayout(jpnRam1);
        jpnRam1.setLayout(jpnRam1Layout);
        jpnRam1Layout.setHorizontalGroup(
            jpnRam1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnRam1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnRam1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpbVirtual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpnRam1Layout.createSequentialGroup()
                        .addComponent(lblVirtual)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblValueVirtualExt)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jpnRam1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblMinVirtual)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMinValueVirtual, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(lblMedVirtual)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMedValueVirtual, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblMaxVirtual)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMaxValueVirtual, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jpnRam1Layout.setVerticalGroup(
            jpnRam1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnRam1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpnRam1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVirtual)
                    .addComponent(lblValueVirtualExt))
                .addGap(12, 12, 12)
                .addComponent(jpbVirtual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnRam1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMedVirtual)
                    .addComponent(lblMedValueVirtual)
                    .addComponent(lblMaxVirtual)
                    .addComponent(lblMaxValueVirtual)
                    .addComponent(lblMinVirtual)
                    .addComponent(lblMinValueVirtual))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout jpnAllLayout = new javax.swing.GroupLayout(jpnAll);
        jpnAll.setLayout(jpnAllLayout);
        jpnAllLayout.setHorizontalGroup(
            jpnAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnAllLayout.createSequentialGroup()
                .addGroup(jpnAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnAllLayout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(lblTitle))
                    .addGroup(jpnAllLayout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpnAllLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jpnAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jpnAllLayout.createSequentialGroup()
                                .addComponent(jpnDisk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jpnRam1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jpnAllLayout.createSequentialGroup()
                                .addComponent(jpnCpu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jpnRam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jpnAllLayout.setVerticalGroup(
            jpnAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnAllLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblTitle)
                .addGap(24, 24, 24)
                .addGroup(jpnAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpnRam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnCpu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jpnAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpnDisk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpnRam1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnUpdate)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnAll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnAll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        changeValueCpu();
        changeValueDisk();
        changeValueRam();
        changeValueVirtual();
        printValues();
    }//GEN-LAST:event_btnUpdateActionPerformed
    
    public void changeValueCpu() {
        cpuValue = randomNumber.nextInt(101);
        cpuValueExt = (Double.valueOf(cpuValue) * 2) / 100;
        
        cpuSumMed += cpuValue;
        cpuAmountMed++;
        cpuValueMed = Double.valueOf(cpuSumMed) / cpuAmountMed;
        
        if (cpuValueMin > cpuValue) {
            cpuValueMin = cpuValue;
        }
        
        if (cpuValueMax < cpuValue) {
            cpuValueMax = cpuValue;
        }
    }
    public void changeValueDisk(){
        diskValue = randomNumber.nextInt(101);
        
        diskSumMed += diskValue;
        diskAmountMed++;
        diskValueMed = Double.valueOf(diskSumMed) / diskAmountMed;
        
        if(diskValueMin > diskValue) {
           diskValueMin = diskValue; 
        }
    
        if(diskValueMax < diskValue) {
            diskValueMax = diskValue;
        }         
    }
    public void changeValueRam() {
       ramValue = randomNumber.nextInt(101);
       ramValueExt = (Double.valueOf(ramValue) * 8) / 100;
       
       ramSumMed += ramValue;
       ramAmountMed++;
       ramValueMed = Double.valueOf(ramSumMed) / ramAmountMed;
       
       if (ramValueMin > ramValue) {
           ramValueMin = ramValue;
       }
       
       if (ramValueMax < ramValue) {
           ramValueMax = ramValue;
       }              
    }
    public void changeValueVirtual() {
        virtualValue = randomNumber.nextInt(101);
        virtualValueExt = (Double.valueOf(virtualValue) * 4) / 100;
        
        virtualSumMed += virtualValue;
        virtualAmountMed++;
        virtualValueMed = Double.valueOf(virtualSumMed) / virtualAmountMed;
       
       if (virtualValueMin > virtualValue) {
           virtualValueMin = virtualValue;
       }
       
       if (virtualValueMax < virtualValue) {
           virtualValueMax = virtualValue;
       }              
    }
    public void printValues() {
        //Print Values CPU
        jpbCpu.setValue(cpuValue);
        lblValueCpuExt.setText(String.format("%.2fGHz",cpuValueExt));
        lblMinValueCpu.setText(String.format("%d%%", cpuValueMin));
        lblMedValueCpu.setText(String.format("%.2f%%", cpuValueMed));
        lblMaxValueCpu.setText(String.format("%d%%", cpuValueMax));
        
        //Print Values Disk
        jpbDisk.setValue(diskValue);
        lblMinValueDisk.setText(String.format("%d%%", diskValueMin));
        lblMedValueDisk.setText(String.format("%.2f%%", diskValueMed));
        lblMaxValueDisk.setText(String.format("%d%%", diskValueMax));
        
        //Print Values RAM
        jpbRam.setValue(ramValue);
       lblValueRamExt.setText(String.format("%.2fGB", ramValueExt));
       lblMinValueRam.setText(String.format("%d%%", ramValueMin));
       lblMedValueRam.setText(String.format("%.2f%%", ramValueMed));
       lblMaxValueRam.setText(String.format("%d%%", ramValueMax));
       
       //Print Values Virtual
       jpbVirtual.setValue(virtualValue);
       lblValueVirtualExt.setText(String.format("%.2fGB", virtualValueExt));
       lblMinValueVirtual.setText(String.format("%d%%", virtualValueMin));
       lblMedValueVirtual.setText(String.format("%.2f%%", virtualValueMed));
       lblMaxValueVirtual.setText(String.format("%d%%", virtualValueMax));
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
            java.util.logging.Logger.getLogger(GerenciadorDeTarefas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerenciadorDeTarefas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerenciadorDeTarefas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerenciadorDeTarefas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GerenciadorDeTarefas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUpdate;
    private javax.swing.JProgressBar jpbCpu;
    private javax.swing.JProgressBar jpbDisk;
    private javax.swing.JProgressBar jpbRam;
    private javax.swing.JProgressBar jpbVirtual;
    private javax.swing.JPanel jpnAll;
    private javax.swing.JPanel jpnCpu;
    private javax.swing.JPanel jpnDisk;
    private javax.swing.JPanel jpnRam;
    private javax.swing.JPanel jpnRam1;
    private javax.swing.JLabel lblCpu;
    private javax.swing.JLabel lblDisk;
    private javax.swing.JLabel lblMaxCpu;
    private javax.swing.JLabel lblMaxDisk;
    private javax.swing.JLabel lblMaxRam;
    private javax.swing.JLabel lblMaxValueCpu;
    private javax.swing.JLabel lblMaxValueDisk;
    private javax.swing.JLabel lblMaxValueRam;
    private javax.swing.JLabel lblMaxValueVirtual;
    private javax.swing.JLabel lblMaxVirtual;
    private javax.swing.JLabel lblMedCpu;
    private javax.swing.JLabel lblMedDisk;
    private javax.swing.JLabel lblMedRam;
    private javax.swing.JLabel lblMedValueCpu;
    private javax.swing.JLabel lblMedValueDisk;
    private javax.swing.JLabel lblMedValueRam;
    private javax.swing.JLabel lblMedValueVirtual;
    private javax.swing.JLabel lblMedVirtual;
    private javax.swing.JLabel lblMinCpu;
    private javax.swing.JLabel lblMinDisk;
    private javax.swing.JLabel lblMinRam;
    private javax.swing.JLabel lblMinValueCpu;
    private javax.swing.JLabel lblMinValueDisk;
    private javax.swing.JLabel lblMinValueRam;
    private javax.swing.JLabel lblMinValueVirtual;
    private javax.swing.JLabel lblMinVirtual;
    private javax.swing.JLabel lblRam;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblValueCpuExt;
    private javax.swing.JLabel lblValueRamExt;
    private javax.swing.JLabel lblValueVirtualExt;
    private javax.swing.JLabel lblVirtual;
    // End of variables declaration//GEN-END:variables
}
