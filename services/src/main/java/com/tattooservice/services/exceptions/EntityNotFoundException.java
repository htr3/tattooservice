//package com.tattooservice.services.exceptions;
//
//import com.userservice.services.internationalization.interfaces.IMessages;
//
//import java.util.Collections;
//import java.util.HashMap;
//import java.util.Map;
//
//public class EntityNotFoundException extends AbstractApplicationException{
//
//    private final String message;
//
//    private final transient Map<String, Object> parameters;
//
//    public static final String MSG_ID = "1000003263";
//
//    private static final String ENTITY_NAME = "ENTITY_NAME";
//
//    public static final String ENTITY_KEY = "ENTITY_KEY";
//
//    public EntityNotFoundException(final String entityName, final String entityKey, final Throwable cause,
//                                         final IMessages messages) {
//        super(cause);
//        this.parameters = initMap(entityName, entityKey);
//        this.message = messages.getMessage(MSG_ID, entityName, entityKey);
//    }
//
//    public EntityNotFoundException(final String entityName, final String entityKey,
//                                         final IMessages messages) {
//        this(entityKey, entityName, null, messages);
//    }
//
//    private Map<String, Object> initMap(final String entityName, final String entityKey) {
//        final Map<String, Object> ret = new HashMap<>();
//        ret.put(EntityNotFoundException.ENTITY_KEY, entityKey);
//        ret.put(EntityNotFoundException.ENTITY_NAME, entityName);
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
//
//
//}
