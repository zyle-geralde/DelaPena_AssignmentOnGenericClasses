package Map;
import java.util.ArrayList;

public class MyMap <K,V>{
    ArrayList<K> keylist;
    ArrayList<V> valuelist;


    public MyMap(){
        keylist = new ArrayList<>();
        valuelist = new ArrayList<>();
    }

    public void put(K key, V value){
        if(keylist.contains(key)){
            int ind = keylist.indexOf(key);
            valuelist.set(ind,value);
        }
        else{
            keylist.add(key);
            valuelist.add(value);
        }
    }

    public V get(K key){
        if(keylist.indexOf(key) < 0){
            return null;
        }
        else{
            int ind = keylist.indexOf(key);
            return valuelist.get(ind);
        }
    }

    public V remove(Object key){
        if(keylist.indexOf((K)key) < 0 ){
            return null;
        }
        else{
            V storeddata = valuelist.get(keylist.indexOf((K)key));
            keylist.remove((K)key);
            valuelist.remove(storeddata);
            return storeddata;
        }
    }

    public void printAll(){
        if(keylist.size() == 0){
            System.out.println("None");
            return;
        }
        for(int loop = 0; loop<keylist.size(); loop++){
            System.out.print("Key: "+keylist.get(loop)+" ");
            System.out.println("Value: "+valuelist.get(loop));
        }
    }


}

