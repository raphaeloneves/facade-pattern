package pt.raphaelneves.patterns.facade.gameconfig.models.settings;

public class InputSettings implements ISettings {
    private ISettings joystickSettings;
    private ISettings keyboardSettings;

    public InputSettings(ISettings joystickSettings, ISettings keyboardSettings) {
        this.joystickSettings = joystickSettings;
        this.keyboardSettings = keyboardSettings;
    }

    public InputSettings() {
    }

    public ISettings getJoystickSettings() {
        return joystickSettings;
    }

    public ISettings getKeyboardSettings() {
        return keyboardSettings;
    }


    @Override
    public void expose() {
        System.out.println("Input Settings:");
        joystickSettings.expose();
        keyboardSettings.expose();
    }
}
