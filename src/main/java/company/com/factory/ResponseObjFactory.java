package company.com.factory;

import company.com.domain.ResponseObj;

public class ResponseObjFactory {
    public static ResponseObj buildGenericResponseObj(String responseCode, String responseDescription) {
        return new ResponseObj(responseCode, responseDescription);
    }
}
