/*******************************************************************************
 *
 * 	Copyright 2014 Springer Science+Business Media Deutschland GmbH
 * 	
 * 	Licensed under the Apache License, Version 2.0 (the "License");
 * 	you may not use this file except in compliance with the License.
 * 	You may obtain a copy of the License at
 * 	
 * 	    http://www.apache.org/licenses/LICENSE-2.0
 * 	
 * 	Unless required by applicable law or agreed to in writing, software
 * 	distributed under the License is distributed on an "AS IS" BASIS,
 * 	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 	See the License for the specific language governing permissions and
 * 	limitations under the License.
 *******************************************************************************/
package omelet.mail;

import java.util.List;

import javax.mail.Message;

public interface IEmail {

	public void setFolder(String folderName);

	public String getMailFormat(Message msg);

	public List<Message> getEmailsByAdd(FilterEmails searchCat,
			String emailAddress);

	public List<Message> getEmailsBySubject(String subject);

	public List<Message> filterEmailsByAdd(FilterEmails searchCat,
			Message[] messages, String emailAddress);

	public List<Message> filerEmailsBySubject(List<Message> message,
			String emailSubject);

	public String getEmailBody(Message message);

	public String getHTMLLinkAfterText(Message message,
			String textAfterWhichtoFetchHtmlLinks);

	public boolean verifyPatternInEmail(Message message, String patterToMatch);

}
