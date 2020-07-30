package com.greenfoxacademy.urlaliaser.services;

import com.greenfoxacademy.urlaliaser.models.Alias;
import com.greenfoxacademy.urlaliaser.modelsDTO.AliasDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface AliasService {

    ResponseEntity<?> addNewAlias(String alias, String url);

    ResponseEntity<?> openAlias(String alias);

    List<Alias> getAllAliases();

    List<AliasDTO> getAllAliasesDTO();

    ResponseEntity<?> getResponseEntityDelete(Long id, Alias alias);
}
