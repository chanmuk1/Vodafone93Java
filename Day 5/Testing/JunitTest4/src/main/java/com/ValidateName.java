package com;

public class ValidateName {

	public boolean isValidUserName(String name)
	{
//		if(name.contains("/") || name.contains("#"))
//			return false;
		
		
        if(name.contains("/") || name.contains("#") || name.contains(" ") ||  name.contains("@") || name.contains("_"))
        {
            return false;
        }
        return true;
    }

}
