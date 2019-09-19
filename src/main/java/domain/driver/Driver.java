package domain.driver;

public class Driver {
    private  String id;
    private String stat;


    private Driver() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStat() {
        return stat;
    }

    public void setStat(String stat) {
        this.stat = stat;
    }


    public static class Builder{
        private  String id;
        private String stat;

        public Builder(String id){
            this.id=id;
        }

        public Builder buildStat(String stat){
            this.stat=stat;
            return this;
        }
        public Driver build(){
            Driver driver=new Driver();
            driver.id=this.id;
            driver.stat=this.stat;
            return driver;
        }
    }
}
