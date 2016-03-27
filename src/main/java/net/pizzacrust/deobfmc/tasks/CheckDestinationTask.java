package net.pizzacrust.deobfmc.tasks;

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

import java.io.File;

public class CheckDestinationTask extends DefaultTask {
    public static final File destination = new File(System.getProperty("user.dir"), "libs");

    @TaskAction
    public void doTask() {
        if (!destination.exists()) {
            destination.mkdir();
        }
    }
}
