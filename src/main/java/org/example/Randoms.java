package org.example;

import java.util.Random;
import java.util.Iterator;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    protected final int min;
    protected final int max;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;

    }

    @Override
    public Iterator<Integer> iterator() {
        return new RandomsIterator();
    }

    private class RandomsIterator implements Iterator<Integer> {
        private final Random random = new Random();

        @Override
        public boolean hasNext() {
            return true;
        }

        @Override
        public Integer next() {
            return random.nextInt(max - min + 1) + min;
        }
    }
}

