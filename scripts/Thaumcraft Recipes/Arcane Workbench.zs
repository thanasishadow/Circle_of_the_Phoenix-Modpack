mods.thaumcraft.ArcaneWorkbench.removeRecipe(<thaumcraft:thaumometer>);
mods.thaumcraft.ArcaneWorkbench.registerShapedRecipe("thaumometer", "FIRSTSTEPS", 20, [<aspect:aer>, <aspect:terra>, <aspect:aqua>, <aspect:ignis>, <aspect:ordo>, <aspect:perditio>], <thaumcraft:thaumometer>, [[<minecraft:potion>.withTag({Potion: "minecraft:night_vision"}), <ore:ingotGold>, <minecraft:potion>.withTag({Potion: "minecraft:night_vision"})], [<ore:ingotGold>, <ore:paneGlass>, <ore:ingotGold>], [<minecraft:potion>.withTag({Potion: "minecraft:night_vision"}), <ore:ingotGold>, <minecraft:potion>.withTag({Potion:"minecraft:night_vision"})]]);

mods.thaumcraft.ArcaneWorkbench.removeRecipe(<thaumcraft:pedestal_arcane>);
mods.thaumcraft.ArcaneWorkbench.registerShapedRecipe("arcane_pedestal", "INFUSION", 10, [], <thaumcraft:pedestal_arcane>, [[<thaumcraft:slab_arcane_stone>, <thaumcraft:slab_arcane_stone>, <thaumcraft:slab_arcane_stone>], [<thaumcraft:salis_mundus>, <pedestalcrafting:pedestal:6>, <thaumcraft:salis_mundus>], [<thaumcraft:slab_arcane_stone>, <thaumcraft:slab_arcane_stone>,<thaumcraft:slab_arcane_stone>]]);

mods.thaumcraft.ArcaneWorkbench.registerShapedRecipe("bort", "", 0, [<aspect:terra>*5, <aspect:ordo>], <simplygems:gems:9>, [[<ore:gravel>, <thermalfoundation:material:768>, <ore:gravel>], [<thermalfoundation:material:768>, <minecraft:coal_block>, <thermalfoundation:material:768>], [<ore:gravel>, <thermalfoundation:material:768>, <ore:gravel>]]);

//TINKERING
mods.thaumcraft.ArcaneWorkbench.registerShapedRecipe("crafting_station", "TINKERING", 50, [<aspect:ordo>], <tconstruct:tooltables:3>, [[<tconstruct:cast>, <minecraft:golden_pickaxe>, <tconstruct:cast>], [<minecraft:golden_axe>, <tconstruct:tooltables>, <minecraft:golden_shovel>], [<tconstruct:cast>, <minecraft:golden_sword>, <tconstruct:cast>]]);

//DRUIDRY
mods.thaumcraft.ArcaneWorkbench.registerShapedRecipe("casting_altar", "FIRSTSTEPS", 15, [<aspect:terra>*10, <aspect:praecantatio>*5, <aspect:herba>*10], <rootsclassic:altar>, [[<rootsclassic:verdantsprig>, <minecraft:red_flower>, <rootsclassic:verdantsprig>], [<bewitchment:witch_altar>, <thermalfoundation:material:25>, <bewitchment:witch_altar>], [null, <bewitchment:witch_altar>, null]]);

//HEMOMANCY
mods.thaumcraft.ArcaneWorkbench.registerShapedRecipe("blood_altar", "FIRSTSTEPS", 20, [<aspect:victus>*20], <bloodmagic:altar>, [[<evilcraft:blood_infusion_core>, <evilcraft:dark_tank:*>, <evilcraft:blood_infusion_core>],[<bewitchment:witch_altar>, <bewitchment:witch_altar>, <bewitchment:witch_altar>], [<simplygems:gems:13>, <bloodmagic:monster_soul:*>, <simplygems:gems:13>]]);
mods.thaumcraft.ArcaneWorkbench.registerShapedRecipe("soul_forge", "FIRSTSTEPS", 10, [<aspect:spiritus>*5, <aspect:fabrico>*10], <bloodmagic:soul_forge>, [[<minecraft:iron_ingot>, null, <minecraft:iron_ingot>],[<thaumcraft:stone_arcane>, <minecraft:gold_ingot>, <thaumcraft:stone_arcane>], [<thaumcraft:stone_arcane>, <minecraft:anvil>, <thaumcraft:stone_arcane>]]);

//COSMOMANCY
mods.thaumcraft.ArcaneWorkbench.registerShapedRecipe("aquamarine_ore", "FIRSTSTEPS", 1, [<aspect:ordo>, <aspect:terra>], <astralsorcery:blockcustomsandore>*4, [[<crystals:dust>.withTag({nature_type: "crystals:water"}), <ore:sand>, <crystals:dust>.withTag({nature_type: "crystals:water"})], [<ore:sand>, <contenttweaker:enchanted_lapis>, <ore:sand>], [<crystals:dust>.withTag({nature_type: "crystals:water"}), <ore:sand>, <crystals:dust>.withTag({nature_type: "crystals:water"})]]);

