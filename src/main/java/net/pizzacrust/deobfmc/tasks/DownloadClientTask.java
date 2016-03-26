package net.pizzacrust.deobfmc.tasks;

import net.pizzacrust.deobfmc.DownloadClient;
import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

public class DownloadClientTask extends DefaultTask {

    @TaskAction
    public void doTask() {
        DownloadClient.main(new String[0]);
    }
}
