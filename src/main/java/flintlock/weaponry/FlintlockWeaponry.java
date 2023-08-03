package flintlock.weaponry;

import flintlock.weaponry.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FlintlockWeaponry implements ModInitializer {
	public static final String MOD_ID = "flintlock-weaponry";
    public static final Logger LOGGER = LoggerFactory.getLogger("flintlock-weaponry");

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
	}
}