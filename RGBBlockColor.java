/*
 *  Copyright (C) 2016 Zombie_Striker
 *
 *  This program is free software; you can redistribute it and/or modify it under the terms of the
 *  GNU General Public License as published by the Free Software Foundation; either version 2 of
 *  the License, or (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 *  without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 *  See the GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License along with this program;
 *  if not, write to the Free Software Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA
 *  02111-1307 USA
 */
package me.zombie_striker.pixelprinter.util;

import java.awt.Color;
import java.awt.image.*;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.imageio.ImageIO;

import me.zombie_striker.pixelprinter.data.MaterialData;
import me.zombie_striker.pixelprinter.data.Pixel;

import org.bukkit.*;
import org.bukkit.block.Block;

/**
 * Created by Zombie_Striker on 3/30/2016
 **/
public class RGBBlockColor {

	public static Map<MaterialData, RGBBlockValue> materialValue = new HashMap<>();

	public static RGBValue getRGBFromMatData(MaterialData m) {
		return getRGBFromMatData(m, false);
	}

	public static RGBValue getRGBFromMatData(MaterialData m, boolean topView) {
		for (MaterialData h : materialValue.keySet()) {
			if (h.getM() == m.getM() && h.getData() == m.getData())
				return materialValue.get(h);
		}
		return null;
	}

