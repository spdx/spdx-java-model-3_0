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
import org.spdx.library.model.v3_0_1.core.Bom.BomBuilder;
import org.spdx.library.model.v3_0_1.core.CreationInfo;
import org.spdx.library.model.v3_0_1.core.Element;
import org.spdx.library.model.v3_0_1.extension.Extension;

/**
 * GENERATED FILE - DO NOT MODIFY
**/

public class BomTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.Bom#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		Bom testBom = generator.builderForBomTests(TEST_OBJECT_URI).build();
		List<String> result = testBom.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.Bom#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		Bom testBom = generator.builderForBomTests(TEST_OBJECT_URI).build();
		assertEquals("Core.Bom", testBom.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.Bom#Element(org.spdx.library.model.v3_0_1.core.Bom.BomBuilder)}.
	 */
	public void testBomBomBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForBomTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		Bom testBom = generator.builderForBomTests(TEST_OBJECT_URI).build();
		Bom test2Bom = generator.builderForBomTests("https://testObject2").build();
		assertTrue(testBom.equivalent(test2Bom));
		assertTrue(test2Bom.equivalent(testBom));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.Bom#setCreationInfo}.
	 */
	public void testBomsetCreationInfo() throws InvalidSPDXAnalysisException {
		Bom testBom = generator.builderForBomTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testBom.getCreationInfo());
//		testBom.setCreationInfo(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testBom.getCreationInfo());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.Bom#setSummary}.
	 */
	public void testBomsetSummary() throws InvalidSPDXAnalysisException {
		Bom testBom = generator.builderForBomTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SUMMARY_TEST_VALUE), testBom.getSummary());
		String newStringValue = "new summary value";
		testBom.setSummary(newStringValue);
		assertEquals(Optional.of(newStringValue), testBom.getSummary());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.Bom#setDescription}.
	 */
	public void testBomsetDescription() throws InvalidSPDXAnalysisException {
		Bom testBom = generator.builderForBomTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DESCRIPTION_TEST_VALUE), testBom.getDescription());
		String newStringValue = "new description value";
		testBom.setDescription(newStringValue);
		assertEquals(Optional.of(newStringValue), testBom.getDescription());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.Bom#setContext}.
	 */
	public void testBomsetContext() throws InvalidSPDXAnalysisException {
		Bom testBom = generator.builderForBomTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.CONTEXT_TEST_VALUE), testBom.getContext());
		String newStringValue = "new context value";
		testBom.setContext(newStringValue);
		assertEquals(Optional.of(newStringValue), testBom.getContext());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.Bom#setComment}.
	 */
	public void testBomsetComment() throws InvalidSPDXAnalysisException {
		Bom testBom = generator.builderForBomTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMMENT_TEST_VALUE), testBom.getComment());
		String newStringValue = "new comment value";
		testBom.setComment(newStringValue);
		assertEquals(Optional.of(newStringValue), testBom.getComment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.Bom#setName}.
	 */
	public void testBomsetName() throws InvalidSPDXAnalysisException {
		Bom testBom = generator.builderForBomTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.NAME_TEST_VALUE), testBom.getName());
		String newStringValue = "new name value";
		testBom.setName(newStringValue);
		assertEquals(Optional.of(newStringValue), testBom.getName());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.Bom#getExtension}.
	 */
	public void testBomgetExtensions() throws InvalidSPDXAnalysisException {
		Bom testBom = generator.builderForBomTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testBom.getExtensions())));
//		testBom.getExtensions().clear();
//		testBom.getExtensions().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testBom.getExtensions())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.Bom#getVerifiedUsing}.
	 */
	public void testBomgetVerifiedUsings() throws InvalidSPDXAnalysisException {
		Bom testBom = generator.builderForBomTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testBom.getVerifiedUsings())));
//		testBom.getVerifiedUsings().clear();
//		testBom.getVerifiedUsings().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testBom.getVerifiedUsings())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.Bom#getRootElement}.
	 */
	public void testBomgetRootElements() throws InvalidSPDXAnalysisException {
		Bom testBom = generator.builderForBomTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testBom.getRootElements())));
//		testBom.getRootElements().clear();
//		testBom.getRootElements().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testBom.getRootElements())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.Bom#getElement}.
	 */
	public void testBomgetElements() throws InvalidSPDXAnalysisException {
		Bom testBom = generator.builderForBomTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testBom.getElements())));
//		testBom.getElements().clear();
//		testBom.getElements().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testBom.getElements())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.Bom#getExternalRef}.
	 */
	public void testBomgetExternalRefs() throws InvalidSPDXAnalysisException {
		Bom testBom = generator.builderForBomTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testBom.getExternalRefs())));
//		testBom.getExternalRefs().clear();
//		testBom.getExternalRefs().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testBom.getExternalRefs())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.Bom#getExternalIdentifier}.
	 */
	public void testBomgetExternalIdentifiers() throws InvalidSPDXAnalysisException {
		Bom testBom = generator.builderForBomTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testBom.getExternalIdentifiers())));
//		testBom.getExternalIdentifiers().clear();
//		testBom.getExternalIdentifiers().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testBom.getExternalIdentifiers())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.Bom#getProfileConformance}.
	 */
	public void testBomgetProfileConformances() throws InvalidSPDXAnalysisException {
		Bom testBom = generator.builderForBomTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.PROFILE_CONFORMANCE_TEST_LIST1, new ArrayList<>(testBom.getProfileConformances())));
		testBom.getProfileConformances().clear();
		testBom.getProfileConformances().addAll(TestValuesGenerator.PROFILE_CONFORMANCE_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.PROFILE_CONFORMANCE_TEST_LIST2, new ArrayList<>(testBom.getProfileConformances())));
	}
}