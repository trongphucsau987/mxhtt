<%-- 
    Document   : header
    Created on : Jul 24, 2022, 1:10:04 PM
    Author     : admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<nav class="navbar navbar-expand-sm navbar-dark bg-blue">
    <div class="container-fluid">
        <a class="navbar-brand" href="javascript:void(0)">Mxhtt</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#mynavbar">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="mynavbar">
            <ul class="navbar-nav me-auto">
                <li class="nav-item">
                    <a class="nav-link" href="javascript:void(0)">Trang chủ</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="javascript:void(0)">Đấu giá</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="javascript:void(0)">Thông báo</a>
                </li>
            </ul>
            <form class="d-flex">
                <input class="form-control me-2" type="text" placeholder="Search">
                <button class="btn btn-primary" type="button">Search</button>
            </form>
            <sec:authorize access="!isAuthenticated()">
                <li class="nav-item">
                    <a class="nav-link text-info" href="<c:url value="/login" />">Dang nhap</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link text-info" href="<c:url value="/" />">Dang ky</a>
                </li>
            </sec:authorize>
            <sec:authorize access="isAuthenticated()">
                <li class="nav-item">
                    <a class="nav-link text-danger" href="<c:url value="/login" />">
                        ${pageContext.session.getAttribute("currentUser").firstName}
                        ${pageContext.session.getAttribute("currentUser").lastName}
                        (<sec:authentication property="principal.username" />)
                    </a>
                </li>
                <li class="nav-item">
                    <a class="nav-link text-danger" href="<c:url value="/logout" />">Dang xuat</a>
                </li>
            </sec:authorize>
                <c:url value="/" var="action" />
            <form action="${action}" class="d-flex">
                <input class="form-control me-2" type="text" name="kw" placeholder="Nhap tu khoa...">
                <button type="submit" class="btn btn-primary" type="button">Tim</button>
            </form>
        </div>
    </div>
</nav>