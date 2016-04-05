package edu.sois;

import java.util.ArrayList;

public class SlideDeck {
    private ArrayList<Slide> deck;
    private String name;

    public SlideDeck(String name) {
    	deck = new ArrayList<Slide>();
    	name = (name == null) ? "<unnamed-deck>" : name.trim();
        this.name = name;
    }

    public Slide newSlide() {
        Slide s = new Slide(this);
        this.deck.add(s);
        return s;
    }

    public void remove(Slide s) {
    	assert(deck.contains(s));
    	deck.remove(s);
    	s.reset();
    }

    public void removeSlideAt(int pos) {
        assert(pos >= 0 && pos < deck.size());
        Slide s = deck.get(pos);
        deck.remove(s);
        s.reset();
    }

    public void clear() {
    	deck.forEach((slide) -> slide.reset());
        deck.clear();
    }
}
