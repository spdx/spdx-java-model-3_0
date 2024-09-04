/**
 * Copyright (c) 2024 Source Auditor Inc.
 *
 * SPDX-License-Identifier: Apache-2.0
 * 
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */
 
package org.spdx.library.model.v3_0_1.core;

import javax.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.spdx.core.CoreModelObject;
import org.spdx.core.DefaultModelStore;
import org.spdx.core.InvalidSPDXAnalysisException;
import org.spdx.core.IModelCopyManager;
import org.spdx.core.IndividualUriValue;
import org.spdx.library.model.v3_0_1.ModelObjectV3;
import org.spdx.storage.IModelStore;
import org.spdx.storage.IModelStore.IdType;
import org.spdx.storage.IModelStore.IModelStoreLock;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Objects;
import java.util.Optional;
import junit.framework.TestCase;
import org.spdx.core.ModelRegistry;
import org.spdx.library.model.v3_0_1.MockCopyManager;
import org.spdx.library.model.v3_0_1.MockModelStore;
import org.spdx.library.model.v3_0_1.SpdxConstantsV3;
import org.spdx.library.model.v3_0_1.SpdxModelInfoV3_0;
import org.spdx.library.model.v3_0_1.TestValuesGenerator;
import org.spdx.library.model.v3_0_1.UnitTestHelper;
import org.spdx.library.model.v3_0_1.core.Agent.AgentBuilder;
import org.spdx.library.model.v3_0_1.core.CreationInfo;
import org.spdx.library.model.v3_0_1.core.Element;
import org.spdx.library.model.v3_0_1.extension.Extension;

/**
 * GENERATED FILE - DO NOT MODIFY
**/

public class AgentTest extends TestCase {

	static final String TEST_OBJECT_URI = "https://test.uri/testuri";
	
	TestValuesGenerator generator;
	
	protected void setUp() throws Exception {
		super.setUp();
		generator = new TestValuesGenerator(new MockModelStore(), new MockCopyManager());
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.Agent#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		Agent testAgent = generator.builderForAgentTests(TEST_OBJECT_URI).build();
		List<String> result = testAgent.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.Agent#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		Agent testAgent = generator.builderForAgentTests(TEST_OBJECT_URI).build();
		assertEquals("Core.Agent", testAgent.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.Agent#Element(org.spdx.library.model.v3_0_1.core.Agent.AgentBuilder)}.
	 */
	public void testAgentAgentBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForAgentTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		Agent testAgent = generator.builderForAgentTests(TEST_OBJECT_URI).build();
		Agent test2Agent = generator.builderForAgentTests("https://testObject2").build();
		assertTrue(testAgent.equivalent(test2Agent));
		assertTrue(test2Agent.equivalent(testAgent));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.Agent#setCreationInfo}.
	 */
	public void testAgentsetCreationInfo() throws InvalidSPDXAnalysisException {
		Agent testAgent = generator.builderForAgentTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testAgent.getCreationInfo());
//		testAgent.setCreationInfo(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testAgent.getCreationInfo());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.Agent#setSummary}.
	 */
	public void testAgentsetSummary() throws InvalidSPDXAnalysisException {
		Agent testAgent = generator.builderForAgentTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SUMMARY_TEST_VALUE), testAgent.getSummary());
		String newStringValue = "new summary value";
		testAgent.setSummary(newStringValue);
		assertEquals(Optional.of(newStringValue), testAgent.getSummary());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.Agent#setDescription}.
	 */
	public void testAgentsetDescription() throws InvalidSPDXAnalysisException {
		Agent testAgent = generator.builderForAgentTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DESCRIPTION_TEST_VALUE), testAgent.getDescription());
		String newStringValue = "new description value";
		testAgent.setDescription(newStringValue);
		assertEquals(Optional.of(newStringValue), testAgent.getDescription());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.Agent#setComment}.
	 */
	public void testAgentsetComment() throws InvalidSPDXAnalysisException {
		Agent testAgent = generator.builderForAgentTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMMENT_TEST_VALUE), testAgent.getComment());
		String newStringValue = "new comment value";
		testAgent.setComment(newStringValue);
		assertEquals(Optional.of(newStringValue), testAgent.getComment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.Agent#setName}.
	 */
	public void testAgentsetName() throws InvalidSPDXAnalysisException {
		Agent testAgent = generator.builderForAgentTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.NAME_TEST_VALUE), testAgent.getName());
		String newStringValue = "new name value";
		testAgent.setName(newStringValue);
		assertEquals(Optional.of(newStringValue), testAgent.getName());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.Agent#getExternalRef}.
	 */
	public void testAgentgetExternalRefs() throws InvalidSPDXAnalysisException {
		Agent testAgent = generator.builderForAgentTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testAgent.getExternalRefs())));
//		testAgent.getExternalRefs().clear();
//		testAgent.getExternalRefs().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testAgent.getExternalRefs())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.Agent#getExtension}.
	 */
	public void testAgentgetExtensions() throws InvalidSPDXAnalysisException {
		Agent testAgent = generator.builderForAgentTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testAgent.getExtensions())));
//		testAgent.getExtensions().clear();
//		testAgent.getExtensions().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testAgent.getExtensions())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.Agent#getVerifiedUsing}.
	 */
	public void testAgentgetVerifiedUsings() throws InvalidSPDXAnalysisException {
		Agent testAgent = generator.builderForAgentTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testAgent.getVerifiedUsings())));
//		testAgent.getVerifiedUsings().clear();
//		testAgent.getVerifiedUsings().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testAgent.getVerifiedUsings())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.Agent#getExternalIdentifier}.
	 */
	public void testAgentgetExternalIdentifiers() throws InvalidSPDXAnalysisException {
		Agent testAgent = generator.builderForAgentTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testAgent.getExternalIdentifiers())));
//		testAgent.getExternalIdentifiers().clear();
//		testAgent.getExternalIdentifiers().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testAgent.getExternalIdentifiers())));
		//TODO: Implement
	}
}