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
         <li id="manager" class="dropdown"></li>     
         <li id="teacher" class="dropdown"></li>               
     </ul>
 </div>
<script>
common.goHome()
common.init()

</script>