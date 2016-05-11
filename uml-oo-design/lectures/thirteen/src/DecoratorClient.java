class DecoratorClient {
	private static void testEasyMath(EasyMath calc) {
        assert(calc.add(101, -1) == 100);

        assert(calc.neg(calc.sub(calc.add(101, -1), 2)) == -98);
	}

    private static void testEasyMathDecorator() {
        EasyMath target = EasyMathCalculator.getInstance(4);
        EasyMathDecorator emd = EasyMathDecorator.decorate(target);
        testEasyMath(emd);
    }

    private static void testEasyMathLogger() {

    }

    private static void testDecoratorComposition() {

    }
    
    public static void main(String args[]) {
        testEasyMathDecorator();
        testEasyMathLogger();
        testDecoratorComposition();
    }
}