//package com.tattooservice.services.exceptions;
//
//import com.userservice.services.internationalization.interfaces.IMessages;
//
//import java.util.Collections;
//import java.util.Map;
//
//public class UnknownException extends AbstractApplicationException {
//
//    private final String message;
//
//    private final transient Map<String, Object> parameters;
//
//    public static final String MSG_ID = "1000003263";
//
//
//
//    public UnknownException(final Throwable cause,
//                                       final IMessages messages) {
//        super(cause);
//        this.parameters = null;
//        this.message = messages.getMessage(MSG_ID);
//    }
//
//
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
