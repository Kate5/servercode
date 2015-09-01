package com.backendless.coderunner_test.events.custom_events;

import com.backendless.servercode.RunnerContext;
import com.backendless.servercode.annotation.BackendlessEvent;

import java.util.Collections;
import java.util.Map;
    
/**
* TestEventHandler handles custom event "test". This is accomplished with the
* BackendlessEvent( "test" ) annotation. The event can be raised by either
* the client-side or the server-side code (in other event handlers or timers).
* The name of the class is not significant, it can be changed, since the event
* handler is associated with the event only through the annotation.
*/
@BackendlessEvent( "test" )
public class TestEventHandler extends com.backendless.servercode.extension.CustomEventHandler
{
    
  @Override
  public Map handleEvent( RunnerContext context, Map eventArgs )
  {

    System.out.println("event");

    return Collections.emptyMap();
  }
    
}
        