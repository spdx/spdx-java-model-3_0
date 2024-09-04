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
 
package org.spdx.library.model.v3_0_1.expandedlicensing;

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
import java.util.HashSet;
import java.util.Iterator;
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
import org.spdx.library.model.v3_0_1.core.ExternalIdentifier;
import org.spdx.library.model.v3_0_1.core.ExternalRef;
import org.spdx.library.model.v3_0_1.core.IntegrityMethod;
import org.spdx.library.model.v3_0_1.core.ProfileIdentifierType;
import org.spdx.library.model.v3_0_1.expandedlicensing.ConjunctiveLicenseSet.ConjunctiveLicenseSetBuilder;
import org.spdx.library.model.v3_0_1.extension.Extension;
import org.spdx.library.model.v3_0_1.simplelicensing.AnyLicenseInfo;

/**
 * GENERATED FILE - DO NOT MODIFY
**/

public class ConjunctiveLicenseSetTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.ConjunctiveLicenseSet#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		ConjunctiveLicenseSet testConjunctiveLicenseSet = generator.builderForConjunctiveLicenseSetTests(TEST_OBJECT_URI).build();
		List<String> result = testConjunctiveLicenseSet.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.ConjunctiveLicenseSet#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		ConjunctiveLicenseSet testConjunctiveLicenseSet = generator.builderForConjunctiveLicenseSetTests(TEST_OBJECT_URI).build();
		assertEquals("ExpandedLicensing.ConjunctiveLicenseSet", testConjunctiveLicenseSet.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.ConjunctiveLicenseSet#Element(org.spdx.library.model.v3_0_1.expandedlicensing.ConjunctiveLicenseSet.ConjunctiveLicenseSetBuilder)}.
	 */
	public void testConjunctiveLicenseSetConjunctiveLicenseSetBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForConjunctiveLicenseSetTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		ConjunctiveLicenseSet testConjunctiveLicenseSet = generator.builderForConjunctiveLicenseSetTests(TEST_OBJECT_URI).build();
		ConjunctiveLicenseSet test2ConjunctiveLicenseSet = generator.builderForConjunctiveLicenseSetTests("https://testObject2").build();
		assertTrue(testConjunctiveLicenseSet.equivalent(test2ConjunctiveLicenseSet));
		assertTrue(test2ConjunctiveLicenseSet.equivalent(testConjunctiveLicenseSet));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.ConjunctiveLicenseSet#setCreationInfo}.
	 */
	public void testConjunctiveLicenseSetsetCreationInfo() throws InvalidSPDXAnalysisException {
		ConjunctiveLicenseSet testConjunctiveLicenseSet = generator.builderForConjunctiveLicenseSetTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testConjunctiveLicenseSet.getCreationInfo());
//		testConjunctiveLicenseSet.setCreationInfo(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testConjunctiveLicenseSet.getCreationInfo());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.ConjunctiveLicenseSet#setSummary}.
	 */
	public void testConjunctiveLicenseSetsetSummary() throws InvalidSPDXAnalysisException {
		ConjunctiveLicenseSet testConjunctiveLicenseSet = generator.builderForConjunctiveLicenseSetTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SUMMARY_TEST_VALUE), testConjunctiveLicenseSet.getSummary());
		String newStringValue = "new summary value";
		testConjunctiveLicenseSet.setSummary(newStringValue);
		assertEquals(Optional.of(newStringValue), testConjunctiveLicenseSet.getSummary());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.ConjunctiveLicenseSet#setDescription}.
	 */
	public void testConjunctiveLicenseSetsetDescription() throws InvalidSPDXAnalysisException {
		ConjunctiveLicenseSet testConjunctiveLicenseSet = generator.builderForConjunctiveLicenseSetTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DESCRIPTION_TEST_VALUE), testConjunctiveLicenseSet.getDescription());
		String newStringValue = "new description value";
		testConjunctiveLicenseSet.setDescription(newStringValue);
		assertEquals(Optional.of(newStringValue), testConjunctiveLicenseSet.getDescription());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.ConjunctiveLicenseSet#setComment}.
	 */
	public void testConjunctiveLicenseSetsetComment() throws InvalidSPDXAnalysisException {
		ConjunctiveLicenseSet testConjunctiveLicenseSet = generator.builderForConjunctiveLicenseSetTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMMENT_TEST_VALUE), testConjunctiveLicenseSet.getComment());
		String newStringValue = "new comment value";
		testConjunctiveLicenseSet.setComment(newStringValue);
		assertEquals(Optional.of(newStringValue), testConjunctiveLicenseSet.getComment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.ConjunctiveLicenseSet#setName}.
	 */
	public void testConjunctiveLicenseSetsetName() throws InvalidSPDXAnalysisException {
		ConjunctiveLicenseSet testConjunctiveLicenseSet = generator.builderForConjunctiveLicenseSetTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.NAME_TEST_VALUE), testConjunctiveLicenseSet.getName());
		String newStringValue = "new name value";
		testConjunctiveLicenseSet.setName(newStringValue);
		assertEquals(Optional.of(newStringValue), testConjunctiveLicenseSet.getName());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.ConjunctiveLicenseSet#getExternalRef}.
	 */
	public void testConjunctiveLicenseSetgetExternalRefs() throws InvalidSPDXAnalysisException {
		ConjunctiveLicenseSet testConjunctiveLicenseSet = generator.builderForConjunctiveLicenseSetTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testConjunctiveLicenseSet.getExternalRefs())));
