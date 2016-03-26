package net.pizzacrust.deobfmc;

import java.io.File;

/**
 * Check the minecraft directory.
 */
public class CheckMinecraftDirectory {
    public static final File minecraftDirectory = new File(System.getenv("APPDATA"), ".minecraft");
    public static final File versionsDirectory = new File(minecraftDirectory, "versions");

    public static final File mcVersionDirectory = new File(System.getProperty("user.dir"), "libs"); // i.e: 1.9

    public static void main(String[] args) {
        if (!mcVersionDirectory.exists()) {
            mcVersionDirectory.mkdir();
        }
    }
}
