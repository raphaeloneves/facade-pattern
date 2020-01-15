package pt.raphaelneves.patterns.facade.gameconfig;

import pt.raphaelneves.patterns.facade.gameconfig.facades.CandyCrushFacade;
import pt.raphaelneves.patterns.facade.gameconfig.facades.ClashOfTitansFacade;

public class ClientUsingFacade {
    public static void main(String[] args) {
        CandyCrushFacade candyCrushFacade = new CandyCrushFacade();
        candyCrushFacade.applyConfigurations();
        candyCrushFacade.initialize();

        ClashOfTitansFacade clashOfTitansFacade = new ClashOfTitansFacade();
        clashOfTitansFacade.applyConfigurations();
        clashOfTitansFacade.initialize();
    }
}
