import java.util.*;

public class Analog {
	public static int isAnagram(String str1, String str2)
	{
		
		if(str1.isEmpty() || str2.isEmpty())
		{
			return 0;
		}
		
		if(str1.length() != str2.length())
		{
			return 0;
		}
		
		HashMap<String, Integer> s1 = new HashMap<String, Integer>();
		HashMap<String, Integer> s2 = new HashMap<String, Integer>();
		
		for(char c : str1.toCharArray())
		{
			if(s1.containsKey(String.valueOf(c)))
			{
				s1.put(String.valueOf(c), s1.get(String.valueOf(c))+1);
			}else
			{
				s1.put(String.valueOf(c), 1);
			}
		}
		
		for(char c : str2.toCharArray())
		{
			if(!s1.containsKey(String.valueOf(c)))
			{
				return 0;
			}
			if(s2.containsKey(String.valueOf(c)))
			{
				s2.put(String.valueOf(c), s2.get(String.valueOf(c))+1);
			}else
			{
				s2.put(String.valueOf(c), 1);
			}
		}
		
		
		for(String c : s1.keySet())
		{
			if(s1.get(c) != s2.get(c))
			{
				return 0;
			}
		}
		
		
		return 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		//input string1 and string2
		String string1, string2;
		
		System.out.print(isAnagram("listenl", "silentl"));

	}

}
