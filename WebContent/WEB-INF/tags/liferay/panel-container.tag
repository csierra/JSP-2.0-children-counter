<%@ tag body-content="scriptless"%>
<%@ taglib prefix="counter" uri="http://bizonos.com/counter" %>

<counter:set var="hijos" namespace="counter">
	<jsp:doBody var="salida"/>
</counter:set>

<div class="panel-container">
	<div>Este panel tiene <span>${hijos}</span> hijos</div>
	${salida}
</div>