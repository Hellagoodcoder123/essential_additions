package net.mcreator.essentialadditions.procedures;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.ItemStack;

import java.util.Map;
import java.util.HashMap;

public class EnchCommandExecutedProcedure {
	public static void execute(ItemStack itemstack, HashMap cmdparams) {
		if (cmdparams == null)
			return;
		/*Only works with vanilla and essential additions enchantments*/
		if ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("add")) {
			if ((cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("protection")
					|| (cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("prot")) {
				(itemstack).enchant(Enchantments.ALL_DAMAGE_PROTECTION, (int) new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(cmdparams.containsKey("2") ? cmdparams.get("2").toString() : ""));
			} else if ((cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("fireprot")
					|| (cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("fireprotection")
					|| (cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("fire_prot")
					|| (cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("fire_protection")) {
				(itemstack).enchant(Enchantments.FIRE_PROTECTION, (int) new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(cmdparams.containsKey("2") ? cmdparams.get("2").toString() : ""));
			} else if ((cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("featherfalling")
					|| (cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("feather_falling")) {
				(itemstack).enchant(Enchantments.FALL_PROTECTION, (int) new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(cmdparams.containsKey("2") ? cmdparams.get("2").toString() : ""));
			} else if ((cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("blastprot")
					|| (cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("blastprotection")
					|| (cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("blast_prot")
					|| (cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("blast_protection")) {
				(itemstack).enchant(Enchantments.BLAST_PROTECTION, (int) new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(cmdparams.containsKey("2") ? cmdparams.get("2").toString() : ""));
			} else if ((cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("projectileprot")
					|| (cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("projectileprotection")
					|| (cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("projectile_prot")
					|| (cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("projectile_protection")) {
				(itemstack).enchant(Enchantments.PROJECTILE_PROTECTION, (int) new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(cmdparams.containsKey("2") ? cmdparams.get("2").toString() : ""));
			} else if ((cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("respiration")) {
				(itemstack).enchant(Enchantments.RESPIRATION, (int) new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(cmdparams.containsKey("2") ? cmdparams.get("2").toString() : ""));
			} else if ((cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("aquaaffinity")
					|| (cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("aqua_affinity")) {
				(itemstack).enchant(Enchantments.AQUA_AFFINITY, (int) new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(cmdparams.containsKey("2") ? cmdparams.get("2").toString() : ""));
			} else if ((cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("thorns")) {
				(itemstack).enchant(Enchantments.THORNS, (int) new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(cmdparams.containsKey("2") ? cmdparams.get("2").toString() : ""));
			} else if ((cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("depthstrider")
					|| (cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("depth_strider")) {
				(itemstack).enchant(Enchantments.DEPTH_STRIDER, (int) new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(cmdparams.containsKey("2") ? cmdparams.get("2").toString() : ""));
			} else if ((cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("frostwalker")
					|| (cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("frost_walker")) {
				(itemstack).enchant(Enchantments.FROST_WALKER, (int) new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(cmdparams.containsKey("2") ? cmdparams.get("2").toString() : ""));
			} else if ((cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("cursebinding")
					|| (cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("curse_binding")
					|| (cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("curse_of_binding")
					|| (cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("curseofbinding")) {
				(itemstack).enchant(Enchantments.BINDING_CURSE, (int) new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(cmdparams.containsKey("2") ? cmdparams.get("2").toString() : ""));
			} else if ((cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("sharp")
					|| (cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("sharpness")) {
				(itemstack).enchant(Enchantments.SHARPNESS, (int) new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(cmdparams.containsKey("2") ? cmdparams.get("2").toString() : ""));
			} else if ((cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("smite")) {
				(itemstack).enchant(Enchantments.SMITE, (int) new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(cmdparams.containsKey("2") ? cmdparams.get("2").toString() : ""));
			} else if ((cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("baneofarthropods")
					|| (cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("banearthropods")
					|| (cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("bane_arthropods")
					|| (cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("bane_of_arthropods")) {
				(itemstack).enchant(Enchantments.BANE_OF_ARTHROPODS, (int) new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(cmdparams.containsKey("2") ? cmdparams.get("2").toString() : ""));
			} else if ((cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("kb")
					|| (cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("knockback")) {
				(itemstack).enchant(Enchantments.KNOCKBACK, (int) new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(cmdparams.containsKey("2") ? cmdparams.get("2").toString() : ""));
			} else if ((cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("fireaspect")
					|| (cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("fire_aspect")) {
				(itemstack).enchant(Enchantments.FIRE_ASPECT, (int) new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(cmdparams.containsKey("2") ? cmdparams.get("2").toString() : ""));
			} else if ((cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("looting")) {
				(itemstack).enchant(Enchantments.MOB_LOOTING, (int) new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(cmdparams.containsKey("2") ? cmdparams.get("2").toString() : ""));
			} else if ((cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("sweepingedge")
					|| (cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("sweeping")
					|| (cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("sweeping_edge")) {
				(itemstack).enchant(Enchantments.SWEEPING_EDGE, (int) new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(cmdparams.containsKey("2") ? cmdparams.get("2").toString() : ""));
			} else if ((cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("efficiency")) {
				(itemstack).enchant(Enchantments.BLOCK_EFFICIENCY, (int) new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(cmdparams.containsKey("2") ? cmdparams.get("2").toString() : ""));
			} else if ((cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("silktouch")
					|| (cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("silk_touch")) {
				(itemstack).enchant(Enchantments.SILK_TOUCH, (int) new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(cmdparams.containsKey("2") ? cmdparams.get("2").toString() : ""));
			} else if ((cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("unbreaking")) {
				(itemstack).enchant(Enchantments.UNBREAKING, (int) new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(cmdparams.containsKey("2") ? cmdparams.get("2").toString() : ""));
			} else if ((cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("fortune")) {
				(itemstack).enchant(Enchantments.BLOCK_FORTUNE, (int) new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(cmdparams.containsKey("2") ? cmdparams.get("2").toString() : ""));
			} else if ((cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("power")) {
				(itemstack).enchant(Enchantments.POWER_ARROWS, (int) new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(cmdparams.containsKey("2") ? cmdparams.get("2").toString() : ""));
			} else if ((cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("punch")) {
				(itemstack).enchant(Enchantments.PUNCH_ARROWS, (int) new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(cmdparams.containsKey("2") ? cmdparams.get("2").toString() : ""));
			} else if ((cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("flame")) {
				(itemstack).enchant(Enchantments.FLAMING_ARROWS, (int) new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(cmdparams.containsKey("2") ? cmdparams.get("2").toString() : ""));
			} else if ((cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("infinity")) {
				(itemstack).enchant(Enchantments.INFINITY_ARROWS, (int) new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(cmdparams.containsKey("2") ? cmdparams.get("2").toString() : ""));
			} else if ((cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("lucksea")
					|| (cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("luck_sea")
					|| (cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("luckofthesea")
					|| (cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("luck_of_the_sea")) {
				(itemstack).enchant(Enchantments.FISHING_LUCK, (int) new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(cmdparams.containsKey("2") ? cmdparams.get("2").toString() : ""));
			} else if ((cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("lure")) {
				(itemstack).enchant(Enchantments.FISHING_SPEED, (int) new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(cmdparams.containsKey("2") ? cmdparams.get("2").toString() : ""));
			} else if ((cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("loyalty")) {
				(itemstack).enchant(Enchantments.LOYALTY, (int) new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(cmdparams.containsKey("2") ? cmdparams.get("2").toString() : ""));
			} else if ((cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("impaling")) {
				(itemstack).enchant(Enchantments.IMPALING, (int) new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(cmdparams.containsKey("2") ? cmdparams.get("2").toString() : ""));
			} else if ((cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("riptide")) {
				(itemstack).enchant(Enchantments.RIPTIDE, (int) new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(cmdparams.containsKey("2") ? cmdparams.get("2").toString() : ""));
			} else if ((cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("channeling")) {
				(itemstack).enchant(Enchantments.CHANNELING, (int) new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(cmdparams.containsKey("2") ? cmdparams.get("2").toString() : ""));
			} else if ((cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("multishot")) {
				(itemstack).enchant(Enchantments.MULTISHOT, (int) new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(cmdparams.containsKey("2") ? cmdparams.get("2").toString() : ""));
			} else if ((cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("quickcharge")
					|| (cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("quick_charge")) {
				(itemstack).enchant(Enchantments.QUICK_CHARGE, (int) new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(cmdparams.containsKey("2") ? cmdparams.get("2").toString() : ""));
			} else if ((cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("piercing")) {
				(itemstack).enchant(Enchantments.PIERCING, (int) new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(cmdparams.containsKey("2") ? cmdparams.get("2").toString() : ""));
			} else if ((cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("mending")) {
				(itemstack).enchant(Enchantments.MENDING, (int) new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(cmdparams.containsKey("2") ? cmdparams.get("2").toString() : ""));
			} else if ((cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("curse_vanishing")
					|| (cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("curseofvanishing")
					|| (cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("cursevanishing")
					|| (cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("curse_of_vanishing")) {
				(itemstack).enchant(Enchantments.VANISHING_CURSE, (int) new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(cmdparams.containsKey("2") ? cmdparams.get("2").toString() : ""));
			} else if ((cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("soulspeed")
					|| (cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("soul_speed")) {
				(itemstack).enchant(Enchantments.SOUL_SPEED, (int) new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(cmdparams.containsKey("2") ? cmdparams.get("2").toString() : ""));
			}
		} else if ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("remove")) {
			if ((cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("protection")
					|| (cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("prot")) {
				{
					Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments(itemstack);
					if (_enchantments.containsKey(Enchantments.ALL_DAMAGE_PROTECTION)) {
						_enchantments.remove(Enchantments.ALL_DAMAGE_PROTECTION);
						EnchantmentHelper.setEnchantments(_enchantments, itemstack);
					}
				}
			} else if ((cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("fireprot")
					|| (cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("fireprotection")
					|| (cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("fire_prot")
					|| (cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("fire_protection")) {
				{
					Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments(itemstack);
					if (_enchantments.containsKey(Enchantments.FIRE_PROTECTION)) {
						_enchantments.remove(Enchantments.FIRE_PROTECTION);
						EnchantmentHelper.setEnchantments(_enchantments, itemstack);
					}
				}
			} else if ((cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("featherfalling")
					|| (cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("feather_falling")) {
				{
					Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments(itemstack);
					if (_enchantments.containsKey(Enchantments.FALL_PROTECTION)) {
						_enchantments.remove(Enchantments.FALL_PROTECTION);
						EnchantmentHelper.setEnchantments(_enchantments, itemstack);
					}
				}
			} else if ((cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("blast_protection")) {
				{
					Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments(itemstack);
					if (_enchantments.containsKey(Enchantments.BLAST_PROTECTION)) {
						_enchantments.remove(Enchantments.BLAST_PROTECTION);
						EnchantmentHelper.setEnchantments(_enchantments, itemstack);
					}
				}
			} else if ((cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("projectile_protection")) {
				{
					Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments(itemstack);
					if (_enchantments.containsKey(Enchantments.PROJECTILE_PROTECTION)) {
						_enchantments.remove(Enchantments.PROJECTILE_PROTECTION);
						EnchantmentHelper.setEnchantments(_enchantments, itemstack);
					}
				}
			} else if ((cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("respiration")) {
				{
					Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments(itemstack);
					if (_enchantments.containsKey(Enchantments.RESPIRATION)) {
						_enchantments.remove(Enchantments.RESPIRATION);
						EnchantmentHelper.setEnchantments(_enchantments, itemstack);
					}
				}
			} else if ((cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("aqua_affinity")) {
				{
					Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments(itemstack);
					if (_enchantments.containsKey(Enchantments.AQUA_AFFINITY)) {
						_enchantments.remove(Enchantments.AQUA_AFFINITY);
						EnchantmentHelper.setEnchantments(_enchantments, itemstack);
					}
				}
			} else if ((cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("thorns")) {
				{
					Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments(itemstack);
					if (_enchantments.containsKey(Enchantments.THORNS)) {
						_enchantments.remove(Enchantments.THORNS);
						EnchantmentHelper.setEnchantments(_enchantments, itemstack);
					}
				}
			} else if ((cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("depth_strider")) {
				{
					Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments(itemstack);
					if (_enchantments.containsKey(Enchantments.DEPTH_STRIDER)) {
						_enchantments.remove(Enchantments.DEPTH_STRIDER);
						EnchantmentHelper.setEnchantments(_enchantments, itemstack);
					}
				}
			} else if ((cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("frost_walker")) {
				{
					Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments(itemstack);
					if (_enchantments.containsKey(Enchantments.FROST_WALKER)) {
						_enchantments.remove(Enchantments.FROST_WALKER);
						EnchantmentHelper.setEnchantments(_enchantments, itemstack);
					}
				}
			} else if ((cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("curse_of_binding")) {
				{
					Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments(itemstack);
					if (_enchantments.containsKey(Enchantments.BINDING_CURSE)) {
						_enchantments.remove(Enchantments.BINDING_CURSE);
						EnchantmentHelper.setEnchantments(_enchantments, itemstack);
					}
				}
			} else if ((cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("sharpness")) {
				{
					Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments(itemstack);
					if (_enchantments.containsKey(Enchantments.SHARPNESS)) {
						_enchantments.remove(Enchantments.SHARPNESS);
						EnchantmentHelper.setEnchantments(_enchantments, itemstack);
					}
				}
			} else if ((cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("smite")) {
				{
					Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments(itemstack);
					if (_enchantments.containsKey(Enchantments.SMITE)) {
						_enchantments.remove(Enchantments.SMITE);
						EnchantmentHelper.setEnchantments(_enchantments, itemstack);
					}
				}
			} else if ((cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("bane_of_arthropods")) {
				{
					Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments(itemstack);
					if (_enchantments.containsKey(Enchantments.BANE_OF_ARTHROPODS)) {
						_enchantments.remove(Enchantments.BANE_OF_ARTHROPODS);
						EnchantmentHelper.setEnchantments(_enchantments, itemstack);
					}
				}
			} else if ((cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("knockback")) {
				{
					Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments(itemstack);
					if (_enchantments.containsKey(Enchantments.KNOCKBACK)) {
						_enchantments.remove(Enchantments.KNOCKBACK);
						EnchantmentHelper.setEnchantments(_enchantments, itemstack);
					}
				}
			} else if ((cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("fire_aspect")) {
				{
					Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments(itemstack);
					if (_enchantments.containsKey(Enchantments.FIRE_ASPECT)) {
						_enchantments.remove(Enchantments.FIRE_ASPECT);
						EnchantmentHelper.setEnchantments(_enchantments, itemstack);
					}
				}
			} else if ((cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("looting")) {
				{
					Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments(itemstack);
					if (_enchantments.containsKey(Enchantments.MOB_LOOTING)) {
						_enchantments.remove(Enchantments.MOB_LOOTING);
						EnchantmentHelper.setEnchantments(_enchantments, itemstack);
					}
				}
			} else if ((cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("sweeping_edge")) {
				{
					Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments(itemstack);
					if (_enchantments.containsKey(Enchantments.SWEEPING_EDGE)) {
						_enchantments.remove(Enchantments.SWEEPING_EDGE);
						EnchantmentHelper.setEnchantments(_enchantments, itemstack);
					}
				}
			} else if ((cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("efficiency")) {
				{
					Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments(itemstack);
					if (_enchantments.containsKey(Enchantments.BLOCK_EFFICIENCY)) {
						_enchantments.remove(Enchantments.BLOCK_EFFICIENCY);
						EnchantmentHelper.setEnchantments(_enchantments, itemstack);
					}
				}
			} else if ((cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("silk_touch")) {
				{
					Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments(itemstack);
					if (_enchantments.containsKey(Enchantments.SILK_TOUCH)) {
						_enchantments.remove(Enchantments.SILK_TOUCH);
						EnchantmentHelper.setEnchantments(_enchantments, itemstack);
					}
				}
			} else if ((cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("unbreaking")) {
				{
					Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments(itemstack);
					if (_enchantments.containsKey(Enchantments.UNBREAKING)) {
						_enchantments.remove(Enchantments.UNBREAKING);
						EnchantmentHelper.setEnchantments(_enchantments, itemstack);
					}
				}
			} else if ((cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("fortune")) {
				{
					Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments(itemstack);
					if (_enchantments.containsKey(Enchantments.BLOCK_FORTUNE)) {
						_enchantments.remove(Enchantments.BLOCK_FORTUNE);
						EnchantmentHelper.setEnchantments(_enchantments, itemstack);
					}
				}
			} else if ((cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("power")) {
				{
					Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments(itemstack);
					if (_enchantments.containsKey(Enchantments.POWER_ARROWS)) {
						_enchantments.remove(Enchantments.POWER_ARROWS);
						EnchantmentHelper.setEnchantments(_enchantments, itemstack);
					}
				}
			} else if ((cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("punch")) {
				{
					Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments(itemstack);
					if (_enchantments.containsKey(Enchantments.PUNCH_ARROWS)) {
						_enchantments.remove(Enchantments.PUNCH_ARROWS);
						EnchantmentHelper.setEnchantments(_enchantments, itemstack);
					}
				}
			} else if ((cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("flame")) {
				{
					Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments(itemstack);
					if (_enchantments.containsKey(Enchantments.FLAMING_ARROWS)) {
						_enchantments.remove(Enchantments.FLAMING_ARROWS);
						EnchantmentHelper.setEnchantments(_enchantments, itemstack);
					}
				}
			} else if ((cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("infinity")) {
				{
					Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments(itemstack);
					if (_enchantments.containsKey(Enchantments.INFINITY_ARROWS)) {
						_enchantments.remove(Enchantments.INFINITY_ARROWS);
						EnchantmentHelper.setEnchantments(_enchantments, itemstack);
					}
				}
			} else if ((cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("luck_of_the_sea")) {
				{
					Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments(itemstack);
					if (_enchantments.containsKey(Enchantments.FISHING_LUCK)) {
						_enchantments.remove(Enchantments.FISHING_LUCK);
						EnchantmentHelper.setEnchantments(_enchantments, itemstack);
					}
				}
			} else if ((cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("lure")) {
				{
					Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments(itemstack);
					if (_enchantments.containsKey(Enchantments.FISHING_SPEED)) {
						_enchantments.remove(Enchantments.FISHING_SPEED);
						EnchantmentHelper.setEnchantments(_enchantments, itemstack);
					}
				}
			} else if ((cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("loyalty")) {
				{
					Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments(itemstack);
					if (_enchantments.containsKey(Enchantments.LOYALTY)) {
						_enchantments.remove(Enchantments.LOYALTY);
						EnchantmentHelper.setEnchantments(_enchantments, itemstack);
					}
				}
			} else if ((cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("impaling")) {
				{
					Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments(itemstack);
					if (_enchantments.containsKey(Enchantments.IMPALING)) {
						_enchantments.remove(Enchantments.IMPALING);
						EnchantmentHelper.setEnchantments(_enchantments, itemstack);
					}
				}
			} else if ((cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("riptide")) {
				{
					Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments(itemstack);
					if (_enchantments.containsKey(Enchantments.RIPTIDE)) {
						_enchantments.remove(Enchantments.RIPTIDE);
						EnchantmentHelper.setEnchantments(_enchantments, itemstack);
					}
				}
			} else if ((cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("channeling")) {
				{
					Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments(itemstack);
					if (_enchantments.containsKey(Enchantments.CHANNELING)) {
						_enchantments.remove(Enchantments.CHANNELING);
						EnchantmentHelper.setEnchantments(_enchantments, itemstack);
					}
				}
			} else if ((cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("multishot")) {
				{
					Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments(itemstack);
					if (_enchantments.containsKey(Enchantments.MULTISHOT)) {
						_enchantments.remove(Enchantments.MULTISHOT);
						EnchantmentHelper.setEnchantments(_enchantments, itemstack);
					}
				}
			} else if ((cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("quick_charge")) {
				{
					Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments(itemstack);
					if (_enchantments.containsKey(Enchantments.QUICK_CHARGE)) {
						_enchantments.remove(Enchantments.QUICK_CHARGE);
						EnchantmentHelper.setEnchantments(_enchantments, itemstack);
					}
				}
			} else if ((cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("piercing")) {
				{
					Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments(itemstack);
					if (_enchantments.containsKey(Enchantments.PIERCING)) {
						_enchantments.remove(Enchantments.PIERCING);
						EnchantmentHelper.setEnchantments(_enchantments, itemstack);
					}
				}
			} else if ((cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("mending")) {
				{
					Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments(itemstack);
					if (_enchantments.containsKey(Enchantments.MENDING)) {
						_enchantments.remove(Enchantments.MENDING);
						EnchantmentHelper.setEnchantments(_enchantments, itemstack);
					}
				}
			} else if ((cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("curse_of_vanishing")) {
				{
					Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments(itemstack);
					if (_enchantments.containsKey(Enchantments.VANISHING_CURSE)) {
						_enchantments.remove(Enchantments.VANISHING_CURSE);
						EnchantmentHelper.setEnchantments(_enchantments, itemstack);
					}
				}
			} else if ((cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("soul_speed")) {
				{
					Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments(itemstack);
					if (_enchantments.containsKey(Enchantments.SOUL_SPEED)) {
						_enchantments.remove(Enchantments.SOUL_SPEED);
						EnchantmentHelper.setEnchantments(_enchantments, itemstack);
					}
				}
			}
		}
	}
}
