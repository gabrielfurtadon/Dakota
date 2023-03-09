package com.tcs.dakotadb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RequestMapping
@Controller
public class NavController { // Navegação de páginas


    @GetMapping("/")
    public String index() {
        return "index"; // pasta e arquivo html
    }

     @GetMapping("login-error")
    public String loginError() {
        return "login-error"; // pasta e arquivo html
    }

    // GESTOR --------------------------------------------
    @GetMapping("/manager")
    public String gestorManager() {
        return "manager";
    }

    @GetMapping("/profiles-gestor")
    public String gestorProfiles() {
        return "profiles-gestor";
    }

    @GetMapping("/info-user-gestor")
    public String infoUserGestor(){
        return "info-user-gestor";
    }

    @GetMapping("/talents-gestor")
    public String gestorTalents() {
        return "talents-gestor";
    }

    @GetMapping("/archive-gestor")
    public String gestorArchive() {
        return "archive-gestor";
    }

    @GetMapping("/create-positions-gestor")
    public String createPosition() {
        return "create-positions-gestor";
    }

    

    @GetMapping("/edit-infoVagas-gestor")
    public String editInfoVagasGestor() {
        return "edit-infoVagas-gestor";
    }

    @GetMapping("/info-Candidates-gestor")
    public String infoCandidatesGestor() {
        return "info-Candidates-gestor";
    }

    @GetMapping("/infoVagas-gestor")
    public String infoVagasGestor() {
        return "infoVagas-gestor";
    }


    // ADMIN --------------------------------------------
    @GetMapping("/admin")
    public String admin() {
        return "admin";
    }

    @GetMapping("/cadastrar-candidato-admin")
    public String cadastrarCandidatoAdmin() {
        return "cadastrar-candidato-admin";
    }

     @GetMapping("/edit-infoVagas-admin")
    public String editInfoVagasAdmin() {
        return "edit-infoVagas-admin";
    }

    @GetMapping("/create-positions-admin")
    public String createPositionAdmin() {
        return "create-positions-admin";
    }

    @GetMapping("/info-user-admin")
    public String infoUserAdimin(){
        return "info-user-admin";
    }

    @GetMapping("/open-positions-admin")
    public String openPositionsAdmin(){
        return "open-positions-admin";
    }

    @GetMapping("/archive-admin")
    public String archiveAdmin() {
        return "archive-admin";
    }

    @GetMapping("/profiles-admin")
    public String profiles() {
        return "profiles-admin";
    }

    @GetMapping("/infoVagas-admin")
    public String infoVagasAdmin(){
        return "infoVagas-admin";
    }

    @GetMapping("/register-user-admin")
    public String registerUserAdmin() {
        return "register-user-admin";
    }

    @GetMapping("/talents-admin")
    public String talentsAdmin() {
        return "talents-admin";
    }

    @GetMapping("/info-Candidates-admin")
    public String infoCandidatesAdmin(){
        return "info-Candidates-admin";
    }

    @GetMapping("/edit-infoCandidates-admin")
    public String editCandidatesAdmin(){
        return "edit-infoCandidates-admin";
    }

    @GetMapping("/info-Candidates-admin-profiles")
    public String infoCandidatesAdminProfiles(){
        return "info-Candidates-admin-profiles";
    }

    // RH --------------------------------------------
    @GetMapping("/rh")
    public String rhPage() {
        return "rh";
    }


    @GetMapping("/cadastrar-candidato-rh")
    public String cadastrarCandidato() {
        return "cadastrar-candidato-rh";
    }

    @GetMapping("/profiles-rh")
    public String profilesRH() {
        return "profiles-rh";
    }

    @GetMapping("/talents-rh")
    public String talentsRH() {
        return "talents-rh";
    }

    @GetMapping("/archive-rh")
    public String archiveRH() {
        return "archive-rh";
    }

        @GetMapping("/info-Candidates-rh")
    public String infoCandidatesRH(){
        return "info-Candidates-rh";
    }


    
    @GetMapping("/edit-infoCandidates-rh")
    public String editCandidatesRh(){
        return "edit-infoCandidates-rh";
    }

    @GetMapping("/info-user-rh")
    public String infoUserRh(){
        return "info-user-rh";
    }


    @GetMapping("/infoVagas-rh")
    public String infoVagasRh(){
        return "infoVagas-rh";
    }
    

}
