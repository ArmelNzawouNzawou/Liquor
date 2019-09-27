package company.com.domain.item.impl.classic.impl;

public class Ice {
    private String itemNumber;
    private String name;
    private String descrition;

    private Ice() {
    }

    public String getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(String itemNumber) {
        this.itemNumber = itemNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescrition() {
        return descrition;
    }

    public void setDescrition(String descrition) {
        this.descrition = descrition;
    }

    @Override
    public String toString() {
        return "Ice{" +
                "itemNumber='" + itemNumber + '\'' +
                ", name='" + name + '\'' +
                ", descrition='" + descrition + '\'' +
                '}';
    }
    public static class Builder{
        private String itemNumber;
        private String name;
        private String descrition;
        public Builder(String itemNumber){
            this.itemNumber=itemNumber;

        }
        public Builder buildName(String name){
            this.name=name;
            return this;
        }
        public Builder buildDescription(String descrition){
            this.descrition=descrition;
            return this;
        }
        public Ice build(){
            Ice ice=new Ice();
            ice.descrition=this.descrition;
            ice.itemNumber=this.itemNumber;
            ice.name=this.name;
            return ice;
        }
    }
}
