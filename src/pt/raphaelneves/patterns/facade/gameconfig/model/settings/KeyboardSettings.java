package pt.raphaelneves.patterns.facade.gameconfig.model.settings;

public class KeyboardSettings implements ISettings{
    private String someSetting;

    public KeyboardSettings(String someSetting) {
        this.someSetting = someSetting;
    }

    public String getSomeSetting() {
        return someSetting;
    }

    @Override
    public void expose() {
        System.out.println("Keyboard Settings:");
        System.out.println(String.format("Some Setting: %s", getSomeSetting()));
    }
}
