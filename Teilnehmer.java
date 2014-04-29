public class Teilnehmer{
	
	private String name, email, status;
	

	public Teilnehmer(String name, String email, String status){
		this.name=name;
		this.email=email;
		this.status=status;
	}

	public String getName(){
		return this.name;
	}

	public String getEmail(){
		return this.email;
	}

	public String getStatus(){
		return this.status;
	}
}
