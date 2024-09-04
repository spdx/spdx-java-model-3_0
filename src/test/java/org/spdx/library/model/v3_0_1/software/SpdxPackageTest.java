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
 
package org.spdx.library.model.v3_0_1.software;

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
import org.spdx.library.model.v3_0_1.core.Agent;
import org.spdx.library.model.v3_0_1.core.CreationInfo;
import org.spdx.library.model.v3_0_1.core.Element;
import org.spdx.library.model.v3_0_1.core.ExternalIdentifier;
import org.spdx.library.model.v3_0_1.core.ExternalRef;
import org.spdx.library.model.v3_0_1.core.IntegrityMethod;
import org.spdx.library.model.v3_0_1.core.ProfileIdentifierType;
import org.spdx.library.model.v3_0_1.core.SupportType;
import org.spdx.library.model.v3_0_1.extension.Extension;
import org.spdx.library.model.v3_0_1.software.SpdxPackage.SpdxPackageBuilder;

/**
 * GENERATED FILE - DO NOT MODIFY
**/

public class SpdxPackageTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3_0_1.software.SpdxPackage#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		SpdxPackage testSpdxPackage = generator.builderForSpdxPackageTests(TEST_OBJECT_URI).build();
		List<String> result = testSpdxPackage.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.software.SpdxPackage#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		SpdxPackage testSpdxPackage = generator.builderForSpdxPackageTests(TEST_OBJECT_URI).build();
		assertEquals("Software.SpdxPackage", testSpdxPackage.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.software.SpdxPackage#Element(org.spdx.library.model.v3_0_1.software.SpdxPackage.SpdxPackageBuilder)}.
	 */
	public void testSpdxPackageSpdxPackageBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForSpdxPackageTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		SpdxPackage testSpdxPackage = generator.builderForSpdxPackageTests(TEST_OBJECT_URI).build();
		SpdxPackage test2SpdxPackage = generator.builderForSpdxPackageTests("https://testObject2").build();
		assertTrue(testSpdxPackage.equivalent(test2SpdxPackage));
		assertTrue(test2SpdxPackage.equivalent(testSpdxPackage));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.software.SpdxPackage#setCreationInfo}.
	 */
	public void testSpdxPackagesetCreationInfo() throws InvalidSPDXAnalysisException {
		SpdxPackage testSpdxPackage = generator.builderForSpdxPackageTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testSpdxPackage.getCreationInfo());
//		testSpdxPackage.setCreationInfo(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testSpdxPackage.getCreationInfo());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.software.SpdxPackage#setSuppliedBy}.
	 */
	public void testSpdxPackagesetSuppliedBy() throws InvalidSPDXAnalysisException {
		SpdxPackage testSpdxPackage = generator.builderForSpdxPackageTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testSpdxPackage.getSuppliedBy());
//		testSpdxPackage.setSuppliedBy(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testSpdxPackage.getSuppliedBy());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.software.SpdxPackage#setPrimaryPurpose}.
	 */
	public void testSpdxPackagesetPrimaryPurpose() throws InvalidSPDXAnalysisException {
		SpdxPackage testSpdxPackage = generator.builderForSpdxPackageTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.PRIMARY_PURPOSE_TEST_VALUE1), testSpdxPackage.getPrimaryPurpose());
		testSpdxPackage.setPrimaryPurpose(TestValuesGenerator.PRIMARY_PURPOSE_TEST_VALUE2);
		assertEquals(Optional.of(TestValuesGenerator.PRIMARY_PURPOSE_TEST_VALUE2), testSpdxPackage.getPrimaryPurpose());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.software.SpdxPackage#setValidUntilTime}.
	 */
	public void testSpdxPackagesetValidUntilTime() throws InvalidSPDXAnalysisException {
		SpdxPackage testSpdxPackage = generator.builderForSpdxPackageTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.VALID_UNTIL_TIME_TEST_VALUE), testSpdxPackage.getValidUntilTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testSpdxPackage.setValidUntilTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testSpdxPackage.getValidUntilTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.software.SpdxPackage#setDownloadLocation}.
	 */
	public void testSpdxPackagesetDownloadLocation() throws InvalidSPDXAnalysisException {
		SpdxPackage testSpdxPackage = generator.builderForSpdxPackageTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DOWNLOAD_LOCATION_TEST_VALUE), testSpdxPackage.getDownloadLocation());
		String newStringValue = "new downloadLocation value";
		testSpdxPackage.setDownloadLocation(newStringValue);
		assertEquals(Optional.of(newStringValue), testSpdxPackage.getDownloadLocation());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.software.SpdxPackage#setBuiltTime}.
	 */
	public void testSpdxPackagesetBuiltTime() throws InvalidSPDXAnalysisException {
		SpdxPackage testSpdxPackage = generator.builderForSpdxPackageTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.BUILT_TIME_TEST_VALUE), testSpdxPackage.getBuiltTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testSpdxPackage.setBuiltTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testSpdxPackage.getBuiltTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.software.SpdxPackage#setSummary}.
	 */
	public void testSpdxPackagesetSummary() throws InvalidSPDXAnalysisException {
		SpdxPackage testSpdxPackage = generator.builderForSpdxPackageTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SUMMARY_TEST_VALUE), testSpdxPackage.getSummary());
		String newStringValue = "new summary value";
		testSpdxPackage.setSummary(newStringValue);
		assertEquals(Optional.of(newStringValue), testSpdxPackage.getSummary());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.software.SpdxPackage#setPackageVersion}.
	 */
	public void testSpdxPackagesetPackageVersion() throws InvalidSPDXAnalysisException {
		SpdxPackage testSpdxPackage = generator.builderForSpdxPackageTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.PACKAGE_VERSION_TEST_VALUE), testSpdxPackage.getPackageVersion());
		String newStringValue = "new packageVersion value";
		testSpdxPackage.setPackageVersion(newStringValue);
		assertEquals(Optional.of(newStringValue), testSpdxPackage.getPackageVersion());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.software.SpdxPackage#setReleaseTime}.
	 */
	public void testSpdxPackagesetReleaseTime() throws InvalidSPDXAnalysisException {
		SpdxPackage testSpdxPackage = generator.builderForSpdxPackageTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.RELEASE_TIME_TEST_VALUE), testSpdxPackage.getReleaseTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testSpdxPackage.setReleaseTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testSpdxPackage.getReleaseTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.software.SpdxPackage#setCopyrightText}.
	 */
	public void testSpdxPackagesetCopyrightText() throws InvalidSPDXAnalysisException {
		SpdxPackage testSpdxPackage = generator.builderForSpdxPackageTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COPYRIGHT_TEXT_TEST_VALUE), testSpdxPackage.getCopyrightText());
		String newStringValue = "new copyrightText value";
		testSpdxPackage.setCopyrightText(newStringValue);
		assertEquals(Optional.of(newStringValue), testSpdxPackage.getCopyrightText());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.software.SpdxPackage#setComment}.
	 */
	public void testSpdxPackagesetComment() throws InvalidSPDXAnalysisException {
		SpdxPackage testSpdxPackage = generator.builderForSpdxPackageTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMMENT_TEST_VALUE), testSpdxPackage.getComment());
		String newStringValue = "new comment value";
		testSpdxPackage.setComment(newStringValue);
		assertEquals(Optional.of(newStringValue), testSpdxPackage.getComment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.software.SpdxPackage#setHomePage}.
	 */
	public void testSpdxPackagesetHomePage() throws InvalidSPDXAnalysisException {
		SpdxPackage testSpdxPackage = generator.builderForSpdxPackageTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.HOME_PAGE_TEST_VALUE), testSpdxPackage.getHomePage());
		String newStringValue = "new homePage value";
		testSpdxPackage.setHomePage(newStringValue);
		assertEquals(Optional.of(newStringValue), testSpdxPackage.getHomePage());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.software.SpdxPackage#setSourceInfo}.
	 */
	public void testSpdxPackagesetSourceInfo() throws InvalidSPDXAnalysisException {
		SpdxPackage testSpdxPackage = generator.builderForSpdxPackageTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SOURCE_INFO_TEST_VALUE), testSpdxPackage.getSourceInfo());
		String newStringValue = "new sourceInfo value";
		testSpdxPackage.setSourceInfo(newStringValue);
		assertEquals(Optional.of(newStringValue), testSpdxPackage.getSourceInfo());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.software.SpdxPackage#setDescription}.
	 */
	public void testSpdxPackagesetDescription() throws InvalidSPDXAnalysisException {
		SpdxPackage testSpdxPackage = generator.builderForSpdxPackageTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DESCRIPTION_TEST_VALUE), testSpdxPackage.getDescription());
		String newStringValue = "new description value";
		testSpdxPackage.setDescription(newStringValue);
		assertEquals(Optional.of(newStringValue), testSpdxPackage.getDescription());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.software.SpdxPackage#setName}.
	 */
	public void testSpdxPackagesetName() throws InvalidSPDXAnalysisException {
		SpdxPackage testSpdxPackage = generator.builderForSpdxPackageTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.NAME_TEST_VALUE), testSpdxPackage.getName());
		String newStringValue = "new name value";
		testSpdxPackage.setName(newStringValue);
		assertEquals(Optional.of(newStringValue), testSpdxPackage.getName());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.software.SpdxPackage#setPackageUrl}.
	 */
	public void testSpdxPackagesetPackageUrl() throws InvalidSPDXAnalysisException {
		SpdxPackage testSpdxPackage = generator.builderForSpdxPackageTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.PACKAGE_URL_TEST_VALUE), testSpdxPackage.getPackageUrl());
		String newStringValue = "new packageUrl value";
		testSpdxPackage.setPackageUrl(newStringValue);
		assertEquals(Optional.of(newStringValue), testSpdxPackage.getPackageUrl());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.software.SpdxPackage#getContentIdentifier}.
	 */
	public void testSpdxPackagegetContentIdentifiers() throws InvalidSPDXAnalysisException {
		SpdxPackage testSpdxPackage = generator.builderForSpdxPackageTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testSpdxPackage.getContentIdentifiers())));
