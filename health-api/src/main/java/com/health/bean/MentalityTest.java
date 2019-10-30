package com.health.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class MentalityTest implements Serializable {

    private static final long serialVersionUID = 8991582785292099065L;

    private Integer id;

    private String tQuestion;

    private Integer tOption;

    private Date createtime;

    private Date updatetime;
}