	public static void activateBlocks() {

		new RGBBlockValue(new Color(85, 85, 85), new Color(85, 85, 85),
				new Color(76, 76, 76), new Color(91, 91, 91), "BEDROCK");
		new RGBBlockValue(new Color(117, 211, 215), "BEACON");
		new RGBBlockValue(new Color(148, 104, 86), "BRICK");
		new RGBBlockValue(new Color(110, 89, 65), new Color(103, 94, 51),
				new Color(119, 71, 40), new Color(99, 96, 70), "BOOKSHELF",
				false);
		// new RGBBlockValue(new Color(56, 56, 56), Material.CAULDRON); Though
		// this causes see-through placed.
		new RGBBlockValue(new Color(115, 93, 59), new Color(112, 92, 64),
				new Color(118, 97, 63), new Color(109, 102, 74), "WORKBENCH",
				false);
		new RGBBlockValue(new Color(109, 73, 44), "WORKBENCH", true);
		new RGBBlockValue(new Color(13, 96, 23), "CACTUS");// breaks=====================================================================
		new RGBBlockValue(new Color(19, 19, 19), "COAL_BLOCK");
		new RGBBlockValue(new Color(115, 115, 115), "COAL_ORE");
		new RGBBlockValue(new Color(159, 165, 177), "CLAY");
		new RGBBlockValue(new Color(228, 206, 207), "CAKE_BLOCK", true);
		new RGBBlockValue(new Color(123, 123, 123), "COBBLESTONE");
		new RGBBlockValue(new Color(170, 132, 110), new Color(165, 131, 113),
				new Color(166, 131, 115), new Color(157, 127, 115), "COMMAND");
		new RGBBlockValue(new Color(105, 126, 105), new Color(105, 123, 105),
				new Color(103, 121, 103), new Color(100, 118, 100),
				"MOSSY_COBBLESTONE");
		new RGBBlockValue(new Color(133, 118, 96), "DAYLIGHT_DETECTOR", true);
		new RGBBlockValue(new Color(105, 109, 113),
				"DAYLIGHT_DETECTOR_INVERTED", true);
		new RGBBlockValue(new Color(109, 221, 215), new Color(105, 222, 216),
				new Color(122, 227, 222), new Color(80, 215, 208),
				"DIAMOND_BLOCK");
		new RGBBlockValue(new Color(132, 140, 144), new Color(130, 140, 144),
				new Color(128, 139, 142), new Color(131, 150, 154),
				"DIAMOND_ORE");
		new RGBBlockValue(new Color(161, 161, 161), "DOUBLE_STEP", 8);
		new RGBBlockValue(new Color(134, 96, 67), "DIRT");
		new RGBBlockValue(new Color(81, 217, 117), "EMERALD_BLOCK");
		new RGBBlockValue(new Color(109, 131, 117), new Color(110, 130, 117),
				new Color(110, 129, 116), new Color(107, 130, 114),
				"EMERALD_ORE");
		new RGBBlockValue(new Color(220, 222, 164), "ENDER_STONE");
		// new RGBBlockValue(new Color(104, 55, 51),
		// Material.ENCHANTMENT_TABLE,true);
		new RGBBlockValue(new Color(84, 111, 91), "ENDER_PORTAL_FRAME", true);
		new RGBBlockValue(new Color(104, 104, 104), new Color(103, 103, 103),
				new Color(133, 133, 133), new Color(131, 131, 131), "FURNACE",
				false);
		new RGBBlockValue(new Color(100, 100, 100), "FURNACE", true);
		new RGBBlockValue(new Color(119, 122, 73), new Color(155, 127, 76),
				new Color(144, 120, 73), new Color(130, 106, 59), "GLOWSTONE");
		new RGBBlockValue(new Color(249, 239, 83), new Color(250, 241, 74),
				new Color(252, 245, 92), new Color(251, 230, 71), "GOLD_BLOCK");
		new RGBBlockValue(new Color(144, 142, 128), new Color(144, 140, 128),
				new Color(142, 139, 124), new Color(154, 147, 124), "GOLD_ORE");
		new RGBBlockValue(new Color(127, 124, 123), "GRAVEL");
		new RGBBlockValue(new Color(150, 90, 67), "HARD_CLAY");
		new RGBBlockValue(new Color(136, 131, 127), "IRON_ORE");
		new RGBBlockValue(new Color(37, 23, 16), "STAINED_CLAY", DyeColor.BLACK);
		new RGBBlockValue(new Color(75, 61, 92), "STAINED_CLAY", DyeColor.BLUE);
		new RGBBlockValue(new Color(78, 52, 36), "STAINED_CLAY", DyeColor.BROWN);
		new RGBBlockValue(new Color(86, 90, 91), "STAINED_CLAY", DyeColor.CYAN);
		new RGBBlockValue(new Color(58, 42, 36), "STAINED_CLAY", DyeColor.GRAY);
		new RGBBlockValue(new Color(75, 82, 42), "STAINED_CLAY", DyeColor.GREEN);
		new RGBBlockValue(new Color(114, 109, 138), "STAINED_CLAY",
				DyeColor.LIGHT_BLUE);
		new RGBBlockValue(new Color(100, 116, 51), "STAINED_CLAY",
				DyeColor.LIME);
		new RGBBlockValue(new Color(148, 86, 108), "STAINED_CLAY",
				DyeColor.MAGENTA);
		new RGBBlockValue(new Color(163, 85, 39), "STAINED_CLAY",
				DyeColor.ORANGE);
		new RGBBlockValue(new Color(160, 77, 78), "STAINED_CLAY", DyeColor.PINK);
		new RGBBlockValue(new Color(115, 68, 84), "STAINED_CLAY",
				DyeColor.PURPLE);
		new RGBBlockValue(new Color(142, 59, 45), "STAINED_CLAY", DyeColor.RED);
		new RGBBlockValue(new Color(136, 107, 98), "STAINED_CLAY",
				DyeColor.SILVER);
		new RGBBlockValue(new Color(210, 178, 161), "STAINED_CLAY",
				DyeColor.WHITE);
		new RGBBlockValue(new Color(190, 136, 36), "STAINED_CLAY",
				DyeColor.YELLOW);
		new RGBBlockValue(new Color(204, 172, 122), new Color(203, 171, 121),
				new Color(202, 171, 121), new Color(203, 172, 121),
				"HUGE_MUSHROOM_1"); // / inside brown
		new RGBBlockValue(new Color(142, 107, 83), "HUGE_MUSHROOM_1", 1);
		new RGBBlockValue(new Color(208, 204, 194), "HUGE_MUSHROOM_2");
		new RGBBlockValue(new Color(183, 38, 36), "HUGE_MUSHROOM_2", 1);
		new RGBBlockValue(new Color(219, 219, 219), "IRON_BLOCK");
		new RGBBlockValue(new Color(101, 68, 51), "JUKEBOX", false);
		new RGBBlockValue(new Color(107, 73, 55), "JUKEBOX", true);
		new RGBBlockValue(new Color(41, 77, 153), new Color(39, 68, 138),
				new Color(39, 65, 138), new Color(38, 61, 126), "LAPIS_BLOCK");
		new RGBBlockValue(new Color(104, 116, 139), new Color(108, 116, 132),
				new Color(95, 106, 136), new Color(95, 109, 138), "LAPIS_ORE");
		new RGBBlockValue(new Color(105, 99, 89), "LOG_2", 4);// Accacia
		new RGBBlockValue(new Color(51, 41, 23), "LOG_2", 5);// darkoak
		new RGBBlockValue(new Color(206, 205, 200), new Color(215, 215, 210),
				new Color(214, 215, 209), new Color(200, 199, 195), "LOG", 14);// birch
		new RGBBlockValue(new Color(87, 68, 27), "LOG", 15);// jungle
		new RGBBlockValue(new Color(102, 81, 50), "LOG", 12);// oak
		new RGBBlockValue(new Color(46, 29, 12), "LOG", 13);// spruce
		new RGBBlockValue(new Color(138, 144, 36), new Color(144, 149, 37),
				new Color(139, 144, 36), new Color(144, 148, 37),
				"MELON_BLOCK", false);
		new RGBBlockValue(new Color(150, 152, 37), "MELON_BLOCK", true);
		new RGBBlockValue(new Color(102, 89, 89), new Color(98, 81, 77),
				new Color(126, 91, 64), new Color(125, 90, 63), "MYCEL", false);
		new RGBBlockValue(new Color(111, 100, 106), "MYCEL", true);
		new RGBBlockValue(new Color(45, 23, 27), "NETHER_BRICK");
		new RGBBlockValue(new Color(120, 62, 60), new Color(111, 53, 52),
				new Color(109, 52, 51), new Color(107, 52, 49), "NETHERRACK");
		new RGBBlockValue(new Color(123, 88, 57), "DIRT", 2);
		new RGBBlockValue(new Color(20, 18, 30), "OBSIDIAN");
		new RGBBlockValue(new Color(152, 127, 86), "PISTON_BASE", 1);
		new RGBBlockValue(new Color(138, 147, 99), new Color(139, 146, 98),
				new Color(140, 149, 100), new Color(144, 145, 98),
				"PISTON_STICKY_BASE", 1);
		new RGBBlockValue(new Color(134, 108, 108), new Color(133, 108, 108),
				new Color(131, 104, 104), new Color(137, 102, 102),
				"REDSTONE_ORE");
		new RGBBlockValue(new Color(170, 92, 51), "WOOD", 4);// Accacia
		new RGBBlockValue(new Color(61, 40, 18), "WOOD", 5);// Dark oak
		new RGBBlockValue(new Color(196, 179, 123), "WOOD", 2);// birch
		new RGBBlockValue(new Color(154, 111, 77), "WOOD", 3);// jungle
		new RGBBlockValue(new Color(157, 128, 79), "WOOD", 0);// oak
		new RGBBlockValue(new Color(104, 78, 47), "WOOD", 1);// spruce
		new RGBBlockValue(new Color(190, 118, 22), "PUMPKIN", true);
		new RGBBlockValue(new Color(232, 228, 220), "QUARTZ_BLOCK", 0);
		new RGBBlockValue(new Color(137, 99, 98), new Color(130, 91, 86),
				new Color(129, 87, 82), new Color(114, 75, 71), "QUARTZ_ORE");
		new RGBBlockValue(new Color(70, 44, 27), "REDSTONE_LAMP_OFF");
		new RGBBlockValue(new Color(119, 89, 55), "REDSTONE_LAMP_ON"); // ==============================================
		new RGBBlockValue(new Color(217, 210, 157), "SANDSTONE", false); // rough
		new RGBBlockValue(new Color(216, 208, 157), "SANDSTONE", true); // rough
		new RGBBlockValue(new Color(220, 212, 162), "SANDSTONE", 2, false); // smooth
		new RGBBlockValue(new Color(240, 251, 251), "SNOW_BLOCK");// ========================================================
		new RGBBlockValue(new Color(82, 62, 50), new Color(83, 63, 50),
				new Color(88, 68, 55), new Color(87, 67, 54), "SOUL_SAND");
		new RGBBlockValue(new Color(195, 196, 85), "SPONGE");
		/*new RGBBlockValue(new Color(174, 100, 80), "TNT", false);// ==================================================
		new RGBBlockValue(new Color(139, 67, 47), new Color(117, 63, 48),
				new Color(131, 62, 43), new Color(109, 60, 47), "TNT", true);// ==================================================*/
		//No longer wants to work
		new RGBBlockValue(new Color(125, 125, 125), "STONE", 0);// base
		new RGBBlockValue(new Color(122, 122, 12), "SMOOTH_BRICK");
		new RGBBlockValue(new Color(122, 127, 111), new Color(114, 119, 104),
				new Color(110, 115, 101), new Color(114, 117, 108),
				"SMOOTH_BRICK", 1);// moss
		new RGBBlockValue(new Color(119, 119, 119), "SMOOTH_BRICK", 3);// chissle
		new RGBBlockValue(new Color(23, 19, 19), "WOOL", DyeColor.BLACK);
		new RGBBlockValue(new Color(43, 53, 133), "WOOL", DyeColor.BLUE);
		new RGBBlockValue(new Color(76, 48, 30), "WOOL", DyeColor.BROWN);
		new RGBBlockValue(new Color(49, 116, 143), "WOOL", DyeColor.CYAN);
		new RGBBlockValue(new Color(61, 61, 61), "WOOL", DyeColor.GRAY);
		new RGBBlockValue(new Color(55, 72, 28), "WOOL", DyeColor.GREEN);
		new RGBBlockValue(new Color(113, 143, 203), "WOOL", DyeColor.LIGHT_BLUE);
		new RGBBlockValue(new Color(66, 180, 58), "WOOL", DyeColor.LIME);
		new RGBBlockValue(new Color(184, 83, 193), "WOOL", DyeColor.MAGENTA);
		new RGBBlockValue(new Color(221, 129, 67), "WOOL", DyeColor.ORANGE);
		new RGBBlockValue(new Color(210, 128, 158), "WOOL", DyeColor.PINK);
		new RGBBlockValue(new Color(130, 62, 188), "WOOL", DyeColor.PURPLE);
		new RGBBlockValue(new Color(157, 56, 51), "WOOL", DyeColor.RED);
		new RGBBlockValue(new Color(162, 168, 168), "WOOL", DyeColor.SILVER);
		new RGBBlockValue(new Color(232, 231, 231), "WOOL", DyeColor.WHITE);
		new RGBBlockValue(new Color(188, 176, 42), "WOOL", DyeColor.YELLOW);
		// Bukkit.getServer().getConsoleSender()
		// .sendMessage(ChatColor.WHITE + "1.7 Blocks Enabled!");
		/*
		 * if (ReflectionUtil.isVersionHigherThan(1, 7)) {
		 * Bukkit.getServer().getConsoleSender() .sendMessage(ChatColor.WHITE +
		 * "1.8 Blocks Enabled!"); new RGB_1_8(); } if
		 * (ReflectionUtil.isVersionHigherThan(1, 8)) {
		 * Bukkit.getServer().getConsoleSender() .sendMessage(ChatColor.WHITE +
		 * "1.9 Blocks Enabled!"); new RGB_1_9(); } if
		 * (ReflectionUtil.isVersionHigherThan(1, 9)) {
		 * Bukkit.getServer().getConsoleSender() .sendMessage(ChatColor.WHITE +
		 * "1.10 Blocks Enabled!"); new RGB_1_10(); } if
		 * (ReflectionUtil.isVersionHigherThan(1, 10)) {
		 * Bukkit.getServer().getConsoleSender() .sendMessage(ChatColor.WHITE +
		 * "1.11 Blocks Enabled!"); new RGB_1_11(); }
		 */

		// 1.8
		new RGBBlockValue(new Color(153, 114, 100), "STONE", 1);// gran
		// hard
		new RGBBlockValue(new Color(141, 109, 99), "STONE", 2);// gran
		// smooth
		new RGBBlockValue(new Color(180, 180, 183), "STONE", 3);// dorite
		// hard
		new RGBBlockValue(new Color(183, 183, 186), "STONE", 4);// dorite
		// smooth
		new RGBBlockValue(new Color(131, 131, 131), "STONE", 5);// ander
		// hard
		new RGBBlockValue(new Color(133, 133, 135), "STONE", 6);// ander
		// smooth

		new RGBBlockValue(new Color(161, 119, 19), new Color(162, 118, 19),
				new Color(158, 119, 19), new Color(158, 118, 18), "HAY_BLOCK",
				3);
		new RGBBlockValue(new Color(121, 200, 101), "SLIME_BLOCK");
		new RGBBlockValue(new Color(176, 203, 193), new Color(177, 203, 194),
				new Color(178, 204, 194), new Color(180, 205, 196),
				"SEA_LANTERN");
		new RGBBlockValue(new Color(89, 149, 122), new Color(96, 156, 129),
				new Color(93, 150, 125), new Color(94, 152, 127), "PRISMARINE",
				0);
		new RGBBlockValue(new Color(100, 160, 143), "PRISMARINE", 1);
		new RGBBlockValue(new Color(60, 88, 75), "PRISMARINE", 2);
		new RGBBlockValue(new Color(151, 180, 231), "PACKED_ICE");
		new RGBBlockValue(new Color(172, 28, 9), "REDSTONE_BLOCK");
		new RGBBlockValue(new Color(127, 201, 108), "SLIME_BLOCK");
		// 1.9

		new RGBBlockValue(new Color(166, 122, 166), "PURPUR_BLOCK");
		new RGBBlockValue(new Color(170, 127, 170), "PURPUR_PILLAR", 1);
		new RGBBlockValue(new Color(226, 231, 171), "END_BRICKS");
		new RGBBlockValue(new Color(168, 86, 31), "RED_SANDSTONE", 2);
		new RGBBlockValue(new Color(158, 156, 61), new Color(156, 155, 61),
				new Color(161, 159, 63), new Color(161, 159, 64), "SPONGE", 1); // wet

		// 1.10

		new RGBBlockValue(new Color(140, 69, 26), new Color(113, 65, 27),
				new Color(138, 66, 25), new Color(134, 67, 29), "MAGMA");
		new RGBBlockValue(new Color(226, 212, 201), "BONE_BLOCK", 3);
		new RGBBlockValue(new Color(69, 4, 7), "RED_NETHER_BRICK");
		new RGBBlockValue(new Color(117, 6, 7), "NETHER_WART_BLOCK");
		new RGBBlockValue(new Color(73, 60, 74), "STRUCTURE_BLOCK");

		new RGBBlockValue(new Color(130, 157, 146), new Color(131, 153, 144),
				new Color(130, 152, 143), new Color(128, 143, 136),
				"COMMAND_CHAIN");
		new RGBBlockValue(new Color(124, 108, 170), new Color(126, 111, 165),
				new Color(124, 108, 163), new Color(123, 107, 153),
				"COMMAND_REPEATING");

		// 1.11
		new RGBBlockValue(new Color(62, 59, 59), "OBSERVER", false);

	}

