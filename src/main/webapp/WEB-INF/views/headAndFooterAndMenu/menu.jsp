<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
       <div class="text-muted">
        <nav>
          <ul class="nav nav-pills pull-right">
            <li role="presentation" class="active"><a href="<c:url value="/loged/pozycjonowanie-seo" />">Pozycjonowanie SEO</a></li>
            <li role="presentation"><a href="<c:url value="/loged/projektowanie-stron-www"/> ">Projektowanie Stron WWW</a></li>
            <li class="dropdown"> 
              <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Oferta <span class="caret"></span></a>
	          <ul class="dropdown-menu">
	            <li><a href="<c:url value="/loged/projektowanie-stron-www" /> ">Projektowanie Stron WWW</a></li>
	            <li><a href="<c:url value="/loged/pozycjonowanie-seo" /> ">Pozycjonowanie SEO</a></li>
	            <li><a href="<c:url value="/sklepy-internetowe" /> ">Sklepy internetowe</a></li>
	            <li role="separator" class="divider"></li>
	            <li><a href="<c:url value="/social-media" /> ">Social media</a></li>
	          </ul>
	        </li>
            <li role="presentation"><a href='<c:url value="/kontakt"/> '>Kontakt</a></li>
            
            <c:if test="${pageContext.request.userPrincipal.name == null}">
                <li role="presentation"><a href="<c:url value="/users/new"/>">Rejestracja</a></li>
                <li role="presentation"><a href="login">Logowanie</a></li>
            </c:if>
            
			<sec:authorize access="hasRole('ROLE_USER')">
				<!-- For login user -->
				<c:url value="/j_spring_security_logout" var="logoutUrl" />
				<form action="${logoutUrl}" method="post" id="logoutForm">
					<input type="hidden" name="${_csrf.parameterName}"
						value="${_csrf.token}" />
				</form>
				<script>
					function formSubmit() {
						document.getElementById("logoutForm").submit();
					}
				</script>
		
				<c:if test="${pageContext.request.userPrincipal.name != null}">
					<h5>
						User : ${pageContext.request.userPrincipal.name} | <a
							href="javascript:formSubmit()"> Logout</a>
					</h5>
				</c:if>
			</sec:authorize>
          </ul>
        </nav> 
      </div>