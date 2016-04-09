package qtmc.lib.deobfuscate.tasks;

import qtmc.lib.deobfuscate.DeobfuscateExtension;
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
            DeobfuscateExtension extension = getProject().getExtensions().getByType(DeobfuscateExtension.class);
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
