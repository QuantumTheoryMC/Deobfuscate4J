package net.pizzacrust.deobfmc;

import net.md_5.specialsource.SpecialSource;
import org.apache.commons.io.FileUtils;

import java.io.File;

public class ApplySpecialSource {
    public static void main(String[] args) {
        File srg = new File(SetupDirectories.deobfMcVersionFolder, "client.srg");
        File tempJar = new File(SetupDirectories.deobfMcVersionFolder, "DeobfMC-1.9.jar");
        File deobfMcJar = new File(SetupDirectories.deobfMcVersionFolder, "client.jar");
        try {
            FileUtils.copyFile(deobfMcJar, tempJar);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
        String[] ssArgs = new String[]{"--quiet", "--srg-in", srg.getAbsolutePath(), "--in-jar", deobfMcJar.getAbsolutePath(), "--out-jar", tempJar.getAbsolutePath()};
        try {
            SpecialSource.main(ssArgs);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
