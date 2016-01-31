
<%@include file="includes/header/header-dark.jsp" %>


    <div class="form">
      
     
      <div class="tab-content">
       
          <h1>Sign Up for Free</h1>
          
          <form:form modelAttribute="signInForm" role="form">
          
                  


          <div class="field-wrap">
            <form:label path="email">
              Email Address<span class="req">*</span>
            </form:label>
            <form:input path="email" ></form:input>
          </div>
          
          <div class="field-wrap">
            <form:label path="password">
              Set A Password<span class="req">*</span>
            </form:label>
            <form:input path="password"/>
          </div>
          
          <form:button type="submit" class="button button-block">Sign Up</form:button>
          
          </form:form>

       
        

      </div><!-- tab-content -->
      
</div>

<%@include file="includes/footer/footer-dark.jsp" %>
