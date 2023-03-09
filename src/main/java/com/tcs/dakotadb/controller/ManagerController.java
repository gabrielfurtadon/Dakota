package com.tcs.dakotadb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.tcs.dakotadb.model.OpenPosition;
import com.tcs.dakotadb.repository.PositionRepository;

@Controller
@RestController
public class ManagerController {

    @Autowired
    private PositionRepository pRepo;

    // @GetMapping("/getPositions")
    // public Object getPositions(){
    // return pRepo.getPositions();
    // }


    @PostMapping("/createPosition")
    public Object createPosition(

            @RequestParam(name = "title") String title,
            @RequestParam(name = "description") String description,
            @RequestParam(name = "customerArea") String customerArea,
            @RequestParam(name = "linkedin") String linkedin,
            @RequestParam(name = "locationWork") String locationWork,
            @RequestParam(name = "cluster") String cluster, //
            @RequestParam(name = "interview") String interview, //
            @RequestParam(name = "newPosition") String newPosition,
            @RequestParam(name = "priority") String priority,
            @RequestParam(name = "status") String status, //
            @RequestParam(name = "mainSkill") String mainSkill, //
            @RequestParam(name = "owner") String owner, //
            @RequestParam(name = "senLevel") String senLevel, //
            @RequestParam(name = "MinExperience") String minExperience,
            @RequestParam(name = "customer") String customer, //
            @RequestParam(name = "modelWork") String modelWork, //
            @RequestParam(name = "spanish") String spanish, //
            @RequestParam(name = "english") String english, //
            @RequestParam(name = "cp") String cp, //
            @RequestParam(name = "cloudSkill") String cloudSkill, //
            @RequestParam(name = "won") String won) {

        OpenPosition position = new OpenPosition();
        int iMinExp = Integer.parseInt(minExperience);

        position.setTitle(title);
        position.setDescription(description);
       // position.setCustomerInfo(customerArea);
        position.setLinkedinUrl(linkedin);
        position.setWorklocation(locationWork);
        position.setCluster(cluster);
        position.setNeedClientInterview(interview);
        position.setNewPositionOrReplacement(newPosition);
        position.setPriority(priority);
        position.setRgsStatus(status);
        position.setSeniority(senLevel);
        position.setMinimumExperienceYears(iMinExp);
        position.setWorkModel(modelWork);
        position.setSpanish(spanish);
        position.setEnglish(english);
        position.setCloudSkill(cloudSkill);
        position.setWon(won);
        pRepo.save(position);
        return position;
    }

}
