package com.mcnz.struts;

import java.io.File;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

@Action("/fileupload")
@Result(name = "success", location = "/results.jsp")
public class FileUploadAction extends ActionSupport {

	private File uploadedFile;
	private String uploadedFileName;
	public String getUploadedFileName() {
		return uploadedFileName;
	}

	private String localDirectory = "C:\\temp";

	public void setUploadedFile(File file) {
		uploadedFile = file;
	}

	public void setUploadedFileFileName(String name) {
		uploadedFileName = name;
	}

	public String execute() throws Exception {
		File localFile = new File(localDirectory, uploadedFileName);
		FileUtils.copyFile(uploadedFile, localFile);
		return SUCCESS;
	}
	
	  /* Used to obtain a file listing for JSP display. */
	  public Set<String> getFileList() {
	    return Stream.of(new File(localDirectory).listFiles())
	      .filter(file -> !file.isDirectory())
	      .map(File::getName)
	      .collect(Collectors.toSet());
	  }

}
