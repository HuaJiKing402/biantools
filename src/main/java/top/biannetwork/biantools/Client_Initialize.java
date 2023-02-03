package top.biannetwork.biantools;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class Client_Initialize implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        Main.LOGGER.info("Biantools-Client");

    }
}

