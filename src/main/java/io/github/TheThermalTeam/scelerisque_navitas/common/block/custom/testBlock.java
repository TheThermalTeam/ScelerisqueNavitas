package io.github.TheThermalTeam.scelerisque_navitas.common.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class testBlock extends Block {
    public testBlock(Properties p_49795_) {
        super(p_49795_);
    }

    @Override
    public void stepOn(Level pLevel, BlockPos pPos, BlockState pState, Entity pEntity) {
        System.out.println("testBlock stepped on");
    }

    @Override
    public void onNeighborChange(BlockState state, LevelReader world, BlockPos pos, BlockPos neighbor) {
        System.out.println("testBlock neighbor changed");
    }

     @Override public void
}
