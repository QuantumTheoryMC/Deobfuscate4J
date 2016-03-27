package net.pizzacrust.deobfmc.tasks;

import net.pizzacrust.deobfmc.DeobfMCExtension;
import org.apache.commons.io.FileUtils;
import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

import java.io.File;
import java.net.URL;

public class DownloadClientTask extends DefaultTask {
    public static File clientJar;
    @TaskAction
    public void doTask() {
        try {
            DeobfMCExtension extension = getProject().getExtensions().getByType(DeobfMCExtension.class);
            if (extension.getInJar() == null) {
                clientJar = new File(CheckDestinationTask.destination, "client.jar");
                URL url = new URL(extension.getDownloadInJar());
                FileUtils.copyURLToFile(url, clientJar);
                return;
            }
            clientJar = getProject().file(extension.getInJar());
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
