import java.util.ArrayList;

class TemplateBinder {
    class Point {
    }

    class Pixel {
    }

    void testBinding() {
    	ArrayList<Point> points = new ArrayList<Point>();
    	//ArrayList points = new ArrayList();

    	points.add(new Point());
    	points.add(new Pixel());
    }
    
    public static void main(String[] args) {
    	new TemplateBinder().testBinding();
    }
}
