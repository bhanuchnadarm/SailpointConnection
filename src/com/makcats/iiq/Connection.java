package com.makcats.iiq;

import sailpoint.api.SailPointContext;
import sailpoint.api.SailPointFactory;
import sailpoint.object.Identity;
import sailpoint.spring.SpringStarter;
import sailpoint.tools.GeneralException;

public class Connection {
	public static void main(String[] args) throws GeneralException {
	
		SpringStarter starter=new SpringStarter("iiqBeans");
		starter.start();
		SailPointContext context= SailPointFactory.createContext();
		Identity identity = context.getObject(Identity.class,"spadmin");
		String dispString= identity.getDisplayName();
		System.out.println("Identitydeatils"+identity.getFirstname()+"1111111");
		System.out.println(dispString);
		starter.close();
}
}
