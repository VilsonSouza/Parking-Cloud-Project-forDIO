package com.eumemu.parkingcloudproject.controller;

import com.eumemu.parkingcloudproject.controller.dto.ParkingDTO;
import com.eumemu.parkingcloudproject.controller.mapper.ParkingMapper;
import com.eumemu.parkingcloudproject.model.Parking;
import com.eumemu.parkingcloudproject.service.ParkingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/parking")
public class ParkingController {

    private final ParkingService parkingService;
    private final ParkingMapper parkingMapper;


    public ParkingController(ParkingService parkingService, ParkingMapper parkingMapper) {
        this.parkingService = parkingService;
        this.parkingMapper = parkingMapper;
    }

    @GetMapping
    public List<ParkingDTO> findAll(){
       List<Parking> parkingList= parkingService.findAll();
        List<ParkingDTO> result = parkingMapper.toParkingDTOList(parkingList);
        return result;
    }

}
