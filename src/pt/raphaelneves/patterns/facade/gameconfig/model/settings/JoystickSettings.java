package pt.raphaelneves.patterns.facade.gameconfig.model.settings;

public class JoystickSettings implements ISettings {
    private String someSetting;

    public JoystickSettings(String someSetting) {
        this.someSetting = someSetting;
    }

    public String getSomeSetting() {
        return someSetting;
    }

    @Override
    public void expose() {
        System.out.println("Joystick Settings:");
        System.out.println(String.format("Some Setting: %s", getSomeSetting()));
    }
}
