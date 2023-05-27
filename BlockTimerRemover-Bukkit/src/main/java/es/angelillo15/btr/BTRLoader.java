package es.angelillo15.btr;

import es.angelillo15.btr.api.utils.Metrics;
import io.papermc.lib.PaperLib;

public class BTRLoader extends BlockTtimerRemover {
    @Override
    public void onEnable() {
        drawLogo();
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
