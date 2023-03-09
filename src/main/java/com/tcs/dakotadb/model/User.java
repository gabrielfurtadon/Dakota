package com.tcs.dakotadb.model;

import javax.persistence.*;

@Entity
@Table(name = "tb_user") // Tabela Usuário
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "name_user")
    private String name;

    @Column(name = "tcs_email")
    private String tcs_email;

    @Column(name = "password")
    private String password;

    @ManyToOne
    @JoinColumn(name = "permission_id", referencedColumnName = "id")
    private Permission permission; 

     //Getter e Setters
    //------------------------------------------------
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    //------------------------------------------------
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //------------------------------------------------
    public Permission getPermission() {
         return permission;
     }

     public void setPermission(Permission permission) {
         this.permission = permission;
     }

    //------------------------------------------------
    public String getTcs_email() {
        return tcs_email;
    }

    public void setTcs_email(String tcs_email) {
        this.tcs_email = tcs_email;
    }

    //------------------------------------------------
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
