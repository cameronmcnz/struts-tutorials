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

// Add any required imports
import com.opensymphony.xwork2.ActionSupport;
import triveratunes.util.CD;
import triveratunes.util.SearchUtility;
import java.util.Collection;

public class SearchAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

    public String execute() throws Exception {

        // Define search field
    	String search = null;

		// If an keyword was entered, use it for the search
		// otherwise use the artist from the drop down.
		if (!keyword.equals("")) {
		    search = keyword;
		} else {
		    search = searchArtist;
		}
		  
		// Use utility to get results
		setResults(SearchUtility.search(search));
		
		return SUCCESS;

    }

    private String keyword;
    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }
    public String getKeyword() {
        return keyword;
    }

    // Add getter and setter for results
    private Collection<CD> results;
    public Collection<CD> getResults() {
        return results;
    }
    public void setResults(Collection<CD> results) {
        this.results = results;
    }

    // Add getter and setter for searchArtist
    private String searchArtist;

    public String getSearchArtist() {
  return searchArtist;
    }

    public void setSearchArtist(String searchArtist) {
  this.searchArtist = searchArtist;
    }


}
