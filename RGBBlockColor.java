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
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.bukkit.*;
import org.bukkit.block.Block;

/**
 * Created by Zombie_Striker on 3/30/2016
 **/
public class RGBBlockColor {

	public static Map<MaterialData, RGBBlockValue> materialValue = new HashMap<>();

	static {
		
		// The &3 at the end of certain values are for making sure logs and bones face upwards.
		// RGB values with only one color are for block's whose texture's colors do not change much
		// RGB values with four colors are for blocks whose textures vary depending on corner (e.g. Furnaces. Top is dark gray, bottom is light gray.)
		
		new RGBBlockValue(new Color(85, 85, 85),new Color(85, 85, 85), new Color(76, 76, 76), new Color(91, 91, 91),  Material.BEDROCK);
		new RGBBlockValue(new Color(117, 211, 215), Material.BEACON);
		new RGBBlockValue(new Color(146, 100, 87), Material.BRICK);
		new RGBBlockValue(new Color(110,89,65),new Color(103,94,51),new Color(119,71,40),new Color(99,96,70), Material.BOOKSHELF);
		// new RGBBlockValue(new Color(56, 56, 56), Material.CAULDRON); Removed
		// because of seethrough textures
		new RGBBlockValue(new Color(115, 93, 59),new Color(112, 92, 64),new Color(118, 97, 63),new Color(109, 102, 74), Material.WORKBENCH);
		// new RGBBlockValue(new Color(13,96,23), Material.CACTUS); breaks
		new RGBBlockValue(new Color(19, 19, 19), Material.COAL_BLOCK);
		new RGBBlockValue(new Color(115, 115, 115), Material.COAL_ORE);
		new RGBBlockValue(new Color(159, 165, 177), Material.CLAY);
		new RGBBlockValue(new Color(123, 123, 123), Material.COBBLESTONE);
		new RGBBlockValue(new Color(170, 132, 110),new Color(165, 131, 113),new Color(166, 131, 115),new Color(157, 127, 115), Material.COMMAND);
		new RGBBlockValue(new Color(105, 126, 105),new Color(105, 123, 105),new Color(103, 121, 103),new Color(100, 118, 100), Material.MOSSY_COBBLESTONE);
		new RGBBlockValue(new Color(109, 221, 215),new Color(105, 222, 216),new Color(122, 227, 222),new Color(80, 215, 208), Material.DIAMOND_BLOCK);
		new RGBBlockValue(new Color(132, 140, 144),new Color(130, 140, 144),new Color(128, 139, 142),new Color(131, 150, 154), Material.DIAMOND_ORE);
		new RGBBlockValue(new Color(134, 96, 67), Material.DIRT);
		new RGBBlockValue(new Color(81, 217, 117), Material.EMERALD_BLOCK);
		new RGBBlockValue(new Color(109, 131, 117),new Color(110, 130, 117),new Color(110, 129, 116),new Color(107, 130, 114), Material.EMERALD_ORE);
		new RGBBlockValue(new Color(220, 222, 164), Material.ENDER_STONE);
		// new RGBBlockValue(new Color(148, 160, 123), Material.ENDER_CHEST);
		// new RGBBlockValue(new Color(148, 160, 123), Material.END_GATEWAY);
		// transparent
		 new RGBBlockValue(new Color(104, 104, 104),new Color(103, 103, 103),new Color(133, 133, 133),new Color(131, 131, 131), Material.FURNACE);
		new RGBBlockValue(new Color(119, 122, 73),new Color(155, 127, 76),new Color(144, 120, 73),new Color(130, 106, 59), Material.GLOWSTONE);
		new RGBBlockValue(new Color(249, 239, 83),new Color(250, 241, 74), new Color(252, 245, 92), new Color(251, 230, 71),  Material.GOLD_BLOCK);
		new RGBBlockValue(new Color(144, 142, 128),new Color(144, 140, 128),new Color(142, 139, 124),new Color(154, 147, 124), Material.GOLD_ORE);
		new RGBBlockValue(new Color(127, 124, 123), Material.GRAVEL);
		new RGBBlockValue(new Color(150, 90, 67), Material.HARD_CLAY);
		new RGBBlockValue(new Color(136, 131, 127), Material.IRON_ORE);
		new RGBBlockValue(new Color(37, 23, 16), Material.STAINED_CLAY,
				DyeColor.BLACK);
		new RGBBlockValue(new Color(75, 61, 92), Material.STAINED_CLAY,
				DyeColor.BLUE);
		new RGBBlockValue(new Color(78, 52, 36), Material.STAINED_CLAY,
				DyeColor.BROWN);
		new RGBBlockValue(new Color(86, 90, 91), Material.STAINED_CLAY,
				DyeColor.CYAN);
		new RGBBlockValue(new Color(58, 42, 36), Material.STAINED_CLAY,
				DyeColor.GRAY);
		new RGBBlockValue(new Color(75, 82, 42), Material.STAINED_CLAY,
				DyeColor.GREEN);
		new RGBBlockValue(new Color(114, 109, 138), Material.STAINED_CLAY,
				DyeColor.LIGHT_BLUE);
		new RGBBlockValue(new Color(100, 116, 51), Material.STAINED_CLAY,
				DyeColor.LIME);
		new RGBBlockValue(new Color(148, 86, 108), Material.STAINED_CLAY,
				DyeColor.MAGENTA);
		new RGBBlockValue(new Color(163, 85, 39), Material.STAINED_CLAY,
				DyeColor.ORANGE);
		new RGBBlockValue(new Color(160, 77, 78), Material.STAINED_CLAY,
				DyeColor.PINK);
		new RGBBlockValue(new Color(115, 68, 84), Material.STAINED_CLAY,
				DyeColor.PURPLE);
		new RGBBlockValue(new Color(142, 59, 45), Material.STAINED_CLAY,
				DyeColor.RED);
		new RGBBlockValue(new Color(136, 107, 98), Material.STAINED_CLAY,
				DyeColor.SILVER);
		new RGBBlockValue(new Color(210, 178, 161), Material.STAINED_CLAY,
				DyeColor.WHITE);
		new RGBBlockValue(new Color(190, 136, 36), Material.STAINED_CLAY,
				DyeColor.YELLOW);
		new RGBBlockValue(new Color(204, 172, 122),new Color(203, 171, 121),new Color(202, 171, 121),new Color(203, 172, 121), Material.HUGE_MUSHROOM_1); /// inside brown
		new RGBBlockValue(new Color(142, 107, 83), Material.HUGE_MUSHROOM_1, 1);
		new RGBBlockValue(new Color(208, 204, 194), Material.HUGE_MUSHROOM_2);
		new RGBBlockValue(new Color(183, 38, 36), Material.HUGE_MUSHROOM_2, 1);
		new RGBBlockValue(new Color(219, 219, 219), Material.IRON_BLOCK);
		new RGBBlockValue(new Color(101, 68, 51), Material.JUKEBOX);
		new RGBBlockValue(new Color(41, 77, 153),new Color(39, 68, 138),new Color(39, 65, 138),new Color(38, 61, 126), Material.LAPIS_BLOCK);
		new RGBBlockValue(new Color(104, 116, 139),new Color(108, 116, 132),new Color(95, 106, 136),new Color(95, 109, 138), Material.LAPIS_ORE);
		new RGBBlockValue(new Color(105, 99, 89), Material.LOG, 4 & 3);// Accacia
		new RGBBlockValue(new Color(51, 41, 23), Material.LOG, 5 & 3);// dark
																		// oak
		new RGBBlockValue(new Color(206, 205, 200),new Color(215, 215, 210),new Color(214, 215, 209),new Color(200, 199, 195), Material.LOG, 2 & 3);// birch
		new RGBBlockValue(new Color(87, 68, 27), Material.LOG, 3 & 3);// jungle
		new RGBBlockValue(new Color(102, 81, 50), Material.LOG, 0 & 3);// oak
		new RGBBlockValue(new Color(46, 29, 12), Material.LOG, 1 & 3);// spruce
		new RGBBlockValue(new Color(138, 144, 36),new Color(144, 149, 37),new Color(139, 144, 36),new Color(144, 148, 37), Material.MELON_BLOCK);
		new RGBBlockValue(new Color(102, 89,89),new Color(98, 81, 77),new Color(126, 91, 64),new Color(125,90, 63), Material.MYCEL);
		new RGBBlockValue(new Color(45, 23, 27), Material.NETHER_BRICK);
		new RGBBlockValue(new Color(120, 62, 60),new Color(111, 53, 52),new Color(109, 52, 51),new Color(107, 52, 49), Material.NETHERRACK);
		new RGBBlockValue(new Color(123, 88, 57), Material.DIRT, 2);
		new RGBBlockValue(new Color(20, 18, 30), Material.OBSIDIAN);
		new RGBBlockValue(new Color(134, 108, 108),new Color(133, 108, 108),new Color(131, 104, 104),new Color(137, 102, 102), Material.REDSTONE_ORE);
		new RGBBlockValue(new Color(170, 92, 51), Material.WOOD, 4);// Accacia
		new RGBBlockValue(new Color(61, 40, 18), Material.WOOD, 5);// Dark oak
		new RGBBlockValue(new Color(196, 179, 123), Material.WOOD, 2);// birch
		new RGBBlockValue(new Color(154, 111, 77), Material.WOOD, 3);// jungle
		new RGBBlockValue(new Color(157, 128, 79), Material.WOOD, 0);// oak
		new RGBBlockValue(new Color(104, 78, 47), Material.WOOD, 1);// spruce
		// new RGBBlockValue(new Color(197, 121, 24), Material.PUMPKIN); removed
		// due to change of snowmen spawning
		new RGBBlockValue(new Color(232, 228, 220), Material.QUARTZ_BLOCK, 0);
		new RGBBlockValue(new Color(137,99, 98),new Color(130, 91, 86),new Color(129, 87, 82),new Color(114, 75, 71), Material.QUARTZ_ORE);
		new RGBBlockValue(new Color(70, 44, 27), Material.REDSTONE_LAMP_OFF);
		// new RGBBlockValue(new Color(119, 89, 55), Material.REDSTONE_LAMP_ON);
		// Turns into redstone lamp off
		new RGBBlockValue(new Color(217, 210, 157), Material.SANDSTONE); // rough
		new RGBBlockValue(new Color(220, 212, 162), Material.SANDSTONE, 2); //smooth
		new RGBBlockValue(new Color(240, 251, 251), Material.SNOW_BLOCK);
		new RGBBlockValue(new Color(82, 62, 50),new Color(83, 63, 50),new Color(88, 68, 55),new Color(87, 67, 54), Material.SOUL_SAND);
		new RGBBlockValue(new Color(195, 196, 85), Material.SPONGE);
		new RGBBlockValue(new Color(125, 125, 125), Material.STONE, 0);// base
		new RGBBlockValue(new Color(122, 122, 12), Material.SMOOTH_BRICK);
		new RGBBlockValue(new Color(122, 127, 111),new Color(114, 119, 104),new Color(110, 115, 101),new Color(114, 117, 108), Material.SMOOTH_BRICK, 1);// moss
		new RGBBlockValue(new Color(119, 119, 119), Material.SMOOTH_BRICK, 3);// chissle
		new RGBBlockValue(new Color(23, 19, 19), Material.WOOL, DyeColor.BLACK);
		new RGBBlockValue(new Color(43, 53, 133), Material.WOOL, DyeColor.BLUE);
		new RGBBlockValue(new Color(76, 48, 30), Material.WOOL, DyeColor.BROWN);
		new RGBBlockValue(new Color(49, 116, 143), Material.WOOL, DyeColor.CYAN);
		new RGBBlockValue(new Color(61, 61, 61), Material.WOOL, DyeColor.GRAY);
		new RGBBlockValue(new Color(55, 72, 28), Material.WOOL, DyeColor.GREEN);
		new RGBBlockValue(new Color(113, 143, 203), Material.WOOL,
				DyeColor.LIGHT_BLUE);
		new RGBBlockValue(new Color(66, 180, 58), Material.WOOL, DyeColor.LIME);
		new RGBBlockValue(new Color(184, 83, 193), Material.WOOL,
				DyeColor.MAGENTA);
		new RGBBlockValue(new Color(221, 129, 67), Material.WOOL,
				DyeColor.ORANGE);
		new RGBBlockValue(new Color(210, 128, 158), Material.WOOL,
				DyeColor.PINK);
		new RGBBlockValue(new Color(130, 62, 188), Material.WOOL,
				DyeColor.PURPLE);
		new RGBBlockValue(new Color(157, 56, 51), Material.WOOL, DyeColor.RED);
		new RGBBlockValue(new Color(162, 168, 168), Material.WOOL,
				DyeColor.SILVER);
		new RGBBlockValue(new Color(232, 231, 231), Material.WOOL,
				DyeColor.WHITE);
		new RGBBlockValue(new Color(188, 176, 42), Material.WOOL,
				DyeColor.YELLOW);
		if (upToDate(1, 8)) {
			new RGB_1_8();
		}
		if (upToDate(1, 9)) {
			new RGB_1_9();
		}
		if (upToDate(1, 10)) {
			new RGB_1_10();
		}
	}
	/**
	 * This checks if the the server is running on a version higher or equal to the one specified.
	 * Useage: upToDate(1,8) will check if the version is greater than or equal to 1.8
	 * @param The first value (will most likely only be 1 )
	 * @param The second value (The 8 in 1.8.3 )
	 * @return if the server version is greater than or equal to specified version.
	 */
	public static boolean upToDate(int u1, int u2) {
		String update = Bukkit.getVersion().split("MC")[1].substring(2)
				.replace(")", "");
		int int1 = -8;
		int int2 = -8;
		String prev = "";
		for (int i = 0; i < update.length(); i++) {
			if (update.charAt(i) == '.') {
				if (int1 < -1) {
					int1 = Integer.parseInt(prev);
				} else if (int2 < -1) {
					int2 = Integer.parseInt(prev);
				}
			} else {
				prev += update.charAt(i);
			}
		}
		return (int1 >= u1) && (int2 >= u2);
	}

