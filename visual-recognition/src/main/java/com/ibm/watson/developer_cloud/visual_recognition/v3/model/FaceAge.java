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
package com.ibm.watson.developer_cloud.visual_recognition.v3.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Age information about a face.
 */
public class FaceAge extends GenericModel {

  private Long min;
  private Long max;
  private Float score;

  /**
   * Gets the min.
   *
   * Estimated minimum age.
   *
   * @return the min
   */
  public Long getMin() {
    return min;
  }

  /**
   * Gets the max.
   *
   * Estimated maximum age.
   *
   * @return the max
   */
  public Long getMax() {
    return max;
  }

  /**
   * Gets the score.
   *
   * Confidence score in the range of 0 to 1. A higher score indicates greater confidence in the estimated value for the
   * property.
   *
   * @return the score
   */
  public Float getScore() {
    return score;
  }
}
