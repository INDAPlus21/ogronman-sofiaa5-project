package se.datasektionen.lava.datagen;

import se.datasektionen.lava.LavaMod;
import se.datasektionen.lava.setup.ModSetup;
import se.datasektionen.lava.setup.Registration;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class LavaLanguageProvider extends LanguageProvider {

	public LavaLanguageProvider(DataGenerator gen, String locale) {
		super(gen, LavaMod.MODID, locale);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void addTranslations() {
		add("itemGroup." + ModSetup.TAB_NAME, "Lava");
		add(Registration.OBSIDIAN_INSCRIPTIONS.get(), "Obsidian Inscriptions");
		add(Registration.FRAME_BLOCK.get(), "Frame Block");
		add(Registration.FRAME_SLOPE.get(), "Frame Slope Block");
		add(Registration.FRAME_STAIRS.get(), "Frame Stair Block");
		add(Registration.FRAME_SLAB.get(), "Frame Slab Block");
	}

}
