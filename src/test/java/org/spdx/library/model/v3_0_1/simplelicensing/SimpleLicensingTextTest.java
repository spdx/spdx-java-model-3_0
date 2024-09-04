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
 
package org.spdx.library.model.v3_0_1.simplelicensing;

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
import org.spdx.library.model.v3_0_1.extension.Extension;
import org.spdx.library.model.v3_0_1.simplelicensing.SimpleLicensingText.SimpleLicensingTextBuilder;

/**
 * GENERATED FILE - DO NOT MODIFY
**/

public class SimpleLicensingTextTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3_0_1.simplelicensing.SimpleLicensingText#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		SimpleLicensingText testSimpleLicensingText = generator.builderForSimpleLicensingTextTests(TEST_OBJECT_URI).build();
		List<String> result = testSimpleLicensingText.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.simplelicensing.SimpleLicensingText#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		SimpleLicensingText testSimpleLicensingText = generator.builderForSimpleLicensingTextTests(TEST_OBJECT_URI).build();
		assertEquals("SimpleLicensing.SimpleLicensingText", testSimpleLicensingText.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.simplelicensing.SimpleLicensingText#Element(org.spdx.library.model.v3_0_1.simplelicensing.SimpleLicensingText.SimpleLicensingTextBuilder)}.
	 */
	public void testSimpleLicensingTextSimpleLicensingTextBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForSimpleLicensingTextTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		SimpleLicensingText testSimpleLicensingText = generator.builderForSimpleLicensingTextTests(TEST_OBJECT_URI).build();
		SimpleLicensingText test2SimpleLicensingText = generator.builderForSimpleLicensingTextTests("https://testObject2").build();
		assertTrue(testSimpleLicensingText.equivalent(test2SimpleLicensingText));
		assertTrue(test2SimpleLicensingText.equivalent(testSimpleLicensingText));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.simplelicensing.SimpleLicensingText#setCreationInfo}.
	 */
	public void testSimpleLicensingTextsetCreationInfo() throws InvalidSPDXAnalysisException {
		SimpleLicensingText testSimpleLicensingText = generator.builderForSimpleLicensingTextTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testSimpleLicensingText.getCreationInfo());
//		testSimpleLicensingText.setCreationInfo(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testSimpleLicensingText.getCreationInfo());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.simplelicensing.SimpleLicensingText#setLicenseText}.
	 */
	public void testSimpleLicensingTextsetLicenseText() throws InvalidSPDXAnalysisException {
		SimpleLicensingText testSimpleLicensingText = generator.builderForSimpleLicensingTextTests(TEST_OBJECT_URI).build();
		assertEquals(TestValuesGenerator.LICENSE_TEXT_TEST_VALUE, testSimpleLicensingText.getLicenseText());
		String newStringValue = "new licenseText value";
		testSimpleLicensingText.setLicenseText(newStringValue);
		assertEquals(newStringValue, testSimpleLicensingText.getLicenseText());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.simplelicensing.SimpleLicensingText#setSummary}.
	 */
	public void testSimpleLicensingTextsetSummary() throws InvalidSPDXAnalysisException {
		SimpleLicensingText testSimpleLicensingText = generator.builderForSimpleLicensingTextTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SUMMARY_TEST_VALUE), testSimpleLicensingText.getSummary());
		String newStringValue = "new summary value";
		testSimpleLicensingText.setSummary(newStringValue);
		assertEquals(Optional.of(newStringValue), testSimpleLicensingText.getSummary());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.simplelicensing.SimpleLicensingText#setDescription}.
	 */
	public void testSimpleLicensingTextsetDescription() throws InvalidSPDXAnalysisException {
		SimpleLicensingText testSimpleLicensingText = generator.builderForSimpleLicensingTextTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DESCRIPTION_TEST_VALUE), testSimpleLicensingText.getDescription());
		String newStringValue = "new description value";
		testSimpleLicensingText.setDescription(newStringValue);
		assertEquals(Optional.of(newStringValue), testSimpleLicensingText.getDescription());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.simplelicensing.SimpleLicensingText#setComment}.
	 */
	public void testSimpleLicensingTextsetComment() throws InvalidSPDXAnalysisException {
		SimpleLicensingText testSimpleLicensingText = generator.builderForSimpleLicensingTextTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMMENT_TEST_VALUE), testSimpleLicensingText.getComment());
		String newStringValue = "new comment value";
		testSimpleLicensingText.setComment(newStringValue);
		assertEquals(Optional.of(newStringValue), testSimpleLicensingText.getComment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.simplelicensing.SimpleLicensingText#setName}.
	 */
	public void testSimpleLicensingTextsetName() throws InvalidSPDXAnalysisException {
		SimpleLicensingText testSimpleLicensingText = generator.builderForSimpleLicensingTextTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.NAME_TEST_VALUE), testSimpleLicensingText.getName());
		String newStringValue = "new name value";
		testSimpleLicensingText.setName(newStringValue);
		assertEquals(Optional.of(newStringValue), testSimpleLicensingText.getName());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.simplelicensing.SimpleLicensingText#getExternalRef}.
	 */
	public void testSimpleLicensingTextgetExternalRefs() throws InvalidSPDXAnalysisException {
		SimpleLicensingText testSimpleLicensingText = generator.builderForSimpleLicensingTextTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testSimpleLicensingText.getExternalRefs())));
//		testSimpleLicensingText.getExternalRefs().clear();
//		testSimpleLicensingText.getExternalRefs().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testSimpleLicensingText.getExternalRefs())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.simplelicensing.SimpleLicensingText#getExtension}.
	 */
	public void testSimpleLicensingTextgetExtensions() throws InvalidSPDXAnalysisException {
		SimpleLicensingText testSimpleLicensingText = generator.builderForSimpleLicensingTextTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testSimpleLicensingText.getExtensions())));
//		testSimpleLicensingText.getExtensions().clear();
//		testSimpleLicensingText.getExtensions().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testSimpleLicensingText.getExtensions())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.simplelicensing.SimpleLicensingText#getVerifiedUsing}.
	 */
	public void testSimpleLicensingTextgetVerifiedUsings() throws InvalidSPDXAnalysisException {
		SimpleLicensingText testSimpleLicensingText = generator.builderForSimpleLicensingTextTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testSimpleLicensingText.getVerifiedUsings())));
//		testSimpleLicensingText.getVerifiedUsings().clear();
//		testSimpleLicensingText.getVerifiedUsings().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testSimpleLicensingText.getVerifiedUsings())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.simplelicensing.SimpleLicensingText#getExternalIdentifier}.
	 */
	public void testSimpleLicensingTextgetExternalIdentifiers() throws InvalidSPDXAnalysisException {
		SimpleLicensingText testSimpleLicensingText = generator.builderForSimpleLicensingTextTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testSimpleLicensingText.getExternalIdentifiers())));
//		testSimpleLicensingText.getExternalIdentifiers().clear();
//		testSimpleLicensingText.getExternalIdentifiers().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testSimpleLicensingText.getExternalIdentifiers())));
		//TODO: Implement
	}
}