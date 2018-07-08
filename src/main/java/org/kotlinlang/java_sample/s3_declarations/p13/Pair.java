package org.kotlinlang.java_sample.s3_declarations.p13;

import java.util.HashMap;
import java.util.Map;

public class Pair<K, V> {
    private final K first;
    private final V second;

    public Pair(K first, V second) {
        this.first = first;
        this.second = second;
    }

    public K getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }

    public Map<K, V> getPair() {
        Map<K, V> m = new HashMap<>(1);
        m.put(first, second);
        return m;
    }
}
