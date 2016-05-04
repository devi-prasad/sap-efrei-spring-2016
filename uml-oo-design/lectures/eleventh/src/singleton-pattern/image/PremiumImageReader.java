import java.net.URI;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

class PremiumImage implements Image {
	private URI uri;
    private BufferedImage image;

	public PremiumImage(URI uri) {
		this.uri = uri;
        this.image = null;
	}

    PremiumImage read() {
        try {
            this.image = ImageIO.read(new File(uri));
        } catch (IOException e) {
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

class PremiumImageReader implements ImageReader {
    public Image readJPG(URI uri) {
        PremiumImage image = new PremiumImage(uri);
        return image.read();
    }

    public Image readPNG(URI uri) {
        PremiumImage image = new PremiumImage(uri);
        return image.read();
    }
}
