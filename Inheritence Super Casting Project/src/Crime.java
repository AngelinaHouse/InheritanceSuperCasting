public class Crime extends Fraud
	{
  //protected String name = "Coding";

  public Crime()
    {
    System.out.println("Lets do something illegal.");
    }

	public void plan()
		{
		System.out.println("Hey look theres a nice big bank across the street.");
		super.plan();
    }
	public void commit()
		{
		System.out.println("Wait did we hack the cameras?");
		}

  public void run()
    {
    System.out.println("Where are the sirens coming from??");
    super.run();
    }
	}
