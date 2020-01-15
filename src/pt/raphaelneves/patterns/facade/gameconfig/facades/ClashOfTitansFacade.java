package pt.raphaelneves.patterns.facade.gameconfig.facades;

import pt.raphaelneves.patterns.facade.gameconfig.models.ClashOfTitans;
import pt.raphaelneves.patterns.facade.gameconfig.models.IGame;
import pt.raphaelneves.patterns.facade.gameconfig.models.settings.*;

import java.util.Arrays;

public class ClashOfTitansFacade {
    private ISettings audioSettings;
    private ISettings inputSettings;

    public void applyConfigurations() {
        audioSettings = new AudioSettings(72.3, 50, 3);
        ISettings joystickSettings = new JoystickSettings("Touch screen joystick");
        ISettings keyboardSettings = new KeyboardSettings("Touch keyboard");
        inputSettings = new InputSettings(joystickSettings, keyboardSettings);
    }

    public void initialize() {
        IGame game = new ClashOfTitans(Arrays.asList(audioSettings, inputSettings));
        game.play();
    }


}
