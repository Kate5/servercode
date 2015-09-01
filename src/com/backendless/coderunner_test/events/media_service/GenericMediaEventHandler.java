package com.backendless.coderunner_test.events.media_service;

import com.backendless.commons.media.MediaObjectInfo;
import com.backendless.commons.media.OperationMeta;
import com.backendless.servercode.RunnerContext;
        
/**
* GenericMediaEventHandler handles the Messaging Service events.
* The event handlers are the individual methods implemented in the class.
* The "before" and "after" prefix determines if the handler is executed before
* or after the default handling logic provided by Backendless. The part after
* the prefix identifies the actual event. For example, the
* "beforePublishStarted" method is the "PublishStarted" event handler and will
* be called before Backendless applies the default logic for starting
* publishing a media stream. The event handling pipeline looks like this:

* Client Request ---> Before Handler ---> Default Logic ---> After Handler --->
* Return Response
*/
public class GenericMediaEventHandler extends com.backendless.servercode.extension.MediaExtender
{
    
  @Override
  public void streamCreated( RunnerContext context, OperationMeta meta ) throws Exception
  {
    System.out.println("streamCreated");
  }
    
  @Override
  public void publishFinished( RunnerContext context, MediaObjectInfo info ) throws Exception
  {
    System.out.println("publishFinished");
  }
    
  @Override
  public void streamFinished( RunnerContext context, OperationMeta meta ) throws Exception
  {
    System.out.println("streamFinished");
  }
    
  @Override
  public void publishStarted( RunnerContext context, MediaObjectInfo info ) throws Exception
  {
    System.out.println("publishStarted");
  }
    
  @Override
  public void acceptConnection( RunnerContext context, String operationName, String tubeName, Boolean accessGranted ) throws Exception
  {
    System.out.println("acceptConnection");
  }
    
}
        