	private static final String SERVER_VERSION;

	static {
		String name = Bukkit.getServer().getClass().getName();
		name = name.substring(name.indexOf("craftbukkit.")
				+ "craftbukkit.".length());
		name = name.substring(0, name.indexOf("."));
		SERVER_VERSION = name;
	}

	/**
	 * This checks if the the server is running on a version higher or equal to
	 * the one specified. Useage: upToDate(1,8) will check if the version is
	 * greater than or equal to 1.8
	 * 
	 * @param The
	 *            first value (will most likely only be 1 )
	 * @param The
	 *            second value (The 8 in 1.8.3 )
	 * @return if the server version is greater than or equal to specified
	 *         version.
	 */
	public static boolean isVersionHigherThan(int mainVersion, int secondVersion) {
		String firstChar = SERVER_VERSION.substring(1, 2);
		int fInt = Integer.parseInt(firstChar);
		if (fInt < mainVersion)
			return false;
		StringBuilder secondChar = new StringBuilder();
		for (int i = 3; i < 10; i++) {
			if (SERVER_VERSION.charAt(i) == '_'
					|| SERVER_VERSION.charAt(i) == '.')
				break;
			secondChar.append(SERVER_VERSION.charAt(i));
		}
		int sInt = Integer.parseInt(secondChar.toString());
		if (sInt < secondVersion)
			return false;
		return true;
	}

