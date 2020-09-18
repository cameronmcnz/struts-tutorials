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

import triveratunes.alltogether.util.WebVOMapper;
import triveratunes.alltogether.util.AlbumVO;
import triveratunes.alltogether.util.dao.AlbumDAO;
import triveratunes.alltogether.util.dao.DAOFactory;
import triveratunes.alltogether.util.CDVO;

public class UpdateAction extends ActionSupport {

    private static final long serialVersionUID = 1L;

    public String execute() throws Exception {

        // Obtain the default DAOFactory
        DAOFactory factory = DAOFactory.getDefaultfactory();
        
        // Obtain the AlbumDAO
        AlbumDAO cdDAO = factory.getAlbumDAO();
        
        // use the WebVOMapper to map the CDVO to an AlbumVO
        AlbumVO album = WebVOMapper.CD2Album(getCd());
        
        // Update the Album
        cdDAO.updateAlbum(album);

        // Return appropriate result
        return SUCCESS;

    }

    // Setup variable for cd
    private CDVO cd;
    public void setCd(CDVO cd) {
        this.cd = cd;
    }
    public CDVO getCd() {
        return this.cd;
    }

}
