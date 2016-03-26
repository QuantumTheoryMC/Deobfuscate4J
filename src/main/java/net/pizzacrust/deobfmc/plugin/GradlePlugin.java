package net.pizzacrust.deobfmc.plugin;

import net.pizzacrust.deobfmc.tasks.ApplySpecialSourceTask;
import net.pizzacrust.deobfmc.tasks.CheckDestinationTask;
import net.pizzacrust.deobfmc.tasks.DownloadClientTask;
import net.pizzacrust.deobfmc.tasks.DownloadMappingTask;
import org.gradle.api.Action;
import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class GradlePlugin implements Plugin<Project> {
    @Override
    public void apply(Project project) {
        project.afterEvaluate(new Action<Project>() {
            @Override
            public void execute(Project project) {
                println("#################################################");
                println("            DeobfMC 1.9 for Gradle               ");
                println("                Powered by MCP                   ");
                println("#################################################");
            }
        });
        project.getTasks().create("checkDestination", CheckDestinationTask.class);
        project.getTasks().create("downloadClient", DownloadClientTask.class);
        project.getTasks().create("downloadMappings", DownloadMappingTask.class);
        project.getTasks().create("applySpecialSource", ApplySpecialSourceTask.class);
    }

    private void println(String msg) {
        System.out.println(msg);
    }
}