	/**
	 * This will return the Material and durability that has the closest color
	 * to Color "c".
	 * 
	 * @param c
	 *            - The color value
	 * @return The closest material and durability.
	 */
	public static MaterialData getClosestBlockValue(Color c, boolean topView) {
		Color[] color = new Color[4];
		color[0] = c;
		color[1] = c;
		color[2] = c;
		color[3] = c;
		return getClosestBlockValue(color, topView);
	}

	/**
	 * The color value of the four closest colors. Use this if you want to
	 * preserve hard edges in images. For the array, you need four color values.
	 * Use the following chart to understand which pixel should be at which
	 * index:
	 * 
	 * | 0 | 1 |
	 * 
	 * |---|---|
	 * 
	 * | 2 | 3 |
	 * 
	 * @param c
	 *            - The color value
	 * @return The closest material and durability.
	 */
	public static MaterialData getClosestBlockValue(Color c[], boolean topView) {

		int[] r = new int[4];
		int[] b = new int[4];
		int[] g = new int[4];
		for (int i = 0; i < c.length; i++) {
			r[i] = c[i].getRed();
			b[i] = c[i].getBlue();
			g[i] = c[i].getGreen();
		}

		double cR = 1000000;
		double cB = 1000000;
		double cG = 1000000;

		MaterialData closest = null;

		double[] tR = new double[4];
		double[] tG = new double[4];
		double[] tB = new double[4];
		for (Entry<MaterialData, RGBBlockValue> entry : materialValue
				.entrySet()) {
			for (int i = 0; i < 4; i++) {
				tR[i] = entry.getValue().r[i] - r[i];
				tG[i] = entry.getValue().g[i] - g[i];
				tB[i] = entry.getValue().b[i] - b[i];
				if (tR[i] < 0)
					tR[i] = -tR[i];
				if (tG[i] < 0)
					tG[i] = -tG[i];
				if (tB[i] < 0)
					tB[i] = -tB[i];
			}
			if ((tR[0] * tR[0]) + (tG[0] * tG[0]) + (tB[0] * tB[0])
					+ (tR[1] * tR[1]) + (tG[1] * tG[1]) + (tB[1] * tB[1])
					+ (tR[2] * tR[2]) + (tG[2] * tG[2]) + (tB[2] * tB[2])
					+ (tR[3] * tR[3]) + (tG[3] * tG[3]) + (tB[3] * tB[3]) < cR
					+ cG + cB) {
				if (entry.getValue().hasFaces()) {
					if (entry.getValue().isTop() != topView)
						continue;
				}
				cR = 0;
				cB = 0;
				cG = 0;
				for (int i = 0; i < 4; i++) {
					cR += (tR[i] * tR[i]);
					cB += (tB[i] * tB[i]);
					cG += (tG[i] * tG[i]);
				}
				closest = entry.getKey();
			}
		}
		return closest;
	}

