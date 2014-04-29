import java.util.*;

public class Workshop{
	
	private int nummer;
	private String bezeichnung;
	private Date datum;
	private Referent referent;
	private ArrayList<Teilnehmer> teilnehmer;

	public Workshop(int nummer, String bezeichnung, Date datum, Referent referent){
		this.nummer=nummer;
		this.bezeichnung=bezeichnung;
		this.datum=datum;
		this.referent=referent;
		this.teilnehmer=new ArrayList();
	}

	public int getNummer(){
		return this.nummer;
	}

	public String getBezeichnung(){
		return this.bezeichnung;
	}

	public Date getDatum(){
		return this.datum;
	}

	public Referent getReferent(){
		return this.referent;
	}

	public void addTeilnehmer(Teilnehmer teilnehmer){
		this.teilnehmer.add(teilnehmer);
	}
}