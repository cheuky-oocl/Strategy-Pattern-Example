package org.example;

public class NoSortList extends CustomList {

    @Override
    public void sortList() {
        //code smell Refused Bequest: not using inherited method
    }
}
