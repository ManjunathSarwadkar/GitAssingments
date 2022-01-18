import java.util.HashMap;

public class HashMapDemo 
{

	public static void main(String[] args) 
	{
	HashMap<String, Integer> map = new HashMap<>();
	
	map.put("Sumit", 18);
	
	map.put("Raja", 20);
	
	map.put("Vishal", 23);
	
	map.put("prajwal", 22);
	
	map.forEach((v, k) -> System.out.println("Name :"+ v +", Age :"+ k));
	
	}

}