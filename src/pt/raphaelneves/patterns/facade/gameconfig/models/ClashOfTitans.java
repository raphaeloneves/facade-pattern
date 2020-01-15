package pt.raphaelneves.patterns.facade.gameconfig.models;

import pt.raphaelneves.patterns.facade.gameconfig.models.settings.ISettings;

import java.util.List;

public class ClashOfTitans implements IGame {
    List<ISettings> settings;

    public ClashOfTitans(List<ISettings> settings) {
        this.settings = settings;
    }

    public ClashOfTitans() {
    }

    public List<ISettings> getSettings() {
        return settings;
    }

    public void setSettings(List<ISettings> settings) {
        this.settings = settings;
    }


    @Override
    public void play() {
        System.out.println("Starting Clash of Titans....");
        System.out.println("Loading configurations....");
        settings.forEach(ISettings::expose);
    }
}
