/*
 * Task-19: A college cultural event "Show Your talent" is being conducted and the organizing committee has decided to come up with an online registration for the same. Initially the registration fee for single and team events
			was same, but later the organizing committee decided to calculate the registration fee based on the number of participants.
			The students can participate in single events as well as team events. The portal displays the team number for a team and the participant number for a participant.
			Create a Java Project with the name OverridingAndSuper Implement the class EventRegistration, SingleEventRegistration, and TeamEventRegistration.
	Registration ID: JIRSS1132
	Name: Bipin Kumar
 */
public class ShowYourTalentRegistration {

	public static void main(String[] args) {
		EventRegistration participant1=new SingleEventRegistration("Jenny","Sing&Win",1);
		
		participant1.registerEvent();
		
		System.out.println();
		
		EventRegistration team1=new TeamEventRegistration("Aura","ShakeALeg",5,1);
		
		team1.registerEvent();
		
		System.out.println();
		
		EventRegistration participant2=new SingleEventRegistration("Hudson","PlayAway",5);
		
		participant2.registerEvent();

	}

}
