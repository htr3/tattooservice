//package com.tattooservice.services.exceptions;
//
//import com.userservice.services.internationalization.interfaces.IMessages;
//import org.springframework.http.HttpStatus;
//
//import java.util.Collections;
//import java.util.HashMap;
//import java.util.Map;
//
//public class BadRequestException extends AbstractApplicationException {
//
//  private static final String HEADER_FEILD_NAME = "HEADER_FEILD_NAME";
//  private static final String BAD_REQUEST_MSG = "1000000431";
//
//  public static final String SERVICE_NAME = "SERVICE_NAME";
//
//  public static final String GATEWAY_CODE = "GATEWAY_CODE";
//  public static final String GATEWAY_STATUS = "GATEWAY_STATUS";
//  public static final String GATEWAY_ERR_MSG = "GATEWAY_ERR_MSG";
//  public static final String ERROR_CODE = "ERROR_CODE";
//
//  private final String message;
//
//  private final transient Map<String, Object> parameters;
//
//  public BadRequestException(final String bussinessErrorCode, final Throwable cause, final IMessages messages, final String... headerFieldName) {
//        super(cause);
//
//        this.parameters = initMap(bussinessErrorCode, messages, headerFieldName);
//        this.message = messages.getMessage(bussinessErrorCode == null ? BAD_REQUEST_MSG : bussinessErrorCode, headerFieldName);
//    }
//
//  public BadRequestException(final String serviceName, final String gatewayCode, final String gatewayErrMsg, final HttpStatus gatewayStatus, final Throwable cause) {
//    super(cause);
//
//    this.parameters = initMap(serviceName, gatewayCode, gatewayErrMsg, gatewayStatus);
//    this.message = gatewayErrMsg;
//  }
//
//  public BadRequestException(final String businessErrorCode, final IMessages messages, final String... headerFieldName ) {
//    this(businessErrorCode, null, messages, headerFieldName);
//  }
//
//  private Map<String, Object> initMap(final String serviceName, final String gatewayCode, final String gatewayErrMsg,
//                                      final HttpStatus gatewayStatus) {
//    final Map<String, Object> ret = new HashMap<>();
//    ret.put(SERVICE_NAME, serviceName);
//    ret.put(GATEWAY_CODE,gatewayCode);
//    ret.put(GATEWAY_ERR_MSG, gatewayErrMsg);
//    ret.put(GATEWAY_STATUS, gatewayStatus);
//    return ret;
//  }
//
//
//  private Map<String, Object> initMap(final String businessErrorCode, final IMessages messages,  final String... headerFieldName
//                                      ) {
//    final Map<String, Object> ret = new HashMap<>(1);
//    ret.put(HEADER_FEILD_NAME, headerFieldName);
//    ret.put(ERROR_CODE, businessErrorCode == null ? BAD_REQUEST_MSG : businessErrorCode);
//    return ret;
//  }
//
//  @Override
//  public String getMessage() {return message; }
//
//  @Override
//  public Map<String, Object> getParameters() {return Collections.unmodifiableMap(parameters); }
//
//  @Override
//  public String getErrorCode() {return (String) parameters.get(ERROR_CODE);}
//
//
//}
