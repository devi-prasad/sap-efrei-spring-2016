/**
 * A name consists of three parts: first-middle-last.
 * the first component MUST have 5 characters, 
 * the middle component is a four digit positive number, and
 * the last component is a 3 character string.
 *
 */
abstract class NameBuilder implements INameBuilder {
    protected String first, last;
    protected int middle;

    public NameBuilder() {
        first = last = null;
        middle = 0;
    }

    public NameBuilder setFirst(String s) {
        if (s != null) {
        	s = s.trim();
        	if (s.length() == 5) {
                first = s;
            }
        }

        return this;
    }

    public NameBuilder setMiddle(int i) {
        if (i >= 1000 && i <= 9999) {
            middle = i;
        }

        return this;
    }

    public NameBuilder setLast(String s) {
        if (s != null) {
        	s = s.trim();
        	if (s.length() == 3) {
                last = s;
            }
        }

        return this;
    }

    public boolean readyToRock() {
        return (first != null) && (middle > 0) && (last != null);
    }
}