
public class ArrOutOfBounds {
	public static void main(String[] args) {
		int []arr = new int[5];		
		int num = 0;
		String str = null;
		String str1 ="INDIA";
		try
		{
			arr[5] = 0;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array Out of Bounds handled");
		}
		finally{
			System.out.println("Executed 1st assignment");
		}
		try
		{
			num = Integer.parseInt("asdsa123");
		}
		catch(NumberFormatException e)
		{
			System.out.println("Caught format exception");
		}
		finally
		{
			System.out.println("Finaly Executed 2nd assignment");
		}
		
		try
		{
			str.length();
		}
		catch(NullPointerException e)
		{
			System.out.println("Caught Null Pointer exception");
		}
		finally
		{
			System.out.println("Executed 3rd Assignment");
		}
		try
		{
			str1.charAt(100);
		}catch( StringIndexOutOfBoundsException e)
		{
			System.out.println("Caught String Out Of Bound Exception");
		}
		finally
		{
			System.out.println("Executed 4th Assignment");
		}
}
}


