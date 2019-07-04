#priority 99
#loader contenttweaker

import mods.contenttweaker.VanillaFactory;
import mods.contenttweaker.Block;
import mods.contenttweaker.Fluid;
import crafttweaker.item.IItemStack;
import mods.contenttweaker.Item;




var historyOre = VanillaFactory.createBlock("history_ore", <blockmaterial:rock>);
historyOre.setBlockSoundType(<soundtype:stone>);
historyOre.setBlockHardness(5.0);
historyOre.setBlockResistance(3.0);
historyOre.setToolLevel(2);
historyOre.setLightValue(0);
historyOre.setToolClass("pickaxe");
historyOre.setCreativeTab(<creativetab:BewitchedWorld>);
historyOre.setDropHandler(function(drops, world, position, state, fortune) {
	drops.clear();
	
	drops.add(<item:loreexpansion:lore_scrap>.withTag({lore: {id: "Freyja1", category: "global"}}) % 1);
	drops.add(<item:loreexpansion:lore_scrap>.withTag({lore: {id: "Freyja2", category: "global"}}) % 1);
	drops.add(<item:loreexpansion:lore_scrap>.withTag({lore: {id: "Freyja3", category: "global"}}) % 1);
	drops.add(<item:loreexpansion:lore_scrap>.withTag({lore: {id: "Freyja4", category: "global"}}) % 1);
	drops.add(<item:loreexpansion:lore_scrap>.withTag({lore: {id: "Freyja5", category: "global"}}) % 1);
	drops.add(<item:loreexpansion:lore_scrap>.withTag({lore: {id: "Freyja6", category: "global"}}) % 1);
	drops.add(<item:loreexpansion:lore_scrap>.withTag({lore: {id: "Nicolas1", category: "global"}}) % 1);
	drops.add(<item:loreexpansion:lore_scrap>.withTag({lore: {id: "Nicolas2", category: "global"}}) % 1);
	drops.add(<item:loreexpansion:lore_scrap>.withTag({lore: {id: "Nicolas3", category: "global"}}) % 1);
	drops.add(<item:loreexpansion:lore_scrap>.withTag({lore: {id: "Nicolas4", category: "global"}}) % 1);
	drops.add(<item:loreexpansion:lore_scrap>.withTag({lore: {id: "Nicolas5", category: "global"}}) % 1);
	drops.add(<item:loreexpansion:lore_scrap>.withTag({lore: {id: "Nicolas6", category: "global"}}) % 1);
	drops.add(<item:loreexpansion:lore_scrap>.withTag({lore: {id: "Pyrrha1", category: "global"}}) % 1);
	drops.add(<item:loreexpansion:lore_scrap>.withTag({lore: {id: "Pyrrha2", category: "global"}}) % 1);
	drops.add(<item:loreexpansion:lore_scrap>.withTag({lore: {id: "Pyrrha3", category: "global"}}) % 1);
	drops.add(<item:loreexpansion:lore_scrap>.withTag({lore: {id: "Pyrrha4", category: "global"}}) % 1);
	drops.add(<item:loreexpansion:lore_scrap>.withTag({lore: {id: "Pyrrha5", category: "global"}}) % 1);
	drops.add(<item:loreexpansion:lore_scrap>.withTag({lore: {id: "Pyrrha6", category: "global"}}) % 1);
	drops.add(<item:loreexpansion:lore_scrap>.withTag({lore: {id: "Alphrabius1", category: "global"}}) % 1);
	drops.add(<item:loreexpansion:lore_scrap>.withTag({lore: {id: "Alphrabius2", category: "global"}}) % 1);
	drops.add(<item:loreexpansion:lore_scrap>.withTag({lore: {id: "Alphrabius3", category: "global"}}) % 1);
	drops.add(<item:loreexpansion:lore_scrap>.withTag({lore: {id: "Alphrabius4", category: "global"}}) % 1);
	drops.add(<item:loreexpansion:lore_scrap>.withTag({lore: {id: "Alphrabius5", category: "global"}}) % 1);
	drops.add(<item:loreexpansion:lore_scrap>.withTag({lore: {id: "Alphrabius6", category: "global"}}) % 1);
	drops.add(<item:loreexpansion:lore_scrap>.withTag({lore: {id: "Tlachtga1", category: "global"}}) % 1);
	drops.add(<item:loreexpansion:lore_scrap>.withTag({lore: {id: "Tlachtga2", category: "global"}}) % 1);
	drops.add(<item:loreexpansion:lore_scrap>.withTag({lore: {id: "Tlachtga3", category: "global"}}) % 1);
	drops.add(<item:loreexpansion:lore_scrap>.withTag({lore: {id: "Tlachtga4", category: "global"}}) % 1);
	drops.add(<item:loreexpansion:lore_scrap>.withTag({lore: {id: "Tlachtga5", category: "global"}}) % 1);
	drops.add(<item:loreexpansion:lore_scrap>.withTag({lore: {id: "Tlachtga6", category: "global"}}) % 1);
	drops.add(<item:loreexpansion:lore_scrap>.withTag({lore: {id: "Galen1", category: "global"}}) % 1);
	drops.add(<item:loreexpansion:lore_scrap>.withTag({lore: {id: "Galen2", category: "global"}}) % 1);
	drops.add(<item:loreexpansion:lore_scrap>.withTag({lore: {id: "Galen3", category: "global"}}) % 1);
	drops.add(<item:loreexpansion:lore_scrap>.withTag({lore: {id: "Galen4", category: "global"}}) % 1);
	drops.add(<item:loreexpansion:lore_scrap>.withTag({lore: {id: "Galen5", category: "global"}}) % 1);
	drops.add(<item:loreexpansion:lore_scrap>.withTag({lore: {id: "Galen6", category: "global"}}) % 1);
	drops.add(<item:loreexpansion:lore_scrap>.withTag({lore: {id: "Eudemus1", category: "global"}}) % 1);
	drops.add(<item:loreexpansion:lore_scrap>.withTag({lore: {id: "Eudemus2", category: "global"}}) % 1);
	drops.add(<item:loreexpansion:lore_scrap>.withTag({lore: {id: "Eudemus3", category: "global"}}) % 1);
	drops.add(<item:loreexpansion:lore_scrap>.withTag({lore: {id: "Eudemus4", category: "global"}}) % 1);
	drops.add(<item:loreexpansion:lore_scrap>.withTag({lore: {id: "Eudemus5", category: "global"}}) % 1);
	drops.add(<item:loreexpansion:lore_scrap>.withTag({lore: {id: "Eudemus6", category: "global"}}) % 1);
	drops.add(<item:loreexpansion:lore_scrap>.withTag({lore: {id: "Volphisto1", category: "global"}}) % 1);
	drops.add(<item:loreexpansion:lore_scrap>.withTag({lore: {id: "Volphisto2", category: "global"}}) % 1);
	drops.add(<item:loreexpansion:lore_scrap>.withTag({lore: {id: "Volphisto3", category: "global"}}) % 1);
	drops.add(<item:loreexpansion:lore_scrap>.withTag({lore: {id: "Volphisto4", category: "global"}}) % 1);
	drops.add(<item:loreexpansion:lore_scrap>.withTag({lore: {id: "Volphisto5", category: "global"}}) % 1);
	drops.add(<item:loreexpansion:lore_scrap>.withTag({lore: {id: "Volphisto6", category: "global"}}) % 1);
	drops.add(<item:loreexpansion:lore_scrap>.withTag({lore: {id: "PhoenixRitual", category: "global"}}) % 1);
	
    return;
});
historyOre.register();

