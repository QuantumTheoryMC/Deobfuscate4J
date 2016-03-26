package net.pizzacrust.deobfmc.tasks;

import net.pizzacrust.deobfmc.ApplySpecialSource;
import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

public class ApplySpecialSourceTask extends DefaultTask {
    public ApplySpecialSourceTask() {
        this.dependsOn("checkDestination", "downloadClient", "downloadMappings");
    }

    @TaskAction
    public void doTask() {
        ApplySpecialSource.main(new String[0]);
    }
}
