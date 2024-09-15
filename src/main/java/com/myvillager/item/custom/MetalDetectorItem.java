package com.myvillager.item.custom;

import com.myvillager.util.ModTags;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Formatting;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;


//自定义工具
public class MetalDetectorItem extends Item {
    public MetalDetectorItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        if (!context.getWorld().isClient()){
            BlockPos positionClicked = context.getBlockPos();
            PlayerEntity player = context.getPlayer();
            boolean foundBlock = false;

            for (int i = 0; i <= positionClicked.getY() + 64; i++) {
                BlockState state = context.getWorld().getBlockState(positionClicked.down(i));

                if (isValuableBlock(state)){
                    outputValuableCoordinates(positionClicked.down(i),player,state.getBlock());
                    foundBlock = true;

                    break;
                }
            }
            if (!foundBlock){
                player.sendMessage(Text.literal("没有找到金属矿物"));
            }

        }
        context.getStack().damage(1,context.getPlayer(),
                playerEntity -> playerEntity.sendToolBreakStatus(playerEntity.getActiveHand()));



        return ActionResult.SUCCESS;
    }

//    寻找方块的坐标方法
    private void outputValuableCoordinates(BlockPos blockPos, PlayerEntity player, Block block) {
        player.sendMessage(Text.literal("探测器已找到"+block.asItem().getName().getString()+"在"
                +"("+blockPos.getX() + ","+blockPos.getY() + "," + blockPos.getZ() + ")"),false);
    }


//    如果检测到XX方块则返回true
    private boolean isValuableBlock(BlockState state) {
        return state.isIn(ModTags.Blocks.metal_detector_detectable_blocks);
    }

//    添加物品解释

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if (Screen.hasShiftDown()){
            tooltip.add(Text.translatable("tooltip.myvillage.shift_metal_detector.tooltip").formatted(Formatting.AQUA));

        }else{
            tooltip.add(Text.translatable("tooltip.myvillage.shift_information_metal_detector.tooltip"));
        }
        super.appendTooltip(stack, world, tooltip, context);



//        tooltip.add(Text.translatable("tooltip.myvillage.metal_detector.tooltip"));
//        super.appendTooltip(stack, world, tooltip, context);
    }
}
