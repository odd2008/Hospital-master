package com.ming.hospital.admin.service;

import com.ming.hospital.pojo.Hospital;

import java.util.List;

/**
 * Created by Administrator on 2019/5/16.
 */
public interface AdminHospitalService {

    List<Hospital> findHospitalList();

    void updateHospital(Hospital hospital);

    void addHospital(Hospital hospital);

    void removeHospital(Long hid);
}
