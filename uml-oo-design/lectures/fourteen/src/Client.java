class Client {
	private static void testLoggingObserver() {
        Directory dir = new Directory();
        LoggingObserver lobs = new LoggingObserver();
        lobs.startObserving(dir);
        
        Item one = new Item("1");
        Item two = new Item("2");
        dir.add(one);
        dir.add(two);
        
        lobs.stopObserving(dir);

        one = dir.rename(one, "3");
        one = dir.rename(one, "5");

        dir.remove(two);
        dir.remove(one);
	}

    public static void main(String args[]) {
        testLoggingObserver();
    }
}
