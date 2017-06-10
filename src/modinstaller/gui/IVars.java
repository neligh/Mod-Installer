package modinstaller.gui;

import javax.swing.*;
import java.nio.file.Paths;

public interface IVars {
    JPanel contentPane = new JPanel();
    public default JPanel getContentPanel() {
        return contentPane;
    }

    JPanel panelTabs = new JPanel();
    public default JPanel getPanelTabs() {
        return panelTabs;
    }

    JPanel panelSettingsTab = new JPanel();
    public default JPanel getPanelSettingsTab() {
        return panelSettingsTab;
    }

    JPanel panel1710Tab = new JPanel();
    public default JPanel getPanel1710Tab() {
        return panel1710Tab;
    }

    JPanel panel189Tab = new JPanel();
    public default JPanel getPanel189Tab() {
        return panel189Tab;
    }

    JPanel panelInstallersTab = new JPanel();
    public default JPanel getPanelInstallersTab() {
        return panelInstallersTab;
    }

    JLabel labelSettings = new JLabel("Settings");
    public default JLabel getLabelSettings() {
        return labelSettings;
    }

    JLabel label1710Mods = new JLabel("1.7.10 Mods");
    public default JLabel getLabel1710Mods() {
        return label1710Mods;
    }

    JLabel label189Mods = new JLabel("1.8.9 Mods");
    public default JLabel getLabel189Mods() {
        return label189Mods;
    }

    JPanel panelSettingsPanel = new JPanel();
    public default JPanel getPanelSettingsPanel() {
        return panelSettingsPanel;
    }

    JPanel panel1710Panel = new JPanel();
    public default JPanel getPanel1710Panel() {
        return panel1710Panel;
    }

    JPanel panel189Panel = new JPanel();
    public default JPanel getPanel189Panel() {
        return panel189Panel;
    }


    // 1.7.10 panel


    JButton button1710Optifine = new JButton("Optifine");
    public default JButton getButton1710Optifine() {
        return button1710Optifine;
    }

    JButton button1710BspkrsCore = new JButton("Bspkrs Core");
    public default JButton getButton1710BspkrsCore() {
        return button1710BspkrsCore;
    }

    JButton button1710TimeChanger = new JButton("Time Changer");
    public default JButton getButton1710TimeChanger() {
        return button1710TimeChanger;
    }

    JButton button1710WayPoints = new JButton("Way Points");
    public default JButton getButton1710WayPoints() {
        return button1710WayPoints;
    }

    JButton button1710ToggleSneak = new JButton("Toggle Sneak");
    public default JButton getButton1710ToggleSneak() {
        return button1710ToggleSneak;
    }

    JButton button1710BattysCoords = new JButton("Batty's Coords");
    public default JButton getButton1710BattysCoords() {
        return button1710BattysCoords;
    }

    JButton button1710ShinyPots = new JButton("Shiny Pots");
    public default JButton getButton1710ShinyPots() {
        return button1710ShinyPots;
    }

    JButton button1710FastChat = new JButton("Fast Chat");
    public default JButton getButton1710FastChat() {
        return button1710FastChat;
    }

    JButton button1710ArmorStatus = new JButton("Armor Status");
    public default JButton getButton1710ArmorStatus() {
        return button1710ArmorStatus;
    }

    JButton button1710PlayerApi = new JButton("Player Api");
    public default JButton getButton1710PlayerApi() {
        return button1710PlayerApi;
    }

    JButton button1710ReisMinimap = new JButton("Reis Minimap");
    public default JButton getButton1710ReisMinimap() {
        return button1710ReisMinimap;
    }

    JButton button1710MotionBlur = new JButton("Motion Blur");
    public default JButton getButton1710MotionBlur() {
        return button1710MotionBlur;
    }

    JButton button1710StatusEffect = new JButton("Status Effect");
    public default JButton getButton1710StatusEffect() {
        return button1710StatusEffect;
    }

    JButton button1710CpsMod = new JButton("Cps Mod");
    public default JButton getButton1710CpsMod() {
        return button1710CpsMod;
    }

    JButton button1710PackOrganizer = new JButton("Pack Organizer");
    public default JButton getButton1710PackOrganizer() {
        return button1710PackOrganizer;
    }

    JButton button1710ParticlesMod = new JButton("Particles Mod");
    public default JButton getButton1710ParticlesMod() {
        return button1710ParticlesMod;
    }

    JButton button1710DirectionHud = new JButton("Direction Hud");
    public default JButton getButton1710DirectionHud() {
        return button1710DirectionHud;
    }

    JButton button1710TabbyChat = new JButton("Tabby Chat");
    public default JButton getButton1710TabbyChat() {
        return button1710TabbyChat;
    }

    JButton button1710KeyStrokes = new JButton("KeyStrokes");
    public default JButton getButton1710KeyStrokes() {
        return button1710KeyStrokes;
    }

    JButton button1710TcpNoDelay = new JButton("TcpNoDelay");
    public default JButton getButton1710TcpNoDelay() {
        return button1710TcpNoDelay;
    }


    //1.8.9 Panel



    JButton button189Optifine = new JButton("Optifine");
    public default JButton getButton189Optifine() {
        return button189Optifine;
    }

