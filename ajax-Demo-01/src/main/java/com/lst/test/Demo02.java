package com.lst.test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lst.entity.User;

import javax.jws.soap.SOAPBinding;

/**
 * @author Lishuntong
 * @Date 2023/8/11 20:34
 * @functon
 */
public class Demo02 {
    public static void main(String[]    args) throws JsonProcessingException {
        //jackson
        //创建对象
        ObjectMapper objectMapper=new ObjectMapper();
        User user=new User(134L,"小明","男","北京");
        String s = objectMapper.writeValueAsString(user);
        System.out.println(s);
        User user1 = objectMapper.readValue(s, User.class);
        System.out.println(user1);
    }
}
