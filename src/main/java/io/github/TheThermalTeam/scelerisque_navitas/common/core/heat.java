package io.github.TheThermalTeam.scelerisque_navitas.common.core;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class heat {
    //Create a container for blocks that has to update their heat values

    //Check on neighbour change event if the neighbour is a heat source
    //If the blocks input heat unit is higher than possible output heat unit then add the block to the container
    //If the blocks input heat unit is lower than possible output heat unit then remove the block from the container

    //Input heat unit/tick is determined as follows:
    BlockEntity.setBlockState(pos, this.getDefaultState.with(LIFE, value));

    public static double blocksHeatEmission(BlockPos pos) {
        BlockState ibs =
        Block block = ibs.getBlock();
        double heatPerTick=0.0;
        for (int i = 0; i < 6; i++) {
            double Teq = 0;
            double Tcurr = 0;
            heatPerTick += (Math.sqrt(Block. * neighbour.coef) / block.capacity) * (Teq - Tcurr);
        }
        return heatPerTick;
    }
}
