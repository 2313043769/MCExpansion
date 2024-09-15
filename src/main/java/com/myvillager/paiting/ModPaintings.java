package com.myvillager.paiting;

import com.myvillager.MyVillageMod;
import net.minecraft.entity.decoration.painting.PaintingVariant;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModPaintings {
    public static final PaintingVariant SUNSET = registerPainting("sunset",new PaintingVariant(16,32));
    public static final PaintingVariant FORSET = registerPainting("forset",new PaintingVariant(16,32));
    public static final PaintingVariant GHOST = registerPainting("ghost",new PaintingVariant(16,32));
    public static final PaintingVariant ROOM = registerPainting("room",new PaintingVariant(32,16));
    public static final PaintingVariant SUNRISE = registerPainting("sunrise",new PaintingVariant(32,16));
    public static final PaintingVariant CAT = registerPainting("little_cat",new PaintingVariant(16,16));
    public static final PaintingVariant FA = registerPainting("fa",new PaintingVariant(16,16));
    public static final PaintingVariant FU = registerPainting("fu",new PaintingVariant(16,16));
    public static final PaintingVariant JI = registerPainting("ji",new PaintingVariant(16,16));
    public static final PaintingVariant SHUN = registerPainting("shun",new PaintingVariant(16,16));
    public static final PaintingVariant CUTE_CAT = registerPainting("cute_cat",new PaintingVariant(32,32));
    public static final PaintingVariant FIREWORKS = registerPainting("fireworks",new PaintingVariant(32,32));
    public static final PaintingVariant DUNHUANG_DEER = registerPainting("dunhuang_deer",new PaintingVariant(64,64));
    public static PaintingVariant registerPainting(String name,PaintingVariant paintingVariant){
        return Registry.register(Registries.PAINTING_VARIANT,new Identifier(MyVillageMod.MOD_ID,name),paintingVariant);
    }
    public static void registerPaintings(){
        MyVillageMod.LOGGER.info("正在注册新的画：" + MyVillageMod.MOD_ID);
    }
}