	/**
	 * This will return the Material and durability that has the closest color to Color "c".
	 * @param c - The color value
	 * @return The closest material and durability.
	 */
	public static MaterialData getClosestBlockValue(Color c) {
		Color[] color = new Color[4];
		color[0]=c;
		color[1]=c;
		color[2]=c;
		color[3]=c;
		return getClosestBlockValue(color);
	}
	/**
	 * The color value of the four closest colors. Use this if you want to preserve hard edges in images.
	 * For the array, you need four color values. Use the following chart to understand which pixel should be at which index:
	 * 
	 * | 0 | 1 |
	 * |---|---|
	 * | 2 | 3 |
	 * 
	 * @param c - The color value
	 * @return The closest material and durability.
	 */
	public static MaterialData getClosestBlockValue(Color c[]) {

		int[] r = new int[4];
		int[] b = new int[4];
		int[] g = new int[4];
		double[] rRat = new double[4];
		double[] gRat = new double[4];
		double[] bRat = new double[4];
		for (int i = 0; i < c.length; i++) {
			r[i] = c[i].getRed();
			b[i] = c[i].getBlue();
			g[i] = c[i].getGreen();
			rRat[i] = r[i];
			gRat[i] = g[i];
			bRat[i] = b[i];
		}

		double cR = 1000000;
		double cB = 1000000;
		double cG = 1000000;
		Material cMat = Material.COAL_BLOCK;
		short data = 0;

		for (Entry<MaterialData, RGBBlockValue> entry : materialValue
				.entrySet()) {
			double[] tR = new double[4];
			double[] tG = new double[4];
			double[] tB = new double[4];
			for (int i = 0; i < 4; i++) {
				tR[i] = entry.getValue().rRat[i] - rRat[i];
				tG[i] = entry.getValue().gRat[i] - gRat[i];
				tB[i] = entry.getValue().bRat[i] - bRat[i];
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
					+ (tR[3] * tR[3]) + (tG[3] * tG[3]) + (tB[3] * tB[3])
			< cR + cG + cB) {
				cR = 0;
				cB = 0;
				cG = 0;
				for (int i = 0; i < 4; i++) {
					cR += (tR[i] * tR[i]);
					cB += (tB[i] * tB[i]);
					cG += (tG[i] * tG[i]);
				}
				cMat = entry.getKey().getMat();
				data = entry.getKey().getData();
			}
		}
		return new MaterialData(cMat, data);
	}
	/**
	 * This gets all the pixel values for an image. Use this to get all the pixels for an image.
	 * 
	 * The first array stores the Row value (e.g. MC's "Y" value), and the second array stores the Columb value (MC's X or Z)
	 * 
	 * For example: If you want to get the pixel at the top left of an image, use
	 * convertTo2DWithoutUsingGetRGB(Image)[HEIGHT][0]
	 * 
	 * For example: If you want to get the pixel at the bottom right of an image, use
	 * convertTo2DWithoutUsingGetRGB(Image)[0][WIDTH]
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
	 * Creates a file with an image where each pixel represense the colorcode for a block
	 * @param output file
	 * @param bottomLeft corner of the image
	 * @param topRight corner of the image
	 */
	@SuppressWarnings("deprecation")
	public void createImageFromBlocks(File output, Location bottomLeft, Location topRight){
		boolean isX = bottomLeft.getBlockZ() == topRight.getBlockZ();
		MaterialData[][] blocks = new MaterialData[topRight.getBlockY()-bottomLeft.getBlockY()][isX?
				Math.max(topRight.getBlockX(),bottomLeft.getBlockX())-Math.min(topRight.getBlockX(),bottomLeft.getBlockX())
				:
				Math.max(topRight.getBlockZ(),bottomLeft.getBlockZ())-Math.min(topRight.getBlockZ(),bottomLeft.getBlockZ())
				];
		for(int y = bottomLeft.getBlockY();y<topRight.getBlockY();y++){
			if(isX){
				for(int x = Math.min(topRight.getBlockX(),bottomLeft.getBlockX()) ; x < Math.max(topRight.getBlockX(),bottomLeft.getBlockX());x++){
					Block t = new Location(topRight.getWorld(),x,y,topRight.getBlockZ()).getBlock();
					blocks[y-bottomLeft.getBlockY()][x-Math.min(topRight.getBlockX(),bottomLeft.getBlockX())] = new MaterialData(t.getType(),t.getData());
				}
			}else{
				for(int z = Math.min(topRight.getBlockZ(),bottomLeft.getBlockZ()) ; z < Math.max(topRight.getBlockZ(),bottomLeft.getBlockZ());z++){
					Block t = new Location(topRight.getWorld(),topRight.getBlockX(),y,z).getBlock();
					blocks[y-bottomLeft.getBlockY()][z-Math.min(topRight.getBlockZ(),bottomLeft.getBlockZ())] = new MaterialData(t.getType(),t.getData());					
				}
			}
		}
		createImageFromBlocks(output,blocks);
	}
	/**
	 * Creates a file with an image where each pixel represense the colorcode for a block
	 * @param output file
	 * @param the material data for each block. first array being the Y, the second being the X or Z;
	 */
	public void createImageFromBlocks(File output, MaterialData[][] blocks){
		BufferedImage canvas = new BufferedImage(blocks[0].length,blocks.length, BufferedImage.TYPE_INT_RGB);
		for(int y = 0;y < blocks.length;y++){
			for(int x = 0; x < blocks[0].length;x++){
				for(MaterialData rgb : materialValue.keySet()){
					if(rgb.m==blocks[y][x].m & rgb.data == blocks[y][x].data){
						int col = (materialValue.get(rgb).r[0] << 16) | (materialValue.get(rgb).g[0] << 8) | materialValue.get(rgb).b[0];
						canvas.setRGB(x,y,col);
					}
				}
			}
		}
	}

}

