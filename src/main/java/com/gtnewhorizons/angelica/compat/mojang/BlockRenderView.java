package com.gtnewhorizons.angelica.compat.mojang;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.util.ForgeDirection;

public interface BlockRenderView extends BlockView  {

    float getBrightness(ForgeDirection face, boolean shade);

    LightingProvider getLightingProvider();

    TileEntity getBlockEntity(BlockPos pos);

    int getColor(BlockPos pos, ColorResolver resolver);

    int getLightLevel(LightType type, BlockPos pos);

    int getBaseLightLevel(BlockPos pos, int ambientDarkness);

    boolean isSkyVisible(BlockPos pos);

    BiomeGenBase getBiomeForNoiseGen(int x, int y, int z);

    FluidState getFluidState(BlockPos set);
}
