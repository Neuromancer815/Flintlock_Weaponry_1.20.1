package flintlock.weaponry.item;

import flintlock.weaponry.FlintlockWeaponry;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item Pistol = registerItem("pistol", new Item(new FabricItemSettings()));
    public static final Item Rifle = registerItem("rifle", new Item(new FabricItemSettings()));
    public static final Item Ammunition = registerItem("ammunition", new Item(new FabricItemSettings()));

    private static void addItemsToCombatItemGroup(FabricItemGroupEntries entries) {
        entries.add(Pistol);
        entries.add(Rifle);
        entries.add(Ammunition);
    }
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(FlintlockWeaponry.MOD_ID,name), item);
    }
    public static void  registerModItems() {
        FlintlockWeaponry.LOGGER.info("Registering Mod Items for" + FlintlockWeaponry.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ModItems::addItemsToCombatItemGroup);
    }


}
