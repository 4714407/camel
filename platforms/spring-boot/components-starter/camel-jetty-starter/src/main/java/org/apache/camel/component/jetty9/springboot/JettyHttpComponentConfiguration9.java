/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.jetty9.springboot;

import javax.annotation.Generated;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * The jetty component provides HTTP-based endpoints for consuming and producing
 * HTTP requests.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.jetty")
public class JettyHttpComponentConfiguration9
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the jetty component. This is
     * enabled by default.
     */
    private Boolean enabled;
    /**
     * The key password, which is used to access the certificate's key entry in
     * the keystore (this is the same password that is supplied to the keystore
     * command's -keypass option).
     */
    private String sslKeyPassword;
    /**
     * The ssl password, which is required to access the keystore file (this is
     * the same password that is supplied to the keystore command's -storepass
     * option).
     */
    private String sslPassword;
    /**
     * Specifies the location of the Java keystore file, which contains the
     * Jetty server's own X.509 certificate in a key entry.
     */
    private String keystore;
    /**
     * This option is used to set the ErrorHandler that Jetty server uses. The
     * option is a org.eclipse.jetty.server.handler.ErrorHandler type.
     */
    private String errorHandler;
    /**
     * A map which contains per port number specific SSL connectors. The option
     * is a java.util.Map<java.lang.Integer,org.eclipse.jetty.server.Connector>
     * type.
     */
    private String sslSocketConnectors;
    /**
     * A map which contains per port number specific HTTP connectors. Uses the
     * same principle as sslSocketConnectors. The option is a
     * java.util.Map<java.lang.Integer,org.eclipse.jetty.server.Connector> type.
     */
    private String socketConnectors;
    /**
     * To set a value for minimum number of threads in HttpClient thread pool.
     * Notice that both a min and max size must be configured.
     */
    private Integer httpClientMinThreads;
    /**
     * To set a value for maximum number of threads in HttpClient thread pool.
     * Notice that both a min and max size must be configured.
     */
    private Integer httpClientMaxThreads;
    /**
     * To set a value for minimum number of threads in server thread pool.
     * Notice that both a min and max size must be configured.
     */
    private Integer minThreads;
    /**
     * To set a value for maximum number of threads in server thread pool.
     * Notice that both a min and max size must be configured.
     */
    private Integer maxThreads;
    /**
     * To use a custom thread pool for the server. This option should only be
     * used in special circumstances. The option is a
     * org.eclipse.jetty.util.thread.ThreadPool type.
     */
    private String threadPool;
    /**
     * If this option is true, Jetty JMX support will be enabled for this
     * endpoint.
     */
    private Boolean enableJmx = false;
    /**
     * To use a custom org.apache.camel.component.jetty.JettyHttpBinding, which
     * are used to customize how a response should be written for the producer.
     * The option is a org.apache.camel.component.jetty.JettyHttpBinding type.
     */
    private String jettyHttpBinding;
    /**
     * Not to be used - use JettyHttpBinding instead. The option is a
     * org.apache.camel.http.common.HttpBinding type.
     */
    private String httpBinding;
    /**
     * Jetty component does not use HttpConfiguration. The option is a
     * org.apache.camel.http.common.HttpConfiguration type.
     */
    private String httpConfiguration;
    /**
     * To use a existing configured org.eclipse.jetty.jmx.MBeanContainer if JMX
     * is enabled that Jetty uses for registering mbeans. The option is a
     * org.eclipse.jetty.jmx.MBeanContainer type.
     */
    private String mbContainer;
    /**
     * A map which contains general SSL connector properties. The option is a
     * java.util.Map<java.lang.String,java.lang.Object> type.
     */
    private String sslSocketConnectorProperties;
    /**
     * A map which contains general HTTP connector properties. Uses the same
     * principle as sslSocketConnectorProperties. The option is a
     * java.util.Map<java.lang.String,java.lang.Object> type.
     */
    private String socketConnectorProperties;
    /**
     * Allows to set a timeout in millis when using Jetty as consumer (server).
     * By default Jetty uses 30000. You can use a value of = 0 to never expire.
     * If a timeout occurs then the request will be expired and Jetty will
     * return back a http error 503 to the client. This option is only in use
     * when using Jetty with the Asynchronous Routing Engine.
     */
    private Long continuationTimeout = 30000L;
    /**
     * Whether or not to use Jetty continuations for the Jetty Server.
     */
    private Boolean useContinuation = true;
    /**
     * To configure security using SSLContextParameters. The option is a
     * org.apache.camel.support.jsse.SSLContextParameters type.
     */
    private String sslContextParameters;
    /**
     * Enable usage of global SSL context parameters
     */
    private Boolean useGlobalSslContextParameters = false;
    /**
     * Allows to configure a custom value of the response buffer size on the
     * Jetty connectors.
     */
    private Integer responseBufferSize;
    /**
     * Allows to configure a custom value of the request buffer size on the
     * Jetty connectors.
     */
    private Integer requestBufferSize;
    /**
     * Allows to configure a custom value of the request header size on the
     * Jetty connectors.
     */
    private Integer requestHeaderSize;
    /**
     * Allows to configure a custom value of the response header size on the
     * Jetty connectors.
     */
    private Integer responseHeaderSize;
    /**
     * To use a http proxy to configure the hostname.
     */
    private String proxyHost;
    /**
     * To use a http proxy to configure the port number.
     */
    private Integer proxyPort;
    /**
     * To use the X-Forwarded-For header in HttpServletRequest.getRemoteAddr.
     */
    private Boolean useXForwardedForHeader = false;
    /**
     * If the option is true, jetty will send the server header with the jetty
     * version information to the client which sends the request. NOTE please
     * make sure there is no any other camel-jetty endpoint is share the same
     * port, otherwise this option may not work as expected.
     */
    private Boolean sendServerVersion = true;
    /**
     * Whether to allow java serialization when a request uses
     * context-type=application/x-java-serialized-object. This is by default
     * turned off. If you enable this then be aware that Java will deserialize
     * the incoming data from the request to Java and that can be a potential
     * security risk.
     */
    private Boolean allowJavaSerializedObject = false;
    /**
     * To use a custom org.apache.camel.spi.HeaderFilterStrategy to filter
     * header to and from Camel message. The option is a
     * org.apache.camel.spi.HeaderFilterStrategy type.
     */
    private String headerFilterStrategy;
    /**
     * Whether the component should resolve property placeholders on itself when
     * starting. Only properties which are of String type can use property
     * placeholders.
     */
    private Boolean resolvePropertyPlaceholders = true;
    /**
     * Whether the component should use basic property binding (Camel 2.x) or
     * the newer property binding with additional capabilities
     */
    private Boolean basicPropertyBinding = false;

    public String getSslKeyPassword() {
        return sslKeyPassword;
    }

    public void setSslKeyPassword(String sslKeyPassword) {
        this.sslKeyPassword = sslKeyPassword;
    }

    public String getSslPassword() {
        return sslPassword;
    }

    public void setSslPassword(String sslPassword) {
        this.sslPassword = sslPassword;
    }

    public String getKeystore() {
        return keystore;
    }

    public void setKeystore(String keystore) {
        this.keystore = keystore;
    }

    public String getErrorHandler() {
        return errorHandler;
    }

    public void setErrorHandler(String errorHandler) {
        this.errorHandler = errorHandler;
    }

    public String getSslSocketConnectors() {
        return sslSocketConnectors;
    }

    public void setSslSocketConnectors(String sslSocketConnectors) {
        this.sslSocketConnectors = sslSocketConnectors;
    }

    public String getSocketConnectors() {
        return socketConnectors;
    }

    public void setSocketConnectors(String socketConnectors) {
        this.socketConnectors = socketConnectors;
    }

    public Integer getHttpClientMinThreads() {
        return httpClientMinThreads;
    }

    public void setHttpClientMinThreads(Integer httpClientMinThreads) {
        this.httpClientMinThreads = httpClientMinThreads;
    }

    public Integer getHttpClientMaxThreads() {
        return httpClientMaxThreads;
    }

    public void setHttpClientMaxThreads(Integer httpClientMaxThreads) {
        this.httpClientMaxThreads = httpClientMaxThreads;
    }

    public Integer getMinThreads() {
        return minThreads;
    }

    public void setMinThreads(Integer minThreads) {
        this.minThreads = minThreads;
    }

    public Integer getMaxThreads() {
        return maxThreads;
    }

    public void setMaxThreads(Integer maxThreads) {
        this.maxThreads = maxThreads;
    }

    public String getThreadPool() {
        return threadPool;
    }

    public void setThreadPool(String threadPool) {
        this.threadPool = threadPool;
    }

    public Boolean getEnableJmx() {
        return enableJmx;
    }

    public void setEnableJmx(Boolean enableJmx) {
        this.enableJmx = enableJmx;
    }

    public String getJettyHttpBinding() {
        return jettyHttpBinding;
    }

    public void setJettyHttpBinding(String jettyHttpBinding) {
        this.jettyHttpBinding = jettyHttpBinding;
    }

    public String getHttpBinding() {
        return httpBinding;
    }

    public void setHttpBinding(String httpBinding) {
        this.httpBinding = httpBinding;
    }

    public String getHttpConfiguration() {
        return httpConfiguration;
    }

    public void setHttpConfiguration(String httpConfiguration) {
        this.httpConfiguration = httpConfiguration;
    }

    public String getMbContainer() {
        return mbContainer;
    }

    public void setMbContainer(String mbContainer) {
        this.mbContainer = mbContainer;
    }

    public String getSslSocketConnectorProperties() {
        return sslSocketConnectorProperties;
    }

    public void setSslSocketConnectorProperties(
            String sslSocketConnectorProperties) {
        this.sslSocketConnectorProperties = sslSocketConnectorProperties;
    }

    public String getSocketConnectorProperties() {
        return socketConnectorProperties;
    }

    public void setSocketConnectorProperties(String socketConnectorProperties) {
        this.socketConnectorProperties = socketConnectorProperties;
    }

    public Long getContinuationTimeout() {
        return continuationTimeout;
    }

    public void setContinuationTimeout(Long continuationTimeout) {
        this.continuationTimeout = continuationTimeout;
    }

    public Boolean getUseContinuation() {
        return useContinuation;
    }

    public void setUseContinuation(Boolean useContinuation) {
        this.useContinuation = useContinuation;
    }

    public String getSslContextParameters() {
        return sslContextParameters;
    }

    public void setSslContextParameters(String sslContextParameters) {
        this.sslContextParameters = sslContextParameters;
    }

    public Boolean getUseGlobalSslContextParameters() {
        return useGlobalSslContextParameters;
    }

    public void setUseGlobalSslContextParameters(
            Boolean useGlobalSslContextParameters) {
        this.useGlobalSslContextParameters = useGlobalSslContextParameters;
    }

    public Integer getResponseBufferSize() {
        return responseBufferSize;
    }

    public void setResponseBufferSize(Integer responseBufferSize) {
        this.responseBufferSize = responseBufferSize;
    }

    public Integer getRequestBufferSize() {
        return requestBufferSize;
    }

    public void setRequestBufferSize(Integer requestBufferSize) {
        this.requestBufferSize = requestBufferSize;
    }

    public Integer getRequestHeaderSize() {
        return requestHeaderSize;
    }

    public void setRequestHeaderSize(Integer requestHeaderSize) {
        this.requestHeaderSize = requestHeaderSize;
    }

    public Integer getResponseHeaderSize() {
        return responseHeaderSize;
    }

    public void setResponseHeaderSize(Integer responseHeaderSize) {
        this.responseHeaderSize = responseHeaderSize;
    }

    public String getProxyHost() {
        return proxyHost;
    }

    public void setProxyHost(String proxyHost) {
        this.proxyHost = proxyHost;
    }

    public Integer getProxyPort() {
        return proxyPort;
    }

    public void setProxyPort(Integer proxyPort) {
        this.proxyPort = proxyPort;
    }

    public Boolean getUseXForwardedForHeader() {
        return useXForwardedForHeader;
    }

    public void setUseXForwardedForHeader(Boolean useXForwardedForHeader) {
        this.useXForwardedForHeader = useXForwardedForHeader;
    }

    public Boolean getSendServerVersion() {
        return sendServerVersion;
    }

    public void setSendServerVersion(Boolean sendServerVersion) {
        this.sendServerVersion = sendServerVersion;
    }

    public Boolean getAllowJavaSerializedObject() {
        return allowJavaSerializedObject;
    }

    public void setAllowJavaSerializedObject(Boolean allowJavaSerializedObject) {
        this.allowJavaSerializedObject = allowJavaSerializedObject;
    }

    public String getHeaderFilterStrategy() {
        return headerFilterStrategy;
    }

    public void setHeaderFilterStrategy(String headerFilterStrategy) {
        this.headerFilterStrategy = headerFilterStrategy;
    }

    public Boolean getResolvePropertyPlaceholders() {
        return resolvePropertyPlaceholders;
    }

    public void setResolvePropertyPlaceholders(
            Boolean resolvePropertyPlaceholders) {
        this.resolvePropertyPlaceholders = resolvePropertyPlaceholders;
    }

    public Boolean getBasicPropertyBinding() {
        return basicPropertyBinding;
    }

    public void setBasicPropertyBinding(Boolean basicPropertyBinding) {
        this.basicPropertyBinding = basicPropertyBinding;
    }
}