import org.json.*;

/**
 * A name consists of three parts: first-middle-last.
 * the first component MUST have 5 characters, 
 * the middle component is a four digit positive number, and
 * the last component is a 3 character string.
 *
 */
class NameMaker {
    private String first, last;
    private int middle;

    public NameMaker() {
        first = last = null;
        middle = 0;
    }

    public NameMaker setFirst(String s) {
        if (s != null) {
        	s = s.trim();
        	if (s.length() == 5) {
                first = s;
            }
        }

        return this;
    }

    public NameMaker setMiddle(int i) {
        if (i >= 1000 && i <= 9999) {
            middle = i;
        }

        return this;
    }

    public NameMaker setLast(String s) {
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

    public Name toName() {
        assert(readyToRock());

        if (readyToRock()) {
            return new Name(first + middle + last);
        }

        return null;
    }

    public JSONObject toJSON() {
        assert(readyToRock());

    	if (readyToRock()) {
            StringBuilder jsonsb = new StringBuilder();
            jsonsb.append("{ \"first\": " )
              .append(first)
              .append(", ")
              .append("\"middle\": " )
              .append(middle)
              .append(", ")
              .append("\"last\" :" )
              .append(last)
              .append("}");

            JSONObject obj = new JSONObject(jsonsb.toString());
    		return obj;
    	}

        return null;
    }

    public String toXML() {
    	//TODO: FIX ME!!!
        assert(readyToRock());

        return null;
    }


    public static void main(String[] args) {
        NameMaker nm = new NameMaker();
        nm.setFirst(" abcde ")
          .setMiddle(4567)
          .setLast(" XYZ  ");

        JSONObject json = nm.toJSON();
        String f = json.getString("first");
        int    m = json.getInt("middle");
        String l = json.getString("last");
        assert(f.equals("abcde"));
        assert(m == 4567);
        assert(l.equals("XYZ"));

        Name n = nm.toName();
        assert(n.getName().equals("abcde4567XYZ"));

    }
}