<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=UTF-8"%>
<html>
	<head>
		<link href="./resources/css/custom.css" rel="stylesheet" type="text/css">
		<title>Log Report</title>
	</head>
	<body>
		<div id="HeaderContent">
			<div id="Header"></div>
			<div id="TopNav"></div>
		</div>
		<div id="PageContainer">
			<div id="ContainerWrapper">
				<c:if test="${not empty applications.domainList }">
					<c:forEach var="domainList" items="${applications.domainList}" varStatus="loop">
						<div class="section">
							<div id="Application_${loop_index}" class="sectionHeader">
								${domainList.getName}
							</div>
							<div class="sectionContent">
								Redondas
							</div>
						</div>
					</c:forEach>
				</c:if>
			</div>
		</div>
	</body>
</html>