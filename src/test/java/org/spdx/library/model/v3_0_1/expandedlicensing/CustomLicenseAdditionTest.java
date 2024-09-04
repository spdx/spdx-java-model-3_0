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
import org.spdx.library.model.v3_0_1.expandedlicensing.CustomLicenseAddition.CustomLicenseAdditionBuilder;
import org.spdx.library.model.v3_0_1.extension.Extension;

/**
 * GENERATED FILE - DO NOT MODIFY
**/

public class CustomLicenseAdditionTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.CustomLicenseAddition#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		CustomLicenseAddition testCustomLicenseAddition = generator.builderForCustomLicenseAdditionTests(TEST_OBJECT_URI).build();
		List<String> result = testCustomLicenseAddition.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.CustomLicenseAddition#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		CustomLicenseAddition testCustomLicenseAddition = generator.builderForCustomLicenseAdditionTests(TEST_OBJECT_URI).build();
		assertEquals("ExpandedLicensing.CustomLicenseAddition", testCustomLicenseAddition.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.CustomLicenseAddition#Element(org.spdx.library.model.v3_0_1.expandedlicensing.CustomLicenseAddition.CustomLicenseAdditionBuilder)}.
	 */
	public void testCustomLicenseAdditionCustomLicenseAdditionBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForCustomLicenseAdditionTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		CustomLicenseAddition testCustomLicenseAddition = generator.builderForCustomLicenseAdditionTests(TEST_OBJECT_URI).build();
		CustomLicenseAddition test2CustomLicenseAddition = generator.builderForCustomLicenseAdditionTests("https://testObject2").build();
		assertTrue(testCustomLicenseAddition.equivalent(test2CustomLicenseAddition));
		assertTrue(test2CustomLicenseAddition.equivalent(testCustomLicenseAddition));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.CustomLicenseAddition#setCreationInfo}.
	 */
	public void testCustomLicenseAdditionsetCreationInfo() throws InvalidSPDXAnalysisException {
		CustomLicenseAddition testCustomLicenseAddition = generator.builderForCustomLicenseAdditionTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testCustomLicenseAddition.getCreationInfo());
//		testCustomLicenseAddition.setCreationInfo(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testCustomLicenseAddition.getCreationInfo());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.CustomLicenseAddition#setIsDeprecatedAdditionId}.
	 */
	public void testCustomLicenseAdditionsetIsDeprecatedAdditionId() throws InvalidSPDXAnalysisException {
		CustomLicenseAddition testCustomLicenseAddition = generator.builderForCustomLicenseAdditionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(new Boolean(true)), testCustomLicenseAddition.getIsDeprecatedAdditionId());
		testCustomLicenseAddition.setIsDeprecatedAdditionId(false);
		assertEquals(Optional.of(new Boolean(false)), testCustomLicenseAddition.getIsDeprecatedAdditionId());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.CustomLicenseAddition#setSummary}.
	 */
	public void testCustomLicenseAdditionsetSummary() throws InvalidSPDXAnalysisException {
		CustomLicenseAddition testCustomLicenseAddition = generator.builderForCustomLicenseAdditionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SUMMARY_TEST_VALUE), testCustomLicenseAddition.getSummary());
		String newStringValue = "new summary value";
		testCustomLicenseAddition.setSummary(newStringValue);
		assertEquals(Optional.of(newStringValue), testCustomLicenseAddition.getSummary());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.CustomLicenseAddition#setDescription}.
	 */
	public void testCustomLicenseAdditionsetDescription() throws InvalidSPDXAnalysisException {
		CustomLicenseAddition testCustomLicenseAddition = generator.builderForCustomLicenseAdditionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DESCRIPTION_TEST_VALUE), testCustomLicenseAddition.getDescription());
		String newStringValue = "new description value";
		testCustomLicenseAddition.setDescription(newStringValue);
		assertEquals(Optional.of(newStringValue), testCustomLicenseAddition.getDescription());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.CustomLicenseAddition#setObsoletedBy}.
	 */
	public void testCustomLicenseAdditionsetObsoletedBy() throws InvalidSPDXAnalysisException {
		CustomLicenseAddition testCustomLicenseAddition = generator.builderForCustomLicenseAdditionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.OBSOLETED_BY_TEST_VALUE), testCustomLicenseAddition.getObsoletedBy());
		String newStringValue = "new obsoletedBy value";
		testCustomLicenseAddition.setObsoletedBy(newStringValue);
		assertEquals(Optional.of(newStringValue), testCustomLicenseAddition.getObsoletedBy());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.CustomLicenseAddition#setAdditionText}.
	 */
	public void testCustomLicenseAdditionsetAdditionText() throws InvalidSPDXAnalysisException {
		CustomLicenseAddition testCustomLicenseAddition = generator.builderForCustomLicenseAdditionTests(TEST_OBJECT_URI).build();
		assertEquals(TestValuesGenerator.ADDITION_TEXT_TEST_VALUE, testCustomLicenseAddition.getAdditionText());
		String newStringValue = "new additionText value";
		testCustomLicenseAddition.setAdditionText(newStringValue);
		assertEquals(newStringValue, testCustomLicenseAddition.getAdditionText());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.CustomLicenseAddition#setLicenseXml}.
	 */
	public void testCustomLicenseAdditionsetLicenseXml() throws InvalidSPDXAnalysisException {
		CustomLicenseAddition testCustomLicenseAddition = generator.builderForCustomLicenseAdditionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.LICENSE_XML_TEST_VALUE), testCustomLicenseAddition.getLicenseXml());
		String newStringValue = "new licenseXml value";
		testCustomLicenseAddition.setLicenseXml(newStringValue);
		assertEquals(Optional.of(newStringValue), testCustomLicenseAddition.getLicenseXml());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.CustomLicenseAddition#setComment}.
	 */
	public void testCustomLicenseAdditionsetComment() throws InvalidSPDXAnalysisException {
		CustomLicenseAddition testCustomLicenseAddition = generator.builderForCustomLicenseAdditionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMMENT_TEST_VALUE), testCustomLicenseAddition.getComment());
		String newStringValue = "new comment value";
		testCustomLicenseAddition.setComment(newStringValue);
		assertEquals(Optional.of(newStringValue), testCustomLicenseAddition.getComment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.CustomLicenseAddition#setName}.
	 */
	public void testCustomLicenseAdditionsetName() throws InvalidSPDXAnalysisException {
		CustomLicenseAddition testCustomLicenseAddition = generator.builderForCustomLicenseAdditionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.NAME_TEST_VALUE), testCustomLicenseAddition.getName());
		String newStringValue = "new name value";
		testCustomLicenseAddition.setName(newStringValue);
		assertEquals(Optional.of(newStringValue), testCustomLicenseAddition.getName());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.CustomLicenseAddition#setStandardAdditionTemplate}.
	 */
	public void testCustomLicenseAdditionsetStandardAdditionTemplate() throws InvalidSPDXAnalysisException {
		CustomLicenseAddition testCustomLicenseAddition = generator.builderForCustomLicenseAdditionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.STANDARD_ADDITION_TEMPLATE_TEST_VALUE), testCustomLicenseAddition.getStandardAdditionTemplate());
		String newStringValue = "new standardAdditionTemplate value";
		testCustomLicenseAddition.setStandardAdditionTemplate(newStringValue);
		assertEquals(Optional.of(newStringValue), testCustomLicenseAddition.getStandardAdditionTemplate());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.CustomLicenseAddition#getExtension}.
	 */
	public void testCustomLicenseAdditiongetExtensions() throws InvalidSPDXAnalysisException {
		CustomLicenseAddition testCustomLicenseAddition = generator.builderForCustomLicenseAdditionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testCustomLicenseAddition.getExtensions())));
