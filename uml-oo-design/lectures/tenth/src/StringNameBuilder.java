/**
 * A concrete builder. Builds String representation.
 *
 */
class StringNameBuilder extends NameBuilder {
	public StringNameBuilder() {}

    public Name toName() {
        assert(readyToRock());
        if (readyToRock()) {
            return new Name(first + "-" + middle + "-" + last);
        }
        return null;
    }
}
