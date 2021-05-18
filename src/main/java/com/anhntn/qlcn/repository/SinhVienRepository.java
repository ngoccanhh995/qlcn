package com.anhntn.qlcn.repository;

import com.anhntn.qlcn.entity.SinhVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SinhVienRepository extends JpaRepository<SinhVien, Long> {
    SinhVien findByIdSV(Long idSV);
    List<SinhVien> findSinhVienByLienKhoa(String lienKhoa);

    @Query ("select sv from SinhVien sv where sv.lienKhoa = ?1")
    List<SinhVien> findSinhVienKhoa(String lienKhoa);
}
