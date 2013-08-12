package mrtjp.projectred.transmission;

import java.util.Map;

import mrtjp.projectred.ProjectRed;
import mrtjp.projectred.core.InvertX;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.oredict.OreDictionary;
import codechicken.lib.render.CCModel;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

// Damage value for wire items is the ordinal of one of these, but metadata in the world
// is different, and depends on the TE class (for client sync purposes).
// Metadata mapping is in CLASS_TO_META and META_TO_CLASS.

public enum EnumWire {
    RED_ALLOY("Red alloy wire", "pr_redwire", 0, 0xC80000, "redalloy"),
    
    INSULATED_0("White insulated wire", "pr_insulated", 1, 0xFFFFFF, "insulated/whiteoff", "insulated/whiteon"),
    INSULATED_1("Orange insulated wire", "pr_insulated", 1, 0xFFFFFF, "insulated/orangeoff", "insulated/orangeon"),
    INSULATED_2("Magenta insulated wire", "pr_insulated", 1, 0xFFFFFF, "insulated/magentaoff", "insulated/magentaon"),
    INSULATED_3("Light blue insulated wire", "pr_insulated", 1, 0xFFFFFF, "insulated/lightblueoff", "insulated/lightblueon"),
    INSULATED_4("Yellow insulated wire", "pr_insulated", 1, 0xFFFFFF, "insulated/yellowoff", "insulated/yellowon"),
    INSULATED_5("Lime insulated wire", "pr_insulated", 1, 0xFFFFFF, "insulated/limeoff", "insulated/limeon"),
    INSULATED_6("Pink insulated wire", "pr_insulated", 1, 0xFFFFFF, "insulated/pinkoff", "insulated/pinkon"),
    INSULATED_7("Grey insulated wire", "pr_insulated", 1, 0xFFFFFF, "insulated/greyoff", "insulated/greyon"),
    INSULATED_8("Light grey insulated wire", "pr_insulated", 1, 0xFFFFFF, "insulated/lightgreyoff", "insulated/lightgreyon"),
    INSULATED_9("Cyan insulated wire", "pr_insulated", 1, 0xFFFFFF, "insulated/cyanoff", "insulated/cyanon"),
    INSULATED_10("Purple insulated wire", "pr_insulated", 1, 0xFFFFFF, "insulated/purpleoff", "insulated/purpleon"),
    INSULATED_11("Blue insulated wire", "pr_insulated", 1, 0xFFFFFF, "insulated/blueoff", "insulated/blueon"),
    INSULATED_12("Brown insulated wire", "pr_insulated", 1, 0xFFFFFF, "insulated/brownoff", "insulated/brownon"),
    INSULATED_13("Green insulated wire", "pr_insulated", 1, 0xFFFFFF, "insulated/greenoff", "insulated/greenon"),
    INSULATED_14("Red insulated wire", "pr_insulated", 1, 0xFFFFFF, "insulated/redoff", "insulated/redon"),
    INSULATED_15("Black insulated wire", "pr_insulated", 1, 0xFFFFFF, "insulated/blackoff", "insulated/blackon");/*,

    BUNDLED_N("Bundled cable", BundledCablePart.class, 4, 6, "bundledcable.obj", "jacketedbundled.obj", "bundled/neutral"),
    BUNDLED_0("White Bundled cable", BundledCablePart.class, 4, 6, "bundledcable.obj", "jacketedbundled.obj", "bundled/white"),
    BUNDLED_1("Orange Bundled cable", BundledCablePart.class, 4, 6, "bundledcable.obj", "jacketedbundled.obj", "bundled/orange"),
    BUNDLED_2("Magenta Bundled cable", BundledCablePart.class, 4, 6, "bundledcable.obj", "jacketedbundled.obj", "bundled/magenta"),
    BUNDLED_3("Light Blue Bundled cable", BundledCablePart.class, 4, 6, "bundledcable.obj", "jacketedbundled.obj", "bundled/lightblue"),
    BUNDLED_4("Yellow Bundled cable", BundledCablePart.class, 4, 6, "bundledcable.obj", "jacketedbundled.obj", "bundled/yellow"),
    BUNDLED_5("Lime Bundled cable", BundledCablePart.class, 4, 6, "bundledcable.obj", "jacketedbundled.obj", "bundled/lime"),
    BUNDLED_6("Pink Bundled cable", BundledCablePart.class, 4, 6, "bundledcable.obj", "jacketedbundled.obj", "bundled/pink"),
    BUNDLED_7("Grey Bundled cable", BundledCablePart.class, 4, 6, "bundledcable.obj", "jacketedbundled.obj", "bundled/grey"),
    BUNDLED_8("Light Grey Bundled cable", BundledCablePart.class, 4, 6, "bundledcable.obj", "jacketedbundled.obj", "bundled/lightgrey"),
    BUNDLED_9("Cyan Bundled cable", BundledCablePart.class, 4, 6, "bundledcable.obj", "jacketedbundled.obj", "bundled/cyan"),
    BUNDLED_10("Purple Bundled cable", BundledCablePart.class, 4, 6, "bundledcable.obj", "jacketedbundled.obj", "bundled/purple"),
    BUNDLED_11("Blue Bundled cable", BundledCablePart.class, 4, 6, "bundledcable.obj", "jacketedbundled.obj", "bundled/blue"),
    BUNDLED_12("Brown Bundled cable", BundledCablePart.class, 4, 6, "bundledcable.obj", "jacketedbundled.obj", "bundled/brown"),
    BUNDLED_13("Green Bundled cable", BundledCablePart.class, 4, 6, "bundledcable.obj", "jacketedbundled.obj", "bundled/green"),
    BUNDLED_14("Red Bundled cable", BundledCablePart.class, 4, 6, "bundledcable.obj", "jacketedbundled.obj", "bundled/red"),
    BUNDLED_15("Black Bundled cable", BundledCablePart.class, 4, 6, "bundledcable.obj", "jacketedbundled.obj", "bundled/black"), 
    ;*/

