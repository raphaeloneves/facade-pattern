package pt.raphaelneves.patterns.facade.gameconfig.facades;

import pt.raphaelneves.patterns.facade.gameconfig.models.games.CandyCrush;
import pt.raphaelneves.patterns.facade.gameconfig.models.games.IGame;
import pt.raphaelneves.patterns.facade.gameconfig.models.settings.*;

import java.util.Arrays;

public class CandyCrushFacade {
    private ISettings audioSettings;
    private ISettings videoSettings;
    private ISettings inputSettings;

    public void applyConfigurations() {
        videoSettings = new VideoSettings("1280x720", "RGB");
        audioSettings = new AudioSettings(60.0, 88, 10);
        ISettings joystickSettings = new JoystickSettings("I'm a joystick");
        ISettings keyboardSettings = new KeyboardSettings("I'm a keyboard");
        inputSettings = new InputSettings(joystickSettings, keyboardSettings);
    }

    public void initialize() {
        IGame game = new CandyCrush(Arrays.asList(videoSettings, audioSettings, inputSettings));
        game.play();
    }


}
