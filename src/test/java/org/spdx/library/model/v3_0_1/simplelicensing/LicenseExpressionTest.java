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
import java.util.regex.Pattern;
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
import org.spdx.library.model.v3_0_1.core.DictionaryEntry;
import org.spdx.library.model.v3_0_1.core.Element;
import org.spdx.library.model.v3_0_1.core.ExternalIdentifier;
import org.spdx.library.model.v3_0_1.core.ExternalRef;
import org.spdx.library.model.v3_0_1.core.IntegrityMethod;
import org.spdx.library.model.v3_0_1.core.ProfileIdentifierType;
import org.spdx.library.model.v3_0_1.extension.Extension;
import org.spdx.library.model.v3_0_1.simplelicensing.LicenseExpression.LicenseExpressionBuilder;

/**
 * GENERATED FILE - DO NOT MODIFY
**/

public class LicenseExpressionTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3_0_1.simplelicensing.LicenseExpression#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		LicenseExpression testLicenseExpression = generator.builderForLicenseExpressionTests(TEST_OBJECT_URI).build();
		List<String> result = testLicenseExpression.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.simplelicensing.LicenseExpression#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		LicenseExpression testLicenseExpression = generator.builderForLicenseExpressionTests(TEST_OBJECT_URI).build();
		assertEquals("SimpleLicensing.LicenseExpression", testLicenseExpression.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.simplelicensing.LicenseExpression#Element(org.spdx.library.model.v3_0_1.simplelicensing.LicenseExpression.LicenseExpressionBuilder)}.
	 */
	public void testLicenseExpressionLicenseExpressionBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForLicenseExpressionTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		LicenseExpression testLicenseExpression = generator.builderForLicenseExpressionTests(TEST_OBJECT_URI).build();
		LicenseExpression test2LicenseExpression = generator.builderForLicenseExpressionTests("https://testObject2").build();
		assertTrue(testLicenseExpression.equivalent(test2LicenseExpression));
		assertTrue(test2LicenseExpression.equivalent(testLicenseExpression));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.simplelicensing.LicenseExpression#setCreationInfo}.
	 */
	public void testLicenseExpressionsetCreationInfo() throws InvalidSPDXAnalysisException {
		LicenseExpression testLicenseExpression = generator.builderForLicenseExpressionTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testLicenseExpression.getCreationInfo());
//		testLicenseExpression.setCreationInfo(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testLicenseExpression.getCreationInfo());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.simplelicensing.LicenseExpression#setLicenseListVersion}.
	 */
	public void testLicenseExpressionsetLicenseListVersion() throws InvalidSPDXAnalysisException {
		LicenseExpression testLicenseExpression = generator.builderForLicenseExpressionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.LICENSE_LIST_VERSION_TEST_VALUE), testLicenseExpression.getLicenseListVersion());
		String newStringValue = UnitTestHelper.genRandPattern("^(0|[1-9]\\d*)\\.(0|[1-9]\\d*)\\.(0|[1-9]\\d*)(?:-((?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*)(?:\\.(?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*))*))?(?:\\+([0-9a-zA-Z-]+(?:\\.[0-9a-zA-Z-]+)*))?$");
		testLicenseExpression.setLicenseListVersion(newStringValue);
		assertEquals(Optional.of(newStringValue), testLicenseExpression.getLicenseListVersion());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.simplelicensing.LicenseExpression#setSummary}.
	 */
	public void testLicenseExpressionsetSummary() throws InvalidSPDXAnalysisException {
		LicenseExpression testLicenseExpression = generator.builderForLicenseExpressionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SUMMARY_TEST_VALUE), testLicenseExpression.getSummary());
		String newStringValue = "new summary value";
		testLicenseExpression.setSummary(newStringValue);
		assertEquals(Optional.of(newStringValue), testLicenseExpression.getSummary());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.simplelicensing.LicenseExpression#setDescription}.
	 */
	public void testLicenseExpressionsetDescription() throws InvalidSPDXAnalysisException {
		LicenseExpression testLicenseExpression = generator.builderForLicenseExpressionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DESCRIPTION_TEST_VALUE), testLicenseExpression.getDescription());
		String newStringValue = "new description value";
		testLicenseExpression.setDescription(newStringValue);
		assertEquals(Optional.of(newStringValue), testLicenseExpression.getDescription());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.simplelicensing.LicenseExpression#setComment}.
	 */
	public void testLicenseExpressionsetComment() throws InvalidSPDXAnalysisException {
		LicenseExpression testLicenseExpression = generator.builderForLicenseExpressionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMMENT_TEST_VALUE), testLicenseExpression.getComment());
		String newStringValue = "new comment value";
		testLicenseExpression.setComment(newStringValue);
		assertEquals(Optional.of(newStringValue), testLicenseExpression.getComment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.simplelicensing.LicenseExpression#setName}.
	 */
	public void testLicenseExpressionsetName() throws InvalidSPDXAnalysisException {
		LicenseExpression testLicenseExpression = generator.builderForLicenseExpressionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.NAME_TEST_VALUE), testLicenseExpression.getName());
		String newStringValue = "new name value";
		testLicenseExpression.setName(newStringValue);
		assertEquals(Optional.of(newStringValue), testLicenseExpression.getName());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.simplelicensing.LicenseExpression#setLicenseExpression}.
	 */
	public void testLicenseExpressionsetLicenseExpression() throws InvalidSPDXAnalysisException {
		LicenseExpression testLicenseExpression = generator.builderForLicenseExpressionTests(TEST_OBJECT_URI).build();
		assertEquals(TestValuesGenerator.LICENSE_EXPRESSION_TEST_VALUE, testLicenseExpression.getLicenseExpression());
		String newStringValue = "new licenseExpression value";
		testLicenseExpression.setLicenseExpression(newStringValue);
		assertEquals(newStringValue, testLicenseExpression.getLicenseExpression());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.simplelicensing.LicenseExpression#getExternalRef}.
	 */
	public void testLicenseExpressiongetExternalRefs() throws InvalidSPDXAnalysisException {
		LicenseExpression testLicenseExpression = generator.builderForLicenseExpressionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testLicenseExpression.getExternalRefs())));
