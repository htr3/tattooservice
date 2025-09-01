//package com.tattooservice.services.exceptions;
//
//import com.userservice.services.internationalization.interfaces.IMessages;
//
//import java.util.Collections;
//import java.util.HashMap;
//import java.util.Map;
//
//public class SystemNotAvailableException extends AbstractApplicationException {
//
//  private final String message;
//
//  private final transient Map<String, Object> parameters;
//
//  public static final String MSG_ID = "1000003263";
//
//  private static final String SYSTEM_NAME = "SYSTEM_NAME";
//
//
//  public SystemNotAvailableException(final String systemName, final Throwable cause,
//                            final IMessages messages) {
//    super(cause);
//    this.parameters = initMap(systemName);
//    this.message = messages.getMessage(MSG_ID, systemName);
//  }
//
//
//  private Map<String, Object> initMap(final String systemName) {
//    final Map<String, Object> ret = new HashMap<>();
//    ret.put(SYSTEM_NAME, systemName );
//
//    return ret;
//  }
//
//
//
//  @Override
//  public String getMessage() {return message; }
//
//
//  @Override
//  public Map<String, Object> getParameters() {return Collections.unmodifiableMap(parameters); }
//
//  @Override
//  public String getErrorCode() {
//    return MSG_ID;
//  }
//}
