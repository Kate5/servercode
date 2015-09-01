package com.backendless.coderunner_test.events.geo_service;

import com.backendless.BackendlessCollection;
import com.backendless.geo.BackendlessGeoQuery;
import com.backendless.geo.GeoCategory;
import com.backendless.geo.GeoPoint;
import com.backendless.servercode.ExecutionResult;
import com.backendless.servercode.RunnerContext;
import com.backendless.servercode.annotation.Asset;

/**
* GenericGeoCategoryEventHandler handles the Geo Service events.
* The event handlers are the individual methods implemented in the class.
* The "before" and "after" prefix determines if the handler is executed before
* or after the default handling logic provided by Backendless.
* The part after the prefix identifies the actual event.
* For example, the "beforeGetPoints" method is the "GetPoints" event handler
* and will be called before Backendless applies the default logic for
* retrieving the geo points. The event handling pipeline looks like this:

* Client Request ---> Before Handler ---> Default Logic ---> After Handler --->
* Return Response
*/
@Asset( "*" )
public class GenericGeoCategoryEventHandler extends com.backendless.servercode.extension.GeoExtender
{
    
  @Override
  public void afterAddCategory( RunnerContext context, String categoryName, ExecutionResult<GeoCategory> result ) throws Exception
  {
    System.out.println("afterAddCategory");
  }
    
  @Override
  public void beforeAddPoint( RunnerContext context, GeoPoint point ) throws Exception
  {
    System.out.println("beforeAddPoint");
  }
    
  @Override
  public void afterRelativeFind( RunnerContext context, BackendlessGeoQuery backendlessGeoQuery, ExecutionResult<BackendlessCollection<GeoPoint>> result ) throws Exception
  {
    System.out.println("afterRelativeFind");
  }
    
  @Override
  public void afterRemovePoint( RunnerContext context, String pointId, ExecutionResult result ) throws Exception
  {
    System.out.println("afterRemovePoint");
  }
    
  @Override
  public void afterDeleteCategory( RunnerContext context, String categoryName, ExecutionResult<Boolean> result ) throws Exception
  {
    System.out.println("afterDeleteCategory");
  }
    
  @Override
  public void beforeUpdatePoint( RunnerContext context, GeoPoint point ) throws Exception
  {
    System.out.println("beforeUpdatePoint");
  }
    
  @Override
  public void beforeRelativeFind( RunnerContext context, BackendlessGeoQuery backendlessGeoQuery ) throws Exception
  {
    System.out.println("beforeRelativeFind");
  }
    
  @Override
  public void beforeGetCategories( RunnerContext context ) throws Exception
  {
    System.out.println("beforeGetCategories");
  }
    
  @Override
  public void beforeRemovePoint( RunnerContext context, String pointId ) throws Exception
  {
    System.out.println("beforeRemovePoint");
  }
    
  @Override
  public void beforeDeleteCategory( RunnerContext context, String categoryName ) throws Exception
  {
    System.out.println("beforeDeleteCategory");
  }
    
  @Override
  public void afterUpdatePoint( RunnerContext context, GeoPoint point, ExecutionResult<GeoPoint> result ) throws Exception
  {
    System.out.println("afterUpdatePoint");
  }
    
  @Override
  public void afterAddPoint( RunnerContext context, GeoPoint point, ExecutionResult<GeoPoint> result ) throws Exception
  {
    System.out.println("afterAddPoint");
  }
    
}
        