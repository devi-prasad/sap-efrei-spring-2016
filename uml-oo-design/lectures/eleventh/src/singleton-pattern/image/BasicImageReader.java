import java.net.URI;

/**
 * Simple optimization: NullImage acts as a singleton class.
 * Take a close look at the static initialization sequence.
 *
 */
class BasicImageReader implements ImageReader {
	static private class NullImage implements Image {
	    public int getHeight()  { return 0; }
	    public int getWidth()   { return 0; }
	    public int[] getData()  { return null; }
	}
    
    private static Image nullImage;
    static {
        nullImage = new NullImage();
    }

    public Image readJPG(URI uri) {
        return this.nullImage;
    }

    public Image readPNG(URI uri) {
        return this.nullImage;
    }
}