package com.anhntn.qlcn.service;

import com.anhntn.qlcn.entity.SinhVien;
import com.anhntn.qlcn.repository.SinhVienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SinhVienService {

    @Autowired
    private SinhVienRepository sinhVienRepository;

    public List<SinhVien> findAll() {
        return sinhVienRepository.findAll();
    }

    public SinhVien findbyId(Long idSV) {
        return sinhVienRepository.findByIdSV(idSV);
    }

    public SinhVien save(SinhVien sv) {
        return sinhVienRepository.save(sv);
    }

    public SinhVien update(SinhVien sv) {
        return sinhVienRepository.save(sv);
    }

    public void delete(SinhVien sv) {
        sinhVienRepository.delete(sv);
    }

    public List<SinhVien> findSinhVienKhoa(String lienkhoa) {
        return sinhVienRepository.findSinhVienKhoa(lienkhoa);
    }
}
