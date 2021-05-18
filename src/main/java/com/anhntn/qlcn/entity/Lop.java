package com.anhntn.qlcn.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "lop")
public class Lop {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idKhoa")
    private Long idKhoa;

    @Column(name = "maLop")
    private String maLop;

    @Column(name = "tenLop")
    private String tenLop;

    @Column(name = "maKhoa")
    private String maKhoa;
}
