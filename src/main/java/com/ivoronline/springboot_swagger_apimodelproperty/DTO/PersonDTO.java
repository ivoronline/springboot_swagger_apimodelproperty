package com.ivoronline.springboot_swagger_apimodelproperty.DTO;

import io.swagger.annotations.ApiModelProperty;

public class PersonDTO {

  @ApiModelProperty(
    value    = "Name of the user",
    name     = "name",
    dataType = "String",
    example  = "John"
  )
  public String  name;

  public Integer age;

}
