package tutorialRecipes;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class MyRecipes {

	
	public static void addRecipes() {
		//Форменный Рецепт
		GameRegistry.addRecipe(new ItemStack(Items.iron_ingot), "XYX", "XZX", "XXX", 'X', Items.gold_ingot,'Z',Items.diamond,'Y',Items.coal);
		//Форменный рецепт с невсеми заполнеными ячейками 
		GameRegistry.addRecipe(new ItemStack(Items.coal), " Y ", "XZX", " X", 'X', Items.gold_ingot,'Z',Items.diamond,'Y',Items.coal);
		//Бесформенный рецепт
		GameRegistry.addShapelessRecipe(new ItemStack(Items.iron_ingot,5), Items.gold_ingot, Items.diamond);
		//Плавкий рецепт
		GameRegistry.addSmelting(Items.apple, new ItemStack(Items.diamond), 0.5F);
	}
	
}
