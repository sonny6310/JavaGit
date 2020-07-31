package com.org.cloud;

public class CloudDTO {
	private String id;
	private String title;
	private String content;
	private String filename;
	private String filesize;

	public CloudDTO(String id, String title, String content, String filename, String filesize) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.filename = filename;
		this.filesize = filesize;
	}

	public CloudDTO() {

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getFilesize() {
		return filesize;
	}

	public void setFilesize(String filesize) {
		this.filesize = filesize;
	}
}
