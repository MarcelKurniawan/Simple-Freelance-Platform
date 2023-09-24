    public class Project extends Client{
        private String namaProject;
        private String deskripsiProject;
        private String deadlinProject;
        private String metodePembayaran;
        private String feeProject;

    public Project(){
        super();
    }

    public String getNamaProject() {
        return namaProject;
    }

    public void setNamaProject(String namaProject) {
        this.namaProject = namaProject;
    }

    public String getDeskripsiProject() {
        return deskripsiProject;
    }

    public void setDeskripsiProject(String deskripsiProject) {
        this.deskripsiProject = deskripsiProject;
    }

    public String getDeadlinProject() {
        return deadlinProject;
    }

    public void setDeadlinProject(String deadlinProject) {
        this.deadlinProject = deadlinProject;
    }

    public String getMetodePembayaran() {
        return metodePembayaran;
    }

    public void setMetodePembayaran(String metodePembayaran) {
        this.metodePembayaran = metodePembayaran;
    }

    public String getFeeProject() {
        return feeProject;
    }

    public void setFeeProject(String feeProject) {
        this.feeProject = feeProject;
    }

    @Override
    public String toString() {
        return "Nama Proyek : " + namaProject + "\n" + "Deskripsi Proyek : " + deskripsiProject + "\n"+ "Deadline Proyek : " + deadlinProject + "\n" + 
                "Metode Pembayaran : " + metodePembayaran +  "\n" +"Fee Proyek : " + feeProject ;
    }  
}
