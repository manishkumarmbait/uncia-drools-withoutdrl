package com.uncia.droolswithoutdrl.service;

import java.util.Calendar;
import java.util.Date;

//import org.drools.template.parser.RuleTemplate;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
//import org.kie.api.runtime.rule.RuleContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import ch.qos.logback.core.joran.action.Action;


import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DroolsWithoutDrlService {

	@Autowired
	private KieContainer kieContainer;

//	KieSession kieSession = kieContainer.newKieSession();

//	public List<Order> getResponse(List<Order> orders) {
//		Response response = new Response();
//		Cibil cibil1 = new Cibil();
//		KieSession kieSession = kieContainer.newKieSession();
//		KieSession kieSession = kieContainer.newKieSession();
//		kieSession.setGlobal("cibil", cibil1);
//		kieSession.setGlobal("response", response);
	// Programmatically define rule logic
//		kieSession.insert(new RuleTemplate(
//		    "Find expensive orders",
//		    from $order: Order( $total >= 100.0 ) then,
//		    new Action() {
//		        public void execute(RuleContext ruleContext) {
//		            Order order = (Order) ruleContext.getObject($order);
//		            System.out.println("Expensive order: " + order.id + " (total: $" + order.to
//		    }
//		));

	// Insert orders and fire rules
//		for (Order order : orders) {
//		    kieSession.insert(order);
//		}
//		kieSession.fireAllRules();
//
//		// Dispose session
//		kieSession.dispose();
//		return orders;
//==========================================================================		
//		kieSession.insert(new RuleTemplate("from $order: Order( $total >= 100.0 ) then", new Ac));
//		kieSession.insert(new RuleTemplate(null, DefaultTemplateContainer));
//		kieSession.insert(new RuleTemplate(null, null));

//==========================================================================		
//		return null;
//		
//	}
//	==========================================================================================================================
//	public Date getDate(Date inputDate) {
//		KieSession kieSession = kieContainer.newKieSession();
//		Date currentDate = new Date();
//		kieSession.insert(currentDate);
//    Date inputDate1 = inputDate;
//    kieSession.insert(inputDate1);
//    kieSession.setGlobal("180DaysAgo", calculateDateDifference(currentDate, 180));
//    kieSession.fireAllRules();
//    Date calculateDateDifference = calculateDateDifference(currentDate, 180);
//    kieSession.dispose();
//	return calculateDateDifference;
//}

	private static Date calculateDateDifference(Date currentDate, int days) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(currentDate);
		calendar.add(Calendar.DAY_OF_MONTH, -days);
		return calendar.getTime();
	}

//	==========================================================================================================================
	public Date getDate(Date inputDate) {
//	Response response = new Response();//
//	List<Account> listOfAccount = cibil.getListOfAccount();
		KieSession kieSession = kieContainer.newKieSession();
		// for(Account account : listOfAccount) {

		// kieSession.setGlobal("response", response);
//		kieSession.setGlobal("account", account);			
//	}
//	kieSession.insert(cibil);
		kieSession.fireAllRules();
		kieSession.dispose();
//	return listOfAccount;
		return null;

	}
}