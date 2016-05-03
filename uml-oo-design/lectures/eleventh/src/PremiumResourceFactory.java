class PremiumResourceFactory extends AbstractResourceFactory {
    public PremiumImageReader createImageReader() {
        return new PremiumImageReader();
    }

    public PremiumAudioPlayer createPlayer(){
        return new PremiumAudioPlayer();
    }

    public PremiumMessenger   createMessanger() {
        return new PremiumMessenger();
    }
}
