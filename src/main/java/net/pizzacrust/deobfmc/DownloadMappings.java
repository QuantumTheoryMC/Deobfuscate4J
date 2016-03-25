package net.pizzacrust.deobfmc;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.net.URL;

public class DownloadMappings {
    public static void main(String[] args) {
        try {
            String url = "https://raw.githubusercontent.com/ProjectTestificate/MinecraftMappings/master/1.9/obf2mcp.srg";
            URL urlObj = new URL(url);
            File srg = new File(SetupDirectories.deobfMcVersionFolder, "client.srg");
            FileUtils.copyURLToFile(urlObj, srg);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
