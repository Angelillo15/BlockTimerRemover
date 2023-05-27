package es.angelillo15.btr.api;

import org.bukkit.Bukkit;

public interface BTRInstance {
    int version = Integer.parseInt(Bukkit.getBukkitVersion().split("-")[0].split("\\.")[1]);
    static int version() {
        return version;
    }
    static BTRInstance getInstance() {
        return (BTRInstance) Bukkit.getPluginManager().getPlugin("BlockTimerRemover");
    }

    static ILogger getLogger() {
        return getInstance().getPLogger();
    }

    ILogger getPLogger();
    boolean isDebug();
    void setDebug(boolean debug);
    void drawLogo();
    void loadConfig();
    void registerCommands();
    void registerListeners();
    void unregisterCommands();
    void unregisterListeners();
    void reload();
}
