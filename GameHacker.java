import java.util.*;

public class GameHacker{
	
	public static void main(String[] args){
		Teilnehmer teilnehmer = new Teilnehmer("Gustav Gans","Gustav@gans.com","Student");
		Referent referent = new Referent("Max Mustermann","max@mustermann.com","Muster GmbH");
		Workshop workshop = new Workshop(11111,"Beispielworkshop",new Date(2014,5,6),referent);
		Rahmenprogramm rahmenprogramm = new Rahmenprogramm("Fussball","20:00","Millerntor",new Date(2014,5,8));
		

		workshop.addTeilnehmer(teilnehmer);
		rahmenprogramm.addTeilnehmer(teilnehmer);
	}
}