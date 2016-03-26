package net.pizzacrust.deobfmc.tasks;

import net.pizzacrust.deobfmc.CheckMinecraftDirectory;
import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

public class CheckDestinationTask extends DefaultTask {
    @TaskAction
    public void doTask() {
        CheckMinecraftDirectory.main(new String[0]);
    }
}
