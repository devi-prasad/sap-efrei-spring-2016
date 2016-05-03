import java.net.URI;

interface ImageReader {
    Image readJPG(URI uri);
    Image readPNG(URI uri);
}