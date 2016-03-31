package qtmc.lib.deobfuscate.tasks;

import net.md_5.specialsource.SpecialSource;
import org.apache.commons.io.FileUtils;
import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;
import qtmc.lib.deobfuscate.DeobfMCExtension;

import java.io.File;

public class ReverseSpecialSource extends DefaultTask {
    @TaskAction
    public void doTask() {
        File finalJar = new File(CheckDestinationTask.destination, getProject().getExtensions().getByType(DeobfMCExtension.class).getOutJarName());
        if (!finalJar.exists()) {
            throw new RuntimeException("SpecialSource hasn't been applied yet!");
        } else {
            System.gc();
            finalJar.delete();
        }
        try {
            FileUtils.copyFile(DownloadClientTask.clientJar, finalJar);
            String[] args = new String[] { "--quiet", "--reverse", "--srg-in", DownloadMappingTask.mappings.getAbsolutePath(), "--in-jar", DownloadClientTask.clientJar.getAbsolutePath(), "--out-jar", finalJar.getAbsolutePath()};
            SpecialSource.main(args);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
