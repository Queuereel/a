package net.mcreator.elementalessence.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.elementalessence.network.ElementalEssenceModVariables;

public class ImmunityForEffectsProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getBoolean("immunity") == false) {
			if (entity.isShiftKeyDown()) {
				{
					double _setval = entity.getYRot() * entity.getXRot();
					entity.getCapability(ElementalEssenceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Immunity = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				entity.getPersistentData().putBoolean("immunity", (true));
			}
		}
	}
}
