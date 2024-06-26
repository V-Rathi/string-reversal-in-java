
class reversal {
	public static void main(String args[])
	{
		String original ="aabbbcc";//creating a string named original
		int l=original.length();//storing the length of string in int variable l
		String v="";//creating a empty string to hold the value of string that we are going to reverse
		System.out.println(original);
	   for (int i = 0; i < l; i++) {//creating a for loop for all the character of the string
		char ch =original.charAt(i);//taking the charcter of string and stoing in char variable
		v = ch + v;//adding the character and storing in string
			
		}
		System.out.print(v +"\n" );
		if (original.equals(v)){//checking if the string are equal using equals finction 
			System.out.println("true");
		}
		else{
			System.out.println("flase");
		}
	}
}