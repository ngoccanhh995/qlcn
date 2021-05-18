package com.anhntn.qlcn.controller;

import com.anhntn.qlcn.entity.SinhVien;
import com.anhntn.qlcn.service.SinhVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SinhVienController {

    @Autowired
    private SinhVienService sinhVienService;

   /* @RequestMapping ("/sinhviens")
    public List<SinhVien> listSinhViens() {
        return sinhVienService.findSinhVienKhoa("A");
    }*/

    @RequestMapping(value = { "/personList" }, method = RequestMethod.GET)
    public String personList(Model model) {
        List<SinhVien> listSinhVien = sinhVienService.findAll();
        model.addAttribute("listSinhVien", listSinhVien);
        return "personList";
    }

    @RequestMapping(value = { "/newSV" }, method = RequestMethod.GET)
    public String newSV(Model model) {
        model.addAttribute("sinhVien", new SinhVien());
        return "addPerson";
    }

    @RequestMapping(value = { "/addSinhVien" }, method = RequestMethod.POST)
    public String addSinhVien(Model model, @ModelAttribute("sinhVien") SinhVien sinhVien) {
        String maSV = sinhVien.getMaSV();
        String tenSV = sinhVien.getTenSV();
        String idTaiKhoan = sinhVien.getIdTaiKhoan();

        SinhVien sv = new SinhVien();
        sv.setMaSV(maSV);
        sv.setTenSV(tenSV);
        sv.setIdTaiKhoan(idTaiKhoan);
        sv.setLienKhoa("C");
        List<SinhVien> listSinhVien = sinhVienService.findAll();
        sv.setIdSV(listSinhVien.get(0).getIdSV());

        SinhVien sinhVien1 = sinhVienService.save(sv);

        return "redirect:/personList";
    }
}
