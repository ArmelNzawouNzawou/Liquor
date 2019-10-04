package company.com.domain.driverPay;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class D_pay {
    @Id
    private String payCode;
    private int rate;
    private double salary;
    private String payType;
    private String driverBumber;
    private String payDate;


    public D_pay() {
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getDriverBumber() {
        return driverBumber;
    }

    public void setDriverBumber(String driverBumber) {
        this.driverBumber = driverBumber;
    }

    public String getPayDate() {
        return payDate;
    }

    public void setPayDate(String payDate) {
        this.payDate = payDate;
    }

    public String getPayCode() {
        return payCode;
    }

    public void setPayCode(String payCode) {
        this.payCode = payCode;
    }
    public static class Builder {
        private int rate;
        private double salary;
        private String payType;
        private String driverBumber;
        private String payDate;
        private String payCode;

        public Builder(String payCode) {
            this.payCode = payCode;
        }

        public Builder buildRate(int rate) {
            this.rate = rate;
            return this;
        }

        public Builder buildDriverBumber(String driverBumber) {
            this.driverBumber = driverBumber;
            return this;
        }

        public Builder buildSalary(double salary) {
            this.salary = salary;
            return this;
        }

        public Builder buildPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public Builder buildTime(String payDate) {
            this.payDate = payDate;
            return this;
        }
        public D_pay build() {
            D_pay driverPay = new D_pay();
            driverPay.salary = this.salary;
            driverPay.rate = this.rate;
            driverPay.payCode = this.payCode;
            driverPay.driverBumber = this.driverBumber;
            driverPay.payType = this.payType;
            driverPay.payDate = this.payDate;
            return driverPay;
        }
    }
}
