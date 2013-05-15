package com.assistant.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.assistant.model.Article;
import com.assistant.model.Consult;
import com.assistant.model.Dietian;
import com.assistant.model.User;
import com.assistant.service.IAdviceMenuService;
import com.assistant.service.IArticleService;
import com.assistant.service.ICommenService;
import com.assistant.service.IConsultService;
import com.assistant.service.IDietianAdviceService;
import com.assistant.service.IDietianService;
import com.assistant.service.IUserService;
import com.assistant.util.PageBean;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class DietianAction extends ActionSupport {

	private IConsultService consultService;
	private IDietianService dietianService;
	private IUserService userService;
	private IAdviceMenuService adviceMenuService;
	private ICommenService commenService;
	private IDietianAdviceService dietianAdviceService;
	private IArticleService articleService;
	
	private Dietian dietian;
	private PageBean dietian_list;
	private User user;
	private Consult consult;
	private Article article;
	private int id;
	private int page;
	
	private String message;
	private List<String> d_messages = new ArrayList<String>();
	private List<String> messages = new ArrayList<String>();
	/**------------------------------------------------------------------------------*/
	public String main(){
		dietian = dietianService.getDietianById(id);
		Map<String, Object> session = ActionContext.getContext().getSession();
		session.put("dietian",dietian);
		setDietian_list(dietianService.queryForPage(5, page));
		return SUCCESS;
	}
	
	
	public String send(){
		System.out.println("id:"+id);
		dietian = dietianService.getDietianById(id);
		if(message!=null){
//			message = dietian.getName()+":"+message;
			message = "dietian"+":"+message;
			messages.add(message);
			return "message";
		}
		else{
			this.addFieldError("input_error", "发送内容不能为空！");
			return "input_message";
		}
	}
	/**------------------------------------------------------------------------------*/
	public IConsultService getConsultService() {
		return consultService;
	}
	@Resource
	public void setConsultService(IConsultService consultService) {
		this.consultService = consultService;
	}
	public IUserService getUserService() {
		return userService;
	}
	@Resource
	public void setUserService(IUserService userService) {
		this.userService = userService;
	}
	public IAdviceMenuService getAdviceMenuService() {
		return adviceMenuService;
	}
	@Resource
	public void setAdviceMenuService(IAdviceMenuService adviceMenuService) {
		this.adviceMenuService = adviceMenuService;
	}
	public ICommenService getCommenService() {
		return commenService;
	}
	@Resource
	public void setCommenService(ICommenService commenService) {
		this.commenService = commenService;
	}
	public IDietianService getDietianService() {
		return dietianService;
	}
	@Resource
	public void setDietianService(IDietianService dietianService) {
		this.dietianService = dietianService;
	}
	public IDietianAdviceService getDietianAdviceService() {
		return dietianAdviceService;
	}
	@Resource
	public void setDietianAdviceService(IDietianAdviceService dietianAdviceService) {
		this.dietianAdviceService = dietianAdviceService;
	}
	public IArticleService getArticleService() {
		return articleService;
	}
	@Resource
	public void setArticleService(IArticleService articleService) {
		this.articleService = articleService;
	}
	public Dietian getDietian() {
		return dietian;
	}
	public void setDietian(Dietian dietian) {
		this.dietian = dietian;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Consult getConsult() {
		return consult;
	}
	public void setConsult(Consult consult) {
		this.consult = consult;
	}
	public Article getArticle() {
		return article;
	}
	public void setArticle(Article article) {
		this.article = article;
	}
	public List<String> getD_messages() {
		return d_messages;
	}
	public void setD_messages(List<String> d_messages) {
		this.d_messages = d_messages;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<String> getMessages() {
		return messages;
	}
	public void setMessages(List<String> messages) {
		this.messages = messages;
	}


	public PageBean getDietian_list() {
		return dietian_list;
	}


	public void setDietian_list(PageBean dietian_list) {
		this.dietian_list = dietian_list;
	}
}
