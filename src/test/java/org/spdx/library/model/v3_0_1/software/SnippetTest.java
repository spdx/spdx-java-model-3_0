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
import org.spdx.library.model.v3_0_1.core.PositiveIntegerRange;
import org.spdx.library.model.v3_0_1.core.ProfileIdentifierType;
import org.spdx.library.model.v3_0_1.core.SupportType;
import org.spdx.library.model.v3_0_1.extension.Extension;
import org.spdx.library.model.v3_0_1.software.Snippet.SnippetBuilder;

/**
 * GENERATED FILE - DO NOT MODIFY
**/

public class SnippetTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3_0_1.software.Snippet#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		Snippet testSnippet = generator.builderForSnippetTests(TEST_OBJECT_URI).build();
		List<String> result = testSnippet.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.software.Snippet#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		Snippet testSnippet = generator.builderForSnippetTests(TEST_OBJECT_URI).build();
		assertEquals("Software.Snippet", testSnippet.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.software.Snippet#Element(org.spdx.library.model.v3_0_1.software.Snippet.SnippetBuilder)}.
	 */
	public void testSnippetSnippetBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForSnippetTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		Snippet testSnippet = generator.builderForSnippetTests(TEST_OBJECT_URI).build();
		Snippet test2Snippet = generator.builderForSnippetTests("https://testObject2").build();
		assertTrue(testSnippet.equivalent(test2Snippet));
		assertTrue(test2Snippet.equivalent(testSnippet));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.software.Snippet#setCreationInfo}.
	 */
	public void testSnippetsetCreationInfo() throws InvalidSPDXAnalysisException {
		Snippet testSnippet = generator.builderForSnippetTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testSnippet.getCreationInfo());
//		testSnippet.setCreationInfo(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testSnippet.getCreationInfo());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.software.Snippet#setSuppliedBy}.
	 */
	public void testSnippetsetSuppliedBy() throws InvalidSPDXAnalysisException {
		Snippet testSnippet = generator.builderForSnippetTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testSnippet.getSuppliedBy());
//		testSnippet.setSuppliedBy(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testSnippet.getSuppliedBy());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.software.Snippet#setLineRange}.
	 */
	public void testSnippetsetLineRange() throws InvalidSPDXAnalysisException {
		Snippet testSnippet = generator.builderForSnippetTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testSnippet.getLineRange());
//		testSnippet.setLineRange(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testSnippet.getLineRange());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.software.Snippet#setByteRange}.
	 */
	public void testSnippetsetByteRange() throws InvalidSPDXAnalysisException {
		Snippet testSnippet = generator.builderForSnippetTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testSnippet.getByteRange());
//		testSnippet.setByteRange(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testSnippet.getByteRange());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.software.Snippet#setSnippetFromFile}.
	 */
	public void testSnippetsetSnippetFromFile() throws InvalidSPDXAnalysisException {
		Snippet testSnippet = generator.builderForSnippetTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testSnippet.getSnippetFromFile());
//		testSnippet.setSnippetFromFile(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testSnippet.getSnippetFromFile());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.software.Snippet#setPrimaryPurpose}.
	 */
	public void testSnippetsetPrimaryPurpose() throws InvalidSPDXAnalysisException {
		Snippet testSnippet = generator.builderForSnippetTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.PRIMARY_PURPOSE_TEST_VALUE1), testSnippet.getPrimaryPurpose());
		testSnippet.setPrimaryPurpose(TestValuesGenerator.PRIMARY_PURPOSE_TEST_VALUE2);
		assertEquals(Optional.of(TestValuesGenerator.PRIMARY_PURPOSE_TEST_VALUE2), testSnippet.getPrimaryPurpose());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.software.Snippet#setValidUntilTime}.
	 */
	public void testSnippetsetValidUntilTime() throws InvalidSPDXAnalysisException {
		Snippet testSnippet = generator.builderForSnippetTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.VALID_UNTIL_TIME_TEST_VALUE), testSnippet.getValidUntilTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testSnippet.setValidUntilTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testSnippet.getValidUntilTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.software.Snippet#setBuiltTime}.
	 */
	public void testSnippetsetBuiltTime() throws InvalidSPDXAnalysisException {
		Snippet testSnippet = generator.builderForSnippetTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.BUILT_TIME_TEST_VALUE), testSnippet.getBuiltTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testSnippet.setBuiltTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testSnippet.getBuiltTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.software.Snippet#setSummary}.
	 */
	public void testSnippetsetSummary() throws InvalidSPDXAnalysisException {
		Snippet testSnippet = generator.builderForSnippetTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SUMMARY_TEST_VALUE), testSnippet.getSummary());
		String newStringValue = "new summary value";
		testSnippet.setSummary(newStringValue);
		assertEquals(Optional.of(newStringValue), testSnippet.getSummary());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.software.Snippet#setDescription}.
	 */
	public void testSnippetsetDescription() throws InvalidSPDXAnalysisException {
		Snippet testSnippet = generator.builderForSnippetTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DESCRIPTION_TEST_VALUE), testSnippet.getDescription());
		String newStringValue = "new description value";
		testSnippet.setDescription(newStringValue);
		assertEquals(Optional.of(newStringValue), testSnippet.getDescription());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.software.Snippet#setReleaseTime}.
	 */
	public void testSnippetsetReleaseTime() throws InvalidSPDXAnalysisException {
		Snippet testSnippet = generator.builderForSnippetTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.RELEASE_TIME_TEST_VALUE), testSnippet.getReleaseTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testSnippet.setReleaseTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testSnippet.getReleaseTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.software.Snippet#setCopyrightText}.
	 */
	public void testSnippetsetCopyrightText() throws InvalidSPDXAnalysisException {
		Snippet testSnippet = generator.builderForSnippetTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COPYRIGHT_TEXT_TEST_VALUE), testSnippet.getCopyrightText());
		String newStringValue = "new copyrightText value";
		testSnippet.setCopyrightText(newStringValue);
		assertEquals(Optional.of(newStringValue), testSnippet.getCopyrightText());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.software.Snippet#setComment}.
	 */
	public void testSnippetsetComment() throws InvalidSPDXAnalysisException {
		Snippet testSnippet = generator.builderForSnippetTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMMENT_TEST_VALUE), testSnippet.getComment());
		String newStringValue = "new comment value";
		testSnippet.setComment(newStringValue);
		assertEquals(Optional.of(newStringValue), testSnippet.getComment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.software.Snippet#setName}.
	 */
	public void testSnippetsetName() throws InvalidSPDXAnalysisException {
		Snippet testSnippet = generator.builderForSnippetTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.NAME_TEST_VALUE), testSnippet.getName());
		String newStringValue = "new name value";
		testSnippet.setName(newStringValue);
		assertEquals(Optional.of(newStringValue), testSnippet.getName());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.software.Snippet#getContentIdentifier}.
	 */
	public void testSnippetgetContentIdentifiers() throws InvalidSPDXAnalysisException {
		Snippet testSnippet = generator.builderForSnippetTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testSnippet.getContentIdentifiers())));
