package com.loan.loanapp.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.loan.loanapp.dao.DocumentsRepository;
import com.loan.loanapp.entity.Document;
import com.loan.loanapp.exception.DocumentException;
import com.loan.loanapp.service.DocumentService;

@RestController
public class DocumentController {
	
	@Autowired
	DocumentService documentService;
	@Autowired
	DocumentsRepository documentRepo;
	
	@PostMapping("/document")
    public Document addDocument(@RequestBody Document newDocument) {
                  
                    return this.documentRepo.save(newDocument);
    }
   
    @DeleteMapping("/document/{id}")
     public String deleteProduct(@PathVariable Integer id) throws DocumentException {
          return this.documentService.deleteDocumentById(id);
         
     }
    
    @GetMapping("/customer/{id}")
     public Document getProductById(@PathVariable("id") Integer id) throws DocumentException {
          return this.documentService.getDocumentById(id);
     }
 
 
	


}