class RGB_1_8 {

	public RGB_1_8() {
		new RGBBlockValue(new Color(153, 114, 100), Material.STONE, 1);// gran
																		// hard
		new RGBBlockValue(new Color(141, 109, 99), Material.STONE, 2);// gran
																		// smooth
		new RGBBlockValue(new Color(180, 180, 183), Material.STONE, 3);// dorite
																		// hard
		new RGBBlockValue(new Color(183, 183, 186), Material.STONE, 4);// dorite
																		// smooth
		new RGBBlockValue(new Color(131, 131, 131), Material.STONE, 5);// ander
																		// hard
		new RGBBlockValue(new Color(133, 133, 135), Material.STONE, 6);// ander
																		// smooth

		new RGBBlockValue(new Color(161, 119, 19),new Color(162, 118, 19),new Color(158, 119, 19),new Color(158, 118, 18), Material.HAY_BLOCK,0&3);
		new RGBBlockValue(new Color(121, 200, 101), Material.SLIME_BLOCK);
		new RGBBlockValue(new Color(176, 203, 193), new Color(177, 203, 194),new Color(178, 204, 194),new Color(180, 205, 196),Material.SEA_LANTERN);
		new RGBBlockValue(new Color(89, 149, 122),new Color(96, 156, 129), new Color(93, 150, 125), new Color(94, 152, 127),  Material.PRISMARINE, 0);
		new RGBBlockValue(new Color(100, 160, 143), Material.PRISMARINE, 1);
		new RGBBlockValue(new Color(60, 88, 75), Material.PRISMARINE, 2);
		new RGBBlockValue(new Color(151, 180, 231), Material.PACKED_ICE);
		new RGBBlockValue(new Color(172, 28, 9), Material.REDSTONE_BLOCK);
		new RGBBlockValue(new Color(127, 201, 108), Material.SLIME_BLOCK);
	}
}

