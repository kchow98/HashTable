public class RunnerHashTable
{
	public static void main(String[] args)
	{
		HashTable list = new HashTable(10);
		list.put("potato");
		list.put("tomato");
		list.put("fruit");
		list.put("corn");
		list.put("apple");
		list.put("cherry");
		System.out.println(list);
		list.rehash();
		System.out.println(list); //make sure rehashing is working
	}
}