package com.backendless.coderunner_test.events.messaging_service;

import com.backendless.DeviceRegistration;
import com.backendless.messaging.*;
import com.backendless.servercode.ExecutionResult;
import com.backendless.servercode.RunnerContext;
import com.backendless.servercode.annotation.Asset;
        
/**
* GenericChannelEventHandler handles the Messaging Service events.
* The @Asset annotation determines if the event handlers apply to a specific or
* all messaging channels.The annotation contains the name of the channel the
* event handlers apply to. However if the annotation is set to "*", the
* handlers apply to all messaging channels.

* The actual event handlers are the individual methods implemented in the
* class. The "before" and "after" prefix determines if a handler is executed
* before or after the default handling logic provided by Backendless.
* The part after the prefix identifies the actual event. For example, the
* "beforePublish" method is the "Publish" event handler and will be called
* before Backendless applies the default logic for publishing a message into
* the channel. The event handling pipeline looks like this:

* Client Request ---> Before Handler ---> Default Logic ---> After Handler --->
* Return Response
*/
@Asset( "*" )
public class GenericChannelEventHandler extends com.backendless.servercode.extension.MessagingExtender
{
    
  @Override
  public void afterSubscribe( RunnerContext context, String subscriptionId, String channel, SubscriptionOptions options, ExecutionResult<String> result ) throws Exception
  {
    System.out.println( "afterSubscribe" );

  }
    
  @Override
  public void afterPoll( RunnerContext context, String subscriptionId, ExecutionResult<Message[]> result ) throws Exception
  {
    System.out.println( "afterPoll" );

  }
    
  @Override
  public void beforeCancel( RunnerContext context, String subscriptionId ) throws Exception
  {
    System.out.println( "beforeCancel" );

  }
    
  @Override
  public void beforeDeviceRegistration( RunnerContext context, DeviceRegistration registrationDto ) throws Exception
  {
    System.out.println( "beforeDeviceRegistration" );

  }
    
  @Override
  public void beforeSubscribe( RunnerContext context, String subscriptionId, String channel, SubscriptionOptions options ) throws Exception
  {
    System.out.println( "beforeSubscribe" );

  }
    
  @Override
  public void beforePublish( RunnerContext context, Object message, PublishOptions publishOptions, DeliveryOptions deliveryOptions ) throws Exception
  {
    System.out.println( "beforePublish" );

  }
    
  @Override
  public void afterDeviceRegistration( RunnerContext context, DeviceRegistration registrationDto, ExecutionResult<String> result ) throws Exception
  {
    System.out.println( "afterDeviceRegistration" );

  }
    
  @Override
  public void beforePoll( RunnerContext context, String subscriptionId ) throws Exception
  {
    System.out.println( "beforePoll" );
    // add your code here
  }
    
  @Override
  public void afterPublish( RunnerContext context, Object message, PublishOptions publishOptions, DeliveryOptions deliveryOptions, ExecutionResult<MessageStatus> result ) throws Exception
  {
    System.out.println( "afterPublish" );

  }
    
  @Override
  public void afterCancel( RunnerContext context, String subscriptionId, ExecutionResult<MessageStatus> result ) throws Exception
  {
    System.out.println( "afterCancel" );

  }
    
}
        