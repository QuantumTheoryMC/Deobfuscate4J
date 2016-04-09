package qtmc.lib.deobfuscate.tasks;

import org.gradle.api.DefaultTask;

public class SetupContributionWorkspace extends DefaultTask {
    public SetupContributionWorkspace() {
        this.dependsOn("applySpecialSource");
        this.setGroup("deobfuscate4j");
    }
}
