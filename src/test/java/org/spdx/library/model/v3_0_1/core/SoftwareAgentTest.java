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
import org.spdx.library.model.v3_0_1.core.SoftwareAgent.SoftwareAgentBuilder;
import org.spdx.library.model.v3_0_1.extension.Extension;

/**
 * GENERATED FILE - DO NOT MODIFY
**/

public class SoftwareAgentTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.SoftwareAgent#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		SoftwareAgent testSoftwareAgent = generator.builderForSoftwareAgentTests(TEST_OBJECT_URI).build();
		List<String> result = testSoftwareAgent.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.SoftwareAgent#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		SoftwareAgent testSoftwareAgent = generator.builderForSoftwareAgentTests(TEST_OBJECT_URI).build();
		assertEquals("Core.SoftwareAgent", testSoftwareAgent.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.SoftwareAgent#Element(org.spdx.library.model.v3_0_1.core.SoftwareAgent.SoftwareAgentBuilder)}.
	 */
	public void testSoftwareAgentSoftwareAgentBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForSoftwareAgentTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		SoftwareAgent testSoftwareAgent = generator.builderForSoftwareAgentTests(TEST_OBJECT_URI).build();
		SoftwareAgent test2SoftwareAgent = generator.builderForSoftwareAgentTests("https://testObject2").build();
		assertTrue(testSoftwareAgent.equivalent(test2SoftwareAgent));
		assertTrue(test2SoftwareAgent.equivalent(testSoftwareAgent));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.SoftwareAgent#setCreationInfo}.
	 */
	public void testSoftwareAgentsetCreationInfo() throws InvalidSPDXAnalysisException {
		SoftwareAgent testSoftwareAgent = generator.builderForSoftwareAgentTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testSoftwareAgent.getCreationInfo());
//		testSoftwareAgent.setCreationInfo(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testSoftwareAgent.getCreationInfo());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.SoftwareAgent#setSummary}.
	 */
	public void testSoftwareAgentsetSummary() throws InvalidSPDXAnalysisException {
		SoftwareAgent testSoftwareAgent = generator.builderForSoftwareAgentTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SUMMARY_TEST_VALUE), testSoftwareAgent.getSummary());
		String newStringValue = "new summary value";
		testSoftwareAgent.setSummary(newStringValue);
		assertEquals(Optional.of(newStringValue), testSoftwareAgent.getSummary());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.SoftwareAgent#setDescription}.
	 */
	public void testSoftwareAgentsetDescription() throws InvalidSPDXAnalysisException {
		SoftwareAgent testSoftwareAgent = generator.builderForSoftwareAgentTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DESCRIPTION_TEST_VALUE), testSoftwareAgent.getDescription());
		String newStringValue = "new description value";
		testSoftwareAgent.setDescription(newStringValue);
		assertEquals(Optional.of(newStringValue), testSoftwareAgent.getDescription());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.SoftwareAgent#setComment}.
	 */
	public void testSoftwareAgentsetComment() throws InvalidSPDXAnalysisException {
		SoftwareAgent testSoftwareAgent = generator.builderForSoftwareAgentTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMMENT_TEST_VALUE), testSoftwareAgent.getComment());
		String newStringValue = "new comment value";
		testSoftwareAgent.setComment(newStringValue);
		assertEquals(Optional.of(newStringValue), testSoftwareAgent.getComment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.SoftwareAgent#setName}.
	 */
	public void testSoftwareAgentsetName() throws InvalidSPDXAnalysisException {
		SoftwareAgent testSoftwareAgent = generator.builderForSoftwareAgentTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.NAME_TEST_VALUE), testSoftwareAgent.getName());
		String newStringValue = "new name value";
		testSoftwareAgent.setName(newStringValue);
		assertEquals(Optional.of(newStringValue), testSoftwareAgent.getName());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.SoftwareAgent#getExternalRef}.
	 */
	public void testSoftwareAgentgetExternalRefs() throws InvalidSPDXAnalysisException {
		SoftwareAgent testSoftwareAgent = generator.builderForSoftwareAgentTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testSoftwareAgent.getExternalRefs())));
//		testSoftwareAgent.getExternalRefs().clear();
//		testSoftwareAgent.getExternalRefs().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testSoftwareAgent.getExternalRefs())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.SoftwareAgent#getExtension}.
	 */
	public void testSoftwareAgentgetExtensions() throws InvalidSPDXAnalysisException {
		SoftwareAgent testSoftwareAgent = generator.builderForSoftwareAgentTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testSoftwareAgent.getExtensions())));
//		testSoftwareAgent.getExtensions().clear();
//		testSoftwareAgent.getExtensions().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testSoftwareAgent.getExtensions())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.SoftwareAgent#getVerifiedUsing}.
	 */
	public void testSoftwareAgentgetVerifiedUsings() throws InvalidSPDXAnalysisException {
		SoftwareAgent testSoftwareAgent = generator.builderForSoftwareAgentTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testSoftwareAgent.getVerifiedUsings())));
//		testSoftwareAgent.getVerifiedUsings().clear();
//		testSoftwareAgent.getVerifiedUsings().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testSoftwareAgent.getVerifiedUsings())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.SoftwareAgent#getExternalIdentifier}.
	 */
	public void testSoftwareAgentgetExternalIdentifiers() throws InvalidSPDXAnalysisException {
		SoftwareAgent testSoftwareAgent = generator.builderForSoftwareAgentTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testSoftwareAgent.getExternalIdentifiers())));
//		testSoftwareAgent.getExternalIdentifiers().clear();
//		testSoftwareAgent.getExternalIdentifiers().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testSoftwareAgent.getExternalIdentifiers())));
		//TODO: Implement
	}
}