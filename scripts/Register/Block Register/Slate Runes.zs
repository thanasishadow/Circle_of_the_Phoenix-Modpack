#priority 99
#loader contenttweaker

import mods.contenttweaker.VanillaFactory;
import mods.contenttweaker.Block;

//VANILLA
var upgradeRuneIron = VanillaFactory.createBlock("upgrade_rune_iron", <blockmaterial:Iron>);
upgradeRuneIron.setBlockHardness(4);
upgradeRuneIron.setBlockResistance(20);
upgradeRuneIron.setToolLevel(1);
upgradeRuneIron.setLightValue(5);
upgradeRuneIron.setToolClass("pickaxe");
upgradeRuneIron.setCreativeTab(<creativetab:BewitchedWorld>);
upgradeRuneIron.register();

var upgradeRuneGold = VanillaFactory.createBlock("upgrade_rune_gold", <blockmaterial:Iron>);
upgradeRuneGold.setBlockHardness(4);
upgradeRuneGold.setBlockResistance(20);
upgradeRuneGold.setToolLevel(1);
upgradeRuneGold.setLightValue(5);
upgradeRuneGold.setToolClass("pickaxe");
upgradeRuneGold.setCreativeTab(<creativetab:BewitchedWorld>);
upgradeRuneGold.register();

var upgradeRuneDiamond = VanillaFactory.createBlock("upgrade_rune_diamond", <blockmaterial:Iron>);
upgradeRuneDiamond.setBlockHardness(4);
upgradeRuneDiamond.setBlockResistance(20);
upgradeRuneDiamond.setToolLevel(1);
upgradeRuneDiamond.setLightValue(5);
upgradeRuneDiamond.setToolClass("pickaxe");
upgradeRuneDiamond.setCreativeTab(<creativetab:BewitchedWorld>);
upgradeRuneDiamond.register();


//THERMAL FOUNDATION METALS
var upgradeRuneCopper = VanillaFactory.createBlock("upgrade_rune_copper", <blockmaterial:Iron>);
upgradeRuneCopper.setBlockHardness(4);
upgradeRuneCopper.setBlockResistance(20);
upgradeRuneCopper.setToolLevel(1);
upgradeRuneCopper.setLightValue(5);
upgradeRuneCopper.setToolClass("pickaxe");
upgradeRuneCopper.setCreativeTab(<creativetab:BewitchedWorld>);
upgradeRuneCopper.register();

var upgradeRuneBronze = VanillaFactory.createBlock("upgrade_rune_bronze", <blockmaterial:Iron>);
upgradeRuneBronze.setBlockHardness(4);
upgradeRuneBronze.setBlockResistance(20);
upgradeRuneBronze.setToolLevel(1);
upgradeRuneBronze.setLightValue(5);
upgradeRuneBronze.setToolClass("pickaxe");
upgradeRuneBronze.setCreativeTab(<creativetab:BewitchedWorld>);
upgradeRuneBronze.register();

var upgradeRunePlatinum = VanillaFactory.createBlock("upgrade_rune_platinum", <blockmaterial:Iron>);
upgradeRunePlatinum.setBlockHardness(4);
upgradeRunePlatinum.setBlockResistance(20);
upgradeRunePlatinum.setToolLevel(1);
upgradeRunePlatinum.setLightValue(5);
upgradeRunePlatinum.setToolClass("pickaxe");
upgradeRunePlatinum.setCreativeTab(<creativetab:BewitchedWorld>);
upgradeRunePlatinum.register();


//BOTANIA METALS
var upgradeRuneManasteel = VanillaFactory.createBlock("upgrade_rune_manasteel", <blockmaterial:Iron>);
upgradeRuneManasteel.setBlockHardness(4);
upgradeRuneManasteel.setBlockResistance(20);
upgradeRuneManasteel.setToolLevel(1);
upgradeRuneManasteel.setLightValue(5);
upgradeRuneManasteel.setToolClass("pickaxe");
upgradeRuneManasteel.setCreativeTab(<creativetab:BewitchedWorld>);
upgradeRuneManasteel.register();

var upgradeRuneTerrasteel = VanillaFactory.createBlock("upgrade_rune_terrasteel", <blockmaterial:Iron>);
upgradeRuneTerrasteel.setBlockHardness(4);
upgradeRuneTerrasteel.setBlockResistance(20);
upgradeRuneTerrasteel.setToolLevel(1);
upgradeRuneTerrasteel.setLightValue(5);
upgradeRuneTerrasteel.setToolClass("pickaxe");
upgradeRuneTerrasteel.setCreativeTab(<creativetab:BewitchedWorld>);
upgradeRuneTerrasteel.register();

var upgradeRuneElementium = VanillaFactory.createBlock("upgrade_rune_elementium", <blockmaterial:Iron>);
upgradeRuneElementium.setBlockHardness(4);
upgradeRuneElementium.setBlockResistance(20);
upgradeRuneElementium.setToolLevel(1);
upgradeRuneElementium.setLightValue(5);
upgradeRuneElementium.setToolClass("pickaxe");
upgradeRuneElementium.setCreativeTab(<creativetab:BewitchedWorld>);
upgradeRuneElementium.register();

//SPELLREADY RUNE
var SpellreadyRune = VanillaFactory.createBlock("spellready_rune", <blockmaterial:Iron>);
SpellreadyRune.setBlockHardness(5);
SpellreadyRune.setBlockResistance(100);
SpellreadyRune.setToolLevel(3);
SpellreadyRune.setLightValue(1);
SpellreadyRune.setToolClass("pickaxe");
SpellreadyRune.setCreativeTab(<creativetab:BewitchedWorld>);
SpellreadyRune.register();

//HELLFIRE RUNE
var HellfireRune = VanillaFactory.createBlock("hellfire_rune", <blockmaterial:Rock>);
HellfireRune.setBlockHardness(5);
HellfireRune.setBlockResistance(100);
HellfireRune.setToolLevel(2);
HellfireRune.setLightValue(4);
HellfireRune.setToolClass("pickaxe");
HellfireRune.setCreativeTab(<creativetab:BewitchedWorld>);
HellfireRune.register();