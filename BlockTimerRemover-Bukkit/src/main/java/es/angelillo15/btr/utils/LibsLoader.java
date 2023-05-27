package es.angelillo15.btr.utils;

import es.angelillo15.btr.BlockTimerRemover;
import es.angelillo15.btr.api.libs.LibsManager;
import net.byteflux.libby.BukkitLibraryManager;

public class LibsLoader {
    public static void load() {
        BukkitLibraryManager manager = new BukkitLibraryManager(BlockTimerRemover.getInstance());

        manager.addMavenCentral();
        manager.addJitPack();
        manager.addSonatype();

        LibsManager.load();
        LibsManager.getLibs().forEach(manager::loadLibrary);
    }
}
