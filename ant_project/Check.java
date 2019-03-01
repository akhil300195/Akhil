class Check
{
  public String returnName(String Name_val)
  {
	String Name = Name_val;
	return Name;
  }
  public static void main(String[] args)
  {
	Check check = new Check();
	System.out.println(check.returnName("Praveen"));
  }
}
