import crafttweaker.item.IItemStack;
import crafttweaker.oredict.IOreDictEntry;
val ingot = [<ore:stickWood>,
 <ore:stone>,
 <ore:ingotIron>,
 <ore:ingotGold>,
 <ore:gemDiamond>,
 <ore:gemEmerald>, 
 <ore:ingotCopper>,
 <ore:ingotTin>,
 <ore:ingotSilver>,
 <ore:ingotLead>,
 <ore:ingotAluminum>,
 <ore:ingotNickel>,
 <ore:ingotPlatinum>,
 <ore:ingotIridium>,
 <ore:ingotMithril>,
 <ore:ingotSteel>,
 <ore:ingotElectrum>,
 <ore:ingotInvar>,
 <ore:ingotBronze>,
 <ore:ingotConstantan>,
 <ore:ingotSignalum>,
 <ore:ingotLumium>,
 <ore:ingotEnderium>] as IOreDictEntry[];
 
val gear = [<thermalfoundation:material:22>,
 <thermalfoundation:material:23>,
 <thermalfoundation:material:24>,
 <thermalfoundation:material:25>,
 <thermalfoundation:material:26>,
 <thermalfoundation:material:27>,
 <thermalfoundation:material:256>, 
 <thermalfoundation:material:257>, 
 <thermalfoundation:material:258>,
 <thermalfoundation:material:259>, 
 <thermalfoundation:material:260>, 
 <thermalfoundation:material:261>, 
 <thermalfoundation:material:262>, 
 <thermalfoundation:material:263>,
 <thermalfoundation:material:264>,
 <thermalfoundation:material:288>,
 <thermalfoundation:material:289>,
 <thermalfoundation:material:290>,
 <thermalfoundation:material:291>,
 <thermalfoundation:material:292>,
 <thermalfoundation:material:293>,
 <thermalfoundation:material:294>,
 <thermalfoundation:material:295>] as IItemStack[];


for i, item in gear {

mods.pedestalcrafting.Pedestal.addRecipe(item, 100, <inspirations:materials:8>, [ingot[i], ingot[i], ingot[i], ingot[i]], [["smoke", "50"]], [["smoke", "10"]], [["smoke", "30"]]);

}