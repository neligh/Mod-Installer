package modinstaller.gui;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class Gui extends JFrame implements IVars {
    public Gui() {
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(100, 100, 600, 350);
        setContentPane(getContentPanel());
        {
            getContentPanel().setBackground(new Color(240, 240, 240));
            getContentPanel().setBorder(new javax.swing.border.EmptyBorder(5, 5, 5, 5));
            getContentPanel().setLayout(null);
        }
        {
            getPanel1710Panel().setVisible(false);
            getPanel1710Panel().setBounds(0, 50, 594, 271);
            getPanel1710Panel().setLayout(null);
            getContentPanel().add(getPanel1710Panel());
        }
        {
            getPanel189Panel().setVisible(false);
            getPanel189Panel().setBounds(0, 50, 594, 271);
            getPanel189Panel().setLayout(null);
            getContentPanel().add(getPanel189Panel());
        }
        {
            getPanelSettingsPanel().setBounds(0, 50, 594, 271);
            getPanelSettingsPanel().setLayout(null);
            getContentPanel().add(getPanelSettingsPanel());
        }
        {
            getPanelTabs().setBackground(Color.LIGHT_GRAY);
            getPanelTabs().setFocusable(false);
            getPanelTabs().setBounds(0, 0, 594, 50);
            getPanelTabs().setLayout(null);
            getContentPanel().add(getPanelTabs());
        }
        {
            getPanelSettingsTab().setBackground(new Color(240, 240, 240));
            getPanelSettingsTab().setBorder(null);
            getPanelSettingsTab().setBorder(null);
            getPanelSettingsTab().setBounds(0, 0, 150, 50);
            getPanelSettingsTab().setLayout(null);
            getPanelTabs().add(getPanelSettingsTab());
        }
        {
            getLabelSettings().setFont(new Font("Tahoma", Font.PLAIN, 20));
            getLabelSettings().setHorizontalAlignment(SwingConstants.CENTER);
            getLabelSettings().setBounds(10, 11, 130, 28);
            getPanelSettingsTab().add(getLabelSettings());
        }
        {
            getPanel1710Tab().setBorder(null);
            getPanel1710Tab().setBackground(new Color(210, 210, 210));
            getPanel1710Tab().setBounds(151, 0, 150, 49);
            getPanel1710Tab().setLayout(null);
            getPanelTabs().add(getPanel1710Tab());
        }
        {
            getLabel1710Mods().setFont(new Font("Tahoma", Font.PLAIN, 20));
            getLabel1710Mods().setHorizontalAlignment(SwingConstants.CENTER);
            getLabel1710Mods().setBounds(10, 11, 130, 28);
            getPanel1710Tab().add(getLabel1710Mods());
        }
        {
            getPanel189Tab().setBorder(null);
            getPanel189Tab().setBackground(new Color(210, 210, 210));
            getPanel189Tab().setBounds(302, 0, 150, 49);
            getPanel189Tab().setLayout(null);
            getPanelTabs().add(getPanel189Tab());
        }
        {
            getLabel189Mods().setHorizontalAlignment(SwingConstants.CENTER);
            getLabel189Mods().setFont(new Font("Tahoma", Font.PLAIN, 20));
            getLabel189Mods().setBounds(10, 11, 130, 28);
            getPanel189Tab().add(getLabel189Mods());
        }


        //1.7.10 panel


        {
            getButton1710Optifine().setFont(new Font("Tahoma", Font.PLAIN, 15));
            getButton1710Optifine().setFocusable(false);
            getButton1710Optifine().setBounds(10, 11, 136, 40);
            getPanel1710Panel().add(getButton1710Optifine());
        }
        {
            getButton1710BspkrsCore().setFont(new Font("Tahoma", Font.PLAIN, 15));
            getButton1710BspkrsCore().setFocusable(false);
            getButton1710BspkrsCore().setBounds(156, 11, 136, 40);
            getPanel1710Panel().add(getButton1710BspkrsCore());
        }
        {
            getButton1710TimeChanger().setFont(new Font("Tahoma", Font.PLAIN, 15));
            getButton1710TimeChanger().setFocusable(false);
            getButton1710TimeChanger().setBounds(302, 11, 136, 40);
            getPanel1710Panel().add(getButton1710TimeChanger());
        }
        {
            getButton1710WayPoints().setFont(new Font("Tahoma", Font.PLAIN, 15));
            getButton1710WayPoints().setFocusable(false);
            getButton1710WayPoints().setBounds(448, 11, 136, 40);
            getPanel1710Panel().add(getButton1710WayPoints());
        }
        {
            getButton1710ToggleSneak().setFont(new Font("Tahoma", Font.PLAIN, 15));
            getButton1710ToggleSneak().setFocusable(false);
            getButton1710ToggleSneak().setBounds(10, 62, 136, 40);
            getPanel1710Panel().add(getButton1710ToggleSneak());
        }
        {
            getButton1710BattysCoords().setFont(new Font("Tahoma", Font.PLAIN, 15));
            getButton1710BattysCoords().setFocusable(false);
            getButton1710BattysCoords().setBounds(156, 62, 136, 40);
            getPanel1710Panel().add(getButton1710BattysCoords());
        }
        {
            getButton1710ShinyPots().setFont(new Font("Tahoma", Font.PLAIN, 15));
            getButton1710ShinyPots().setFocusable(false);
            getButton1710ShinyPots().setBounds(302, 62, 136, 40);
            getPanel1710Panel().add(getButton1710ShinyPots());
        }
        {
            getButton1710FastChat().setFont(new Font("Tahoma", Font.PLAIN, 15));
            getButton1710FastChat().setFocusable(false);
            getButton1710FastChat().setBounds(448, 62, 136, 40);
            getPanel1710Panel().add(getButton1710FastChat());
        }
        {
            getButton1710ArmorStatus().setFont(new Font("Tahoma", Font.PLAIN, 15));
            getButton1710ArmorStatus().setFocusable(false);
            getButton1710ArmorStatus().setBounds(10, 113, 136, 40);
            getPanel1710Panel().add(getButton1710ArmorStatus());
        }
        {
            getButton1710PlayerApi().setFont(new Font("Tahoma", Font.PLAIN, 15));
            getButton1710PlayerApi().setFocusable(false);
            getButton1710PlayerApi().setBounds(156, 113, 136, 40);
            getPanel1710Panel().add(getButton1710PlayerApi());
        }
        {
            getButton1710ReisMinimap().setFont(new Font("Tahoma", Font.PLAIN, 15));
            getButton1710ReisMinimap().setFocusable(false);
            getButton1710ReisMinimap().setBounds(302, 113, 136, 40);
            getPanel1710Panel().add(getButton1710ReisMinimap());
        }
        {
            getButton1710MotionBlur().setFont(new Font("Tahoma", Font.PLAIN, 15));
            getButton1710MotionBlur().setFocusable(false);
            getButton1710MotionBlur().setBounds(448, 113, 136, 40);
            getPanel1710Panel().add(getButton1710MotionBlur());
        }
        {
            getButton1710StatusEffect().setFont(new Font("Tahoma", Font.PLAIN, 15));
            getButton1710StatusEffect().setFocusable(false);
            getButton1710StatusEffect().setBounds(10, 164, 136, 40);
            getPanel1710Panel().add(getButton1710StatusEffect());
        }
        {
            getButton1710CpsMod().setFont(new Font("Tahoma", Font.PLAIN, 15));
            getButton1710CpsMod().setFocusable(false);
            getButton1710CpsMod().setBounds(156, 164, 136, 40);
            getPanel1710Panel().add(getButton1710CpsMod());
        }
        {
            getButton1710PackOrganizer().setFont(new Font("Tahoma", Font.PLAIN, 15));
            getButton1710PackOrganizer().setFocusable(false);
            getButton1710PackOrganizer().setBounds(302, 164, 136, 40);
            getPanel1710Panel().add(getButton1710PackOrganizer());
        }
        {
            getButton1710ParticlesMod().setFont(new Font("Tahoma", Font.PLAIN, 15));
            getButton1710ParticlesMod().setFocusable(false);
            getButton1710ParticlesMod().setBounds(448, 164, 136, 40);
            getPanel1710Panel().add(getButton1710ParticlesMod());
        }
        {
            getButton1710DirectionHud().setFont(new Font("Tahoma", Font.PLAIN, 15));
            getButton1710DirectionHud().setFocusable(false);
            getButton1710DirectionHud().setBounds(10, 215, 136, 40);
            getPanel1710Panel().add(getButton1710DirectionHud());
        }
        {
            getButton1710TabbyChat().setFont(new Font("Tahoma", Font.PLAIN, 15));
            getButton1710TabbyChat().setFocusable(false);
            getButton1710TabbyChat().setBounds(156, 215, 136, 40);
            getPanel1710Panel().add(getButton1710TabbyChat());
        }
        {
            getButton1710KeyStrokes().setFont(new Font("Tahoma", Font.PLAIN, 15));
            getButton1710KeyStrokes().setFocusable(false);
            getButton1710KeyStrokes().setBounds(302, 215, 136, 40);
            getPanel1710Panel().add(getButton1710KeyStrokes());
        }
        {
            getButton1710TcpNoDelay().setFont(new Font("Tahoma", Font.PLAIN, 15));
            getButton1710TcpNoDelay().setFocusable(false);
            getButton1710TcpNoDelay().setBounds(448, 215, 136, 40);
            getPanel1710Panel().add(getButton1710TcpNoDelay());
        }


        //1.8.9 Panel

        {
            getButton189Optifine().setFont(new Font("Tahoma", Font.PLAIN, 15));
            getButton189Optifine().setFocusable(false);
            getButton189Optifine().setBorder(null);
            getButton189Optifine().setBounds(10, 11, 136, 40);
            getPanel189Panel().add(getButton189Optifine());
        }

    {
        button189ToggleSneak.setFont(new Font("Tahoma", Font.PLAIN, 15));
        button189ToggleSneak.setFocusable(false);
        button189ToggleSneak.setBorder(null);
        button189ToggleSneak.setBounds(10, 62, 136, 40);
        panel189Panel.add(button189ToggleSneak);
    }

    {
        button189ArmorStatus.setFont(new Font("Tahoma", Font.PLAIN, 15));
        button189ArmorStatus.setFocusable(false);
        button189ArmorStatus.setBorder(null);
        button189ArmorStatus.setBounds(10, 113, 136, 40);
        panel189Panel.add(button189ArmorStatus);
    }

    {
        button189StatusEffect.setFont(new Font("Tahoma", Font.PLAIN, 15));
        button189StatusEffect.setFocusable(false);
        button189StatusEffect.setBorder(null);
        button189StatusEffect.setBounds(10, 164, 136, 40);
        panel189Panel.add(button189StatusEffect);
    }

    {
        button189BspkrsCore.setFont(new Font("Tahoma", Font.PLAIN, 15));
        button189BspkrsCore.setFocusable(false);
        button189BspkrsCore.setBorder(null);
        button189BspkrsCore.setBounds(10, 215, 136, 40);
        panel189Panel.add(button189BspkrsCore);
    }

    {
        button189XaerosMinimap.setFont(new Font("Tahoma", Font.PLAIN, 15));
        button189XaerosMinimap.setFocusable(false);
        button189XaerosMinimap.setBorder(null);
        button189XaerosMinimap.setBounds(156, 215, 136, 40);
        panel189Panel.add(button189XaerosMinimap);
    }

    {
        button189TimeChanger.setFont(new Font("Tahoma", Font.PLAIN, 15));
        button189TimeChanger.setFocusable(false);
        button189TimeChanger.setBorder(null);
        button189TimeChanger.setBounds(156, 164, 136, 40);
        panel189Panel.add(button189TimeChanger);
    }

    {
        button189CpsMod.setFont(new Font("Tahoma", Font.PLAIN, 15));
        button189CpsMod.setFocusable(false);
        button189CpsMod.setBorder(null);
        button189CpsMod.setBounds(156, 113, 136, 40);
        panel189Panel.add(button189CpsMod);
    }

    {
        button189PlayerApi.setFont(new Font("Tahoma", Font.PLAIN, 15));
        button189PlayerApi.setFocusable(false);
        button189PlayerApi.setBorder(null);
        button189PlayerApi.setBounds(156, 62, 136, 40);
        panel189Panel.add(button189PlayerApi);
    }

    {
        button189BattysCoords.setFont(new Font("Tahoma", Font.PLAIN, 15));
        button189BattysCoords.setFocusable(false);
        button189BattysCoords.setBorder(null);
        button189BattysCoords.setBounds(156, 11, 136, 40);
        panel189Panel.add(button189BattysCoords);
    }

    {
        button189ParticlesMod.setFont(new Font("Tahoma", Font.PLAIN, 15));
        button189ParticlesMod.setFocusable(false);
        button189ParticlesMod.setBorder(null);
        button189ParticlesMod.setBounds(302, 215, 136, 40);
        panel189Panel.add(button189ParticlesMod);
    }

    {
        button189FastChat.setFont(new Font("Tahoma", Font.PLAIN, 15));
        button189FastChat.setFocusable(false);
        button189FastChat.setBorder(null);
        button189FastChat.setBounds(302, 164, 136, 40);
        panel189Panel.add(button189FastChat);
    }

    {
        button189WayPoints.setFont(new Font("Tahoma", Font.PLAIN, 15));
        button189WayPoints.setFocusable(false);
        button189WayPoints.setBorder(null);
        button189WayPoints.setBounds(302, 113, 136, 40);
        panel189Panel.add(button189WayPoints);
    }

    {
        button189KeyStrokes.setFont(new Font("Tahoma", Font.PLAIN, 15));
        button189KeyStrokes.setFocusable(false);
        button189KeyStrokes.setBorder(null);
        button189KeyStrokes.setBounds(302, 62, 136, 40);
        panel189Panel.add(button189KeyStrokes);
    }

    {
        button189PackOrganizer.setFont(new Font("Tahoma", Font.PLAIN, 15));
        button189PackOrganizer.setFocusable(false);
        button189PackOrganizer.setBorder(null);
        button189PackOrganizer.setBounds(302, 11, 136, 40);
        panel189Panel.add(button189PackOrganizer);
    }

    {
        button1895zigMod.setFont(new Font("Tahoma", Font.PLAIN, 15));
        button1895zigMod.setFocusable(false);
        button1895zigMod.setBorder(null);
        button1895zigMod.setBounds(448, 11, 136, 40);
        panel189Panel.add(button1895zigMod);
    }

    {
        button189OldAnimations.setFont(new Font("Tahoma", Font.PLAIN, 15));
        button189OldAnimations.setFocusable(false);
        button189OldAnimations.setBorder(null);
        button189OldAnimations.setBounds(448, 62, 136, 40);
        panel189Panel.add(button189OldAnimations);
    }

    {
        getButton189MouseDelayFix().setFont(new Font("Tahoma", Font.PLAIN, 15));
        getButton189MouseDelayFix().setFocusable(false);
        getButton189MouseDelayFix().setBorder(null);
        getButton189MouseDelayFix().setBounds(448, 113, 136, 40);
        panel189Panel.add(getButton189MouseDelayFix());
    }

    {
        button189BetterPvP.setFont(new Font("Tahoma", Font.PLAIN, 15));
        button189BetterPvP.setFocusable(false);
        button189BetterPvP.setBorder(null);
        button189BetterPvP.setBounds(448, 164, 136, 40);
        panel189Panel.add(button189BetterPvP);
    }

    {
        button189LabyMod.setFont(new Font("Tahoma", Font.PLAIN, 15));
        button189LabyMod.setFocusable(false);
        button189LabyMod.setBorder(null);
        button189LabyMod.setBounds(448, 215, 136, 40);
        panel189Panel.add(button189LabyMod);
    }


    //Settings panel


    getFieldMinecraftDirectory().setFont(new Font("Tahoma", Font.PLAIN, 15));
    getFieldMinecraftDirectory().setHorizontalAlignment(SwingConstants.CENTER);
    getFieldMinecraftDirectory().setBounds(229,11,355,40);
    getFieldMinecraftDirectory().setColumns(10);
    getFieldMinecraftDirectory().setEditable(false);
    {
        getButton189OptifineInstaller().setBorder(null);
        getButton189OptifineInstaller().setFont(new Font("Tahoma", Font.PLAIN, 15));
        getButton189OptifineInstaller().setFocusable(false);
        getButton189OptifineInstaller().setBounds(83, 169, 136, 40);
        getPanelSettingsPanel().add(getButton189OptifineInstaller());
    }
    {
        button1710OptifineInstaller.setBorder(null);
        button1710OptifineInstaller.setFont(new Font("Tahoma", Font.PLAIN, 15));
        button1710OptifineInstaller.setFocusable(false);
        button1710OptifineInstaller.setBounds(83, 217, 136, 40);
        getPanelSettingsPanel().add(button1710OptifineInstaller);
    }
    {
        button1710ForgeInstaller.setBorder(null);
        button1710ForgeInstaller.setFont(new Font("Tahoma", Font.PLAIN, 15));
        button1710ForgeInstaller.setFocusable(false);
        button1710ForgeInstaller.setBounds(229, 217, 136, 40);
        getPanelSettingsPanel().add(button1710ForgeInstaller);
    }
    {
        button189ForgeInstaller.setBorder(null);
        button189ForgeInstaller.setFont(new Font("Tahoma", Font.PLAIN, 15));
        button189ForgeInstaller.setFocusable(false);
        button189ForgeInstaller.setBounds(229, 166, 136, 40);
        getPanelSettingsPanel().add(button189ForgeInstaller);
    }
    {
        button1710LiteInstaller.setBorder(null);
        button1710LiteInstaller.setFont(new Font("Tahoma", Font.PLAIN, 15));
        button1710LiteInstaller.setFocusable(false);
        button1710LiteInstaller.setBounds(375, 217, 136, 40);
        getPanelSettingsPanel().add(button1710LiteInstaller);
    }
    {
        button189LiteInstaller.setBorder(null);
        button189LiteInstaller.setFont(new Font("Tahoma", Font.PLAIN, 15));
        button189LiteInstaller.setFocusable(false);
        button189LiteInstaller.setBounds(375, 166, 136, 40);
        getPanelSettingsPanel().add(button189LiteInstaller);
    }
    {
        labelInstallers.setHorizontalAlignment(SwingConstants.CENTER);
        labelInstallers.setFont(new Font("Tahoma", Font.PLAIN, 20));
        labelInstallers.setBounds(207, 118, 180, 40);
        getPanelSettingsPanel().add(labelInstallers);
    }
    {
        labelMinecraftDirectory.setFont(new Font("Tahoma", Font.PLAIN, 20));
        labelMinecraftDirectory.setBounds(10, 11, 190, 40);
        getPanelSettingsPanel().add(labelMinecraftDirectory);
    }
    {
        labelOperatingSystem.setFont(new Font("Tahoma", Font.PLAIN, 20));
        labelOperatingSystem.setBounds(10, 62, 190, 40);
        getPanelSettingsPanel().add(labelOperatingSystem);
    }
    {
        getPanelSettingsPanel().add(getFieldMinecraftDirectory());
    }
    {
        fieldOperatingSystem.setFont(new Font("Tahoma", Font.PLAIN, 15));
        fieldOperatingSystem.setHorizontalAlignment(SwingConstants.CENTER);
        fieldOperatingSystem.setColumns(10);
        fieldOperatingSystem.setBounds(229, 62, 355, 40);
        fieldOperatingSystem.setEditable(false);
        getPanelSettingsPanel().add(fieldOperatingSystem);
    }

    {
        getLabelDevelopedByErase().setFont(new Font("Tahoma", Font.ITALIC, 12));
        getLabelDevelopedByErase().setHorizontalAlignment(SwingConstants.CENTER);
        getLabelDevelopedByErase().setBounds(10, 256, 574, 14);
        getPanelSettingsPanel().add(getLabelDevelopedByErase());
    }
        setVisible(true);
    }
}
