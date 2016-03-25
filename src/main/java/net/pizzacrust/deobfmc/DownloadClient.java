package net.pizzacrust.deobfmc;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.net.URL;

/**
 * Downloads the client.
 */
public class DownloadClient {
    public static void main(String[] args) {
        try {
            String url = "https://launcher.mojang.com/mc/game/1.9/client/2f67dfe8953299440d1902f9124f0f2c3a2c940f/client.jar";
            URL urlObj = new URL(url);
            File deobfMcJar = new File(SetupDirectories.deobfMcVersionFolder, "DeobfMC-1.9.jar");
            FileUtils.copyURLToFile(urlObj, deobfMcJar);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
