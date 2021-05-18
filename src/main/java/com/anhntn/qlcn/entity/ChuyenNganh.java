package com.anhntn.qlcn.entity;

import lombok.Data;
import lombok.Generated;

import javax.persistence.*;

@Entity
@Data
@Table (name = "chuyennganh")
public class ChuyenNganh {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idCN")
    private Long idCN;

    @Column(name = "maCN")
    private String maCN;

    @Column(name = "chuyenNganh")
    private String chuyenNganh;

    @Column(name = "moTa")
    private String moTa;

    @Column(name = "ghiChu")
    private String ghiChu;
}
