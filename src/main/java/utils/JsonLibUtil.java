package utils;

import net.sf.json.JSONObject;

/**
 * @Author: jackgeeks
 * @ProjectName: json
 * @Package: utils
 * @ClassName: JsonLibUtil
 * @Description: @todo
 * @CreateDate: 2020/7/26 1:32
 * @Version: 1.0
 */
public class JsonLibUtil {
    public static String bean2Json(Object obj) {
        JSONObject jsonObject = JSONObject.fromObject(obj);
        return jsonObject.toString();
    }

    @SuppressWarnings("unchecked")
    public static <T> T json2Bean(String jsonStr, Class<T> objClass) {
        return (T) JSONObject.toBean(JSONObject.fromObject(jsonStr), objClass);
    }
}
