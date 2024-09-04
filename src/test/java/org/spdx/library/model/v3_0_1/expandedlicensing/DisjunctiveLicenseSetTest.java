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
import org.spdx.library.model.v3_0_1.expandedlicensing.DisjunctiveLicenseSet.DisjunctiveLicenseSetBuilder;
import org.spdx.library.model.v3_0_1.extension.Extension;
import org.spdx.library.model.v3_0_1.simplelicensing.AnyLicenseInfo;

/**
 * GENERATED FILE - DO NOT MODIFY
**/

public class DisjunctiveLicenseSetTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.DisjunctiveLicenseSet#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		DisjunctiveLicenseSet testDisjunctiveLicenseSet = generator.builderForDisjunctiveLicenseSetTests(TEST_OBJECT_URI).build();
		List<String> result = testDisjunctiveLicenseSet.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.DisjunctiveLicenseSet#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		DisjunctiveLicenseSet testDisjunctiveLicenseSet = generator.builderForDisjunctiveLicenseSetTests(TEST_OBJECT_URI).build();
		assertEquals("ExpandedLicensing.DisjunctiveLicenseSet", testDisjunctiveLicenseSet.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.DisjunctiveLicenseSet#Element(org.spdx.library.model.v3_0_1.expandedlicensing.DisjunctiveLicenseSet.DisjunctiveLicenseSetBuilder)}.
	 */
	public void testDisjunctiveLicenseSetDisjunctiveLicenseSetBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForDisjunctiveLicenseSetTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		DisjunctiveLicenseSet testDisjunctiveLicenseSet = generator.builderForDisjunctiveLicenseSetTests(TEST_OBJECT_URI).build();
		DisjunctiveLicenseSet test2DisjunctiveLicenseSet = generator.builderForDisjunctiveLicenseSetTests("https://testObject2").build();
		assertTrue(testDisjunctiveLicenseSet.equivalent(test2DisjunctiveLicenseSet));
		assertTrue(test2DisjunctiveLicenseSet.equivalent(testDisjunctiveLicenseSet));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.DisjunctiveLicenseSet#setCreationInfo}.
	 */
	public void testDisjunctiveLicenseSetsetCreationInfo() throws InvalidSPDXAnalysisException {
		DisjunctiveLicenseSet testDisjunctiveLicenseSet = generator.builderForDisjunctiveLicenseSetTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testDisjunctiveLicenseSet.getCreationInfo());
//		testDisjunctiveLicenseSet.setCreationInfo(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testDisjunctiveLicenseSet.getCreationInfo());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.DisjunctiveLicenseSet#setSummary}.
	 */
	public void testDisjunctiveLicenseSetsetSummary() throws InvalidSPDXAnalysisException {
		DisjunctiveLicenseSet testDisjunctiveLicenseSet = generator.builderForDisjunctiveLicenseSetTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SUMMARY_TEST_VALUE), testDisjunctiveLicenseSet.getSummary());
		String newStringValue = "new summary value";
		testDisjunctiveLicenseSet.setSummary(newStringValue);
		assertEquals(Optional.of(newStringValue), testDisjunctiveLicenseSet.getSummary());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.DisjunctiveLicenseSet#setDescription}.
	 */
	public void testDisjunctiveLicenseSetsetDescription() throws InvalidSPDXAnalysisException {
		DisjunctiveLicenseSet testDisjunctiveLicenseSet = generator.builderForDisjunctiveLicenseSetTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DESCRIPTION_TEST_VALUE), testDisjunctiveLicenseSet.getDescription());
		String newStringValue = "new description value";
		testDisjunctiveLicenseSet.setDescription(newStringValue);
		assertEquals(Optional.of(newStringValue), testDisjunctiveLicenseSet.getDescription());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.DisjunctiveLicenseSet#setComment}.
	 */
	public void testDisjunctiveLicenseSetsetComment() throws InvalidSPDXAnalysisException {
		DisjunctiveLicenseSet testDisjunctiveLicenseSet = generator.builderForDisjunctiveLicenseSetTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMMENT_TEST_VALUE), testDisjunctiveLicenseSet.getComment());
		String newStringValue = "new comment value";
		testDisjunctiveLicenseSet.setComment(newStringValue);
		assertEquals(Optional.of(newStringValue), testDisjunctiveLicenseSet.getComment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.DisjunctiveLicenseSet#setName}.
	 */
	public void testDisjunctiveLicenseSetsetName() throws InvalidSPDXAnalysisException {
		DisjunctiveLicenseSet testDisjunctiveLicenseSet = generator.builderForDisjunctiveLicenseSetTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.NAME_TEST_VALUE), testDisjunctiveLicenseSet.getName());
		String newStringValue = "new name value";
		testDisjunctiveLicenseSet.setName(newStringValue);
		assertEquals(Optional.of(newStringValue), testDisjunctiveLicenseSet.getName());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.DisjunctiveLicenseSet#getExternalRef}.
	 */
	public void testDisjunctiveLicenseSetgetExternalRefs() throws InvalidSPDXAnalysisException {
		DisjunctiveLicenseSet testDisjunctiveLicenseSet = generator.builderForDisjunctiveLicenseSetTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testDisjunctiveLicenseSet.getExternalRefs())));
