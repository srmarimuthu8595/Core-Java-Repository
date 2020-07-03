package com.srm.stock.srmdbservice.resource;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.srm.stock.srmdbservice.model.Quote;
import com.srm.stock.srmdbservice.model.Quotes;
import com.srm.stock.srmdbservice.repository.QuoteRepository;

@RestController
@RequestMapping("rest/db")
public class SrmdbServiceResource {
	
	private QuoteRepository quoteRepository;
	
	public SrmdbServiceResource(QuoteRepository quoteRepository){
		this.quoteRepository=quoteRepository;
	}
	
	    @GetMapping("/{username}")
	    public List<String> getQuotes(@PathVariable("username") final String username) {

	        return getQuotesByUserName(username);
	    }

	    @PostMapping("/add")
	    public List<String> add(@RequestBody final Quotes quotes) {

	        quotes.getQuotes()
	                .stream()
	                .map(quote -> new Quote(quotes.getUserName(), quote))
	                .forEach(quote -> quoteRepository.save(quote));
	        return getQuotesByUserName(quotes.getUserName());
	    }


	    @PostMapping("/delete/{username}")
	    public List<String> delete(@PathVariable("username") final String username) {

	        List<Quote> quotes = quoteRepository.findByUserName(username);
	        quoteRepository.deleteAll(quotes);

	        return getQuotesByUserName(username);
	    }


	    private List<String> getQuotesByUserName(@PathVariable("username") String username) {
	        return quoteRepository.findByUserName(username)
	                .stream()
	                .map(Quote::getQuote)
	                .collect(Collectors.toList());
	    }

	
	
	

}
