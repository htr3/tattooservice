//package com.tattooservice.services.exceptions;
//
//
//import java.util.Collections;
//import java.util.HashMap;
//import java.util.Map;
//
//public class OptimisticException extends AbstractApplicationException {
//
//    private final String message;
//
//    private final transient Map<String, Object> parameters;
//
//    public static final String MSG_ID = "1000003263";
//
//
////    public OptimisticException(final String entityKey, final Throwable cause,
////                              final IMessages messages) {
////        super(cause);
////        this.parameters = initMap(entityKey);
////        this.message = messages.getMessage(MSG_ID, entityKey);
////    }
//
//
//    private Map<String, Object> initMap(final String entityKey) {
//        final Map<String, Object> ret = new HashMap<>();
//        ret.put(EntityNotFoundException.ENTITY_KEY, entityKey );
//
//        return ret;
//    }
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
