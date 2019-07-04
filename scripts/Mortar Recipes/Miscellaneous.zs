#priority 1
import mods.advancedmortars.Mortar;

//SHARDS
Mortar.addRecipe(["iron", "stone", "diamond"], <tconstruct:shard>.withTag({Material: "stone"}) * 2, 20, <tconstruct:shard>.withTag({Material: "stone"}) * 2, 0.7, [<minecraft:cobblestone> * 4]);
Mortar.addRecipe(["iron", "stone", "diamond"], <tconstruct:shard>.withTag({Material: "netherrack"}) * 2, 15, <tconstruct:shard>.withTag({Material: "netherrack"}) * 2, 0.8, [<minecraft:netherrack> * 4]);
Mortar.addRecipe(["diamond"], <tconstruct:shard>.withTag({Material: "obsidian"}), 30, <thermalfoundation:material:770>, 0.85, [<minecraft:obsidian> * 2]);
Mortar.addRecipe(["iron", "stone", "diamond"], <tconstruct:shard>.withTag({Material: "undeadwood"}) * 2, 10, [<evilcraft:undead_plank> * 2]);

//PULVERIZED COAL
Mortar.addRecipe(["iron", "stone", "diamond"], <thermalfoundation:material:768>, 15, [<minecraft:coal>, <minecraft:flint>]);
Mortar.addRecipe(["iron", "stone", "diamond"], <thermalfoundation:material:769>, 15, [<minecraft:coal:1>, <minecraft:flint>]);

//DUSTS
Mortar.addRecipe(["stone"], <contenttweaker:not_that_dull_dust> * 4, 8, [<randomthings:glowingmushroom>, <exoticbirds:eggshell>, <minecraft:ender_pearl>, <contenttweaker:ash> * 2, <minecraft:sugar>, <thermalfoundation:material:800>]);
Mortar.addRecipe(["wood"], <contenttweaker:flamablepowder>, 16, [<thermalfoundation:material:800> * 3, <minecraft:gunpowder>, <ore:treeSapling>, <thermalfoundation:material:769>]);
Mortar.addRecipe(["stone"], <contenttweaker:herbal_blend> * 3, 8, [<ore:plant> * 5, <minecraft:cactus>, <minecraft:potion:*>]);
Mortar.addRecipe(["stone"], <contenttweaker:crushed_fungi> * 3, 8, [<rustic:mooncap_mushroom>, <betternether:lucis_spore>, <inspirations:materials:4>, <minecraft:fire_charge>]);
Mortar.addRecipe(["iron", "stone", "diamond", "wood"], <contenttweaker:chalk_powder> * 3, 4, [<bewitchment:ritual_chalk_normal>]);

Mortar.addRecipe(["diamond"], <wizardry:fairy_dust> * 3, 10, [<randomthings:ingredient:5>, <thermalfoundation:material:770>, <twilightforest:torchberries>, <bewitchment:gem_powder:7>, <contenttweaker:not_that_dull_dust>, <rusticthaumaturgy:dust_tiny_blaze>, <plants2:cosmetic_5:12>]);
Mortar.addRecipe(["diamond"], <wings:fairy_dust>, 10, [<wizardry:fairy_dust>, <flying_things:phial_of_animation>, <bewitchment:belladonna>, <thermalfoundation:material:1026>, <thaumcraft:crystal_essence>.withTag({Aspects: [{amount: 1, key: "volatus"}]})]);
