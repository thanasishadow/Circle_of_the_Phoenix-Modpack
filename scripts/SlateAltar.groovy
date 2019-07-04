package groovyScripts

import atm.bloodworkxgaming.craftgroovy.events.CGEventManager
import atm.bloodworkxgaming.craftgroovy.util.CGRandom
import atm.bloodworkxgaming.craftgroovy.util.VanillaSounds
import atm.bloodworkxgaming.craftgroovy.worldgen.CGWorldGenManager
import atm.bloodworkxgaming.craftgroovy.worldgen.worldgenTypes.FlowerWorldGenType
import atm.bloodworkxgaming.craftgroovy.wrappers.PBlock
import atm.bloodworkxgaming.craftgroovy.wrappers.PItemStack
import atm.bloodworkxgaming.craftgroovy.wrappers.PParticleTypes
import groovy.transform.Field

import static com.teamacronymcoders.contenttweaker.modules.vanilla.resources.materials.MaterialBracketHandler.getBlockMaterial
import static com.teamacronymcoders.contenttweaker.modules.vanilla.resources.sounds.SoundTypeBracketHandler.getSoundType

import de.bloodworkxgaming.groovysandboxedlauncher.annotations.GSLWhitelistMember;
import java.util.concurrent.ThreadLocalRandom;

