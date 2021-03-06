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
import triveratunes.alltogether.util.CDVO;
import triveratunes.alltogether.util.Category;
import triveratunes.alltogether.util.WebVOMapper;
import triveratunes.alltogether.util.dao.AlbumDAO;
import triveratunes.alltogether.util.dao.CategoryDAO;
import triveratunes.alltogether.util.dao.DAOFactory;

import com.opensymphony.xwork2.ActionSupport;

public class EditAction extends ActionSupport {

    private static final long serialVersionUID = 1L;

    public String execute() throws Exception {

        // Obtain a default DAOFactory
        DAOFactory factory = DAOFactory.getDefaultfactory();
        
        // Obtain a AlbumDAO
        AlbumDAO dao = factory.getAlbumDAO();
        
        // Retrieve the requested Album
        AlbumVO album = dao.getAlbum(id);
        
        // Use the WebVOMapper to map the Value Object into a CDVO
        setCd(WebVOMapper.Album2CD(album));
        
        // Check to see if the categories have been loaded previously
        if (getCategories() == null) {
        	
            // Obtain the CategoryDAO
            CategoryDAO categoryDAO = factory.getCategoryDAO();
            
            // Retrieve a Collection of categories
            setCategories(categoryDAO.getAllCategories());
        }

        // Return appropriate result
        return SUCCESS;

    }

    // Setup variables for id, categories, and cd
    private String id;
    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return this.id;
    }

    private Collection<Category> categories;
    public void setCategories(Collection<Category> categories) {
        this.categories = categories;
    }
    public Collection<Category> getCategories() {
        return categories;
    }

    private CDVO cd;
    public void setCd(CDVO cd) {
        this.cd = cd;
    }
    public CDVO getCd() {
        return cd;
    }

}