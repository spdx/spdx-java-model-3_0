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
import org.spdx.library.model.v3_0_1.expandedlicensing.WithAdditionOperator.WithAdditionOperatorBuilder;
import org.spdx.library.model.v3_0_1.extension.Extension;
import org.spdx.library.model.v3_0_1.simplelicensing.AnyLicenseInfo;

/**
 * GENERATED FILE - DO NOT MODIFY
**/

public class WithAdditionOperatorTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.WithAdditionOperator#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		WithAdditionOperator testWithAdditionOperator = generator.builderForWithAdditionOperatorTests(TEST_OBJECT_URI).build();
		List<String> result = testWithAdditionOperator.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.WithAdditionOperator#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		WithAdditionOperator testWithAdditionOperator = generator.builderForWithAdditionOperatorTests(TEST_OBJECT_URI).build();
		assertEquals("ExpandedLicensing.WithAdditionOperator", testWithAdditionOperator.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.WithAdditionOperator#Element(org.spdx.library.model.v3_0_1.expandedlicensing.WithAdditionOperator.WithAdditionOperatorBuilder)}.
	 */
	public void testWithAdditionOperatorWithAdditionOperatorBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForWithAdditionOperatorTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		WithAdditionOperator testWithAdditionOperator = generator.builderForWithAdditionOperatorTests(TEST_OBJECT_URI).build();
		WithAdditionOperator test2WithAdditionOperator = generator.builderForWithAdditionOperatorTests("https://testObject2").build();
		assertTrue(testWithAdditionOperator.equivalent(test2WithAdditionOperator));
		assertTrue(test2WithAdditionOperator.equivalent(testWithAdditionOperator));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.WithAdditionOperator#setCreationInfo}.
	 */
	public void testWithAdditionOperatorsetCreationInfo() throws InvalidSPDXAnalysisException {
		WithAdditionOperator testWithAdditionOperator = generator.builderForWithAdditionOperatorTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testWithAdditionOperator.getCreationInfo());
//		testWithAdditionOperator.setCreationInfo(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testWithAdditionOperator.getCreationInfo());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.WithAdditionOperator#setSubjectAddition}.
	 */
	public void testWithAdditionOperatorsetSubjectAddition() throws InvalidSPDXAnalysisException {
		WithAdditionOperator testWithAdditionOperator = generator.builderForWithAdditionOperatorTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testWithAdditionOperator.getSubjectAddition());
//		testWithAdditionOperator.setSubjectAddition(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testWithAdditionOperator.getSubjectAddition());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.WithAdditionOperator#setSubjectExtendableLicense}.
	 */
	public void testWithAdditionOperatorsetSubjectExtendableLicense() throws InvalidSPDXAnalysisException {
		WithAdditionOperator testWithAdditionOperator = generator.builderForWithAdditionOperatorTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testWithAdditionOperator.getSubjectExtendableLicense());
//		testWithAdditionOperator.setSubjectExtendableLicense(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testWithAdditionOperator.getSubjectExtendableLicense());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.WithAdditionOperator#setSummary}.
	 */
	public void testWithAdditionOperatorsetSummary() throws InvalidSPDXAnalysisException {
		WithAdditionOperator testWithAdditionOperator = generator.builderForWithAdditionOperatorTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SUMMARY_TEST_VALUE), testWithAdditionOperator.getSummary());
		String newStringValue = "new summary value";
		testWithAdditionOperator.setSummary(newStringValue);
		assertEquals(Optional.of(newStringValue), testWithAdditionOperator.getSummary());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.WithAdditionOperator#setDescription}.
	 */
	public void testWithAdditionOperatorsetDescription() throws InvalidSPDXAnalysisException {
		WithAdditionOperator testWithAdditionOperator = generator.builderForWithAdditionOperatorTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DESCRIPTION_TEST_VALUE), testWithAdditionOperator.getDescription());
		String newStringValue = "new description value";
		testWithAdditionOperator.setDescription(newStringValue);
		assertEquals(Optional.of(newStringValue), testWithAdditionOperator.getDescription());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.WithAdditionOperator#setComment}.
	 */
	public void testWithAdditionOperatorsetComment() throws InvalidSPDXAnalysisException {
		WithAdditionOperator testWithAdditionOperator = generator.builderForWithAdditionOperatorTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMMENT_TEST_VALUE), testWithAdditionOperator.getComment());
		String newStringValue = "new comment value";
		testWithAdditionOperator.setComment(newStringValue);
		assertEquals(Optional.of(newStringValue), testWithAdditionOperator.getComment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.WithAdditionOperator#setName}.
	 */
	public void testWithAdditionOperatorsetName() throws InvalidSPDXAnalysisException {
		WithAdditionOperator testWithAdditionOperator = generator.builderForWithAdditionOperatorTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.NAME_TEST_VALUE), testWithAdditionOperator.getName());
		String newStringValue = "new name value";
		testWithAdditionOperator.setName(newStringValue);
		assertEquals(Optional.of(newStringValue), testWithAdditionOperator.getName());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.WithAdditionOperator#getExternalRef}.
	 */
	public void testWithAdditionOperatorgetExternalRefs() throws InvalidSPDXAnalysisException {
		WithAdditionOperator testWithAdditionOperator = generator.builderForWithAdditionOperatorTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testWithAdditionOperator.getExternalRefs())));
//		testWithAdditionOperator.getExternalRefs().clear();
//		testWithAdditionOperator.getExternalRefs().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testWithAdditionOperator.getExternalRefs())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.WithAdditionOperator#getExtension}.
	 */
	public void testWithAdditionOperatorgetExtensions() throws InvalidSPDXAnalysisException {
		WithAdditionOperator testWithAdditionOperator = generator.builderForWithAdditionOperatorTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testWithAdditionOperator.getExtensions())));
//		testWithAdditionOperator.getExtensions().clear();
//		testWithAdditionOperator.getExtensions().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testWithAdditionOperator.getExtensions())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.WithAdditionOperator#getVerifiedUsing}.
	 */
	public void testWithAdditionOperatorgetVerifiedUsings() throws InvalidSPDXAnalysisException {
		WithAdditionOperator testWithAdditionOperator = generator.builderForWithAdditionOperatorTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testWithAdditionOperator.getVerifiedUsings())));
//		testWithAdditionOperator.getVerifiedUsings().clear();
//		testWithAdditionOperator.getVerifiedUsings().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testWithAdditionOperator.getVerifiedUsings())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.WithAdditionOperator#getExternalIdentifier}.
	 */
	public void testWithAdditionOperatorgetExternalIdentifiers() throws InvalidSPDXAnalysisException {
		WithAdditionOperator testWithAdditionOperator = generator.builderForWithAdditionOperatorTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testWithAdditionOperator.getExternalIdentifiers())));
//		testWithAdditionOperator.getExternalIdentifiers().clear();
//		testWithAdditionOperator.getExternalIdentifiers().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testWithAdditionOperator.getExternalIdentifiers())));
		//TODO: Implement
	}
}