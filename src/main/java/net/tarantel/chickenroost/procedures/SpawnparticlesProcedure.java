package net.tarantel.chickenroost.procedures;

import net.tarantel.chickenroost.entity.MyinstakillparticlesEntity;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

public class SpawnparticlesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.FISHING, x, y, z, 5, 3, 3, 3, 1);
		if (entity instanceof LivingEntity _ent_sa && !_ent_sa.level.isClientSide()) {
			MyinstakillparticlesEntity.shoot(_ent_sa.level, _ent_sa, _ent_sa.level.getRandom(), 5, 999, 0);
		}
	}
}
