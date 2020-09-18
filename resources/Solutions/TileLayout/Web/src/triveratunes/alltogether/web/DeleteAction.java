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

import com.opensymphony.xwork2.ActionSupport;

import triveratunes.alltogether.util.dao.AlbumDAO;
import triveratunes.alltogether.util.dao.DAOFactory;

public class DeleteAction extends ActionSupport {

    private static final long serialVersionUID = 1L;

    public String execute() throws Exception {

        // Obtain a default DAOFactory
        DAOFactory factory = DAOFactory.getDefaultfactory();
        
        // Obtain a AlbumDAO
        AlbumDAO dao = factory.getAlbumDAO();
        
        // Use the AlbumDao to delete this cd
        dao.deleteAlbum(id);

        // Use the AlbumDao to delete this cd
        return SUCCESS;

    }

    // Setup incoming variables
    private String id;
    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }

}
