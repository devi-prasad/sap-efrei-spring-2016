class Client {
    private static void testOneAddRenameRemove() {
        Directory dir = new Directory();
        LoggingObserver lobs = new LoggingObserver();
        lobs.startObserving(dir);

        Item one = new Item("1");
        dir.add(one); 
        one = dir.rename(one, "3");
        dir.remove(one);

        lobs.stopObserving(dir);
    }

	private static void testLoggingObserver() {
        Directory dir = new Directory();
        LoggingObserver lobs = new LoggingObserver();
        lobs.startObserving(dir);
        
        Item one = new Item("1");
        Item two = new Item("2");
        dir.add(one);
        dir.add(two);

        one = dir.rename(one, "3");
        one = dir.rename(one, "5");
        dir.remove(two);
        dir.remove(one);

        lobs.stopObserving(dir);
	}

    public static void main(String args[]) {
        testOneAddRenameRemove();
        //testLoggingObserver();
    }
}
