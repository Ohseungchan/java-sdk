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
package com.ibm.watson.developer_cloud.assistant.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * An object defining the message input to be sent to the Watson Assistant service if the user selects the corresponding
 * option.
 */
public class DialogNodeOutputOptionsElementValue extends GenericModel {

  private InputData input;

  /**
   * Gets the input.
   *
   * An input object that includes the input text.
   *
   * @return the input
   */
  public InputData getInput() {
    return input;
  }

  /**
   * Sets the input.
   *
   * @param input the new input
   */
  public void setInput(final InputData input) {
    this.input = input;
  }
}
