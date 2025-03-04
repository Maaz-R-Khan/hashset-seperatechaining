package org.example;

import java.util.ArrayList;

public class MyHashSet {

   private ArrayList<Integer>[] buckets;
   private int numElements;

    // Default constructor
    MyHashSet() {
        numElements = 0; // we set the numElements to zero, because there is no data yet.
        buckets = new ArrayList[4]; //declaration of an array list.

        //Initializes each bucket
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<>();
        }
    }

    // hasItem method
    boolean hasItem(int targetItem) {
        for (int i = 0; i < buckets.length; i++) {
            if (buckets[i].contains(targetItem)) {
                return true;
            }
        }
    return false;
    }

    // add method
   public void add(int data) {

        /* Pseudocode for adding a key/value pair to the hash table.
        * index = hash(key)
        * list = hashTable[index]
        * Add the key/value pair to list
        * */

       //Get the bucket index(hashing)

       int index  = data % buckets.length;

       // Get the bucket using the bucket index
       ArrayList<Integer> currentBucket;
       currentBucket = buckets[index];
       currentBucket.add(data);
    }

    double loadFactor() {
    return 0;
    }

    void resize(int newSize){}



}
