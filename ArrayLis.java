import java.util.*;

public class ArrayLis {
    public static void main(String[] args) {
        arraylist();
        linkedlist();
        hashset();
        treeset();
        hashmap();
        treemap();
        priorityqueue();
    }
    static void arraylist(){
        //ArrayList
        ArrayList<Integer> list=new ArrayList<>();
        list.add(4);
        list.add(7);
        list.add(21);
        //22 Write a Java program to print all the elements of an ArrayList using the elements' position.
        for(int i=0; i<list.size();i++){
            System.out.println(list.get(i));
        }
        //21 Write a Java program to replace the second element of an ArrayList with the specified element.
        list.add(1,3);
        list.remove(2);
        System.out.println(list);
        //20 Write a Java program to increase an array list size
        System.out.println(list.size());
        //18 Write a Java program to test whether an array list is empty or not.
        if(list.size()==0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        //16 Write a Java program to clone an array list to another array list.
        ArrayList<Integer> list2=new ArrayList<>();
        for(int i=0; i<list.size();i++){
            list2.add(list.get(i));}
        //17 Write a Java program to empty an array list.
        int s=list.size();
        for(int i=0; i<s;i++){
            list.remove(0);}
    }
    static void linkedlist(){
        //LinkedList
        LinkedList<Integer> listl=new LinkedList<>();
        listl.add(1);listl.add(1);listl.add(1);listl.add(1);
        //25 Write a Java program to check if a linked list is empty or not
        if(listl.size()==0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        //22 Write a Java program to check if a particular element exists in a linked list.
        int target=3;
        for(int i=0; i<listl.size();i++){
            if(listl.get(i)==target){
                System.out.println("find");
            };}
        //21 Write a Java program to retrieve, but not remove, the last element of a linked list.
        int last=listl.get(listl.size()-1);
        //20 Write a Java program to retrieve, but not remove, the first element of a linked list.
        int first=listl.get(0);
        //19 Write a Java program to remove and return the first element of a linked list.
        int firstdelete=listl.remove(0);
        //15 Write a Java program that swaps two elements in a linked list.
        int num1=listl.get(1);
        listl.set(1,listl.get(2));
        listl.set(2,num1);
    }
    static void hashset(){
        HashSet<Integer> set=new HashSet<>();
        set.add(1);set.add(5);set.add(2);set.add(19);
        //9  Write a Java program to find numbers less than 7 in a tree set.
        for(Integer h:set){
            if(h<7){
                System.out.println(h);
            }
        }
        //8 Write a Java program to convert a hash set to a tree set.
        TreeSet<Integer> hah=new TreeSet<>();
        for(Integer h:set){
            hah.add(h);
        }
        //7 Write a Java program to convert a hash set to an array
        List<Integer> d=new ArrayList<>();
        for(Integer h:set){
            hah.add(h);}
        //6 Write a Java program to clone a hash set to another hash set.
        HashSet<Integer> set2=new HashSet<>();
        set2=(HashSet)set.clone();
        //12 Write a Java program to remove all elements from a hash set.
        set.clear();
        //1 Write a Java program to append the specified element to the end of a hash set.
        set.add(23);
    }
    static void treeset(){
        //1 Write a Java program to create a tree set, add some colors (strings) and print out the tree set.
        TreeSet<Integer> tree=new TreeSet<>();
        tree.add(1);tree.add(2);tree.add(7);tree.add(13);
        System.out.println(tree);
        //16 Write a Java program to remove a given element from a tree set.
        tree.remove(7);
        //9 Write a Java program to find numbers less than 7 in a tree set.
        for(Integer c:tree){
            if (c < 7) {
                System.out.println(c);
            }}
        //7 Write a Java program to get the number of elements in a tree set.
        System.out.println(tree.size());
        //6 Write a Java program to clone a tree set list to another tree set.
        TreeSet<Integer> tree2=new TreeSet<>();
        tree2=(TreeSet)tree.clone();
        //5 Write a Java program to get the first and last elements in a tree set.
        tree.first();
        tree.last();
    }
    static void hashmap(){
        HashMap<String, String> map = new HashMap<>();
        map.put("Apple", "Red");
        map.put("Banana", "Yellow");
        map.put("Grape", "Purple");
        // 1 Write a Java program to associate the specified value with the specified key in a HashMap.
        map.put("Orange", "Orange");
        // 2 Write a Java program to count the number of key-value (size) mappings in a map.
        System.out.println("Map size: " + map.size());
        // 7 Write a Java program to test if a map contains a mapping for the specified key.
        if(map.containsKey("Banana")){
            System.out.println("Key found");
        }
        // 8 Write a Java program to test if a map contains a mapping for the specified value.
        if(map.containsValue("Red")){
            System.out.println("Value found");
        }
        // 10 Write a Java program to get the value of a specified key in a map.
        String val = map.get("Apple");
        System.out.println("Value for key 'Apple': " + val);
        // 11 Write a Java program to get a set view of the keys contained in this map.
        Set<String> keys = map.keySet();
        System.out.println("Keys: " + keys);
    }
    static void treemap(){
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(3, "Three");map.put(1, "One");map.put(4, "Four");map.put(2, "Two");
        // 1 Write a Java program to associate the specified value with the specified key in a Tree Map.
        map.put(5, "Five");
        // 3 Write a Java program to search for a key in a Tree Map.
        if(map.containsKey(2)){
            System.out.println("Found key 2");}
        // 4 Write a Java program to search for a value in a Tree Map.
        if(map.containsValue("Four")){
            System.out.println("Found value Four");
        }
        // 5 Write a Java program to get all keys from a Tree Map.
        Set<Integer> keys = map.keySet();
        for(Integer key : keys){
            System.out.println("Key: " + key);
        }
        // 8 Write a Java program to get a key-value mapping associated with the greatest key and the least key in a map.
        System.out.println("Least Entry: " + map.firstEntry());
        System.out.println("Greatest Entry: " + map.lastEntry());
        // 10 Write a Java program to get a reverse order view of the keys contained in a given map.
        NavigableSet<Integer> reverseKeys = map.descendingKeySet();
        System.out.println("Reverse Keys: " + reverseKeys);
    }
    static void priorityqueue(){
        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("Red");pq.add("Green");pq.add("Blue");pq.add("Yellow");
        // 1 Write a Java program to create a priority queue, add some colors (strings) and print out the elements of the priority queue.
        System.out.println("PriorityQueue: " + pq);
        // 2 Write a Java program to iterate through all elements in the priority queue.
        for(String color : pq){
            System.out.println(color);}
        // 3 Write a Java program to add all the elements of a priority queue to another priority queue.
        PriorityQueue<String> newPQ = new PriorityQueue<>();
        newPQ.addAll(pq);
        // 6 Write a Java program to count the number of elements in a priority queue.
        System.out.println("Size: " + pq.size());
        // 8 Write a Java program to retrieve the first element of the priority queue.
        System.out.println("First element (peek): " + pq.peek());
        // 9 Write a Java program to retrieve and remove the first element.
        System.out.println("Removed first element: " + pq.poll());
    }
}