//		testSpdxPackage.getContentIdentifiers().clear();
//		testSpdxPackage.getContentIdentifiers().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testSpdxPackage.getContentIdentifiers())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.software.SpdxPackage#getVerifiedUsing}.
	 */
	public void testSpdxPackagegetVerifiedUsings() throws InvalidSPDXAnalysisException {
		SpdxPackage testSpdxPackage = generator.builderForSpdxPackageTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testSpdxPackage.getVerifiedUsings())));
//		testSpdxPackage.getVerifiedUsings().clear();
//		testSpdxPackage.getVerifiedUsings().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testSpdxPackage.getVerifiedUsings())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.software.SpdxPackage#getExternalRef}.
	 */
	public void testSpdxPackagegetExternalRefs() throws InvalidSPDXAnalysisException {
		SpdxPackage testSpdxPackage = generator.builderForSpdxPackageTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testSpdxPackage.getExternalRefs())));
//		testSpdxPackage.getExternalRefs().clear();
//		testSpdxPackage.getExternalRefs().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testSpdxPackage.getExternalRefs())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.software.SpdxPackage#getExternalIdentifier}.
	 */
	public void testSpdxPackagegetExternalIdentifiers() throws InvalidSPDXAnalysisException {
		SpdxPackage testSpdxPackage = generator.builderForSpdxPackageTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testSpdxPackage.getExternalIdentifiers())));
