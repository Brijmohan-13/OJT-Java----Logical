package June14_Pattern;


// 1
// 2  3
// 4  5  6
public class Pattern3 {
	
	public static void main(String[] args) {
		
		int index=1;
		
		for(int i=1; i<=3;  i++)
		{
			for(int j=1;  j<=i;   j++)
			{
				System.out.print(index+" ");
				index++;
			}
			System.out.println();
		}		
	}
}

//Boxing-Adding primitive data type values in collection(list,set,map) is called as BOXING
//Autoboxing-these primitive values gets converted into Integer Class objects internally--AUTOBOXING
//this internal method is:  Integer valueOf(a)    argument is primitive value and return type is Integer class object


//UNBOXING and AUTOUNBOXING are exactly reverse i.e to retrieve the objects

// instanceOf(); is used to check  whose object is created

//objects are made in heap
//references are stored in stack