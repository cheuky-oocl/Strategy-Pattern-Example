package org.example2;

public class CustomList {
    private SortStrategy sortStrategy;

    public CustomList() {
    }

    public CustomList(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    public void setSortStrategy(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    public void sortList(){
        if (this.sortStrategy != null){
            this.sortStrategy.sortList();
        }
    }
}
