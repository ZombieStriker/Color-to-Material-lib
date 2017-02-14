
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.xml.bind.DatatypeConverter;

import me.zombie_striker.pixelprinter.util.RGBBlockColor.Pixel;

import org.bukkit.Location;

public class SkinCreator {


	public static BufferedImage getSkin(String uuid) throws NullPointerException{
		try{
			StringBuilder code = new StringBuilder();
			InputStreamReader is = new InputStreamReader(new URL("https://sessionserver.mojang.com/session/minecraft/profile/"+uuid.replace("-", "")).openStream());
			int charI = 0;
			while((charI = is.read())!=-1){
				code.append(((char)charI));
			}
			String decode = new String(DatatypeConverter.parseBase64Binary(code.toString().split("\"value\":\"")[1].split("\"}],\"legacy\"")[0]));	
			System.out.println(decode);
			String url = decode.split("url\":\"")[1].split("\"}}}")[0];
			System.out.println(url);
			return ImageIO.read(new URL(url));
		}catch(NullPointerException | IOException e){
			e.printStackTrace();
			System.out.println("The Mojang servers denied the request. Wait a minute or so until you are allowed to get the texture again.");
			throw new NullPointerException();
		}
	}

	public static void createStatue(BufferedImage skin, Location center,
			Direction dir) {
		Direction front = dir;
		Direction back = null;
		Direction left = null;
		Direction right = null;
		Direction flat = null;
		switch (front) {

		case UP_SOUTH:
			back = Direction.UP_NORTH;
			right = Direction.UP_WEST;
			left = Direction.UP_EAST;
			flat = Direction.FLAT_SOUTHWEST;			
			break;
		case UP_NORTH:
			back = Direction.UP_SOUTH;
			right = Direction.UP_EAST;
			left = Direction.UP_WEST;
			flat = Direction.FLAT_NORTHEAST;
			
			break;
		case UP_EAST:
			back = Direction.UP_WEST;
			right = Direction.UP_SOUTH;
			left = Direction.UP_NORTH;
			flat = Direction.FLAT_SOUTHEAST;
			break;
		case UP_WEST:
			back = Direction.UP_EAST;
			right = Direction.UP_NORTH;
			left = Direction.UP_SOUTH;
			flat = Direction.FLAT_NORTHWEST;
			break;
		default:
			break;
		}
		final Location loc = center.clone();
		
		// legs (left)
		{
			a(2, 0, -3, loc, left,front, RGBBlockColor.createResizedCopy(skin.getSubimage(0, 32 - 12, 4, 12),24,false));
			a(-1, 0, 0, loc, right,front, RGBBlockColor.createResizedCopy(skin.getSubimage(0+8, 32 - 12, 4, 12),24,false));
			a(2, 0, -3, loc, front,front, RGBBlockColor.createResizedCopy(skin.getSubimage(0+4, 32 - 12, 4, 12),24,false));
			a(-1, 0, 0, loc, back,front, RGBBlockColor.createResizedCopy(skin.getSubimage(0+12, 32 - 12, 4, 12),24,false));
		}

		// Legs (right)
		{
			int x = 16;
			int y = 64;
			if(skin.getHeight()==32){
				x=0;y=32;
			}
			a(2, 0, 1, loc, left,front, RGBBlockColor.createResizedCopy(skin.getSubimage(x, y - 12, 4, 12),24,false));
			a(-1, 0, 4, loc, right,front, RGBBlockColor.createResizedCopy(skin.getSubimage(x+8, y - 12, 4, 12),24,false));
			a(2, 0, 1, loc, front,front, RGBBlockColor.createResizedCopy(skin.getSubimage(x+4, y - 12, 4, 12),24,false));
			a(-1, 0, 4, loc, back,front, RGBBlockColor.createResizedCopy(skin.getSubimage(x+12, y - 12, 4, 12),24,false));
		}
		// chest
		{
			a(2, 12,-3, loc, left,front, RGBBlockColor.createResizedCopy(skin.getSubimage(16, 20, 4, 12),24,false));
			a(-1, 12, 4, loc, right,front, RGBBlockColor.createResizedCopy(skin.getSubimage(16+12,20, 4, 12),24,false));
			a(2, 12, -2, loc, front,front, RGBBlockColor.createResizedCopy(skin.getSubimage(16+4,20, 8, 12),24,false));
			a(-1, 12, 4, loc, back,front, RGBBlockColor.createResizedCopy(skin.getSubimage(16+16,20, 8, 12),24,false));
		}
		//head
		{
			a(-3, 24, -3, loc, flat,front, RGBBlockColor.createResizedCopy(skin.getSubimage(16, 0, 8, 8),16,false));
			a(-3, 31, -3, loc, flat,front, RGBBlockColor.createResizedCopy(skin.getSubimage(8, 0, 8, 8),16,false));
			
			a(-3, 24, -3, loc, right,front, RGBBlockColor.createResizedCopy(skin.getSubimage(0,8, 8, 8),16,false));
			a(4, 24, 4, loc, left,front, RGBBlockColor.createResizedCopy(skin.getSubimage(16, 8, 8, 8),16,false));
			a(-3, 24, 4, loc, front,front, RGBBlockColor.createResizedCopy(skin.getSubimage(8,8, 8, 8),16,false));
			a(-3, 24, 4, loc, back,front, RGBBlockColor.createResizedCopy(skin.getSubimage(24, 8, 8, 8),16,false));
		}
		// arm (left)
		{
			a(-1, 23, -3+8, loc, flat,front, RGBBlockColor.createResizedCopy(skin.getSubimage(40+4, 16, 4, 4),8,false));
			a(-1, 12, -3+8, loc, flat, front,RGBBlockColor.createResizedCopy(skin.getSubimage(40+4+4, 16, 4, 4),8,false));
			
			a(2, 12, -3+8, loc, left,front, RGBBlockColor.createResizedCopy(skin.getSubimage(40, 20, 4, 12),24,false));
			a(-1, 12, 8, loc, right,front, RGBBlockColor.createResizedCopy(skin.getSubimage(40+8, 20, 4, 12),24,false));
			a(2, 12, -3+8, loc, front,front, RGBBlockColor.createResizedCopy(skin.getSubimage(40+4, 20, 4, 12),24,false));
			a(-1, 12, 8, loc, back,front, RGBBlockColor.createResizedCopy(skin.getSubimage(40+12, 20, 4, 12),24,false));
		}
		// arm (right)
		{
			int x = 32;
			int y = 48;
			if(skin.getHeight()==32){
				x=32;y=20;
			}
			a(-1, 23, -3-4, loc, flat,front, RGBBlockColor.createResizedCopy(skin.getSubimage(x+4, y-4, 4, 4),8,false));
			a(-1, 12, -3-4, loc, flat,front, RGBBlockColor.createResizedCopy(skin.getSubimage(x+4+4, y-4, 4, 4),8,false));
			
			a(2, 12, -3+8, loc, left,front, RGBBlockColor.createResizedCopy(skin.getSubimage(x, y, 4, 12),24,false));
			a(-1, 12, -4, loc, right,front, RGBBlockColor.createResizedCopy(skin.getSubimage(x+8,y , 4, 12),24,false));
			a(-1, 12, -3-4, loc, front, front,RGBBlockColor.createResizedCopy(skin.getSubimage(x+4,y, 4, 12),24,false));
			a(2, 12, -4, loc, back,front, RGBBlockColor.createResizedCopy(skin.getSubimage(x+12, y, 4, 12),24,false));
		}
	}
	private static void a(int x,int y, int z, Location loc,Direction d,Direction f, BufferedImage skin2){

		BufferedImage temp = skin2;
		Pixel[][] result= RGBBlockColor
				.convertTo2DWithoutUsingGetRGB(temp);
		new AsyncImageHolder(result, null, getOffset(loc, f, x, y, z),
				d, temp).loadImage();
	}

	public static Location getOffset(Location start, Direction d, double xoff,
			int yoff, double zoff) {
		if (d == Direction.UP_NORTH) {
			return start.clone().add(-zoff, yoff, xoff);
		}
		if (d == Direction.UP_SOUTH) {
			return start.clone().add(zoff, yoff, -xoff);
		}
		if (d == Direction.UP_EAST) {
			return start.clone().add(xoff, yoff, zoff);
		}
		if (d == Direction.UP_WEST) {//north
			return start.clone().add(-xoff, yoff, -zoff);
		}
		return start.clone().add(xoff,yoff,zoff);
	}

}
