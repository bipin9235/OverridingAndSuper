
public class EventRegistration {
	// data members
	String name;
	String nameOfEvent;
	double registrationFee;
	// constructor
	public EventRegistration(String name, String nameOfEvent) {
		this.name = name;
		this.nameOfEvent = nameOfEvent;
		this.registrationFee = registrationFee;
	}
	// getter and setter methods
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNameOfEvent() {
		return nameOfEvent;
	}
	public void setNameOfEvent(String nameOfEvent) {
		this.nameOfEvent = nameOfEvent;
	}
	public double getRegistrationFee() {
		return registrationFee;
	}
	public void setRegistrationFee(double registrationFee) {
		this.registrationFee = registrationFee;
	}
	// Register Event method
   	void registerEvent() {
   		switch(nameOfEvent) {
   		case "ShakeALeg": System.out.println("Registratin fee for ShakeALeg event : 100");
   							break;
   		case "Sing&Win": System.out.println("Registratin fee for Sing&Win event : 150");
			break;
   		case "Actathon": System.out.println("Registratin fee for Actathon event : 70");
   						break;
   		case "PlayAway": System.out.println("Registratin fee for PlayAway event : 130");
   							break;
   		default: System.out.println("No such Event!");
   		}
   	}
	
}
