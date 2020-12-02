package com.shinkson47.portfolio.labs.six.register.main;

import com.shinkson47.portfolio.labs.six.register.lib.Name;
import com.shinkson47.portfolio.labs.six.register.lib.Register;

public class RegisterApp {

	public static String execute(Name nm, Register register) {
		register.remove(1);
		register.addName(nm);

		StringBuilder s  = new StringBuilder();
		register.forEach(name -> {
			if (name.getFirstName().toLowerCase().matches("[a-z]*[a|e][a-z]*")) s.append(name.asEmail() + "\n");
		});
		
		return s.toString();
	}
}