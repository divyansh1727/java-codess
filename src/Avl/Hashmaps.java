package Avl;

import java.util.HashMap;
import java.util.HashSet;

public class Hashmaps {
    static class mapusinghash{
        private Entity[] entities;
        public mapusinghash(){
            entities=new Entity[100];
        }
        public void put(String key, String val){
            int hash=Math.abs(key.hashCode() % entities.length);
            entities[hash]=new Entity(key,val);//overriding
        }
        public String get(String key){
            int hash=Math.abs(key.hashCode() % entities.length);
            if(entities[hash]!=null && entities[hash].key.equals(key)){
                return entities[hash].val;
            }
            return null;
        }
        public void remove(String key) {
            int hash = Math.abs(key.hashCode() % entities.length);
            if (entities[hash] != null && entities[hash].key.equals(key)) {
                entities[hash] = null;
            }

        }
        private class Entity {
            String key;
            String val;

            public Entity(String key, String val) {
                this.key = key;
                this.val = val;
            }
        }
    }

        public static void main(String[] args) {
//        String name="divyansh";
////        System.out.println(name.hashCode());
//        HashMap<String, Integer> map=new HashMap<>();
//        map.put("karan",32);
//        map.put("ran",2);
//        map.put("kar",3);
//        System.out.println(map.get("kar"));
//        //containskey returns present or not
//        System.out.println(map.containsKey("ka"));
//        System.out.println(map.getOrDefault("erfb",322));
//        HashSet<Integer> set= new HashSet<>();
//        set.add(23);
//        set.add(3);
//        set.add(2);
//        set.add(213);
//        set.add(23);
//        System.out.println(set);
            mapusinghash map = new mapusinghash();
            map.put("mangto", "king");
            map.put("apple", "sweet");
            System.out.println((map.get("apple")));
            //
            // System.out.println((map.remove("apple")));

        }
    }


