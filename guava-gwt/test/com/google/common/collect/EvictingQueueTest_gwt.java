/*
 * Copyright (C) 2008 The Guava Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.common.collect;
public class EvictingQueueTest_gwt extends com.google.gwt.junit.client.GWTTestCase {
@Override public String getModuleName() {
  return "com.google.common.collect.testModule";
}
public void testAddAll() throws Exception {
  com.google.common.collect.EvictingQueueTest testCase = new com.google.common.collect.EvictingQueueTest();
  testCase.testAddAll();
}

public void testCreateWithNegativeSize() throws Exception {
  com.google.common.collect.EvictingQueueTest testCase = new com.google.common.collect.EvictingQueueTest();
  testCase.testCreateWithNegativeSize();
}

public void testCreateWithZeroSize() throws Exception {
  com.google.common.collect.EvictingQueueTest testCase = new com.google.common.collect.EvictingQueueTest();
  testCase.testCreateWithZeroSize();
}

public void testEvictingAfterOne() throws Exception {
  com.google.common.collect.EvictingQueueTest testCase = new com.google.common.collect.EvictingQueueTest();
  testCase.testEvictingAfterOne();
}

public void testEvictingAfterThree() throws Exception {
  com.google.common.collect.EvictingQueueTest testCase = new com.google.common.collect.EvictingQueueTest();
  testCase.testEvictingAfterThree();
}

public void testRemainingCapacity_maxSize0() throws Exception {
  com.google.common.collect.EvictingQueueTest testCase = new com.google.common.collect.EvictingQueueTest();
  testCase.testRemainingCapacity_maxSize0();
}

public void testRemainingCapacity_maxSize1() throws Exception {
  com.google.common.collect.EvictingQueueTest testCase = new com.google.common.collect.EvictingQueueTest();
  testCase.testRemainingCapacity_maxSize1();
}

public void testRemainingCapacity_maxSize3() throws Exception {
  com.google.common.collect.EvictingQueueTest testCase = new com.google.common.collect.EvictingQueueTest();
  testCase.testRemainingCapacity_maxSize3();
}

public void testSerialization() throws Exception {
  com.google.common.collect.EvictingQueueTest testCase = new com.google.common.collect.EvictingQueueTest();
  testCase.testSerialization();
}
}
