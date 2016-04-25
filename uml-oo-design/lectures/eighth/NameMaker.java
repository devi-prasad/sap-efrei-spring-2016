import org.json.*;

class NameMaker {
    private String first, middle, last;

    public NameMaker() {
        first = middle = last = null;
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
            middle = String.valueOf(i);
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
        return (first != null) && (middle != null) && (last != null);
    }

    public Name toName() {
        if (readyToRock()) {
            return new Name(first + middle + last);
        }

        return null;
    }

    public JSONObject toJSON() {
    	if (readyToRock()) {
    		String str = "{ \"first\": " + first + ","
    		              + "\"middle\": " + middle + "," 
    		              + "\"last\" :" + last + "}";
    		JSONObject obj = new JSONObject(str);
    		return obj;
    	}
        return null;
    }

    public String toXML() {
    	//TODO: FIX ME!!!

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