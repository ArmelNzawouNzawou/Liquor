package company.com.domain.driverPay;

public class DriverPay {
    private String payCode;
    private int numberOfOrder;
    private int distance;
    private String driverNumber;
    private String time;


    private DriverPay() {
    }

    public String getPayCode() {
        return payCode;
    }

    public void setPayCode(String payCode) {
        this.payCode = payCode;
    }

    public int getNumberOfOrder() {
        return numberOfOrder;
    }

    public void setNumberOfOrder(int numberOfOrder) {
        this.numberOfOrder = numberOfOrder;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public String getDriver() {
        return driverNumber;
    }

    public void setDriver(String driverBumber) {
        this.driverNumber = driverBumber;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "DriverPay{" +
                "payCode='" + payCode + '\'' +
                ", numberOfOrder=" + numberOfOrder +
                ", distance=" + distance +
                ", driver='" + driverNumber + '\'' +
                ", time='" + time + '\'' +
                '}';
    }

    public static class Builder {
        private String payCode;
        private int numberOfOrder;
        private int distance;
        private String driverBumber;
        private String time;

        public Builder(String payCode) {
            this.payCode = payCode;
        }

        public Builder buildNumberOfOrder(int numberOfOrder) {
            this.numberOfOrder = numberOfOrder;
            return this;
        }

        public Builder buildDriverBumber(String driverBumber) {
            this.driverBumber = driverBumber;
            return this;
        }

        public Builder buildDistance(int distance) {
            this.distance = distance;
            return this;
        }

        public Builder buildTime(String time) {
            this.time = time;
            return this;
        }



        public DriverPay build() {
            DriverPay driverPay = new DriverPay();
            driverPay.distance = this.distance;
            driverPay.numberOfOrder = this.numberOfOrder;
            driverPay.payCode = this.payCode;
            driverPay.driverNumber = this.driverBumber;
            driverPay.time = this.time;
            return driverPay;
        }
    }
}
