package com.backendless.coderunner_test.events.files_service;

import com.backendless.servercode.ExecutionResult;
import com.backendless.servercode.RunnerContext;
import com.backendless.servercode.annotation.Asset;
        
/**
* GenericFolderEventHandler handles the File Service events.
* The @Asset annotation determines if the event handlers apply to a specific
* folder or the entire file storage system. The annotation contains the name
* of the folder for which the code the events will be handled by this class.
* However, if you change the annotation to "*", the code will handle the
* events for the entire file system.

* The actual event handlers are the individual methods implemented in the
* class. The "before" and "after" prefix determines if a handler is executed
* before or after the default handling logic provided by Backendless. The part
* after the prefix identifies the actual event. For example, the
* "beforeMoveToRepository" method is the "MoveToRepository" event handler and
* will be called before Backendless applies the default logic for putting a
* file into the file system. The event handling pipeline looks like this:

* Client Request ---> Before Handler ---> Default Logic ---> After Handler --->
* Return Response
*/
@Asset( "*" )
public class GenericFolderEventHandler extends com.backendless.servercode.extension.FilesExtender
{
    
  @Override
  public void afterSaveFileFromByteArray( RunnerContext context, String fileUrlLocation, Boolean overwrite, ExecutionResult result ) throws Exception
  {
    System.out.println("afterSaveFileFromByteArray");

  }
  
  @Override
  public void afterDeleteFileOrDirectory( RunnerContext context, String fileUrlLocation, ExecutionResult result ) throws Exception
  {
    System.out.println("afterDeleteFileOrDirectory");

  }
    
  @Override
  public void afterMoveToRepository( RunnerContext context, String fileUrlLocation, ExecutionResult<String> result ) throws Exception
  {
    System.out.println("afterMoveToRepository");

  }
    
  @Override
  public void beforeSaveFileFromByteArray( RunnerContext context, String fileUrlLocation, Boolean overwrite ) throws Exception
  {
    System.out.println("beforeSaveFileFromByteArray");

  }
  
  @Override
  public void beforeDeleteFileOrDirectory( RunnerContext context, String fileUrlLocation ) throws Exception
  {
    System.out.println("beforeDeleteFileOrDirectory");

  }
    
  @Override
  public void beforeMoveToRepository( RunnerContext context, String fileUrlLocation ) throws Exception
  {
    System.out.println("beforeMoveToRepository");

  }
    
}
        