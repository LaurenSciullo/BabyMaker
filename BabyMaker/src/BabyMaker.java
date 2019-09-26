import java.util.ArrayList;

public class BabyMaker
	{

		public static void main(String[] args)
			{
				
			ArrayList < Baby > nursery = new ArrayList< Baby >();	
			
			nursery.add(new Baby("male", 6.2 , "Fred"));
			nursery.add(new Baby("female", 7.0 , "Franny"));
			nursery.add(new Baby("male", 6.8, "Frenchie"));
			nursery.add(new Baby("female", 6.0 , "Felicity"));
			
			// getter:
			System.out.println(nursery.get(0).getName());
			
			// setter:
			nursery.get(0).setGender("female");
			System.out.println(nursery.get(0).getGender());
			
			System.out.println("\n");
			for (Baby b : nursery)
				{
					System.out.println(b.getName());
				}

			}

	}
