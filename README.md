# Servelt-and-JSP

This repository is for practice of Servlet and jsp.
　  
　  
###html sample   
/WebContent/hello.html  
　  
###jsp sample
/WebContent/sample.jsp  
　  
###form sample
/WebContent/formSample.jsp and /src/servlet/FormServlet.java  
　  
###forward sample
/WebContent/WEB-INF/jsp/forward.jsp and /src/servlet/ForwardServlet.java  
　  
###redirect sample
/src/servlet/RedirectServlet.java  
　  
##HealthCheckApp used "request scope" (try access to HealthCheck for execute)  
/src/model/Health.java  
/src/model/HealthCheckLogic.java  
/src/servlet/HealthCheck.java  
/WebContent/WEB-INF/jsp/healthCheck.jsp  
/WebContent/WEB-INF/jsp/healthCheckResult.jsp  
　  
##RegisterUserApp used "session scope" (try access to RegisterUser for execute)  
/src/model/User.java  
/src/model/RegisterUserLogic.java  
/src/servlet/RegisterUser.java  
/WebContent/WEB-INF/jsp/registerForm.jsp  
/WebContent/WEB-INF/jsp/registerConfirm.jsp
/WebContent/WEB-INF/jsp/registerDone.jsp  
　  
##SiteEvaluationApp used "application scope" (try access to SiteIndex for execute)  
/src/model/SiteEV.java  
/src/model/SiteEVLogic.java  
/src/servlet/SiteIndex.java  
/WebContent/WEB-INF/jsp/Index.jsp 