//		testSnippet.getContentIdentifiers().clear();
//		testSnippet.getContentIdentifiers().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testSnippet.getContentIdentifiers())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.software.Snippet#getExtension}.
	 */
	public void testSnippetgetExtensions() throws InvalidSPDXAnalysisException {
		Snippet testSnippet = generator.builderForSnippetTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testSnippet.getExtensions())));
//		testSnippet.getExtensions().clear();
//		testSnippet.getExtensions().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testSnippet.getExtensions())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.software.Snippet#getVerifiedUsing}.
	 */
	public void testSnippetgetVerifiedUsings() throws InvalidSPDXAnalysisException {
		Snippet testSnippet = generator.builderForSnippetTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testSnippet.getVerifiedUsings())));
//		testSnippet.getVerifiedUsings().clear();
//		testSnippet.getVerifiedUsings().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testSnippet.getVerifiedUsings())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.software.Snippet#getOriginatedBy}.
	 */
	public void testSnippetgetOriginatedBys() throws InvalidSPDXAnalysisException {
		Snippet testSnippet = generator.builderForSnippetTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testSnippet.getOriginatedBys())));
//		testSnippet.getOriginatedBys().clear();
//		testSnippet.getOriginatedBys().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testSnippet.getOriginatedBys())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.software.Snippet#getExternalRef}.
	 */
	public void testSnippetgetExternalRefs() throws InvalidSPDXAnalysisException {
		Snippet testSnippet = generator.builderForSnippetTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testSnippet.getExternalRefs())));
//		testSnippet.getExternalRefs().clear();
//		testSnippet.getExternalRefs().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testSnippet.getExternalRefs())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.software.Snippet#getExternalIdentifier}.
	 */
	public void testSnippetgetExternalIdentifiers() throws InvalidSPDXAnalysisException {
		Snippet testSnippet = generator.builderForSnippetTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testSnippet.getExternalIdentifiers())));
//		testSnippet.getExternalIdentifiers().clear();
//		testSnippet.getExternalIdentifiers().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testSnippet.getExternalIdentifiers())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.software.Snippet#getAttributionTexts}.
	 */
	public void testSnippetgetAttributionTexts() throws InvalidSPDXAnalysisException {
		Snippet testSnippet = generator.builderForSnippetTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.ATTRIBUTION_TEXT_TEST_LIST1, new ArrayList<>(testSnippet.getAttributionTexts())));
		testSnippet.getAttributionTexts().clear();
		testSnippet.getAttributionTexts().addAll(TestValuesGenerator.ATTRIBUTION_TEXT_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.ATTRIBUTION_TEXT_TEST_LIST2, new ArrayList<>(testSnippet.getAttributionTexts())));
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.software.Snippet#getStandardNames}.
	 */
	public void testSnippetgetStandardNames() throws InvalidSPDXAnalysisException {
		Snippet testSnippet = generator.builderForSnippetTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.STANDARD_NAME_TEST_LIST1, new ArrayList<>(testSnippet.getStandardNames())));
		testSnippet.getStandardNames().clear();
		testSnippet.getStandardNames().addAll(TestValuesGenerator.STANDARD_NAME_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.STANDARD_NAME_TEST_LIST2, new ArrayList<>(testSnippet.getStandardNames())));
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.software.Snippet#getSupportLevel}.
	 */
	public void testSnippetgetSupportLevels() throws InvalidSPDXAnalysisException {
		Snippet testSnippet = generator.builderForSnippetTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST1, new ArrayList<>(testSnippet.getSupportLevels())));
		testSnippet.getSupportLevels().clear();
		testSnippet.getSupportLevels().addAll(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST2, new ArrayList<>(testSnippet.getSupportLevels())));
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.software.Snippet#getAdditionalPurpose}.
	 */
	public void testSnippetgetAdditionalPurposes() throws InvalidSPDXAnalysisException {
		Snippet testSnippet = generator.builderForSnippetTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.ADDITIONAL_PURPOSE_TEST_LIST1, new ArrayList<>(testSnippet.getAdditionalPurposes())));
		testSnippet.getAdditionalPurposes().clear();
		testSnippet.getAdditionalPurposes().addAll(TestValuesGenerator.ADDITIONAL_PURPOSE_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.ADDITIONAL_PURPOSE_TEST_LIST2, new ArrayList<>(testSnippet.getAdditionalPurposes())));
	}
}