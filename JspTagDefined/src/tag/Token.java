package tag;

import java.io.IOException;
import java.util.Random;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class Token extends SimpleTagSupport {

	@Override
	public void doTag() throws JspException, IOException {
		//使用随机数模拟token
		String token = (System.currentTimeMillis() + new Random().nextInt(999999999)) + "";
		//放到session中，方便登录校验
		((PageContext) this.getJspContext()).getSession().setAttribute("token", token);
		//写到隐藏的input里面
		JspWriter out = ((PageContext) this.getJspContext()).getOut();
		out.print("<input type='hidden' value=" + token + "></input>");
		out.print("你的token为：" + token);
	}

}
