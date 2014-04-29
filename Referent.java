public class Referent{
	
	private String name, email, firma;

	public Referent(String name, String email, String firma){
		this.name=name;
		this.email=email;
		this.firma=firma;
	}

	public String getName(){
		return this.name;
	}

	public String getEmail(){
		return this.email;
	}

	public String getFirma(){
		return this.firma;
	}
}