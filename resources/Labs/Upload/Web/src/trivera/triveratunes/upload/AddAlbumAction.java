package trivera.triveratunes.upload;

import com.opensymphony.xwork2.*;

// TODO add any additional imports required




/**
 * <p>
 * This component and its source code representation are copyright protected
 * and proprietary to The Trivera Group, Inc., U.S.A.
 *
 * This component and source code may be used for instructional and
 * evaluation purposes only. No part of this component or its source code
 * may be sold, transferred, or publicly posted, nor may it be used in a
 * commercial or production environment, without the express written consent
 * of the Trivera Group, Inc.
 *
 * Copyright (c) 2020 The Trivera Group, Inc.
 * http://www.triveratech.com   http://www.triveragroup.com
 * </p>
 * @author The Trivera Group Tech Team.
 */

public class AddAlbumAction extends ActionSupport {
	
	private static final long serialVersionUID = 1L;
	
	// TODO declare appropriate exception
	public String execute() {

		// Note that The MultiPartRequestWrapper will automatically
		// enforce size limits and content type restrictions
		// (specified in the s:file tag or struts.properties),
		// redisplaying NewAlbum.jsp via INPUT. We don't get here
		// unless the upload to the temp folder was successful, so
		// we could just let the display page handle it, but
		// we will handle capturing the files here.

		// get the input values
		String inName = getCdimageFileName();
		String inType = getCdimageContentType();
		File   inFile = getCdimage();

		// TODO verify cdImage is not valid. Throw an exception if not. 


		
		
		// TODO set the name to save to. In the real world,
		//              we would probably save to a databaseblob column.
		String fullFileName = null;		// use "C:\\Temp\\MPU\\" for the path
		
		// TODO (optional) enforce a more restrictive size limit here (CD529.gif 
		//              would fail a 3K limit test). 


		
		
		
		// TODO (optional) Arbitrarily ban a specific name ("CD530.gif")


		
		
		// TODO (optional) Arbitrarily throw an exception for a specific name
		//              (use "throwExceptionFromAction.gif")


		
		
		// Note: Assuming struts.properties specifies a size limit of 10K (which will 
		//       catch jamming.gif), if all three of the above tests are coded, 
		//       only CD528.gif should get through.

		// TODO if any errors were found, redisplay the form


		
		
		File destFile = null;

		// TODO save the uploaded file. You may use a traditional stream copy
		//              or use the FileUtils copyFile() method (org.apache.commons.io). 
		//              Exceptions could be rethrown, or handled as field errors.
		try {
			
			// TODO create a new (empty) File object having that name


			// TODO copy the file to the destination, preserving its date

			
		} catch (Exception e) {
			
			// TODO option 1 - throw an IOException to our error page


			
			// TODO option 2 - treat as an error


		}
		
		// all done. We need to pass displayImage the new File object, 
		// the name (location) of the copied file, or both.
		
		// TODO reset cdimage and dImageFileName to the new values 


		
		// TODO return result
		return null;

	}
	
	// TODO define getters and setters for cdimage and related parameters


	
	
	
	
	// TODO define getters and setters for other form fields


	
	
	
	
}
