//package com.tattooservice.services.exceptions;
//
//import com.userservice.services.internationalization.interfaces.IMessages;
//import org.springframework.http.HttpStatus;
//
//import java.util.Collections;
//import java.util.HashMap;
//import java.util.Map;
//
//public class BadGatewayException extends AbstractApplicationException {
//
//    private final String message;
//
//    private final transient Map<String, Object> parameters;
//    private final transient Map<String, Object> externalParameters;
//
//    public static final String SERVICE_NAME = "SERVICE_NAME";
//
//    public static final String GATEWAY_CODE  = "GATEWAY_CODE";
//    public static final String GATEWAY_ERROR = "GATEWAY_ERROR";
//    public static final String GATEWAY_STATUS = "GATEWAY_STATUS";
//    public static final String EXTERNAL_RESPONSE_HTTP_STATUS = "HTTP_STATUS";
//
//    private static final String MSG_ID = "100000321";
//
//
//
//    public BadGatewayException(final String serviceName, final String gatewayCode, final String gatewyaErrMsg,
//                               final HttpStatus gatewayStatus, final Throwable cause, final IMessages message) {
//
//        super(cause);
//
//        this.parameters = initMap(serviceName, gatewayCode, gatewyaErrMsg, gatewayStatus);
//        this.message = message.getMessage(MSG_ID, serviceName, gatewyaErrMsg);
//        this.externalParameters = null;
//    }
//
//    public BadGatewayException(final String serviceName, final String gatewayCode, final String gatewyaErrMsg,
//                               final HttpStatus gatewayStatus, final Throwable cause) {
//
//        super(cause);
//
//        this.parameters = initMap(null, serviceName, gatewayCode, gatewyaErrMsg, gatewayStatus);
//        this.message = gatewyaErrMsg;
//        this.externalParameters = null;
//    }
//
//    public BadGatewayException(final Map<String, Object> responseMap, final String ResponseBodyParams, final String serviceName, final String gatewayCode, final String gatewyaErrMsg,
//                               final HttpStatus gatewayStatus, final Throwable cause) {
//
//        super(cause);
//
//        this.parameters = initMap(ResponseBodyParams, serviceName, gatewayCode, gatewyaErrMsg, gatewayStatus);
//        this.message = gatewyaErrMsg;
//        this.externalParameters = responseMap;
//    }
//
//    private Map<String, Object> initMap(final String serviceName, final String gatewayCode, final String gatewayErrMsg,
//                                        final HttpStatus gatewayStatus) {
//        final Map<String, Object> ret = new HashMap<>();
//        ret.put(SERVICE_NAME, serviceName);
//        ret.put(GATEWAY_CODE,gatewayCode);
//        ret.put(GATEWAY_ERROR, gatewayErrMsg);
//        ret.put(GATEWAY_STATUS, gatewayStatus);
//        return ret;
//    }
//
//    private Map<String, Object> initMap(final String ResponseBodyParams, final String serviceName, final String gatewayCode, final String gatewayErrMsg,
//                                        final HttpStatus gatewayStatus) {
//        final Map<String, Object> ret = new HashMap<>();
//        ret.put(SERVICE_NAME, serviceName);
//        ret.put(GATEWAY_CODE,gatewayCode);
//        ret.put(GATEWAY_ERROR, gatewayErrMsg);
//        ret.put(GATEWAY_STATUS, gatewayStatus);
//        ret.put(EXTERNAL_RESPONSE_HTTP_STATUS, ResponseBodyParams);
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
//    public Map<String, Object> getExternalParameters() {return Collections.unmodifiableMap(externalParameters); }
//
//    @Override
//    public String getErrorCode() {
//        String errorCode = (String) parameters.get(GATEWAY_CODE);
//        return errorCode != null ? errorCode : MSG_ID;
//    }
//
//
//}
