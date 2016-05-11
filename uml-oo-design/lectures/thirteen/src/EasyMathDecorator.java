class EasyMathDecorator implements EasyMath {
	private EasyMath target;

    public EasyMathDecorator(EasyMath target) {
        this.target = target;
    }
    
    public int add(int x, int y) {
        return target.add(x, y);
    }
    
    public int sub(int x, int y) {
        return target.sub(x, y);
    }

    public int inc(int x) {
        return target.inc(x);
    }

    public int dec(int x) {
        return target.dec(x);
    }

    public int neg(int x) {
        return target.neg(x);
    }

    public int mul(int x, int y) {
        return target.mul(x, y);
    }
    
    public int div(int x, int y) {
        return target.div(x, y);
    }

    public int mod(int x, int y) {
        return target.mod(x, y);
    }
    
    public int save(int reg, int data) {
        return target.save(reg, data);
    }

    public int read(int reg) {
        return target.read(reg);
    }

    public static EasyMathDecorator decorate(EasyMath target) {
    	assert(target != null);

        return new EasyMathDecorator(target);
    }
}