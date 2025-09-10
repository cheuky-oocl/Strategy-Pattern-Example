package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Demo start:");

        System.out.println("Default sorting method:");
        CustomList list = new CustomList();
        list.sortList();
        System.out.println();

        System.out.println("Override bubble sorting method:");
        CustomList bubbleSortList = new BubbleSortList();
        bubbleSortList.sortList();
        System.out.println();

        System.out.println("Override quick sorting method:");
        CustomList quickSortList = new QuickSortList();
        quickSortList.sortList();
        System.out.println();

        System.out.println("Override merge sorting method:");
        CustomList mergeSortList = new MergeSortList();
        mergeSortList.sortList();
        System.out.println();

        System.out.println("No sorting method:");
        CustomList noSortList = new NoSortList();
        noSortList.sortList();
        System.out.println();

        System.out.println("-Demo end");
    }
}