	/**
	 * This gets all the pixel values for an image. Use this to get all the
	 * pixels for an image.
	 * 
	 * The first array stores the Row value (e.g. MC's "Y" value), and the
	 * second array stores the Columb value (MC's X or Z)
	 * 
	 * For example: If you want to get the pixel at the top left of an image,
	 * use convertTo2DWithoutUsingGetRGB(Image)[HEIGHT][0]
	 * 
	 * For example: If you want to get the pixel at the bottom right of an
	 * image, use convertTo2DWithoutUsingGetRGB(Image)[0][WIDTH]
	 * 
	 * @param image
	 * @return
	 */
	public static Pixel[][] convertTo2DWithoutUsingGetRGB(BufferedImage image) {
		if (image.getRaster().getDataBuffer() instanceof DataBufferByte) {
			final byte[] pixels = ((DataBufferByte) image.getRaster()
					.getDataBuffer()).getData();
			final int width = image.getWidth();
			final int height = image.getHeight();
			final boolean hasAlphaChannel = image.getAlphaRaster() != null;

			Pixel[][] result = new Pixel[height][width];
			if (hasAlphaChannel) {
				final int pixelLength = 4;
				for (int pixel = 0, row = 0, col = 0; pixel < pixels.length; pixel += pixelLength) {
					int r = 0;
					int b = 0;
					int g = 0;
					// argb += (((int) pixels[pixel] & 0xff) << 24); // alpha
					b += ((int) pixels[pixel + 1] & 0xff); // blue
					g += (((int) pixels[pixel + 2] & 0xff) /* << 8 */); // green
					r += (((int) pixels[pixel + 3] & 0xff) /* << 16 */); // red
					result[row][col] = new Pixel(r, g, b);
					col++;
					if (col == width) {
						col = 0;
						row++;
					}
				}
			} else {
				final int pixelLength = 3;
				for (int pixel = 0, row = 0, col = 0; pixel < pixels.length; pixel += pixelLength) {
					int r = 0;
					int b = 0;
					int g = 0;
					// argb += -16777216; // 255 alpha
					b += ((int) pixels[pixel] & 0xff); // blue
					g += (((int) pixels[pixel + 1] & 0xff) /* <<8 */); // green
					r += (((int) pixels[pixel + 2] & 0xff) /* <<16 */); // red
					result[row][col] = new Pixel(r, g, b);
					col++;
					if (col == width) {
						col = 0;
						row++;
					}
				}
			}

			return result;
		} else if (image.getRaster().getDataBuffer() instanceof DataBufferInt) {
			final int[] pixels = ((DataBufferInt) image.getRaster()
					.getDataBuffer()).getData();
			final int width = image.getWidth();
			final int height = image.getHeight();
			final boolean hasAlphaChannel = image.getAlphaRaster() != null;

			Pixel[][] result = new Pixel[height][width];
			if (hasAlphaChannel) {
				final int pixelLength = 4;
				for (int pixel = 0, row = 0, col = 0; pixel < pixels.length; pixel += pixelLength) {
					int r = 0;
					int b = 0;
					int g = 0;
					// argb += (((int) pixels[pixel] & 0xff) << 24); // alpha
					b += ((int) pixels[pixel + 1] & 0xff); // blue
					g += (((int) pixels[pixel + 2] & 0xff) /* << 8 */); // green
					r += (((int) pixels[pixel + 3] & 0xff) /* << 16 */); // red
					result[row][col] = new Pixel(r, g, b);
					col++;
					if (col == width) {
						col = 0;
						row++;
					}
				}
			} else {
				final int pixelLength = 1;
				for (int pixel = 0, row = 0, col = 0; pixel < pixels.length; pixel += pixelLength) {
					int r = 0;
					int b = 0;
					int g = 0;
					int rgb = pixels[pixel];
					r = (rgb >> 16) & 0xFF;
					g = (rgb >> 8) & 0xFF;
					b = rgb & 0xFF;
					result[row][col] = new Pixel(r, g, b);
					col++;
					if (col == width) {
						col = 0;
						row++;
					}
				}
			}

			return result;
		}
		return null;
	}

