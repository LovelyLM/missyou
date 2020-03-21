package com.lovelylm.missyou.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.util.Map;

/**
 * Created by LovelyLM
 * 2020/3/21 20:14
 */
@Converter
public class MapAndJson implements AttributeConverter<Map<String, Object>, String> {
    @Autowired
    private ObjectMapper mapper;
    @Override
    public String convertToDatabaseColumn(Map<String, Object> stringObjectMap) {
        try {
            return mapper.writeValueAsString(stringObjectMap);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            throw new RuntimeException("服务器异常");
        }
    }

    @Override
    public Map<String, Object> convertToEntityAttribute(String s) {
        return null;
    }
}
