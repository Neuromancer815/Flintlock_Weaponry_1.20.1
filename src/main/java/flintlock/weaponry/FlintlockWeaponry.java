package flintlock.weaponry;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FlintlockWeaponry implements ModInitializer {
	public static final String MOD_ID = "flintlock-weaponry";
    public static final Logger LOGGER = LoggerFactory.getLogger("flintlock-weaponry");

	@Override
	public void onInitialize() {

		LOGGER.info("Hello Fabric world!");
	}
}