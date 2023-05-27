package es.angelillo15.btr;

import es.angelillo15.btr.api.BTRInstance;
import es.angelillo15.btr.api.Constants;
import es.angelillo15.btr.api.ILogger;
import es.angelillo15.btr.api.TextUtils;
import es.angelillo15.btr.api.config.ConfigLoader;
import es.angelillo15.btr.utils.BukkitLogger;
import lombok.Getter;
import org.bukkit.plugin.java.JavaPlugin;

public class BlockTimerRemover extends JavaPlugin implements BTRInstance {
    @Getter
    private static BlockTimerRemover instance;
    private static ILogger pLogger;
    private boolean debug = false;

    public BlockTimerRemover() {
        instance = this;
    }

    @Override
    public ILogger getPLogger() {
        return pLogger;
    }

    @Override
    public boolean isDebug() {
        return debug;
    }

    @Override
    public void setDebug(boolean debug) {
        this.debug = debug;
    }

    @Override
    public void drawLogo() {
        pLogger = new BukkitLogger(this.getLogger());
        pLogger.info(TextUtils.simpleColorize("&c▄▄▄▄· ▄▄▄▄▄▄▄▄  "));
        pLogger.info(TextUtils.simpleColorize("&c▐█ ▀█▪•██  ▀▄ █·"));
        pLogger.info(TextUtils.simpleColorize("&c▐█▀▀█▄ ▐█.▪▐▀▀▄ "));
        pLogger.info(TextUtils.simpleColorize("&c██▄▪▐█ ▐█▌·▐█•█▌"));
        pLogger.info(TextUtils.simpleColorize("&c·▀▀▀▀  ▀▀▀ .▀  ▀"));
        pLogger.info("BlockTimerRemover v" + Constants.VERSION + " by angelillo15");
    }

    @Override
    public void loadConfig() {
        new ConfigLoader().load();
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
