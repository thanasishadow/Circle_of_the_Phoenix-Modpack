#loader contenttweaker
import mods.contenttweaker.MaterialSystem;
import mods.contenttweaker.Material;
import mods.contenttweaker.MaterialBuilder;
import mods.contenttweaker.Color;

var Lapis = MaterialSystem.getMaterialBuilder().setName("Lapis").setColor(1393356).build();
var Redstone = MaterialSystem.getMaterialBuilder().setName("Redstone").setColor(11142148).build();
var Gold = MaterialSystem.getMaterialBuilder().setName("Gold").setColor(16576075).build();
var Emerald = MaterialSystem.getMaterialBuilder().setName("Emerald").setColor(1564002).build();
var Diamond = MaterialSystem.getMaterialBuilder().setName("Red Diamond").setColor(16721446).build();
var Galena = MaterialSystem.getMaterialBuilder().setName("Galena").setColor(9472935).build();
var Copper = MaterialSystem.getMaterialBuilder().setName("Copper").setColor(8691748).build();
var Tin = MaterialSystem.getMaterialBuilder().setName("Tin").setColor(12829635).build();
var Platinum = MaterialSystem.getMaterialBuilder().setName("Platinum").setColor(16576992).build();

 var materials_list = [Lapis, Redstone, Gold, Emerald, Diamond, Galena, Copper, Tin, Platinum] as Material[];
 var ore_types = ["ore"] as string[];

 
for i, materials in materials_list {

    var ores = materials.registerParts(ore_types);
    for i, ore in ores {
        var oreData = ore.getData();
        ore.setColorized(false);
        oreData.addDataValue("variants", "minecraft:netherrack");
        oreData.addDataValue("hardness", "5");
        oreData.addDataValue("resistance", "15");
        oreData.addDataValue("harvestTool", "pickaxe");
        oreData.addDataValue("harvestLevel", "3");
    }
}