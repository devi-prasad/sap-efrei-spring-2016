import java.net.URI;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

class ModerateImage implements Image {
    private static final int MAX_HEIGHT = 256;
    private static final int MAX_WIDTH  = 256;

    private URI uri;
    private BufferedImage image;

    public ModerateImage(URI uri) {
        this.uri = uri;
        this.image = null;
    }

    ModerateImage read() {
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File(uri));
            if (img.getHeight() > MAX_HEIGHT || img.getWidth() > MAX_WIDTH) {
            	img = null;
            }
        } catch (IOException e) {
        } finally {
        	this.image = img;
        }

        return this;
    }

    public int getHeight() {
        if (this.image != null) {
            return this.image.getHeight();
        }
        return 0;
    }

    public int getWidth() {
        if (this.image != null) {
            return this.image.getHeight();
        }
        return 0;
    }

    public int[] getData() {
        if (this.image != null) {
            int w = image.getWidth();
            int h = image.getHeight();
            int[] data = image.getRGB(0, 0, w, h, null, 0, w); 
            return data;
        }

        return null;
    }
}

class ModerateImageReader implements ImageReader {
    public Image readJPG(URI uri) {
        ModerateImage img = new ModerateImage(uri);
        return img.read();
    }

    public Image readPNG(URI uri) {
        ModerateImage img = new ModerateImage(uri);
        return img.read();
    }
}