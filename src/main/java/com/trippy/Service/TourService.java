
package com.trippy.Service;

import com.trippy.entity.Tours;
import com.trippy.Repository.TourRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TourService {

    @Autowired
    private TourRepo tourRepo;

    public Tours saveDetail(Tours tripEntity){
        return tourRepo.save(tripEntity);
    }

    public List<Tours> getAllTours(){
        System.out.println("got request");
        return tourRepo.findAll();
    }
}