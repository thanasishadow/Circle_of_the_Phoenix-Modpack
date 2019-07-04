#priority 99
#loader contenttweaker


import mods.contenttweaker.VanillaFactory;
import mods.contenttweaker.Block;

var enchantedLapisBlock = VanillaFactory.createBlock("enchanted_lapis_block", <blockmaterial:Iron>);
enchantedLapisBlock.setBlockHardness(4);
enchantedLapisBlock.setBlockResistance(16);
enchantedLapisBlock.setToolLevel(1);
enchantedLapisBlock.setLightValue(5);
enchantedLapisBlock.setCreativeTab(<creativetab:BewitchedWorld>);
enchantedLapisBlock.register();

var magicCircle = VanillaFactory.createBlock("magic_circle", <blockmaterial:sand>);
magicCircle.fullBlock = false;
magicCircle.translucent = true;
magicCircle.setBlockSoundType(<soundtype:sand>);
magicCircle.setBlockHardness(1);
magicCircle.setBlockResistance(1);
magicCircle.setToolLevel(0);
magicCircle.setLightValue(8);
magicCircle.setCreativeTab(<creativetab:BewitchedWorld>);
magicCircle.blockLayer = "TRANSLUCENT";
magicCircle.register();

var cAshBlock = VanillaFactory.createBlock("ash_block", <blockmaterial:sand>);
cAshBlock.setBlockSoundType(<soundtype:sand>);
cAshBlock.setBlockHardness(0.42);
cAshBlock.setBlockResistance(1.0);
cAshBlock.setToolLevel(0);
cAshBlock.setLightValue(0);
cAshBlock.setToolClass("shovel");
cAshBlock.setCreativeTab(<creativetab:BewitchedWorld>);
cAshBlock.setDropHandler(function(drops, world, position, state, fortune) {
	
	drops.clear();
	drops.add(<item:contenttweaker:ash> * 4);
	
    return;
});
cAshBlock.register();

var charcoalOre = VanillaFactory.createBlock("ash_charcoal_ore", <blockmaterial:rock>);
charcoalOre.setBlockSoundType(<soundtype:sand>);
charcoalOre.setBlockHardness(1.1);
charcoalOre.setBlockResistance(2.0);
charcoalOre.setToolLevel(1);
charcoalOre.setLightValue(0);
charcoalOre.setToolClass("shovel");
charcoalOre.setCreativeTab(<creativetab:BewitchedWorld>);
charcoalOre.setDropHandler(function(drops, world, position, state, fortune) {
	
	drops.clear();
	drops.add(<item:contenttweaker:ash> * 2);
	drops.add(<item:minecraft:coal:1> % 20);
	
    return;
});
charcoalOre.register();

var charredLog = VanillaFactory.createBlock("charred_log", <blockmaterial:wood>);
charredLog.fullBlock = true;
charredLog.lightOpacity = 255;
charredLog.translucent = false;
charredLog.lightValue = 0;
charredLog.blockHardness = 1.4;
charredLog.blockResistance = 2.0;
charredLog.toolClass = "axe";
charredLog.toolLevel = 0;
charredLog.blockSoundType = <soundtype:wood>;
charredLog.setDropHandler(function(drops, world, position, state, fortune) {
	
	drops.clear();
	drops.add(<item:minecraft:coal:1> * 2);
	drops.add(<item:minecraft:coal:1> % 60);
	drops.add(<item:minecraft:coal:1> % 20);
	
    return;
});
charredLog.setCreativeTab(<creativetab:BewitchedWorld>);
charredLog.register();

var ashLeaves = VanillaFactory.createBlock("ash_leaves", <blockmaterial:leaves>);
ashLeaves.fullBlock = false;
ashLeaves.lightOpacity = 10;
ashLeaves.translucent = true;
ashLeaves.lightValue = 0;
ashLeaves.blockHardness = 0.18;
ashLeaves.blockResistance = 0.1;
ashLeaves.toolClass = "sword";
ashLeaves.toolLevel = 0;
ashLeaves.blockSoundType = <soundtype:sand>;
ashLeaves.blockLayer = "TRANSLUCENT";
ashLeaves.setDropHandler(function(drops, world, position, state, fortune) {
	
	drops.clear();
	drops.add(<item:contenttweaker:ash> % 10);
	drops.add(<item:contenttweaker:ash> % 10);
	
    return;
});
ashLeaves.setCreativeTab(<creativetab:BewitchedWorld>);
ashLeaves.register();