//		testConjunctiveLicenseSet.getExternalRefs().clear();
//		testConjunctiveLicenseSet.getExternalRefs().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testConjunctiveLicenseSet.getExternalRefs())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.ConjunctiveLicenseSet#getExtension}.
	 */
	public void testConjunctiveLicenseSetgetExtensions() throws InvalidSPDXAnalysisException {
		ConjunctiveLicenseSet testConjunctiveLicenseSet = generator.builderForConjunctiveLicenseSetTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testConjunctiveLicenseSet.getExtensions())));
//		testConjunctiveLicenseSet.getExtensions().clear();
//		testConjunctiveLicenseSet.getExtensions().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testConjunctiveLicenseSet.getExtensions())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.ConjunctiveLicenseSet#getVerifiedUsing}.
	 */
	public void testConjunctiveLicenseSetgetVerifiedUsings() throws InvalidSPDXAnalysisException {
		ConjunctiveLicenseSet testConjunctiveLicenseSet = generator.builderForConjunctiveLicenseSetTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testConjunctiveLicenseSet.getVerifiedUsings())));
//		testConjunctiveLicenseSet.getVerifiedUsings().clear();
//		testConjunctiveLicenseSet.getVerifiedUsings().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testConjunctiveLicenseSet.getVerifiedUsings())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.ConjunctiveLicenseSet#getExternalIdentifier}.
	 */
	public void testConjunctiveLicenseSetgetExternalIdentifiers() throws InvalidSPDXAnalysisException {
		ConjunctiveLicenseSet testConjunctiveLicenseSet = generator.builderForConjunctiveLicenseSetTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testConjunctiveLicenseSet.getExternalIdentifiers())));
//		testConjunctiveLicenseSet.getExternalIdentifiers().clear();
//		testConjunctiveLicenseSet.getExternalIdentifiers().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testConjunctiveLicenseSet.getExternalIdentifiers())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.ConjunctiveLicenseSet#getMembers}.
	 */
	public void testConjunctiveLicenseSetgetMembers() throws InvalidSPDXAnalysisException {
		ConjunctiveLicenseSet testConjunctiveLicenseSet = generator.builderForConjunctiveLicenseSetTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testConjunctiveLicenseSet.getMembers())));
//		testConjunctiveLicenseSet.getMembers().clear();
//		testConjunctiveLicenseSet.getMembers().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testConjunctiveLicenseSet.getMember())));
		//TODO: Implement
	}
}