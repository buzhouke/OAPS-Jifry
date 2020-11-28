package com.javaBeans;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.dsna.util.images.ValidateCode;

public class validateController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//����Ϊͼ��ģʽ
        response.setContentType("image/jpeg");
        //��ֹͼ�񻺴档
        response.setHeader("Pragma", "no-cache");
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expires", 0);
        //180�ߣ�40��5�����֣�50������
        ValidateCode verifyCode = new ValidateCode(100,30,4,50);
        verifyCode.write(response.getOutputStream());

        System.out.println("��֤��Ϊ��"+verifyCode.getCode());
        //����֤�뱣����session��
        request.getSession().setAttribute("verifyCodeValue", verifyCode.getCode());
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
