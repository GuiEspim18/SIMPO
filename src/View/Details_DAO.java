/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;
import Model.Historic_DAO;
import Model.Sensor_DAO;
import Model.Register_DAO;
import java.util.Arrays;
import java.util.ArrayList;
import java.awt.Color;
import java.text.SimpleDateFormat;

/**
 *
 * @author guiespim
 */
public class Details_DAO extends javax.swing.JFrame {
    
    Sensor_DAO sensor;

    /**
     * Creates new form Details_DAO
     */
    public Details_DAO() {
        initComponents();
    }
    
    public Details_DAO(int id) {
        for (Sensor_DAO sensor : new Historic_DAO().historic) {
            for (Register_DAO register : sensor.register) {
                if (register.register == id) {
                    this.sensor = sensor;
                    this.sensor.register = new ArrayList<Register_DAO>(Arrays.asList(register));
                }
            }
        }
        initComponents();
        load();
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
        header = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        labelSensorName = new javax.swing.JLabel();
        labelModel = new javax.swing.JLabel();
        labelLat = new javax.swing.JLabel();
        labelLon = new javax.swing.JLabel();
        labelCountry = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        labelDate = new javax.swing.JLabel();
        labelPH = new javax.swing.JLabel();
        labelTemperature = new javax.swing.JLabel();
        labelOxygenDissolved = new javax.swing.JLabel();
        labelMicroplastic = new javax.swing.JLabel();
        labelMercury = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        pH = new javax.swing.JLabel();
        temperature = new javax.swing.JLabel();
        oxygenDissolved = new javax.swing.JLabel();
        microplastic = new javax.swing.JLabel();
        mercury = new javax.swing.JLabel();
        labelId = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        statusBody = new javax.swing.JPanel();
        statusText = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        model = new javax.swing.JLabel();
        lat = new javax.swing.JLabel();
        lon = new javax.swing.JLabel();
        country = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        header.setBackground(new java.awt.Color(46, 195, 255));

        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("SIMPO - Details");
        title.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 38, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        labelSensorName.setForeground(new java.awt.Color(51, 51, 51));
        labelSensorName.setText("Nome do sensor:");

        labelModel.setForeground(new java.awt.Color(51, 51, 51));
        labelModel.setText("Modelo:");

        labelLat.setForeground(new java.awt.Color(51, 51, 51));
        labelLat.setText("Lat:");

        labelLon.setForeground(new java.awt.Color(51, 51, 51));
        labelLon.setText("Lon:");

        labelCountry.setForeground(new java.awt.Color(51, 51, 51));
        labelCountry.setText("País:");

        jPanel2.setBackground(new java.awt.Color(46, 195, 255));

        labelDate.setForeground(new java.awt.Color(255, 255, 255));
        labelDate.setText("Data:");

        labelPH.setForeground(new java.awt.Color(255, 255, 255));
        labelPH.setText("PH:");

        labelTemperature.setForeground(new java.awt.Color(255, 255, 255));
        labelTemperature.setText("Temperatura:");

        labelOxygenDissolved.setForeground(new java.awt.Color(255, 255, 255));
        labelOxygenDissolved.setText("Oxiênio dissolvido:");

        labelMicroplastic.setForeground(new java.awt.Color(255, 255, 255));
        labelMicroplastic.setText("Microplásitco:");

        labelMercury.setForeground(new java.awt.Color(255, 255, 255));
        labelMercury.setText("Mercúrio:");

        date.setForeground(new java.awt.Color(255, 255, 255));
        date.setText("0");

        pH.setForeground(new java.awt.Color(255, 255, 255));
        pH.setText("0");

        temperature.setForeground(new java.awt.Color(255, 255, 255));
        temperature.setText("0");

        oxygenDissolved.setForeground(new java.awt.Color(255, 255, 255));
        oxygenDissolved.setText("0");

        microplastic.setForeground(new java.awt.Color(255, 255, 255));
        microplastic.setText("0");

        mercury.setForeground(new java.awt.Color(255, 255, 255));
        mercury.setText("0");

        labelId.setForeground(new java.awt.Color(255, 255, 255));
        labelId.setText("ID:");

        id.setForeground(new java.awt.Color(255, 255, 255));
        id.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelDate)
                            .addComponent(labelPH)
                            .addComponent(labelTemperature))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pH)
                            .addComponent(temperature)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(date)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelId)
                                .addGap(30, 30, 30)
                                .addComponent(id))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelOxygenDissolved)
                            .addComponent(labelMicroplastic)
                            .addComponent(labelMercury))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mercury)
                            .addComponent(microplastic)
                            .addComponent(oxygenDissolved))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDate)
                    .addComponent(date)
                    .addComponent(labelId)
                    .addComponent(id))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPH)
                    .addComponent(pH))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTemperature)
                    .addComponent(temperature))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelOxygenDissolved)
                    .addComponent(oxygenDissolved))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMicroplastic)
                    .addComponent(microplastic))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMercury)
                    .addComponent(mercury))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        statusBody.setBackground(new java.awt.Color(0, 204, 0));

        statusText.setForeground(new java.awt.Color(255, 255, 255));
        statusText.setText("BOM");

        javax.swing.GroupLayout statusBodyLayout = new javax.swing.GroupLayout(statusBody);
        statusBody.setLayout(statusBodyLayout);
        statusBodyLayout.setHorizontalGroup(
            statusBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, statusBodyLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(statusText)
                .addGap(30, 30, 30))
        );
        statusBodyLayout.setVerticalGroup(
            statusBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statusBodyLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(statusText)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        name.setForeground(new java.awt.Color(51, 51, 51));
        name.setText("0");

        model.setForeground(new java.awt.Color(51, 51, 51));
        model.setText("0");

        lat.setForeground(new java.awt.Color(51, 51, 51));
        lat.setText("0");

        lon.setForeground(new java.awt.Color(51, 51, 51));
        lon.setText("0");

        country.setForeground(new java.awt.Color(51, 51, 51));
        country.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelSensorName)
                            .addComponent(labelModel)
                            .addComponent(labelLat)
                            .addComponent(labelLon)
                            .addComponent(labelCountry))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(country)
                            .addComponent(lon)
                            .addComponent(lat)
                            .addComponent(model)
                            .addComponent(name))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(statusBody, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelSensorName)
                            .addComponent(name))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelModel)
                            .addComponent(model))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelLat)
                            .addComponent(lat))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelLon)
                            .addComponent(lon))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelCountry)
                            .addComponent(country)))
                    .addComponent(statusBody, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(425, 333));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void load() {
        this.name.setText(this.sensor.name);
        this.model.setText(this.sensor.model);
        this.lat.setText(this.sensor.lat);
        this.lon.setText(this.sensor.lon);
        this.country.setText(this.sensor.country);
        Register_DAO currRegister = this.sensor.register.get(0);
        if (currRegister.pH < 6.5 || currRegister.pH > 8.5) {
            this.statusBody.setBackground(Color.RED);
            this.statusText.setText("RUIM");
        }
        if (currRegister.mercury > 0.001) {
            this.statusBody.setBackground(Color.RED);
            this.statusText.setText("RUIM");
        }
        SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yyyy");
        this.id.setText(currRegister.register + "");
        this.date.setText(formater.format(currRegister.date));
        this.pH.setText(currRegister.pH + "");
        this.temperature.setText(currRegister.temperature + " c°");
        this.oxygenDissolved.setText(currRegister.dissolvedOxygen + " mg/L");
        this.microplastic.setText(currRegister.microplastic + " mg/L");
        this.mercury.setText(String.format("%.4f", currRegister.mercury).replace(",", ".") + " mg/L (1 µg/L)");
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
            java.util.logging.Logger.getLogger(Details_DAO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Details_DAO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Details_DAO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Details_DAO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Details_DAO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel country;
    private javax.swing.JLabel date;
    private javax.swing.JPanel header;
    private javax.swing.JLabel id;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelCountry;
    private javax.swing.JLabel labelDate;
    private javax.swing.JLabel labelId;
    private javax.swing.JLabel labelLat;
    private javax.swing.JLabel labelLon;
    private javax.swing.JLabel labelMercury;
    private javax.swing.JLabel labelMicroplastic;
    private javax.swing.JLabel labelModel;
    private javax.swing.JLabel labelOxygenDissolved;
    private javax.swing.JLabel labelPH;
    private javax.swing.JLabel labelSensorName;
    private javax.swing.JLabel labelTemperature;
    private javax.swing.JLabel lat;
    private javax.swing.JLabel lon;
    private javax.swing.JLabel mercury;
    private javax.swing.JLabel microplastic;
    private javax.swing.JLabel model;
    private javax.swing.JLabel name;
    private javax.swing.JLabel oxygenDissolved;
    private javax.swing.JLabel pH;
    private javax.swing.JPanel statusBody;
    private javax.swing.JLabel statusText;
    private javax.swing.JLabel temperature;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
