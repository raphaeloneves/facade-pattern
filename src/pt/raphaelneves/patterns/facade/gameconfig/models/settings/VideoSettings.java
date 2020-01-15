package pt.raphaelneves.patterns.facade.gameconfig.models.settings;

public class VideoSettings implements ISettings {
    private String resolution;
    private String colors;

    public VideoSettings(String resolution, String colors) {
        this.resolution = resolution;
        this.colors = colors;
    }

    public VideoSettings() {
    }

    public String getResolution() {
        return resolution;
    }

    public String getColors() {
        return colors;
    }

    @Override
    public void expose() {
        System.out.println("Video Settings:");
        System.out.println(String.format("Resolution: %s", getResolution()));
        System.out.println(String.format("Colors: %s", getColors()));
    }
}
