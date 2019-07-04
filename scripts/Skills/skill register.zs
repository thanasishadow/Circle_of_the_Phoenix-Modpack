#modloaded compatskills reskillable
#priority 1000

import mods.compatskills.SkillCreator.createSkill;
import mods.compatskills.Skill;

val hemomancy = createSkill("hemomancy", "bloodmagic:textures/blocks/bloodstonebrick.png");
hemomancy.name = "Hemomancy";
hemomancy.setRankIcon(0, "skills:textures/hemomancy/level1.png");
hemomancy.setRankIcon(1, "skills:textures/hemomancy/level2.png");
hemomancy.setRankIcon(2, "skills:textures/hemomancy/level3.png");
hemomancy.setRankIcon(3, "skills:textures/hemomancy/level4.png");

val druidry = createSkill("druidry", "botania:textures/blocks/altgrass4.png");
druidry.name = "Druidry";
druidry.setRankIcon(0, "skills:textures/druidry/level1.png");
druidry.setRankIcon(1, "skills:textures/druidry/level2.png");
druidry.setRankIcon(2, "skills:textures/druidry/level3.png");
druidry.setRankIcon(3, "skills:textures/druidry/level4.png");

val cosmomancy = createSkill("cosmomancy", "mystcraft:textures/blocks/crystal.png");
cosmomancy.name = "Cosmomancy";
cosmomancy.setRankIcon(0, "skills:textures/cosmomancy/level1.png");
cosmomancy.setRankIcon(1, "skills:textures/cosmomancy/level2.png");
cosmomancy.setRankIcon(2, "skills:textures/cosmomancy/level3.png");
cosmomancy.setRankIcon(3, "skills:textures/cosmomancy/level4.png");

val brewing = createSkill("brewing", "rustic:textures/blocks/fluids/grape_juice_still.png");
brewing.name = "Brewing";
brewing.setRankIcon(0, "skills:textures/brewing/level1.png");
brewing.setRankIcon(1, "skills:textures/brewing/level2.png");
brewing.setRankIcon(2, "skills:textures/brewing/level3.png");

val tinkering = createSkill("tinkering", "tconstruct:textures/blocks/smeltery/seared_brick.png");
tinkering.name = "Tinkering";
tinkering.setRankIcon(0, "skills:textures/tinkering/level1.png");
tinkering.setRankIcon(1, "skills:textures/tinkering/level2.png");
tinkering.setRankIcon(2, "skills:textures/tinkering/level3.png");
tinkering.setRankIcon(3, "skills:textures/tinkering/level4.png");
tinkering.setRankIcon(4, "skills:textures/tinkering/level5.png");