package exercise4;

import java.util.*;

/**
 * Exercise 3. Implement a HashMap from scratch. In order to pass all the tests
 * you need to implement all the methods defined below. The key-value pair will
 * be encapsulated in the MyHashMap.MyEntry object defined below.
 *
 * The buckets list in which each MyEntry object will be stored is stored in "buckets" object.
 * The hash function that you will use in order to store a pair in a specific bucket will be
 * the one presented earlier: (hashcode value) modulo (bucket array size)
 */
public class MyHashMap {

//    private Map<String,String>dogs;

    private ArrayList<LinkedList<MyEntry>> buckets;

    private final int BUCKET_ARRAY_SIZE = 16;

    public MyHashMap() {

        // TODO Initialize buckets list
        buckets = new ArrayList<LinkedList<MyEntry>>(BUCKET_ARRAY_SIZE);
        for (int i=0;i<BUCKET_ARRAY_SIZE;i++)
            buckets.add(new LinkedList<MyEntry>());
    }

    public String get(String key) {
        // TODO

        for (LinkedList<MyEntry> in0 : buckets) {
            for (MyEntry in1 : in0)
                if (in1.getKey() == key)

                    return in1.getValue();
        }
        return null;
    }

    public void put(String key, String value) {
        // TODO
        if(key!=null) {
            if (!containsKey(key))
                buckets.get(Math.abs(key.hashCode() % 16)).add(new MyEntry(key, value));
        }
        else
            buckets.get(0).add(new MyEntry(key, value));
      }


    public Set<String> keySet() {
        // TODO
        Set<String>keyset=new HashSet<String>();
        for (LinkedList<MyEntry> in0 : buckets) {
           for (MyEntry in1 : in0)
               keyset.add(in1.getKey());
    }
        return keyset;
    }

    public Collection<String> values() {
        // TODO

        Collection<String> val=new ArrayList<String>();
        for (LinkedList<MyEntry> in0 : buckets) {
            for (MyEntry in1 : in0)
                val.add(in1.getValue());
        }
        return val;
    }

    public String remove(String key) {
        String string="";
        // TODO Returns the value associated with the key removed from the map or null if the key wasn't found
        for (LinkedList<MyEntry> in0 : buckets)
            for (MyEntry in1 : in0)
                if(in1.getKey().equals(key)){
                    string=in1.getValue();
            in0.remove(in1);}

            return string;
    }

    public boolean containsKey(String key) {
        // TODO
        for (LinkedList<MyEntry> in0 : buckets)
            for (MyEntry in1 : in0)
                if(in1.getKey().equals(key))
                    return true;
        return false;
    }

    public boolean containsValue(String value) {
        // TODO
        return false;
    }

    public int size() {
        // TODO Return the number of the Entry objects stored in all the buckets
        return 0;
    }

    public void clear() {
        // TODO Remove all the Entry objects from the bucket list
    }

    public Set<MyEntry> entrySet() {
        // TODO Return a Set containing all the Entry objects
        return null;
    }

    public boolean isEmpty() {

        // TODO
        for (LinkedList<MyEntry> in0 : buckets)
            if(in0!=null)
                return false;

            return true;
    }

    public static class MyEntry {
        private String key;
        private String value;

        public MyEntry(String key, String value) {
            this.key = key;
            this.value = value;
        }

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }
}
