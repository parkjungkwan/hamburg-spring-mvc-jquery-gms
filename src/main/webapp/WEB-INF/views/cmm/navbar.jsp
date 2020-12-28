<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<div class="collapse navbar-collapse">
     <ul class="nav navbar-nav navbar-right">
         <li class="active"><a class="move-home" href="#">Home</a></li>
         <li class="dropdown"><a href="#">Pages <i class="fa fa-angle-down"></i></a>
             <ul role="menu" class="sub-menu">
                 <li><a href="#">About</a></li>
                 <li><a href="#">About 2</a></li>
             </ul>
         </li>                  
         <li id="bbs" class="dropdown"></li>
         <li class="dropdown"><a href="portfolio.html">Portfolio <i class="fa fa-angle-down"></i></a>
             <ul role="menu" class="sub-menu">
                 <li><a href="#">Portfolio Default</a></li>
                 <li><a href="#">Isotope 3 Columns + Right Sidebar</a></li>
             </ul>
         </li>                         
         <li><a id="manager_register" href="#">Manager</a></li>     
         <li><a id="teacher_register" href="#">Teacher</a></li>               
     </ul>
 </div>
 <script>
 navbar.init()
 </script>