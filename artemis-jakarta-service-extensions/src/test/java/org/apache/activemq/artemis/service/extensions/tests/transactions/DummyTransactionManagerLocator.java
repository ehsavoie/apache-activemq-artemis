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
package org.apache.activemq.artemis.service.extensions.tests.transactions;

import jakarta.transaction.HeuristicMixedException;
import jakarta.transaction.HeuristicRollbackException;
import jakarta.transaction.InvalidTransactionException;
import jakarta.transaction.NotSupportedException;
import jakarta.transaction.RollbackException;
import jakarta.transaction.SystemException;
import jakarta.transaction.Transaction;
import jakarta.transaction.TransactionManager;

import org.apache.activemq.artemis.service.extensions.transactions.TransactionManagerLocator;

public class DummyTransactionManagerLocator implements TransactionManagerLocator, TransactionManager {

   @Override
   public void begin() throws NotSupportedException, SystemException {

   }

   @Override
   public void commit() throws HeuristicMixedException, HeuristicRollbackException, IllegalStateException, RollbackException, SecurityException, SystemException {

   }

   @Override
   public int getStatus() throws SystemException {
      return 0;
   }

   @Override
   public Transaction getTransaction() throws SystemException {
      return null;
   }

   @Override
   public void resume(Transaction transaction) throws IllegalStateException, InvalidTransactionException, SystemException {

   }

   @Override
   public void rollback() throws IllegalStateException, SecurityException, SystemException {

   }

   @Override
   public void setRollbackOnly() throws IllegalStateException, SystemException {

   }

   @Override
   public void setTransactionTimeout(int i) throws SystemException {

   }

   @Override
   public Transaction suspend() throws SystemException {
      return null;
   }

   @Override
   public TransactionManager getTransactionManager() {
      return this;
   }
}