	/**
	 * Creates a file with an image where each pixel represense the colorcode
	 * for a block
	 * 
	 * @param output
	 *            file
	 * @param bottomLeft
	 *            corner of the image
	 * @param topRight
	 *            corner of the image
	 */
	@SuppressWarnings("deprecation")
	public void createImageFromBlocks(File output, Location bottomLeft,
			Location topRight) {
		boolean isX = bottomLeft.getBlockZ() == topRight.getBlockZ();
		MaterialData[][] blocks = new MaterialData[topRight.getBlockY()
				- bottomLeft.getBlockY()][isX ? Math.max(topRight.getBlockX(),
				bottomLeft.getBlockX())
				- Math.min(topRight.getBlockX(), bottomLeft.getBlockX()) : Math
				.max(topRight.getBlockZ(), bottomLeft.getBlockZ())
				- Math.min(topRight.getBlockZ(), bottomLeft.getBlockZ())];
		for (int y = bottomLeft.getBlockY(); y < topRight.getBlockY(); y++) {
			if (isX) {
				for (int x = Math.min(topRight.getBlockX(),
						bottomLeft.getBlockX()); x < Math.max(
						topRight.getBlockX(), bottomLeft.getBlockX()); x++) {
					Block t = new Location(topRight.getWorld(), x, y,
							topRight.getBlockZ()).getBlock();
					blocks[y - bottomLeft.getBlockY()][x
							- Math.min(topRight.getBlockX(),
									bottomLeft.getBlockX())] = MaterialData
							.getMatDataByTypes(t.getType(), t.getData());
				}
			} else {
				for (int z = Math.min(topRight.getBlockZ(),
						bottomLeft.getBlockZ()); z < Math.max(
						topRight.getBlockZ(), bottomLeft.getBlockZ()); z++) {
					Block t = new Location(topRight.getWorld(),
							topRight.getBlockX(), y, z).getBlock();
					blocks[y - bottomLeft.getBlockY()][z
							- Math.min(topRight.getBlockZ(),
									bottomLeft.getBlockZ())] = MaterialData
							.getMatDataByTypes(t.getType(), t.getData());
				}
			}
		}
		createImageFromBlocks(output, blocks);
	}

