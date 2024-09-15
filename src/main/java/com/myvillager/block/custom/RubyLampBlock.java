package com.myvillager.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class RubyLampBlock extends Block {
    public static BooleanProperty LIT = BooleanProperty.of("lit");
    public RubyLampBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.stateManager.getDefaultState().with(LIT, false));
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (!world.isClient && hand == Hand.MAIN_HAND){
            world.setBlockState(pos,state.cycle(LIT));
        }
        return super.onUse(state,world,pos,player,hand,hit);
    }

    public void appendProperties(StateManager.Builder<Block,BlockState> builder){
        builder.add(LIT);
    }
}
