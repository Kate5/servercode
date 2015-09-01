package com.backendless.coderunner_test.events.user_service;

import com.backendless.BackendlessCollection;
import com.backendless.persistence.BackendlessDataQuery;
import com.backendless.property.UserProperty;
import com.backendless.servercode.ExecutionResult;
import com.backendless.servercode.RunnerContext;

import java.util.HashMap;
        
/**
* GenericUserEventHandler handles the User Service events.
* The event handlers are the individual methods implemented in the class.
* The "before" and "after" prefix determines if the handler is executed before
* or after the default handling logic provided by Backendless.
* The part after the prefix identifies the actual event.
* For example, the "beforeLogin" method is the "Login" event handler and will
* be called before Backendless applies the default login logic. The event
* handling pipeline looks like this:

* Client Request ---> Before Handler ---> Default Logic ---> After Handler --->
* Return Response
*/
public class GenericUserEventHandler extends com.backendless.servercode.extension.UserExtender
{
    
  @Override
  public void afterRemove( RunnerContext context, String id, ExecutionResult<Long> result ) throws Exception
  {
    System.out.println( "users afterRemove" );
  }
    
  @Override
  public void afterFindById( RunnerContext context, String objectId, String[] relations, ExecutionResult<HashMap> result ) throws Exception
  {
    System.out.println( "users afterFindById" );
  }
    
  @Override
  public void afterFind( RunnerContext context, BackendlessDataQuery query, ExecutionResult<BackendlessCollection> result ) throws Exception
  {
    System.out.println( "users afterFind" );
  }
    
  @Override
  public void beforeFindById( RunnerContext context, String objectId, String[] relations ) throws Exception
  {
    System.out.println( "users beforeFindById" );
  }
    
  @Override
  public void beforeRestorePassword( RunnerContext context, String email ) throws Exception
  {
    System.out.println( "users beforeRestorePassword" );
  }
    
  @Override
  public void beforeUpdateBulk( RunnerContext context, String whereClause, HashMap userValues ) throws Exception
  {
    System.out.println( "users beforeUpdateBulk" );
  }
    
  @Override
  public void afterUpdateBulk( RunnerContext context, String whereClause, HashMap userValues, ExecutionResult<Integer> result ) throws Exception
  {
    System.out.println( "users afterUpdateBulk" );
  }
    
  @Override
  public void beforeRemoveBulk( RunnerContext context, String whereClause ) throws Exception
  {
    System.out.println( "users beforeRemoveBulk" );
  }
    
  @Override
  public void beforeLogin( RunnerContext context, String login, String password ) throws Exception
  {
    System.out.println( "users beforeLogin" );
  }
    
  @Override
  public void afterRegister( RunnerContext context, HashMap userValue, ExecutionResult<HashMap> result ) throws Exception
  {
    System.out.println( "users afterRegister" );
  }
    
  @Override
  public void afterUpdate( RunnerContext context, HashMap userValue, ExecutionResult<HashMap> result ) throws Exception
  {
    System.out.println( "users afterUpdate" );
  }
    
  @Override
  public void afterLogout( RunnerContext context, ExecutionResult result ) throws Exception
  {
    System.out.println( "users afterLogout" );
  }
    
  @Override
  public void beforeUpdate( RunnerContext context, HashMap userValue ) throws Exception
  {
    System.out.println( "users beforeUpdate" );
  }
    
  @Override
  public void beforeFind( RunnerContext context, BackendlessDataQuery query ) throws Exception
  {
    System.out.println( "users beforeFind" );
  }
    
  @Override
  public void beforeDescribe( RunnerContext context ) throws Exception
  {
    System.out.println( "users beforeDescribe" );
  }
    
  @Override
  public void beforeRemove( RunnerContext context, String id ) throws Exception
  {
    System.out.println( "users beforeRemove" );
  }
    
  @Override
  public void afterRestorePassword( RunnerContext context, String email, ExecutionResult result ) throws Exception
  {
    System.out.println( "users afterRestorePassword" );
  }
    
  @Override
  public void afterRemoveBulk( RunnerContext context, String whereClause, ExecutionResult<Integer> result ) throws Exception
  {
    System.out.println( "users afterRemoveBulk" );
  }
    
  @Override
  public void afterDescribe( RunnerContext context, ExecutionResult<UserProperty[]> result ) throws Exception
  {
    System.out.println( "users afterDescribe" );
  }
    
  @Override
  public void beforeRegister( RunnerContext context, HashMap userValue ) throws Exception
  {
    System.out.println( "users beforeRegister" );
  }
    
  @Override
  public void afterLogin( RunnerContext context, String login, String password, ExecutionResult<HashMap> result ) throws Exception
  {
    System.out.println( "users afterLogin" );
  }
    
  @Override
  public void beforeLogout( RunnerContext context ) throws Exception
  {
    System.out.println( "users beforeLogout" );
  }
    
}
        