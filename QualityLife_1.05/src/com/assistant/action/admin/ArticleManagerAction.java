package com.assistant.action.admin;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import javax.annotation.Resource;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import org.springframework.stereotype.Component;

import com.assistant.model.Article;
import com.assistant.service.IArticleService;
import com.assistant.service.ITabooService;
import com.opensymphony.xwork2.ActionSupport;

/*
 * 此类实现对用户的增、删、改、查
 */

@SuppressWarnings("serial")
@Component
public class ArticleManagerAction extends ActionSupport {

	private int id;
	private int type;//1:article(changshi)  2:zhiliao // 3:taboo
	private IArticleService articleService;
	private ITabooService tabooService;
	private List<Article> articles;
	private Article article;
	
	private File myFile;//得到文件
	private String myFileContentType;// 得到文件的类型
	private String myFileFileName;// 得到文件的名称
	
	public String list() {
		//this.articles = this.articleService.getAllArticles(pageNo, pageSize);
		this.articles = this.articleService.getAllArticles();
		return "list";
	}
	public String addarticle() throws Exception{
		if(myFile!=null){
			String RealPath = ServletActionContext.getServletContext().getRealPath("/images");
			File file = new File(RealPath);
			if(!file.exists()){
				file.mkdirs();
			}
			FileUtils.copyFile(myFile, new File(file,myFileFileName));
			String path=RealPath+"/"+myFileFileName;
			ServletActionContext.getRequest().setAttribute("realpath",path);
			String ralativePath = "images/"+myFileFileName;
			this.article.setImageurl(ralativePath);
		}
		String date=new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
		article.setDate(date);
		article.setType(type);
		article.setEditor("admin");
		articleService.saveArticle(article);
		return "list";
	}
	/** 管理员删除用户信息*/
	public String delete(){
		articleService.deleteArticleById(id);
		return "list";
	}
	/** 管理员更新文章信息*/
	public String update() throws Exception{
//		Article a = articleService.getArticleById(article.getId());
		if(myFile!=null){
			String RealPath = ServletActionContext.getServletContext().getRealPath("/images");
			File file = new File(RealPath);
			if(!file.exists()){
				file.mkdirs();
			}
			FileUtils.copyFile(myFile, new File(file,myFileFileName));
			String path=RealPath+"/"+myFileFileName;
			ServletActionContext.getRequest().setAttribute("realpath",path);
			String ralativePath = "images/"+myFileFileName;
			this.article.setImageurl(ralativePath);
		}
//		a.setTitle(article.getTitle());
//		a.setContent(article.getContent());
		String date=new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
		article.setDate(date);
		article.setType(type);
		articleService.updateArticle(article);
		return "list";
	}
	public String updateInput(){
		this.article = articleService.getArticleById(id);
		return "input";
	}

	public String load(){
		this.article = articleService.getArticleById(id);
		return "load";
	}
	
	public String addinput(){
		return "addinput";
	}
	
	/*
	 * 以下方法都是geters与seters
	 */
	
	public List<Article> getArticles() {
		return articles;
	}
	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}	

	public Article getArticle() {
		return article;
	}
	public void setArticle(Article article) {
		this.article = article;
	}
	public IArticleService getArticleService() {
		return articleService;
	}
	@Resource
	public void setArticleService(IArticleService articleService) {
		this.articleService = articleService;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public File getMyFile() {
		return myFile;
	}
	public void setMyFile(File myFile) {
		this.myFile = myFile;
	}
	public String getMyFileContentType() {
		return myFileContentType;
	}
	public void setMyFileContentType(String myFileContentType) {
		this.myFileContentType = myFileContentType;
	}
	public String getMyFileFileName() {
		return myFileFileName;
	}
	public void setMyFileFileName(String myFileFileName) {
		this.myFileFileName = myFileFileName;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public ITabooService getTabooService() {
		return tabooService;
	}
	@Resource
	public void setTabooService(ITabooService tabooService) {
		this.tabooService = tabooService;
	}
	
}
