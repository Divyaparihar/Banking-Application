package in.bank.accounts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import in.bank.accounts.config.AccountsConfigService;
import in.bank.accounts.model.Accounts;
import in.bank.accounts.model.ConfigProps;
import in.bank.accounts.model.Customers;
import in.bank.accounts.repository.AccountsRepository;

//This is going to be controller of the whole Application

@RestController
public class AccountsController {

	@Autowired
	AccountsRepository accountRepository;

	@Autowired
	AccountsConfigService configService;

	// here we are going to create the API's

	@PostMapping("/accounts")
	public Accounts getCustomerDetails(@RequestBody Customers customer) {

		Accounts accounts = accountRepository.getByCustomerId(customer.getCustomerId());
		return accounts;
	}

	@GetMapping("accounts/ConfigProps")
	public String getPropertyDetails() throws JsonProcessingException {
		ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
		ConfigProps properties = new ConfigProps(configService.getMsg(), configService.getBuildVersion(),
				configService.getMailDetails(), configService.getActiveBranches());
		String jsonStr = ow.writeValueAsString(properties);
		return jsonStr;
	}
}
