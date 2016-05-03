class ModerateResourceFactory extends AbstractResourceFactory {
    public ModerateImageReader createImageReader() {
        return new ModerateImageReader();
    }

    public ModerateAudioPlayer createPlayer(){
        return new ModerateAudioPlayer();
    }

    public ModerateMessenger   createMessanger() {
        return new ModerateMessenger();
    }
}