mods.thaumcraft.ArcaneWorkbench.registerShapedRecipe("AW_world_thread_helmet", "BASEELDRITCH", 10, [<aspect:tenebrae>*5, <aspect:alienis>*5, <aspect:praemunio>*5], <dimdoors:woven_world_thread_boots>, [[null, null, null],[<dimdoors:unravelled_fabric>, null, <dimdoors:unravelled_fabric>], [<dimdoors:unravelled_fabric>, null, <dimdoors:unravelled_fabric>]]);
mods.thaumcraft.ArcaneWorkbench.registerShapedRecipe("AW_world_thread_chestplate", "BASEELDRITCH", 10, [<aspect:tenebrae>*5, <aspect:alienis>*5, <aspect:praemunio>*5], <dimdoors:woven_world_thread_leggings>, [[<dimdoors:unravelled_fabric>, <dimdoors:unravelled_fabric>, <dimdoors:unravelled_fabric>],[<dimdoors:unravelled_fabric>, null, <dimdoors:unravelled_fabric>], [<dimdoors:unravelled_fabric>, null, <dimdoors:unravelled_fabric>]]);
mods.thaumcraft.ArcaneWorkbench.registerShapedRecipe("AW_world_thread_leggings", "BASEELDRITCH", 10, [<aspect:tenebrae>*5, <aspect:alienis>*5, <aspect:praemunio>*5], <dimdoors:woven_world_thread_chestplate>, [[<dimdoors:unravelled_fabric>, null, <dimdoors:unravelled_fabric>],[<dimdoors:unravelled_fabric>, <dimdoors:unravelled_fabric>, <dimdoors:unravelled_fabric>], [<dimdoors:unravelled_fabric>, <dimdoors:unravelled_fabric>, <dimdoors:unravelled_fabric>]]);
mods.thaumcraft.ArcaneWorkbench.registerShapedRecipe("AW_world_thread_boots", "BASEELDRITCH", 10, [<aspect:tenebrae>*5, <aspect:alienis>*5, <aspect:praemunio>*5], <dimdoors:woven_world_thread_helmet>, [[<dimdoors:unravelled_fabric>, <dimdoors:unravelled_fabric>, <dimdoors:unravelled_fabric>],[<dimdoors:unravelled_fabric>, null, <dimdoors:unravelled_fabric>], [null, null, null]]);

//WIZARDRY
mods.thaumcraft.ArcaneWorkbench.registerShapedRecipe("cape", "FIRSTSTEPS", 30, [<aspect:praecantatio>*50, <aspect:potentia>*30], <wizardry:cape>, [[<bewitchment:golden_thread>, null, <bewitchment:golden_thread>],[<chisel:wool_red:1>, <xreliquary:mob_ingredient:15>, <chisel:wool_red:1>], [<randomthings:runedust:14>, <thermalfoundation:material:1>, <randomthings:runedust:14>]]);

//BETWEENLANDS TALISMAN
mods.thaumcraft.ArcaneWorkbench.registerShapedRecipe("talisman1", "FIRSTSTEPS", 10, [<aspect:herba>*5, <aspect:tenebrae>*10], <thebetweenlands:swamp_talisman:1>, [[null, <plants2:plantball>, <twilightforest:charm_of_keeping_3>],[<thaumcraft:stone_arcane>, <tconstruct:seared:6>, <plants2:plantball>], [<thaumcraft:stone_arcane>, <thaumcraft:stone_arcane>, null]]);
mods.thaumcraft.ArcaneWorkbench.registerShapedRecipe("talisman2", "FIRSTSTEPS", 10, [<aspect:herba>*5, <aspect:tenebrae>*10], <thebetweenlands:swamp_talisman:2>, [[null, <twilightforest:fiery_ingot>, <simplygems:gems:0>],[<twilightforest:fiery_ingot>, <tconstruct:seared:6>, <twilightforest:fiery_ingot>], [<thaumcraft:stone_arcane>, <twilightforest:fiery_ingot>, null]]);
mods.thaumcraft.ArcaneWorkbench.registerShapedRecipe("talisman3", "FIRSTSTEPS", 10, [<aspect:herba>*5, <aspect:tenebrae>*10], <thebetweenlands:swamp_talisman:4>, [[null, <thaumcraft:stone_arcane>, <contenttweaker:herbal_blend>],[<twilightforest:naga_scale>, <tconstruct:seared:6>, <thaumcraft:stone_arcane>], [<simplygems:gems:11>, <twilightforest:naga_scale>, null]]);
mods.thaumcraft.ArcaneWorkbench.registerShapedRecipe("talisman4", "FIRSTSTEPS", 10, [<aspect:herba>*5, <aspect:tenebrae>*10], <thebetweenlands:swamp_talisman:3>, [[<twilightforest:steeleaf_ingot>, null, null],[<thaumcraft:stone_arcane>, <tconstruct:seared:6>, null], [<simplygems:gems:2>, <thaumcraft:stone_arcane>, <twilightforest:steeleaf_ingot>]]);

//ENCHANTMENT TABLES
mods.thaumcraft.ArcaneWorkbench.registerShapedRecipe("enchanting_table", "FIRSTSTEPS", 10, [<aspect:praecantatio>*5, <aspect:sensus>*5], <minecraft:enchanting_table>, [[<minecraft:carpet:14>, <minecraft:carpet:14>, <minecraft:carpet:14>],[<minecraft:diamond>, <contenttweaker:enchanted_lapis_block>, <minecraft:diamond>], [<ore:obsidian>, <ore:obsidian>, <ore:obsidian>]]);
mods.thaumcraft.ArcaneWorkbench.registerShapedRecipe("better_enchanting_table", "FIRSTSTEPS", 25, [<aspect:praecantatio>*10, <aspect:sensus>*10], <eplus:advanced_table>, [[<thermalfoundation:material:231>, <thermalfoundation:material:264>, <thermalfoundation:material:231>],[<thaumcraft:fabric>, <minecraft:enchanting_table>, <thaumcraft:fabric>], [<midnight:trenchstone>, <chessmod:piece>, <midnight:trenchstone>]]);
