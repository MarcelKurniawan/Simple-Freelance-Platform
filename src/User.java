public abstract class User {
    String nama;
    String username;
    String password;
    
    public User(){
        nama = "";
        username = "";
        password = "";
    }

    public User(String nama, String username, String password) {
        this.nama = nama;
        this.username = username;
        this.password = password;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" + "nama=" + nama + ", username=" + username + ", password=" + password + '}';
    }
    
}
