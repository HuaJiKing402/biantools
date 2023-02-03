package top.biannetwork.biantools;

import net.fabricmc.api.DedicatedServerModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Server_Initialize implements DedicatedServerModInitializer {
    @Override
    public void onInitializeServer() {
        Main.LOGGER.info("Biantools-Server");
    }
}
