package net.mcreator.essentialadditions.procedures;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;

import java.util.HashMap;

public class ExplodeCommandExecutedProcedure {
	public static void execute(LevelAccessor world, HashMap cmdparams) {
		if (cmdparams == null)
			return;
		if ((cmdparams.containsKey("4") ? cmdparams.get("4").toString() : "").equals("break")) {
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(cmdparams.containsKey("0") ? cmdparams.get("0").toString() : ""), new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(cmdparams.containsKey("1") ? cmdparams.get("1").toString() : ""), new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(cmdparams.containsKey("2") ? cmdparams.get("2").toString() : ""), (float) new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(cmdparams.containsKey("3") ? cmdparams.get("3").toString() : ""), Explosion.BlockInteraction.BREAK);
		} else if ((cmdparams.containsKey("4") ? cmdparams.get("4").toString() : "").equals("destroy")) {
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(cmdparams.containsKey("0") ? cmdparams.get("0").toString() : ""), new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(cmdparams.containsKey("1") ? cmdparams.get("1").toString() : ""), new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(cmdparams.containsKey("2") ? cmdparams.get("2").toString() : ""), (float) new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(cmdparams.containsKey("3") ? cmdparams.get("3").toString() : ""), Explosion.BlockInteraction.DESTROY);
		} else if ((cmdparams.containsKey("4") ? cmdparams.get("4").toString() : "").equals("none")) {
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(cmdparams.containsKey("0") ? cmdparams.get("0").toString() : ""), new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(cmdparams.containsKey("1") ? cmdparams.get("1").toString() : ""), new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(cmdparams.containsKey("2") ? cmdparams.get("2").toString() : ""), (float) new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(cmdparams.containsKey("3") ? cmdparams.get("3").toString() : ""), Explosion.BlockInteraction.NONE);
		}
	}
}
