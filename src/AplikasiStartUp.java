import java.util.*;

/**
 * UTS Object Oriented Programming
 * @author Marcel Kurniawan
 * NIM : 2501977090
 */
public class AplikasiStartUp {
    ArrayList<User> arr1 = new ArrayList<>();
    ArrayList<User> arr2 = new ArrayList<>();
    ArrayList<User> arr3 = new ArrayList<>();
    ArrayList<Project> projects = new ArrayList<>();
    ArrayList<Project> ProjectTaken = new ArrayList<Project>();
    int pilihan1;
    public AplikasiStartUp(){
        Client client1 = new Client("Raka", "raka", "raka123");
        arr2.add(client1);
        Client client2 = new Client("Rafael", "rafael", "rafa123");
        arr2.add(client2);
        Client client3 = new Client("Dani", "dani", "dani123");
        arr2.add(client3);
        Client client4 = new Client("Robert", "robert", "robert123");
        arr2.add(client4);
        Client client5 = new Client("Rian", "rian", "rian123");
        arr2.add(client5);
        Freelance freelance1 = new Freelance("Rania", "rania", "rania123");
        arr3.add(freelance1);
        Freelance freelance2 = new Freelance("Dani", "dani", "dani123");
        arr3.add(freelance2);
        Freelance freelance3 = new Freelance("Rika", "rika", "rika123");
        arr3.add(freelance3);
        
        while(true){
            menu();
        }
    }

    void menu(){
        cls();
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.println("Login Sebagai");
        System.out.println("1. Admin");
        System.out.println("2. Client");
        System.out.println("3. Freelance");
        System.out.println("4. Exit");
        System.out.print("Masukkan Pilihan : ");
        int pilihan = sc.nextInt();
        switch(pilihan){
            case 1:
                cls();
                System.out.println("Login Sebagai Admin");
                String username, password;
                System.out.print("Enter username :");
                username = sc.next();
                        password = sc.next();
                if(username.equals("admin") && password.equals("admin")){
                    System.out.println("Authentication Successful");
                }else{
                    System.out.println("Authentication Failed");
                    menu();
                }
                do{
                    System.out.println("");
                    System.out.println("Menu Admin");
                    System.out.println("1. Hapus Project");
                    System.out.println("2. Hapus Client");
                    System.out.println("3. Hapus Freelance");
                    System.out.println("4. Display data client");
                    System.out.println("5. Display data project");
                    System.out.println("6. Display data freelance");
                    System.out.println("7. Log Out");
                    System.out.print("Masukkan Pilihan : ");
                    pilihan1 = sc.nextInt();
                    if (pilihan1 == 1){
                        displayDataProject();
                        System.out.print("Masukan no data yang ingin dihapus : ");
                        int del = sc.nextInt();
                        del = del-1;
                        projects.remove(del);
                        System.out.println("Data berhasil dihapus !!");
                    }else if (pilihan1 == 2){
                        displayDataClient();
                        System.out.print("Masukan no data yang ingin dihapus : ");
                        int del = sc.nextInt();
                        del = del-1;
                        arr2.remove(del);
                        System.out.println("Data berhasil dihapus !!");
                    }else if (pilihan1 == 3){
                        displayDataFreelance();
                        System.out.print("Masukan no data yang ingin dihapus : ");
                        int del = sc.nextInt();
                        del = del-1;
                        arr3.remove(del);
                        System.out.println("Data berhasil dihapus !!");
                    }else if (pilihan1 == 4){
                        displayDataClient();
                    }else if (pilihan1 == 5){
                        displayDataProject();
                    }else if (pilihan1 == 6){
                        displayDataFreelance();
                    }
                }while(pilihan1 != 7);
                break;
                
            case 2:
                    
                cls();
                
                System.out.println("Login Sebagai Client");
                System.out.print("Enter username :");
                username = sc.next();
                System.out.print("Enter password :");
                password = sc.next();
                credentialClient(username,password);   
                System.out.println("Hi " + username);
                do{
                        System.out.println("");
                        System.out.println("Menu Client");
                        System.out.println("1. Post Project");
                        System.out.println("2. Print All Project");
                        System.out.println("3. Logout");
                        System.out.print("Masukkan Pilihan : ");
                        pilihan1 = sc.nextInt();
                        switch(pilihan1){
                            case 1:
                                Project projectclient = new Project();
                                System.out.print("Nama Proyek: ");
                                projectclient.setNamaProject(sc.next());
                                System.out.print("Deskripsi Proyek : ");
                                projectclient.setDeskripsiProject(sc.next());
                                System.out.print("Deadline Proyek : ");
                                projectclient.setDeadlinProject(sc.next());
                                System.out.print("Metode Pembayaran: ");
                                projectclient.setMetodePembayaran(sc.next());
                                System.out.print("Fee Project: ");
                                projectclient.setFeeProject(sc.next());
                                projects.add(projectclient);
                                break;
                            case 2:
                                System.out.println("\nProject :");
                                for (int i = 0; i < projects.size(); i++) {
                                    if (projects.get(i) != null) {
                                        System.out.println(projects.get(i));
                                    }
                                }
                                break;
                    }
                }while(pilihan1 != 3);
                break;
                    
           case 3:
                cls();
                System.out.println("");
                System.out.println("Login Sebagai Freelance");
                System.out.print("Enter username :");
                username = sc.next();
                System.out.print("Enter password :");
                password = sc.next();
                credentialFreelance(username, password);
                System.out.println("Hi " + username);
                do{
                    System.out.println("");
                    System.out.println("Menu Freelance");
                    System.out.println("1. Lihat Projek");
                    System.out.println("2. Ambil Projek");
                    System.out.println("3. Lihat Projek yang diambil");
                    System.out.println("4. Log Out");
                    System.out.print("Masukkan Pilihan : ");
                    pilihan1 = sc.nextInt();
                    switch(pilihan1){
                        case 1:
                            displayDataProject();
                            System.out.println("");
                            break;
                        case 2:
                            displayDataProject();
                            System.out.print("Masukan no project yang ingin diambil : ");
                            int del = sc.nextInt();                       
                            ProjectTaken.add(projects.get(del-1));
                            System.out.println("project telah diambil !!");
                            del = del-1;
                            projects.remove(del);
                            System.out.println("");
                        case 3:
                            System.out.println(ProjectTaken);
                            displayTakenDataProject();
                            break;
                    }
                }while(pilihan1 != 4);       
                break;
            case 4:
                System.exit(0);
                break;
        }
    }

        
    void displayDataClient(){
        System.out.println("List Client");
        for (int i = 0; i < arr2.size(); i++) {
            if (arr2.get(i) != null) {
                System.out.print(i+1+". ");
                System.out.println(arr2.get(i));
            }else{
                System.out.print("Tidak ada data Client");
            }
        }    
    }
    
