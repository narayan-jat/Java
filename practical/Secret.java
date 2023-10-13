// Creating a class having private attributes.
class Secret{
	private int secretId = 456132;
	private String name = "Narayan Jat";

	// creating methods to access and set private attributes.
	public int getSecretId(){
		return secretId;
	}
	public String getName(){
		return name;
	}
	public void setSecretId(int secretId){
		secretId = secretId;
	}
	public void setName(String name){
		name = name;
	}
}