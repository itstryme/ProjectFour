package io.tryme.projectfour.client;

import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.util.math.MatrixStack;

public class BetaText implements HudRenderCallback {

    @Override
    public void onHudRender(MatrixStack matrixStack, float tickDelta) {
        int y = 0;
        int x = 0;
        MinecraftClient client = MinecraftClient.getInstance();

        if (client != null) {
            int width = client.getWindow().getScaledWidth();
            int height = client.getWindow().getScaledHeight();

            x = width / 2;
            y = height / 2;

            client.textRenderer.draw(matrixStack, "Dev-0.3.0-040822", x - (x - 10), y - (y - 10), 14737632);
        }
    }
}
