abstract class Class1{  
  abstract void attend();  
}  
class Class2 extends Class1{
	void attend(){System.out.println("attend the class");}  

	public static void main(String args[]){  
 
		Class1 obj = new Class2();  
 
		obj.attend();  

	}  

}