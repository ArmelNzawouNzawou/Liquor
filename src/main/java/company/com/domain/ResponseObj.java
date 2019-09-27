package company.com.domain;

public class ResponseObj {
    private String responseCode;
    private String responseDescription;
    private Object response;

    public ResponseObj(String responseCode, String responseDescription) {
        this.responseCode = responseCode;
        this.responseDescription = responseDescription;
    }

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseDescription() {
        return responseDescription;
    }

    public void setResponseDescription(String responseDescription) {
        this.responseDescription = responseDescription;
    }

    public Object getResponse() {
        return response;
    }

    public void setResponse(Object response) {
        this.response = response;
    }

    @Override
    public String toString() {
        return "ResponseObj{" +
                "responseCode='" + responseCode + '\'' +
                ", responseDescription='" + responseDescription + '\'' +
                ", response=" + response +
                '}';
    }
}


