//package com.tattooservice.services.exceptions;
//
//import com.userservice.services.internationalization.interfaces.IMessages;
//
//import java.util.Collections;
//import java.util.HashMap;
//import java.util.Map;
//
//public class ConflictException extends AbstractApplicationException {
//
//
//
//    private final String message;
//
//    private final transient Map<String, Object> parameters;
//
//    public static final String ERR_MSG = "ERR_MSG";
//
//    private static final String MSG_ID = "100000326";
//
//
//    public ConflictException(final String errMsg, final Throwable cause, final IMessages messages) {
//
//        super(cause);
//
//        this.parameters = initMap(errMsg);
//        this.message = messages.getMessage(MSG_ID, errMsg);
//    }
//
//    private Map<String, Object> initMap(final String errMsg) {
//        final Map<String, Object> ret = new HashMap<>();
//        ret.put(ERR_MSG, errMsg);
//        return ret;
//    }
//
//
//    @Override
//    public String getMessage() {return message; }
//
//
//    @Override
//    public Map<String, Object> getParameters() {return Collections.unmodifiableMap(parameters); }
//
//    @Override
//    public String getErrorCode() {
//        return MSG_ID;
//    }
//}
