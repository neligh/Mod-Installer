package modinstaller;

import modinstaller.gui.Gui;
import modinstaller.listener.Listener;

import javax.swing.*;

public class ModInstaller {
    public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        new Gui();
        new Listener();
    }
}
