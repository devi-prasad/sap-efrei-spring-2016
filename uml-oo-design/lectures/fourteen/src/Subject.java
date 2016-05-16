interface Subject {
    void register(Observer target);
    void unregister(Observer target);

    void notifyAddition(String name);
    void notifyRemoval(String name);
    void notifyRename(String prev, String name);
}
