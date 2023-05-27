package es.angelillo15.btr.api.config;

import es.angelillo15.btr.api.BTRInstance;
import es.angelillo15.btr.api.ILogger;
import es.angelillo15.configmanager.ConfigManager;
import lombok.Getter;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

public class ConfigLoader {
    private final JavaPlugin plugin = (JavaPlugin) BTRInstance.getInstance();
    @Getter
    private static ConfigManager config;

    public void load() {
        ILogger logger = BTRInstance.getInstance().getPLogger();
        loadConfig();
        logger.debug("Loaded config");
    }

    public void loadConfig() {
        ConfigMerge.merge(new File(plugin.getDataFolder().toPath().toString() + File.separator + "config.yml"),
                plugin.getResource("Bukkit/config.yml")
        );

        config = new ConfigManager(plugin.getDataFolder().toPath(), "Bukkit/config.yml", "config.yml");
        config.registerConfig();

        BTRInstance.getInstance().setDebug(config.getConfig().getBoolean("Config.debug"));
    }
}
