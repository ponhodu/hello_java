<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<div class="border-end bg-white" id="sidebar-wrapper">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<%
		String id = (String) session.getAttribute("id");
	%>
	<c:choose>
		<c:when test="${id != null }">
                <div class="sidebar-heading border-bottom bg-light"><%=id %></div>
    	</c:when>
    	<c:otherwise>
     			<div class="sidebar-heading border-bottom bg-light">μλ</div>
    	</c:otherwise>
    </c:choose>
    		            
                <div class="list-group list-group-flush">
                    <a class="list-group-item list-group-item-action list-group-item-light p-3" href="bulletin.do">π κ²μν</a>
                    <a class="list-group-item list-group-item-action list-group-item-light p-3" href="writeBoardForm.do">π κΈλ±λ‘</a>
                    <a class="list-group-item list-group-item-action list-group-item-light p-3" href="signUpForm.do">πββοΈνμκ°μ</a>
                    <a class="list-group-item list-group-item-action list-group-item-light p-3" href="memberList.do">βπ©βπ§βπ¦νμλͺ©λ‘</a>
                    <a class="list-group-item list-group-item-action list-group-item-light p-3" href="signInForm.do">πββοΈλ‘κ·ΈμΈ</a>
                    <a class="list-group-item list-group-item-action list-group-item-light p-3" href="signOut.do">π§λ‘κ·Έμμ</a>
                    
                 </div>
            </div>