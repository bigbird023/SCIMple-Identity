package edu.psu.swe.scim.spec.resources;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import edu.psu.swe.scim.spec.annotation.ScimAttribute;
import lombok.extern.slf4j.Slf4j;

@XmlType
@XmlAccessorType(XmlAccessType.NONE)
@Slf4j
public class KeyedResource implements Serializable {
  
  private static final long serialVersionUID = 4479747886354926691L;
  
  @XmlElement
  //TODO: Adding ScimAttribute is not valid because adding new fields to the Schema is not allowed. This needs to be revisited.
  @ScimAttribute
  private String key;
  
  public KeyedResource() {
  }
  
  public void setKey(String key) {
    log.debug("Setting the key for a keyed resource to " + key);
    
    this.key = key;
  }
  
  public String getKey() {
    return key;
  }
}
