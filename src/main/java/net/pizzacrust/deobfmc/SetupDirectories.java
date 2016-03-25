package net.pizzacrust.deobfmc;

import java.io.File;

/**
 * Setups the directories.
 */
public class SetupDirectories {
    public static final File deobfMcVersionFolder = new File(CheckMinecraftDirectory.versionsDirectory, "DeobfMC-1.9");

    public static void main(String[] args) {
        if (deobfMcVersionFolder.exists()) {
            throw new RuntimeException("DeobfMC is already installed!");
        }
        deobfMcVersionFolder.mkdir();
    }
}
