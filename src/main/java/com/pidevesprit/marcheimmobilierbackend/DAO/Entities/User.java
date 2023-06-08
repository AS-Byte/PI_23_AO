package com.pidevesprit.marcheimmobilierbackend.DAO.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUser;
    private String nom;
    private String prenom;
    private String adresse;
    private String email;
    private String profession;
    private String password;
    private Long numTelephone;
    @Temporal(TemporalType.DATE)
    private  Date dateNaissance;
    @Temporal(TemporalType.DATE)
    private Date dateInscription;
   //@JsonIgnore
    @ManyToOne
    private  Role role;


    //(Relation Annonce-User:Propriétaire)
    @JsonIgnore
    @OneToMany(mappedBy = "annonceur",cascade = CascadeType.ALL)
    private List<Annonce> lstAnnonces;


    //(Relation User-RDV)
    @JsonIgnore
    @OneToMany(mappedBy = "visiteur",cascade = CascadeType.ALL)
    private List<RDV> lstRDVs;


    //(Relation Contrat-User)
    @JsonIgnore
    @OneToMany(mappedBy = "signataire",cascade = CascadeType.ALL)
    private List<Contrat> contrats;






    @JsonIgnore
    @OneToMany(mappedBy = "utilisateur",cascade = CascadeType.ALL)
    private List<Commentaire> commentslist;
    @JsonIgnore
    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    private List<Post> postList;
    @JsonIgnore
    @OneToMany(mappedBy = "vendeur", cascade = CascadeType.ALL)
    private List<Meuble> meublesVendeur;
    @JsonIgnore
    @OneToMany(mappedBy = "acheteur", cascade = CascadeType.ALL)
    private List<Commande> commandesListAcheteur;
    @JsonIgnore
    @OneToMany(mappedBy = "livreur", cascade = CascadeType.ALL)
    private List<Livraison> LivraisonsListLivreur;



}
