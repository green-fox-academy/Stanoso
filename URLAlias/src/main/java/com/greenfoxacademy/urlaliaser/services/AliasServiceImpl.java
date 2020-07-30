package com.greenfoxacademy.urlaliaser.services;

import com.greenfoxacademy.urlaliaser.models.Alias;
import com.greenfoxacademy.urlaliaser.models.ErrorCustom;
import com.greenfoxacademy.urlaliaser.models.MessageCustom;
import com.greenfoxacademy.urlaliaser.modelsDTO.AliasDTO;
import com.greenfoxacademy.urlaliaser.repositories.AliasRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

@Component
public class AliasServiceImpl implements AliasService {

    AliasRepository aliasRepository;

    public AliasServiceImpl(AliasRepository aliasRepository) {
        this.aliasRepository = aliasRepository;
    }

    @Override
    public ResponseEntity<?> addNewAlias(String alias, String url) {
        List<Alias> aliases = getAllAliases();
        Alias result = aliases.stream().filter(a -> a.getAlias().toLowerCase().equals(alias.toLowerCase())).findAny().orElse(null);

        int secretCode=0;
        boolean stop = true;
        while (stop) {
            secretCode = createSecretCode();
            int finalSecretCode = secretCode;
            stop = (aliases.stream().anyMatch(c -> c.getSecretCode() == finalSecretCode));
        }


        if (result==null) {
            Alias newAlias = new Alias (alias,url,secretCode);
            this.aliasRepository.save(newAlias);
            return new ResponseEntity<>(new MessageCustom("Your URL is aliased to <b>"+alias+ "</b> and your secret code is <b> "+ secretCode+"</b>."), HttpStatus.OK);
        }
        return new ResponseEntity<>(new ErrorCustom("Your alias is already in use!"), HttpStatus.BAD_REQUEST);
    }

    @Override
    public ResponseEntity<?> openAlias(String alias) {
        List<Alias> aliases = getAllAliases();
        Alias result = aliases.stream().filter(a -> a.getAlias().toLowerCase().equals(alias.toLowerCase())).findAny().orElse(null);
        if (result==null) {
            return new ResponseEntity<>(new ErrorCustom("This alias doesn´t exist!"),HttpStatus.NOT_FOUND);
        }
        Alias addHitCount = new Alias(result.getId(), result.getAlias(), result.getUrl(), result.getSecretCode(), result.getHitCount()+1);
        this.aliasRepository.save(addHitCount);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @Override
    public List<Alias> getAllAliases() {
        return  this.aliasRepository.findAll();
    }

    @Override
    public List<AliasDTO> getAllAliasesDTO() {
        List<Alias> aliases = getAllAliases();
        List<AliasDTO> aliasDTOS = new ArrayList<>();

        for (Alias alias : aliases) {
            aliasDTOS.add(setAliasDTO(alias));
        }
        return aliasDTOS;
    }

    @Override
    public ResponseEntity<?> getResponseEntityDelete(Long id, Alias alias) {
        List<Alias> aliases = getAllAliases();
        Alias result = aliases.stream().filter(a -> a.getSecretCode()==alias.getSecretCode()).findAny().orElse(null);
        if (result==null) {
            return new ResponseEntity<String>("Secret code doesn´t exist!", HttpStatus.NOT_FOUND);
        }
        if (result.getId()!=id) {
            return new ResponseEntity<String>("Secret code doesn´t match with provided id!", HttpStatus.FORBIDDEN);
        }
        this.aliasRepository.deleteById(id);
        return new ResponseEntity<String>("OK", HttpStatus.NO_CONTENT);
    }

    private AliasDTO setAliasDTO (Alias alias) {
        AliasDTO aliasDTO = new AliasDTO();
        aliasDTO.setId(alias.getId());
        aliasDTO.setAlias(alias.getAlias());
        aliasDTO.setHitCount(alias.getHitCount());
        aliasDTO.setUrl(alias.getUrl());
        return aliasDTO;
    }

    public int createSecretCode () {
        Random random = new Random();
        return ThreadLocalRandom.current().nextInt(1000,9999);
    }
}
