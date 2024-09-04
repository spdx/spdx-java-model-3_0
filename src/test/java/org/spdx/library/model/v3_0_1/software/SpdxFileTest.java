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
import org.spdx.library.model.v3_0_1.software.SpdxFile.SpdxFileBuilder;

/**
 * GENERATED FILE - DO NOT MODIFY
**/

public class SpdxFileTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3_0_1.software.SpdxFile#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		SpdxFile testSpdxFile = generator.builderForSpdxFileTests(TEST_OBJECT_URI).build();
		List<String> result = testSpdxFile.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.software.SpdxFile#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		SpdxFile testSpdxFile = generator.builderForSpdxFileTests(TEST_OBJECT_URI).build();
		assertEquals("Software.SpdxFile", testSpdxFile.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.software.SpdxFile#Element(org.spdx.library.model.v3_0_1.software.SpdxFile.SpdxFileBuilder)}.
	 */
	public void testSpdxFileSpdxFileBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForSpdxFileTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		SpdxFile testSpdxFile = generator.builderForSpdxFileTests(TEST_OBJECT_URI).build();
		SpdxFile test2SpdxFile = generator.builderForSpdxFileTests("https://testObject2").build();
		assertTrue(testSpdxFile.equivalent(test2SpdxFile));
		assertTrue(test2SpdxFile.equivalent(testSpdxFile));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.software.SpdxFile#setCreationInfo}.
	 */
	public void testSpdxFilesetCreationInfo() throws InvalidSPDXAnalysisException {
		SpdxFile testSpdxFile = generator.builderForSpdxFileTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testSpdxFile.getCreationInfo());
//		testSpdxFile.setCreationInfo(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testSpdxFile.getCreationInfo());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.software.SpdxFile#setSuppliedBy}.
	 */
	public void testSpdxFilesetSuppliedBy() throws InvalidSPDXAnalysisException {
		SpdxFile testSpdxFile = generator.builderForSpdxFileTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testSpdxFile.getSuppliedBy());
//		testSpdxFile.setSuppliedBy(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testSpdxFile.getSuppliedBy());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.software.SpdxFile#setPrimaryPurpose}.
	 */
	public void testSpdxFilesetPrimaryPurpose() throws InvalidSPDXAnalysisException {
		SpdxFile testSpdxFile = generator.builderForSpdxFileTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.PRIMARY_PURPOSE_TEST_VALUE1), testSpdxFile.getPrimaryPurpose());
		testSpdxFile.setPrimaryPurpose(TestValuesGenerator.PRIMARY_PURPOSE_TEST_VALUE2);
		assertEquals(Optional.of(TestValuesGenerator.PRIMARY_PURPOSE_TEST_VALUE2), testSpdxFile.getPrimaryPurpose());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.software.SpdxFile#setFileKind}.
	 */
	public void testSpdxFilesetFileKind() throws InvalidSPDXAnalysisException {
		SpdxFile testSpdxFile = generator.builderForSpdxFileTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.FILE_KIND_TEST_VALUE1), testSpdxFile.getFileKind());
		testSpdxFile.setFileKind(TestValuesGenerator.FILE_KIND_TEST_VALUE2);
		assertEquals(Optional.of(TestValuesGenerator.FILE_KIND_TEST_VALUE2), testSpdxFile.getFileKind());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.software.SpdxFile#setValidUntilTime}.
	 */
	public void testSpdxFilesetValidUntilTime() throws InvalidSPDXAnalysisException {
		SpdxFile testSpdxFile = generator.builderForSpdxFileTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.VALID_UNTIL_TIME_TEST_VALUE), testSpdxFile.getValidUntilTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testSpdxFile.setValidUntilTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testSpdxFile.getValidUntilTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.software.SpdxFile#setBuiltTime}.
	 */
	public void testSpdxFilesetBuiltTime() throws InvalidSPDXAnalysisException {
		SpdxFile testSpdxFile = generator.builderForSpdxFileTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.BUILT_TIME_TEST_VALUE), testSpdxFile.getBuiltTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testSpdxFile.setBuiltTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testSpdxFile.getBuiltTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.software.SpdxFile#setSummary}.
	 */
	public void testSpdxFilesetSummary() throws InvalidSPDXAnalysisException {
		SpdxFile testSpdxFile = generator.builderForSpdxFileTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SUMMARY_TEST_VALUE), testSpdxFile.getSummary());
		String newStringValue = "new summary value";
		testSpdxFile.setSummary(newStringValue);
		assertEquals(Optional.of(newStringValue), testSpdxFile.getSummary());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.software.SpdxFile#setDescription}.
	 */
	public void testSpdxFilesetDescription() throws InvalidSPDXAnalysisException {
		SpdxFile testSpdxFile = generator.builderForSpdxFileTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DESCRIPTION_TEST_VALUE), testSpdxFile.getDescription());
		String newStringValue = "new description value";
		testSpdxFile.setDescription(newStringValue);
		assertEquals(Optional.of(newStringValue), testSpdxFile.getDescription());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.software.SpdxFile#setReleaseTime}.
	 */
	public void testSpdxFilesetReleaseTime() throws InvalidSPDXAnalysisException {
		SpdxFile testSpdxFile = generator.builderForSpdxFileTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.RELEASE_TIME_TEST_VALUE), testSpdxFile.getReleaseTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testSpdxFile.setReleaseTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testSpdxFile.getReleaseTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.software.SpdxFile#setCopyrightText}.
	 */
	public void testSpdxFilesetCopyrightText() throws InvalidSPDXAnalysisException {
		SpdxFile testSpdxFile = generator.builderForSpdxFileTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COPYRIGHT_TEXT_TEST_VALUE), testSpdxFile.getCopyrightText());
		String newStringValue = "new copyrightText value";
		testSpdxFile.setCopyrightText(newStringValue);
		assertEquals(Optional.of(newStringValue), testSpdxFile.getCopyrightText());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.software.SpdxFile#setContentType}.
	 */
	public void testSpdxFilesetContentType() throws InvalidSPDXAnalysisException {
		SpdxFile testSpdxFile = generator.builderForSpdxFileTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.CONTENT_TYPE_TEST_VALUE), testSpdxFile.getContentType());
		String newStringValue = UnitTestHelper.genRandPattern("^[^\\/]+\\/[^\\/]+$");
		testSpdxFile.setContentType(newStringValue);
		assertEquals(Optional.of(newStringValue), testSpdxFile.getContentType());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.software.SpdxFile#setComment}.
	 */
	public void testSpdxFilesetComment() throws InvalidSPDXAnalysisException {
		SpdxFile testSpdxFile = generator.builderForSpdxFileTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMMENT_TEST_VALUE), testSpdxFile.getComment());
		String newStringValue = "new comment value";
		testSpdxFile.setComment(newStringValue);
		assertEquals(Optional.of(newStringValue), testSpdxFile.getComment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.software.SpdxFile#setName}.
	 */
	public void testSpdxFilesetName() throws InvalidSPDXAnalysisException {
		SpdxFile testSpdxFile = generator.builderForSpdxFileTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.NAME_TEST_VALUE), testSpdxFile.getName());
		String newStringValue = "new name value";
		testSpdxFile.setName(newStringValue);
		assertEquals(Optional.of(newStringValue), testSpdxFile.getName());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.software.SpdxFile#getContentIdentifier}.
	 */
	public void testSpdxFilegetContentIdentifiers() throws InvalidSPDXAnalysisException {
		SpdxFile testSpdxFile = generator.builderForSpdxFileTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testSpdxFile.getContentIdentifiers())));
