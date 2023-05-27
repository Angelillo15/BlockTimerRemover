package es.angelillo15.btr;

import es.angelillo15.btr.api.BTRInstance;
import es.angelillo15.btr.api.ILogger;
import org.bukkit.plugin.java.JavaPlugin;

public class BlockTtimerRemover extends JavaPlugin implements BTRInstance {
    @Override
    public ILogger getPLogger() {
        return null;
    }

    @Override
    public boolean isDebug() {
        return false;
    }

    @Override
    public void setDebug(boolean debug) {

    }

    @Override
    public void drawLogo() {

    }

    @Override
    public void loadConfig() {

    }

    @Override
    public void registerCommands() {

    }

    @Override
    public void registerListeners() {

    }

    @Override
    public void unregisterCommands() {

    }

    @Override
    public void unregisterListeners() {

    }

    @Override
    public void reload() {

    }
}
