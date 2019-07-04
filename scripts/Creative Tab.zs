#priority 1000
#loader contenttweaker
import mods.contenttweaker.CreativeTab;
import mods.contenttweaker.VanillaFactory;

val bewitchedWorldTab = VanillaFactory.createCreativeTab("BewitchedWorld", <item:contenttweaker:enchanted_lapis>);
bewitchedWorldTab.setBackgroundImageName("items.png");
bewitchedWorldTab.register();