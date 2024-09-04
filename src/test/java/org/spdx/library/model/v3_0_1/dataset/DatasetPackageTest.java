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
 
package org.spdx.library.model.v3_0_1.dataset;

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
import org.spdx.library.model.v3_0_1.core.DictionaryEntry;
import org.spdx.library.model.v3_0_1.core.Element;
import org.spdx.library.model.v3_0_1.core.ExternalIdentifier;
import org.spdx.library.model.v3_0_1.core.ExternalRef;
import org.spdx.library.model.v3_0_1.core.IntegrityMethod;
import org.spdx.library.model.v3_0_1.core.PresenceType;
import org.spdx.library.model.v3_0_1.core.ProfileIdentifierType;
import org.spdx.library.model.v3_0_1.core.SupportType;
import org.spdx.library.model.v3_0_1.dataset.DatasetPackage.DatasetPackageBuilder;
import org.spdx.library.model.v3_0_1.extension.Extension;
import org.spdx.library.model.v3_0_1.software.ContentIdentifier;
import org.spdx.library.model.v3_0_1.software.SoftwarePurpose;
import org.spdx.library.model.v3_0_1.software.SpdxPackage;

/**
 * GENERATED FILE - DO NOT MODIFY
**/

public class DatasetPackageTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3_0_1.dataset.DatasetPackage#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		DatasetPackage testDatasetPackage = generator.builderForDatasetPackageTests(TEST_OBJECT_URI).build();
		List<String> result = testDatasetPackage.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.dataset.DatasetPackage#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		DatasetPackage testDatasetPackage = generator.builderForDatasetPackageTests(TEST_OBJECT_URI).build();
		assertEquals("Dataset.DatasetPackage", testDatasetPackage.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.dataset.DatasetPackage#Element(org.spdx.library.model.v3_0_1.dataset.DatasetPackage.DatasetPackageBuilder)}.
	 */
	public void testDatasetPackageDatasetPackageBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForDatasetPackageTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		DatasetPackage testDatasetPackage = generator.builderForDatasetPackageTests(TEST_OBJECT_URI).build();
		DatasetPackage test2DatasetPackage = generator.builderForDatasetPackageTests("https://testObject2").build();
		assertTrue(testDatasetPackage.equivalent(test2DatasetPackage));
		assertTrue(test2DatasetPackage.equivalent(testDatasetPackage));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.dataset.DatasetPackage#setCreationInfo}.
	 */
	public void testDatasetPackagesetCreationInfo() throws InvalidSPDXAnalysisException {
		DatasetPackage testDatasetPackage = generator.builderForDatasetPackageTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testDatasetPackage.getCreationInfo());
//		testDatasetPackage.setCreationInfo(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testDatasetPackage.getCreationInfo());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.dataset.DatasetPackage#setSuppliedBy}.
	 */
	public void testDatasetPackagesetSuppliedBy() throws InvalidSPDXAnalysisException {
		DatasetPackage testDatasetPackage = generator.builderForDatasetPackageTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testDatasetPackage.getSuppliedBy());
//		testDatasetPackage.setSuppliedBy(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testDatasetPackage.getSuppliedBy());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.dataset.DatasetPackage#setDatasetAvailability}.
	 */
	public void testDatasetPackagesetDatasetAvailability() throws InvalidSPDXAnalysisException {
		DatasetPackage testDatasetPackage = generator.builderForDatasetPackageTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DATASET_AVAILABILITY_TEST_VALUE1), testDatasetPackage.getDatasetAvailability());
		testDatasetPackage.setDatasetAvailability(TestValuesGenerator.DATASET_AVAILABILITY_TEST_VALUE2);
		assertEquals(Optional.of(TestValuesGenerator.DATASET_AVAILABILITY_TEST_VALUE2), testDatasetPackage.getDatasetAvailability());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.dataset.DatasetPackage#setConfidentialityLevel}.
	 */
	public void testDatasetPackagesetConfidentialityLevel() throws InvalidSPDXAnalysisException {
		DatasetPackage testDatasetPackage = generator.builderForDatasetPackageTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.CONFIDENTIALITY_LEVEL_TEST_VALUE1), testDatasetPackage.getConfidentialityLevel());
		testDatasetPackage.setConfidentialityLevel(TestValuesGenerator.CONFIDENTIALITY_LEVEL_TEST_VALUE2);
		assertEquals(Optional.of(TestValuesGenerator.CONFIDENTIALITY_LEVEL_TEST_VALUE2), testDatasetPackage.getConfidentialityLevel());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.dataset.DatasetPackage#setHasSensitivePersonalInformation}.
	 */
	public void testDatasetPackagesetHasSensitivePersonalInformation() throws InvalidSPDXAnalysisException {
		DatasetPackage testDatasetPackage = generator.builderForDatasetPackageTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.HAS_SENSITIVE_PERSONAL_INFORMATION_TEST_VALUE1), testDatasetPackage.getHasSensitivePersonalInformation());
		testDatasetPackage.setHasSensitivePersonalInformation(TestValuesGenerator.HAS_SENSITIVE_PERSONAL_INFORMATION_TEST_VALUE2);
		assertEquals(Optional.of(TestValuesGenerator.HAS_SENSITIVE_PERSONAL_INFORMATION_TEST_VALUE2), testDatasetPackage.getHasSensitivePersonalInformation());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.dataset.DatasetPackage#setPrimaryPurpose}.
	 */
	public void testDatasetPackagesetPrimaryPurpose() throws InvalidSPDXAnalysisException {
		DatasetPackage testDatasetPackage = generator.builderForDatasetPackageTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.PRIMARY_PURPOSE_TEST_VALUE1), testDatasetPackage.getPrimaryPurpose());
		testDatasetPackage.setPrimaryPurpose(TestValuesGenerator.PRIMARY_PURPOSE_TEST_VALUE2);
		assertEquals(Optional.of(TestValuesGenerator.PRIMARY_PURPOSE_TEST_VALUE2), testDatasetPackage.getPrimaryPurpose());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.dataset.DatasetPackage#setDatasetSize}.
	 */
	public void testDatasetPackagesetDatasetSize() throws InvalidSPDXAnalysisException {
		DatasetPackage testDatasetPackage = generator.builderForDatasetPackageTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DATASET_SIZE_TEST_VALUE), testDatasetPackage.getDatasetSize());
		testDatasetPackage.setDatasetSize(new Integer(653));
		assertEquals(Optional.of(new Integer(653)), testDatasetPackage.getDatasetSize());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.dataset.DatasetPackage#setValidUntilTime}.
	 */
	public void testDatasetPackagesetValidUntilTime() throws InvalidSPDXAnalysisException {
		DatasetPackage testDatasetPackage = generator.builderForDatasetPackageTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.VALID_UNTIL_TIME_TEST_VALUE), testDatasetPackage.getValidUntilTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testDatasetPackage.setValidUntilTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testDatasetPackage.getValidUntilTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.dataset.DatasetPackage#setDownloadLocation}.
	 */
	public void testDatasetPackagesetDownloadLocation() throws InvalidSPDXAnalysisException {
		DatasetPackage testDatasetPackage = generator.builderForDatasetPackageTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DOWNLOAD_LOCATION_TEST_VALUE), testDatasetPackage.getDownloadLocation());
		String newStringValue = "new downloadLocation value";
		testDatasetPackage.setDownloadLocation(newStringValue);
		assertEquals(Optional.of(newStringValue), testDatasetPackage.getDownloadLocation());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.dataset.DatasetPackage#setBuiltTime}.
	 */
	public void testDatasetPackagesetBuiltTime() throws InvalidSPDXAnalysisException {
		DatasetPackage testDatasetPackage = generator.builderForDatasetPackageTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.BUILT_TIME_TEST_VALUE), testDatasetPackage.getBuiltTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testDatasetPackage.setBuiltTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testDatasetPackage.getBuiltTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.dataset.DatasetPackage#setDatasetNoise}.
	 */
	public void testDatasetPackagesetDatasetNoise() throws InvalidSPDXAnalysisException {
		DatasetPackage testDatasetPackage = generator.builderForDatasetPackageTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DATASET_NOISE_TEST_VALUE), testDatasetPackage.getDatasetNoise());
		String newStringValue = "new datasetNoise value";
		testDatasetPackage.setDatasetNoise(newStringValue);
		assertEquals(Optional.of(newStringValue), testDatasetPackage.getDatasetNoise());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.dataset.DatasetPackage#setSummary}.
	 */
	public void testDatasetPackagesetSummary() throws InvalidSPDXAnalysisException {
		DatasetPackage testDatasetPackage = generator.builderForDatasetPackageTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SUMMARY_TEST_VALUE), testDatasetPackage.getSummary());
		String newStringValue = "new summary value";
		testDatasetPackage.setSummary(newStringValue);
		assertEquals(Optional.of(newStringValue), testDatasetPackage.getSummary());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.dataset.DatasetPackage#setPackageVersion}.
	 */
	public void testDatasetPackagesetPackageVersion() throws InvalidSPDXAnalysisException {
		DatasetPackage testDatasetPackage = generator.builderForDatasetPackageTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.PACKAGE_VERSION_TEST_VALUE), testDatasetPackage.getPackageVersion());
		String newStringValue = "new packageVersion value";
		testDatasetPackage.setPackageVersion(newStringValue);
		assertEquals(Optional.of(newStringValue), testDatasetPackage.getPackageVersion());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.dataset.DatasetPackage#setReleaseTime}.
	 */
	public void testDatasetPackagesetReleaseTime() throws InvalidSPDXAnalysisException {
		DatasetPackage testDatasetPackage = generator.builderForDatasetPackageTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.RELEASE_TIME_TEST_VALUE), testDatasetPackage.getReleaseTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testDatasetPackage.setReleaseTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testDatasetPackage.getReleaseTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.dataset.DatasetPackage#setCopyrightText}.
	 */
	public void testDatasetPackagesetCopyrightText() throws InvalidSPDXAnalysisException {
		DatasetPackage testDatasetPackage = generator.builderForDatasetPackageTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COPYRIGHT_TEXT_TEST_VALUE), testDatasetPackage.getCopyrightText());
		String newStringValue = "new copyrightText value";
		testDatasetPackage.setCopyrightText(newStringValue);
		assertEquals(Optional.of(newStringValue), testDatasetPackage.getCopyrightText());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.dataset.DatasetPackage#setComment}.
	 */
	public void testDatasetPackagesetComment() throws InvalidSPDXAnalysisException {
		DatasetPackage testDatasetPackage = generator.builderForDatasetPackageTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMMENT_TEST_VALUE), testDatasetPackage.getComment());
		String newStringValue = "new comment value";
		testDatasetPackage.setComment(newStringValue);
		assertEquals(Optional.of(newStringValue), testDatasetPackage.getComment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.dataset.DatasetPackage#setHomePage}.
	 */
	public void testDatasetPackagesetHomePage() throws InvalidSPDXAnalysisException {
		DatasetPackage testDatasetPackage = generator.builderForDatasetPackageTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.HOME_PAGE_TEST_VALUE), testDatasetPackage.getHomePage());
		String newStringValue = "new homePage value";
		testDatasetPackage.setHomePage(newStringValue);
		assertEquals(Optional.of(newStringValue), testDatasetPackage.getHomePage());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.dataset.DatasetPackage#setSourceInfo}.
	 */
	public void testDatasetPackagesetSourceInfo() throws InvalidSPDXAnalysisException {
		DatasetPackage testDatasetPackage = generator.builderForDatasetPackageTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SOURCE_INFO_TEST_VALUE), testDatasetPackage.getSourceInfo());
		String newStringValue = "new sourceInfo value";
		testDatasetPackage.setSourceInfo(newStringValue);
		assertEquals(Optional.of(newStringValue), testDatasetPackage.getSourceInfo());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.dataset.DatasetPackage#setIntendedUse}.
	 */
	public void testDatasetPackagesetIntendedUse() throws InvalidSPDXAnalysisException {
		DatasetPackage testDatasetPackage = generator.builderForDatasetPackageTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.INTENDED_USE_TEST_VALUE), testDatasetPackage.getIntendedUse());
		String newStringValue = "new intendedUse value";
		testDatasetPackage.setIntendedUse(newStringValue);
		assertEquals(Optional.of(newStringValue), testDatasetPackage.getIntendedUse());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.dataset.DatasetPackage#setDescription}.
	 */
	public void testDatasetPackagesetDescription() throws InvalidSPDXAnalysisException {
		DatasetPackage testDatasetPackage = generator.builderForDatasetPackageTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DESCRIPTION_TEST_VALUE), testDatasetPackage.getDescription());
		String newStringValue = "new description value";
		testDatasetPackage.setDescription(newStringValue);
		assertEquals(Optional.of(newStringValue), testDatasetPackage.getDescription());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.dataset.DatasetPackage#setDataCollectionProcess}.
	 */
	public void testDatasetPackagesetDataCollectionProcess() throws InvalidSPDXAnalysisException {
		DatasetPackage testDatasetPackage = generator.builderForDatasetPackageTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DATA_COLLECTION_PROCESS_TEST_VALUE), testDatasetPackage.getDataCollectionProcess());
		String newStringValue = "new dataCollectionProcess value";
		testDatasetPackage.setDataCollectionProcess(newStringValue);
		assertEquals(Optional.of(newStringValue), testDatasetPackage.getDataCollectionProcess());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.dataset.DatasetPackage#setDatasetUpdateMechanism}.
	 */
	public void testDatasetPackagesetDatasetUpdateMechanism() throws InvalidSPDXAnalysisException {
		DatasetPackage testDatasetPackage = generator.builderForDatasetPackageTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DATASET_UPDATE_MECHANISM_TEST_VALUE), testDatasetPackage.getDatasetUpdateMechanism());
		String newStringValue = "new datasetUpdateMechanism value";
		testDatasetPackage.setDatasetUpdateMechanism(newStringValue);
		assertEquals(Optional.of(newStringValue), testDatasetPackage.getDatasetUpdateMechanism());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.dataset.DatasetPackage#setName}.
	 */
	public void testDatasetPackagesetName() throws InvalidSPDXAnalysisException {
		DatasetPackage testDatasetPackage = generator.builderForDatasetPackageTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.NAME_TEST_VALUE), testDatasetPackage.getName());
		String newStringValue = "new name value";
		testDatasetPackage.setName(newStringValue);
		assertEquals(Optional.of(newStringValue), testDatasetPackage.getName());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.dataset.DatasetPackage#setPackageUrl}.
	 */
	public void testDatasetPackagesetPackageUrl() throws InvalidSPDXAnalysisException {
		DatasetPackage testDatasetPackage = generator.builderForDatasetPackageTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.PACKAGE_URL_TEST_VALUE), testDatasetPackage.getPackageUrl());
		String newStringValue = "new packageUrl value";
		testDatasetPackage.setPackageUrl(newStringValue);
		assertEquals(Optional.of(newStringValue), testDatasetPackage.getPackageUrl());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.dataset.DatasetPackage#getContentIdentifier}.
	 */
	public void testDatasetPackagegetContentIdentifiers() throws InvalidSPDXAnalysisException {
		DatasetPackage testDatasetPackage = generator.builderForDatasetPackageTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testDatasetPackage.getContentIdentifiers())));
