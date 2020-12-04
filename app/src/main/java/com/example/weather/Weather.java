package com.example.weather;

import java.util.List;

/**
 * 请求天气查询API返回结果
 *
 */
public class Weather {
    //值为0或1：1：成功；0：失败
    private String status;//返回状态
    private String count;//返回结果总数目
    private String info;//返回的状态信息
    private String infocode;//返回状态说明,10000代表正确
    private List<Forecasts> forecasts;//预报天气信息数据
    private List<Lives> lives;//实时天气信息数据

    public List<Lives> getLives() {
        return lives;
    }

    public void setLives(List<Lives> lives) {
        this.lives = lives;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getInfocode() {
        return infocode;
    }

    public void setInfocode(String infocode) {
        this.infocode = infocode;
    }

    public List<Forecasts> getForecasts() {
        return forecasts;
    }

    public void setForecasts(List<Forecasts> forecasts) {
        this.forecasts = forecasts;
    }
}
