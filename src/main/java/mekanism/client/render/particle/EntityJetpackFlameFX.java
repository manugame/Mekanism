//TODO: Fix this, probably just needs an AT to expose superclass constructor
/*package mekanism.client.render.particle;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.FlameParticle;
import net.minecraft.client.renderer.ActiveRenderInfo;
import net.minecraft.world.World;

public class EntityJetpackFlameFX extends FlameParticle {

    public EntityJetpackFlameFX(World world, double posX, double posY, double posZ, double velX, double velY, double velZ) {
        super(world, posX, posY, posZ, velX, velY, velZ);
    }

    @Override
    public int getBrightnessForRender(float partialTick) {
        return 190 + (int) (20F * (1.0F - Minecraft.getInstance().gameSettings.gamma));
    }

    @Override
    public void func_225606_a_(IVertexBuilder vertexBuilder, ActiveRenderInfo renderInfo, float partialTicks) {
        if (age > 0) {
            super.func_225606_a_(vertexBuilder, renderInfo, partialTicks);
        }
    }
}*/