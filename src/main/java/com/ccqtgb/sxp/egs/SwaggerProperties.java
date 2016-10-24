package com.ccqtgb.sxp.egs;

import org.springframework.boot.context.properties.ConfigurationProperties;
 
@ConfigurationProperties(prefix="sxp.egs.swagger",locations="classpath:swagger.yml")
public class SwaggerProperties {
	private String group;
	private String pathMapping;
	private String regexUrl;
	private String basePackage;
	private String title;
	private String description;
	private String termsOfServiceUrl;
	private String name;
	private String url;
	private String email;
	private String author;
	private String version;
	private String license;
	private String licenseUrl;
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	public String getPathMapping() {
		return pathMapping;
	}
	public void setPathMapping(String pathMapping) {
		this.pathMapping = pathMapping;
	}
	public String getRegexUrl() {
		return regexUrl;
	}
	public void setRegexUrl(String regexUrl) {
		this.regexUrl = regexUrl;
	}
 
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getTermsOfServiceUrl() {
		return termsOfServiceUrl;
	}
	public void setTermsOfServiceUrl(String termsOfServiceUrl) {
		this.termsOfServiceUrl = termsOfServiceUrl;
	}
 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLicense() {
		return license;
	}
	public void setLicense(String license) {
		this.license = license;
	}
	public String getLicenseUrl() {
		return licenseUrl;
	}
	public void setLicenseUrl(String licenseUrl) {
		this.licenseUrl = licenseUrl;
	}
	public String getBasePackage() {
		return basePackage;
	}
	public void setBasePackage(String basePackage) {
		this.basePackage = basePackage;
	}
	 
}
