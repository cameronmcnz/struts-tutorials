package triveratunes.alltogether.web;

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

import java.util.Collection;

import triveratunes.alltogether.util.AlbumVO;
import triveratunes.alltogether.util.dao.AlbumDAO;
import triveratunes.alltogether.util.dao.DAOFactory;

import com.opensymphony.xwork2.ActionSupport;

public class SearchAction extends ActionSupport {

    private static final long serialVersionUID = 1L;

    public String execute() throws Exception {

        // Obtain a default DAOFactory
        DAOFactory factory = DAOFactory.getDefaultfactory();
        
        // Obtain a AlbumDAO
        AlbumDAO dao = factory.getAlbumDAO();
        
        // Obtain a Collection fo CD's
        setResults(dao.searchAlbums(keyword));

        // Return appropriate result
        return SUCCESS;

    }

    // Setup variables to hold the keyword and the results
    private String keyword;
    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }
    public String getKeyword() {
        return this.keyword;
    }

    private Collection<AlbumVO> results;
    public void setResults(Collection<AlbumVO> results) {
        this.results = results;
    }
    public Collection<AlbumVO> getResults() {
        return this.results;
    }

}