CGEventManager.rightClickBlock {
    if (world.getBlockAt(pos, -1,0,-1).registryName == "rustic:slate_chiseled"
		&& world.getBlockAt(pos, -1,0,0).registryName == "rustic:slate_tile"
		&& world.getBlockAt(pos, -1,0,1).registryName == "rustic:slate_chiseled"
		&& world.getBlockAt(pos, 0,0,-1).registryName == "rustic:slate_tile"
        && world.getBlockAt(pos, 0,0,1).registryName == "rustic:slate_tile"
		&& world.getBlockAt(pos, 1,0,-1).registryName == "rustic:slate_chiseled"
        && world.getBlockAt(pos, 1,0,0).registryName == "rustic:slate_tile"
		&& world.getBlockAt(pos, 1,0,1).registryName == "rustic:slate_chiseled"
		&& world.getBlockAt(pos, -1,1,-1).registryName == "totemic:totem_torch"
		&& world.getBlockAt(pos, -1,1,1).registryName == "totemic:totem_torch"
		&& world.getBlockAt(pos, 1,1,-1).registryName == "totemic:totem_torch"
		&& world.getBlockAt(pos, 1,1,1).registryName == "totemic:totem_torch")
	{
		//SANDSTONE + RED DYE = 4 RED SAND
		if (world.getBlockAt(pos).registryName == "minecraft:sandstone") {
			
				if (itemStack?.identifier == "minecraft:dye:1") {
				world.spawnParticle(PParticleTypes.EXPLOSION_NORMAL, pos.x+0.5, pos.y+0.5, pos.z+0.5, 0, 0.04, 20)
				world.playRecord(pos, VanillaSounds.BLOCK_SAND_BREAK.getSoundEvent())
				world.setToAir(pos)
				player.heldMain.count--
				world.spawnItemInWorld(new PItemStack("minecraft:sand", 1) * 4, pos.add(0,1,0), 0, 0.2d, 0)
				}
		}
		//FLESH BLOCK + WHITE DYED WATER = 5 LEATHER
		else if (world.getBlockAt(pos).registryName == "thaumcraft:flesh_block") {
			
				if (itemStack?.identifier == "inspirations:dyed_bottle:15") {
				10.times{world.spawnParticle(PParticleTypes.SMOKE_LARGE, pos.x+0.5, pos.y+0.5, pos.z+0.5, 0, 0.04, 20)}
				world.playRecord(pos, VanillaSounds.ENTITY_GENERIC_SPLASH.getSoundEvent())
				world.setToAir(pos)
				player.heldMain.count--
				world.spawnItemInWorld(new PItemStack("minecraft:leather") * 5, pos.add(0,1,0), 0, 0.2d, 0)
				}
		}
		//HAY BLOCK + COAL = 5 BREAD
		else if (world.getBlockAt(pos).registryName == "minecraft:hay_block") {
			
				if (itemStack?.identifier == "minecraft:coal:0") {
				world.spawnParticle(PParticleTypes.FLAME, pos.x+0.5, pos.y+0.5, pos.z+0.5, 0, 0.04, 20)
				world.playRecord(pos, VanillaSounds.BLOCK_FIRE_AMBIENT.getSoundEvent())
				world.setToAir(pos)
				player.heldMain.count--
				world.spawnItemInWorld(new PItemStack("minecraft:bread") * 5, pos.add(0,1,0), 0, 0.2d, 0)
				}
		}
		
		
		//STONE + WOODEN TOOLS = STONE TOOLS
		else if (world.getBlockAt(pos).registryName == "minecraft:stone") {
		
				if (itemStack?.identifier == "minecraft:wooden_pickaxe:0") {
				5.times{world.spawnParticle(PParticleTypes.SMOKE_LARGE, pos.x+0.5, pos.y+0.5, pos.z+0.5, 0, 0.1, 0)}
				world.playRecord(pos, VanillaSounds.ENTITY_PLAYER_LEVELUP.getSoundEvent())
				world.setToAir(pos)
				player.heldMain.count--
				world.spawnItemInWorld(new PItemStack("minecraft:stone_pickaxe") * 1, pos.add(0,1,0), 0, 0.2d, 0)
				}
				
				else if (itemStack?.identifier == "minecraft:wooden_axe:0") {
				5.times{world.spawnParticle(PParticleTypes.SMOKE_LARGE, pos.x+0.5, pos.y+0.5, pos.z+0.5, 0, 0.1, 0)}
				world.playRecord(pos, VanillaSounds.ENTITY_PLAYER_LEVELUP.getSoundEvent())
				world.setToAir(pos)
				player.heldMain.count--
				world.spawnItemInWorld(new PItemStack("minecraft:stone_axe") * 1, pos.add(0,1,0), 0, 0.2d, 0)
				}
				
				else if (itemStack?.identifier == "minecraft:wooden_shovel:0") {
				5.times{world.spawnParticle(PParticleTypes.SMOKE_LARGE, pos.x+0.5, pos.y+0.5, pos.z+0.5, 0, 0.1, 0)}
				world.playRecord(pos, VanillaSounds.ENTITY_PLAYER_LEVELUP.getSoundEvent())
				world.setToAir(pos)
				player.heldMain.count--
				world.spawnItemInWorld(new PItemStack("minecraft:stone_shovel") * 1, pos.add(0,1,0), 0, 0.2d, 0)
				}
				
				else if (itemStack?.identifier == "minecraft:wooden_sword:0") {
				5.times{world.spawnParticle(PParticleTypes.SMOKE_LARGE, pos.x+0.5, pos.y+0.5, pos.z+0.5, 0, 0.1, 0)}
				world.playRecord(pos, VanillaSounds.ENTITY_PLAYER_LEVELUP.getSoundEvent())
				world.setToAir(pos)
				player.heldMain.count--
				world.spawnItemInWorld(new PItemStack("minecraft:stone_sword") * 1, pos.add(0,1,0), 0, 0.2d, 0)
				}
				
				else if (itemStack?.identifier == "minecraft:wooden_hoe:0") {
				5.times{world.spawnParticle(PParticleTypes.SMOKE_LARGE, pos.x+0.5, pos.y+0.5, pos.z+0.5, 0, 0.1, 0)}
				world.playRecord(pos, VanillaSounds.ENTITY_PLAYER_LEVELUP.getSoundEvent())
				world.setToAir(pos)
				player.heldMain.count--
				world.spawnItemInWorld(new PItemStack("minecraft:stone_hoe") * 1, pos.add(0,1,0), 0, 0.2d, 0)
				}
		}
		
		//IRON RUNE + STONE TOOLS = IRON TOOLS
		//IRON RUNE + BUCKET = CAULDRON
		else if (world.getBlockAt(pos).registryName == "contenttweaker:upgrade_rune_iron") {
				
				if (itemStack?.identifier == "minecraft:stone_pickaxe:0") {
				10.times{world.spawnParticle(PParticleTypes.SMOKE_LARGE, pos.x+0.5, pos.y+0.5, pos.z+0.5, 0, 0.1, 0)}
				world.playRecord(pos, VanillaSounds.ENTITY_PLAYER_LEVELUP.getSoundEvent())
				world.setToAir(pos)
				player.heldMain.count--
				world.spawnItemInWorld(new PItemStack("minecraft:iron_pickaxe") * 1, pos.add(0,1,0), 0, 0.2d, 0)
				}
				
				else if (itemStack?.identifier == "minecraft:stone_axe:0") {
				10.times{world.spawnParticle(PParticleTypes.SMOKE_LARGE, pos.x+0.5, pos.y+0.5, pos.z+0.5, 0, 0.1, 0)}
				world.playRecord(pos, VanillaSounds.ENTITY_PLAYER_LEVELUP.getSoundEvent())
				world.setToAir(pos)
				player.heldMain.count--
				world.spawnItemInWorld(new PItemStack("minecraft:iron_axe") * 1, pos.add(0,1,0), 0, 0.2d, 0)
				}
				
				else if (itemStack?.identifier == "minecraft:stone_shovel:0") {
				10.times{world.spawnParticle(PParticleTypes.SMOKE_LARGE, pos.x+0.5, pos.y+0.5, pos.z+0.5, 0, 0.1, 0)}
				world.playRecord(pos, VanillaSounds.ENTITY_PLAYER_LEVELUP.getSoundEvent())
				world.setToAir(pos)
				player.heldMain.count--
				world.spawnItemInWorld(new PItemStack("minecraft:iron_shovel") * 1, pos.add(0,1,0), 0, 0.2d, 0)
				}
				
				else if (itemStack?.identifier == "minecraft:stone_sword:0") {
				10.times{world.spawnParticle(PParticleTypes.SMOKE_LARGE, pos.x+0.5, pos.y+0.5, pos.z+0.5, 0, 0.1, 0)}
				world.playRecord(pos, VanillaSounds.ENTITY_PLAYER_LEVELUP.getSoundEvent())
				world.setToAir(pos)
				player.heldMain.count--
				world.spawnItemInWorld(new PItemStack("minecraft:iron_sword") * 1, pos.add(0,1,0), 0, 0.2d, 0)
				}
				
				else if (itemStack?.identifier == "minecraft:stone_hoe:0") {
				10.times{world.spawnParticle(PParticleTypes.SMOKE_LARGE, pos.x+0.5, pos.y+0.5, pos.z+0.5, 0, 0.1, 0)}
				world.playRecord(pos, VanillaSounds.ENTITY_PLAYER_LEVELUP.getSoundEvent())
				world.setToAir(pos)
				player.heldMain.count--
				world.spawnItemInWorld(new PItemStack("minecraft:iron_hoe") * 1, pos.add(0,1,0), 0, 0.2d, 0)
				}
			
				else if (itemStack?.identifier == "minecraft:bucket:0") {
				world.spawnParticle(PParticleTypes.WATER_BUBBLE, pos.x+0.5, pos.y+1, pos.z+0.5, 2, 1, 40)
				world.playRecord(pos, VanillaSounds.BLOCK_BREWING_STAND_BREW.getSoundEvent())
				world.setToAir(pos)
				player.heldMain.count--
				world.spawnItemInWorld(new PItemStack("minecraft:cauldron") * 1, pos.add(0,1,0), 0, 0.3d, 0)
				}
		}
		
		//GOLD RUNE + COPPER TOOLS = GOLD TOOLS
		else if (world.getBlockAt(pos).registryName == "contenttweaker:upgrade_rune_gold") {
				
				if (itemStack?.identifier == "thermalfoundation:tool.pickaxe_copper:0") {
				15.times{world.spawnParticle(PParticleTypes.SPELL, pos.x+0.5, pos.y+1, pos.z+0.5, 0, 1.0, 0)}
				world.playRecord(pos, VanillaSounds.ENTITY_PLAYER_LEVELUP.getSoundEvent())
				world.setToAir(pos)
				player.heldMain.count--
				world.spawnItemInWorld(new PItemStack("minecraft:golden_pickaxe") * 1, pos.add(0,1,0), 0, 0.2d, 0)
				}
				
				else if (itemStack?.identifier == "thermalfoundation:tool.axe_copper:0") {
				15.times{world.spawnParticle(PParticleTypes.SPELL, pos.x+0.5, pos.y+1, pos.z+0.5, 0, 1.0, 0)}
				world.playRecord(pos, VanillaSounds.ENTITY_PLAYER_LEVELUP.getSoundEvent())
				world.setToAir(pos)
				player.heldMain.count--
				world.spawnItemInWorld(new PItemStack("minecraft:golden_axe") * 1, pos.add(0,1,0), 0, 0.2d, 0)
				}
				
				else if (itemStack?.identifier == "thermalfoundation:tool.shovel_copper:0") {
				15.times{world.spawnParticle(PParticleTypes.SPELL, pos.x+0.5, pos.y+1, pos.z+0.5, 0, 1.0, 0)}
				world.playRecord(pos, VanillaSounds.ENTITY_PLAYER_LEVELUP.getSoundEvent())
				world.setToAir(pos)
				player.heldMain.count--
				world.spawnItemInWorld(new PItemStack("minecraft:golden_shovel") * 1, pos.add(0,1,0), 0, 0.2d, 0)
				}
				
				else if (itemStack?.identifier == "thermalfoundation:tool.sword_copper:0") {
				15.times{world.spawnParticle(PParticleTypes.SPELL, pos.x+0.5, pos.y+1, pos.z+0.5, 0, 1.0, 0)}
				world.playRecord(pos, VanillaSounds.ENTITY_PLAYER_LEVELUP.getSoundEvent())
				world.setToAir(pos)
				player.heldMain.count--
				world.spawnItemInWorld(new PItemStack("minecraft:golden_sword") * 1, pos.add(0,1,0), 0, 0.2d, 0)
				}
				
				else if (itemStack?.identifier == "minecraft:thermalfoundation:tool.hoe_copper:0") {
				15.times{world.spawnParticle(PParticleTypes.SPELL, pos.x+0.5, pos.y+1, pos.z+0.5, 0, 1.0, 0)}
				world.playRecord(pos, VanillaSounds.ENTITY_PLAYER_LEVELUP.getSoundEvent())
				world.setToAir(pos)
				player.heldMain.count--
				world.spawnItemInWorld(new PItemStack("minecraft:golden_hoe") * 1, pos.add(0,1,0), 0, 0.2d, 0)
				}
				
				//GOLD RUNE + APPLE = GOLDEN APPLE
				else if (itemStack?.identifier == "minecraft:apple:0") {
				10.times{world.spawnParticle(PParticleTypes.SPELL_WITCH, pos.x+(it*0.1), pos.y+1, pos.z+(it*0.1), 0, 1.0, 0)}
				10.times{world.spawnParticle(PParticleTypes.SPELL_WITCH, pos.x+0-(it*-0.1), pos.y+1, pos.z+1-(it*0.1), 0, 1.0, 0)}
				world.playRecord(pos, VanillaSounds.BLOCK_ENCHANTMENT_TABLE_USE.getSoundEvent())
				world.setToAir(pos)
				player.heldMain.count--
				world.spawnItemInWorld(new PItemStack("minecraft:golden_apple") * 1, pos.add(0,1,0), 0, 0.2d, 0)
				}
		}
		
		//DIAMOND RUNE + IRON TOOLS = DIAMOND TOOLS
		else if (world.getBlockAt(pos).registryName == "contenttweaker:upgrade_rune_diamond") {
				
				if (itemStack?.identifier == "minecraft:iron_pickaxe:0") {
				world.spawnParticle(PParticleTypes.FIREWORKS_SPARK, pos.x+0.5, pos.y+1, pos.z+0.5, 0, 0.1, 0)
				world.playRecord(pos, VanillaSounds.ENTITY_PLAYER_LEVELUP.getSoundEvent())
				world.setToAir(pos)
				player.heldMain.count--
				world.spawnItemInWorld(new PItemStack("minecraft:diamond_pickaxe") * 1, pos.add(0,1,0), 0, 0.2d, 0)
				}
				
				else if (itemStack?.identifier == "minecraft:iron_axe:0") {
				world.spawnParticle(PParticleTypes.FIREWORKS_SPARK, pos.x+0.5, pos.y+1, pos.z+0.5, 0, 0.1, 0)
				world.playRecord(pos, VanillaSounds.ENTITY_PLAYER_LEVELUP.getSoundEvent())
				world.setToAir(pos)
				player.heldMain.count--
				world.spawnItemInWorld(new PItemStack("minecraft:diamond_axe") * 1, pos.add(0,1,0), 0, 0.2d, 0)
				}
				
				else if (itemStack?.identifier == "minecraft:iron_shovel:0") {
				world.spawnParticle(PParticleTypes.FIREWORKS_SPARK, pos.x+0.5, pos.y+1, pos.z+0.5, 0, 0.1, 0)
				world.playRecord(pos, VanillaSounds.ENTITY_PLAYER_LEVELUP.getSoundEvent())
				world.setToAir(pos)
				player.heldMain.count--
				world.spawnItemInWorld(new PItemStack("minecraft:diamond_shovel") * 1, pos.add(0,1,0), 0, 0.2d, 0)
				}
				
				else if (itemStack?.identifier == "minecraft:iron_sword:0") {
				world.spawnParticle(PParticleTypes.FIREWORKS_SPARK, pos.x+0.5, pos.y+1, pos.z+0.5, 0, 0.1, 0)
				world.playRecord(pos, VanillaSounds.ENTITY_PLAYER_LEVELUP.getSoundEvent())
				world.setToAir(pos)
				player.heldMain.count--
				world.spawnItemInWorld(new PItemStack("minecraft:diamond_sword") * 1, pos.add(0,1,0), 0, 0.2d, 0)
				}
				
				else if (itemStack?.identifier == "minecraft:iron_hoe:0") {
				world.spawnParticle(PParticleTypes.FIREWORKS_SPARK, pos.x+0.5, pos.y+1, pos.z+0.5, 0, 0.1, 0)
				world.playRecord(pos, VanillaSounds.ENTITY_PLAYER_LEVELUP.getSoundEvent())
				world.setToAir(pos)
				player.heldMain.count--
				world.spawnItemInWorld(new PItemStack("minecraft:diamond_hoe") * 1, pos.add(0,1,0), 0, 0.2d, 0)
				}
		}
		
		//COPPER RUNE + STONE TOOLS = COPPER TOOLS
		else if (world.getBlockAt(pos).registryName == "contenttweaker:upgrade_rune_copper") {
				
				if (itemStack?.identifier == "minecraft:stone_pickaxe:0") {
				10.times{world.spawnParticle(PParticleTypes.SMOKE_LARGE, pos.x+0.5, pos.y+0.5, pos.z+0.5, 0, 0.1, 0)}
				world.playRecord(pos, VanillaSounds.ENTITY_PLAYER_LEVELUP.getSoundEvent())
				world.setToAir(pos)
				player.heldMain.count--
				world.spawnItemInWorld(new PItemStack("thermalfoundation:tool.pickaxe_copper") * 1, pos.add(0,1,0), 0, 0.2d, 0)
				}
				
				else if (itemStack?.identifier == "minecraft:stone_axe:0") {
				10.times{world.spawnParticle(PParticleTypes.SMOKE_LARGE, pos.x+0.5, pos.y+0.5, pos.z+0.5, 0, 0.1, 0)}
				world.playRecord(pos, VanillaSounds.ENTITY_PLAYER_LEVELUP.getSoundEvent())
				world.setToAir(pos)
				player.heldMain.count--
				world.spawnItemInWorld(new PItemStack("thermalfoundation:tool.axe_copper") * 1, pos.add(0,1,0), 0, 0.2d, 0)
				}
				
				else if (itemStack?.identifier == "minecraft:stone_shovel:0") {
				10.times{world.spawnParticle(PParticleTypes.SMOKE_LARGE, pos.x+0.5, pos.y+0.5, pos.z+0.5, 0, 0.1, 0)}
				world.playRecord(pos, VanillaSounds.ENTITY_PLAYER_LEVELUP.getSoundEvent())
				world.setToAir(pos)
				player.heldMain.count--
				world.spawnItemInWorld(new PItemStack("thermalfoundation:tool.shovel_copper") * 1, pos.add(0,1,0), 0, 0.2d, 0)
				}
				
				else if (itemStack?.identifier == "minecraft:stone_sword:0") {
				10.times{world.spawnParticle(PParticleTypes.SMOKE_LARGE, pos.x+0.5, pos.y+0.5, pos.z+0.5, 0, 0.1, 0)}
				world.playRecord(pos, VanillaSounds.ENTITY_PLAYER_LEVELUP.getSoundEvent())
				world.setToAir(pos)
				player.heldMain.count--
				world.spawnItemInWorld(new PItemStack("thermalfoundation:tool.sword_copper") * 1, pos.add(0,1,0), 0, 0.2d, 0)
				}
				
				else if (itemStack?.identifier == "minecraft:stone_hoe:0") {
				10.times{world.spawnParticle(PParticleTypes.SMOKE_LARGE, pos.x+0.5, pos.y+0.5, pos.z+0.5, 0, 0.1, 0)}
				world.playRecord(pos, VanillaSounds.ENTITY_PLAYER_LEVELUP.getSoundEvent())
				world.setToAir(pos)
				player.heldMain.count--
				world.spawnItemInWorld(new PItemStack("thermalfoundation:tool.hoe_copper") * 1, pos.add(0,1,0), 0, 0.2d, 0)
				}
		}
		
		//BRONZE RUNE + STONE TOOLS = BRONZE TOOLS
		else if (world.getBlockAt(pos).registryName == "contenttweaker:upgrade_rune_bronze") {
				
				if (itemStack?.identifier == "minecraft:stone_pickaxe:0") {
				10.times{world.spawnParticle(PParticleTypes.SMOKE_LARGE, pos.x+0.5, pos.y+0.5, pos.z+0.5, 0, 0.1, 0)}
				world.playRecord(pos, VanillaSounds.ENTITY_PLAYER_LEVELUP.getSoundEvent())
				world.setToAir(pos)
				player.heldMain.count--
				world.spawnItemInWorld(new PItemStack("thermalfoundation:tool.pickaxe_bronze") * 1, pos.add(0,1,0), 0, 0.2d, 0)
				}
				
				else if (itemStack?.identifier == "minecraft:stone_axe:0") {
				10.times{world.spawnParticle(PParticleTypes.SMOKE_LARGE, pos.x+0.5, pos.y+0.5, pos.z+0.5, 0, 0.1, 0)}
				world.playRecord(pos, VanillaSounds.ENTITY_PLAYER_LEVELUP.getSoundEvent())
				world.setToAir(pos)
				player.heldMain.count--
				world.spawnItemInWorld(new PItemStack("thermalfoundation:tool.axe_bronze") * 1, pos.add(0,1,0), 0, 0.2d, 0)
				}
				
				else if (itemStack?.identifier == "minecraft:stone_shovel:0") {
				10.times{world.spawnParticle(PParticleTypes.SMOKE_LARGE, pos.x+0.5, pos.y+0.5, pos.z+0.5, 0, 0.1, 0)}
				world.playRecord(pos, VanillaSounds.ENTITY_PLAYER_LEVELUP.getSoundEvent())
				world.setToAir(pos)
				player.heldMain.count--
				world.spawnItemInWorld(new PItemStack("thermalfoundation:tool.shovel_bronze") * 1, pos.add(0,1,0), 0, 0.2d, 0)
				}
				
				else if (itemStack?.identifier == "minecraft:stone_sword:0") {
				10.times{world.spawnParticle(PParticleTypes.SMOKE_LARGE, pos.x+0.5, pos.y+0.5, pos.z+0.5, 0, 0.1, 0)}
				world.playRecord(pos, VanillaSounds.ENTITY_PLAYER_LEVELUP.getSoundEvent())
				world.setToAir(pos)
				player.heldMain.count--
				world.spawnItemInWorld(new PItemStack("thermalfoundation:tool.sword_bronze") * 1, pos.add(0,1,0), 0, 0.2d, 0)
				}
				
				else if (itemStack?.identifier == "minecraft:stone_hoe:0") {
				10.times{world.spawnParticle(PParticleTypes.SMOKE_LARGE, pos.x+0.5, pos.y+0.5, pos.z+0.5, 0, 0.1, 0)}
				world.playRecord(pos, VanillaSounds.ENTITY_PLAYER_LEVELUP.getSoundEvent())
				world.setToAir(pos)
				player.heldMain.count--
				world.spawnItemInWorld(new PItemStack("thermalfoundation:tool.hoe_bronze") * 1, pos.add(0,1,0), 0, 0.2d, 0)
				}
		}
		
		//PLATINUM RUNE + IRON TOOLS = PLATINUM TOOLS
		else if (world.getBlockAt(pos).registryName == "contenttweaker:upgrade_rune_platinum") {
				
				if (itemStack?.identifier == "thermalfoundation:tool.pickaxe_bronze:0") {
				world.spawnParticle(PParticleTypes.FIREWORKS_SPARK, pos.x+0.5, pos.y+1, pos.z+0.5, 0, 0.1, 0)
				world.playRecord(pos, VanillaSounds.ENTITY_PLAYER_LEVELUP.getSoundEvent())
				world.setToAir(pos)
				player.heldMain.count--
				world.spawnItemInWorld(new PItemStack("thermalfoundation:tool.pickaxe_platinum") * 1, pos.add(0,1,0), 0, 0.2d, 0)
				}
				
				else if (itemStack?.identifier == "thermalfoundation:tool.axe_bronze:0") {
				world.spawnParticle(PParticleTypes.FIREWORKS_SPARK, pos.x+0.5, pos.y+1, pos.z+0.5, 0, 0.1, 0)
				world.playRecord(pos, VanillaSounds.ENTITY_PLAYER_LEVELUP.getSoundEvent())
				world.setToAir(pos)
				player.heldMain.count--
				world.spawnItemInWorld(new PItemStack("thermalfoundation:tool.axe_platinum") * 1, pos.add(0,1,0), 0, 0.2d, 0)
				}
				
				else if (itemStack?.identifier == "thermalfoundation:tool.shovel_bronze:0") {
				world.spawnParticle(PParticleTypes.FIREWORKS_SPARK, pos.x+0.5, pos.y+1, pos.z+0.5, 0, 0.1, 0)
				world.playRecord(pos, VanillaSounds.ENTITY_PLAYER_LEVELUP.getSoundEvent())
				world.setToAir(pos)
				player.heldMain.count--
				world.spawnItemInWorld(new PItemStack("thermalfoundation:tool.shovel_platinum") * 1, pos.add(0,1,0), 0, 0.2d, 0)
				}
				
				else if (itemStack?.identifier == "thermalfoundation:tool.sword_bronze:0") {
				world.spawnParticle(PParticleTypes.FIREWORKS_SPARK, pos.x+0.5, pos.y+1, pos.z+0.5, 0, 0.1, 0)
				world.playRecord(pos, VanillaSounds.ENTITY_PLAYER_LEVELUP.getSoundEvent())
				world.setToAir(pos)
				player.heldMain.count--
				world.spawnItemInWorld(new PItemStack("thermalfoundation:tool.sword_platinum") * 1, pos.add(0,1,0), 0, 0.2d, 0)
				}
				
				else if (itemStack?.identifier == "thermalfoundation:tool.hoe_bronze:0") {
				world.spawnParticle(PParticleTypes.FIREWORKS_SPARK, pos.x+0.5, pos.y+1, pos.z+0.5, 0, 0.1, 0)
				world.playRecord(pos, VanillaSounds.ENTITY_PLAYER_LEVELUP.getSoundEvent())
				world.setToAir(pos)
				player.heldMain.count--
				world.spawnItemInWorld(new PItemStack("thermalfoundation:tool.hoe_platinum") * 1, pos.add(0,1,0), 0, 0.2d, 0)
				}
		}
		
		
		//LAPIS BLOCK + NOT THAT DULL DUST = ENCHANTED LAPIS BLOCK
		else if (world.getBlockAt(pos).registryName == "minecraft:lapis_block"
				&& itemStack?.identifier == "contenttweaker:not_that_dull_dust:0") {
				
				15.times{world.spawnParticle(PParticleTypes.SPELL_WITCH, pos.x+0.1, pos.y+1.0, pos.z+0.5, 0, 0.5, 0)}
				world.playRecord(pos, VanillaSounds.BLOCK_ENCHANTMENT_TABLE_USE.getSoundEvent())
				world.setToAir(pos)

				player.heldMain.count--
				world.spawnItemInWorld(new PItemStack("contenttweaker:enchanted_lapis_block") * 1, pos.add(0,1,0), 0, 1.1d, 0)
        }
		else if (world.getBlockAt(pos, -1,-1,-1).registryName == "minecraft:soul_sand"
		&& world.getBlockAt(pos, -1,-1,0).registryName == "minecraft:soul_sand"
		&& world.getBlockAt(pos, -1,-1,1).registryName == "minecraft:soul_sand"
		&& world.getBlockAt(pos, 0,-1,-1).registryName == "minecraft:soul_sand"
        && world.getBlockAt(pos, 0,-1,1).registryName == "minecraft:soul_sand"
		&& world.getBlockAt(pos, 1,-1,-1).registryName == "minecraft:soul_sand"
        && world.getBlockAt(pos, 1,-1,0).registryName == "minecraft:soul_sand"
		&& world.getBlockAt(pos, 1,-1,1).registryName == "minecraft:soul_sand"
		&& world.getBlockAt(pos, 0,-1,0).registryName == "contenttweaker:hellfire_rune")
		{
			if (world.getBlockAt(pos).registryName == "astralsorcery:blockmarble"
				&& itemStack?.identifier == "inspirations:blaze_crook:0") {
				
				5.times{world.spawnParticle(PParticleTypes.FLAME, pos.x+0.1, pos.y+1.0, pos.z+0.5, 0, 0.15, 0)}
				world.playRecord(pos, VanillaSounds.ITEM_FLINTANDSTEEL_USE.getSoundEvent())
				world.setToAir(pos)

				world.spawnItemInWorld(new PItemStack("astralsorcery:blockblackmarble") * 1, pos.add(0,1,0), 0, 1.1d, 0)
			}
			
			else if (world.getBlockAt(pos).registryName == "tconstruct:firewood"
				&& itemStack?.identifier == "contenttweaker:flamablepowder:0") {
				
				5.times{world.spawnParticle(PParticleTypes.FLAME, pos.x+0.1, pos.y+1.0, pos.z+0.5, 0, 0.15, 0)}
				world.playRecord(pos, VanillaSounds.ENTITY_BLAZE_SHOOT.getSoundEvent())
				world.setToAir(pos)

				player.heldMain.count--
				world.spawnItemInWorld(new PItemStack("tconstruct:firewood", 1) * 1, pos.add(0,1,0), 0, 1.1d, 0)
			}
			
			else if (world.getBlockAt(pos).registryName == "minecraft:log"
				&& itemStack?.identifier == "contenttweaker:flamablepowder:0") {
				
				5.times{world.spawnParticle(PParticleTypes.FLAME, pos.x+0.1, pos.y+1.0, pos.z+0.5, 0, 0.15, 0)}
				world.playRecord(pos, VanillaSounds.ENTITY_BLAZE_SHOOT.getSoundEvent())
				world.setToAir(pos)

				player.heldMain.count--
				world.spawnItemInWorld(new PItemStack("contenttweaker:charred_log") * 1, pos.add(0,1,0), 0, 1.1d, 0)
			}
			
			else if (world.getBlockAt(pos).registryName == "tconstruct:soil"
				&& itemStack?.identifier == "contenttweaker:flamablepowder:0") {
				
				5.times{world.spawnParticle(PParticleTypes.FLAME, pos.x+0.1, pos.y+1.0, pos.z+0.5, 0, 0.15, 0)}
				world.playRecord(pos, VanillaSounds.ENTITY_BLAZE_SHOOT.getSoundEvent())
				world.setToAir(pos)

				player.heldMain.count--
				world.spawnItemInWorld(new PItemStack("tconstruct:materials") * 2, pos.add(0,1,0), 0, 1.1d, 0)
			}
			
			else if (world.getBlockAt(pos).registryName == "plants2:crystal")
			{
			
				if (itemStack?.identifier == "minecraft:slime_ball:0") {
				
					5.times{world.spawnParticle(PParticleTypes.FLAME, pos.x+0.1, pos.y+1.0, pos.z+0.5, 0, 0.15, 0)}
					world.playRecord(pos, VanillaSounds.BLOCK_GLASS_BREAK.getSoundEvent())
					world.setToAir(pos)

					player.heldMain.count--
					world.spawnItemInWorld(new PItemStack("tconstruct:materials", 9) * 1, pos.add(0,1,0), 0, 0.1d, 0)
				}
				
				else if (itemStack?.identifier == "tconstruct:edible:1") {
				
					5.times{world.spawnParticle(PParticleTypes.FLAME, pos.x+0.1, pos.y+1.0, pos.z+0.5, 0, 0.15, 0)}
					world.playRecord(pos, VanillaSounds.BLOCK_GLASS_BREAK.getSoundEvent())
					world.setToAir(pos)

					player.heldMain.count--
					world.spawnItemInWorld(new PItemStack("tconstruct:materials", 10) * 1, pos.add(0,1,0), 0, 0.1d, 0)
				}
				
				else if (itemStack?.identifier == "tconstruct:edible:4") {
				
					5.times{world.spawnParticle(PParticleTypes.FLAME, pos.x+0.1, pos.y+1.0, pos.z+0.5, 0, 0.15, 0)}
					world.playRecord(pos, VanillaSounds.BLOCK_GLASS_BREAK.getSoundEvent())
					world.setToAir(pos)

					player.heldMain.count--
					world.spawnItemInWorld(new PItemStack("tconstruct:materials", 11) * 1, pos.add(0,1,0), 0, 0.1d, 0)
				}
			}
				
			
			else if (world.getBlockAt(pos).registryName == "thermalfoundation:storage_resource"
				&& itemStack?.identifier == "rusticthaumaturgy:dust_tiny_blaze:0") {
				
				5.times{world.spawnParticle(PParticleTypes.FLAME, pos.x+0.1, pos.y+1.0, pos.z+0.5, 0, 0.15, 0)}
				world.playRecord(pos, VanillaSounds.ENTITY_BLAZE_SHOOT.getSoundEvent())
				world.setToAir(pos)

				player.heldMain.count--
				world.spawnItemInWorld(new PItemStack("thermalfoundation:storage_resource", 1) * 1, pos.add(0,1,0), 0, 1.1d, 0)
			}
			
			else if (world.getBlockAt(pos).registryName == "minecraft:coal_block"
				&& itemStack?.identifier == "contenttweaker:philosopher_stone:0") {
				
				5.times{world.spawnParticle(PParticleTypes.FLAME, pos.x+0.1, pos.y+1.0, pos.z+0.5, 0, 0.15, 0)}
				world.playRecord(pos, VanillaSounds.ENTITY_PLAYER_LEVELUP.getSoundEvent())
				world.setToAir(pos)

				world.spawnItemInWorld(new PItemStack("thermalfoundation:material", 16) * 1, pos.add(0,1,0), 0, 1.1d, 0)
			}
			
			else if (world.getBlockAt(pos).registryName == "minecraft:grass"
				&& itemStack?.identifier == "tconstruct:materials:11") {
				
				5.times{world.spawnParticle(PParticleTypes.FLAME, pos.x+0.1, pos.y+1.0, pos.z+0.5, 0, 0.15, 0)}
				world.playRecord(pos, VanillaSounds.ENTITY_BLAZE_SHOOT.getSoundEvent())
				world.setToAir(pos)

				player.heldMain.count--
				world.spawnItemInWorld(new PItemStack("tconstruct:slime_sapling", 2) * 1, pos.add(0,1,0), 0, 1.1d, 0)
			}
			
			else if (world.getBlockAt(pos).registryName == "botania:quartztypeblaze"
				&& itemStack?.identifier == "minecraft:wheat_seeds:0") {
				
				5.times{world.spawnParticle(PParticleTypes.FLAME, pos.x+0.1, pos.y+1.0, pos.z+0.5, 0, 0.15, 0)}
				world.playRecord(pos, VanillaSounds.ENTITY_BLAZE_SHOOT.getSoundEvent())
				world.setToAir(pos)

				player.heldMain.count--
				world.spawnItemInWorld(new PItemStack("thaumcraft:cinderpearl") * 1, pos.add(0,1,0), 0, 1.1d, 0)
			}
			
			else if (world.getBlockAt(pos).registryName == "minecraft:iron_block"){
				if (itemStack?.identifier == "twilightforest:fiery_tears:0") {
				
				5.times{world.spawnParticle(PParticleTypes.FLAME, pos.x+0.1, pos.y+1.0, pos.z+0.5, 0, 0.15, 0)}
				world.playRecord(pos, VanillaSounds.ENTITY_BLAZE_SHOOT.getSoundEvent())
				world.setToAir(pos)

				player.heldMain.count--
				world.spawnItemInWorld(new PItemStack("twilightforest:fiery_ingot") * 3, pos.add(0,1,0), 0, 1.1d, 0)
				}
				
				else if (itemStack?.identifier == "thermalfoundation:material:802") {
				
				5.times{world.spawnParticle(PParticleTypes.FLAME, pos.x+0.1, pos.y+1.0, pos.z+0.5, 0, 0.15, 0)}
				world.playRecord(pos, VanillaSounds.BLOCK_ANVIL_USE.getSoundEvent())
				world.setToAir(pos)

				player.heldMain.count--
				world.spawnItemInWorld(new PItemStack("thermalfoundation:storage_alloy"), pos.add(0,1,0), 0, 1.1d, 0)
				}

			}
			
			else if (world.getBlockAt(pos).registryName == "minecraft:netherrack"
				&& itemStack?.identifier == "minecraft:glowstone_dust:0") {
				
				5.times{world.spawnParticle(PParticleTypes.FLAME, pos.x+0.1, pos.y+1.0, pos.z+0.5, 0, 0.15, 0)}
				world.playRecord(pos, VanillaSounds.ENTITY_BLAZE_SHOOT.getSoundEvent())
				world.setToAir(pos)

				player.heldMain.count--
				world.spawnItemInWorld(new PItemStack("thermalfoundation:ore_fluid", 3) * 1, pos.add(0,1,0), 0, 1.1d, 0)
			}
			
			else if (world.getBlockAt(pos).registryName == "botania:livingrock"
				&& itemStack?.identifier == "rootsclassic:redcurrant:0") {
				
				5.times{world.spawnParticle(PParticleTypes.FLAME, pos.x+0.1, pos.y+1.0, pos.z+0.5, 0, 0.15, 0)}
				world.playRecord(pos, VanillaSounds.ENTITY_BLAZE_SHOOT.getSoundEvent())
				world.setToAir(pos)

				player.heldMain.count--
				world.spawnItemInWorld(new PItemStack("minecraft:redstone") * 1, pos.add(0,1,0), 0, 1.1d, 0)
			}
		}
	}
}

