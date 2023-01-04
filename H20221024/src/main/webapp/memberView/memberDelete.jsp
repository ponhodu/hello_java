<%@page import="co.edu.vo.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 삭제 페이지</title>
</head>
<body>
	<h3>회원 조회</h3>
	<form action="./memberSearch.do" method="post">
		<input type="hidden" name="job" value="delete">
		ID : <input type="text" name="id"><br>
		<input type="submit" value="조회">
	</form>
	
	<h3>회원정보 삭제</h3>
	<%
		MemberVO result = (MemberVO) request.getAttribute("memberInfo");
		String id = (String) session.getAttribute("id");
	%>
	<%if (result!= null) { %>
		<form action ="./memberRemove.do" method = "post">
			ID : <input type = "text" name="id" value="<%=result.getId()%>" readonly><br>
			<%if(id.equals(result.getId())) { %>
				<input type="submit" value="삭제">
			<%} %>
			<!-- 수정을 누르면 memberRemove.do로 이동 -->
		</form>
	<%} else { %>
		<p>조회된 결과가 없습니다!</p>
	<%} %>
	
	
</body>
</html>