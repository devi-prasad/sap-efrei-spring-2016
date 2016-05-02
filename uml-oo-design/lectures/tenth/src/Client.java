import org.json.*;

class Client {
	private static void testStringName() {
        StringNameBuilder snb  = new StringNameBuilder();

        NameCatalog  catalog = new NameCatalog(snb);
        catalog.construct();
        
        Name name = snb.toName();
        assert(name.getName().equals("abcde-4567-XYZ"));
	}

    private static void testJSONName() {
        JSONNameBuilder jsonb  = new JSONNameBuilder();

        NameCatalog  catalog = new NameCatalog(jsonb);
        catalog.construct();
        
        JSONObject json = jsonb.toJSON();
        String f = json.getString("first");
        int    m = json.getInt("middle");
        String l = json.getString("last");
        assert(f.equals("abcde"));
        assert(m == 4567);
        assert(l.equals("XYZ"));
    }
   
    public static void main(String args[]) {
        testStringName();
        testJSONName();  
	}
}