//		testDisjunctiveLicenseSet.getExternalRefs().clear();
//		testDisjunctiveLicenseSet.getExternalRefs().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testDisjunctiveLicenseSet.getExternalRefs())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.DisjunctiveLicenseSet#getExtension}.
	 */
	public void testDisjunctiveLicenseSetgetExtensions() throws InvalidSPDXAnalysisException {
		DisjunctiveLicenseSet testDisjunctiveLicenseSet = generator.builderForDisjunctiveLicenseSetTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testDisjunctiveLicenseSet.getExtensions())));
//		testDisjunctiveLicenseSet.getExtensions().clear();
//		testDisjunctiveLicenseSet.getExtensions().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testDisjunctiveLicenseSet.getExtensions())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.DisjunctiveLicenseSet#getVerifiedUsing}.
	 */
	public void testDisjunctiveLicenseSetgetVerifiedUsings() throws InvalidSPDXAnalysisException {
		DisjunctiveLicenseSet testDisjunctiveLicenseSet = generator.builderForDisjunctiveLicenseSetTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testDisjunctiveLicenseSet.getVerifiedUsings())));
//		testDisjunctiveLicenseSet.getVerifiedUsings().clear();
//		testDisjunctiveLicenseSet.getVerifiedUsings().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testDisjunctiveLicenseSet.getVerifiedUsings())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.DisjunctiveLicenseSet#getExternalIdentifier}.
	 */
	public void testDisjunctiveLicenseSetgetExternalIdentifiers() throws InvalidSPDXAnalysisException {
		DisjunctiveLicenseSet testDisjunctiveLicenseSet = generator.builderForDisjunctiveLicenseSetTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testDisjunctiveLicenseSet.getExternalIdentifiers())));
//		testDisjunctiveLicenseSet.getExternalIdentifiers().clear();
//		testDisjunctiveLicenseSet.getExternalIdentifiers().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testDisjunctiveLicenseSet.getExternalIdentifiers())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.DisjunctiveLicenseSet#getMembers}.
	 */
	public void testDisjunctiveLicenseSetgetMembers() throws InvalidSPDXAnalysisException {
		DisjunctiveLicenseSet testDisjunctiveLicenseSet = generator.builderForDisjunctiveLicenseSetTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testDisjunctiveLicenseSet.getMembers())));
//		testDisjunctiveLicenseSet.getMembers().clear();
//		testDisjunctiveLicenseSet.getMembers().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testDisjunctiveLicenseSet.getMember())));
		//TODO: Implement
	}
}