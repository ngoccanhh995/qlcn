package com.anhntn.qlcn.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "sinhvien")
public class SinhVien {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idSv")
    private Long idSV;

    @Column(name = "maSV")
    private String maSV;

    @Column(name = "tenSV")
    private String tenSV;

    @Column(name = "lienKhoa")
    private String lienKhoa;

    @Column(name = "maTK")
    private String maTK;

    @Column(name = "maLop")
    private String maLop;

    @Column(name = "idTaiKhoan")
    private String idTaiKhoan;

    @Column(name = "ngaySinh")
    private Date ngaySinh;
}