//		testDatasetPackage.getContentIdentifiers().clear();
//		testDatasetPackage.getContentIdentifiers().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testDatasetPackage.getContentIdentifiers())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.dataset.DatasetPackage#getVerifiedUsing}.
	 */
	public void testDatasetPackagegetVerifiedUsings() throws InvalidSPDXAnalysisException {
		DatasetPackage testDatasetPackage = generator.builderForDatasetPackageTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testDatasetPackage.getVerifiedUsings())));
//		testDatasetPackage.getVerifiedUsings().clear();
//		testDatasetPackage.getVerifiedUsings().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testDatasetPackage.getVerifiedUsings())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.dataset.DatasetPackage#getExternalRef}.
	 */
	public void testDatasetPackagegetExternalRefs() throws InvalidSPDXAnalysisException {
		DatasetPackage testDatasetPackage = generator.builderForDatasetPackageTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testDatasetPackage.getExternalRefs())));
//		testDatasetPackage.getExternalRefs().clear();
//		testDatasetPackage.getExternalRefs().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testDatasetPackage.getExternalRefs())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.dataset.DatasetPackage#getSensor}.
	 */
	public void testDatasetPackagegetSensors() throws InvalidSPDXAnalysisException {
		DatasetPackage testDatasetPackage = generator.builderForDatasetPackageTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testDatasetPackage.getSensors())));
