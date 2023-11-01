// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package oidc.actions;

import java.util.List;
import com.mendix.core.Core;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class CallCustomMicroflow extends CustomJavaAction<java.util.List<IMendixObject>>
{
	private java.lang.String Microflow;
	private java.lang.String AccessToken;

	public CallCustomMicroflow(IContext context, java.lang.String Microflow, java.lang.String AccessToken)
	{
		super(context);
		this.Microflow = Microflow;
		this.AccessToken = AccessToken;
	}

	@java.lang.Override
	public java.util.List<IMendixObject> executeAction() throws Exception
	{
		// BEGIN USER CODE
		IContext context=getContext();
		List<IMendixObject> rolesFromToken = Core.microflowCall(Microflow)
    	.withParam("AccessToken", AccessToken)
    	.execute(context);
		
//		IContext context=getContext();
//		List<IMendixObject> rolesFromToken = Core.microflowCall(Microflow)
//				.withParam("AccessToken", AccessToken).execute(context);
		return rolesFromToken;
		//throw new com.mendix.systemwideinterfaces.MendixRuntimeException("Java action was not implemented");
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 * @return a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "CallCustomMicroflow";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
