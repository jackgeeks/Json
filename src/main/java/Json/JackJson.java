package Json;

import api.ApiService;
import com.fasterxml.jackson.databind.ObjectMapper;
import pojo.weather;
import utils.JsonUtils;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: jackgeeks
 * @ProjectName: json
 * @Package: Json
 * @ClassName: jackson
 * @Description: @todo
 * @CreateDate: 2020/7/25 1:59
 * @Version: 1.0
 */
public class JackJson {
    public static void main(String[] args) throws IOException, InterruptedException {

        List<weather> json = ApiService.GetList();
        weather weather = json.get(0);
        System.out.println("对象转json："+JsonUtils.toJsonWithDefaultPrettyPrinter(weather));
        Map<String,Object>  map =new HashMap<>();
        map.put("1","上海");
        map.put("2","北京");
        map.put("3","天津");
        map.put("4","深圳");
        Map<String,Object>  map1 =new HashMap<>();
        map1.put("city",map);
        Map<String, Object> objectMap = JsonUtils.removeMapEmptyValue(map);
        System.out.println("Map转json："+objectMap);

        String jsonTow = JsonUtils.toJsonWithDefaultPrettyPrinter(map1);
        System.out.println("Map嵌套转json"+jsonTow);



    }
}
