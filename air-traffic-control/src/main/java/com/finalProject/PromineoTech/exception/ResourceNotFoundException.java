/**
 * 
 */
package com.finalProject.PromineoTech.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author coope
 *
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{
  private String resourceName;
  private String feildName;
  
  private Object feildValue;
  
  public ResourceNotFoundException ( String resourceName, String feildName, Object feildValue) {
    super(String.format("%s not found with %s : '%s", resourceName, feildName, feildValue));
    this.resourceName = resourceName;
    this.feildName = feildName;
    this.feildValue = feildValue;
  }
  
  public String getResourceName() {
    return resourceName;
  }
  public String getFieldName() {
    return feildName;
  }
  public Object getFeildValue() {
    return feildValue;
  }
}