class RGB_1_9 {

	public RGB_1_9() {
		new RGBBlockValue(new Color(166, 122, 166), Material.PURPUR_BLOCK);
		new RGBBlockValue(new Color(170, 127, 170), Material.PURPUR_PILLAR, 1);
		new RGBBlockValue(new Color(226, 231, 171), Material.END_BRICKS);
		new RGBBlockValue(new Color(168, 86, 31), Material.RED_SANDSTONE, 2);
		new RGBBlockValue(new Color(158, 156, 61),new Color(156, 155, 61),new Color(161, 159, 63),new Color(161, 159, 64), Material.SPONGE, 1); //wet
	}
}

class RGB_1_10 {

	public RGB_1_10() {
		new RGBBlockValue(new Color(140, 69, 26),new Color(113, 65, 27),new Color(138, 66, 25),new Color(134, 67, 29), Material.MAGMA);
		new RGBBlockValue(new Color(226, 212, 201), Material.BONE_BLOCK, 1 & 3);
		new RGBBlockValue(new Color(69, 4, 7), Material.RED_NETHER_BRICK);
		new RGBBlockValue(new Color(117, 6, 7), Material.NETHER_WART_BLOCK);
		
		new RGBBlockValue(new Color(130, 157, 146),new Color(131, 153, 144),new Color(130, 152, 143),new Color(128, 143, 136), Material.COMMAND_CHAIN);
		new RGBBlockValue(new Color(124, 108, 170),new Color(126, 111, 165),new Color(124, 108, 163),new Color(123, 107, 153), Material.COMMAND_REPEATING);
	}
}
class RGBBlockValue {
	int[] r = new int[4];
	int[] b = new int[4];
	int[] g = new int[4];
	Material mat;

	public double[] rRat = new double[4];
	public double[] gRat = new double[4];
	public double[] bRat = new double[4];

	short data;

	public RGBBlockValue(Color c, Material mat) {
		init(c,c,c,c,mat,(short)0);
	}

	public RGBBlockValue(Color c, Color c2, Color c3, Color c4, Material mat) {
		init(c,c2,c3,c4,mat,(short)0);
	}

	@SuppressWarnings("deprecation")
	public RGBBlockValue(Color c, Material mat, DyeColor d) {
		init(c,c,c,c,mat,(short)(d.getData()& (short)0xFF));
	}
	private void init(Color c,Color c2,Color c3,Color c4,Material m, short d){
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
		this.mat = m;
		this.data = d;
		RGBBlockColor.materialValue.put(new MaterialData(mat, data), this);		
	}

	public RGBBlockValue(Color c, Material mat, int d) {
		init(c,c,c,c,mat,(short)d);
	}
	public RGBBlockValue(Color c, Color c2, Color c3, Color c4,  Material mat, int d) {
		init(c,c2,c3,c4,mat,(short)d);
	}
}
