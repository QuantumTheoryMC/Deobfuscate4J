package net.pizzacrust.deobfmc.tasks;

import net.md_5.specialsource.SpecialSource;
import net.pizzacrust.deobfmc.DeobfMCExtension;
import org.codehaus.plexus.util.FileUtils;
import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

import java.io.File;

public class ApplySpecialSourceTask extends DefaultTask {
    public ApplySpecialSourceTask() {
        this.dependsOn("checkDestination", "downloadClient", "downloadMappings");
    }

    @TaskAction
    public void doTask() {
        File finalJar = new File(CheckDestinationTask.destination, getProject().getExtensions().getByType(DeobfMCExtension.class).getOutJarName());
        try {
            FileUtils.copyFile(DownloadClientTask.clientJar, finalJar);
            String[] args = new String[] { "--quiet", "--srg-in", DownloadMappingTask.mappings.getAbsolutePath(), "--in-jar", DownloadClientTask.clientJar.getAbsolutePath(), "--out-jar", finalJar.getAbsolutePath()};
            SpecialSource.main(args);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
