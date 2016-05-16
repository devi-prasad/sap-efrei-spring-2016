import java.util.Vector;
class SubjectImpl implements Subject {
    private Vector<Observer> observers;

    public SubjectImpl() {
        observers = new Vector<Observer>();
    }
    
    public void register(Observer target) {
        observers.add(target);
    }

    public void unregister(Observer target) {
        observers.remove(target);
    }

    public void notifyAddition(String name) {
        observers.forEach(observer -> { observer.added(name); });
    }

    public void notifyRemoval(String name) {
        observers.forEach(observer -> { observer.removed(name); });
    }

    public void notifyRename(String prev, String now) {
        observers.forEach(observer -> { observer.renamed(prev, now); });
    }
}