//		testSpdxFile.getContentIdentifiers().clear();
//		testSpdxFile.getContentIdentifiers().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testSpdxFile.getContentIdentifiers())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.software.SpdxFile#getExtension}.
	 */
	public void testSpdxFilegetExtensions() throws InvalidSPDXAnalysisException {
		SpdxFile testSpdxFile = generator.builderForSpdxFileTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testSpdxFile.getExtensions())));
//		testSpdxFile.getExtensions().clear();
//		testSpdxFile.getExtensions().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testSpdxFile.getExtensions())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.software.SpdxFile#getVerifiedUsing}.
	 */
	public void testSpdxFilegetVerifiedUsings() throws InvalidSPDXAnalysisException {
		SpdxFile testSpdxFile = generator.builderForSpdxFileTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testSpdxFile.getVerifiedUsings())));
//		testSpdxFile.getVerifiedUsings().clear();
//		testSpdxFile.getVerifiedUsings().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testSpdxFile.getVerifiedUsings())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.software.SpdxFile#getOriginatedBy}.
	 */
	public void testSpdxFilegetOriginatedBys() throws InvalidSPDXAnalysisException {
		SpdxFile testSpdxFile = generator.builderForSpdxFileTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testSpdxFile.getOriginatedBys())));
//		testSpdxFile.getOriginatedBys().clear();
//		testSpdxFile.getOriginatedBys().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testSpdxFile.getOriginatedBys())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.software.SpdxFile#getExternalRef}.
	 */
	public void testSpdxFilegetExternalRefs() throws InvalidSPDXAnalysisException {
		SpdxFile testSpdxFile = generator.builderForSpdxFileTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testSpdxFile.getExternalRefs())));
