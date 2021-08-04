
public class TeamEventRegistration extends EventRegistration{
	int noOfParticipants;
	int teamNo;
	public TeamEventRegistration(String name, String nameOfEvent, int noOfParticipants, int teamNo) {
		super(name, nameOfEvent);
		this.noOfParticipants = noOfParticipants;
		this.teamNo = teamNo;
	}
	public int getNoOfParticipants() {
		return noOfParticipants;
	}
	public void setNoOfParticipants(int noOfParticipants) {
		this.noOfParticipants = noOfParticipants;
	}
	public int getTeamNo() {
		return teamNo;
	}
	public void setTeamNo(int teamNo) {
		this.teamNo = teamNo;
	}
 void registerEvent() {
	 int baseFee=0;
	 switch(nameOfEvent) {
		case "ShakeALeg": baseFee=50;
							break;
		case "Sing&Win": baseFee=60;
			break;
		case "Actathon": baseFee=80;
						break;
		case "PlayAway": baseFee=100;
							break;
		default: System.out.println("No such Event! Please choose a valid event");
		}
	 if(baseFee!=0) {
	 int registrationFee=baseFee*noOfParticipants;
	 System.out.println("Thank You "+name+" for your participation. Your registratin fee for is  : "+registrationFee);
	 System.out.println("You are Participant no.: "+teamNo);
	 }
 }
}
