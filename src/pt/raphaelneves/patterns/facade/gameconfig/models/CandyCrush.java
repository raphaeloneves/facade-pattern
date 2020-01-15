package pt.raphaelneves.patterns.facade.gameconfig.models;

import pt.raphaelneves.patterns.facade.gameconfig.models.settings.ISettings;

import java.util.List;

public class CandyCrush implements IGame {
    List<ISettings> settings;

    public CandyCrush(List<ISettings> settings) {
        this.settings = settings;
    }

    public CandyCrush() {
    }

    public List<ISettings> getSettings() {
        return settings;
    }

    public void setSettings(List<ISettings> settings) {
        this.settings = settings;
    }


    @Override
    public void play() {
        System.out.println("Starting Candy Crush....");
        System.out.println("Loading configurations....");
        settings.forEach(ISettings::expose);
    }
}