//		testSpdxFile.getExternalRefs().clear();
//		testSpdxFile.getExternalRefs().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testSpdxFile.getExternalRefs())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.software.SpdxFile#getExternalIdentifier}.
	 */
	public void testSpdxFilegetExternalIdentifiers() throws InvalidSPDXAnalysisException {
		SpdxFile testSpdxFile = generator.builderForSpdxFileTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testSpdxFile.getExternalIdentifiers())));
//		testSpdxFile.getExternalIdentifiers().clear();
//		testSpdxFile.getExternalIdentifiers().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testSpdxFile.getExternalIdentifiers())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.software.SpdxFile#getAttributionTexts}.
	 */
	public void testSpdxFilegetAttributionTexts() throws InvalidSPDXAnalysisException {
		SpdxFile testSpdxFile = generator.builderForSpdxFileTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.ATTRIBUTION_TEXT_TEST_LIST1, new ArrayList<>(testSpdxFile.getAttributionTexts())));
		testSpdxFile.getAttributionTexts().clear();
		testSpdxFile.getAttributionTexts().addAll(TestValuesGenerator.ATTRIBUTION_TEXT_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.ATTRIBUTION_TEXT_TEST_LIST2, new ArrayList<>(testSpdxFile.getAttributionTexts())));
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.software.SpdxFile#getStandardNames}.
	 */
	public void testSpdxFilegetStandardNames() throws InvalidSPDXAnalysisException {
		SpdxFile testSpdxFile = generator.builderForSpdxFileTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.STANDARD_NAME_TEST_LIST1, new ArrayList<>(testSpdxFile.getStandardNames())));
		testSpdxFile.getStandardNames().clear();
		testSpdxFile.getStandardNames().addAll(TestValuesGenerator.STANDARD_NAME_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.STANDARD_NAME_TEST_LIST2, new ArrayList<>(testSpdxFile.getStandardNames())));
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.software.SpdxFile#getSupportLevel}.
	 */
	public void testSpdxFilegetSupportLevels() throws InvalidSPDXAnalysisException {
		SpdxFile testSpdxFile = generator.builderForSpdxFileTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST1, new ArrayList<>(testSpdxFile.getSupportLevels())));
		testSpdxFile.getSupportLevels().clear();
		testSpdxFile.getSupportLevels().addAll(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST2, new ArrayList<>(testSpdxFile.getSupportLevels())));
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.software.SpdxFile#getAdditionalPurpose}.
	 */
	public void testSpdxFilegetAdditionalPurposes() throws InvalidSPDXAnalysisException {
		SpdxFile testSpdxFile = generator.builderForSpdxFileTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.ADDITIONAL_PURPOSE_TEST_LIST1, new ArrayList<>(testSpdxFile.getAdditionalPurposes())));
		testSpdxFile.getAdditionalPurposes().clear();
		testSpdxFile.getAdditionalPurposes().addAll(TestValuesGenerator.ADDITIONAL_PURPOSE_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.ADDITIONAL_PURPOSE_TEST_LIST2, new ArrayList<>(testSpdxFile.getAdditionalPurposes())));
	}
}