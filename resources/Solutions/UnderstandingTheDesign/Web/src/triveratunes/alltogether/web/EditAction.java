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
import triveratunes.alltogether.util.dao.CategoryDAO;
import triveratunes.alltogether.util.dao.DAOFactory;
import triveratunes.alltogether.util.CDVO;

import java.util.Collection;

public class EditAction extends ActionSupport {

    private static final long serialVersionUID = 1L;

    public String execute() throws Exception {

        // TODO Obtain a default DAOFactory

        // TODO Obtain a AlbumDAO

        // TODO Retrieve the requested Album

        // TODO Use the WebVOMapper to map the Value Object into a CDVO

        // TODO Check to see if the categories have been loaded previously

            // TODO Obtain the CategoryDAO

            // TODO Retrieve a Collection of categories



        // TODO Return appropriate result
        return null;

    }

    // TODO Setup variables for id, categories, and cd

}