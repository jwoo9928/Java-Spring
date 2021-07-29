package com.pie.service;
//lombok

import lombok.AllArgsConstructor;
import lombok.Data;

//@data : userIdBean이 가지고 있는 모드 프로퍼티에 관해서 setter,getter,생성자 tostring 등이 만들어진다.
//@AllArgsConstructor : 모든 argument에 관한 생성자가 만들어진다.
@Data
@AllArgsConstructor
public class userIdBean {
    private String message;
}
