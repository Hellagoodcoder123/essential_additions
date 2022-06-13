package net.mcreator.essentialadditions.procedures;

import org.checkerframework.checker.units.qual.s;

import java.util.HashMap;

public class IsSquareNumberProcedure {
	public static boolean execute(HashMap cmdparams) {
		if (cmdparams == null)
			return false;
		return Math.sqrt(new Object() {
			double convert(String s) {
				try {
					return Double.parseDouble(s.trim());
				} catch (Exception e) {
				}
				return 0;
			}
		}.convert(cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "")) == Math.floor(Math.sqrt(new Object() {
			double convert(String s) {
				try {
					return Double.parseDouble(s.trim());
				} catch (Exception e) {
				}
				return 0;
			}
		}.convert(cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "")));
	}
}
