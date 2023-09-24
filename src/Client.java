public class Client extends User{

    public Client(){
        super();
    }

    public Client(String nama, String username, String password) {
        super(nama, username, password);
    }
    
    
    @Override
    public String toString() {
        return "Nama=" + nama ;
    }
    
    
    
}
