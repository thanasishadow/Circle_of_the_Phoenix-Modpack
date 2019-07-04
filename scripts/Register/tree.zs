#loader preinit
import mods.treetweaker.TreeFactory;

var ashTree = TreeFactory.createTree("burnt_tree"); 
ashTree.setTreeType("OAK");
ashTree.setLog("contenttweaker:charred_log");
ashTree.setLeaf("contenttweaker:ash_leaves");
ashTree.setMinHeight(17);
ashTree.setExtraHeight(3);
ashTree.setGenFrequency(10000);
ashTree.setGenAttempts(1);
ashTree.setBaseBlock("contenttweaker:ash_block");
ashTree.addSapling();
ashTree.register();