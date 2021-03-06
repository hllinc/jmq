package com.ipd.jmq.common.stat;

import com.ipd.jmq.toolkit.stat.TPStat;
import com.ipd.jmq.toolkit.time.SystemClock;

import java.util.HashMap;
import java.util.Map;

/**
 * 客户端TP性能统计
 */
public class ClientTPStat {
    // ip
    private String ip;
    // 主题
    private String topic;
    // 应用
    private String app;
    // 开始时间
    private long startTime;
    // 结束时间
    private long endTime;
    // 生产性能
    private TPStat produce;
    // 接收性能
    private TPStat receive;
    // 消费性能
    private TPStat consume;
    // 发送重试性能
    private TPStat retry;

    // avg time of ping response
    // key   - BrokerGroup(String)
    // value - Double
    private Map<Object, Object> pingAvgResponseTime = new HashMap<Object, Object>();

    // cpu usage percent
    private double cpuUsage = 0.0;

    // memory usage percent
    private double memUsage = 0.0;

    // load in one minute
    private double oneMinLoad = 0.0;

    public ClientTPStat() {
    }

    public ClientTPStat(String topic, String app) {
        this.topic = topic;
        this.app = app;
        this.startTime = SystemClock.now();
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public TPStat getProduce() {
        return produce;
    }

    public void setProduce(TPStat produce) {
        this.produce = produce;
    }

    public TPStat getReceive() {
        return receive;
    }

    public void setReceive(TPStat receive) {
        this.receive = receive;
    }

    public TPStat getConsume() {
        return consume;
    }

    public void setConsume(TPStat consume) {
        this.consume = consume;
    }

    public TPStat getRetry() {
        return retry;
    }

    public void setRetry(TPStat retry) {
        this.retry = retry;
    }

    public Map<Object, Object> getPingAvgResponseTime() {
        return pingAvgResponseTime;
    }

    public void setPingAvgResponseTime(Map<Object, Object> pingAvgResponseTime) {
        this.pingAvgResponseTime = pingAvgResponseTime;
    }

    public double getCpuUsage() {
        return cpuUsage;
    }

    public void setCpuUsage(double cpuUsage) {
        this.cpuUsage = cpuUsage;
    }

    public double getMemUsage() {
        return memUsage;
    }

    public void setMemUsage(double memUsage) {
        this.memUsage = memUsage;
    }

    public double getOneMinLoad() {
        return oneMinLoad;
    }

    public void setOneMinLoad(double oneMinLoad) {
        this.oneMinLoad = oneMinLoad;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("{");
        sb.append("\"startTime\":").append(startTime);
        sb.append(", \"endTime\":").append(endTime);
        if (ip != null) {
            sb.append(", \"ip\":\"").append(ip).append('\"');
        }
        if (topic != null) {
            sb.append(", \"topic\":\"").append(topic).append('\"');
        }
        if (app != null) {
            sb.append(", \"app\":\"").append(app).append('\"');
        }
        if (produce != null) {
            sb.append(", \"produce\":").append(produce);
        }
        if (receive != null) {
            sb.append(", \"receive\":").append(receive);
        }
        if (consume != null) {
            sb.append(", \"consume\":").append(consume);
        }
        if (retry != null) {
            sb.append(", \"retry\":").append(retry);
        }
        sb.append(", \"cpuUsage\":").append(cpuUsage);
        sb.append(", \"memUsage\":").append(memUsage);
        sb.append(", \"oneMinLoad\":").append(oneMinLoad);
        sb.append(", \"pingAvgResponseTime\":").append(pingAvgResponseTime);
        sb.append('}');
        return sb.toString();
    }
}
