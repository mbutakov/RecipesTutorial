package tutorialRecipes;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod(
		   modid = "RecipesMod",
		   name = "RecipesMod",
		   version = "0.0.1"
		)

public class main {
	
	public static final String MODID = "RecipesMod";
	public static final String NAME = "RecipesMod";
	public static final String VERSION = "0.0.1";
	public static final String MC_VERSION = "1.7.10";	

	@EventHandler
	public void Init(FMLInitializationEvent e){
		MyRecipes.addRecipes();
	}
	

}
