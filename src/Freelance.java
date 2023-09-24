public class Freelance extends User{
    public Freelance(){
        super();
    }

    public Freelance(String nama, String username, String password) {
        super(nama, username, password);
    } 

    @Override
    public String toString() {
        return "Nama : " + nama  ;
    }
    
}