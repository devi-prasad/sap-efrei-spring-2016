import edu.sois.SlideDeck;
import edu.sois.Slide;

class SlideDeckDriver {
    public static void main(String[] args) {
    	SlideDeck deck = new SlideDeck(" Beginning UML ");
        final String body = "UML is a visual language.";
        final String title = " Intro  ";

    	Slide s = deck.newSlide();
        s.setTitle(title);
        s.setContent(body);
        assert(s.getTitle().equals(title.trim()));
        assert(s.getContent().equals(body));

        deck.clear();
    }
}
