package net.pizzacrust.deobfmc.tasks;

import net.pizzacrust.deobfmc.DownloadMappings;
import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

public class DownloadMappingTask extends DefaultTask {

    @TaskAction
    public void doTask() {
        DownloadMappings.main(new String[0]);
    }
}
