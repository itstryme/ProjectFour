package io.tryme.projectfour.world.feature.tree_decorator;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.tryme.projectfour.ProjectFour;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.treedecorator.TreeDecorator;
import net.minecraft.world.gen.treedecorator.TreeDecoratorType;

public class WisteriaVinesTreeDecorator extends TreeDecorator {

    public static final Codec<WisteriaVinesTreeDecorator> CODEC = RecordCodecBuilder.create((instance) -> {
        return instance.group(Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter((treeDecorator) -> {
            return treeDecorator.probability;
        }), BlockStateProvider.TYPE_CODEC.fieldOf("block_provider").forGetter((treeDecorator) -> {
            return treeDecorator.blockProvider;
        }), BlockStateProvider.TYPE_CODEC.fieldOf("block_provider2").forGetter((treeDecorator) -> {
            return treeDecorator.blockProvider2;
        })).apply(instance, WisteriaVinesTreeDecorator::new);
    });

    private final float probability;
    protected BlockStateProvider blockProvider;
    protected BlockStateProvider blockProvider2;

    public WisteriaVinesTreeDecorator(float probability, BlockStateProvider blockProvider, BlockStateProvider blockProvider2) {
        this.probability = probability;
        this.blockProvider = blockProvider;
        this.blockProvider2 = blockProvider2;
    }

    @Override
    protected TreeDecoratorType<?> getType() {
        return ProjectFour.WISTERIA_VINES_TREE_DECORATOR;
    }

    public void place (Generator context) {
        Random randomSource = context.getRandom();
        context.getLeavesPositions().forEach((blockPos) -> {
            BlockPos blockPos2;
            if (randomSource.nextFloat() < this.probability) {
                blockPos2 = blockPos.down();
                if (context.isAir(blockPos2)) {
                    placeVines(blockPos2, blockProvider, blockProvider2, context);
                }
            }

        });
    }

    @Override
    public void generate(Generator generator) {
        place(generator);
    }

    public void placeVines(BlockPos pos, BlockStateProvider block, BlockStateProvider block2, Generator generator) {
        Random random = generator.getRandom();
        generator.replace(pos, block.getBlockState(random, pos));
        int i = 2;

        for(pos = pos.down(); i > 0; --i) {
            if (generator.isAir(pos)) {
                if (i == 1 || !generator.isAir(pos.down()) || random.nextBoolean()) {
                    generator.replace(pos, block2.getBlockState(random, pos));
                    break;
                }
                generator.replace(pos, block.getBlockState(random, pos));
            }
            pos = pos.down();
        }
    }
}
