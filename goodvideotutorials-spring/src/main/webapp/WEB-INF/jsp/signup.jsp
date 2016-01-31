
<%@include file="includes/header/header-dark.jsp" %>


    <div class="form">
      
     
      <div class="tab-content">
       
          <h1>Sign Up for Free</h1>
          
          <form:form modelAttribute="signUpForm" role="form">
          
          <form:errors/>
          
            <div class="field-wrap">
              <form:label path="name">
                First Name<span class="req">*</span>
              </form:label>
              <form:input path="name" type="text"></form:input>
              <form:errors class="error" path="name" ></form:errors> 
            </div>
            


          <div class="field-wrap">
            <form:label path="email">
              Email Address<span class="req">*</span>
            </form:label>
            <form:input path="email" ></form:input>
             <form:errors class="error" path="email" ></form:errors> 
          </div>
          
          <div class="field-wrap">
            <form:label path="password">
              Set A Password<span class="req">*</span>
            </form:label>
            <form:password path="password"/>
            <form:errors class="error" path="password" ></form:errors> 
          </div>
          
          <form:button type="submit" class="button button-block">Sign Up</form:button>
          
          </form:form>

       
        

      </div><!-- tab-content -->
      
</div>

<%@include file="includes/footer/footer-dark.jsp" %>
