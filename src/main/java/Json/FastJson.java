package Json;

import api.ApiService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import pojo.weather;

import java.io.IOException;
import java.util.List;

/**
 * @Author: jackgeeks
 * @ProjectName: json
 * @Package: Json
 * @ClassName: FastJson
 * @Description: @todo
 * @CreateDate: 2020/7/25 14:44
 * @Version: 1.0
 */
public class FastJson {
    public static void main(String[] args) throws IOException, InterruptedException {
        String json = ApiService.getApi();
        JSONObject jsonObject = JSONObject.parseObject(json);
        Object data = jsonObject.get("data");
        String toJSONString = JSON.toJSONString(data);
        JSONArray jsonArray = JSONObject.parseObject(toJSONString).getJSONArray("forecast");
        List<weather> weathers = JSON.parseArray(JSON.toJSONString(jsonArray), weather.class);
        weathers.forEach(o->{
            System.out.println(o);
        });


    }
}
