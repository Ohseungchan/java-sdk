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
package com.ibm.watson.developer_cloud.discovery.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * A list of Word conversion settings.
 */
public class WordSettings extends GenericModel {

  private WordHeadingDetection heading;

  /**
   * Gets the heading.
   *
   * @return the heading
   */
  public WordHeadingDetection getHeading() {
    return heading;
  }

  /**
   * Sets the heading.
   *
   * @param heading the new heading
   */
  public void setHeading(final WordHeadingDetection heading) {
    this.heading = heading;
  }
}
