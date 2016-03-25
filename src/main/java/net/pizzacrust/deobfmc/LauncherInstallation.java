package net.pizzacrust.deobfmc;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.net.URL;

public class LauncherInstallation {
    public static void main(String[] args) {
        File deobfMCJson = new File(SetupDirectories.deobfMcVersionFolder, "DeobfMC-1.9.json");
        try {
            URL packedJson = LauncherInstallation.class.getResource("DeobfMC-1.9.json");
            FileUtils.copyURLToFile(packedJson, deobfMCJson);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
