abstract class DescriptorTable {
    public abstract int open();
    public abstract int close(int d);
    public abstract int dup(int d);
}