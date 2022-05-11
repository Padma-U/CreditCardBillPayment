package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.bean.Statement;
import com.cg.service.IStatementService;

@RestController
public class StatementController {

	@Autowired
	private IStatementService statementservice;

	@PostMapping("/addStatement/{custId}")
	public ResponseEntity<Object> addStatement(@PathVariable("custId") long id, @RequestBody Statement statement) {

		return statementservice.addStatement(id, statement);
	}

	@GetMapping("/removeStatement/{custId}/{statementId}")
	public ResponseEntity<Object> removeStatement(@PathVariable("custId") long id,
			@PathVariable("statementId") long statementId) {

		return statementservice.removeStatement(id, statementId);
	}

	// get Statement by customer id and statement id

	// get all statements by customer id
	@GetMapping("/getAllStatements/{custId}")
	public List<Statement> getAllStatements(@PathVariable("custId") int id) {

		return statementservice.getAllStatementsById(id);
	}

	// Update Statement by customer id and statement id
	@PatchMapping("/updateStatement/{custId}/{statementId}")
	public Statement updateStatementByIdAndStatementId(@PathVariable("custId") long id,
			@PathVariable("statementId") long statementId, @RequestBody Statement newStatement) {

		return statementservice.updateStatement(id, statementId, newStatement);
	}

}
