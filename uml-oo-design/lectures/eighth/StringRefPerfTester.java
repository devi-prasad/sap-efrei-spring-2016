
class StringRefPerfTester {
	static final int MAX_TURNS = 100000;

    private static void timeStringConcat() {
        long start = System.currentTimeMillis();

        String s = new String();
        for (int i = 0; i < MAX_TURNS; i++) {
            String t = s;
            s = s.concat("a");
            assert(t != s);
        }

        long end = System.currentTimeMillis();

        System.out.println(end - start);
	}
    
    private static void timeStringBuilderConcat() {
        long start = System.currentTimeMillis();

        StringBuilder s = new StringBuilder();
        StringBuilder t = s;
        for (int i = 0; i < MAX_TURNS; i++) {
            s = s.append("a");
            assert(t == s);
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