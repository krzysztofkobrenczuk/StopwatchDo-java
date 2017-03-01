package stoperapplication;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javafx.util.converter.LocalDateTimeStringConverter;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GuiStopwatch extends javax.swing.JFrame {
     
    private Timer t;
    private int hour = 0;
    private int min = 0;
    private int sec = 0;
    private int count = 0;

    public GuiStopwatch() {
        initComponents();
        
        //Set background color for application elements
        getContentPane().setBackground(new Color(3,42,57));
        menuBar.setBackground(new Color(107,146,161));
        //Create new object of UserActivity class.
        userActivity = new UserActivity("", "", "");
        //Create new arrayList to store objects of UserActivity
        listOfUserActivity = new ArrayList<UserActivity>();
        //Create defaultListModel to presentation list of objects.
        defListModel = new DefaultListModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        stopWatchLabel = new javax.swing.JLabel();
        startBtn = new javax.swing.JButton();
        stopBtn = new javax.swing.JButton();
        resetBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ActivityLabel = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();
        removeBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listOfActivities = new javax.swing.JList<>();
        menuBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        saveBtn = new javax.swing.JMenuItem();
        loadBtn = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("StopwatchDo");
        setBackground(new java.awt.Color(41, 121, 83));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.white);
        setMaximumSize(new java.awt.Dimension(300, 480));
        setPreferredSize(new java.awt.Dimension(300, 480));
        setResizable(false);

        MainPanel.setBackground(new java.awt.Color(3, 42, 57));

        stopWatchLabel.setFont(new java.awt.Font("Calculator", 0, 70)); // NOI18N
        stopWatchLabel.setForeground(new java.awt.Color(107, 146, 161));
        stopWatchLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stopWatchLabel.setText("0:0:0");

        startBtn.setBackground(new java.awt.Color(76, 158, 101));
        startBtn.setFont(new java.awt.Font("Calculator", 1, 18)); // NOI18N
        startBtn.setText("START");
        startBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startBtnActionPerformed(evt);
            }
        });

        stopBtn.setBackground(new java.awt.Color(76, 158, 101));
        stopBtn.setFont(new java.awt.Font("Calculator", 1, 18)); // NOI18N
        stopBtn.setText("STOP");
        stopBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopBtnActionPerformed(evt);
            }
        });

        resetBtn.setBackground(new java.awt.Color(76, 158, 101));
        resetBtn.setFont(new java.awt.Font("Calculator", 1, 18)); // NOI18N
        resetBtn.setText("RESET");
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(107, 146, 161));
        jLabel1.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(107, 146, 161));
        jLabel1.setText("What have you done at this time?");

        ActivityLabel.setBackground(new java.awt.Color(107, 146, 161));
        ActivityLabel.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N
        ActivityLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActivityLabelActionPerformed(evt);
            }
        });

        addBtn.setBackground(new java.awt.Color(76, 158, 101));
        addBtn.setFont(new java.awt.Font("Calculator", 1, 18)); // NOI18N
        addBtn.setText("ADD");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        removeBtn.setBackground(new java.awt.Color(76, 158, 101));
        removeBtn.setFont(new java.awt.Font("Calculator", 1, 18)); // NOI18N
        removeBtn.setText("REMOVE");
        removeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ActivityLabel)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(removeBtn))
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(MainPanelLayout.createSequentialGroup()
                                        .addComponent(startBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(stopBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(resetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(stopWatchLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        MainPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {addBtn, removeBtn, resetBtn, startBtn, stopBtn});

        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(stopWatchLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(startBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stopBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ActivityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(removeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        MainPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {addBtn, removeBtn, resetBtn, startBtn, stopBtn});

        listOfActivities.setBackground(new java.awt.Color(107, 146, 161));
        listOfActivities.setFont(new java.awt.Font("Constantia", 0, 12)); // NOI18N
        jScrollPane1.setViewportView(listOfActivities);

        menuBar.setBackground(new java.awt.Color(41, 121, 83));
        menuBar.setForeground(new java.awt.Color(41, 121, 83));

        jMenu1.setText("File");

        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });
        jMenu1.add(saveBtn);

        loadBtn.setText("Load");
        loadBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadBtnActionPerformed(evt);
            }
        });
        jMenu1.add(loadBtn);

        menuBar.add(jMenu1);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startBtnActionPerformed
         //Create new Swing Timer to realize a stopwatch.
        t = new Timer((1000), new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                //Every second variable 'sec' is icreemented by 1. 
                sec ++;
               
                if(sec == 60)
                {
                    sec = 0;
                    min += 1;
                }
                if(min == 60)
                {
                    min = 0;
                    hour += 1;
                }
                stopWatchLabel.setText(hour + ":" + min + ":" + sec);  
            }
        });
        t.start();
    }//GEN-LAST:event_startBtnActionPerformed

    private void stopBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopBtnActionPerformed
        if((sec | min | hour ) != 0)
        {
        t.stop();
        }
    }//GEN-LAST:event_stopBtnActionPerformed

    private void ActivityLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActivityLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ActivityLabelActionPerformed

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        //Reset button sets time variables to 0.
        sec = 0;
        min = 0;
        hour = 0;
        stopWatchLabel.setText(hour + ":" + min + ":" + sec);  
    }//GEN-LAST:event_resetBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed

        //Create new calendar to get actual date and convert it to String.
        df = new SimpleDateFormat("dd/MM");
        Date today = Calendar.getInstance().getTime();
        String reportDate = df.format(today);
        String activityDesc = ActivityLabel.getText();
        String currentWatchTime = stopWatchLabel.getText();
        
        //After click Add Button, we pass information about actual date, time from stopwatch and
        //user description to object userActivity. 
        userActivity.setDateTime(reportDate);
        userActivity.setTimeOfActivity(currentWatchTime);
        userActivity.setDescription(activityDesc);
        //Create new object with passed data.
        listOfUserActivity.add(new UserActivity(reportDate, currentWatchTime, activityDesc));

        //Add to defaultListModel newest object.
        defListModel.add(0, listOfUserActivity.get(listOfUserActivity.size() - 1).getDateTime() + " | " 
                    + listOfUserActivity.get(listOfUserActivity.size() - 1).getTimeOfActivity() + " | " 
                    + listOfUserActivity.get(listOfUserActivity.size() - 1).getDescription());

        listOfActivities.setModel(defListModel);
        ActivityLabel.setText("");
    
    }//GEN-LAST:event_addBtnActionPerformed

    private void removeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeBtnActionPerformed
        //After selected item on activity list and after click remove button,
        //our choice is removed.
        int selectedIndex = listOfActivities.getSelectedIndex();
        if (selectedIndex != -1) {
            defListModel.remove(selectedIndex);
            listOfUserActivity.remove(selectedIndex); 
        }
    }//GEN-LAST:event_removeBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        
        //Create new JFileChooser to save file with whole data.
        final JFileChooser fc = new JFileChooser();
        int response = fc.showSaveDialog(GuiStopwatch.this);
        if (response == JFileChooser.APPROVE_OPTION) {
            System.out.println(fc.getSelectedFile().toString());
            fileName = fc.getSelectedFile().toString();

            try { 
            FileOutputStream saveFile = new FileOutputStream(fileName + ".ser");
            //Create an ObjectOutputStream to put objects into save file.
            ObjectOutputStream save = new ObjectOutputStream(saveFile);

            //Now we save our object.
            save.writeObject(listOfUserActivity);
            // Close the file.
            save.close();
        } catch (Exception exc)
        {
            exc.printStackTrace();
        }
        } else {
            System.out.println("The file open operation was cancelled.");
            fileName = "The file open operation was cancelled";
        }
    }//GEN-LAST:event_saveBtnActionPerformed

    private void loadBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadBtnActionPerformed
        //Clear actual data in program.
        listOfUserActivity.clear();
        defListModel.removeAllElements();
        //Create new JFileChooser
        final JFileChooser fc = new JFileChooser();
        int response = fc.showOpenDialog(GuiStopwatch.this);
        if (response == JFileChooser.APPROVE_OPTION) {

            System.out.println(fc.getSelectedFile().toString());
            //User select a file, change this name to String.
            fileName = fc.getSelectedFile().toString();

            try {
                // Open file to read from choosen location.
                FileInputStream saveFile = new FileInputStream(fileName);

                ObjectInputStream save = new ObjectInputStream(saveFile);
                listOfUserActivity = (ArrayList) save.readObject();
                // Close the file.
                save.close(); 
            } catch (Exception exc) {
                exc.printStackTrace(); 
            }

        } else {
            System.out.println("The file open operation was cancelled.");
            fileName = "Canceled";
        }
        //Add elements from list of products to JList.
        for (UserActivity list : listOfUserActivity) {
            defListModel.add(0, list.getDateTime() + " | " 
                    + list.getTimeOfActivity() + " | " 
                    + list.getDescription());
        }
        listOfActivities.setModel(defListModel);
    }//GEN-LAST:event_loadBtnActionPerformed

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
            java.util.logging.Logger.getLogger(GuiStopwatch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiStopwatch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiStopwatch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiStopwatch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiStopwatch().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ActivityLabel;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JButton addBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listOfActivities;
    private javax.swing.JMenuItem loadBtn;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JButton removeBtn;
    private javax.swing.JButton resetBtn;
    private javax.swing.JMenuItem saveBtn;
    private javax.swing.JButton startBtn;
    private javax.swing.JButton stopBtn;
    private javax.swing.JLabel stopWatchLabel;
    // End of variables declaration//GEN-END:variables
   private UserActivity userActivity;
   private ArrayList<UserActivity> listOfUserActivity;
   DefaultListModel defListModel;
   DateFormat df;
   public String fileName;
   JFrame frame;

}
