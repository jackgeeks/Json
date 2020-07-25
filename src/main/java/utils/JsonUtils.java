package utils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @Author: jackgeeks
 * @ProjectName: json
 * @Package: Json
 * @ClassName: jackson
 * @Description: @todo
 * @CreateDate: 2020/7/25 1:59
 * @Version: 1.0
 */

public class JsonUtils {

	private static final ObjectMapper mapper;

	private JsonUtils() {
	}

	static {
		mapper = new ObjectMapper();
		mapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
	}

	public static final String toJson(Object obj) {
		try {
			return mapper.writeValueAsString(obj);
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return "";
	}
	
	public static final String toJsonWithDefaultPrettyPrinter(Object obj) {
		try {
			return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj);
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return "";
	}

	public static final <T> T fromJson(final String json, Class<T> clazz) {
		try {
			return mapper.readValue(json, clazz);
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return null;
	}

	public static final <T> T fromJson(final String json, JavaType type) {
		try {
			return mapper.readValue(json, type);
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static final <T> T fromJson(final String json, TypeReference<T> reference) {
		try {
			return mapper.readValue(json, reference);
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static final Map<String, Object> fromJson(final String json) {
		return fromJson(json, Map.class);
	}

    public static Map<String, Object> removeMapEmptyValue(Map<String, Object> paramMap) {
        Set<String> set = paramMap.keySet();
        Iterator<String> it = set.iterator();
        List<String> listKey = new ArrayList<String>();
        while (it.hasNext()) {
            String str = it.next();
            if (paramMap.get(str) == null || "".equals(paramMap.get(str))) {
                listKey.add(str);
            }
        }
        for (String key : listKey) {
            paramMap.remove(key);
        }
        return paramMap;
    }

}
