package com.rui.pojo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Data
@Getter
@Setter
public class Blog {
    private String id;
    private String title;
    private String author;
    private Date creatTime; //属性名和字段名不一致
    private int views;

    public Blog() {
    }
}
