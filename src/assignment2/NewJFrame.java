package assignment2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.SwingWorker;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import static org.hibernate.engine.transaction.spi.LocalStatus.ACTIVE;

/**
 *
 * @Gorana Matuh
 */
public class NewJFrame extends javax.swing.JFrame {

    SwingWorker sw;
    boolean start;
    Person person = null;
    List<Person> person_list = new ArrayList<>();
    List<String> osobe = null;
    List myList = new ArrayList();
    Session session = HibernateUtil.createSessionFactory().openSession();
    Transaction tx = null;
    Transaction tx1 = null;
    String hql;
    List<String> list = new ArrayList<>();
    Integer broj;

    public NewJFrame() {
        initComponents();
        popuni();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sve = new javax.swing.JCheckBox();
        prikaz = new javax.swing.JCheckBox();
        unos = new javax.swing.JCheckBox();
        update = new javax.swing.JCheckBox();
        obrisi = new javax.swing.JCheckBox();
        jl = new javax.swing.JLabel();
        jtf = new javax.swing.JTextField();
        jtf1 = new javax.swing.JTextField();
        jtf2 = new javax.swing.JTextField();
        jtf3 = new javax.swing.JTextField();
        jl1 = new javax.swing.JLabel();
        jl2 = new javax.swing.JLabel();
        jl3 = new javax.swing.JLabel();
        jl4 = new javax.swing.JLabel();
        jtf4 = new javax.swing.JTextField();
        jl5 = new javax.swing.JLabel();
        comboUpdate = new javax.swing.JComboBox<>();
        comboObrisi = new javax.swing.JComboBox<>();
        jtf5 = new javax.swing.JTextField();
        jtf6 = new javax.swing.JTextField();
        jtf7 = new javax.swing.JTextField();
        jtf8 = new javax.swing.JTextField();
        jl6 = new javax.swing.JLabel();
        jl7 = new javax.swing.JLabel();
        jl8 = new javax.swing.JLabel();
        jl9 = new javax.swing.JLabel();
        btnOk = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        restart = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sve.setText("Prikaži sve");
        sve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sveActionPerformed(evt);
            }
        });

        prikaz.setText("Prikaz");
        prikaz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prikazActionPerformed(evt);
            }
        });

        unos.setText("Unos");
        unos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unosActionPerformed(evt);
            }
        });

        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        obrisi.setText("Obriši");
        obrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                obrisiActionPerformed(evt);
            }
        });

        jl.setText("Odaberi opciju!");

        jl1.setText("Ime:");

        jl2.setText("Godine:");

        jl3.setText("Adresa:");

        jl4.setText("Plata:");

        jl5.setText("Ime:");

        comboUpdate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));

        comboObrisi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));

        jl6.setText("Ime:");

        jl7.setText("Godine:");

        jl8.setText("Adresa:");

        jl9.setText("Plata:");

        btnOk.setText("OK!");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        restart.setText("Restart");
        restart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sve)
                        .addGap(158, 158, 158)
                        .addComponent(jl, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(prikaz)
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jl5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 484, Short.MAX_VALUE))
                                    .addComponent(jtf4)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(unos)
                                    .addComponent(obrisi)
                                    .addComponent(update))
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(comboObrisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jtf, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(comboUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jl6)
                                                    .addComponent(jtf5)))))
                                    .addComponent(jl1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jl2)
                                                .addComponent(jtf1, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                                                .addComponent(jtf6))
                                            .addComponent(jl7))
                                        .addGap(26, 26, 26)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jtf2, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                                                .addComponent(jl3)
                                                .addComponent(jtf7))
                                            .addComponent(jl8))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jl9)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jl4)
                                                .addComponent(jtf3, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                                                .addComponent(jtf8))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(63, 63, 63)
                                        .addComponent(restart)))))
                        .addGap(16, 16, 16))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jl, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(sve)
                        .addGap(23, 23, 23)
                        .addComponent(jl5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtf4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prikaz))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl2)
                            .addComponent(jl3)
                            .addComponent(jl4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jl1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtf, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(unos))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl6)
                    .addComponent(jl7)
                    .addComponent(jl8)
                    .addComponent(jl9))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(update)
                    .addComponent(comboUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(obrisi)
                    .addComponent(comboObrisi, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOk)
                    .addComponent(btnClose)
                    .addComponent(restart))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Components() {

        unos = new javax.swing.JCheckBox();
        prikaz = new javax.swing.JCheckBox();
        update = new javax.swing.JCheckBox();
        obrisi = new javax.swing.JCheckBox();
        sve = new javax.swing.JCheckBox();
        jtf = new javax.swing.JTextField();
        jtf1 = new javax.swing.JTextField();
        jtf2 = new javax.swing.JTextField();
        jtf3 = new javax.swing.JTextField();
        jtf4 = new javax.swing.JTextField();
        jtf5 = new javax.swing.JTextField();
        jtf6 = new javax.swing.JTextField();
        jtf7 = new javax.swing.JTextField();
        jtf8 = new javax.swing.JTextField();
        comboUpdate = new javax.swing.JComboBox();
        comboObrisi = new javax.swing.JComboBox();
        btnOk = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        restart = new javax.swing.JButton();
    }

    private void popuni(){
    String hql = "select persons.name from Person persons";
        Query query = session.createQuery(hql);
        try {
            tx = session.beginTransaction();
            osobe = query.list();
            tx.commit();
        } catch (HibernateException e) {

            if (tx != null) {
                tx.rollback();
            }
            System.out.println(e);
        } finally {
            HibernateUtil.close();
        }

        for (String persons : osobe) {
            comboObrisi.addItem(persons);
            comboUpdate.addItem(persons);
        }
    }
    private void resetuj() {
        unos.setSelected(false);
        prikaz.setSelected(false);
        update.setSelected(false);
        obrisi.setSelected(false);
        sve.setSelected(false);
        jtf.setText(null);
        jtf1.setText(null);
        jtf2.setText(null);
        jtf3.setText(null);
        jtf4.setText(null);
        jtf5.setText(null);
        jtf6.setText(null);
        jtf7.setText(null);
        jtf8.setText(null);
        comboUpdate.setSelectedIndex(0);
        comboUpdate.setEnabled(true);
        comboObrisi.setSelectedIndex(0);
        comboObrisi.setEnabled(true);
        sve.setEnabled(true);
        prikaz.setEnabled(true);
        unos.setEnabled(true);
        update.setEnabled(true);
        obrisi.setEnabled(true);
        jl.setEnabled(true);
        jtf.setEnabled(true);
        jtf1.setEnabled(true);
        jtf2.setEnabled(true);
        jtf3.setEnabled(true);
        jl1.setEnabled(true);
        jl2.setEnabled(true);
        jl3.setEnabled(true);
        jl4.setEnabled(true);
        jtf4.setEnabled(true);
        jl5.setEnabled(true);
        jtf5.setEnabled(true);
        jtf6.setEnabled(true);
        jtf7.setEnabled(true);
        jtf8.setEnabled(true);
    }
    private void sveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sveActionPerformed
        unos.setEnabled(false);
        jtf.setEnabled(false);
        jtf1.setEnabled(false);
        jtf2.setEnabled(false);
        jtf3.setEnabled(false);
        prikaz.setEnabled(false);
        jtf4.setEnabled(false);
        update.setEnabled(false);
        comboUpdate.setEnabled(false);
        comboObrisi.setEnabled(false);
        jtf5.setEnabled(false);
        jtf6.setEnabled(false);
        jtf7.setEnabled(false);
        jtf8.setEnabled(false);
        obrisi.setEnabled(false);
    }//GEN-LAST:event_sveActionPerformed

    private void prikazActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prikazActionPerformed
        unos.setEnabled(false);
        jtf.setEnabled(false);
        jtf1.setEnabled(false);
        jtf2.setEnabled(false);
        jtf3.setEnabled(false);
        sve.setEnabled(false);
        update.setEnabled(false);
        comboUpdate.setEnabled(false);
        comboObrisi.setEnabled(false);
        jtf5.setEnabled(false);
        jtf6.setEnabled(false);
        jtf7.setEnabled(false);
        jtf8.setEnabled(false);
        obrisi.setEnabled(false);
    }//GEN-LAST:event_prikazActionPerformed

    private void unosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unosActionPerformed
        sve.setEnabled(false);
        prikaz.setEnabled(false);
        jtf4.setEnabled(false);
        update.setEnabled(false);
        comboUpdate.setEnabled(false);
        comboObrisi.setEnabled(false);
        jtf5.setEnabled(false);
        jtf6.setEnabled(false);
        jtf7.setEnabled(false);
        jtf8.setEnabled(false);
        obrisi.setEnabled(false);
    }//GEN-LAST:event_unosActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        sve.setEnabled(false);
        unos.setEnabled(false);
        jtf.setEnabled(false);
        jtf1.setEnabled(false);
        jtf2.setEnabled(false);
        jtf3.setEnabled(false);
        prikaz.setEnabled(false);
        jtf4.setEnabled(false);
        comboObrisi.setEnabled(false);
        obrisi.setEnabled(false);

    }//GEN-LAST:event_updateActionPerformed

    private void obrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_obrisiActionPerformed
        sve.setEnabled(false);
        unos.setEnabled(false);
        jtf.setEnabled(false);
        jtf1.setEnabled(false);
        jtf2.setEnabled(false);
        jtf3.setEnabled(false);
        prikaz.setEnabled(false);
        jtf4.setEnabled(false);
        update.setEnabled(false);
        comboUpdate.setEnabled(false);
        jtf5.setEnabled(false);
        jtf6.setEnabled(false);
        jtf7.setEnabled(false);
        jtf8.setEnabled(false);

    }//GEN-LAST:event_obrisiActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        JFrame pomocni = new JFrame();
        JTextArea jra = new JTextArea();
        pomocni.setSize(600, 200);
        if (sve.isSelected()) {

            start = true;
            sw = new SwingWorker() {
                @Override
                protected Object doInBackground() throws Exception {
                    String hql = "from Person persons";
                    Query query = session.createQuery(hql);

                    pomocni.setVisible(true);

                    try {
                        tx = session.beginTransaction();
                        person_list = query.list();
                        tx.commit();
                    } catch (HibernateException e) {

                        if (tx != null) {
                            tx.rollback();
                        }
                        System.out.println(e);
                    } finally {
                        HibernateUtil.close();
                    }
                    for (Person persone : person_list) {

                    }
                    jra.setText(person_list.toString());

                    return null;
                }

                @Override
                protected void done() {
                    pomocni.add(jra);
                    pomocni.setSize(500, 200);
                    pomocni.setVisible(true);
                    start = false;
                }
            };
            sw.execute();

        } else if (prikaz.isSelected()) {
            start = true;

            sw = new SwingWorker() {
                @Override
                protected Object doInBackground() throws Exception {
                    String hql = "from Person persons where persons.name ='" + jtf4.getText() + "'";
                    Query query = session.createQuery(hql);

                    try {
                        tx = session.beginTransaction();
                        person_list = query.list();
                        tx.commit();
                    } catch (HibernateException e) {

                        if (tx != null) {
                            tx.rollback();
                        }
                        System.out.println(e);
                    } finally {
                        HibernateUtil.close();
                    }
                    return null;
                }

                @Override
                protected void done() {
                    for (Person personi : person_list) {
                        jra.setText("ID: " + personi.getID() + "\n" + "Ime: " + personi.getName() + "\n" + "Godine: " + personi.getAge() + "\n" + "Adresa: " + personi.getAddress() + "\n" + "Plata: " + personi.getSalary());
                        pomocni.add(jra);
                        pomocni.setSize(400, 200);
                        pomocni.setVisible(true);
                    }
                    start = false;
                }
            };
            sw.execute();

        } else if (unos.isSelected()) {
            start = true;
            sw = new SwingWorker() {
                @Override
                protected Object doInBackground() throws Exception {
                    try {
                        tx = session.beginTransaction();
                        person = new Person();
                        person.setName(jtf.getText());
                        person.setAge(Integer.parseInt(jtf1.getText()));
                        person.setAddress(jtf2.getText());
                        person.setSalary(Integer.parseInt(jtf3.getText()));

                        Integer personID = (Integer) session.save(person);
                        tx.commit();
                    } catch (HibernateException e) {

                        if (tx != null) {
                            tx.rollback();
                        }
                        System.out.println(e);
                    } finally {
                        HibernateUtil.close();
                    }
                    return null;
                }

                @Override
                protected void done() {
                    jra.setText("Osoba: " + person.getName() + " je unesena!!");
                    pomocni.add(jra);
                    pomocni.setSize(400, 200);
                    pomocni.setVisible(true);
                    start = false;
                }
            };
            sw.execute();

        } else if (update.isSelected()) {
            start = true;
            sw = new SwingWorker() {
                @Override
                protected Object doInBackground() throws Exception {
                    String izabranoIme = new String();
                    comboUpdate.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent evt) {
                            ((JComboBox) evt.getSource()).getSelectedItem();
                        }
                    });
                    izabranoIme = (comboUpdate.getSelectedItem()).toString();

                    String hql = "from Person persons where persons.name ='" + izabranoIme + "'";
                    Query query = session.createQuery(hql);
                    tx = session.beginTransaction();
                    try {
                        person_list = query.list();

                        for (Person osoba : person_list) {
                            broj = osoba.getID();
                        }

                    } catch (HibernateException e) {
                        if (tx != null) {
                            tx.rollback();
                        }
                        System.out.println(e);
                    } finally {
                        session.close();
                    }
                    Session sessionTwo = HibernateUtil.createSessionFactory().openSession();
                    tx1 = sessionTwo.beginTransaction();

                    Person person = (Person) sessionTwo.load(Person.class, broj);
                    if (!jtf5.getText().equals("")) {
                        person.setName(jtf5.getText());
                    }
                    if (!jtf6.getText().equals("")) {
                        person.setAge(Integer.parseInt(jtf6.getText()));
                    }
                    if (!jtf7.getText().equals("")) {
                        person.setAddress(jtf7.getText());
                    }
                    if (!jtf8.getText().equals("")) {
                        person.setSalary(Integer.parseInt(jtf8.getText()));
                    }

                    sessionTwo.update(person);
                    if (tx1.getLocalStatus().equals(ACTIVE)) {
                        tx1.commit();

                    }
                    sessionTwo.close();

                    jra.setText("Podaci su izmjenjeni!!" + "\n" + "Novi podaci su: " + "\n" + person.toString() + "\n" + "\n" + "Stari podaci izmjenjene osobe su: " + "\n" + person_list.toString());
                    pomocni.add(jra);
                    pomocni.setSize(600, 200);
                    pomocni.setVisible(true);
                    return null;
                }

                @Override
                protected void done() {
                    comboUpdate.setSelectedIndex(0);
                    start = false;
                }
            };
            sw.execute();

        } else if (obrisi.isSelected()) {
            start = true;
            sw = new SwingWorker() {
                @Override
                protected Object doInBackground() throws Exception {
                    String brisanjeIme = new String();
                    comboObrisi.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent evt) {
                            ((JComboBox) evt.getSource()).getSelectedItem();
                        }
                    });
                    brisanjeIme = (comboObrisi.getSelectedItem()).toString();

                    String hql = "delete from Person persons where persons.name ='" + brisanjeIme + "'";
                    Query query = session.createQuery(hql);
                    try {
                        tx = session.beginTransaction();
                        query.executeUpdate();
                        tx.commit();
                    } catch (HibernateException e) {

                        if (tx != null) {
                            tx.rollback();
                        }
                        System.out.println(e);
                    } finally {
                        HibernateUtil.close();
                    }

                    return null;
                }

                @Override
                protected void done() {
                    JOptionPane.showMessageDialog(null, "Osoba uspješno obrisana!!");
                    comboObrisi.setSelectedIndex(0);
                    start = false;
                }
            };
            sw.execute();

        }
    }//GEN-LAST:event_btnOkActionPerformed

    private void restartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restartActionPerformed
        sw.cancel(false);
        session = HibernateUtil.createSessionFactory().openSession();
        resetuj();
    }//GEN-LAST:event_restartActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnOk;
    private javax.swing.JComboBox<String> comboObrisi;
    private javax.swing.JComboBox<String> comboUpdate;
    private javax.swing.JLabel jl;
    private javax.swing.JLabel jl1;
    private javax.swing.JLabel jl2;
    private javax.swing.JLabel jl3;
    private javax.swing.JLabel jl4;
    private javax.swing.JLabel jl5;
    private javax.swing.JLabel jl6;
    private javax.swing.JLabel jl7;
    private javax.swing.JLabel jl8;
    private javax.swing.JLabel jl9;
    private javax.swing.JTextField jtf;
    private javax.swing.JTextField jtf1;
    private javax.swing.JTextField jtf2;
    private javax.swing.JTextField jtf3;
    private javax.swing.JTextField jtf4;
    private javax.swing.JTextField jtf5;
    private javax.swing.JTextField jtf6;
    private javax.swing.JTextField jtf7;
    private javax.swing.JTextField jtf8;
    private javax.swing.JCheckBox obrisi;
    private javax.swing.JCheckBox prikaz;
    private javax.swing.JButton restart;
    private javax.swing.JCheckBox sve;
    private javax.swing.JCheckBox unos;
    private javax.swing.JCheckBox update;
    // End of variables declaration//GEN-END:variables
}
