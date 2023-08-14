package com.lst.test;

import com.alibaba.fastjson2.JSON;
import com.lst.entity.User;

/**
 * @author Lishuntong
 * @Date 2023/8/11 19:46
 * @functon
 */
public class Demo01 {
    public static void main(String[] args) {
        User user1=new User(1024L,"张小三1","男","河北");
        User user2=new User(1000L,"张小三2","男","河北");
        User user3=new User(1023L,"张小三3","男","河北");
        User user4=new User(1022L,"张小三4","男","河北");
        //对象转json字符串
        String s = JSON.toJSONString(user1);
        System.out.println(s);
        User parse = JSON.parseObject(s,User.class);
        System.out.println(parse);
        System.out.println(parse.getUsername());

    }
}
