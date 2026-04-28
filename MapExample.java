import java.util.*;
class MapExample
 {
    public static void main(String[] args) 
	{
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Arun");
        map.put(2, "Bala");
        map.put(3, "Charan");
        System.out.println("ID 2: " + map.get(2));
        map.put(2, "Balan");
        map.remove(3);
        for (Map.Entry<Integer, String> entry : map.entrySet())
			{
            System.out.println(entry.getKey() + " : " + entry.getValue());
			}
    }
}