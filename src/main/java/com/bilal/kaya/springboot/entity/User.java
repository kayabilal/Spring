package com.bilal.kaya.springboot.entity;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;


@Entity
@Table(name="Kullanicilar")
@Data
//@Getter
//@Setter
//@ToString
public class User extends BaseEntity{
    @Id
    @SequenceGenerator(name="user_seq_gen",sequenceName = "user_gen",initialValue = 100,allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "user_seq_gen")
    @Column(name="ID")
    private Long id;
    @Column(name="ISIM",length = 100)
    private String firstName;
    @Column(name="SOYISIM",length = 100)
    private String lastName;


}
