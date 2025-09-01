//package com.tattooservice.services.exceptions;
//
//import com.userservice.services.internationalization.interfaces.IMessages;
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class EntityKeyAlreadyExistsException extends AbstractApplicationException {
//
//    private final String message;
//
//    private final transient Map<String, Object> parameters;
//
//    private static final String USER_MSG = "USER_MSG";
//
//    private static final String MSG_ID = "10000002345";
//
//    public EntityKeyAlreadyExistsException(final String entityKey, final String userMsg,  final Throwable cause,
//                                         final IMessages messages) {
//        super(cause);
//        this.parameters = initMap(entityKey, null);
//        this.message = messages.getMessage(MSG_ID, entityKey, userMsg);
//    }
//
//    public EntityKeyAlreadyExistsException(final String entityKey, final String userMsg,
//                                           final IMessages messages) {
//        this(entityKey,userMsg,  null, messages);
//    }
//
//    private Map<String, Object> initMap( final String entityKey, final String userMsg) {
//        final Map<String, Object> ret = new HashMap<>();
//        ret.put(EntityNotFoundException.ENTITY_KEY, entityKey);
//        ret.put(USER_MSG, userMsg);
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
//    public Map<String, Object> getParameters() {return (parameters); }
//
//    @Override
//    public String getErrorCode() {
//        return MSG_ID;
//    }
//}
