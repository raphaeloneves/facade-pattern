package pt.raphaelneves.patterns.facade.gameconfig;

import pt.raphaelneves.patterns.facade.gameconfig.models.CandyCrush;
import pt.raphaelneves.patterns.facade.gameconfig.models.IGame;
import pt.raphaelneves.patterns.facade.gameconfig.models.settings.*;

import java.util.ArrayList;
import java.util.List;

public class ClientWithNoFacade {
    public static void main(String[] args) {
        List<ISettings> settings = new ArrayList<>();

        ISettings videoSettings = new VideoSettings("1280x720", "RGB");
        ISettings audioSettings = new AudioSettings(60.0, 88, 10);
        ISettings joystickSettings = new JoystickSettings("I'm a joystick");
        ISettings keyboardSettings = new KeyboardSettings("I'm a keyboard");
        ISettings inputSettings = new InputSettings(joystickSettings, keyboardSettings);

        settings.add(videoSettings);
        settings.add(audioSettings);
        settings.add(inputSettings);

        IGame game = new CandyCrush(settings);
        game.play();
    }
}
