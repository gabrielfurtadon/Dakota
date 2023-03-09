package com.tcs.dakotadb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.tcs.dakotadb.repository.*;

@RequestMapping
public class APIController {

    @Autowired
    // private TalentsRepository tRepo;
    private ProfileRepository prRepo;
    // private ArchivesRepository aRepo;
        @Autowired
    private UserRepository uRepo;




    // @GetMapping("/getTalents") // ...-talents.html
    // public Object getTalents(){
    // return tRepo.getTalents();
    // }


    // @GetMapping("/getArchives") // ...-archives
    // public Object getArchives() {
    // return aRepo.getArchives();
    // }

    // @GetMapping("/getPositions")
    // public Object getPositions(){
    // return pRepo.getPositions();
    // }

        //@GetMapping("/getInfoPositions")
    //public Object getInfoPositions(){
    //return pRepo.getInfoPositions();
    //}

}