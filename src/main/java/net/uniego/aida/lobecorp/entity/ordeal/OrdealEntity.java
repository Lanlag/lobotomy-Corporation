package net.uniego.aida.lobecorp.entity.ordeal;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.world.World;
import net.uniego.aida.lobecorp.LobeCorpUtil;
import net.uniego.aida.lobecorp.entity.LobeCorpEntity;

//考验实体
public class OrdealEntity extends LobeCorpEntity {
    protected OrdealEntity(EntityType<? extends HostileEntity> entityType, World world, LobeCorpUtil.EGOLevel egoLevel,
                           float redResist, float whiteResist, float blackResist, float paleResist) {
        super(entityType, world, egoLevel, redResist, whiteResist, blackResist, paleResist);
    }
}