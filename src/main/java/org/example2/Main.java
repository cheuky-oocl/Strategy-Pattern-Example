package org.example2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Demo start:");

        System.out.println("Default sorting strategy:");
        CustomList list = new CustomList(new DefaultSortStrategy());
        list.sortList();
        System.out.println();

        System.out.println("Bubble sorting strategy:");
        CustomList bubbleSortList = new CustomList(new BubbleSortStrategy());
        bubbleSortList.sortList();
        System.out.println();

        System.out.println("Merge sorting strategy:");
        CustomList quickSortList = new CustomList(new QuickSortStrategy());
        quickSortList.sortList();
        System.out.println();

        System.out.println("Quick sorting strategy:");
        CustomList mergeSortList = new CustomList(new MergeSortStrategy());
        mergeSortList.sortList();
        System.out.println();

        System.out.println("noSortList has No sorting strategy:");
        CustomList noSortList = new CustomList();
        noSortList.sortList();
        System.out.println();
        System.out.println("Give noSortList merge sorting strategy:");
        noSortList.setSortStrategy(new MergeSortStrategy());
        noSortList.sortList();
        System.out.println();

        System.out.println("-demo end");
    }
}