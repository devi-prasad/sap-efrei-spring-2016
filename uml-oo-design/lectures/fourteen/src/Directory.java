import java.util.Vector;

class Directory extends SubjectImpl {
	private Vector<Item> items;

    public Directory() {
        items = new Vector<Item>();
    }
    
    public boolean add(Item c) {
        if (!items.contains(c) && items.add(c)) {
            this.notifyAddition(c.name());
            return true;
        }
        return false;
    }

    /*
     * removes the element with a matching name, and adds a new one.
     * Note carefully that only one notification in sent to observers.
     *
     */
    public Item rename(Item c, String newname) {
        Item newItem = null;

        if (items.contains(c) && !this.containsElement(newname)
                                 && items.remove(c)) {
            Item item = new Item(newname);
            if (items.add(item)) {
                newItem = item;
                this.notifyRename(c.name(), newname);
            }
        }

        return newItem;
    }

    public boolean remove(Item c) {
        if (items.contains(c) && items.remove(c) == true) {
            this.notifyRemoval(c.name());
            return true;
        }
        return false;
    }

    public boolean remove(String name) {
        Element that = null;

        for (Element c : items) {
            if (c.name().equals(name)) {
                that = c;
                break;
            }
        }
        if (that != null && items.remove(that)) {
            this.notifyRemoval(name);
            return true;
        }
        return false;
    }

    private boolean containsElement(String name) {
        for (Element c : items) {
            if (c.name().equals(name)) {
                return true;
            }
        }
        return false;
    }
}

