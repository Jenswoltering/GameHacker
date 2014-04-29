import java.util.*;

public class Rahmenprogramm{

	private String bezeichnung, zeit, ort;
	private Date datum;
	private ArrayList<Teilnehmer> teilnehmer;

	public Rahmenprogramm(String bezeichnung, String zeit, String ort, Date datum){
		this.bezeichnung=bezeichnung;
		this.zeit=zeit;
		this.ort=ort;
		this.datum=datum;
		this.teilnehmer=new ArrayList();
	}

	public String getBezeichnung(){
		return this.bezeichnung;
	}

	public String getZeit(){
		return this.zeit;
	}

	public String getOrt(){
		return this.ort;
	}

	public Date getDatum(){
		return this.datum;
	}

	public void addTeilnehmer(Teilnehmer teilnehmer){
		this.teilnehmer.add(teilnehmer);
	}
}