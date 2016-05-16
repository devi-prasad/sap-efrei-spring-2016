class Item implements Element {
	private String itemname;

    public Item(String name) {
        this.itemname = name;
    }

    public String name() {
        return this.itemname;
    }
}