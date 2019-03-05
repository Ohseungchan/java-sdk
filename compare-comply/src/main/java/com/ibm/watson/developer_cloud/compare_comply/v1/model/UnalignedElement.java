/*
 * Copyright 2018 IBM Corp. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.ibm.watson.developer_cloud.compare_comply.v1.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Element that does not align semantically between two compared documents.
 */
public class UnalignedElement extends GenericModel {

  @SerializedName("document_label")
  private String documentLabel;
  private Location location;
  private String text;
  private List<TypeLabel> types;
  private List<Category> categories;
  private List<Attribute> attributes;

  /**
   * Gets the documentLabel.
   *
   * The label assigned to the document by the value of the `file_1_label` or `file_2_label` parameters on the
   * `/v1/compare` method.
   *
   * @return the documentLabel
   */
  public String getDocumentLabel() {
    return documentLabel;
  }

  /**
   * Gets the location.
   *
   * The numeric location of the identified element in the document, represented with two integers labeled `begin` and
   * `end`.
   *
   * @return the location
   */
  public Location getLocation() {
    return location;
  }

  /**
   * Gets the text.
   *
   * The text of the element.
   *
   * @return the text
   */
  public String getText() {
    return text;
  }

  /**
   * Gets the types.
   *
   * Description of the action specified by the element and whom it affects.
   *
   * @return the types
   */
  public List<TypeLabel> getTypes() {
    return types;
  }

  /**
   * Gets the categories.
   *
   * List of functional categories into which the element falls; in other words, the subject matter of the element.
   *
   * @return the categories
   */
  public List<Category> getCategories() {
    return categories;
  }

  /**
   * Gets the attributes.
   *
   * List of document attributes.
   *
   * @return the attributes
   */
  public List<Attribute> getAttributes() {
    return attributes;
  }
}
