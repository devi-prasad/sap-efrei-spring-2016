package edu.sois;

public class Slide {
	private String title;
	private String content;

	protected Slide(SlideDeck deck) {
        assert(deck != null);
	}

	public void setTitle(String title) {
		assert(title != null);
		title = title.trim();
		assert(title.length() > 0);
		this.title = title;
	}
	public String getTitle() { return this.title; }

	public void setContent(String text) {
		if (text == null || text.trim().length() == 0) {
            this.content = "";
		} else {
			this.content = text.trim();
		}
	}

	public String getContent() { return this.content; }

    protected void reset() {
        this.title = null;
        this.content = null;
    }
}