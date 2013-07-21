<%@ tag body-content="scriptless"%>
<%@ taglib prefix="counter" uri="http://bizonos.com/counter" %>

<counter:set var="children" namespace="counter">
	<jsp:doBody var="output"/>
</counter:set>

<div class="panel-container">
	<div>This panel has <span>${children}</span> chlidren</div>
	${output}
</div>