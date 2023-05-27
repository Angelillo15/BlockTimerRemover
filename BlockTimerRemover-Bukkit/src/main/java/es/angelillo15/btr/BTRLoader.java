package es.angelillo15.btr;

import es.angelillo15.btr.api.utils.Metrics;
import es.angelillo15.btr.utils.LibsLoader;
import io.papermc.lib.PaperLib;

public class BTRLoader extends BlockTimerRemover {
    @Override
    public void onEnable() {
        drawLogo();
        LibsLoader.load();
        loadConfig();
        registerCommands();
        registerListeners();
        PaperLib.suggestPaper(this);
        new Metrics(this, 18583);
    }

    @Override
    public void onDisable() {
        unregisterCommands();
        unregisterListeners();
    }
}
