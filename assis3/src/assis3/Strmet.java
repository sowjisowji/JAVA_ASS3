package assis3;

public class Strmet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=new String("Java string pool refers to collection of strings which are stored in heap memory");
		String str1=str.toLowerCase();
		System.out.println(str1);
		String str2=str.toUpperCase();
		System.out.println(str2);
		String str3=str.replace('a','$');
		System.out.println(str3);
		if(str.contains("collection"))
		{
			System.out.println("original strings contain the word 'collection'");
		}
		String str4=new String("Java string pool refers to collection of strings which are stored in heap memory");
		if(str==str4)
		{
			System.out.println("str equals to str4");
		}
		else
		{
			System.out.println("str equals not to str4");
		}
		if(str.equals(str4))
		{
			System.out.println("str equals to str4");
		}
		else
		{
			System.out.println("str equals not to str4");
		}
	}

}
