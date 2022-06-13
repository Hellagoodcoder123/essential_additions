
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.essentialadditions.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.essentialadditions.entity.TallEndermanEntity;
import net.mcreator.essentialadditions.entity.BombEntity;
import net.mcreator.essentialadditions.EssentialAdditionsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class EssentialAdditionsModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, EssentialAdditionsMod.MODID);
	public static final RegistryObject<EntityType<BombEntity>> BOMB = register("bomb",
			EntityType.Builder.<BombEntity>of(BombEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(BombEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<TallEndermanEntity>> TALL_ENDERMAN = register("tall_enderman",
			EntityType.Builder.<TallEndermanEntity>of(TallEndermanEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TallEndermanEntity::new)

					.sized(0.6f, 2.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			BombEntity.init();
			TallEndermanEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(BOMB.get(), BombEntity.createAttributes().build());
		event.put(TALL_ENDERMAN.get(), TallEndermanEntity.createAttributes().build());
	}
}
