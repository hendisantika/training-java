package com.transkom.pelatihan.controller;

import com.transkom.pelatihan.dao.PesertaDao;
import com.transkom.pelatihan.entity.Peserta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api")
public class PesertaController {
    
    @Autowired
    private PesertaDao pd;
    
    @RequestMapping(value="/peserta", method = RequestMethod.GET)
    public Page<Peserta> cariPeserta(Pageable page){
        return pd.findAll(page);
    }
    
    @RequestMapping(value="/peserta", method = RequestMethod.POST, consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public void insertPesertaBaru(@RequestBody @Valid Peserta p){ pd.save(p);}
    
    @RequestMapping(value="/peserta/{id}", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.OK)
    public void updatePeserta(@PathVariable("id") String id, @RequestBody @Valid Peserta p){
        p.setId(id);
        pd.save(p);
    }
    
    @RequestMapping(value="/peserta/{id}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Peserta> cariPesertaById(@PathVariable("id") String id){
        Peserta hasil = pd.findOne(id);
        if(hasil == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(hasil, HttpStatus.OK);
    }
    
    @RequestMapping(value="/peserta/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void hapusPeserta(@PathVariable("id") String id){
        pd.delete(id);
    }
}
