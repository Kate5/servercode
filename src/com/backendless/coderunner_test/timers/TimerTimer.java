package com.backendless.coderunner_test.timers;

import com.backendless.servercode.annotation.BackendlessTimer;
    
/**
* TimerTimer is a timer.
* It is executed according to the schedule defined in Backendless Console. The
* class becomes a timer by extending the TimerExtender class. The information
* about the timer, its name, schedule, expiration date/time is configured in
* the special annotation - BackendlessTimer. The annotation contains a JSON
* object which describes all properties of the timer.
*/
@BackendlessTimer("{'startDate':1439967600000,'frequency':{'schedule':'custom','repeat':{'every':60}},'timername':'timer'}")
public class TimerTimer extends com.backendless.servercode.extension.TimerExtender
{
    
  @Override
  public void execute( String appVersionId ) throws Exception
  {

    System.out.println("TimerTimer");

    // add your code here
  }
    
}
        