package Map;

public class MyMapMain {
    public static void main(String[] args) {
        MyMap<String, Integer> myMapObj = new MyMap<>();
        myMapObj.put("apple",20);
        myMapObj.put("orange",40);
        myMapObj.put("banana",10);
        myMapObj.put("banana",100);
        myMapObj.put("orange",500);
        myMapObj.put("mango",4);
        myMapObj.put("egg",23);

        myMapObj.printAll();
        System.out.println("Removed value: "+myMapObj.remove("egg"));
        System.out.println("Removed value: "+myMapObj.remove("orange"));
        System.out.println("Removed value: "+myMapObj.remove("apple"));
        System.out.println("Removed value: "+myMapObj.remove("banana"));
        System.out.println("Removed value: "+myMapObj.remove("mango"));
        System.out.println("Removed value: "+myMapObj.remove("mango"));
        System.out.println("Removed value: "+myMapObj.remove("banana"));

        myMapObj.put("none",30);
        myMapObj.printAll();
        System.out.println("Removed value: "+myMapObj.remove("none"));
        System.out.println("");
        myMapObj.printAll();

    }
}