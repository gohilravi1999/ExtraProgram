
abstract class Person
{
	abstract void run();
}

public class AnonymousInnerClass
{
	public static void main(String[] args)
	{
		Person person = new Person()
		{
			void run()
			{
				System.out.println("Running");
			}
		};
	person.run();
	}
}
