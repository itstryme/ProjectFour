package io.tryme.projectfour.world.feature;

import com.mojang.serialization.Codec;
import io.tryme.projectfour.ProjectFour;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.stateprovider.BlockStateProviderType;

public class ProjectFourSimpleBlockStateProvider extends BlockStateProvider {

    public static final Codec<ProjectFourSimpleBlockStateProvider> CODEC;
    private BlockState state;

    public ProjectFourSimpleBlockStateProvider(BlockState state) {
        this.state = state;
    }

    static {
        CODEC = BlockState.CODEC.fieldOf("state").xmap(ProjectFourSimpleBlockStateProvider::new, (projectFourSimpleBlockStateProvider) -> {
            return projectFourSimpleBlockStateProvider.state;
        }).codec();
    }

    @Override
    protected BlockStateProviderType<?> getType() {
        return ProjectFour.PROJECTFOUR_SIMPLE_BLOCK_STATE_PROVIDER;
    }

    @Override
    public BlockState getBlockState(Random random, BlockPos pos) {
        return this.state;
    }
}
