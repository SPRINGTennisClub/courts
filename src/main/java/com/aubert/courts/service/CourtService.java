package com.aubert.courts.service;

import com.aubert.courts.dao.CourtRepository;
import com.aubert.courts.entity.Court;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourtService {
    @Autowired private CourtRepository courtRepository;
    public List<Court> getCourts(){
        return courtRepository.findAll();
    }

    public void addCourt(Court newCourt){
        courtRepository.save(newCourt);
    }

    public void removeCourt(int courtNumber){
        courtRepository.deleteById(courtNumber);
    }
}
