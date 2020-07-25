package api;


import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import pojo.weather;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: jackgeeks
 * @ProjectName: json
 * @Package: PACKAGE_NAME
 * @ClassName: pojo.weather
 * @Description: @上海天气api
 * @CreateDate: 2020/7/25 1:18
 * @Version: 1.0
 */

public class ApiService {
        private final  static  String API ="http://t.weather.itboy.net/api/weather/city/101020100";
        public static String getApi() throws IOException, InterruptedException {
            HttpClient client = HttpClient.newBuilder().build();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(API))
                    .timeout(Duration.ofMinutes(1))
                    .header("Content-Type", "application/json")
                    .GET()
                    .build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return response.body();
        }
        public static  List<weather> GetList() throws IOException, InterruptedException {

            String json = getApi();
            JSONObject jsonObject = JSONObject.fromObject(json);
            JSONArray jsonArray = JSONObject.fromObject(jsonObject.get("data")).getJSONArray("forecast");
            List<weather> weathers =new ArrayList<>();
            for (int i =0;i<jsonArray.size();i++){
                //转实体类
                weather weather = (weather)JSONObject.toBean((JSONObject) jsonArray.get(i), weather.class);
                weathers.add(weather);
            }
           return weathers;

        }


}
