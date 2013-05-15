package com.assistant.action;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.assistant.model.User;
import com.assistant.service.ITabooService;
import com.assistant.service.IUserService;
import com.assistant.util.PageBean;
import com.assistant.vo.RegisterInfo;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@SuppressWarnings({ "serial", "rawtypes" })
@Component
@Scope("prototype")
public class RegisterAction extends ActionSupport implements ModelDriven {

	private RegisterInfo registerInfo  = new RegisterInfo();
	private IUserService userService;
	private ITabooService tabooService;

	private PageBean pageBean_taboo;
	private User user = new User();
	private int page;
	private int id;

	@Override
	public String execute() throws Exception {
	
		/**没输入任何信息是将返回输入*/
		if(registerInfo == null){
			return INPUT;
		}
//		user = new User();
		user.setName(registerInfo.getName());
		user.setPassword(registerInfo.getPassword());
		user.setAge(registerInfo.getAge());
		user.setInfo_complete(0);
		//user.setBingshi(1);
		//user.setGuomin(guomin)
		/**保存用户*/
		userService.saveUser(user);
		user = userService.getUserByName(registerInfo.getName());
		id = user.getId();
//		Map<String, Object> session = ActionContext.getContext().getSession();
//		session.put("userName",rInfo.getName());
//		u = userService.getUserByName(rInfo.getName());
//		pageBean_taboo = tabooService.queryForPage(6, page);
		return SUCCESS;
	}

	public IUserService getUserService() {
		return userService;
	}

	@Resource
	public void setUserService(IUserService userService) {
		this.userService = userService;
	}
	public RegisterInfo getRegisterInfo() {
		return registerInfo;
	}

	public void setRegisterInfo(RegisterInfo registerInfo) {
		this.registerInfo = registerInfo;
	}

	public ITabooService getTabooService() {
		return tabooService;
	}

	@Resource
	public void setTabooService(ITabooService tabooService) {
		this.tabooService = tabooService;
	}

	public PageBean getPageBean_taboo() {
		return pageBean_taboo;
	}

	public void setPageBean_taboo(PageBean pageBean_taboo) {
		this.pageBean_taboo = pageBean_taboo;
	}
	

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	@Override
	public Object getModel() {
		// TODO Auto-generated method stub
		return registerInfo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
