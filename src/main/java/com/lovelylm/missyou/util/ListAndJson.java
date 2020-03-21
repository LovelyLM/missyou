package com.lovelylm.missyou.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.AttributeConverter;
import java.util.List;

/**
 * Created by LovelyLM
 * 2020/3/21 20:35
 */
public class ListAndJson implements AttributeConverter<List<Object>, String> {
    @Autowired
    private ObjectMapper mapper;
    @Override
    public String convertToDatabaseColumn(List<Object> objects) {
        try {
            return mapper.writeValueAsString(objects);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            throw new RuntimeException("服务器异常");
        }
    }

    @Override
    public List<Object> convertToEntityAttribute(String s) {

        try {
            if (s == null){
                return null;
            }
            List<Object> t = mapper.readValue(s, List.class);
            return t;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            throw new RuntimeException("服务器异常");
        }
    }
}
