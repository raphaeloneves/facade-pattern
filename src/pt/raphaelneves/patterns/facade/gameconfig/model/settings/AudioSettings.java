package pt.raphaelneves.patterns.facade.gameconfig.model.settings;

public class AudioSettings implements ISettings {

    private Double frequency;
    private Integer volume;
    private Integer channel;

    public AudioSettings(double frequency, int volume, int channel) {
        this.frequency = frequency;
        this.volume = volume;
        this.channel = channel;
    }

    public AudioSettings() {
    }

    public Double getFrequency() {
        return frequency;
    }

    public Integer getVolume() {
        return volume;
    }

    public Integer getChannel() {
        return channel;
    }

    @Override
    public void expose() {
        System.out.println("Audio Settings:");
        System.out.println(String.format("Frequency: %s", getFrequency().toString()));
        System.out.println(String.format("Volume: %d", getVolume()));
        System.out.println(String.format("Channel: %d", getChannel()));
    }
}
