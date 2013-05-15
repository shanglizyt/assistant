package com.assistant.action;

public class TempCode {

/**start:from CommenAction（聊天窗口代码，视图资源：chat_window）---------------------------------------------------*/
	
	/*private String msg;
//	private List<String> messages = new ArrayList<String>();
	private Message message = new Message();
	private List<Message> messages;
	private int flag;//表示是否有信息
*/
	
//	public String articleList(){
//	pageBean_article = articleService.queryForPage(10, page);
//	return "article";
//}

/*@SuppressWarnings("unchecked")
public String send(){
//	System.out.println("into send。。。");
	//application = ActionContext.getContext().getApplication();
//	messages = (List<Message>) application.get("messages");
	messages = (List<Message>) session.get("messages");
	if(messages==null){
		messages = new ArrayList<Message>();
	}
	//Iterator<User> it = users.iterator();
	if(msg!=null){
		if(type.equals("u")){
			//user = userService.getUserById(id);
			message = new Message();
			message.setContent(msg);
			message.setName("user");
			message.setDate(new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime()));
			messages.add(message);
//			application.put("messages", messages);
			session.put("messages", messages);
			flag = 1;
//			return "u_send";
			return SUCCESS;
		}else{
			//dietian = dietianService.getDietianById(id);
			message = new Message();
			message.setContent(msg);
			message.setName("dietian");
			message.setDate(new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime()));
			messages.add(message);
//			application.put("messages", messages);
			session.put("messages", messages);
			flag = 1;
//			return "d_send";
			return SUCCESS;
		}
	}
	else{
		//this.addFieldError("input_error", "发送内容不能为空！");
		return INPUT;
	}
}

@SuppressWarnings("unchecked")
public String messages(){
//	System.out.println("into load。。。");
	//application = ActionContext.getContext().getApplication();
	messages = (List<Message>) session.get("messages");
//	messages = (List<Message>) application.get("messages");
//	System.out.println("load-messages:"+messages);
//	return "messages";
	return SUCCESS;
}
*//**用以判断是否有新的信息*//*
public String reload(){
//	System.out.println("into reload。。。");
	if(flag == 1){
		flag = 0;
//		return "reload";
		return SUCCESS;
	}
	else return "stay";
}*/

/*@SuppressWarnings("unchecked")
public String thread(){
	while(true){
		System.out.println("search liuyan called");
		List<LiuYan> lys = (List<LiuYan>) commenService.getAllObjects(new LiuYan());
		if(lys.size()>3){
			return "thread";
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		continue;
	}
}*/
/**end:from CommenAction（聊天窗口代码，视图资源：chat_window）---------------------------------------------------*/
	
	
	
}
