package com.pidevesprit.marcheimmobilierbackend.RestControllers;

import com.pidevesprit.marcheimmobilierbackend.DAO.Entities.CategorieMeubles;
import com.pidevesprit.marcheimmobilierbackend.Services.Interfaces.ICategorieMeubleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class CategorieMeubleController {

    @Autowired
    private ICategorieMeubleService categMeubleService;

   /* @PostMapping("addCategorieMeuble")
    CategorieMeubles addCategorieMeuble(@RequestBody CategorieMeubles categorieMeubles){

        return categMeubleService.addCategorieMeuble(categorieMeubles);
    }

    @PutMapping("updateCategorieMeuble")
    CategorieMeubles updateCategorieMeuble(@RequestBody CategorieMeubles categorieMeuble){

        return categMeubleService.updateCategorieMeuble(categorieMeuble);
    }

    @DeleteMapping("deleteCategorieMeuble")
    void  deleteCategorieMeuble(@RequestBody CategorieMeubles categorieMeuble) {
        categMeubleService.deleteCategorieMeuble(categorieMeuble);
    }

    @DeleteMapping("deleteCategorieMeubleByid")
    void deleteCategorieMeubleByid(@RequestParam Long id){
        categMeubleService.deleteCategorieMeubleByid(id);
    }

    @GetMapping("findAllCategoriesMeubles")
    List<CategorieMeubles> findAllCategoriesMeubles(){
        return categMeubleService.findAllCategoriesMeubles();
    }

    @GetMapping("findCategorieMeubleBId")
    CategorieMeubles findCategorieMeubleBId(@RequestParam Long id){
        return categMeubleService.findCategorieMeubleById(id);

    }*/
}
