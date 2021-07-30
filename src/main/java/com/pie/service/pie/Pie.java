package com.pie.service.pie;


import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pies")
@DynamicUpdate
@Data
public class Pie {
    @Id
    private String pieId;
    private String host;
    private int price;
    private String joinUser;
    private String value;


}
