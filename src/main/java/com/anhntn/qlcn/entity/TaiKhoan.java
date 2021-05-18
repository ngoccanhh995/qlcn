package com.anhntn.qlcn.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "taikhoan")
public class TaiKhoan {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idTaiKhoan")
    private Long idTaiKhoan;

    @Column(name = "maSV")
    private String maSV;

    @Column(name = "tenDN")
    private String tenDN;

    @Column(name = "matKhau")
    private String matKhau;

    @Column(name = "trangThai")
    private String trangThai;

    @Column(name = "admin")
    private String admin;

}
