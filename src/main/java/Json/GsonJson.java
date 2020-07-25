package Json;

import api.ApiService;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import pojo.weather;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * @Author: jackgeeks
 * @ProjectName: json
 * @Package: Json
 * @ClassName: gson
 * @Description: @todo
 * @CreateDate: 2020/7/25 15:05
 * @Version: 1.0
 */
public class GsonJson {
    public static void main(String[] args) throws IOException, InterruptedException {
        Gson gson = new Gson();
        List<weather> json = ApiService.GetList();
        String toJson = gson.toJson(json);
        System.out.println("List转json:"+toJson);
        List<weather>  weathers=gson.fromJson(toJson, new TypeToken<List<weather>>() {}.getType());

        System.out.println("json转List:"+weathers);

    }
}
