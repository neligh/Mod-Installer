package modinstaller.listener;

import modinstaller.gui.IVars;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Listener implements IVars {
    private InputStream inputStream;
    private String name;
    private File dirWindows1710 = new File(System.getenv("APPDATA") + "\\.minecraft\\mods\\1.7.10");
    private File dirWindows189 = new File(System.getenv("APPDATA") + "\\.minecraft\\mods\\1.8.9");
    File dirMac = new File("/Library/Application Support/minecraft/mods");
    File dirLinux = new File("~/Library/Application Support/minecraft/mods");
    private File runner;

    private void copyFiles(InputStream inputStream , Path dirWindows1710) {
        try {
            Files.copy(inputStream, dirWindows1710);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void runFiles(File runner) {
        try {
            Desktop.getDesktop().open(runner);
            runner.deleteOnExit();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void checkMissing() {
        if (!dirWindows1710.getParentFile().exists()) {
            dirWindows1710.getParentFile().mkdir();
        }
        if (!dirWindows1710.exists()) {
            dirWindows1710.mkdir();
        }
        if (!dirWindows189.getParentFile().exists()) {
            dirWindows189.getParentFile().mkdir();
        }
        if (!dirWindows189.exists()) {
            dirWindows189.mkdir();
        }
    }




    public Listener()  {
        System.out.println(System.getenv("APPDATA") + "\\Roaming\\.minecraft\\mods");
        getPanelSettingsTab().addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent arg0) {
                {
                    getPanelSettingsPanel().setVisible(true);
                    getPanel1710Panel().setVisible(false);
                    getPanel189Panel().setVisible(false);
                }
                {
                    getPanelSettingsTab().setBackground(new Color(240, 240, 240));
                    getPanel1710Tab().setBackground(new Color(210, 210, 210));
                    getPanel189Tab().setBackground(new Color(210, 210, 210));
                }
                {
                    getPanelSettingsTab().setSize(150, 50);
                    getPanel1710Tab().setSize(150, 49);
                    getPanel189Tab().setSize(150, 49);
                }
            }
        });
        getPanel1710Tab().addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                {
                    getPanelSettingsPanel().setVisible(false);
                    getPanel1710Panel().setVisible(true);
                    getPanel189Panel().setVisible(false);
                }
                {
                    getPanelSettingsTab().setBackground(new Color(210, 210, 210));
                    getPanel1710Tab().setBackground(new Color(240, 240, 240));
                    getPanel189Tab().setBackground(new Color(210, 210, 210));
                }
                {
                    getPanelSettingsTab().setSize(150, 49);
                    getPanel1710Tab().setSize(150, 50);
                    getPanel189Tab().setSize(150, 49);
                }
            }
        });
        getPanel189Tab().addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                {
                    getPanelSettingsPanel().setVisible(false);
                    getPanel1710Panel().setVisible(false);
                    getPanel189Panel().setVisible(true);
                }
                {
                    getPanelSettingsTab().setBackground(new Color(210, 210, 210));
                    getPanel1710Tab().setBackground(new Color(210, 210, 210));
                    getPanel189Tab().setBackground(new Color(240, 240, 240));
                }
                {
                    getPanelSettingsTab().setSize(150, 49);
                    getPanel1710Tab().setSize(150, 49);
                    getPanel189Tab().setSize(150, 50);
                }
            }
        });




        if (System.getProperty("os.name").toLowerCase().contains("windows")) {
            checkMissing();


            //1.7.10 Listeners


            button1710Optifine.addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    checkMissing();
                    name = "OptiFine_1.7.10_HD_U_D8.jar";
                    inputStream = getClass().getResourceAsStream("/modinstaller/resource/r1710/" + name);
                    copyFiles(inputStream,dirWindows1710.toPath().resolve(name));
                }
            });
            button1710BspkrsCore.addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    checkMissing();
                    name = "[1.7.10]bspkrsCore-universal-6.16.jar";
                    inputStream = getClass().getResourceAsStream("/modinstaller/resource/r1710/" + name);
                    copyFiles(inputStream,dirWindows1710.toPath().resolve(name));
                }
            });
            button1710TimeChanger.addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    checkMissing();
                    name = "TimeChanger-1.0.jar";
                    inputStream = getClass().getResourceAsStream("/modinstaller/resource/r1710/" + name);
                    copyFiles(inputStream,dirWindows1710.toPath().resolve(name));
                }
            });
            button1710WayPoints.addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    checkMissing();
                    name = "WaypointsMod.jar";
                    inputStream = getClass().getResourceAsStream("/modinstaller/resource/r1710/" + name);
                    copyFiles(inputStream,dirWindows1710.toPath().resolve(name));
                }
            });
            button1710ToggleSneak.addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    checkMissing();
                    name = "ToggleSneak-(1.7.10)-v3.0.5.jar";
                    inputStream = getClass().getResourceAsStream("/modinstaller/resource/r1710/" + name);
                    copyFiles(inputStream,dirWindows1710.toPath().resolve(name));
                    name = "PlayerAPI-1.7.10-1.4.jar";
                    inputStream = getClass().getResourceAsStream("/modinstaller/resource/r1710/" + name);
                    copyFiles(inputStream,dirWindows1710.toPath().resolve(name));
                }
            });
            button1710BattysCoords.addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    checkMissing();
                    name = "Batty's Coordinates PLUS Mod for Forge-1.7.10_1.6.0.jar";
                    inputStream = getClass().getResourceAsStream("/modinstaller/resource/r1710/" + name);
                    copyFiles(inputStream,dirWindows1710.toPath().resolve(name));
                }
            });
            button1710ShinyPots.addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    checkMissing();
                    name = "ShinyPots-1.1.jar";
                    inputStream = getClass().getResourceAsStream("/modinstaller/resource/r1710/" + name);
                    copyFiles(inputStream,dirWindows1710.toPath().resolve(name));
                }
            });
            button1710FastChat.addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    checkMissing();
                    name = "FastChat 1.7.10.jar";
                    inputStream = getClass().getResourceAsStream("/modinstaller/resource/r1710/" + name);
                    copyFiles(inputStream,dirWindows1710.toPath().resolve(name));
                }
            });
            button1710ArmorStatus.addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    checkMissing();
                    name = "[1.7.10]ArmorStatusHUD-client-1.28.jar";
                    inputStream = getClass().getResourceAsStream("/modinstaller/resource/r1710/" + name);
                    copyFiles(inputStream,dirWindows1710.toPath().resolve(name));
                    name = "[1.7.10]bspkrsCore-universal-6.16.jar";
                    inputStream = getClass().getResourceAsStream("/modinstaller/resource/r1710/" + name);
                    copyFiles(inputStream,dirWindows1710.toPath().resolve(name));
                }
            });
            button1710PlayerApi.addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    checkMissing();
                    name = "PlayerAPI-1.7.10-1.4.jar";
                    inputStream = getClass().getResourceAsStream("/modinstaller/resource/r1710/" + name);
                    copyFiles(inputStream,dirWindows1710.toPath().resolve(name));
                }
            });
            button1710ReisMinimap.addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    checkMissing();
                    name = "Reis-Minimap-Mod-1.7.10.jar";
                    inputStream = getClass().getResourceAsStream("/modinstaller/resource/r1710/" + name);
                    copyFiles(inputStream,dirWindows1710.toPath().resolve(name));
                }
            });
            button1710MotionBlur.addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    checkMissing();
                    name = "MotionBlurMod.jar";
                    inputStream = getClass().getResourceAsStream("/modinstaller/resource/r1710/" + name);
                    copyFiles(inputStream,dirWindows1710.toPath().resolve(name));
                }
            });
            button1710StatusEffect.addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    checkMissing();
                    name = "[1.7.10]StatusEffectHUD-client-1.27.jar";
                    inputStream = getClass().getResourceAsStream("/modinstaller/resource/r1710/" + name);
                    copyFiles(inputStream,dirWindows1710.toPath().resolve(name));
                    name = "[1.7.10]bspkrsCore-universal-6.16.jar";
                    inputStream = getClass().getResourceAsStream("/modinstaller/resource/r1710/" + name);
                    copyFiles(inputStream,dirWindows1710.toPath().resolve(name));
                }
            });
            button1710CpsMod.addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    checkMissing();
                    name = "CPSMod.jar";
                    inputStream = getClass().getResourceAsStream("/modinstaller/resource/r1710/" + name);
                    copyFiles(inputStream,dirWindows1710.toPath().resolve(name));
                }
            });
            button1710PackOrganizer.addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    checkMissing();
                    name = "ResourcePackOrganizer  MC-1.7.10  v1.0.2.jar";
                    inputStream = getClass().getResourceAsStream("/modinstaller/resource/r1710/" + name);
                    copyFiles(inputStream,dirWindows1710.toPath().resolve(name));
                }
            });
            button1710ParticlesMod.addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    checkMissing();
                    name = "[1.7.10]ParticleMod-1.02.jar";
                    inputStream = getClass().getResourceAsStream("/modinstaller/resource/r1710/" + name);
                    copyFiles(inputStream,dirWindows1710.toPath().resolve(name));
                }
            });
            button1710DirectionHud.addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    checkMissing();
                    name = "[1.7.10]DirectionHUD-client-1.24.jar";
                    inputStream = getClass().getResourceAsStream("/modinstaller/resource/r1710/" + name);
                    copyFiles(inputStream,dirWindows1710.toPath().resolve(name));
                    name = "[1.7.10]bspkrsCore-universal-6.16.jar";
                    inputStream = getClass().getResourceAsStream("/modinstaller/resource/r1710/" + name);
                    copyFiles(inputStream,dirWindows1710.toPath().resolve(name));
                }
            });
            button1710TabbyChat.addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    checkMissing();
                    name = "TabbyChat-1.7.10-1.11.2.2-fml.jar";
                    inputStream = getClass().getResourceAsStream("/modinstaller/resource/r1710/" + name);
                    copyFiles(inputStream,dirWindows1710.toPath().resolve(name));
                }
            });
            button1710KeyStrokes.addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    checkMissing();
                    name = "KeystrokesMod v3.jar";
                    inputStream = getClass().getResourceAsStream("/modinstaller/resource/r1710/" + name);
                    copyFiles(inputStream,dirWindows1710.toPath().resolve(name));
                }
            });
            button1710TcpNoDelay.addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    checkMissing();
                    name = "TcpNoDelayMod-2.0.jar";
                    inputStream = getClass().getResourceAsStream("/modinstaller/resource/r1710/" + name);
                    copyFiles(inputStream,dirWindows1710.toPath().resolve(name));
                }
            });


            //Settings Listeners


            getButton1710OptifineInstaller().addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    checkMissing();
                    name = "OptiFine_1.7.10_HD_U_D8.jar";
                    runner = new File(dirWindows1710 + "\\" + name);
                    inputStream = getClass().getResourceAsStream("/modinstaller/resource/rsettings/" + name);
                    copyFiles(inputStream,dirWindows1710.toPath().resolve(name));
                    runFiles(runner);
                }
            });
            getButton189OptifineInstaller().addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    checkMissing();
                    name = "OptiFine_1.8.9_HD_U_H8.jar";
                    runner = new File(dirWindows189 + "\\" + name);
                    inputStream = getClass().getResourceAsStream("/modinstaller/resource/rsettings/" + name);
                    copyFiles(inputStream,dirWindows189.toPath().resolve(name));
                    runFiles(runner);
                }
            });
            getButton1710ForgeInstaller().addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    checkMissing();
                    name = "forge-1.7.10-10.13.4.1558-1.7.10-installer.jar";
                    runner = new File(dirWindows1710 + "\\" + name);
                    inputStream = getClass().getResourceAsStream("/modinstaller/resource/rsettings/" + name);
                    copyFiles(inputStream,dirWindows1710.toPath().resolve(name));
                    runFiles(runner);
                }
            });
            getButton189ForgeInstaller().addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    checkMissing();
                    name = "forge-1.8.9-11.15.1.1722-installer.jar";
                    runner = new File(dirWindows189 + "\\" + name);
                    inputStream = getClass().getResourceAsStream("/modinstaller/resource/rsettings/" + name);
                    copyFiles(inputStream,dirWindows189.toPath().resolve(name));
                    runFiles(runner);
                }
            });
            getButton1710LiteInstaller().addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    checkMissing();
                    name = "liteloader-installer-1.7.10-04.jar";
                    runner = new File(dirWindows1710 + "\\" + name);
                    inputStream = getClass().getResourceAsStream("/modinstaller/resource/rsettings/" + name);
                    copyFiles(inputStream,dirWindows1710.toPath().resolve(name));
                    runFiles(runner);
                }
            });
            getButton189LiteInstaller().addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    checkMissing();
                    name = "liteloader-installer-1.8.9-00-SNAPSHOT.jar";
                    runner = new File(dirWindows189 + "\\" + name);
                    inputStream = getClass().getResourceAsStream("/modinstaller/resource/rsettings/" + name);
                    copyFiles(inputStream,dirWindows189.toPath().resolve(name));
                    runFiles(runner);
                }
            });



            //1.8.9 Listeners



            getButton189ArmorStatus().addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    name = "[1.8.9] ArmorStatusHUD.jar";
                    inputStream = getClass().getResourceAsStream("/modinstaller/resource/r189/" + name);
                    copyFiles(inputStream,dirWindows189.toPath().resolve(name));
                    name = "[1.8.9] BspkrsCore.jar";
                    inputStream = getClass().getResourceAsStream("/modinstaller/resource/r189/" + name);
                    copyFiles(inputStream,dirWindows189.toPath().resolve(name));
                }
            });
            getButton189BattysCoords().addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    name = "[1.8.9] Batty's Coordinates PLUS.jar";
                    inputStream = getClass().getResourceAsStream("/modinstaller/resource/r189/" + name);
                    copyFiles(inputStream,dirWindows189.toPath().resolve(name));
                }
            });
            getButton189BspkrsCore().addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    name = "[1.8.9] BspkrsCore.jar";
                    inputStream = getClass().getResourceAsStream("/modinstaller/resource/r189/" + name);
                    copyFiles(inputStream,dirWindows189.toPath().resolve(name));
                }
            });
            getButton189CpsMod().addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    name = "[1.8.9] CPS.jar";
                    inputStream = getClass().getResourceAsStream("/modinstaller/resource/r189/" + name);
                    copyFiles(inputStream,dirWindows189.toPath().resolve(name));
                }
            });
            getButton189FastChat().addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    name = "[1.8.9] FastChat.jar";
                    inputStream = getClass().getResourceAsStream("/modinstaller/resource/r189/" + name);
                    copyFiles(inputStream,dirWindows189.toPath().resolve(name));
                }
            });
            getButton189KeyStrokes().addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    name = "[1.8.9] KeystrokesMod (v3).jar";
                    inputStream = getClass().getResourceAsStream("/modinstaller/resource/r189/" + name);
                    copyFiles(inputStream,dirWindows189.toPath().resolve(name));
                }
            });
            getButton189MouseDelayFix().addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    name = "[1.8.9] MouseDelayFix (by prplz).jar";
                    inputStream = getClass().getResourceAsStream("/modinstaller/resource/r189/" + name);
                    copyFiles(inputStream,dirWindows189.toPath().resolve(name));
                }
            });
            getButton189OldAnimations().addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    name = "[1.8.9] OldAnimationsMod (v2.4).jar";
                    inputStream = getClass().getResourceAsStream("/modinstaller/resource/r189/" + name);
                    copyFiles(inputStream,dirWindows189.toPath().resolve(name));
                }
            });
            getButton189Optifine().addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    name = "[1.8.9] OptiFine.jar";
                    inputStream = getClass().getResourceAsStream("/modinstaller/resource/r189/" + name);
                    copyFiles(inputStream,dirWindows189.toPath().resolve(name));
                }
            });
            getButton189PlayerApi().addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    name = "[1.8.9] PlayerAPI.jar";
                    inputStream = getClass().getResourceAsStream("/modinstaller/resource/r189/" + name);
                    copyFiles(inputStream,dirWindows189.toPath().resolve(name));
                }
            });
            getButton189PackOrganizer().addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    name = "[1.8.9] ResourcePackOrganizer.jar";
                    inputStream = getClass().getResourceAsStream("/modinstaller/resource/r189/" + name);
                    copyFiles(inputStream,dirWindows189.toPath().resolve(name));
                }
            });
            getButton189StatusEffect().addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    name = "[1.8.9] StatusEffectHUD.jar";
                    inputStream = getClass().getResourceAsStream("/modinstaller/resource/r189/" + name);
                    copyFiles(inputStream,dirWindows189.toPath().resolve(name));
                    name = "[1.8.9] BspkrsCore.jar";
                    inputStream = getClass().getResourceAsStream("/modinstaller/resource/r189/" + name);
                    copyFiles(inputStream,dirWindows189.toPath().resolve(name));
                }
            });
            getButton1895zigMod().addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    name = "[1.8.9] The 5zig Mod (v3.9.20).jar";
                    inputStream = getClass().getResourceAsStream("/modinstaller/resource/r189/" + name);
                    copyFiles(inputStream,dirWindows189.toPath().resolve(name));
                }
            });
            getButton189TimeChanger().addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    name = "[1.8.9] TimeChanger.jar";
                    inputStream = getClass().getResourceAsStream("/modinstaller/resource/r189/" + name);
                    copyFiles(inputStream,dirWindows189.toPath().resolve(name));
                }
            });
            getButton189ToggleSneak().addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    name = "[1.8.9] ToggleSneak (v3.2.2).jar";
                    inputStream = getClass().getResourceAsStream("/modinstaller/resource/r189/" + name);
                    copyFiles(inputStream,dirWindows189.toPath().resolve(name));
                    name = "[1.8.9] PlayerAPI.jar";
                    inputStream = getClass().getResourceAsStream("/modinstaller/resource/r189/" + name);
                    copyFiles(inputStream,dirWindows189.toPath().resolve(name));
                }
            });
            getButton189WayPoints().addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    name = "[1.8.9] Waypoints.jar";
                    inputStream = getClass().getResourceAsStream("/modinstaller/resource/r189/" + name);
                    copyFiles(inputStream,dirWindows189.toPath().resolve(name));
                }
            });
            getButton189ParticlesMod().addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    name = "[1.8.9]ParticleMod-1.02.jar";
                    inputStream = getClass().getResourceAsStream("/modinstaller/resource/r189/" + name);
                    copyFiles(inputStream,dirWindows189.toPath().resolve(name));
                }
            });
            getButton189BetterPvP().addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    name = "BetterPvP_1.12.8_Forge_1.8.9.jar";
                    inputStream = getClass().getResourceAsStream("/modinstaller/resource/r189/" + name);
                    copyFiles(inputStream,dirWindows189.toPath().resolve(name));
                }
            });
            getButton189LabyMod().addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    name = "LabyMod_v2.8.0_mc1.8.8.jar";
                    inputStream = getClass().getResourceAsStream("/modinstaller/resource/r189/" + name);
                    copyFiles(inputStream,dirWindows189.toPath().resolve(name));
                }
            });
            getButton189XaerosMinimap().addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    name = "Xaeros_Minimap_1.13_Forge_1.8.9.jar";
                    inputStream = getClass().getResourceAsStream("/modinstaller/resource/r189/" + name);
                    copyFiles(inputStream,dirWindows189.toPath().resolve(name));
                }
            });
        }
        if (System.getProperty("os.name").toLowerCase().contains("linux")) {
        }
        if (System.getProperty("os.name").toLowerCase().contains("mac")) {
        }
    }
}