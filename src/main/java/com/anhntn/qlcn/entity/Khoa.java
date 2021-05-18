package com.anhntn.qlcn.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "khoa")
public class Khoa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idKhoa")
    private Long idKhoa;

    @Column(name = "maKhoa")
    private String maKhoa;

    @Column(name = "tenKhoa")
    private String tenKhoa;
}
