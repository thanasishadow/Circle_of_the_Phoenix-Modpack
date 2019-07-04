#priority 100
#loader contenttweaker
import mods.contenttweaker.VanillaFactory;
import mods.contenttweaker.Item;
import mods.contenttweaker.IItemRightClick;
import mods.contenttweaker.Commands;
import mods.contenttweaker.ActionResult;
import mods.contenttweaker.MutableItemStack;

var flamablePowder = VanillaFactory.createItem("flamablepowder");
flamablePowder.setCreativeTab(<creativetab:BewitchedWorld>);
flamablePowder.register();

var enchantedLapis = VanillaFactory.createItem("enchanted_lapis");
enchantedLapis.glowing = true;
enchantedLapis.setCreativeTab(<creativetab:BewitchedWorld>);
enchantedLapis.register();

var nDullDust = VanillaFactory.createItem("not_that_dull_dust");
nDullDust.glowing = true;
nDullDust.setCreativeTab(<creativetab:BewitchedWorld>);
nDullDust.register();

var itemAsh = VanillaFactory.createItem("ash");
itemAsh.setCreativeTab(<creativetab:BewitchedWorld>);
itemAsh.register();

var philosopherStone = VanillaFactory.createItem("philosopher_stone");
philosopherStone.glowing = true;
philosopherStone.rarity = "EPIC";
philosopherStone.setCreativeTab(<creativetab:BewitchedWorld>);
philosopherStone.register();

var herbalBlend = VanillaFactory.createItem("herbal_blend");
herbalBlend.setCreativeTab(<creativetab:BewitchedWorld>);
herbalBlend.register();

var crushedFungi = VanillaFactory.createItem("crushed_fungi");
crushedFungi.setCreativeTab(<creativetab:BewitchedWorld>);
crushedFungi.register();

var skillShardDruidry = VanillaFactory.createItem("skill_shard_druidry");
skillShardDruidry.maxStackSize = 1;
skillShardDruidry.rarity = "uncommon";
skillShardDruidry.setCreativeTab(<creativetab:BewitchedWorld>);
skillShardDruidry.register();

var skillShardCosmomancy = VanillaFactory.createItem("skill_shard_cosmomancy");
skillShardCosmomancy.maxStackSize = 1;
skillShardCosmomancy.rarity = "uncommon";
skillShardCosmomancy.setCreativeTab(<creativetab:BewitchedWorld>);
skillShardCosmomancy.register();

var skillShardHemomancy = VanillaFactory.createItem("skill_shard_hemomancy");
skillShardHemomancy.maxStackSize = 1;
skillShardHemomancy.rarity = "uncommon";
skillShardHemomancy.setCreativeTab(<creativetab:BewitchedWorld>);
skillShardHemomancy.register();

var skillShardTinkering = VanillaFactory.createItem("skill_shard_tinkering");
skillShardTinkering.maxStackSize = 1;
skillShardTinkering.rarity = "uncommon";
skillShardTinkering.setCreativeTab(<creativetab:BewitchedWorld>);
skillShardTinkering.register();

var skillShardBrewing = VanillaFactory.createItem("skill_shard_brewing");
skillShardBrewing.maxStackSize = 1;
skillShardBrewing.rarity = "uncommon";
skillShardBrewing.setCreativeTab(<creativetab:BewitchedWorld>);
skillShardBrewing.register();

var skillOrbDruidry = VanillaFactory.createItem("skill_orb_druidry");
skillOrbDruidry.setCreativeTab(<creativetab:BewitchedWorld>);
skillOrbDruidry.rarity = "rare";
skillOrbDruidry.itemRightClick = function(stack, world, player, hand) {
    Commands.call("reskillable incrementskill @p compatskills:druidry", player, world);
	stack.shrink(1);
	return "Pass";
	};
skillOrbDruidry.register();

