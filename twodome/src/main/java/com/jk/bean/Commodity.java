package com.jk.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @program: first
 * @description:
 * @author: Mr.Xue
 * @create: 2019-01-13 20:01
 **/
@Data
public class Commodity {
    private String id;
    private String name;
    private Double price;
    private String photo;
    private Integer num;

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT-8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date uptime;

    private Integer shop;
}
