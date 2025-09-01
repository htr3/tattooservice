//package com.tattooservice.services.exceptions;
//
//import com.userservice.services.internationalization.interfaces.IMessages;
//
//import java.util.Map;
//
//public class AuthenticationException extends AbstractApplicationException {
//
//    private final String message;
//    private final transient Map<String, Object> parameters;
//
//    private static final String MSG_ID = "100000123";
//
//    public AuthenticationException(final Throwable cause, final IMessages messages) {
//        super(cause);
//        this.message = messages.getMessage(MSG_ID);
//        this.parameters = null;
//    }
//
//    @Override
//    public String getMessage() { return  message;}
//
//    @Override
//    public Map<String, Object> getParameters() {return parameters; }
//
//    @Override
//    public String getErrorCode() {return MSG_ID; }
//}
