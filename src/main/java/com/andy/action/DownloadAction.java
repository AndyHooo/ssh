package com.andy.action;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

@Results({ @Result(name = "success", type = "stream", params = { "contentType",
		"application/octet-stream", "contentDisposition",
		"attachment;filename=\"${fileName}\"", "inputName", "downloadFile",
		"bufferSize", "4096" }) })
public class DownloadAction {
	private String fileName;

	public InputStream getDownloadFile() throws Exception {
		fileName = new String("1.jpg".getBytes(), "ISO-8859-1");
		InputStream is = new FileInputStream("d:\\1.jpg");
		return is;
	}

	public String execute() {
		return "success";
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		try {
			this.fileName = new String(fileName.getBytes("ISO-8859-1"), "utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
}