//		testCustomLicenseAddition.getExtensions().clear();
//		testCustomLicenseAddition.getExtensions().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testCustomLicenseAddition.getExtensions())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.CustomLicenseAddition#getVerifiedUsing}.
	 */
	public void testCustomLicenseAdditiongetVerifiedUsings() throws InvalidSPDXAnalysisException {
		CustomLicenseAddition testCustomLicenseAddition = generator.builderForCustomLicenseAdditionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testCustomLicenseAddition.getVerifiedUsings())));
//		testCustomLicenseAddition.getVerifiedUsings().clear();
//		testCustomLicenseAddition.getVerifiedUsings().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testCustomLicenseAddition.getVerifiedUsings())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.CustomLicenseAddition#getExternalRef}.
	 */
	public void testCustomLicenseAdditiongetExternalRefs() throws InvalidSPDXAnalysisException {
		CustomLicenseAddition testCustomLicenseAddition = generator.builderForCustomLicenseAdditionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testCustomLicenseAddition.getExternalRefs())));
//		testCustomLicenseAddition.getExternalRefs().clear();
//		testCustomLicenseAddition.getExternalRefs().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testCustomLicenseAddition.getExternalRefs())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.CustomLicenseAddition#getExternalIdentifier}.
	 */
	public void testCustomLicenseAdditiongetExternalIdentifiers() throws InvalidSPDXAnalysisException {
		CustomLicenseAddition testCustomLicenseAddition = generator.builderForCustomLicenseAdditionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testCustomLicenseAddition.getExternalIdentifiers())));
//		testCustomLicenseAddition.getExternalIdentifiers().clear();
//		testCustomLicenseAddition.getExternalIdentifiers().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testCustomLicenseAddition.getExternalIdentifiers())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.CustomLicenseAddition#getSeeAlsos}.
	 */
	public void testCustomLicenseAdditiongetSeeAlsos() throws InvalidSPDXAnalysisException {
		CustomLicenseAddition testCustomLicenseAddition = generator.builderForCustomLicenseAdditionTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SEE_ALSO_TEST_LIST1, new ArrayList<>(testCustomLicenseAddition.getSeeAlsos())));
		testCustomLicenseAddition.getSeeAlsos().clear();
		testCustomLicenseAddition.getSeeAlsos().addAll(TestValuesGenerator.SEE_ALSO_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SEE_ALSO_TEST_LIST2, new ArrayList<>(testCustomLicenseAddition.getSeeAlsos())));
	}
}