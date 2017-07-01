package com.example.abhi.web.network;


import com.example.abhi.web.utils.CommonUtilities;

public interface OnWebServiceResult {
    public void getWebResponse(String result, CommonUtilities.SERVICE_TYPE type);
}
