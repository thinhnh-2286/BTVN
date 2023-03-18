package vehicle;

public class Owner {
	private String IdOwner;
    private String name;
    private String email;
    
    public Owner(String IdOwner, String name, String email) {
        this.IdOwner = IdOwner;
        this.name = name;
        this.email = email;
    }
    
    public String getIdOwner() {
        return IdOwner;
    }
    
    public void setIdOwner(String IdOwner) {
        this.IdOwner = IdOwner;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
}
