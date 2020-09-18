package trivera.triveratunes.upload;

import com.opensymphony.xwork2.*;

// Exercise 12: add any additional imports required
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

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
	
	// Declare appropriate exception
	public String execute() throws IOException {

		// Note that The MultiPartRequestWrapper will automatically
		// enforce size limits and content type restrictions
		// (specified in the s:file tag or struts.properties),
		// redisplaying NewAlbum.jsp via INPUT. We don't get here
		// unless the upload to the temp folder was successful, so
		// we could just let the display page handle it, but
		// we will handle capturing the files here.

		// get the input values
		String inName = getCdimageFileName();
		File   inFile = getCdimage();

		// Verify cdImage is not valid. Throw an exception if not. 
		if (inFile == null || !(inFile.exists()) || inFile.length() == 0) {
			throw new IOException("The image file (cdImage) is null, does not exist, or is zero-length.");
		}

		// Set the name to save to. In the real world,
		//              we would probably save to a databaseblob column.
		String fullFileName = "C:\\Temp\\MPU\\" + inName;
		
		// (optional) enforce a more restrictive size limit here (CD529.gif 
		//              would fail a 3K limit test). 
		if (inFile.length() > (3*1024)) {
			this.addFieldError("cdimage","The file '" + inName + "'exceeds the maximum size " +
					"allowed by this application (3K).");
		}

		// (optional) Arbitrarily ban a specific name ("CD530.gif")
		if (inName.toLowerCase().equals("cd530.gif")) {
			this.addFieldError("cdimage","The file '" + inName + "' has been banned!");
		}
		
		// (optional) Arbitrarily throw an exception for a specific name
		//              (use "throwExceptionFromAction.gif")
		if (inName.equalsIgnoreCase("throwExceptionFromAction.gif")) {
			throw new IOException ("AddAlbumAction: testing exception mapping with '"+inName+"'.");
		}
		
		// Note: Assuming struts.properties specifies a size limit of 10K (which will 
		//       catch jamming.gif), if all three of the above tests are coded, 
		//       only CD528.gif should get through.

		// If any errors were found, redisplay the form
		if (this.hasFieldErrors()) {
			return INPUT;
		}

		File destFile = null;

		// Save the uploaded file. You may use a traditional stream copy
		//              or use the FileUtils copyFile() method (org.apache.commons.io). 
		//              Exceptions could be rethrown, or handled as field errors.
		try {
			
			// Create a new (empty) File object having that name
			destFile = new File(fullFileName);

			// Copy the file to the destination, preserving its date
			FileUtils.copyFile(inFile, destFile);
			
		} catch (Exception e) {
			
			// Option 1 - throw an IOException to our error page
			throw new IOException ( "AddAlbumAction: Error on FileUtils.copyFile() for '" + inName + 
									": " + e.getMessage() + ".");
			
			// Option 2 - treat as an error
			// this.addFieldError("cdimage","AddAlbumAction: Error on FileUtils.copyFile() for '"+inName+"'.");
			// return INPUT;
		}
		
		// all done. We need to pass displayImage the new File object, 
		// the name (location) of the copied file, or both.
		
		// Reset cdimage and dImageFileName to the new values 
		this.setCdimage(destFile);
		this.setCdimageFileName(fullFileName);
		
		// Return result
		return SUCCESS;

	}
	
	// Define getters and setters for cdimage and related parameters
	private File cdimage = null;
	public void setCdimage(File cdimage) {
		this.cdimage = cdimage;
	}
	public File getCdimage() {
		return this.cdimage;
	}

	private String cdimageFileName = null;
	public void setCdimageFileName(String cdimageFileName) {
		this.cdimageFileName = cdimageFileName;
	}
	public String getCdimageFileName() {
		return this.cdimageFileName;
	}

	private String cdimageContentType = null;
	public void setCdimageContentType(String cdimageContentType) {
		this.cdimageContentType = cdimageContentType;
	}
	public String getCdimageContentType() {
		return this.cdimageContentType;
	}
	
	// Define getters and setters for other form fields
	private String artist = null;
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getArtist() {
		return this.artist;
	}
	
	private String albumName = null;
	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}
	public String getAlbumName() {
		return this.albumName;
	}
	
	private String releaseYear = null;
	public void setReleaseYear(String releaseYear) {
		this.releaseYear = releaseYear;
	}
	public String getReleaseYear() {
		return this.releaseYear;
	}
	
}
