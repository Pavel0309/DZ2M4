import java.awt.image.BufferedImage;

public class RGBmaster {
    private BufferedImage image;
    private int width;
    private int height;
    private boolean hasAlphaChannel;
    private int[] pixels;
    public RGBmaster(BufferedImage){
        this.image=image;
        width=image.getWidth();
        hasAlphaChannel=image.getAlphaRaster() !=null;
        height=image.getHeight();
        pixels= image.getRGB(0,0,width,height,null,0,width);
    }
    public BufferedImage getImage(){
        return  image;
    }
    public void ChangeImage(ImagesOperation operation)throws Exception{
        for (int i = 0; i < pixels.length; i++) {
            float[] pixel = ImageUtils.execute(pixels);
            float[] newPixels = operation.execute(pixel);
            pixels[i] = ImageUtils.arrayToRgbInt(newPixels);
        }
        image.setRGB(0,0,width,height,pixels,0,width);
    }


}