CGEventManager.rightClickBlock
{

	if (
		world.getBlockAt(pos, 0,-1,0).registryName == "contenttweaker:hellfire_rune"
		&&world.getBlockAt(pos, -1,0,-1).registryName == "rustic:slate_chiseled"
		&& world.getBlockAt(pos, -1,0,0).registryName == "rustic:slate_tile"
		&& world.getBlockAt(pos, -1,0,1).registryName == "rustic:slate_chiseled"
		&& world.getBlockAt(pos, 0,0,-1).registryName == "rustic:slate_tile"
        && world.getBlockAt(pos, 0,0,1).registryName == "rustic:slate_tile"
		&& world.getBlockAt(pos, 1,0,-1).registryName == "rustic:slate_chiseled"
        && world.getBlockAt(pos, 1,0,0).registryName == "rustic:slate_tile"
		&& world.getBlockAt(pos, 1,0,1).registryName == "rustic:slate_chiseled"
		&& world.getBlockAt(pos, -1,1,-1).registryName == "totemic:totem_torch"
		&& world.getBlockAt(pos, -1,1,1).registryName == "totemic:totem_torch"
		&& world.getBlockAt(pos, 1,1,-1).registryName == "totemic:totem_torch"
		&& world.getBlockAt(pos, 1,1,1).registryName == "totemic:totem_torch"
		
		&& world.getBlockAt(pos, -1,-1,-1).registryName == "minecraft:soul_sand"
		&& world.getBlockAt(pos, -1,-1,0).registryName == "minecraft:soul_sand"
		&& world.getBlockAt(pos, -1,-1,1).registryName == "minecraft:soul_sand"
		&& world.getBlockAt(pos, 0,-1,-1).registryName == "minecraft:soul_sand"
        && world.getBlockAt(pos, 0,-1,1).registryName == "minecraft:soul_sand"
		&& world.getBlockAt(pos, 1,-1,-1).registryName == "minecraft:soul_sand"
        && world.getBlockAt(pos, 1,-1,0).registryName == "minecraft:soul_sand"
		&& world.getBlockAt(pos, 1,-1,1).registryName == "minecraft:soul_sand"
		
		&& world.getBlockAt(pos, -2,-1,-2).registryName == "midnight:bloomcrystal_rock"
		&& world.getBlockAt(pos, 2,-1,-2).registryName == "midnight:bloomcrystal_rock"
		&& world.getBlockAt(pos, -2,-1,2).registryName == "midnight:bloomcrystal_rock"
		&& world.getBlockAt(pos, 2,-1,-2).registryName == "midnight:bloomcrystal_rock"
		&& world.getBlockAt(pos, -2,0,-2).registryName == "thebetweenlands:betweenstone_pillar"
		&& world.getBlockAt(pos, 2,0,-2).registryName == "thebetweenlands:betweenstone_pillar"
		&& world.getBlockAt(pos, -2,0,2).registryName == "thebetweenlands:betweenstone_pillar"
		&& world.getBlockAt(pos, 2,0,-2).registryName == "thebetweenlands:betweenstone_pillar"
		&& world.getBlockAt(pos, -2,1,-2).registryName == "thebetweenlands:betweenstone_pillar"
		&& world.getBlockAt(pos, 2,1,-2).registryName == "thebetweenlands:betweenstone_pillar"
		&& world.getBlockAt(pos, -2,1,2).registryName == "thebetweenlands:betweenstone_pillar"
		&& world.getBlockAt(pos, 2,1,-2).registryName == "thebetweenlands:betweenstone_pillar"
		&& world.getBlockAt(pos, -2,2,-2).registryName == "thebetweenlands:mud_flower_pot_candle"
		&& world.getBlockAt(pos, 2,2,-2).registryName == "thebetweenlands:mud_flower_pot_candle"
		&& world.getBlockAt(pos, -2,2,2).registryName == "thebetweenlands:mud_flower_pot_candle"
		&& world.getBlockAt(pos, 2,2,-2).registryName == "thebetweenlands:mud_flower_pot_candle"
		)
	{
			if (itemStack?.identifier == "contenttweaker:philosopher_stone:0"){
				if (world.getBlockAt(pos).registryName == "minecraft:emerald_block")
				{
				
				5.times{world.spawnParticle(PParticleTypes.EXPLOSION_LARGE, pos.x+0.1, pos.y+1.0, pos.z+0.5, 0, 0.15, 0)}
				world.playRecord(pos, VanillaSounds.BLOCK_ENCHANTMENT_TABLE_USE.getSoundEvent())
				world.setToAir(pos)

				world.spawnItemInWorld(new PItemStack("minecraft:diamond_block") * 1, pos.add(0,1,0), 0, 1.1d, 0)
				}
				
				else if (world.getBlockAt(pos).registryName == "minecraft:diamond_block")
				{
				
				5.times{world.spawnParticle(PParticleTypes.EXPLOSION_LARGE, pos.x+0.1, pos.y+1.0, pos.z+0.5, 0, 0.15, 0)}
				world.playRecord(pos, VanillaSounds.BLOCK_ENCHANTMENT_TABLE_USE.getSoundEvent())
				world.setToAir(pos)

				world.spawnItemInWorld(new PItemStack("minecraft:gold_block") * 4, pos.add(0,1,0), 0, 1.1d, 0)
				}
				
				else if (world.getBlockAt(pos).registryName == "minecraft:gold_block")
				{
				
				5.times{world.spawnParticle(PParticleTypes.EXPLOSION_LARGE, pos.x+0.1, pos.y+1.0, pos.z+0.5, 0, 0.15, 0)}
				world.playRecord(pos, VanillaSounds.BLOCK_ENCHANTMENT_TABLE_USE.getSoundEvent())
				world.setToAir(pos)

				world.spawnItemInWorld(new PItemStack("minecraft:iron_block") * 8, pos.add(0,1,0), 0, 1.1d, 0)
				}
				
				else if (world.getBlockAt(pos).registryName == "minecraft:iron_block")
				{
				
				5.times{world.spawnParticle(PParticleTypes.EXPLOSION_LARGE, pos.x+0.1, pos.y+1.0, pos.z+0.5, 0, 0.15, 0)}
				world.playRecord(pos, VanillaSounds.BLOCK_ENCHANTMENT_TABLE_USE.getSoundEvent())
				world.setToAir(pos)

				world.spawnItemInWorld(new PItemStack("minecraft:coal_block") * 2, pos.add(0,1,0), 0, 1.1d, 0)
				}
			}
			else if (itemStack?.identifier == "minecraft:clock:0"
					&& world.getBlockAt(pos).registryName == "midnight:dark_pearl_block"){
				
				5.times{world.spawnParticle(PParticleTypes.SMOKE_LARGE, pos.x+0.1, pos.y+1.0, pos.z+0.5, 0, 0.15, 0)}
				world.playRecord(pos, VanillaSounds.ENTITY_WITHER_AMBIENT.getSoundEvent())
				world.setToAir(pos)

				player.heldMain.count--
				world.spawnItemInWorld(new PItemStack("contenttweaker:midnight_rift") * 1, pos.add(0,1,0), 0, 1.1d, 0)
			
			}
			
			else if (world.getBlockAt(pos).registryName == "contenttweaker:upgrade_rune_manasteel") {
				
				if (itemStack?.identifier == "minecraft:stone_pickaxe:0") {
				world.spawnParticle(PParticleTypes.FIREWORKS_SPARK, pos.x+0.5, pos.y+1, pos.z+0.5, 0, 0.1, 0)
				world.playRecord(pos, VanillaSounds.ENTITY_PLAYER_LEVELUP.getSoundEvent())
				world.setToAir(pos)
				player.heldMain.count--
				world.spawnItemInWorld(new PItemStack("botania:manasteelpick") * 1, pos.add(0,1,0), 0, 0.2d, 0)
				}
				
				else if (itemStack?.identifier == "minecraft:stone_axe:0") {
				world.spawnParticle(PParticleTypes.FIREWORKS_SPARK, pos.x+0.5, pos.y+1, pos.z+0.5, 0, 0.1, 0)
				world.playRecord(pos, VanillaSounds.ENTITY_PLAYER_LEVELUP.getSoundEvent())
				world.setToAir(pos)
				player.heldMain.count--
				world.spawnItemInWorld(new PItemStack("botania:manasteelaxe") * 1, pos.add(0,1,0), 0, 0.2d, 0)
				}
				
				else if (itemStack?.identifier == "minecraft:stone_shovel:0") {
				world.spawnParticle(PParticleTypes.FIREWORKS_SPARK, pos.x+0.5, pos.y+1, pos.z+0.5, 0, 0.1, 0)
				world.playRecord(pos, VanillaSounds.ENTITY_PLAYER_LEVELUP.getSoundEvent())
				world.setToAir(pos)
				player.heldMain.count--
				world.spawnItemInWorld(new PItemStack("botania:manasteelshovel") * 1, pos.add(0,1,0), 0, 0.2d, 0)
				}
				
				else if (itemStack?.identifier == "minecraft:stone_sword:0") {
				world.spawnParticle(PParticleTypes.FIREWORKS_SPARK, pos.x+0.5, pos.y+1, pos.z+0.5, 0, 0.1, 0)
				world.playRecord(pos, VanillaSounds.ENTITY_PLAYER_LEVELUP.getSoundEvent())
				world.setToAir(pos)
				player.heldMain.count--
				world.spawnItemInWorld(new PItemStack("botania:manasteelsword") * 1, pos.add(0,1,0), 0, 0.2d, 0)
				}
			}
			
			else if (world.getBlockAt(pos).registryName == "contenttweaker:upgrade_rune_elementium") {
				
				if (itemStack?.identifier == "botania:manasteelpick:0") {
				world.spawnParticle(PParticleTypes.FIREWORKS_SPARK, pos.x+0.5, pos.y+1, pos.z+0.5, 0, 0.1, 0)
				world.playRecord(pos, VanillaSounds.ENTITY_PLAYER_LEVELUP.getSoundEvent())
				world.setToAir(pos)
				player.heldMain.count--
				world.spawnItemInWorld(new PItemStack("botania:elementiumpick") * 1, pos.add(0,1,0), 0, 0.2d, 0)
				}
				
				else if (itemStack?.identifier == "botania:manasteelaxe:0") {
				world.spawnParticle(PParticleTypes.FIREWORKS_SPARK, pos.x+0.5, pos.y+1, pos.z+0.5, 0, 0.1, 0)
				world.playRecord(pos, VanillaSounds.ENTITY_PLAYER_LEVELUP.getSoundEvent())
				world.setToAir(pos)
				player.heldMain.count--
				world.spawnItemInWorld(new PItemStack("botania:elementiumaxe") * 1, pos.add(0,1,0), 0, 0.2d, 0)
				}
				
				else if (itemStack?.identifier == "botania:manasteelshovel:0") {
				world.spawnParticle(PParticleTypes.FIREWORKS_SPARK, pos.x+0.5, pos.y+1, pos.z+0.5, 0, 0.1, 0)
				world.playRecord(pos, VanillaSounds.ENTITY_PLAYER_LEVELUP.getSoundEvent())
				world.setToAir(pos)
				player.heldMain.count--
				world.spawnItemInWorld(new PItemStack("botania:elementiumshovel") * 1, pos.add(0,1,0), 0, 0.2d, 0)
				}
				
				else if (itemStack?.identifier == "botania:manasteelsword:0") {
				world.spawnParticle(PParticleTypes.FIREWORKS_SPARK, pos.x+0.5, pos.y+1, pos.z+0.5, 0, 0.1, 0)
				world.playRecord(pos, VanillaSounds.ENTITY_PLAYER_LEVELUP.getSoundEvent())
				world.setToAir(pos)
				player.heldMain.count--
				world.spawnItemInWorld(new PItemStack("botania:elementiumsword") * 1, pos.add(0,1,0), 0, 0.2d, 0)
				}
			}
			
			else if (world.getBlockAt(pos).registryName == "contenttweaker:upgrade_rune_terrasteel") {
				
				if (itemStack?.identifier == "botania:manasteelpick:0") {
				world.spawnParticle(PParticleTypes.FIREWORKS_SPARK, pos.x+0.5, pos.y+1, pos.z+0.5, 0, 0.1, 0)
				world.playRecord(pos, VanillaSounds.ENTITY_PLAYER_LEVELUP.getSoundEvent())
				world.setToAir(pos)
				player.heldMain.count--
				world.spawnItemInWorld(new PItemStack("botania:terrapick") * 1, pos.add(0,1,0), 0, 0.2d, 0)
				}
				
				else if (itemStack?.identifier == "botania:manasteelaxe:0") {
				world.spawnParticle(PParticleTypes.FIREWORKS_SPARK, pos.x+0.5, pos.y+1, pos.z+0.5, 0, 0.1, 0)
				world.playRecord(pos, VanillaSounds.ENTITY_PLAYER_LEVELUP.getSoundEvent())
				world.setToAir(pos)
				player.heldMain.count--
				world.spawnItemInWorld(new PItemStack("botania:terraaxe") * 1, pos.add(0,1,0), 0, 0.2d, 0)
				}
				
				else if (itemStack?.identifier == "botania:manasteelsword:0") {
				world.spawnParticle(PParticleTypes.FIREWORKS_SPARK, pos.x+0.5, pos.y+1, pos.z+0.5, 0, 0.1, 0)
				world.playRecord(pos, VanillaSounds.ENTITY_PLAYER_LEVELUP.getSoundEvent())
				world.setToAir(pos)
				player.heldMain.count--
				world.spawnItemInWorld(new PItemStack("botania:terrasword") * 1, pos.add(0,1,0), 0, 0.2d, 0)
				}
			}
			
		}
	
}
