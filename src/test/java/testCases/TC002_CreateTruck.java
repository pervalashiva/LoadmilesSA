package testCases;

import org.testng.annotations.Test;

import pageObjects.CreateTrukPage;

public class TC002_CreateTruck extends TC001_Login {

	@Test
	public void create_Truck ()
	{
		CreateTrukPage createTruck = new CreateTrukPage(driver);
		createTruck.setUp();
		createTruck.plusButton();
		createTruck.unitNum("YVUU7851");
		createTruck.selectTruckType("Flatbeds");
		createTruck.regState("CF");
	}
	
}
