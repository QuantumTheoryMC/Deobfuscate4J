package net.pizzacrust.deobfmc;

public class DeobfMCExtension {
    private String srgLocation = null; // relative, file
    private String inJar = null; // relative, file
    private String outJarName = null; // relative, string

    private String downloadSrgLocation = null; // link to srg
    private String downloadInJar = null; // link to in jar

    public String getInJar() {
        return inJar;
    }

    public String getOutJarName() {
        return outJarName;
    }

    public String getSrgLocation() {
        return srgLocation;
    }

    public void setInJar(String inJar) {
        this.inJar = inJar;
    }

    public void setOutJarName(String outJar) {
        this.outJarName = outJar;
    }

    public void setSrgLocation(String srgLocation) {
        this.srgLocation = srgLocation;
    }

    public String getDownloadInJar() {
        return downloadInJar;
    }

    public String getDownloadSrgLocation() {
        return downloadSrgLocation;
    }

    public void setDownloadInJar(String downloadInJar) {
        this.downloadInJar = downloadInJar;
    }

    public void setDownloadSrgLocation(String downloadSrgLocation) {
        this.downloadSrgLocation = downloadSrgLocation;
    }
}
