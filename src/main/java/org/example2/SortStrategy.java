package org.example2;

public interface SortStrategy {
    void sortList();
}

class DefaultSortStrategy implements SortStrategy {
    @Override
    public void sortList() {
        System.out.println("Sort");
    }
}

class BubbleSortStrategy implements SortStrategy {
    @Override
    public void sortList() {
        System.out.println("Bubble Sort");
    }
}

class QuickSortStrategy implements SortStrategy {
    @Override
    public void sortList() {
        System.out.println("Quick Sort");
    }
}

class MergeSortStrategy implements SortStrategy {
    @Override
    public void sortList() {
        System.out.println("Merge Sort");
    }
}
