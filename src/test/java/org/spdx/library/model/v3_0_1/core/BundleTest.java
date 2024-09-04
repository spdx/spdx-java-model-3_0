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
import org.spdx.library.model.v3_0_1.core.Bundle.BundleBuilder;
import org.spdx.library.model.v3_0_1.core.CreationInfo;
import org.spdx.library.model.v3_0_1.core.Element;
import org.spdx.library.model.v3_0_1.extension.Extension;

/**
 * GENERATED FILE - DO NOT MODIFY
**/

public class BundleTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.Bundle#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		Bundle testBundle = generator.builderForBundleTests(TEST_OBJECT_URI).build();
		List<String> result = testBundle.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.Bundle#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		Bundle testBundle = generator.builderForBundleTests(TEST_OBJECT_URI).build();
		assertEquals("Core.Bundle", testBundle.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.Bundle#Element(org.spdx.library.model.v3_0_1.core.Bundle.BundleBuilder)}.
	 */
	public void testBundleBundleBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForBundleTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		Bundle testBundle = generator.builderForBundleTests(TEST_OBJECT_URI).build();
		Bundle test2Bundle = generator.builderForBundleTests("https://testObject2").build();
		assertTrue(testBundle.equivalent(test2Bundle));
		assertTrue(test2Bundle.equivalent(testBundle));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.Bundle#setCreationInfo}.
	 */
	public void testBundlesetCreationInfo() throws InvalidSPDXAnalysisException {
		Bundle testBundle = generator.builderForBundleTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testBundle.getCreationInfo());
//		testBundle.setCreationInfo(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testBundle.getCreationInfo());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.Bundle#setSummary}.
	 */
	public void testBundlesetSummary() throws InvalidSPDXAnalysisException {
		Bundle testBundle = generator.builderForBundleTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SUMMARY_TEST_VALUE), testBundle.getSummary());
		String newStringValue = "new summary value";
		testBundle.setSummary(newStringValue);
		assertEquals(Optional.of(newStringValue), testBundle.getSummary());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.Bundle#setDescription}.
	 */
	public void testBundlesetDescription() throws InvalidSPDXAnalysisException {
		Bundle testBundle = generator.builderForBundleTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DESCRIPTION_TEST_VALUE), testBundle.getDescription());
		String newStringValue = "new description value";
		testBundle.setDescription(newStringValue);
		assertEquals(Optional.of(newStringValue), testBundle.getDescription());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.Bundle#setContext}.
	 */
	public void testBundlesetContext() throws InvalidSPDXAnalysisException {
		Bundle testBundle = generator.builderForBundleTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.CONTEXT_TEST_VALUE), testBundle.getContext());
		String newStringValue = "new context value";
		testBundle.setContext(newStringValue);
		assertEquals(Optional.of(newStringValue), testBundle.getContext());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.Bundle#setComment}.
	 */
	public void testBundlesetComment() throws InvalidSPDXAnalysisException {
		Bundle testBundle = generator.builderForBundleTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMMENT_TEST_VALUE), testBundle.getComment());
		String newStringValue = "new comment value";
		testBundle.setComment(newStringValue);
		assertEquals(Optional.of(newStringValue), testBundle.getComment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.Bundle#setName}.
	 */
	public void testBundlesetName() throws InvalidSPDXAnalysisException {
		Bundle testBundle = generator.builderForBundleTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.NAME_TEST_VALUE), testBundle.getName());
		String newStringValue = "new name value";
		testBundle.setName(newStringValue);
		assertEquals(Optional.of(newStringValue), testBundle.getName());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.Bundle#getExtension}.
	 */
	public void testBundlegetExtensions() throws InvalidSPDXAnalysisException {
		Bundle testBundle = generator.builderForBundleTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testBundle.getExtensions())));
//		testBundle.getExtensions().clear();
//		testBundle.getExtensions().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testBundle.getExtensions())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.Bundle#getVerifiedUsing}.
	 */
	public void testBundlegetVerifiedUsings() throws InvalidSPDXAnalysisException {
		Bundle testBundle = generator.builderForBundleTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testBundle.getVerifiedUsings())));
//		testBundle.getVerifiedUsings().clear();
//		testBundle.getVerifiedUsings().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testBundle.getVerifiedUsings())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.Bundle#getRootElement}.
	 */
	public void testBundlegetRootElements() throws InvalidSPDXAnalysisException {
		Bundle testBundle = generator.builderForBundleTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testBundle.getRootElements())));
//		testBundle.getRootElements().clear();
//		testBundle.getRootElements().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testBundle.getRootElements())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.Bundle#getElement}.
	 */
	public void testBundlegetElements() throws InvalidSPDXAnalysisException {
		Bundle testBundle = generator.builderForBundleTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testBundle.getElements())));
//		testBundle.getElements().clear();
//		testBundle.getElements().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testBundle.getElements())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.Bundle#getExternalRef}.
	 */
	public void testBundlegetExternalRefs() throws InvalidSPDXAnalysisException {
		Bundle testBundle = generator.builderForBundleTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testBundle.getExternalRefs())));
//		testBundle.getExternalRefs().clear();
//		testBundle.getExternalRefs().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testBundle.getExternalRefs())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.Bundle#getExternalIdentifier}.
	 */
	public void testBundlegetExternalIdentifiers() throws InvalidSPDXAnalysisException {
		Bundle testBundle = generator.builderForBundleTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testBundle.getExternalIdentifiers())));
//		testBundle.getExternalIdentifiers().clear();
//		testBundle.getExternalIdentifiers().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testBundle.getExternalIdentifiers())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.Bundle#getProfileConformance}.
	 */
	public void testBundlegetProfileConformances() throws InvalidSPDXAnalysisException {
		Bundle testBundle = generator.builderForBundleTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.PROFILE_CONFORMANCE_TEST_LIST1, new ArrayList<>(testBundle.getProfileConformances())));
		testBundle.getProfileConformances().clear();
		testBundle.getProfileConformances().addAll(TestValuesGenerator.PROFILE_CONFORMANCE_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.PROFILE_CONFORMANCE_TEST_LIST2, new ArrayList<>(testBundle.getProfileConformances())));
	}
}