//		testSpdxPackage.getExternalIdentifiers().clear();
//		testSpdxPackage.getExternalIdentifiers().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testSpdxPackage.getExternalIdentifiers())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.software.SpdxPackage#getExtension}.
	 */
	public void testSpdxPackagegetExtensions() throws InvalidSPDXAnalysisException {
		SpdxPackage testSpdxPackage = generator.builderForSpdxPackageTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testSpdxPackage.getExtensions())));
//		testSpdxPackage.getExtensions().clear();
//		testSpdxPackage.getExtensions().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testSpdxPackage.getExtensions())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.software.SpdxPackage#getOriginatedBy}.
	 */
	public void testSpdxPackagegetOriginatedBys() throws InvalidSPDXAnalysisException {
		SpdxPackage testSpdxPackage = generator.builderForSpdxPackageTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testSpdxPackage.getOriginatedBys())));
//		testSpdxPackage.getOriginatedBys().clear();
//		testSpdxPackage.getOriginatedBys().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testSpdxPackage.getOriginatedBys())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.software.SpdxPackage#getAttributionTexts}.
	 */
	public void testSpdxPackagegetAttributionTexts() throws InvalidSPDXAnalysisException {
		SpdxPackage testSpdxPackage = generator.builderForSpdxPackageTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.ATTRIBUTION_TEXT_TEST_LIST1, new ArrayList<>(testSpdxPackage.getAttributionTexts())));
		testSpdxPackage.getAttributionTexts().clear();
		testSpdxPackage.getAttributionTexts().addAll(TestValuesGenerator.ATTRIBUTION_TEXT_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.ATTRIBUTION_TEXT_TEST_LIST2, new ArrayList<>(testSpdxPackage.getAttributionTexts())));
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.software.SpdxPackage#getStandardNames}.
	 */
	public void testSpdxPackagegetStandardNames() throws InvalidSPDXAnalysisException {
		SpdxPackage testSpdxPackage = generator.builderForSpdxPackageTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.STANDARD_NAME_TEST_LIST1, new ArrayList<>(testSpdxPackage.getStandardNames())));
		testSpdxPackage.getStandardNames().clear();
		testSpdxPackage.getStandardNames().addAll(TestValuesGenerator.STANDARD_NAME_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.STANDARD_NAME_TEST_LIST2, new ArrayList<>(testSpdxPackage.getStandardNames())));
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.software.SpdxPackage#getSupportLevel}.
	 */
	public void testSpdxPackagegetSupportLevels() throws InvalidSPDXAnalysisException {
		SpdxPackage testSpdxPackage = generator.builderForSpdxPackageTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST1, new ArrayList<>(testSpdxPackage.getSupportLevels())));
		testSpdxPackage.getSupportLevels().clear();
		testSpdxPackage.getSupportLevels().addAll(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST2, new ArrayList<>(testSpdxPackage.getSupportLevels())));
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.software.SpdxPackage#getAdditionalPurpose}.
	 */
	public void testSpdxPackagegetAdditionalPurposes() throws InvalidSPDXAnalysisException {
		SpdxPackage testSpdxPackage = generator.builderForSpdxPackageTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.ADDITIONAL_PURPOSE_TEST_LIST1, new ArrayList<>(testSpdxPackage.getAdditionalPurposes())));
		testSpdxPackage.getAdditionalPurposes().clear();
		testSpdxPackage.getAdditionalPurposes().addAll(TestValuesGenerator.ADDITIONAL_PURPOSE_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.ADDITIONAL_PURPOSE_TEST_LIST2, new ArrayList<>(testSpdxPackage.getAdditionalPurposes())));
	}
}