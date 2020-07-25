package utils;

import com.alibaba.fastjson.JSON;

/**
 * @Author: jackgeeks
 * @ProjectName: json
 * @Package: utils
 * @ClassName: FastJsonUtil
 * @Description: @todo
 * @CreateDate: 2020/7/26 1:30
 * @Version: 1.0
 */
public class FastJsonUtil {
    public static String bean2Json(Object obj) {
        return JSON.toJSONString(obj);
    }

    public static <T> T json2Bean(String jsonStr, Class<T> objClass) {
        return JSON.parseObject(jsonStr, objClass);
    }

}
