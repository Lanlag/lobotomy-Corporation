package net.uniego.aida.lobecorp.renderer;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.feature.FeatureRenderer;
import net.minecraft.client.render.entity.feature.FeatureRendererContext;
import net.minecraft.client.render.entity.model.PlayerEntityModel;
import net.minecraft.client.render.item.HeldItemRenderer;
import net.minecraft.client.render.model.json.ModelTransformationMode;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.RotationAxis;
import net.uniego.aida.lobecorp.LobeCorpUtil;
import net.uniego.aida.lobecorp.item.ego.weapon.EGOWeapon;
import net.uniego.aida.lobecorp.slot.LobeCorpEquipmentSlot;

//EGO武器在武器位的模型渲染
@Environment(EnvType.CLIENT)
public class EGOWeaponFeatureRenderer extends FeatureRenderer<AbstractClientPlayerEntity, PlayerEntityModel<AbstractClientPlayerEntity>> {
    private final HeldItemRenderer heldItemRenderer;

    public EGOWeaponFeatureRenderer(FeatureRendererContext<AbstractClientPlayerEntity, PlayerEntityModel<AbstractClientPlayerEntity>> context, HeldItemRenderer heldItemRenderer) {
        super(context);
        this.heldItemRenderer = heldItemRenderer;
    }

    @Override
    public void render(MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, AbstractClientPlayerEntity entity,
                       float limbAngle, float limbDistance, float tickDelta, float animationProgress, float headYaw, float headPitch) {
        ItemStack itemStack = LobeCorpUtil.getLobeCorpEquippedStack(entity, LobeCorpEquipmentSlot.LOBECORP_WEAPON_SLOT);
        if (!itemStack.isEmpty() && itemStack.getItem() instanceof EGOWeapon egoWeapon) {
            matrices.push();
            ModelPart body = getContextModel().body;
            body.rotate(matrices);
            if (egoWeapon.getEgoWeaponTemplate() == EGOWeapon.EGOWeaponTemplate.MACE) {
                matrices.translate(-0.625, 0.2, 0);
                matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(90.0F));
                heldItemRenderer.renderItem(entity, itemStack, ModelTransformationMode.FIXED, false, matrices, vertexConsumers, light);
            }
            matrices.pop();
        }
    }
}
