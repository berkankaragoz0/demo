package com.example.demoproject1.response;

public enum ResponseCodeEnum {
    FAIL(99, "Failed"),
    Continue(100, "Continue"),
    OK(200, "OK"),
    INTERNAL_SERVER_ERROR(500, "Internal Server Error"),
    Created(201, "Created"),
    No_Content(204, "No ContentConsts"),
    Bad_Request(400, "Bad Request"),
    Not_Found(404, "Not Found");


    private final Integer code;
    private final String text;


    ResponseCodeEnum(Integer code, String text) {
        this.code = code;
        this.text = text;
    }

    public Integer getCode() {
        return code;
    }

    public String getText() {
        return text;
    }

    /*
    HTTP response status codes

OK(200, "OK"),
   CREATED(201, "Created"),
   ACCEPTED(202, "Accepted"),
   NO_CONTENT(204, "No Content"),
   MOVED_PERMANENTLY(301, "Moved Permanently"),
   SEE_OTHER(303, "See Other"),
   NOT_MODIFIED(304, "Not Modified"),
   TEMPORARY_REDIRECT(307, "Temporary Redirect"),
   BAD_REQUEST(400, "Bad Request"),
   UNAUTHORIZED(401, "Unauthorized"),
   FORBIDDEN(403, "Forbidden"),
   NOT_FOUND(404, "Not Found"),
   NOT_ACCEPTABLE(406, "Not Acceptable"),
   CONFLICT(409, "Conflict"),
   GONE(410, "Gone"),
   PRECONDITION_FAILED(412, "Precondition Failed"),
   UNSUPPORTED_MEDIA_TYPE(415, "Unsupported Media Type"),
   INTERNAL_SERVER_ERROR(500, "Internal Server Error"),
   SERVICE_UNAVAILABLE(503, "Service Unavailable");




100 Continue
101 Switching Protocols
200 OK
201 Created
202 Accepted
203 Non-Authoritative Information
204 No ContentConsts
205 Reset ContentConsts
206 Partial ContentConsts
300 Multiple Choices
301 Moved Permanently
302 Found
303 See Other
304 Not Modified
307 Temporary Redirect
308 Permanent Redirect
400 Bad Request
401 Unauthorized
403 Forbidden
404 Not Found
405 Method Not Allowed
406 Not Acceptable
407 Proxy Authentication Required
408 Request Timeout
409 Conflict
410 Gone
411 Length Required
412 Precondition Failed
413 Payload Too Large
414 URI Too Long
415 Unsupported Media Type
416 Range Not Satisfiable
417 Expectation Failed
426 Upgrade Required
428 Precondition Required
429 Too Many Requests
431 Request Header Fields Too Large
451 Unavailable For Legal Reasons
500 Internal Server Error
501 Not Implemented
502 Bad Gateway
503 Service Unavailable
504 Gateway Timeout
505 HTTP Version Not Supported
511 Network Authentication Required
    */
}
