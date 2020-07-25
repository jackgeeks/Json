package Json;

import api.ApiService;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import pojo.weather;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * @Author: jackgeeks
 * @ProjectName: json
 * @Package: PACKAGE_NAME
 * @ClassName: pojo.weather
 * @Description: @NetSfJsonDome
 * @CreateDate: 2020/7/25 1:18
 * @Version: 1.0
 */
public class NetSfJson {


    public static void main(String[] args) throws IOException, InterruptedException {
        String json = ApiService.getApi();
        JSONObject jsonObject = JSONObject.fromObject(json);
        String city = JSONObject.fromObject(jsonObject.get("cityInfo")).get("city").toString();
        JSONArray jsonArray = JSONObject.fromObject(jsonObject.get("data")).getJSONArray("forecast");

        List<weather> weathers =new ArrayList<>();
        System.out.println(jsonArray.size());
         for (int i =0;i<jsonArray.size();i++){
              //转实体类
             weather weather = (weather)JSONObject.toBean((JSONObject) jsonArray.get(i), weather.class);
             weathers.add(weather);
         }
        System.out.println(city);
        weathers.forEach(e->{
            System.out.println(e);
        });



    }
}
