/*
 * Copyright (C) 2020 SuperSS
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package ru.superss.rdlauncher;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author SuperSS
 */
public class RDLauncher extends javax.swing.JFrame {

    public static String username = System.getProperty("user.name");
    public static String userdir = System.getProperty("user.dir");
    public static String separator = System.getProperty("file.separator");
    public static String cfgname = "rdlauncher.properties";
    public static final Logger log = Logger.getLogger("Main");
        
    Properties cfgfile;
    
    public RDLauncher() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MAIN = new javax.swing.JPanel();
        mainpane0 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        updatespane0 = new javax.swing.JEditorPane();
        jPanel2 = new javax.swing.JPanel();
        save = new javax.swing.JButton();
        reload = new javax.swing.JButton();
        mem = new javax.swing.JLabel();
        memory = new javax.swing.JComboBox<>();
        jpath = new javax.swing.JLabel();
        javapath = new javax.swing.JTextField();
        debug = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        play = new javax.swing.JButton();
        hello = new javax.swing.JLabel();
        menu0 = new javax.swing.JMenuBar();
        menurdl = new javax.swing.JMenu();
        enablemenu = new javax.swing.JCheckBoxMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RDLauncher");
        setIconImage(new ImageIcon(getClass().getResource("/rdlresources/app-icon.png")).getImage());
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                openwindow(evt);
            }
        });

        MAIN.setToolTipText("");

        updatespane0.setEditable(false);
        jScrollPane1.setViewportView(updatespane0);

        mainpane0.addTab("Новости лаунчера", jScrollPane1);

        save.setText("Сохранить настройки");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        reload.setText("Перезагрузить конфиг");
        reload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reloadActionPerformed(evt);
            }
        });

        mem.setText("Память:");

        memory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "64M", "128M", "256M", "512M", "1024M", "2048M", "3072M", "4096M" }));

        jpath.setText("Java:");

        debug.setText("Консоль (GNU/Linux)");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(save)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(reload))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mem)
                            .addComponent(jpath))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 258, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(javapath)
                            .addComponent(memory, javax.swing.GroupLayout.Alignment.TRAILING, 0, 222, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(debug)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jpath)
                    .addComponent(javapath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mem)
                    .addComponent(memory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                .addComponent(debug)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(save)
                    .addComponent(reload))
                .addContainerGap())
        );

        memory.getAccessibleContext().setAccessibleDescription("Веделанная оперативная память.");
        javapath.getAccessibleContext().setAccessibleDescription("Путь к Java. Можно установить от 6 до 8 версии Java. Также, вместо JRE можно использовать JDK.");
        debug.getAccessibleContext().setAccessibleDescription("Выводит в консоль команду запуска игры. Если что-то выставлено не правильно или игра не запускается, то это полезно.");

        mainpane0.addTab("Настройки лаунчера и игры", jPanel2);

        play.setText("Играть в rd-132211");
        play.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playActionPerformed(evt);
            }
        });

        hello.setText("Привет, example");

        javax.swing.GroupLayout MAINLayout = new javax.swing.GroupLayout(MAIN);
        MAIN.setLayout(MAINLayout);
        MAINLayout.setHorizontalGroup(
            MAINLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainpane0)
            .addGroup(MAINLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(play, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(hello, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        MAINLayout.setVerticalGroup(
            MAINLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MAINLayout.createSequentialGroup()
                .addComponent(mainpane0, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MAINLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(play)
                    .addComponent(hello))
                .addGap(0, 14, Short.MAX_VALUE))
        );

        menurdl.setText("RDLauncher");

        enablemenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        enablemenu.setSelected(true);
        enablemenu.setText("Включить меню");
        menurdl.add(enablemenu);

        menu0.add(menurdl);

        setJMenuBar(menu0);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MAIN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MAIN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void openwindow(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_openwindow
        
        // Подгружаем конфиг в эту область
        cfgfile = new Properties();
        try {
            cfgfile.load(new FileInputStream(userdir + separator + ".rd-132211" + separator + cfgname));
        } catch(IOException ex) {
            log.log(Level.INFO, ex.toString());
        }
        
        // Пробуем загрузить вкладку новостей
        try {
            updatespane0.setPage("https://sanyasho.github.io/launcher/index.html");
        } catch(IOException ex) {
            updatespane0.setText("404. Ошибка загрузки веб-страницы. Пожалуйста, попробуйте позже, или напишите создателю лаунчера.");
            log.log(Level.INFO, "404. Ошибка загрузки веб-страницы. Пожалуйста, попробуйте позже, или напишите создателю лаунчера.");
        }
        
        // Пробуем установить имя пользователя системы
        try {
            hello.setText("Привет, " + username);
        } catch(Exception ex) {
            hello.setText(" ");
        }
        
        // Создаём дирректорию игры
        File gamedirrectory = new File(userdir + separator + ".rd-132211" + separator);
        
        if (!gamedirrectory.exists()) {
            
            log.log(Level.INFO, "Создание дирректории игры: " + gamedirrectory);
            
            boolean result = false;
            try {
                gamedirrectory.mkdir();
                result = true;
            } catch(SecurityException se) {
                log.log(Level.INFO, se.toString());
            } if(result) {
                log.log(Level.INFO, "Дирректория игры создана: " + gamedirrectory);
            }
            
        }
        
        // Создаём конфиг лаунчреа
        File config = new File(userdir + separator + ".rd-132211" + separator + cfgname);
        
        if (!config.exists()) {
            
            log.log(Level.INFO, "Создание конфига лаунчера: " + config);
            
            boolean result = false;
            
            try {
                config.createNewFile();
                result = true;
            } catch(SecurityException se) {
                log.log(Level.INFO, se.toString());
            } catch (IOException ex) {
                log.log(Level.INFO, ex.toString());
            } if(result) {
                log.log(Level.INFO, "Дирректория конфига лаунчера: " + config);
            }
            
        }
        
        // Выставляем всё куда надо
        boolean isWindows = System.getProperty("os.name").startsWith("Windows");
        if(isWindows) {
            javapath.setText(System.getProperty("java.home") + separator + "bin" + separator + "java.exe");
        } else {
            javapath.setText(System.getProperty("java.home") + separator + "bin" + separator + "java");
        }
        
        // Ставим память
        if(cfgfile.getProperty("memory").startsWith("null")) {
            memory.setSelectedItem("64M");
        } else {
            memory.setSelectedItem(cfgfile.getProperty("memory"));
        }
        
        // Унижаем макодрочеров
        boolean mac = System.getProperty("os.name").startsWith("Mac");
        if(mac) {
            JOptionPane.showMessageDialog(rootPane, "MacOS не поддерживается, прекратите есть дерьмо или используйте другой лаунчер. / MacOS is not supported, please, stop eating shit or use another launcher.", "Ошибка / Error", JOptionPane.ERROR_MESSAGE);
            log.log(Level.WARNING, "MacOS не поддерживается, прекратите есть дерьмо или используйте другой лаунчер. / MacOS is not supported, please, stop eating shit or use another launcher.");
        } 
        
        boolean osx = System.getProperty("os.name").startsWith("OS");
        if(osx) {
            JOptionPane.showMessageDialog(rootPane, "MacOS не поддерживается, прекратите есть дерьмо или используйте другой лаунчер. / MacOS is not supported, please, stop eating shit or use another launcher.", "Ошибка / Error", JOptionPane.ERROR_MESSAGE);
            log.log(Level.WARNING, "MacOS не поддерживается, прекратите есть дерьмо или используйте другой лаунчер. / MacOS is not supported, please, stop eating shit or use another launcher.");
        } 
        
        // Ставим флажок
        if(cfgfile.getProperty("debug").startsWith("true")) {
            debug.setSelected(true);
        } else {
            debug.setSelected(false);
        }
        
        // Кнопка перезагрузить
        if(cfgfile.getProperty("debug").startsWith("true")) {
            reload.setVisible(true);
        } else {
            reload.setVisible(false);
        }
        
        // Панель меню
        if(cfgfile.getProperty("menu").startsWith("true")) {
            menu0.setVisible(true);
        } else {
            menu0.setVisible(false);
        }
        
        // Консоль
        boolean consolecheck = System.getProperty("os.name").startsWith("Windows");
        if(consolecheck) {
            debug.setVisible(false);
        } else {
            debug.setVisible(true);
        }
    }//GEN-LAST:event_openwindow

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        
        // Подгружаем конфиг в эту область
        cfgfile = new Properties();
        try {
            cfgfile.load(new FileInputStream(userdir + separator + ".rd-132211" + separator + cfgname));
        } catch(IOException ex) {
            log.log(Level.INFO, ex.toString());
        }
        
        // Проверяем флажок debug
        if(debug.isSelected()) {
            System.setProperty("debug", "true");
        } else {
            System.setProperty("debug", "false");
        }
        
        // Проверяем флажок меню
        if(enablemenu.isSelected()) {
            System.setProperty("menu", "true");
        } else {
            System.setProperty("menu", "false");
        }
        
        // Записываем конфиг
        Properties cfg = new Properties();
        try {
            cfg.setProperty("java", javapath.getText());
            cfg.setProperty("memory", memory.getSelectedItem().toString());
            Object setProperty0 = cfg.setProperty("debug", System.getProperty("debug"));
            Object setProperty1 = cfg.setProperty("menu", System.getProperty("menu"));
            cfg.store(new FileOutputStream(userdir + separator + ".rd-132211" + separator + cfgname), null);
        } catch (FileNotFoundException ex) {
            log.log(Level.INFO, ex.toString());
        } catch (IOException ex) {
            log.log(Level.INFO, ex.toString());
        }
        
        // Просим перезагрузить лаунчер
        play.setEnabled(false);
        memory.setEnabled(false);
        javapath.setEnabled(false);
        reload.setEnabled(false);
        debug.setEnabled(false);
        mainpane0.setEnabled(false);
        menurdl.setEnabled(false);
        
        JOptionPane.showMessageDialog(rootPane, "Пожалуйста, перезагрузите лаунчер. / Please, reload a launcher.", "Внимание! / Warning!", JOptionPane.ERROR_MESSAGE);
        log.log(Level.INFO, "Пожалуйста, перезагрузите лаунчер. / Please, restart a launcher.", "Внимание! / Warning!");
        
    }//GEN-LAST:event_saveActionPerformed

    private void reloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reloadActionPerformed
        
        // Подгружаем конфиг в эту область
        cfgfile = new Properties();
        try {
            cfgfile.load(new FileInputStream(userdir + separator + ".rd-132211" + separator + cfgname));
        } catch(IOException ex) {
            log.log(Level.INFO, ex.toString());
        }
        
        // Определяем тип системы и выставляем или /bin/java или \bin\java.exe
        boolean javaexec = System.getProperty("os.name").startsWith("Windows");
        if(javaexec) {
            javapath.setText(System.getProperty("java.home") + separator + "bin" + separator + "java.exe");
        } else {
            javapath.setText(System.getProperty("java.home") + separator + "bin" + separator + "java");
        }
        
        // Ставим память
        if(cfgfile.getProperty("memory").startsWith("null")) {
            memory.setSelectedItem("64M");
        } else {
            memory.setSelectedItem(cfgfile.getProperty("memory"));
        }
        
        // Ставим флажок
        if(cfgfile.getProperty("debug").startsWith("true")) {
            debug.setSelected(true);
        } else {
            debug.setSelected(false);
        }
        
    }//GEN-LAST:event_reloadActionPerformed

    private void playActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playActionPerformed
        
        // Создаём дирректории
        
        // Содаём дирректорию для библиотек
        File libsdir = new File(userdir + separator + ".rd-132211" + separator + "libraries");
        if (!libsdir.exists()) {
            boolean result = false;
            try {
                libsdir.mkdir();
                result = true;
            } catch(SecurityException se) {
                log.log(Level.INFO, se.toString());
            } if(result) {}
        }
        
        // Создаём дирректирию для .so или .dll
        File natdir = new File(userdir + separator + ".rd-132211" + separator + "libraries" + separator + "natives");
        if (!natdir.exists()) {
            boolean result = false;
            try {
                natdir.mkdir();
                result = true;
            } catch(SecurityException se) {
                log.log(Level.INFO, se.toString());
            } if(result) {}
        }
        
        // Скачиваем необходимые файлы
        
        // Скачиваем launchwrapper версии 1.6
        try {
            URL launchwrapper = new URL("https://libraries.minecraft.net/net/minecraft/launchwrapper/1.6/launchwrapper-1.6.jar");
            ReadableByteChannel dwn0 = Channels.newChannel(launchwrapper.openStream());
            FileOutputStream dwn01 = new FileOutputStream(userdir + separator + ".rd-132211" + separator + "libraries" + separator + "launchwrapper-1.6.jar");
            dwn01.getChannel().transferFrom(dwn0, 0, Long.MAX_VALUE);
            dwn0.close();
            dwn01.close();
            log.log(Level.INFO, "Скачивание: launchwrapper-1.6.jar");
        } catch (MalformedURLException ex) {
            log.log(Level.INFO, ex.toString());
        } catch (FileNotFoundException ex) {
            log.log(Level.INFO, ex.toString());
        } catch (IOException ex) {
            log.log(Level.INFO, ex.toString());
        }
        
        // Скачиваем rd-132211
        try {
            URL rd = new URL("https://launcher.mojang.com/v1/objects/393e8d4b4d708587e2accd7c5221db65365e1075/client.jar");
            ReadableByteChannel dwn0 = Channels.newChannel(rd.openStream());
            FileOutputStream dwn01 = new FileOutputStream(userdir + separator + ".rd-132211" + separator + "libraries" + separator + "rd-132211.jar");
            dwn01.getChannel().transferFrom(dwn0, 0, Long.MAX_VALUE);
            dwn0.close();
            dwn01.close();
            log.log(Level.INFO, "Скачивание: rd-132211.jar");
        } catch (MalformedURLException ex) {
            log.log(Level.INFO, ex.toString());
        } catch (FileNotFoundException ex) {
            log.log(Level.INFO, ex.toString());
        } catch (IOException ex) {
            log.log(Level.INFO, ex.toString());
        }
        
        // Скачиваем ASM-all версии 5.2
        try {
            URL asm = new URL("https://repo1.maven.org/maven2/org/ow2/asm/asm-all/5.2/asm-all-5.2.jar");
            ReadableByteChannel dwn0 = Channels.newChannel(asm.openStream());
            FileOutputStream dwn01 = new FileOutputStream(userdir + separator + ".rd-132211" + separator + "libraries" + separator + "asm-all-5.2.jar");
            dwn01.getChannel().transferFrom(dwn0, 0, Long.MAX_VALUE);
            dwn0.close();
            dwn01.close();
            log.log(Level.INFO, "Скачивание: asm-all-5.2.jar");
        } catch (MalformedURLException ex) {
            log.log(Level.INFO, ex.toString());
        } catch (FileNotFoundException ex) {
            log.log(Level.INFO, ex.toString());
        } catch (IOException ex) {
            log.log(Level.INFO, ex.toString());
        }
        
        // Скачиваем JOpt-simple версии 5.0.4
        try {
            URL jopt = new URL("https://repo1.maven.org/maven2/net/sf/jopt-simple/jopt-simple/5.0.4/jopt-simple-5.0.4.jar");
            ReadableByteChannel dwn0 = Channels.newChannel(jopt.openStream());
            FileOutputStream dwn01 = new FileOutputStream(userdir + separator + ".rd-132211" + separator + "libraries" + separator + "jopt-simple-5.0.4.jar");
            dwn01.getChannel().transferFrom(dwn0, 0, Long.MAX_VALUE);
            dwn0.close();
            dwn01.close();
            log.log(Level.INFO, "Скачивание: jopt-simple-5.0.4.jar");
        } catch (MalformedURLException ex) {
            log.log(Level.INFO, ex.toString());
        } catch (FileNotFoundException ex) {
            log.log(Level.INFO, ex.toString());
        } catch (IOException ex) {
            log.log(Level.INFO, ex.toString());
        }
        
        // Скачиваем LWJGL2
        try {
            URL lwjgl = new URL("https://github.com/SanyaSho/rd-launcher/releases/download/rd-lwjgl/lwjgl.jar");
            ReadableByteChannel dwn0 = Channels.newChannel(lwjgl.openStream());
            FileOutputStream dwn01 = new FileOutputStream(userdir + separator + ".rd-132211" + separator + "libraries" + separator + "lwjgl.jar");
            dwn01.getChannel().transferFrom(dwn0, 0, Long.MAX_VALUE);
            dwn0.close();
            dwn01.close();
            log.log(Level.INFO, "Скачивание: lwjgl.jar");
        } catch (MalformedURLException ex) {
            log.log(Level.INFO, ex.toString());
        } catch (FileNotFoundException ex) {
            log.log(Level.INFO, ex.toString());
        } catch (IOException ex) {
            log.log(Level.INFO, ex.toString());
        }
        
        // Скачиваем LWJGL2 Util
        try {
            URL util = new URL("https://github.com/SanyaSho/rd-launcher/releases/download/rd-lwjgl/lwjgl_util.jar");
            ReadableByteChannel dwn0 = Channels.newChannel(util.openStream());
            FileOutputStream dwn01 = new FileOutputStream(userdir + separator + ".rd-132211" + separator + "libraries" + separator + "lwjgl_util.jar");
            dwn01.getChannel().transferFrom(dwn0, 0, Long.MAX_VALUE);
            dwn0.close();
            dwn01.close();
            log.log(Level.INFO, "Скачивание: lwjgl_util.jar");
        } catch (MalformedURLException ex) {
            log.log(Level.INFO, ex.toString());
        } catch (FileNotFoundException ex) {
            log.log(Level.INFO, ex.toString());
        } catch (IOException ex) {
            log.log(Level.INFO, ex.toString());
        }
        
        // Скачиваем JInput
        try {
            URL jinput = new URL("https://github.com/SanyaSho/rd-launcher/releases/download/rd-lwjgl/jinput.jar");
            ReadableByteChannel dwn0 = Channels.newChannel(jinput.openStream());
            FileOutputStream dwn01 = new FileOutputStream(userdir + separator + ".rd-132211" + separator + "libraries" + separator + "jinput.jar");
            dwn01.getChannel().transferFrom(dwn0, 0, Long.MAX_VALUE);
            dwn0.close();
            dwn01.close();
            log.log(Level.INFO, "Скачивание: jinput.jar");
        } catch (MalformedURLException ex) {
            log.log(Level.INFO, ex.toString());
        } catch (FileNotFoundException ex) {
            log.log(Level.INFO, ex.toString());
        } catch (IOException ex) {
            log.log(Level.INFO, ex.toString());
        }
        
        // Скачиваем .so или .dll
        
        // Определяем тип системы
        boolean system = System.getProperty("os.name").startsWith("Windows");
        
        if(system) {
            // Windows-код
            
            // LWJGL
            // Скачиваем dll для lwjgl
            try {
                URL lwjgldll = new URL("https://github.com/SanyaSho/rd-launcher/releases/download/rd-lwjgl-dll-i386-x64/lwjgl.dll");
                ReadableByteChannel dwn0 = Channels.newChannel(lwjgldll.openStream());
                FileOutputStream dwn01 = new FileOutputStream(userdir + separator + ".rd-132211" + separator + "libraries" + separator + "natives" + separator + "lwjgl.dll");
                dwn01.getChannel().transferFrom(dwn0, 0, Long.MAX_VALUE);
                dwn0.close();
                dwn01.close();
                log.log(Level.INFO, "Скачивание: lwjgl.dll");
            } catch (MalformedURLException ex) {
                log.log(Level.INFO, ex.toString());
            } catch (FileNotFoundException ex) {
                log.log(Level.INFO, ex.toString());
            } catch (IOException ex) {
                log.log(Level.INFO, ex.toString());
            }
            
            // Скачиваем dll для lwjgl64
            try {
                URL lwjgldll64 = new URL("https://github.com/SanyaSho/rd-launcher/releases/download/rd-lwjgl-dll-i386-x64/lwjgl64.dll");
                ReadableByteChannel dwn0 = Channels.newChannel(lwjgldll64.openStream());
                FileOutputStream dwn01 = new FileOutputStream(userdir + separator + ".rd-132211" + separator + "libraries" + separator + "natives" + separator + "lwjgl64.dll");
                dwn01.getChannel().transferFrom(dwn0, 0, Long.MAX_VALUE);
                dwn0.close();
                dwn01.close();
                log.log(Level.INFO, "Скачивание: lwjgl64.dll");
            } catch (MalformedURLException ex) {
                log.log(Level.INFO, ex.toString());
            } catch (FileNotFoundException ex) {
                log.log(Level.INFO, ex.toString());
            } catch (IOException ex) {
                log.log(Level.INFO, ex.toString());
            }
            
            // JINPUT
            // Скачиваем dll для jinput-dx8
            try {
                URL jinputlib = new URL("https://github.com/SanyaSho/rd-launcher/releases/download/rd-lwjgl-dll-i386-x64/jinput-dx8.dll");
                ReadableByteChannel dwn0 = Channels.newChannel(jinputlib.openStream());
                FileOutputStream dwn01 = new FileOutputStream(userdir + separator + ".rd-132211" + separator + "libraries" + separator + "natives" + separator + "jinput-dx8.dll");
                dwn01.getChannel().transferFrom(dwn0, 0, Long.MAX_VALUE);
                dwn0.close();
                dwn01.close();
                log.log(Level.INFO, "Скачивание: jinput-dx8.dll");
            } catch (MalformedURLException ex) {
                log.log(Level.INFO, ex.toString());
            } catch (FileNotFoundException ex) {
                log.log(Level.INFO, ex.toString());
            } catch (IOException ex) {
                log.log(Level.INFO, ex.toString());
            }
            
            // Скачиваем dll для jinput-dx8_64
            try {
                URL jinputlib = new URL("https://github.com/SanyaSho/rd-launcher/releases/download/rd-lwjgl-dll-i386-x64/jinput-dx8_64.dll");
                ReadableByteChannel dwn0 = Channels.newChannel(jinputlib.openStream());
                FileOutputStream dwn01 = new FileOutputStream(userdir + separator + ".rd-132211" + separator + "libraries" + separator + "natives" + separator + "jinput-dx8_64.dll");
                dwn01.getChannel().transferFrom(dwn0, 0, Long.MAX_VALUE);
                dwn0.close();
                dwn01.close();
                log.log(Level.INFO, "Скачивание: jinput-dx8_64.dll");
            } catch (MalformedURLException ex) {
                log.log(Level.INFO, ex.toString());
            } catch (FileNotFoundException ex) {
                log.log(Level.INFO, ex.toString());
            } catch (IOException ex) {
                log.log(Level.INFO, ex.toString());
            }
            
            // Скачиваем dll для jinput-raw
            try {
                URL jinputlib = new URL("https://github.com/SanyaSho/rd-launcher/releases/download/rd-lwjgl-dll-i386-x64/jinput-raw.dll");
                ReadableByteChannel dwn0 = Channels.newChannel(jinputlib.openStream());
                FileOutputStream dwn01 = new FileOutputStream(userdir + separator + ".rd-132211" + separator + "libraries" + separator + "natives" + separator + "jinput-raw.dll");
                dwn01.getChannel().transferFrom(dwn0, 0, Long.MAX_VALUE);
                dwn0.close();
                dwn01.close();
                log.log(Level.INFO, "Скачивание: jinput-raw.dll");
            } catch (MalformedURLException ex) {
                log.log(Level.INFO, ex.toString());
            } catch (FileNotFoundException ex) {
                log.log(Level.INFO, ex.toString());
            } catch (IOException ex) {
                log.log(Level.INFO, ex.toString());
            }
            
            // Скачиваем dll для jinput-raw_64
            try {
                URL jinputlib = new URL("https://github.com/SanyaSho/rd-launcher/releases/download/rd-lwjgl-dll-i386-x64/jinput-raw_64.dll");
                ReadableByteChannel dwn0 = Channels.newChannel(jinputlib.openStream());
                FileOutputStream dwn01 = new FileOutputStream(userdir + separator + ".rd-132211" + separator + "libraries" + separator + "natives" + separator + "jinput-raw_64.dll");
                dwn01.getChannel().transferFrom(dwn0, 0, Long.MAX_VALUE);
                dwn0.close();
                dwn01.close();
                log.log(Level.INFO, "Скачивание: jinput-raw_64.dll");
            } catch (MalformedURLException ex) {
                log.log(Level.INFO, ex.toString());
            } catch (FileNotFoundException ex) {
                log.log(Level.INFO, ex.toString());
            } catch (IOException ex) {
                log.log(Level.INFO, ex.toString());
            }
            
            // Скачиваем dll для jinput-wintab
            try {
                URL jinputlib = new URL("https://github.com/SanyaSho/rd-launcher/releases/download/rd-lwjgl-dll-i386-x64/jinput-wintab.dll");
                ReadableByteChannel dwn0 = Channels.newChannel(jinputlib.openStream());
                FileOutputStream dwn01 = new FileOutputStream(userdir + separator + ".rd-132211" + separator + "libraries" + separator + "natives" + separator + "jinput-wintab.dll");
                dwn01.getChannel().transferFrom(dwn0, 0, Long.MAX_VALUE);
                dwn0.close();
                dwn01.close();
                log.log(Level.INFO, "Скачивание: jinput-wintab.dll");
            } catch (MalformedURLException ex) {
                log.log(Level.INFO, ex.toString());
            } catch (FileNotFoundException ex) {
                log.log(Level.INFO, ex.toString());
            } catch (IOException ex) {
                log.log(Level.INFO, ex.toString());
            }
        } else {
            // Linux-код
            
            // Скачиваем liblwjgl.so
            try {
                URL lwjgllib = new URL("https://github.com/SanyaSho/rd-launcher/releases/download/rd-lwjgl-so-x64/liblwjgl64.so");
                ReadableByteChannel dwn0 = Channels.newChannel(lwjgllib.openStream());
                FileOutputStream dwn01 = new FileOutputStream(userdir + separator + ".rd-132211" + separator + "libraries" + separator + "natives" + separator + "liblwjgl64.so");
                dwn01.getChannel().transferFrom(dwn0, 0, Long.MAX_VALUE);
                dwn0.close();
                dwn01.close();
                log.log(Level.INFO, "Скачивание: liblwjgl.so");
            } catch (MalformedURLException ex) {
                log.log(Level.INFO, ex.toString());
            } catch (FileNotFoundException ex) {
                log.log(Level.INFO, ex.toString());
            } catch (IOException ex) {
                log.log(Level.INFO, ex.toString());
            }
            
            // Скачиваем libjinput-linux64.so
            try {
                URL jinputlib = new URL("https://github.com/SanyaSho/rd-launcher/releases/download/rd-lwjgl-so-x64/libjinput-linux64.so");
                ReadableByteChannel dwn0 = Channels.newChannel(jinputlib.openStream());
                FileOutputStream dwn01 = new FileOutputStream(userdir + separator + ".rd-132211" + separator + "libraries" + separator + "natives" + separator + "libjinput-linux64.so");
                dwn01.getChannel().transferFrom(dwn0, 0, Long.MAX_VALUE);
                dwn0.close();
                dwn01.close();
                log.log(Level.INFO, "Скачивание: lib-jinput64.so");
            } catch (MalformedURLException ex) {
                log.log(Level.INFO, ex.toString());
            } catch (FileNotFoundException ex) {
                log.log(Level.INFO, ex.toString());
            } catch (IOException ex) {
                log.log(Level.INFO, ex.toString());
            }
        }
        
        // Определяем тип системы
        boolean isWindows = System.getProperty("os.name").startsWith("Windows");
        
        // Проверяем дебаг-флажлок
        if(debug.isSelected()) {
            
            System.setProperty("debug", "true");
            
            // Проверяем тип системы и пробуем запустить игру
            if(isWindows) {
            
                String launchwin = "cmd.exe /c " + cfgfile.getProperty("java") + " -Xmx" + cfgfile.getProperty("memory") + " -Djava.library.path=" + userdir + separator + ".rd-132211" + separator + "libraries" + separator + "natives" + " -cp " + userdir + separator + ".rd-132211" + separator + "libraries" + separator + "launchwrapper-1.6.jar;" + userdir + separator + ".rd-132211" + separator + "libraries" + separator + "rd-132211.jar;" + userdir + separator + ".rd-132211" + separator + "libraries" + separator + "asm-all-5.2.jar;" + userdir + separator + ".rd-132211" + separator + "libraries" + separator + "jopt-simple-5.0.4.jar;" + userdir + separator + ".rd-132211" + separator + "libraries" + separator + "lwjgl.jar;" + userdir + separator + ".rd-132211" + separator + "libraries" + separator + "lwjgl_util.jar;" + userdir + separator + ".rd-132211" + separator + "libraries" + separator + "jinput.jar;" + " com.mojang.rubydung.RubyDung " + username + " --gameDir " + userdir + separator + ".rd-132211";
            
                Runtime rt = Runtime.getRuntime();
                try {
                    Process launch = rt.exec(launchwin);
                } catch(IOException ex) {
                    log.log(Level.INFO, ex.toString());
                }
                
                // Выводим комадну запуска (отладка)
                if(cfgfile.getProperty("debug").startsWith("true")) {
                    log.log(Level.INFO, launchwin);
                } else {
                    log.log(Level.WARNING, "Функция отладки выключена.");
                }
            
            } else {
            
                String launchlin = "xterm -hold -e " + cfgfile.getProperty("java") + " -Xmx" + cfgfile.getProperty("memory") + " -Djava.library.path=" + userdir + separator + ".rd-132211" + separator + "libraries" + separator + "natives" + " -cp " + userdir + separator + ".rd-132211" + separator + "libraries" + separator + "launchwrapper-1.6.jar:" + userdir + separator + ".rd-132211" + separator + "libraries" + separator + "rd-132211.jar:" + userdir + separator + ".rd-132211" + separator + "libraries" + separator + "asm-all-5.2.jar:" + userdir + separator + ".rd-132211" + separator + "libraries" + separator + "jopt-simple-5.0.4.jar:" + userdir + separator + ".rd-132211" + separator + "libraries" + separator + "lwjgl.jar:" + userdir + separator + ".rd-132211" + separator + "libraries" + separator + "lwjgl_util.jar:" + userdir + separator + ".rd-132211" + separator + "libraries" + separator + "jinput.jar:" + " com.mojang.rubydung.RubyDung " + username + " --gameDir " + userdir + separator + ".rd-132211";
            
                Runtime rt = Runtime.getRuntime();
                try {
                   Process launch = rt.exec(launchlin);
                } catch(IOException ex) {
                    log.log(Level.INFO, ex.toString());
                }
            
                // Выводим комадну запуска (отладка)
                if(cfgfile.getProperty("debug").startsWith("true")) {
                    log.log(Level.INFO, launchlin);
                } else {
                    log.log(Level.WARNING, "Функция отладки выключена.");
                }
            }
        } else {
            
            System.setProperty("debug", "false");
            
            // Проверяем тип системы и пробуем запустить игру
            if(isWindows) {
            
                String launchwin = cfgfile.getProperty("java") + " -Xmx" + cfgfile.getProperty("memory") + " -Djava.library.path=" + userdir + separator + ".rd-132211" + separator + "libraries" + separator + "natives" + " -cp " + userdir + separator + ".rd-132211" + separator + "libraries" + separator + "launchwrapper-1.6.jar;" + userdir + separator + ".rd-132211" + separator + "libraries" + separator + "rd-132211.jar;" + userdir + separator + ".rd-132211" + separator + "libraries" + separator + "asm-all-5.2.jar;" + userdir + separator + ".rd-132211" + separator + "libraries" + separator + "jopt-simple-5.0.4.jar;" + userdir + separator + ".rd-132211" + separator + "libraries" + separator + "lwjgl.jar;" + userdir + separator + ".rd-132211" + separator + "libraries" + separator + "lwjgl_util.jar;" + userdir + separator + ".rd-132211" + separator + "libraries" + separator + "jinput.jar;" + " com.mojang.rubydung.RubyDung " + username + " --gameDir " + userdir + separator + ".rd-132211";
            
                Runtime rt = Runtime.getRuntime();
                try {
                    Process launch = rt.exec(launchwin);
                } catch(IOException ex) {
                    log.log(Level.INFO, ex.toString());
                }
                
                // Выводим комадну запуска (отладка)
                if(cfgfile.getProperty("debug").startsWith("true")) {
                    log.log(Level.INFO, launchwin);
                } else {
                    log.log(Level.WARNING, "Функция отладки выключена.");
                }
            
            } else {
            
                String launchlin = cfgfile.getProperty("java") + " -Xmx" + cfgfile.getProperty("memory") + " -Djava.library.path=" + userdir + separator + ".rd-132211" + separator + "libraries" + separator + "natives" + " -cp " + userdir + separator + ".rd-132211" + separator + "libraries" + separator + "launchwrapper-1.6.jar:" + userdir + separator + ".rd-132211" + separator + "libraries" + separator + "rd-132211.jar:" + userdir + separator + ".rd-132211" + separator + "libraries" + separator + "asm-all-5.2.jar:" + userdir + separator + ".rd-132211" + separator + "libraries" + separator + "jopt-simple-5.0.4.jar:" + userdir + separator + ".rd-132211" + separator + "libraries" + separator + "lwjgl.jar:" + userdir + separator + ".rd-132211" + separator + "libraries" + separator + "lwjgl_util.jar:" + userdir + separator + ".rd-132211" + separator + "libraries" + separator + "jinput.jar:" + " com.mojang.rubydung.RubyDung " + username + " --gameDir " + userdir + separator + ".rd-132211";
            
                Runtime rt = Runtime.getRuntime();
                try {
                   Process launch = rt.exec(launchlin);
                } catch(IOException ex) {
                    log.log(Level.INFO, ex.toString());
                }
            
                // Выводим комадну запуска (отладка)
                if(cfgfile.getProperty("debug").startsWith("true")) {
                    log.log(Level.INFO, launchlin);
                } else {
                    log.log(Level.WARNING, "Функция отладки выключена.");
                }
            }
        }
    }//GEN-LAST:event_playActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RDLauncher().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MAIN;
    private javax.swing.JCheckBox debug;
    private javax.swing.JCheckBoxMenuItem enablemenu;
    private javax.swing.JLabel hello;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField javapath;
    private javax.swing.JLabel jpath;
    private javax.swing.JTabbedPane mainpane0;
    private javax.swing.JLabel mem;
    private javax.swing.JComboBox<String> memory;
    private javax.swing.JMenuBar menu0;
    private javax.swing.JMenu menurdl;
    private javax.swing.JButton play;
    private javax.swing.JButton reload;
    private javax.swing.JButton save;
    private javax.swing.JEditorPane updatespane0;
    // End of variables declaration//GEN-END:variables
}
