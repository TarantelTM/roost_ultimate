package net.tarantel.chickenroost.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

public class MyinstakillparticlesProjectileHitsPlayerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		String playername = "";
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.FISHING, x, y, z, 5, 3, 3, 3, 1);
	}
}
