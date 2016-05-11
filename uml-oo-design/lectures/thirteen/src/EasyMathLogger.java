class EasyMathLogger implements EasyMath {
	private EasyMath target;
    private int addsubs, incdecs, regops;

    public EasyMathLogger(EasyMath target) {
        this.target = target;
        this.addsubs = this.incdecs = this.regops = 0;
    }
    
    public int add(int x, int y) {
        this.addsubs++;
        return target.add(x, y);
    }
    
    public int sub(int x, int y) {
        this.addsubs++;
        return target.sub(x, y);
    }

    public int inc(int x) {
        this.incdecs++;
        return target.inc(x);
    }

    public int dec(int x) {
        this.incdecs++;
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
        this.regops++;
        return target.save(reg, data);
    }

    public int read(int reg) {
        this.regops++;
        return target.read(reg);
    }

    public static EasyMathLogger decorate(EasyMath target) {
    	assert(target != null);

        return new EasyMathLogger(target);
    }
}