package net.uniego.aida.lobecorp.entity.ordeal.dawn;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;
import net.uniego.aida.lobecorp.LobeCorpUtil;
import net.uniego.aida.lobecorp.access.ServerPlayerAccess;
import net.uniego.aida.lobecorp.entity.DeadPlayerEntity;
import net.uniego.aida.lobecorp.entity.ordeal.OrdealEntity;
import net.uniego.aida.lobecorp.init.DamageInit;

//疑问实体
public class DoubtEntity extends OrdealEntity {
    public DoubtEntity(EntityType<? extends HostileEntity> entityType, World world) {
        super(entityType, world, LobeCorpUtil.EGOLevel.TETH, 0.8F, 1.3F, 2.0F, 1.0F);
    }

    public static DefaultAttributeContainer.Builder createAttributes() {
        return HostileEntity.createHostileAttributes()
                .add(EntityAttributes.GENERIC_FOLLOW_RANGE, 128.0F)
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 150.0F)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.2F)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 4.0F)
                .add(EntityAttributes.GENERIC_KNOCKBACK_RESISTANCE, 1.0F);
    }

    @Override
    protected void initGoals() {
        goalSelector.add(8, new LookAroundGoal(this));
        goalSelector.add(7, new LookAtEntityGoal(this, LivingEntity.class, 16.0F));
        goalSelector.add(6, new WanderAroundFarGoal(this, 1.0F));
        goalSelector.add(5, new MeleeAttackGoal(this, 1.2F, false));
        targetSelector.add(1, new RevengeGoal(this));
        targetSelector.add(2, new ActiveTargetGoal<>(this, LivingEntity.class, 10, true, true, GREEN_ATTACK_TARGET_PREDICATE));
    }

    @Override
    public boolean tryAttack(Entity target) {
        boolean result = tryColorAttack(this, target, DamageInit.RED);
        if (result && target instanceof PlayerEntity player) {
            if (player.isDead()) {
                DeadPlayerEntity deadPlayer = ((ServerPlayerAccess) player).lobecorp$getDeadPlayer();
                deadPlayer.discard();
            }
        }
        return result;
    }
}
