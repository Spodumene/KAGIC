package mod.kagic.util;

import net.minecraftforge.fml.common.Loader;

public class Compatibility {
	private static final String TICON_MODID = "tconstruct";

	public static boolean isTinkersConstructLoaded() {
		return Loader.isModLoaded(Compatibility.TICON_MODID);
	}
}
