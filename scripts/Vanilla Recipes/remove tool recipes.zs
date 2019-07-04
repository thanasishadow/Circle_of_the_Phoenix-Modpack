import crafttweaker.item.IItemStack;

val tools = [
<minecraft:stone_pickaxe>,
<minecraft:stone_axe>,
<minecraft:stone_sword>,
<minecraft:stone_shovel>,
<minecraft:stone_hoe>,
<minecraft:iron_pickaxe>,
<minecraft:iron_axe>,
<minecraft:iron_sword>,
<minecraft:iron_shovel>,
<minecraft:iron_hoe>,
<minecraft:golden_pickaxe>,
<minecraft:golden_axe>,
<minecraft:golden_sword>,
<minecraft:golden_shovel>,
<minecraft:golden_hoe>,
<minecraft:diamond_pickaxe>,
<minecraft:diamond_axe>,
<minecraft:diamond_sword>,
<minecraft:diamond_shovel>,
<minecraft:diamond_hoe>,
<thermalfoundation:tool.pickaxe_copper>,
<thermalfoundation:tool.axe_copper>,
<thermalfoundation:tool.sword_copper>,
<thermalfoundation:tool.shovel_copper>,
<thermalfoundation:tool.hoe_copper>,
<thermalfoundation:tool.pickaxe_bronze>,
<thermalfoundation:tool.axe_bronze>,
<thermalfoundation:tool.sword_bronze>,
<thermalfoundation:tool.shovel_bronze>,
<thermalfoundation:tool.hoe_bronze>,
<thermalfoundation:tool.pickaxe_platinum>,
<thermalfoundation:tool.axe_platinum>,
<thermalfoundation:tool.sword_platinum>,
<thermalfoundation:tool.shovel_platinum>,
<thermalfoundation:tool.hoe_platinum>,
<botania:manasteelpick>,
<botania:manasteelaxe>,
<botania:manasteelsword>,
<botania:manasteelshovel>,
<botania:elementiumpick>,
<botania:elementiumaxe>,
<botania:elementiumsword>,
<botania:elementiumshovel>,
<botania:terrapick>,
<botania:terraaxe>,
<botania:terrasword>
] as IItemStack[];



for i, item in tools {
    recipes.removeShaped(item);
}