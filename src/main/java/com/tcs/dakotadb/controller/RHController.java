package com.tcs.dakotadb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.tcs.dakotadb.model.Profile;
import com.tcs.dakotadb.repository.ProfileRepository;

@Controller
@RestController
public class RHController {

    @Autowired
    private ProfileRepository pRepo;

    @GetMapping("/getProfile") // ...-profile.html
    public Object getProfile() {

        return pRepo.getProfile();
    }

    @PostMapping("/cadastrarCandidato")
    public Object cadastrarCandidato(

            @RequestParam(name = "fullname") String fullname,
            @RequestParam(name = "current-employer") String currentEmployer,
            @RequestParam(name = "feedback") String feedback,
            @RequestParam(name = "english") String english,
            @RequestParam(name = "spanish") String spanish,
            @RequestParam(name = "date-entrev") String dateEntrev, // Tipo data
            @RequestParam(name = "seniority") String seniority,
            @RequestParam(name = "role") String role,
            @RequestParam(name = "rate-target") String rateTarget,
            @RequestParam(name = "pending-hr") String pendingHR,
            @RequestParam(name = "description") String description,
            @RequestParam(name = "main-skill") String mainSkill,
            @RequestParam(name = "email-address") String email,
            @RequestParam(name = "candidate-screening-resolution") String candidateScreeningResolution,
            @RequestParam(name = "profile-source") String profileSource,
            @RequestParam(name = "phone") String phone,
            @RequestParam(name = "location") String location,
            @RequestParam(name = "dlh-requirement") String dlhRequirement,
            @RequestParam(name = "curriculo") String curriculo,
            @RequestParam(name = "salary-intention") String salaryIntention,
            @RequestParam(name = "resolution-comments") String resolutionComments) {

        Profile profile = new Profile();
        // date-created -> automático no banco
        // date-update -> automático no banco
        // curriculo -> não tem no banco
        profile.setFullName(fullname);
        profile.setCurrentEmployer(currentEmployer);
        profile.setFeedback(feedback);
        profile.setEnglish(english);
        profile.setSpanish(spanish);
        profile.setDescription(description);
        profile.setSeniority(seniority);
        profile.setLocation(location);
        profile.setPhone(phone);
        profile.setEmail(email);
        profile.setProfileSource(profileSource);
        profile.setMainSkill(mainSkill);
        profile.setCandidateScreeningResolution(candidateScreeningResolution);
        profile.setSalaryIntention(salaryIntention);
        profile.setResolutionComments(resolutionComments);
        profile.setRole(role);
        profile.setPendingHR(pendingHR);
        profile.setDlhRequeriment(dlhRequirement);
        profile.setRateTarget(rateTarget);
        pRepo.save(profile);

        return profile;
    }

}
