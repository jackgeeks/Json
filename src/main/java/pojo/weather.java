package pojo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author: jackgeeks
 * @ProjectName: json
 * @Package: PACKAGE_NAME
 * @ClassName: pojo.weather
 * @Description: @todo
 * @CreateDate: 2020/7/25 1:18
 * @Version: 1.0
 */
@NoArgsConstructor
@Data
public class weather implements Serializable {

    /**
     * date : 24
     * high : 高温 29℃
     * low : 低温 25℃
     * ymd : 2020-07-24
     * week : 星期五
     * sunrise : 05:06
     * sunset : 18:55
     * aqi : 38
     * fx : 西北风
     * fl : 3级
     * type : 阴
     * notice : 不要被阴云遮挡住好心情
     */

    private String date;
    private String high;
    private String low;
    private String ymd;
    private String week;
    private String sunrise;
    private String sunset;
    private int aqi;
    private String fx;
    private String fl;
    private String type;
    private String notice;

    @Override
    public String toString() {
        return "weather{" +
                "date='" + date + '\'' +
                ", high='" + high + '\'' +
                ", low='" + low + '\'' +
                ", ymd='" + ymd + '\'' +
                ", week='" + week + '\'' +
                ", sunrise='" + sunrise + '\'' +
                ", sunset='" + sunset + '\'' +
                ", aqi=" + aqi +
                ", fx='" + fx + '\'' +
                ", fl='" + fl + '\'' +
                ", type='" + type + '\'' +
                ", notice='" + notice + '\'' +
                '}';
    }
}
