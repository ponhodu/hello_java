package co.edu.control;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.edu.common.Command;

//모든 호출의 시작과 끝 - 모든 요청을 frontConroller통해서 오게끔, web.xml에서 그걸 설정한다.

public class FrontController extends HttpServlet { 
	
	Map<String, Command> control = new HashMap<>();
	@Override
	public void init() throws ServletException {
		control.put("/main.do", new Maincontrol());
		control.put("/memberAddForm.do", new MemberAddForm());
		control.put("/memberAdd.do", new MemberAddControl()); //
		control.put("/memberModifyForm.do", new MemberModifyForm());
		control.put("/memberModify.do", new MemberModify());
		
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String url = req.getRequestURI();
		String contextPath = req.getContextPath();
		String path = url.substring(contextPath.length());
		
		Command command = control.get(path);
		command.exec(req, resp);
	}
	
	
	
}