//		testLicenseExpression.getExternalRefs().clear();
//		testLicenseExpression.getExternalRefs().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testLicenseExpression.getExternalRefs())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.simplelicensing.LicenseExpression#getExtension}.
	 */
	public void testLicenseExpressiongetExtensions() throws InvalidSPDXAnalysisException {
		LicenseExpression testLicenseExpression = generator.builderForLicenseExpressionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testLicenseExpression.getExtensions())));
//		testLicenseExpression.getExtensions().clear();
//		testLicenseExpression.getExtensions().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testLicenseExpression.getExtensions())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.simplelicensing.LicenseExpression#getVerifiedUsing}.
	 */
	public void testLicenseExpressiongetVerifiedUsings() throws InvalidSPDXAnalysisException {
		LicenseExpression testLicenseExpression = generator.builderForLicenseExpressionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testLicenseExpression.getVerifiedUsings())));
//		testLicenseExpression.getVerifiedUsings().clear();
//		testLicenseExpression.getVerifiedUsings().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testLicenseExpression.getVerifiedUsings())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.simplelicensing.LicenseExpression#getCustomIdToUri}.
	 */
	public void testLicenseExpressiongetCustomIdToUris() throws InvalidSPDXAnalysisException {
		LicenseExpression testLicenseExpression = generator.builderForLicenseExpressionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testLicenseExpression.getCustomIdToUris())));
//		testLicenseExpression.getCustomIdToUris().clear();
//		testLicenseExpression.getCustomIdToUris().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testLicenseExpression.getCustomIdToUris())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.simplelicensing.LicenseExpression#getExternalIdentifier}.
	 */
	public void testLicenseExpressiongetExternalIdentifiers() throws InvalidSPDXAnalysisException {
		LicenseExpression testLicenseExpression = generator.builderForLicenseExpressionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testLicenseExpression.getExternalIdentifiers())));
//		testLicenseExpression.getExternalIdentifiers().clear();
//		testLicenseExpression.getExternalIdentifiers().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testLicenseExpression.getExternalIdentifiers())));
		//TODO: Implement
	}
}