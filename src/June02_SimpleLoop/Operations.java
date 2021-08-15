package June02_SimpleLoop;

public class Operations {
	
	int num;  //object variables-value of object variables depends on objects
	
	void cube()
	{
		int ans=num*num*num;
		System.out.println(ans);
	}
	
	void square()
	{
		int ans=num*num;
		System.out.println(ans);
	}
	
	
	public static void main(String[] args) {
		
		Operations obj=new Operations();
		obj.num=9;
		obj.cube();
		obj.square(); 
	}

}//Similarly like object variables.instance variable we have object methods,instance methods...depends on object variables
//Class method/static method does not depend on object
//access modifiers--private,public,default,protected(how they can be accessed with reference or with class name is another thing)