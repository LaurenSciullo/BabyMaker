// Baby class = POJO
public class Baby
	{
		// instance variables:
		private String gender;
		private double weight;
		private String name;
		
		// constructor:
		public Baby(String g, double w, String n)
		{
			gender = g;
			weight = w;
			name = n;
			
		}
		
// getters & setters:
		public String getGender()
			{
				return gender;
			}

		public void setGender(String gender)
			{
				this.gender = gender;
			}

		public double getWeight()
			{
				return weight;
			}

		public void setWeight(double weight)
			{
				this.weight = weight;
			}

		public String getName()
			{
				return name;
			}

		public void setName(String name)
			{
				this.name = name;
			}

	}
