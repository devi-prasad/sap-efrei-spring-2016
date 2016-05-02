/**
 * Represents the Director role in a Builder pattern.
 *
 */
class NameCatalog {
	private INameBuilder nameBuilder;

	public NameCatalog(INameBuilder builder) {
        this.nameBuilder = builder;
	}

    public void construct() {
        nameBuilder.setFirst(" abcde ")
                   .setMiddle(4567)
                   .setLast(" XYZ  ");
    }
}