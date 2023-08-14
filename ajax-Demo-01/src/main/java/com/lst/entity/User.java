package com.lst.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Lishuntong
 * @Date 2023/8/11 19:44
 * @functon
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private long id;
    private String username;
    private String sex;
    private String address;
}
