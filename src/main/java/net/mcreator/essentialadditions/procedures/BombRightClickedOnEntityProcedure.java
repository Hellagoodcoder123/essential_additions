package net.mcreator.essentialadditions.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class BombRightClickedOnEntityProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		new Object() {
			private int ticks = 0;
			private float waitTicks;
			private LevelAccessor world;

			public void start(LevelAccessor world, int waitTicks) {
				this.waitTicks = waitTicks;
				MinecraftForge.EVENT_BUS.register(this);
				this.world = world;
			}

			@SubscribeEvent
			public void tick(TickEvent.ServerTickEvent event) {
				if (event.phase == TickEvent.Phase.END) {
					this.ticks += 1;
					if (this.ticks >= this.waitTicks)
						run();
				}
			}

			private void run() {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x, y, z),
								ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.creeper.primed")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.creeper.primed")),
								SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				new Object() {
					private int ticks = 0;
					private float waitTicks;
					private LevelAccessor world;

					public void start(LevelAccessor world, int waitTicks) {
						this.waitTicks = waitTicks;
						MinecraftForge.EVENT_BUS.register(this);
						this.world = world;
					}

					@SubscribeEvent
					public void tick(TickEvent.ServerTickEvent event) {
						if (event.phase == TickEvent.Phase.END) {
							this.ticks += 1;
							if (this.ticks >= this.waitTicks)
								run();
						}
					}

					private void run() {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, new BlockPos(x, y, z),
										ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.creeper.primed")), SoundSource.NEUTRAL, 1,
										1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.creeper.primed")),
										SoundSource.NEUTRAL, 1, 1, false);
							}
						}
						new Object() {
							private int ticks = 0;
							private float waitTicks;
							private LevelAccessor world;

							public void start(LevelAccessor world, int waitTicks) {
								this.waitTicks = waitTicks;
								MinecraftForge.EVENT_BUS.register(this);
								this.world = world;
							}

							@SubscribeEvent
							public void tick(TickEvent.ServerTickEvent event) {
								if (event.phase == TickEvent.Phase.END) {
									this.ticks += 1;
									if (this.ticks >= this.waitTicks)
										run();
								}
							}

							private void run() {
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, new BlockPos(x, y, z),
												ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.creeper.primed")),
												SoundSource.NEUTRAL, 1, 1);
									} else {
										_level.playLocalSound(x, y, z,
												ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.creeper.primed")),
												SoundSource.NEUTRAL, 1, 1, false);
									}
								}
								new Object() {
									private int ticks = 0;
									private float waitTicks;
									private LevelAccessor world;

									public void start(LevelAccessor world, int waitTicks) {
										this.waitTicks = waitTicks;
										MinecraftForge.EVENT_BUS.register(this);
										this.world = world;
									}

									@SubscribeEvent
									public void tick(TickEvent.ServerTickEvent event) {
										if (event.phase == TickEvent.Phase.END) {
											this.ticks += 1;
											if (this.ticks >= this.waitTicks)
												run();
										}
									}

									private void run() {
										if (world instanceof Level _level) {
											if (!_level.isClientSide()) {
												_level.playSound(null, new BlockPos(x, y, z),
														ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.creeper.primed")),
														SoundSource.NEUTRAL, 1, 1);
											} else {
												_level.playLocalSound(x, y, z,
														ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.creeper.primed")),
														SoundSource.NEUTRAL, 1, 1, false);
											}
										}
										new Object() {
											private int ticks = 0;
											private float waitTicks;
											private LevelAccessor world;

											public void start(LevelAccessor world, int waitTicks) {
												this.waitTicks = waitTicks;
												MinecraftForge.EVENT_BUS.register(this);
												this.world = world;
											}

											@SubscribeEvent
											public void tick(TickEvent.ServerTickEvent event) {
												if (event.phase == TickEvent.Phase.END) {
													this.ticks += 1;
													if (this.ticks >= this.waitTicks)
														run();
												}
											}

											private void run() {
												if (world instanceof Level _level) {
													if (!_level.isClientSide()) {
														_level.playSound(null, new BlockPos(x, y, z),
																ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.creeper.primed")),
																SoundSource.NEUTRAL, 1, 1);
													} else {
														_level.playLocalSound(x, y, z,
																ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.creeper.primed")),
																SoundSource.NEUTRAL, 1, 1, false);
													}
												}
												new Object() {
													private int ticks = 0;
													private float waitTicks;
													private LevelAccessor world;

													public void start(LevelAccessor world, int waitTicks) {
														this.waitTicks = waitTicks;
														MinecraftForge.EVENT_BUS.register(this);
														this.world = world;
													}

													@SubscribeEvent
													public void tick(TickEvent.ServerTickEvent event) {
														if (event.phase == TickEvent.Phase.END) {
															this.ticks += 1;
															if (this.ticks >= this.waitTicks)
																run();
														}
													}

													private void run() {
														if (world instanceof Level _level) {
															if (!_level.isClientSide()) {
																_level.playSound(null, new BlockPos(x, y, z),
																		ForgeRegistries.SOUND_EVENTS
																				.getValue(new ResourceLocation("entity.creeper.primed")),
																		SoundSource.NEUTRAL, 1, 1);
															} else {
																_level.playLocalSound(x, y, z,
																		ForgeRegistries.SOUND_EVENTS
																				.getValue(new ResourceLocation("entity.creeper.primed")),
																		SoundSource.NEUTRAL, 1, 1, false);
															}
														}
														new Object() {
															private int ticks = 0;
															private float waitTicks;
															private LevelAccessor world;

															public void start(LevelAccessor world, int waitTicks) {
																this.waitTicks = waitTicks;
																MinecraftForge.EVENT_BUS.register(this);
																this.world = world;
															}

															@SubscribeEvent
															public void tick(TickEvent.ServerTickEvent event) {
																if (event.phase == TickEvent.Phase.END) {
																	this.ticks += 1;
																	if (this.ticks >= this.waitTicks)
																		run();
																}
															}

															private void run() {
																if (world instanceof Level _level) {
																	if (!_level.isClientSide()) {
																		_level.playSound(null, new BlockPos(x, y, z),
																				ForgeRegistries.SOUND_EVENTS
																						.getValue(new ResourceLocation("entity.creeper.primed")),
																				SoundSource.NEUTRAL, 1, 1);
																	} else {
																		_level.playLocalSound(x, y, z,
																				ForgeRegistries.SOUND_EVENTS
																						.getValue(new ResourceLocation("entity.creeper.primed")),
																				SoundSource.NEUTRAL, 1, 1, false);
																	}
																}
																new Object() {
																	private int ticks = 0;
																	private float waitTicks;
																	private LevelAccessor world;

																	public void start(LevelAccessor world, int waitTicks) {
																		this.waitTicks = waitTicks;
																		MinecraftForge.EVENT_BUS.register(this);
																		this.world = world;
																	}

																	@SubscribeEvent
																	public void tick(TickEvent.ServerTickEvent event) {
																		if (event.phase == TickEvent.Phase.END) {
																			this.ticks += 1;
																			if (this.ticks >= this.waitTicks)
																				run();
																		}
																	}

																	private void run() {
																		if (world instanceof Level _level) {
																			if (!_level.isClientSide()) {
																				_level.playSound(null, new BlockPos(x, y, z),
																						ForgeRegistries.SOUND_EVENTS.getValue(
																								new ResourceLocation("entity.creeper.primed")),
																						SoundSource.NEUTRAL, 1, 1);
																			} else {
																				_level.playLocalSound(x, y, z,
																						ForgeRegistries.SOUND_EVENTS.getValue(
																								new ResourceLocation("entity.creeper.primed")),
																						SoundSource.NEUTRAL, 1, 1, false);
																			}
																		}
																		new Object() {
																			private int ticks = 0;
																			private float waitTicks;
																			private LevelAccessor world;

																			public void start(LevelAccessor world, int waitTicks) {
																				this.waitTicks = waitTicks;
																				MinecraftForge.EVENT_BUS.register(this);
																				this.world = world;
																			}

																			@SubscribeEvent
																			public void tick(TickEvent.ServerTickEvent event) {
																				if (event.phase == TickEvent.Phase.END) {
																					this.ticks += 1;
																					if (this.ticks >= this.waitTicks)
																						run();
																				}
																			}

																			private void run() {
																				if (world instanceof Level _level) {
																					if (!_level.isClientSide()) {
																						_level.playSound(null, new BlockPos(x, y, z),
																								ForgeRegistries.SOUND_EVENTS
																										.getValue(new ResourceLocation(
																												"entity.creeper.primed")),
																								SoundSource.NEUTRAL, 1, 1);
																					} else {
																						_level.playLocalSound(x, y, z,
																								ForgeRegistries.SOUND_EVENTS
																										.getValue(new ResourceLocation(
																												"entity.creeper.primed")),
																								SoundSource.NEUTRAL, 1, 1, false);
																					}
																				}
																				new Object() {
																					private int ticks = 0;
																					private float waitTicks;
																					private LevelAccessor world;

																					public void start(LevelAccessor world, int waitTicks) {
																						this.waitTicks = waitTicks;
																						MinecraftForge.EVENT_BUS.register(this);
																						this.world = world;
																					}

																					@SubscribeEvent
																					public void tick(TickEvent.ServerTickEvent event) {
																						if (event.phase == TickEvent.Phase.END) {
																							this.ticks += 1;
																							if (this.ticks >= this.waitTicks)
																								run();
																						}
																					}

																					private void run() {
																						if (world instanceof Level _level) {
																							if (!_level.isClientSide()) {
																								_level.playSound(null, new BlockPos(x, y, z),
																										ForgeRegistries.SOUND_EVENTS
																												.getValue(new ResourceLocation(
																														"entity.creeper.primed")),
																										SoundSource.NEUTRAL, 1, 1);
																							} else {
																								_level.playLocalSound(x, y, z,
																										ForgeRegistries.SOUND_EVENTS
																												.getValue(new ResourceLocation(
																														"entity.creeper.primed")),
																										SoundSource.NEUTRAL, 1, 1, false);
																							}
																						}
																						new Object() {
																							private int ticks = 0;
																							private float waitTicks;
																							private LevelAccessor world;

																							public void start(LevelAccessor world, int waitTicks) {
																								this.waitTicks = waitTicks;
																								MinecraftForge.EVENT_BUS.register(this);
																								this.world = world;
																							}

																							@SubscribeEvent
																							public void tick(TickEvent.ServerTickEvent event) {
																								if (event.phase == TickEvent.Phase.END) {
																									this.ticks += 1;
																									if (this.ticks >= this.waitTicks)
																										run();
																								}
																							}

																							private void run() {
																								if (world instanceof Level _level) {
																									if (!_level.isClientSide()) {
																										_level.playSound(null, new BlockPos(x, y, z),
																												ForgeRegistries.SOUND_EVENTS.getValue(
																														new ResourceLocation(
																																"entity.creeper.primed")),
																												SoundSource.NEUTRAL, 1, 1);
																									} else {
																										_level.playLocalSound(x, y, z,
																												ForgeRegistries.SOUND_EVENTS.getValue(
																														new ResourceLocation(
																																"entity.creeper.primed")),
																												SoundSource.NEUTRAL, 1, 1, false);
																									}
																								}
																								new Object() {
																									private int ticks = 0;
																									private float waitTicks;
																									private LevelAccessor world;

																									public void start(LevelAccessor world,
																											int waitTicks) {
																										this.waitTicks = waitTicks;
																										MinecraftForge.EVENT_BUS.register(this);
																										this.world = world;
																									}

																									@SubscribeEvent
																									public void tick(
																											TickEvent.ServerTickEvent event) {
																										if (event.phase == TickEvent.Phase.END) {
																											this.ticks += 1;
																											if (this.ticks >= this.waitTicks)
																												run();
																										}
																									}

																									private void run() {
																										if (world instanceof Level _level) {
																											if (!_level.isClientSide()) {
																												_level.playSound(null,
																														new BlockPos(x, y, z),
																														ForgeRegistries.SOUND_EVENTS
																																.getValue(
																																		new ResourceLocation(
																																				"entity.creeper.primed")),
																														SoundSource.NEUTRAL, 1, 1);
																											} else {
																												_level.playLocalSound(x, y, z,
																														ForgeRegistries.SOUND_EVENTS
																																.getValue(
																																		new ResourceLocation(
																																				"entity.creeper.primed")),
																														SoundSource.NEUTRAL, 1, 1,
																														false);
																											}
																										}
																										new Object() {
																											private int ticks = 0;
																											private float waitTicks;
																											private LevelAccessor world;

																											public void start(LevelAccessor world,
																													int waitTicks) {
																												this.waitTicks = waitTicks;
																												MinecraftForge.EVENT_BUS
																														.register(this);
																												this.world = world;
																											}

																											@SubscribeEvent
																											public void tick(
																													TickEvent.ServerTickEvent event) {
																												if (event.phase == TickEvent.Phase.END) {
																													this.ticks += 1;
																													if (this.ticks >= this.waitTicks)
																														run();
																												}
																											}

																											private void run() {
																												if (world instanceof Level _level) {
																													if (!_level.isClientSide()) {
																														_level.playSound(null,
																																new BlockPos(x, y, z),
																																ForgeRegistries.SOUND_EVENTS
																																		.getValue(
																																				new ResourceLocation(
																																						"entity.creeper.primed")),
																																SoundSource.NEUTRAL,
																																1, 1);
																													} else {
																														_level.playLocalSound(x, y, z,
																																ForgeRegistries.SOUND_EVENTS
																																		.getValue(
																																				new ResourceLocation(
																																						"entity.creeper.primed")),
																																SoundSource.NEUTRAL,
																																1, 1, false);
																													}
																												}
																												new Object() {
																													private int ticks = 0;
																													private float waitTicks;
																													private LevelAccessor world;

																													public void start(
																															LevelAccessor world,
																															int waitTicks) {
																														this.waitTicks = waitTicks;
																														MinecraftForge.EVENT_BUS
																																.register(this);
																														this.world = world;
																													}

																													@SubscribeEvent
																													public void tick(
																															TickEvent.ServerTickEvent event) {
																														if (event.phase == TickEvent.Phase.END) {
																															this.ticks += 1;
																															if (this.ticks >= this.waitTicks)
																																run();
																														}
																													}

																													private void run() {
																														if (world instanceof Level _level) {
																															if (!_level
																																	.isClientSide()) {
																																_level.playSound(null,
																																		new BlockPos(
																																				x, y,
																																				z),
																																		ForgeRegistries.SOUND_EVENTS
																																				.getValue(
																																						new ResourceLocation(
																																								"entity.creeper.primed")),
																																		SoundSource.NEUTRAL,
																																		1, 1);
																															} else {
																																_level.playLocalSound(
																																		x, y, z,
																																		ForgeRegistries.SOUND_EVENTS
																																				.getValue(
																																						new ResourceLocation(
																																								"entity.creeper.primed")),
																																		SoundSource.NEUTRAL,
																																		1, 1, false);
																															}
																														}
																														new Object() {
																															private int ticks = 0;
																															private float waitTicks;
																															private LevelAccessor world;

																															public void start(
																																	LevelAccessor world,
																																	int waitTicks) {
																																this.waitTicks = waitTicks;
																																MinecraftForge.EVENT_BUS
																																		.register(
																																				this);
																																this.world = world;
																															}

																															@SubscribeEvent
																															public void tick(
																																	TickEvent.ServerTickEvent event) {
																																if (event.phase == TickEvent.Phase.END) {
																																	this.ticks += 1;
																																	if (this.ticks >= this.waitTicks)
																																		run();
																																}
																															}

																															private void run() {
																																if (world instanceof Level _level) {
																																	if (!_level
																																			.isClientSide()) {
																																		_level.playSound(
																																				null,
																																				new BlockPos(
																																						x,
																																						y,
																																						z),
																																				ForgeRegistries.SOUND_EVENTS
																																						.getValue(
																																								new ResourceLocation(
																																										"entity.creeper.primed")),
																																				SoundSource.NEUTRAL,
																																				1, 1);
																																	} else {
																																		_level.playLocalSound(
																																				x, y,
																																				z,
																																				ForgeRegistries.SOUND_EVENTS
																																						.getValue(
																																								new ResourceLocation(
																																										"entity.creeper.primed")),
																																				SoundSource.NEUTRAL,
																																				1, 1,
																																				false);
																																	}
																																}
																																new Object() {
																																	private int ticks = 0;
																																	private float waitTicks;
																																	private LevelAccessor world;

																																	public void start(
																																			LevelAccessor world,
																																			int waitTicks) {
																																		this.waitTicks = waitTicks;
																																		MinecraftForge.EVENT_BUS
																																				.register(
																																						this);
																																		this.world = world;
																																	}

																																	@SubscribeEvent
																																	public void tick(
																																			TickEvent.ServerTickEvent event) {
																																		if (event.phase == TickEvent.Phase.END) {
																																			this.ticks += 1;
																																			if (this.ticks >= this.waitTicks)
																																				run();
																																		}
																																	}

																																	private void run() {
																																		if (world instanceof Level _level) {
																																			if (!_level
																																					.isClientSide()) {
																																				_level.playSound(
																																						null,
																																						new BlockPos(
																																								x,
																																								y,
																																								z),
																																						ForgeRegistries.SOUND_EVENTS
																																								.getValue(
																																										new ResourceLocation(
																																												"entity.creeper.primed")),
																																						SoundSource.NEUTRAL,
																																						1,
																																						1);
																																			} else {
																																				_level.playLocalSound(
																																						x,
																																						y,
																																						z,
																																						ForgeRegistries.SOUND_EVENTS
																																								.getValue(
																																										new ResourceLocation(
																																												"entity.creeper.primed")),
																																						SoundSource.NEUTRAL,
																																						1,
																																						1,
																																						false);
																																			}
																																		}
																																		new Object() {
																																			private int ticks = 0;
																																			private float waitTicks;
																																			private LevelAccessor world;

																																			public void start(
																																					LevelAccessor world,
																																					int waitTicks) {
																																				this.waitTicks = waitTicks;
																																				MinecraftForge.EVENT_BUS
																																						.register(
																																								this);
																																				this.world = world;
																																			}

																																			@SubscribeEvent
																																			public void tick(
																																					TickEvent.ServerTickEvent event) {
																																				if (event.phase == TickEvent.Phase.END) {
																																					this.ticks += 1;
																																					if (this.ticks >= this.waitTicks)
																																						run();
																																				}
																																			}

																																			private void run() {
																																				if (world instanceof Level _level) {
																																					if (!_level
																																							.isClientSide()) {
																																						_level.playSound(
																																								null,
																																								new BlockPos(
																																										x,
																																										y,
																																										z),
																																								ForgeRegistries.SOUND_EVENTS
																																										.getValue(
																																												new ResourceLocation(
																																														"entity.creeper.primed")),
																																								SoundSource.NEUTRAL,
																																								1,
																																								1);
																																					} else {
																																						_level.playLocalSound(
																																								x,
																																								y,
																																								z,
																																								ForgeRegistries.SOUND_EVENTS
																																										.getValue(
																																												new ResourceLocation(
																																														"entity.creeper.primed")),
																																								SoundSource.NEUTRAL,
																																								1,
																																								1,
																																								false);
																																					}
																																				}
																																				new Object() {
																																					private int ticks = 0;
																																					private float waitTicks;
																																					private LevelAccessor world;

																																					public void start(
																																							LevelAccessor world,
																																							int waitTicks) {
																																						this.waitTicks = waitTicks;
																																						MinecraftForge.EVENT_BUS
																																								.register(
																																										this);
																																						this.world = world;
																																					}

																																					@SubscribeEvent
																																					public void tick(
																																							TickEvent.ServerTickEvent event) {
																																						if (event.phase == TickEvent.Phase.END) {
																																							this.ticks += 1;
																																							if (this.ticks >= this.waitTicks)
																																								run();
																																						}
																																					}

																																					private void run() {
																																						if (world instanceof Level _level) {
																																							if (!_level
																																									.isClientSide()) {
																																								_level.playSound(
																																										null,
																																										new BlockPos(
																																												x,
																																												y,
																																												z),
																																										ForgeRegistries.SOUND_EVENTS
																																												.getValue(
																																														new ResourceLocation(
																																																"entity.creeper.primed")),
																																										SoundSource.NEUTRAL,
																																										1,
																																										1);
																																							} else {
																																								_level.playLocalSound(
																																										x,
																																										y,
																																										z,
																																										ForgeRegistries.SOUND_EVENTS
																																												.getValue(
																																														new ResourceLocation(
																																																"entity.creeper.primed")),
																																										SoundSource.NEUTRAL,
																																										1,
																																										1,
																																										false);
																																							}
																																						}
																																						new Object() {
																																							private int ticks = 0;
																																							private float waitTicks;
																																							private LevelAccessor world;

																																							public void start(
																																									LevelAccessor world,
																																									int waitTicks) {
																																								this.waitTicks = waitTicks;
																																								MinecraftForge.EVENT_BUS
																																										.register(
																																												this);
																																								this.world = world;
																																							}

																																							@SubscribeEvent
																																							public void tick(
																																									TickEvent.ServerTickEvent event) {
																																								if (event.phase == TickEvent.Phase.END) {
																																									this.ticks += 1;
																																									if (this.ticks >= this.waitTicks)
																																										run();
																																								}
																																							}

																																							private void run() {
																																								if (world instanceof Level _level) {
																																									if (!_level
																																											.isClientSide()) {
																																										_level.playSound(
																																												null,
																																												new BlockPos(
																																														x,
																																														y,
																																														z),
																																												ForgeRegistries.SOUND_EVENTS
																																														.getValue(
																																																new ResourceLocation(
																																																		"entity.creeper.primed")),
																																												SoundSource.NEUTRAL,
																																												1,
																																												1);
																																									} else {
																																										_level.playLocalSound(
																																												x,
																																												y,
																																												z,
																																												ForgeRegistries.SOUND_EVENTS
																																														.getValue(
																																																new ResourceLocation(
																																																		"entity.creeper.primed")),
																																												SoundSource.NEUTRAL,
																																												1,
																																												1,
																																												false);
																																									}
																																								}
																																								new Object() {
																																									private int ticks = 0;
																																									private float waitTicks;
																																									private LevelAccessor world;

																																									public void start(
																																											LevelAccessor world,
																																											int waitTicks) {
																																										this.waitTicks = waitTicks;
																																										MinecraftForge.EVENT_BUS
																																												.register(
																																														this);
																																										this.world = world;
																																									}

																																									@SubscribeEvent
																																									public void tick(
																																											TickEvent.ServerTickEvent event) {
																																										if (event.phase == TickEvent.Phase.END) {
																																											this.ticks += 1;
																																											if (this.ticks >= this.waitTicks)
																																												run();
																																										}
																																									}

																																									private void run() {
																																										if (world instanceof Level _level) {
																																											if (!_level
																																													.isClientSide()) {
																																												_level.playSound(
																																														null,
																																														new BlockPos(
																																																x,
																																																y,
																																																z),
																																														ForgeRegistries.SOUND_EVENTS
																																																.getValue(
																																																		new ResourceLocation(
																																																				"entity.creeper.primed")),
																																														SoundSource.NEUTRAL,
																																														1,
																																														1);
																																											} else {
																																												_level.playLocalSound(
																																														x,
																																														y,
																																														z,
																																														ForgeRegistries.SOUND_EVENTS
																																																.getValue(
																																																		new ResourceLocation(
																																																				"entity.creeper.primed")),
																																														SoundSource.NEUTRAL,
																																														1,
																																														1,
																																														false);
																																											}
																																										}
																																										entity.hurt(
																																												DamageSource.GENERIC,
																																												2147483647);
																																										MinecraftForge.EVENT_BUS
																																												.unregister(
																																														this);
																																									}
																																								}.start(world,
																																										5);
																																								MinecraftForge.EVENT_BUS
																																										.unregister(
																																												this);
																																							}
																																						}.start(world,
																																								5);
																																						MinecraftForge.EVENT_BUS
																																								.unregister(
																																										this);
																																					}
																																				}.start(world,
																																						5);
																																				MinecraftForge.EVENT_BUS
																																						.unregister(
																																								this);
																																			}
																																		}.start(world,
																																				5);
																																		MinecraftForge.EVENT_BUS
																																				.unregister(
																																						this);
																																	}
																																}.start(world, 5);
																																MinecraftForge.EVENT_BUS
																																		.unregister(
																																				this);
																															}
																														}.start(world, 5);
																														MinecraftForge.EVENT_BUS
																																.unregister(this);
																													}
																												}.start(world, 5);
																												MinecraftForge.EVENT_BUS
																														.unregister(this);
																											}
																										}.start(world, 5);
																										MinecraftForge.EVENT_BUS.unregister(this);
																									}
																								}.start(world, 5);
																								MinecraftForge.EVENT_BUS.unregister(this);
																							}
																						}.start(world, 5);
																						MinecraftForge.EVENT_BUS.unregister(this);
																					}
																				}.start(world, 5);
																				MinecraftForge.EVENT_BUS.unregister(this);
																			}
																		}.start(world, 5);
																		MinecraftForge.EVENT_BUS.unregister(this);
																	}
																}.start(world, 5);
																MinecraftForge.EVENT_BUS.unregister(this);
															}
														}.start(world, 5);
														MinecraftForge.EVENT_BUS.unregister(this);
													}
												}.start(world, 5);
												MinecraftForge.EVENT_BUS.unregister(this);
											}
										}.start(world, 5);
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, 5);
								MinecraftForge.EVENT_BUS.unregister(this);
							}
						}.start(world, 5);
						MinecraftForge.EVENT_BUS.unregister(this);
					}
				}.start(world, 5);
				MinecraftForge.EVENT_BUS.unregister(this);
			}
		}.start(world, 5);
	}
}