    public static final int PLAIN_RED_ALLOY_META = 0;
    public static final int INSULATED_RED_ALLOY_META = 1;
    public static final int BUNDLED_META = 2;

    public static EnumWire[] VALID_WIRE = values();
    public static EnumWire[] INSULATED_WIRE = { INSULATED_0, INSULATED_1, INSULATED_2, INSULATED_3, INSULATED_4, INSULATED_5, INSULATED_6, INSULATED_7, INSULATED_8, INSULATED_9, INSULATED_10, INSULATED_11, INSULATED_12, INSULATED_13, INSULATED_14, INSULATED_15, };
    //public static EnumWire[] BUNDLED_WIRE = { BUNDLED_N, BUNDLED_0, BUNDLED_1, BUNDLED_2, BUNDLED_3, BUNDLED_4, BUNDLED_5, BUNDLED_6, BUNDLED_7, BUNDLED_8, BUNDLED_9, BUNDLED_10, BUNDLED_11, BUNDLED_12, BUNDLED_13, BUNDLED_14, BUNDLED_15 };

    public final String name;
    public final String wireType;
    public final Class<? extends WirePart> jacketedClass;
    
    public final int thickness;
    public final int itemColour;
    
    // Rendering info
    public Icon[] wireSprites;
    public final String[] wireSpritePaths;
    public final String jacketModelPath;
    public Map<String, CCModel> jacketMap;

    public static final String oreDictDefinition = "projredWire";
    public static final String oreDictDefinitionInsulated = "projredInsulatedWire";
    public static final String oreDictDefinitionJacketed = "projredJacketedWire";
    public static final String oreDictDefinitionBundled = "projredBundledCable";

    public int meta = this.ordinal();

    private EnumWire(String name, String wireType, Class<? extends WirePart> jacketedClazz, 
            int thickness, int itemColour, String objPathJacket, String... textures) {
        this.name = name;
        this.wireType = wireType;
        this.jacketedClass = jacketedClazz;
        this.thickness = thickness;
        this.itemColour = itemColour;
        jacketModelPath = objPathJacket;
        wireSpritePaths = textures;
        wireSprites = new Icon[textures.length];
    }
    
    private EnumWire(String name, String wireType, int thickness, int itemColour, String... textures) {
        this(name, wireType, null, thickness, itemColour, null, textures);
    }

    public boolean hasJacketedForm() {
        return jacketedClass != null;
    }

    @SideOnly(Side.CLIENT)
    public void loadTextures(IconRegister reg) {
        if (wireSpritePaths.length > 0) {
            wireSprites = new Icon[wireSpritePaths.length];
            for (int i = 0; i < wireSpritePaths.length; i++) {
                wireSprites[i] = reg.registerIcon("projectred:wires/" + wireSpritePaths[i]);
            }
        }
        if(hasJacketedForm()) {
            jacketMap = CCModel.parseObjModels(new ResourceLocation("projectred", "/textures/obj/wiring/" + jacketModelPath), 7, new InvertX());
            for (CCModel m : jacketMap.values())
                m.shrinkUVs(0.0005);
        }
    }

    public ItemStack getItemStack() {
        return getItemStack(1);
    }

    public ItemStack getItemStack(int i) {
        return new ItemStack(ProjectRed.itemPartWire, i, meta);
    }

    public ItemStack getJacketedItemStack() {
        return getJacketedItemStack(1);
    }

    public ItemStack getJacketedItemStack(int i) {
        if (!this.hasJacketedForm()) {
            return null;
        }
        return new ItemStack(ProjectRed.itemPartJacketedWire, i, meta);
    }

    public static void initOreDictDefinitions() {
        for (EnumWire w : EnumWire.VALID_WIRE) {
            OreDictionary.registerOre(oreDictDefinition, w.getItemStack());
            if (w.hasJacketedForm()) {
                OreDictionary.registerOre(oreDictDefinitionJacketed, w.getJacketedItemStack());
            }
        }
        for (EnumWire w : EnumWire.INSULATED_WIRE) {
            OreDictionary.registerOre(oreDictDefinitionInsulated, w.getItemStack());
        }
        /*for (EnumWire w : EnumWire.BUNDLED_WIRE) {
            OreDictionary.registerOre(oreDictDefinitionBundled, w.getItemStack());
        }*/
    }
}
