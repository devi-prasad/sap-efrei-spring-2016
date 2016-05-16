interface Observer {
    void added(String name);
    void removed(String name);
    void renamed(String prev, String now);
}