	/**
	 * Creates a file with an image where each pixel represense the colorcode
	 * for a block
	 * 
	 * @param output
	 *            file
	 * @param the
	 *            material data for each block. first array being the Y, the
	 *            second being the X or Z;
	 */
	public void createImageFromBlocks(File output, MaterialData[][] blocks) {
		BufferedImage canvas = new BufferedImage(blocks[0].length,
				blocks.length, BufferedImage.TYPE_INT_RGB);
		for (int y = 0; y < blocks.length; y++) {
			for (int x = 0; x < blocks[0].length; x++) {
				for (MaterialData rgb : materialValue.keySet()) {
					if (rgb.getM() == blocks[y][x].getM()
							&& rgb.getData() == blocks[y][x].getData()) {
						int col = (materialValue.get(rgb).r[0] << 16)
								| (materialValue.get(rgb).g[0] << 8)
								| materialValue.get(rgb).b[0];
						canvas.setRGB(x, y, col);
					}
				}
			}
		}
		try {
			ImageIO.write(canvas, "jpg", output);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

class RGBValue {
	int[] r = new int[4];
	int[] b = new int[4];
	int[] g = new int[4];

	public double[] rRat = new double[4];
	public double[] gRat = new double[4];
	public double[] bRat = new double[4];

	public RGBValue(Color c) {
		init(c, c, c, c);

	}

	public RGBValue(Color c, Color c2, Color c3, Color c4) {
		init(c, c2, c3, c4);
	}

	private void init(Color c, Color c2, Color c3, Color c4) {
		this.r[0] = c.getRed();
		this.g[0] = c.getGreen();
		this.b[0] = c.getBlue();
		// /
		this.r[1] = c2.getRed();
		this.g[1] = c2.getGreen();
		this.b[1] = c2.getBlue();
		// /
		this.r[2] = c3.getRed();
		this.g[2] = c3.getGreen();
		this.b[2] = c3.getBlue();
		//
		this.r[3] = c4.getRed();
		this.g[3] = c4.getGreen();
		this.b[3] = c4.getBlue();
		for (int i = 0; i < 4; i++) {
			rRat[i] = r[i];
			gRat[i] = g[i];
			bRat[i] = b[i];
		}
	}
}

class RGBBlockValue extends RGBValue {

	private boolean hasFaces = false;
	private boolean isTop = false;

	public boolean isTop() {
		return isTop;
	}

	public boolean hasFaces() {
		return hasFaces;
	}

	public RGBBlockValue(Color c, String mat) {
		super(c);
		if (Material.matchMaterial(mat) == null)
			return;
		RGBBlockColor.materialValue.put(
				new MaterialData(Material.matchMaterial(mat), (byte) 0), this);

	}

	public RGBBlockValue(Color c, Color c2, Color c3, Color c4, String m) {
		super(c, c2, c3, c4);
		if (Material.matchMaterial(m) == null)
			return;
		RGBBlockColor.materialValue.put(
				new MaterialData(Material.matchMaterial(m), (byte) 0), this);
	}

	public RGBBlockValue(Color c, String m, byte d) {
		super(c);
		if (Material.matchMaterial(m) == null)
			return;
		RGBBlockColor.materialValue.put(
				new MaterialData(Material.matchMaterial(m), d), this);
	}

	public RGBBlockValue(Color c, String mat, int d) {
		super(c);
		if (Material.matchMaterial(mat) == null)
			return;
		RGBBlockColor.materialValue.put(
				new MaterialData(Material.matchMaterial(mat), (byte) d), this);
	}

	public RGBBlockValue(Color c, String mat, int d, boolean isTop) {
		super(c);
		if (Material.matchMaterial(mat) == null)
			return;
		this.isTop = isTop;
		this.hasFaces = true;
		RGBBlockColor.materialValue.put(
				new MaterialData(Material.matchMaterial(mat), (byte) d), this);
	}

	public RGBBlockValue(Color c, Color c2, Color c3, Color c4, String mat,
			int d) {
		super(c, c2, c3, c4);
		if (Material.matchMaterial(mat) == null)
			return;
		RGBBlockColor.materialValue.put(
				new MaterialData(Material.matchMaterial(mat), (byte) d), this);
	}

	public RGBBlockValue(Color c, Color c2, Color c3, Color c4, String mat,
			boolean isTop) {
		super(c, c2, c3, c4);
		if (Material.matchMaterial(mat) == null)
			return;
		this.hasFaces = true;
		this.isTop = isTop;
		RGBBlockColor.materialValue.put(
				new MaterialData(Material.matchMaterial(mat), (byte) 0), this);
	}

	public RGBBlockValue(Color c, String mat, boolean isTop) {
		super(c);
		if (Material.matchMaterial(mat) == null)
			return;
		this.hasFaces = true;
		this.isTop = isTop;
		RGBBlockColor.materialValue.put(
				new MaterialData(Material.matchMaterial(mat), (byte) 0), this);
	}

	public RGBBlockValue(Color c, String mat, DyeColor d) {
		super(c);
		if (Material.matchMaterial(mat) == null)
			return;
		byte dyecolor = -1;
		if ((ReflectionUtil.isVersionHigherThan(1, 10)))
			dyecolor = (byte) ReflectionUtil.invokeMethod(d, "getWoolData",
					null);
		else
			dyecolor = (byte) ReflectionUtil.invokeMethod(d, "getData", null);
		RGBBlockColor.materialValue.put(
				new MaterialData(Material.matchMaterial(mat), dyecolor), this);
	}
}
