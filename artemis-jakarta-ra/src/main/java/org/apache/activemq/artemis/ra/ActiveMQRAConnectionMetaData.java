/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.activemq.artemis.ra;

import jakarta.jms.ConnectionMetaData;
import java.util.Enumeration;
import java.util.Vector;

/**
 * This class implements javax.jms.ConnectionMetaData
 */
public class ActiveMQRAConnectionMetaData implements ConnectionMetaData {

   /**
    * Constructor
    */
   public ActiveMQRAConnectionMetaData() {
      if (ActiveMQRALogger.LOGGER.isTraceEnabled()) {
         ActiveMQRALogger.LOGGER.trace("constructor()");
      }
   }

   /**
    * Get the JMS version
    *
    * @return The version
    */
   @Override
   public String getJMSVersion() {
      if (ActiveMQRALogger.LOGGER.isTraceEnabled()) {
         ActiveMQRALogger.LOGGER.trace("getJMSVersion()");
      }

      return "3.0";
   }

   /**
    * Get the JMS major version
    *
    * @return The major version
    */
   @Override
   public int getJMSMajorVersion() {
      if (ActiveMQRALogger.LOGGER.isTraceEnabled()) {
         ActiveMQRALogger.LOGGER.trace("getJMSMajorVersion()");
      }

      return 3;
   }

   /**
    * Get the JMS minor version
    *
    * @return The minor version
    */
   @Override
   public int getJMSMinorVersion() {
      if (ActiveMQRALogger.LOGGER.isTraceEnabled()) {
         ActiveMQRALogger.LOGGER.trace("getJMSMinorVersion()");
      }

      return 0;
   }

   /**
    * Get the JMS provider name
    *
    * @return The name
    */
   @Override
   public String getJMSProviderName() {
      if (ActiveMQRALogger.LOGGER.isTraceEnabled()) {
         ActiveMQRALogger.LOGGER.trace("getJMSProviderName()");
      }

      return "ActiveMQ Artemis";
   }

   /**
    * Get the provider version
    *
    * @return The version
    */
   @Override
   public String getProviderVersion() {
      if (ActiveMQRALogger.LOGGER.isTraceEnabled()) {
         ActiveMQRALogger.LOGGER.trace("getJMSProviderName()");
      }

      return "2.17";
   }

   /**
    * Get the provider major version
    *
    * @return The version
    */
   @Override
   public int getProviderMajorVersion() {
      if (ActiveMQRALogger.LOGGER.isTraceEnabled()) {
         ActiveMQRALogger.LOGGER.trace("getProviderMajorVersion()");
      }

      return 2;
   }

   /**
    * Get the provider minor version
    *
    * @return The version
    */
   @Override
   public int getProviderMinorVersion() {
      if (ActiveMQRALogger.LOGGER.isTraceEnabled()) {
         ActiveMQRALogger.LOGGER.trace("getProviderMinorVersion()");
      }

      return 17;
   }

   /**
    * Get the JMS XPropertyNames
    *
    * @return The names
    */
   @Override
   public Enumeration<Object> getJMSXPropertyNames() {
      Vector<Object> v = new Vector<>();
      v.add("JMSXGroupID");
      v.add("JMSXGroupSeq");
      v.add("JMSXDeliveryCount");
      return v.elements();
   }
}