    JButton button189ToggleSneak = new JButton("Toggle Sneak");
    public default JButton getButton189ToggleSneak() {
        return button189ToggleSneak;
    }

    JButton button189ArmorStatus = new JButton("Armor Status");
    public default JButton getButton189ArmorStatus() {
        return button189ArmorStatus;
    }

    JButton button189StatusEffect = new JButton("Status Effect");
    public default JButton getButton189StatusEffect() {
        return button189StatusEffect;
    }

    JButton button189BspkrsCore = new JButton("Bspkrs Core");
    public default JButton getButton189BspkrsCore() {
        return button189BspkrsCore;
    }

    JButton button189XaerosMinimap = new JButton("Xaero's Minimap");
    public default JButton getButton189XaerosMinimap() {
        return button189XaerosMinimap;
    }

    JButton button189TimeChanger = new JButton("Time Changer");
    public default JButton getButton189TimeChanger() {
        return button189TimeChanger;
    }

    JButton button189CpsMod = new JButton("Cps Mod");
    public default JButton getButton189CpsMod() {
        return button189CpsMod;
    }

    JButton button189PlayerApi = new JButton("Player Api");
    public default JButton getButton189PlayerApi() {
        return button189PlayerApi;
    }

    JButton button189BattysCoords = new JButton("Batty's Coords");
    public default JButton getButton189BattysCoords() {
        return button189BattysCoords;
    }

    JButton button189ParticlesMod = new JButton("Particles Mod");
    public default JButton getButton189ParticlesMod() {
        return button189ParticlesMod;
    }

    JButton button189FastChat = new JButton("Fast Chat");
    public default JButton getButton189FastChat() {
        return button189FastChat;
    }

    JButton button189WayPoints = new JButton("Way Points");
    public default JButton getButton189WayPoints() {
        return button189WayPoints;
    }

    JButton button189KeyStrokes = new JButton("KeyStrokes");
    public default JButton getButton189KeyStrokes() {
        return button189KeyStrokes;
    }

    JButton button189PackOrganizer = new JButton("Pack Organizer");
    public default JButton getButton189PackOrganizer() {
        return button189PackOrganizer;
    }

    JButton button1895zigMod = new JButton("5zig Mod");
    public default JButton getButton1895zigMod() {
        return button1895zigMod;
    }

    JButton button189OldAnimations = new JButton("Old Animations");
    public default JButton getButton189OldAnimations() {
        return button189OldAnimations;
    }

    JButton button189MouseDelayFix = new JButton("Mouse Delay Fix");
    public default JButton getButton189MouseDelayFix() {
        return button189MouseDelayFix;
    }

    JButton button189BetterPvP = new JButton("Better PvP Mod");
    public default JButton getButton189BetterPvP() {
        return button189BetterPvP;
    }

    JButton button189LabyMod = new JButton("Laby Mod");
    public default JButton getButton189LabyMod() {
        return button189LabyMod;
    }


    //Settings panel


    JButton button189OptifineInstaller = new JButton("OptiFine-1.8.9");
    public default JButton getButton189OptifineInstaller() {
        return button189OptifineInstaller;
    }

    JButton button1710OptifineInstaller = new JButton("OptiFine-1.7.10");
    public default JButton getButton1710OptifineInstaller() {
        return button1710OptifineInstaller;
    }

    JButton button1710ForgeInstaller = new JButton("Forge-1.7.10");
    public default JButton getButton1710ForgeInstaller() {
        return button1710ForgeInstaller;
    }

    JButton button189ForgeInstaller = new JButton("Forge-1.8.9");
    public default JButton getButton189ForgeInstaller() {
        return button189ForgeInstaller;
    }

    JButton button1710LiteInstaller = new JButton("Lite-1.7.10");
    public default JButton getButton1710LiteInstaller() {
        return button1710LiteInstaller;
    }

    JButton button189LiteInstaller = new JButton("Lite-1.8.9");
    public default JButton getButton189LiteInstaller() {
        return button189LiteInstaller;
    }

    JLabel labelInstallers = new JLabel("Installers:");
    public default JLabel getLabelInstallers() {
        return labelInstallers;
    }

    JLabel labelMinecraftDirectory = new JLabel("Minecraft Directory: ");
    public default JLabel getLabelMinecraftDirectory() {
        return labelMinecraftDirectory;
    }

    JLabel labelOperatingSystem = new JLabel("Operating System:");
    public default JLabel getLabelOperatingSystem() {
        return labelOperatingSystem;
    }

    JTextField fieldMinecraftDirectory = new JTextField(String.valueOf(Paths.get(System.getenv("APPDATA") + "\\.minecraft").toAbsolutePath()));
    public default JTextField getFieldMinecraftDirectory() {
        return fieldMinecraftDirectory;
    }

    JTextField fieldOperatingSystem = new JTextField(System.getProperty("os.name"));
    public default JTextField getFieldOperatingSystem() {
        return fieldOperatingSystem;
    }

    JLabel labelDevelopedByErase = new JLabel("Developed by EraseUrFace");
    public default JLabel getLabelDevelopedByErase() {
        return labelDevelopedByErase;
    }
}
