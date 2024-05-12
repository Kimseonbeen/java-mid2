package generic.test.ex2;

public class Pair<K, V> {

    private K first;
    private V second;

    public void setFirst(K first) {
        this.first = first;
    }

    public K getFirst() {
        return first;
    }

    public void setSecond(V second) {
        this.second = second;
    }

    public V getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}
