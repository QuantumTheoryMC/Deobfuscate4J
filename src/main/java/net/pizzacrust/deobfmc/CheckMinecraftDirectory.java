package net.pizzacrust.deobfmc;

import java.io.File;

/**
 * Check the minecraft directory.
 */
public class CheckMinecraftDirectory {
    public static final File minecraftDirectory = new File(System.getenv("APPDATA"), ".minecraft");
    public static final File versionsDirectory  = new File(minecraftDirectory, "versions");

    public static final File mcVersionDirectory = new File(versionsDirectory, "1.9"); // i.e: 1.9

    public static void main(String[] args) {
        if (System.getProperty("os.name").startsWith("Windows")) {
            if (!minecraftDirectory.exists()) {
                throw new RuntimeException("Minecraft directory could not be found!");
            }
            if (!versionsDirectory.exists()) {
                throw new RuntimeException("Minecraft's version directory is missing. Possibly .minecraft directory is a fake?");
            }
            if (!mcVersionDirectory.exists()) {
                throw new RuntimeException("Minecraft 1.9 has not been installed/ran yet from the launcher.");
            }
        } else {
            throw new RuntimeException("OS is not supported due to directory format!");
        }
    }
}
