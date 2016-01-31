package com.goodvideotutorials.spring.mail;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Primary 
/*if primary annotation is not added when there are two classes implementing
 * there will be an error throwing from spring
 * Here we can use Autowired annotation or we can name the resource with annotation
 * And that annotation has to be (name="mailSender") mentioned at @Component in the
 * implemented class
 * 
 * 
*/

/*When adding qualifier annotation the class name in the Cammel case can be used
 * in the RootController or the expected controller and mentioning in the implementd
 * class is not necessary or this way it has to be mentioned.
 * 
 * */
@Component
@Qualifier("smtp")
public class SmtpMailSender implements MailSender {

	private static final Logger logger = LoggerFactory.getLogger(SmtpMailSender.class);

	/* (non-Javadoc)
	 * @see com.goodvideotutorials.spring.mail.MailSender#send(java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public void send (String to, String subject, String body){
		
		logger.info("Sending SMTP mail to :"+to);
		logger.info("Sending mail subject :"+subject);
		logger.info("Sending mail body :"+body);
		
	}

}
