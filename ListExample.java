import java.util.*;
class ListExample
 {
    public static void main(String[] args) 
	{
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(2, 25);
        list.remove(Integer.valueOf(40));
        list.set(3, 35);
        for (int num:list)
			{
            System.out.println(num);
			}
    }
}