    void displayDataFreelance(){
        System.out.println("List Freelance");
            for (int i = 0; i < arr3.size(); i++) {
                if (arr3.get(i) != null) {
                    System.out.print(i+1+". ");
                    System.out.println(arr3.get(i));
                }else{
                    System.out.print("Tidak ada data Freelance");
                }
            }
    }
    
    void displayDataProject(){
        System.out.println("List Project : ");
            for (int i = 0; i < projects.size(); i++) {
                if (projects.get(i) != null) {  
                    System.out.println("");
                    System.out.print("Proyek"+i+1);
                    System.out.println(i+1);
                    System.out.println(projects.get(i));
                }
            }
    }
    
    void displayTakenDataProject(){
        System.out.println("List Project yang diambil : ");
        System.out.println("");
        for (int i = 0; i < projects.size(); i++) {
            System.out.println("");
            if (projects.get(i) != null) {  
                System.out.println(ProjectTaken);
            }
        }
    }

    void credentialClient(String username, String password){
        if(arr2.size() != 0){
            for(int k=0;k<arr2.size();k++){
                if(username.equals(arr2.get(k).getUsername()) && password.equals(arr2.get(k).getPassword())){
                    System.out.println("Authentication Successful");
                    return ;
                }
            }
            if(username.equals(arr2.get(0).getUsername()) && password.equals(arr2.get(0).getPassword())){
                System.out.println("Authentication Successful");
            }else{
                System.out.println("Authentication Falied");
                menu();
           }
           
        }
    }
    
    void credentialFreelance(String username, String password){
        if(arr3.size() != 0){
            for(int k=0;k<arr3.size();k++){
                if(username.equals(arr3.get(k).getUsername()) && password.equals(arr3.get(k).getPassword())){
                    System.out.println("Authentication Successful");
                    return;
                }
            }
            if(username.equals(arr3.get(0).getUsername()) && password.equals(arr3.get(0).getPassword())){
                System.out.println("Authentication Successful");
            }else{
                System.out.println("Authentication Falied");
                menu();
           }
           
        }
    }
    
    void cls(){
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }
        
    public static void main(String[] args) {
        new AplikasiStartUp();
    }
}