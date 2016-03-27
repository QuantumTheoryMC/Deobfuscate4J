package net.pizzacrust.deobfmc.tasks;

import net.pizzacrust.deobfmc.DeobfMCExtension;
import org.apache.commons.io.FileUtils;
import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

import java.io.File;
import java.net.URL;

public class DownloadMappingTask extends DefaultTask {
    public static File mappings;
    @TaskAction
    public void doTask() {
        try {
            DeobfMCExtension extension = getProject().getExtensions().getByType(DeobfMCExtension.class);
            if (extension.getSrgLocation() == null) {
                mappings = new File(CheckDestinationTask.destination, "client.srg");
                URL url = new URL(extension.getDownloadSrgLocation());
                FileUtils.copyURLToFile(url, mappings);
                return;
            }
            mappings = getProject().file(extension.getSrgLocation());
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
