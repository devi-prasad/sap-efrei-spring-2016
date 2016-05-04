class BasicResourceFactory extends AbstractResourceFactory {
    public BasicImageReader createImageReader() {
        return new BasicImageReader();
    }
    
    public BasicAudioPlayer createPlayer() {
        return new BasicAudioPlayer();
    }

    public BasicMessenger   createMessanger() {
        return new BasicMessenger();
    }
}
