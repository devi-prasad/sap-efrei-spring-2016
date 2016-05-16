import java.util.Vector;

class Directory extends SubjectImpl {
	private Vector<Element> elements;

    public Directory() {
        elements = new Vector<Element>();
    }
    
    public boolean add(Element c) {
        if (!elements.contains(c) && elements.add(c)) {
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
    public boolean rename(Element c, String newname) {
        if (elements.contains(c) && elements.remove(c) && 
                                    elements.add(new Item(newname))) {
            this.notifyRename(c.name(), newname);
            return true;
        }
        return false;
    }

    public boolean remove(Element c) {
        if (elements.contains(c) && elements.remove(c) == true) {
            this.notifyRemoval(c.name());
            return true;
        }
        return false;
    }

    public boolean remove(String name) {
        Element that = null;

        for (Element c : elements) {
            if (c.name().equals(name)) {
                that = c;
                break;
            }
        }
        if (that != null && elements.remove(that)) {
            this.notifyRemoval(name);
            return true;
        }
        return false;
    }
}

