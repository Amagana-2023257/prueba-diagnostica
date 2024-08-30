package org.amagana.System;

import javax.swing.SwingUtilities;
import org.amagana.View.MainView;

public class Main {
    
    public static void main(String[] args) {
        MainView mainFrame = new MainView();
        mainFrame.setVisible(true);
        mainFrame.setLocationRelativeTo(null);
    }
}
