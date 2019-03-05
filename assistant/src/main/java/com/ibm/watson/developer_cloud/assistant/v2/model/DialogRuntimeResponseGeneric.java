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
package com.ibm.watson.developer_cloud.assistant.v2.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * DialogRuntimeResponseGeneric.
 */
public class DialogRuntimeResponseGeneric extends GenericModel {

  /**
   * The type of response returned by the dialog node. The specified response type must be supported by the client
   * application or channel.
   *
   * **Note:** The **suggestion** response type is part of the disambiguation feature, which is only available for
   * Premium users.
   */
  public interface ResponseType {
    /** text. */
    String TEXT = "text";
    /** pause. */
    String PAUSE = "pause";
    /** image. */
    String IMAGE = "image";
    /** option. */
    String OPTION = "option";
    /** connect_to_agent. */
    String CONNECT_TO_AGENT = "connect_to_agent";
    /** suggestion. */
    String SUGGESTION = "suggestion";
  }

  /**
   * The preferred type of control to display.
   */
  public interface Preference {
    /** dropdown. */
    String DROPDOWN = "dropdown";
    /** button. */
    String BUTTON = "button";
  }

  @SerializedName("response_type")
  private String responseType;
  private String text;
  private Long time;
  private Boolean typing;
  private String source;
  private String title;
  private String description;
  private String preference;
  private List<DialogNodeOutputOptionsElement> options;
  @SerializedName("message_to_human_agent")
  private String messageToHumanAgent;
  private String topic;
  private List<DialogSuggestion> suggestions;

  /**
   * Gets the responseType.
   *
   * The type of response returned by the dialog node. The specified response type must be supported by the client
   * application or channel.
   *
   * **Note:** The **suggestion** response type is part of the disambiguation feature, which is only available for
   * Premium users.
   *
   * @return the responseType
   */
  public String getResponseType() {
    return responseType;
  }

  /**
   * Gets the text.
   *
   * The text of the response.
   *
   * @return the text
   */
  public String getText() {
    return text;
  }

  /**
   * Gets the time.
   *
   * How long to pause, in milliseconds.
   *
   * @return the time
   */
  public Long getTime() {
    return time;
  }

  /**
   * Gets the typing.
   *
   * Whether to send a "user is typing" event during the pause.
   *
   * @return the typing
   */
  public Boolean isTyping() {
    return typing;
  }

  /**
   * Gets the source.
   *
   * The URL of the image.
   *
   * @return the source
   */
  public String getSource() {
    return source;
  }

  /**
   * Gets the title.
   *
   * The title to show before the response.
   *
   * @return the title
   */
  public String getTitle() {
    return title;
  }

  /**
   * Gets the description.
   *
   * The description to show with the the response.
   *
   * @return the description
   */
  public String getDescription() {
    return description;
  }

  /**
   * Gets the preference.
   *
   * The preferred type of control to display.
   *
   * @return the preference
   */
  public String getPreference() {
    return preference;
  }

  /**
   * Gets the options.
   *
   * An array of objects describing the options from which the user can choose.
   *
   * @return the options
   */
  public List<DialogNodeOutputOptionsElement> getOptions() {
    return options;
  }

  /**
   * Gets the messageToHumanAgent.
   *
   * A message to be sent to the human agent who will be taking over the conversation.
   *
   * @return the messageToHumanAgent
   */
  public String getMessageToHumanAgent() {
    return messageToHumanAgent;
  }

  /**
   * Gets the topic.
   *
   * A label identifying the topic of the conversation, derived from the **user_label** property of the relevant node.
   *
   * @return the topic
   */
  public String getTopic() {
    return topic;
  }

  /**
   * Gets the suggestions.
   *
   * An array of objects describing the possible matching dialog nodes from which the user can choose.
   *
   * **Note:** The **suggestions** property is part of the disambiguation feature, which is only available for Premium
   * users.
   *
   * @return the suggestions
   */
  public List<DialogSuggestion> getSuggestions() {
    return suggestions;
  }
}
