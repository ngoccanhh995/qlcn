package com.anhntn.qlcn.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "thongtindangki")
public class ThongTinDangKy {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column (name = "id")
    private Long id;

    @Column (name = "maTK")
    private String maTK;

    @Column (name = "thuTuCN")
    private String thuTuCN;

    @Column (name = "thoiGianDangKy")
    private Date thoiGianDangKy;


    
}
