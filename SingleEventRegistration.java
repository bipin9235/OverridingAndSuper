
public class SingleEventRegistration extends EventRegistration {
	int participantNo;

	public SingleEventRegistration(String name, String nameOfEvent, int participantNo) {
		super(name, nameOfEvent);
		this.participantNo = participantNo;
	}

	public int getParticipantNo() {
		return participantNo;
	}

	public void setParticipantNo(int participantNo) {
		this.participantNo = participantNo;
	}
	int baseFee=0;
	 void registerEvent() {
		 switch(nameOfEvent) {
	   		case "ShakeALeg": displayMessage(100);
	   							break;
	   		case "Sing&Win": displayMessage(150);
	   							break;
	   		case "PlayAway": displayMessage(130);
	   							break;
	   		default: 
	   		}
		 
	 }
	
	 void displayMessage(int baseFee) {
		 if(baseFee!=0) {
			 System.out.println("Thank You "+name+" for your participation. Your registratin fee is : "+baseFee);
			 System.out.println("You are Participant no : "+participantNo);
		 }
			 else
			 System.out.println("No such Event! Please choose a valid event");
	 }
}
