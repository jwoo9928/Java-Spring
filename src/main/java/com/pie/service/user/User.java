package com.pie.service.user;


import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //jpa가 붙은 클래스는 jpa가 관리하는 엔티티라고 한다.
@Table(name = "users")
@DynamicUpdate
@Data
public class User {
    @Id
    private String Id;
    private String password;
    private String name;
    private String attend;
}
