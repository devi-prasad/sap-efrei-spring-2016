import java.util.ArrayList;

class DescriptorTableAdapter extends DescriptorTable {
	public static final int MAX_DESCRIPTORS = 8;

    private ArrayList<Boolean> descriptors;

    public DescriptorTableAdapter() {
        descriptors = new ArrayList<Boolean>(MAX_DESCRIPTORS);
    }

    public int open() {
        int n = descriptors.size();
        if (n < MAX_DESCRIPTORS) {
            descriptors.set(n, true);
            assert(descriptors.size() == n+1);
            return n;
        }
        
        return -1;
    }
    
    public int close(int d) {
        return -1;
    }

    public int dup(int d) {
        return -1;
    }
}