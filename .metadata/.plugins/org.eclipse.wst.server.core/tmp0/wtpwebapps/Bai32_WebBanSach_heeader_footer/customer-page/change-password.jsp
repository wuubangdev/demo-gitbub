<%@page import="model.Customer"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Thay đổi mật khẩu</title>
</head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js">
	
</script>
<body>
	<%
	String url = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
	+ request.getContextPath();
	String err = request.getAttribute("err") + "";
	err = (err.equals("null"))?"": err;
	Customer customer = (Customer) session.getAttribute("customer");
	%>
	
	<%
	if (customer == null) {
	%>
		<h3>
			Bạn cần <a href="<%=url%>/customer-page/login.jsp">đăng nhập</a> để thực hiện chức năng này, quay về <a href="<%=url%>/index.jsp">trang chủ</a>
		</h3>
	<%
		} else {
	%>
	<main class="form-signin" style="width: 720px; margin: auto; padding-top: 64px; text-align: center;">
		<form class="regisForm" action="<%=url %>/customer-controller" method="post">
			<input type="hidden" name="activity" value="changePass">
			<div style="width: 100%;">
				<h1 class="h3 mb-3 fw-bold text-warning">Đổi mật khẩu</h1>
				<h5 class="text-primary"> Xin chào, <%=customer.getCustomerName()%>! Vui lòng nhập thông tin vào bên dưới.</h5>
			</div>
			<span style="font-style: italic; color: red"><%=err%></span>
			<div class="form-floating">
				<input type="password" class="form-control" id="passwordOld"
					name="passwordOld" required> <label for="passwordOld">Mật
					khẩu cũ:</label>
			</div>
			<div class="form-floating mt-2">
				<input type="password" class="form-control" id="passwordNew"
					name="passwordNew" required> <label for="passwordNew">Mật
					khẩu mới:</label>
			</div>
			<div class="form-floating my-2">
				<input type="password" class="form-control" id="passwordReNew"
					name="passwordReNew" required> <label for="passwordReNew">Nhập
					lại mật khẩu mới:</label>
			</div>
			<button class="btn btn-primary w-100 py-2" type="submit">Đổi
				mật khẩu</button>
		</form>
	</main>
	<%
	}
	%>
</body>
</html>