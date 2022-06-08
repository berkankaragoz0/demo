package com.example.demoproject1.response;

import java.sql.Timestamp;
import java.time.Instant;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;


public class GlobalFunctions {

    public static ResponseObj createSuccesResponseWithData(Object data){
        ResponseObj responseObj = new ResponseObj();
        responseObj.data = data;
        responseObj.code = ResponseCodeEnum.OK.getCode();//Response.Status.OK.getStatusCode();
        responseObj.message = ResponseCodeEnum.OK.getText();
        return responseObj;

    }

    public static ResponseObj createSuccesResponseWithString(String message){
        ResponseObj responseObj = new ResponseObj();
        responseObj.code = ResponseCodeEnum.OK.getCode();
        responseObj.message = message;
        return responseObj;
    }

    public static ResponseObj createFailResponse(String message){
        ResponseObj responseObj = new ResponseObj();
        responseObj.code = ResponseCodeEnum.INTERNAL_SERVER_ERROR.getCode();//Response.Status.INTERNAL_SERVER_ERROR.getStatusCode();
        responseObj.message = message;
        return responseObj;
    }

    public static ResponseObj createFailResponseWithData(Object data, String message){
        ResponseObj responseObj = new ResponseObj();
        responseObj.data = data;
        responseObj.code = ResponseCodeEnum.INTERNAL_SERVER_ERROR.getCode();
        responseObj.message = message;
        return responseObj;
    }

    public static Timestamp createMillisecondsForTimezone(){
        Instant timeStamp = Instant.now();
        ZonedDateTime zone = timeStamp.atZone(ZoneOffset.UTC);
        Timestamp stamp = Timestamp.valueOf(zone.toLocalDateTime());
        return stamp;
    }
}