//		testDatasetPackage.getSensors().clear();
//		testDatasetPackage.getSensors().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testDatasetPackage.getSensors())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.dataset.DatasetPackage#getExternalIdentifier}.
	 */
	public void testDatasetPackagegetExternalIdentifiers() throws InvalidSPDXAnalysisException {
		DatasetPackage testDatasetPackage = generator.builderForDatasetPackageTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testDatasetPackage.getExternalIdentifiers())));
//		testDatasetPackage.getExternalIdentifiers().clear();
//		testDatasetPackage.getExternalIdentifiers().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testDatasetPackage.getExternalIdentifiers())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.dataset.DatasetPackage#getExtension}.
	 */
	public void testDatasetPackagegetExtensions() throws InvalidSPDXAnalysisException {
		DatasetPackage testDatasetPackage = generator.builderForDatasetPackageTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testDatasetPackage.getExtensions())));
//		testDatasetPackage.getExtensions().clear();
//		testDatasetPackage.getExtensions().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testDatasetPackage.getExtensions())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.dataset.DatasetPackage#getOriginatedBy}.
	 */
	public void testDatasetPackagegetOriginatedBys() throws InvalidSPDXAnalysisException {
		DatasetPackage testDatasetPackage = generator.builderForDatasetPackageTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testDatasetPackage.getOriginatedBys())));
