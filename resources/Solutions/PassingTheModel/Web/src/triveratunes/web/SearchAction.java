package triveratunes.web;

/**
 * <p>
 * This component and its source code representation are copyright protected
 * and proprietary to The Trivera Group, Inc., Worldwide D/B/A Trivera Technologies
 *
 * This component and source code may be used for instructional and
 * evaluation purposes only. No part of this component or its source code
 * may be sold, transferred, or publicly posted, nor may it be used in a
 * commercial or production environment, without the express written consent
 * of the Trivera Group, Inc.
 *
 * Copyright (c) 2020 The Trivera Group, LLC.
 * http://www.triveratech.com   http://www.triveragroup.com
 * </p>
 * @author The Trivera Group Tech Team.
 */

// Exercise 3: add any required imports
import com.opensymphony.xwork2.ActionSupport;

// Exercise 4: add any new required imports
import triveratunes.util.CD;
import triveratunes.util.SearchUtility;
import java.util.Collection;

public class SearchAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

    public String execute() throws Exception {

	    // Exercise 4: use search utility to get results
	    setResults(SearchUtility.search(keyword));
	
	    return SUCCESS;

	}
	
	private String keyword;
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	
    // Exercise 4: add getter and setter for results
    private Collection<CD> results;
    public Collection<CD> getResults() {
        return results;
    }
    public void setResults(Collection<CD> results) {
        this.results = results;
    }

}
