import org.json.*;

/**
 * A concrete builder. Builds JSON representation.
 *
 */
class JSONNameBuilder extends NameBuilder {
    public JSONNameBuilder() {}

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
}