abstract class AbstractResourceFactory {
    abstract public ImageReader createImageReader();
    abstract public AudioPlayer createPlayer();
    abstract public Messenger   createMessanger();
}