//		testDatasetPackage.getOriginatedBys().clear();
//		testDatasetPackage.getOriginatedBys().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testDatasetPackage.getOriginatedBys())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.dataset.DatasetPackage#getAttributionTexts}.
	 */
	public void testDatasetPackagegetAttributionTexts() throws InvalidSPDXAnalysisException {
		DatasetPackage testDatasetPackage = generator.builderForDatasetPackageTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.ATTRIBUTION_TEXT_TEST_LIST1, new ArrayList<>(testDatasetPackage.getAttributionTexts())));
		testDatasetPackage.getAttributionTexts().clear();
		testDatasetPackage.getAttributionTexts().addAll(TestValuesGenerator.ATTRIBUTION_TEXT_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.ATTRIBUTION_TEXT_TEST_LIST2, new ArrayList<>(testDatasetPackage.getAttributionTexts())));
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.dataset.DatasetPackage#getStandardNames}.
	 */
	public void testDatasetPackagegetStandardNames() throws InvalidSPDXAnalysisException {
		DatasetPackage testDatasetPackage = generator.builderForDatasetPackageTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.STANDARD_NAME_TEST_LIST1, new ArrayList<>(testDatasetPackage.getStandardNames())));
		testDatasetPackage.getStandardNames().clear();
		testDatasetPackage.getStandardNames().addAll(TestValuesGenerator.STANDARD_NAME_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.STANDARD_NAME_TEST_LIST2, new ArrayList<>(testDatasetPackage.getStandardNames())));
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.dataset.DatasetPackage#getAnonymizationMethodUseds}.
	 */
	public void testDatasetPackagegetAnonymizationMethodUseds() throws InvalidSPDXAnalysisException {
		DatasetPackage testDatasetPackage = generator.builderForDatasetPackageTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.ANONYMIZATION_METHOD_USED_TEST_LIST1, new ArrayList<>(testDatasetPackage.getAnonymizationMethodUseds())));
		testDatasetPackage.getAnonymizationMethodUseds().clear();
		testDatasetPackage.getAnonymizationMethodUseds().addAll(TestValuesGenerator.ANONYMIZATION_METHOD_USED_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.ANONYMIZATION_METHOD_USED_TEST_LIST2, new ArrayList<>(testDatasetPackage.getAnonymizationMethodUseds())));
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.dataset.DatasetPackage#getKnownBiass}.
	 */
	public void testDatasetPackagegetKnownBiass() throws InvalidSPDXAnalysisException {
		DatasetPackage testDatasetPackage = generator.builderForDatasetPackageTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.KNOWN_BIAS_TEST_LIST1, new ArrayList<>(testDatasetPackage.getKnownBiass())));
		testDatasetPackage.getKnownBiass().clear();
		testDatasetPackage.getKnownBiass().addAll(TestValuesGenerator.KNOWN_BIAS_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.KNOWN_BIAS_TEST_LIST2, new ArrayList<>(testDatasetPackage.getKnownBiass())));
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.dataset.DatasetPackage#getDataPreprocessings}.
	 */
	public void testDatasetPackagegetDataPreprocessings() throws InvalidSPDXAnalysisException {
		DatasetPackage testDatasetPackage = generator.builderForDatasetPackageTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.DATA_PREPROCESSING_TEST_LIST1, new ArrayList<>(testDatasetPackage.getDataPreprocessings())));
		testDatasetPackage.getDataPreprocessings().clear();
		testDatasetPackage.getDataPreprocessings().addAll(TestValuesGenerator.DATA_PREPROCESSING_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.DATA_PREPROCESSING_TEST_LIST2, new ArrayList<>(testDatasetPackage.getDataPreprocessings())));
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.dataset.DatasetPackage#getSupportLevel}.
	 */
	public void testDatasetPackagegetSupportLevels() throws InvalidSPDXAnalysisException {
		DatasetPackage testDatasetPackage = generator.builderForDatasetPackageTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST1, new ArrayList<>(testDatasetPackage.getSupportLevels())));
		testDatasetPackage.getSupportLevels().clear();
		testDatasetPackage.getSupportLevels().addAll(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST2, new ArrayList<>(testDatasetPackage.getSupportLevels())));
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.dataset.DatasetPackage#getAdditionalPurpose}.
	 */
	public void testDatasetPackagegetAdditionalPurposes() throws InvalidSPDXAnalysisException {
		DatasetPackage testDatasetPackage = generator.builderForDatasetPackageTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.ADDITIONAL_PURPOSE_TEST_LIST1, new ArrayList<>(testDatasetPackage.getAdditionalPurposes())));
		testDatasetPackage.getAdditionalPurposes().clear();
		testDatasetPackage.getAdditionalPurposes().addAll(TestValuesGenerator.ADDITIONAL_PURPOSE_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.ADDITIONAL_PURPOSE_TEST_LIST2, new ArrayList<>(testDatasetPackage.getAdditionalPurposes())));
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.dataset.DatasetPackage#getDatasetType}.
	 */
	public void testDatasetPackagegetDatasetTypes() throws InvalidSPDXAnalysisException {
		DatasetPackage testDatasetPackage = generator.builderForDatasetPackageTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.DATASET_TYPE_TEST_LIST1, new ArrayList<>(testDatasetPackage.getDatasetTypes())));
		testDatasetPackage.getDatasetTypes().clear();
		testDatasetPackage.getDatasetTypes().addAll(TestValuesGenerator.DATASET_TYPE_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.DATASET_TYPE_TEST_LIST2, new ArrayList<>(testDatasetPackage.getDatasetTypes())));
	}
}