package net.mcreator.essentialadditions.entity;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.ThrownPotion;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.AreaEffectCloud;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.Packet;
import net.minecraft.core.particles.ParticleTypes;
import net.mcreator.essentialadditions.procedures.BombRightClickedOnEntityProcedure;
import net.mcreator.essentialadditions.procedures.BombEntityDiesProcedure;
import net.mcreator.essentialadditions.init.EssentialAdditionsModEntities;
public class BombEntity extends PathfinderMob {
	public BombEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(EssentialAdditionsModEntities.BOMB.get(), world);
	}
	public BombEntity(EntityType<BombEntity> type, Level world) {
		super(type, world);
		xpReward = 0;
		setNoAi(false);
	}
	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}
	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.goalSelector.addGoal(1, new FloatGoal(this));
	}
	@Override
	public MobType getMobType() {
		return MobType.UNDEFINED;
	}
	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
	}
	@Override
	public SoundEvent getDeathSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode"));
	}
	@Override
	public boolean hurt(DamageSource source, float amount) {
		if (source.getDirectEntity() instanceof AbstractArrow)
			return false;
		if (source.getDirectEntity() instanceof ThrownPotion || source.getDirectEntity() instanceof AreaEffectCloud)
			return false;
		if (source == DamageSource.FALL)
			return false;
		if (source == DamageSource.CACTUS)
			return false;
		if (source == DamageSource.DROWN)
			return false;
		if (source == DamageSource.LIGHTNING_BOLT)
			return false;
		if (source.getMsgId().equals("trident"))
			return false;
		if (source == DamageSource.ANVIL)
			return false;
		if (source == DamageSource.DRAGON_BREATH)
			return false;
		if (source == DamageSource.WITHER)
			return false;
		if (source.getMsgId().equals("witherSkull"))
			return false;
		return super.hurt(source, amount);
	}
	@Override
	public void die(DamageSource source) {
		super.die(source);
		BombEntityDiesProcedure.execute(this.level, this.getX(), this.getY(), this.getZ());
	}
	@Override
	public InteractionResult mobInteract(Player sourceentity, InteractionHand hand) {
		ItemStack itemstack = sourceentity.getItemInHand(hand);
		InteractionResult retval = InteractionResult.sidedSuccess(this.level.isClientSide());
		super.mobInteract(sourceentity, hand);
		double x = this.getX();
		double y = this.getY();
		double z = this.getZ();
		Entity entity = this;
		Level world = this.level;

		BombRightClickedOnEntityProcedure.execute(world, x, y, z, entity);
		return retval;
	}
	public void aiStep() {
		super.aiStep();
		double x = this.getX();
		double y = this.getY();
		double z = this.getZ();
		Entity entity = this;
		Level world = this.level;
		for (int l = 0; l < 10; ++l) {
			double x0 = x + 0.5 + (random.nextFloat() - 0.5) * 0.0999999985098839D;
			double y0 = y + 1.2 + (random.nextFloat() - 0.5) * 0.0999999985098839D * 100;
			double z0 = z + 0.5 + (random.nextFloat() - 0.5) * 0.0999999985098839D;
			world.addParticle(ParticleTypes.FLAME, x0, y0, z0, 0, 0, 0);
		}
	}
	public static void init() {
		//not required
	}
	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0);
		builder = builder.add(Attributes.MAX_HEALTH, 40);
		builder = builder.add(Attributes.ARMOR, 5);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 0);
		builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 1000);
		return builder;
	}
}
