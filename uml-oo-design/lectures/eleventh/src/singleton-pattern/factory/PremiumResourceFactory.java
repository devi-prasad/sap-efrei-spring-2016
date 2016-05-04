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

    private static PremiumResourceFactory instance = null;

    private PremiumResourceFactory() {}

    public static PremiumResourceFactory getInstance() {
        if (instance == null) {
          instance = new PremiumResourceFactory();
        }

        return instance;
    }
}
