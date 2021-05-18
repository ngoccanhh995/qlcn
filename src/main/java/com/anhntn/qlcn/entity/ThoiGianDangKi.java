package com.anhntn.qlcn.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "thoigiandangki")
public class ThoiGianDangKi {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idTaiKhoan")
    private Long idTaiKhoan;

    @Column(name = "thoiGianBD")
    private Date thoiGianBD;

    @Column(name = "thoiGianKT")
    private Date thoiGianKT;
}
