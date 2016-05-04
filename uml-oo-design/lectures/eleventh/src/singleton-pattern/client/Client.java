import java.net.URI;

class Client {
    private static void testComponents(AbstractResourceFactory f) {
    	try {
        ImageReader ir = f.createImageReader();
        assert(ir != null);
        Image img = ir.readJPG(new URI("file:///home/devi/temp/scen.jpg"));
        assert(img != null);
        assert(img.getHeight() == 0);
        assert(img.getWidth()  == 0);
        assert(img.getData()   == null);

        AudioPlayer ap = f.createPlayer();
        assert(ap != null);

        Messenger    m = f.createMessanger();
        assert(m != null);
    } catch (Exception ex) {
    	System.out.println(ex);
    }
    }

    private static void testBasic() {
        testComponents(new BasicResourceFactory());
    }

    private static void testModerate() {
        testComponents(new ModerateResourceFactory());
    }
    
    private static void testPremium() {
        testComponents(PremiumResourceFactory.getInstance());
        // testComponents(new PremiumResourceFactory());
    }
    
    public static void main(String[] args) {
        testBasic();
        testModerate();
        testPremium();
    }
}