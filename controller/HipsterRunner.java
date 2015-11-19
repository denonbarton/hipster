package hipster.controller;

import hipster.controller.HipsterController;

/**
 * Starts the ChatBot program
 * @author dbar0540
 * @version 1.0 10/21/15
 */

public class HipsterRunner
{
	public static void main (String [] args)
	{
	HipsterController myHipsterController = new HipsterController();
	myHipsterController.start();
	}
	
}