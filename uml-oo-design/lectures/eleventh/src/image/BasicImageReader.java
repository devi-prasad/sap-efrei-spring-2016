import java.net.URI;

class BasicImageReader implements ImageReader {
	private class NullImage implements Image {
	    public int getHeight()  { return 0; }
	    public int getWidth()   { return 0; }
	    public int[] getData()  { return null; }
	}

    public Image readJPG(URI uri) {
        return new NullImage();
    }

    public Image readPNG(URI uri) {
        return new NullImage();
    }
}