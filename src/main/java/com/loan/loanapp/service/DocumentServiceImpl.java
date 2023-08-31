package com.loan.loanapp.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loan.loanapp.dao.DocumentsRepository;
import com.loan.loanapp.entity.Document;
import com.loan.loanapp.exception.DocumentException;

@Service
public class DocumentServiceImpl implements DocumentService{
	@Autowired
	DocumentsRepository documentRepo;
	

	@Override
	public Document addDocument(Document newDocument) throws DocumentException {
		// TODO Auto-generated method stub
		Optional<Document> documentOpt = this.documentRepo.findById(newDocument.getDocumentId());
        if(documentOpt.isPresent())
            throw new DocumentException("Document already exist "+newDocument.getDocumentName());
        return this.documentRepo.save(newDocument);
	}

	@Override
	public Document getDocumentById(Integer id) throws DocumentException {
		// TODO Auto-generated method stub
		Optional<Document> documentOpt = this.documentRepo.findById(id);
        if(!documentOpt.isPresent())
            throw new DocumentException("Document doesn't exist for id: "+id);
        return documentOpt.get();
	}

	@Override
	public String deleteDocumentById(Integer id) throws DocumentException {
		// TODO Auto-generated method stub
		Optional<Document> documentOpt = this.documentRepo.findById(id);
        if(!documentOpt.isPresent())
            throw new DocumentException("Product doesn't exist to delete for id: "+id);
        this.documentRepo.deleteById(id);
        Document document=documentOpt.get();
        this.documentRepo.delete(document);
        return "Successfully deleted";
   
	}

	@Override
	public Collection<Document> getAllDocument() {
		// TODO Auto-generated method stub
		return this.documentRepo.findAll();
	}

}