var skillOrbCosmomancy = VanillaFactory.createItem("skill_orb_cosmomancy");
skillOrbCosmomancy.setCreativeTab(<creativetab:BewitchedWorld>);
skillOrbCosmomancy.rarity = "rare";
skillOrbCosmomancy.itemRightClick = function(stack, world, player, hand) {
    Commands.call("reskillable incrementskill @p compatskills:cosmomancy", player, world);
	stack.shrink(1);
	return "Pass";
	};
skillOrbCosmomancy.register();

var skillOrbHemomancy = VanillaFactory.createItem("skill_orb_hemomancy");
skillOrbHemomancy.setCreativeTab(<creativetab:BewitchedWorld>);
skillOrbHemomancy.rarity = "rare";
skillOrbHemomancy.itemRightClick = function(stack, world, player, hand) {
    Commands.call("reskillable incrementskill @p compatskills:hemomancy", player, world);
	stack.shrink(1);
	return "Pass";
	};
skillOrbHemomancy.register();

var skillOrbTinkering = VanillaFactory.createItem("skill_orb_tinkering");
skillOrbTinkering.setCreativeTab(<creativetab:BewitchedWorld>);
skillOrbTinkering.rarity = "rare";
skillOrbTinkering.itemRightClick = function(stack, world, player, hand) {
    Commands.call("reskillable incrementskill @p compatskills:tinkering", player, world);
	stack.shrink(1);
	return "Pass";
	};
skillOrbTinkering.register();

var skillOrbBrewing = VanillaFactory.createItem("skill_orb_brewing");
skillOrbBrewing.setCreativeTab(<creativetab:BewitchedWorld>);
skillOrbBrewing.rarity = "rare";
skillOrbBrewing.itemRightClick = function(stack, world, player, hand) {
    Commands.call("reskillable incrementskill @p compatskills:brewing", player, world);
	stack.shrink(1);
	return "Pass";
	};
skillOrbBrewing.register();

var skillOrbMagic = VanillaFactory.createItem("skill_orb_magic");
skillOrbMagic.setCreativeTab(<creativetab:BewitchedWorld>);
skillOrbMagic.rarity = "rare";
skillOrbMagic.itemRightClick = function(stack, world, player, hand) {
    Commands.call("reskillable incrementskill @p reskillable:magic", player, world);
	stack.shrink(1);
	return "Pass";
	};
skillOrbMagic.register();

var chalkPowder = VanillaFactory.createItem("chalk_powder");
chalkPowder.setCreativeTab(<creativetab:BewitchedWorld>);
chalkPowder.register();

var large_circle = VanillaFactory.createItem("large_circle");
large_circle.setCreativeTab(<creativetab:BewitchedWorld>);
large_circle.register();

var large_square = VanillaFactory.createItem("large_square");
large_square.setCreativeTab(<creativetab:BewitchedWorld>);
large_square.register();

var medium_circle = VanillaFactory.createItem("medium_circle");
medium_circle.setCreativeTab(<creativetab:BewitchedWorld>);
medium_circle.register();

var small_circle = VanillaFactory.createItem("small_circle");
small_circle.setCreativeTab(<creativetab:BewitchedWorld>);
small_circle.register();

var small_square = VanillaFactory.createItem("small_square");
small_square.setCreativeTab(<creativetab:BewitchedWorld>);
small_square.register();

var small_square_with_lines = VanillaFactory.createItem("small_square_with_lines");
small_square_with_lines.setCreativeTab(<creativetab:BewitchedWorld>);
small_square_with_lines.register();

var wyvern_star = VanillaFactory.createItem("wyvern_star");
wyvern_star.setCreativeTab(<creativetab:BewitchedWorld>);
wyvern_star.register();

var logo = VanillaFactory.createItem("logo");
logo.setCreativeTab(<creativetab:BewitchedWorld>);
logo.register();

var midnightRift = VanillaFactory.createItem("midnight_rift");
midnightRift.setCreativeTab(<creativetab:BewitchedWorld>);
midnightRift.rarity = "rare";
midnightRift.itemRightClick = function(stack, world, player, hand) {
    Commands.call("summon midnight:rift", player, world);
	stack.shrink(1);
	return "Pass";
	};
midnightRift.register();