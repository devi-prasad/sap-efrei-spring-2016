
class StringPerfTester {
	static final int MAX_TURNS = 100000;

    private static void timeStringConcat() {
        long start = System.currentTimeMillis();

        String s = new String();
        for (int i = 0; i < MAX_TURNS; i++) {
            s = s.concat("a");
        }

        long end = System.currentTimeMillis();

        System.out.println(end - start);
	}
    
    private static void timeStringBuilderConcat() {
        long start = System.currentTimeMillis();

        StringBuilder s = new StringBuilder();
        for (int i = 0; i < MAX_TURNS; i++) {
            s = s.append("a");
        }

        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }
	private static void runTests() {
        timeStringConcat();
        timeStringBuilderConcat();
	}

    public static void main(String []args) {
        runTests();
    }
}