import crafttweaker.item.IItemStack;

val disabled = [
<tconstruct:toolforge>






] as IItemStack[];

for i in disabled {
	recipes.remove(i);
}