package utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

/**
 * @Author: jackgeeks
 * @ProjectName: json
 * @Package: utils
 * @ClassName: JacksonUtil
 * @Description: @todo
 * @CreateDate: 2020/7/26 1:31
 * @Version: 1.0
 */
public class JacksonUtil {
    private static ObjectMapper mapper = new ObjectMapper();

    public static String bean2Json(Object obj) {
        try {
            return mapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static <T> T json2Bean(String jsonStr, Class<T> objClass) {
        try {
            return mapper.readValue(jsonStr, objClass);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
