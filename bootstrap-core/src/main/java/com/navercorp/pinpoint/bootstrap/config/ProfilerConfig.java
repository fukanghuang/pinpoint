/*
 * Copyright 2014 NAVER Corp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.navercorp.pinpoint.bootstrap.config;

import com.navercorp.pinpoint.common.annotations.InterfaceAudience;
import com.navercorp.pinpoint.common.annotations.VisibleForTesting;

import java.util.List;
import java.util.Map;

/**
 * @author Woonduk Kang(emeroad)
 */
public interface ProfilerConfig {

    int getInterceptorRegistrySize();

    String getCollectorSpanServerIp();

    int getCollectorSpanServerPort();

    String getCollectorStatServerIp();

    int getCollectorStatServerPort();

    String getCollectorTcpServerIp();

    int getCollectorTcpServerPort();

    int getStatDataSenderWriteQueueSize();

    int getStatDataSenderSocketSendBufferSize();

    int getStatDataSenderSocketTimeout();

    String getStatDataSenderSocketType();

    String getStatDataSenderTransportType();

    int getSpanDataSenderWriteQueueSize();

    int getSpanDataSenderSocketSendBufferSize();

    boolean isTcpDataSenderCommandAcceptEnable();

    boolean isTcpDataSenderCommandActiveThreadEnable();

    boolean isTcpDataSenderCommandActiveThreadCountEnable();

    boolean isTcpDataSenderCommandActiveThreadDumpEnable();

    boolean isTcpDataSenderCommandActiveThreadLightDumpEnable();

    long getTcpDataSenderPinpointClientWriteTimeout();

    long getTcpDataSenderPinpointClientRequestTimeout();

    long getTcpDataSenderPinpointClientReconnectInterval();

    long getTcpDataSenderPinpointClientPingInterval();

    long getTcpDataSenderPinpointClientHandshakeInterval();

    boolean isTraceAgentActiveThread();

    boolean isTraceAgentDataSource();

    int getDataSourceTraceLimitSize();

    boolean isDeadlockMonitorEnable();

    long getDeadlockMonitorInterval();

    int getSpanDataSenderSocketTimeout();

    String getSpanDataSenderSocketType();

    String getSpanDataSenderTransportType();

    int getSpanDataSenderChunkSize();

    int getStatDataSenderChunkSize();

    boolean isProfileEnable();

    int getJdbcSqlCacheSize();

    boolean isTraceSqlBindValue();

    int getMaxSqlBindValueSize();

    boolean isSamplingEnable();

    int getSamplingRate();

    boolean isIoBufferingEnable();

    int getIoBufferingBufferSize();

    String getProfilerJvmVendorName();

    String getProfilerOSName();

    int getProfileJvmStatCollectIntervalMs();

    int getProfileJvmStatBatchSendCount();

    boolean isProfilerJvmStatCollectDetailedMetrics();

    long getAgentInfoSendRetryInterval();

    @InterfaceAudience.Private
    @VisibleForTesting
    boolean getStaticResourceCleanup();


    Filter<String> getProfilableClassFilter();

    List<String> getApplicationTypeDetectOrder();

    List<String> getPluginLoadOrder();

    List<String> getDisabledPlugins();

    String getApplicationServerType();

    int getCallStackMaxDepth();

    boolean isPropagateInterceptorException();

    String getProfileInstrumentEngine();

    boolean isSupportLambdaExpressions();

    boolean isInstrumentMatcherEnable();

    InstrumentMatcherCacheConfig getInstrumentMatcherCacheConfig();

    boolean isProxyHttpHeaderEnable();

    HttpStatusCodeErrors getHttpStatusCodeErrors();

    String getInjectionModuleFactoryClazzName();

    String getApplicationNamespace();

    String readString(String propertyName, String defaultValue);

    int readInt(String propertyName, int defaultValue);

    DumpType readDumpType(String propertyName, DumpType defaultDump);

    long readLong(String propertyName, long defaultValue);

    List<String> readList(String propertyName);

    boolean readBoolean(String propertyName, boolean defaultValue);

    Map<String, String> readPattern(String propertyNamePatternRegex);

}
