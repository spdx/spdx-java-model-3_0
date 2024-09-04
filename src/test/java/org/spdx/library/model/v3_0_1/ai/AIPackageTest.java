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
 
package org.spdx.library.model.v3_0_1.ai;

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
import org.spdx.library.model.v3_0_1.ai.AIPackage.AIPackageBuilder;
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
import org.spdx.library.model.v3_0_1.extension.Extension;
import org.spdx.library.model.v3_0_1.software.ContentIdentifier;
import org.spdx.library.model.v3_0_1.software.SoftwarePurpose;
import org.spdx.library.model.v3_0_1.software.SpdxPackage;

/**
 * GENERATED FILE - DO NOT MODIFY
**/

public class AIPackageTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3_0_1.ai.AIPackage#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		AIPackage testAIPackage = generator.builderForAIPackageTests(TEST_OBJECT_URI).build();
		List<String> result = testAIPackage.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.ai.AIPackage#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		AIPackage testAIPackage = generator.builderForAIPackageTests(TEST_OBJECT_URI).build();
		assertEquals("AI.AIPackage", testAIPackage.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.ai.AIPackage#Element(org.spdx.library.model.v3_0_1.ai.AIPackage.AIPackageBuilder)}.
	 */
	public void testAIPackageAIPackageBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForAIPackageTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		AIPackage testAIPackage = generator.builderForAIPackageTests(TEST_OBJECT_URI).build();
		AIPackage test2AIPackage = generator.builderForAIPackageTests("https://testObject2").build();
		assertTrue(testAIPackage.equivalent(test2AIPackage));
		assertTrue(test2AIPackage.equivalent(testAIPackage));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.ai.AIPackage#setCreationInfo}.
	 */
	public void testAIPackagesetCreationInfo() throws InvalidSPDXAnalysisException {
		AIPackage testAIPackage = generator.builderForAIPackageTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testAIPackage.getCreationInfo());
//		testAIPackage.setCreationInfo(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testAIPackage.getCreationInfo());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.ai.AIPackage#setEnergyConsumption}.
	 */
	public void testAIPackagesetEnergyConsumption() throws InvalidSPDXAnalysisException {
		AIPackage testAIPackage = generator.builderForAIPackageTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testAIPackage.getEnergyConsumption());
//		testAIPackage.setEnergyConsumption(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testAIPackage.getEnergyConsumption());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.ai.AIPackage#setSuppliedBy}.
	 */
	public void testAIPackagesetSuppliedBy() throws InvalidSPDXAnalysisException {
		AIPackage testAIPackage = generator.builderForAIPackageTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testAIPackage.getSuppliedBy());
//		testAIPackage.setSuppliedBy(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testAIPackage.getSuppliedBy());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.ai.AIPackage#setAutonomyType}.
	 */
	public void testAIPackagesetAutonomyType() throws InvalidSPDXAnalysisException {
		AIPackage testAIPackage = generator.builderForAIPackageTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.AUTONOMY_TYPE_TEST_VALUE1), testAIPackage.getAutonomyType());
		testAIPackage.setAutonomyType(TestValuesGenerator.AUTONOMY_TYPE_TEST_VALUE2);
		assertEquals(Optional.of(TestValuesGenerator.AUTONOMY_TYPE_TEST_VALUE2), testAIPackage.getAutonomyType());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.ai.AIPackage#setUseSensitivePersonalInformation}.
	 */
	public void testAIPackagesetUseSensitivePersonalInformation() throws InvalidSPDXAnalysisException {
		AIPackage testAIPackage = generator.builderForAIPackageTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.USE_SENSITIVE_PERSONAL_INFORMATION_TEST_VALUE1), testAIPackage.getUseSensitivePersonalInformation());
		testAIPackage.setUseSensitivePersonalInformation(TestValuesGenerator.USE_SENSITIVE_PERSONAL_INFORMATION_TEST_VALUE2);
		assertEquals(Optional.of(TestValuesGenerator.USE_SENSITIVE_PERSONAL_INFORMATION_TEST_VALUE2), testAIPackage.getUseSensitivePersonalInformation());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.ai.AIPackage#setSafetyRiskAssessment}.
	 */
	public void testAIPackagesetSafetyRiskAssessment() throws InvalidSPDXAnalysisException {
		AIPackage testAIPackage = generator.builderForAIPackageTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SAFETY_RISK_ASSESSMENT_TEST_VALUE1), testAIPackage.getSafetyRiskAssessment());
		testAIPackage.setSafetyRiskAssessment(TestValuesGenerator.SAFETY_RISK_ASSESSMENT_TEST_VALUE2);
		assertEquals(Optional.of(TestValuesGenerator.SAFETY_RISK_ASSESSMENT_TEST_VALUE2), testAIPackage.getSafetyRiskAssessment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.ai.AIPackage#setPrimaryPurpose}.
	 */
	public void testAIPackagesetPrimaryPurpose() throws InvalidSPDXAnalysisException {
		AIPackage testAIPackage = generator.builderForAIPackageTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.PRIMARY_PURPOSE_TEST_VALUE1), testAIPackage.getPrimaryPurpose());
		testAIPackage.setPrimaryPurpose(TestValuesGenerator.PRIMARY_PURPOSE_TEST_VALUE2);
		assertEquals(Optional.of(TestValuesGenerator.PRIMARY_PURPOSE_TEST_VALUE2), testAIPackage.getPrimaryPurpose());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.ai.AIPackage#setValidUntilTime}.
	 */
	public void testAIPackagesetValidUntilTime() throws InvalidSPDXAnalysisException {
		AIPackage testAIPackage = generator.builderForAIPackageTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.VALID_UNTIL_TIME_TEST_VALUE), testAIPackage.getValidUntilTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testAIPackage.setValidUntilTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testAIPackage.getValidUntilTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.ai.AIPackage#setDownloadLocation}.
	 */
	public void testAIPackagesetDownloadLocation() throws InvalidSPDXAnalysisException {
		AIPackage testAIPackage = generator.builderForAIPackageTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DOWNLOAD_LOCATION_TEST_VALUE), testAIPackage.getDownloadLocation());
		String newStringValue = "new downloadLocation value";
		testAIPackage.setDownloadLocation(newStringValue);
		assertEquals(Optional.of(newStringValue), testAIPackage.getDownloadLocation());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.ai.AIPackage#setBuiltTime}.
	 */
	public void testAIPackagesetBuiltTime() throws InvalidSPDXAnalysisException {
		AIPackage testAIPackage = generator.builderForAIPackageTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.BUILT_TIME_TEST_VALUE), testAIPackage.getBuiltTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testAIPackage.setBuiltTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testAIPackage.getBuiltTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.ai.AIPackage#setSummary}.
	 */
	public void testAIPackagesetSummary() throws InvalidSPDXAnalysisException {
		AIPackage testAIPackage = generator.builderForAIPackageTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SUMMARY_TEST_VALUE), testAIPackage.getSummary());
		String newStringValue = "new summary value";
		testAIPackage.setSummary(newStringValue);
		assertEquals(Optional.of(newStringValue), testAIPackage.getSummary());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.ai.AIPackage#setPackageVersion}.
	 */
	public void testAIPackagesetPackageVersion() throws InvalidSPDXAnalysisException {
		AIPackage testAIPackage = generator.builderForAIPackageTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.PACKAGE_VERSION_TEST_VALUE), testAIPackage.getPackageVersion());
		String newStringValue = "new packageVersion value";
		testAIPackage.setPackageVersion(newStringValue);
		assertEquals(Optional.of(newStringValue), testAIPackage.getPackageVersion());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.ai.AIPackage#setReleaseTime}.
	 */
	public void testAIPackagesetReleaseTime() throws InvalidSPDXAnalysisException {
		AIPackage testAIPackage = generator.builderForAIPackageTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.RELEASE_TIME_TEST_VALUE), testAIPackage.getReleaseTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testAIPackage.setReleaseTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testAIPackage.getReleaseTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.ai.AIPackage#setCopyrightText}.
	 */
	public void testAIPackagesetCopyrightText() throws InvalidSPDXAnalysisException {
		AIPackage testAIPackage = generator.builderForAIPackageTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COPYRIGHT_TEXT_TEST_VALUE), testAIPackage.getCopyrightText());
		String newStringValue = "new copyrightText value";
		testAIPackage.setCopyrightText(newStringValue);
		assertEquals(Optional.of(newStringValue), testAIPackage.getCopyrightText());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.ai.AIPackage#setInformationAboutTraining}.
	 */
	public void testAIPackagesetInformationAboutTraining() throws InvalidSPDXAnalysisException {
		AIPackage testAIPackage = generator.builderForAIPackageTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.INFORMATION_ABOUT_TRAINING_TEST_VALUE), testAIPackage.getInformationAboutTraining());
		String newStringValue = "new informationAboutTraining value";
		testAIPackage.setInformationAboutTraining(newStringValue);
		assertEquals(Optional.of(newStringValue), testAIPackage.getInformationAboutTraining());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.ai.AIPackage#setComment}.
	 */
	public void testAIPackagesetComment() throws InvalidSPDXAnalysisException {
		AIPackage testAIPackage = generator.builderForAIPackageTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMMENT_TEST_VALUE), testAIPackage.getComment());
		String newStringValue = "new comment value";
		testAIPackage.setComment(newStringValue);
		assertEquals(Optional.of(newStringValue), testAIPackage.getComment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.ai.AIPackage#setHomePage}.
	 */
	public void testAIPackagesetHomePage() throws InvalidSPDXAnalysisException {
		AIPackage testAIPackage = generator.builderForAIPackageTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.HOME_PAGE_TEST_VALUE), testAIPackage.getHomePage());
		String newStringValue = "new homePage value";
		testAIPackage.setHomePage(newStringValue);
		assertEquals(Optional.of(newStringValue), testAIPackage.getHomePage());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.ai.AIPackage#setSourceInfo}.
	 */
	public void testAIPackagesetSourceInfo() throws InvalidSPDXAnalysisException {
		AIPackage testAIPackage = generator.builderForAIPackageTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SOURCE_INFO_TEST_VALUE), testAIPackage.getSourceInfo());
		String newStringValue = "new sourceInfo value";
		testAIPackage.setSourceInfo(newStringValue);
		assertEquals(Optional.of(newStringValue), testAIPackage.getSourceInfo());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.ai.AIPackage#setLimitation}.
	 */
	public void testAIPackagesetLimitation() throws InvalidSPDXAnalysisException {
		AIPackage testAIPackage = generator.builderForAIPackageTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.LIMITATION_TEST_VALUE), testAIPackage.getLimitation());
		String newStringValue = "new limitation value";
		testAIPackage.setLimitation(newStringValue);
		assertEquals(Optional.of(newStringValue), testAIPackage.getLimitation());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.ai.AIPackage#setDescription}.
	 */
	public void testAIPackagesetDescription() throws InvalidSPDXAnalysisException {
		AIPackage testAIPackage = generator.builderForAIPackageTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DESCRIPTION_TEST_VALUE), testAIPackage.getDescription());
		String newStringValue = "new description value";
		testAIPackage.setDescription(newStringValue);
		assertEquals(Optional.of(newStringValue), testAIPackage.getDescription());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.ai.AIPackage#setName}.
	 */
	public void testAIPackagesetName() throws InvalidSPDXAnalysisException {
		AIPackage testAIPackage = generator.builderForAIPackageTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.NAME_TEST_VALUE), testAIPackage.getName());
		String newStringValue = "new name value";
		testAIPackage.setName(newStringValue);
		assertEquals(Optional.of(newStringValue), testAIPackage.getName());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.ai.AIPackage#setPackageUrl}.
	 */
	public void testAIPackagesetPackageUrl() throws InvalidSPDXAnalysisException {
		AIPackage testAIPackage = generator.builderForAIPackageTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.PACKAGE_URL_TEST_VALUE), testAIPackage.getPackageUrl());
		String newStringValue = "new packageUrl value";
		testAIPackage.setPackageUrl(newStringValue);
		assertEquals(Optional.of(newStringValue), testAIPackage.getPackageUrl());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.ai.AIPackage#setInformationAboutApplication}.
	 */
	public void testAIPackagesetInformationAboutApplication() throws InvalidSPDXAnalysisException {
		AIPackage testAIPackage = generator.builderForAIPackageTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.INFORMATION_ABOUT_APPLICATION_TEST_VALUE), testAIPackage.getInformationAboutApplication());
		String newStringValue = "new informationAboutApplication value";
		testAIPackage.setInformationAboutApplication(newStringValue);
		assertEquals(Optional.of(newStringValue), testAIPackage.getInformationAboutApplication());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.ai.AIPackage#getContentIdentifier}.
	 */
	public void testAIPackagegetContentIdentifiers() throws InvalidSPDXAnalysisException {
		AIPackage testAIPackage = generator.builderForAIPackageTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testAIPackage.getContentIdentifiers())));
//		testAIPackage.getContentIdentifiers().clear();
//		testAIPackage.getContentIdentifiers().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testAIPackage.getContentIdentifiers())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.ai.AIPackage#getVerifiedUsing}.
	 */
	public void testAIPackagegetVerifiedUsings() throws InvalidSPDXAnalysisException {
		AIPackage testAIPackage = generator.builderForAIPackageTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testAIPackage.getVerifiedUsings())));
//		testAIPackage.getVerifiedUsings().clear();
//		testAIPackage.getVerifiedUsings().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testAIPackage.getVerifiedUsings())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.ai.AIPackage#getHyperparameter}.
	 */
	public void testAIPackagegetHyperparameters() throws InvalidSPDXAnalysisException {
		AIPackage testAIPackage = generator.builderForAIPackageTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testAIPackage.getHyperparameters())));
//		testAIPackage.getHyperparameters().clear();
//		testAIPackage.getHyperparameters().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testAIPackage.getHyperparameters())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.ai.AIPackage#getMetric}.
	 */
	public void testAIPackagegetMetrics() throws InvalidSPDXAnalysisException {
		AIPackage testAIPackage = generator.builderForAIPackageTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testAIPackage.getMetrics())));
//		testAIPackage.getMetrics().clear();
//		testAIPackage.getMetrics().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testAIPackage.getMetrics())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.ai.AIPackage#getExternalRef}.
	 */
	public void testAIPackagegetExternalRefs() throws InvalidSPDXAnalysisException {
		AIPackage testAIPackage = generator.builderForAIPackageTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testAIPackage.getExternalRefs())));
//		testAIPackage.getExternalRefs().clear();
//		testAIPackage.getExternalRefs().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testAIPackage.getExternalRefs())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.ai.AIPackage#getMetricDecisionThreshold}.
	 */
	public void testAIPackagegetMetricDecisionThresholds() throws InvalidSPDXAnalysisException {
		AIPackage testAIPackage = generator.builderForAIPackageTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testAIPackage.getMetricDecisionThresholds())));
//		testAIPackage.getMetricDecisionThresholds().clear();
//		testAIPackage.getMetricDecisionThresholds().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testAIPackage.getMetricDecisionThresholds())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.ai.AIPackage#getExternalIdentifier}.
	 */
	public void testAIPackagegetExternalIdentifiers() throws InvalidSPDXAnalysisException {
		AIPackage testAIPackage = generator.builderForAIPackageTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testAIPackage.getExternalIdentifiers())));
//		testAIPackage.getExternalIdentifiers().clear();
//		testAIPackage.getExternalIdentifiers().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testAIPackage.getExternalIdentifiers())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.ai.AIPackage#getExtension}.
	 */
	public void testAIPackagegetExtensions() throws InvalidSPDXAnalysisException {
		AIPackage testAIPackage = generator.builderForAIPackageTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testAIPackage.getExtensions())));
//		testAIPackage.getExtensions().clear();
//		testAIPackage.getExtensions().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testAIPackage.getExtensions())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.ai.AIPackage#getOriginatedBy}.
	 */
	public void testAIPackagegetOriginatedBys() throws InvalidSPDXAnalysisException {
		AIPackage testAIPackage = generator.builderForAIPackageTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testAIPackage.getOriginatedBys())));
//		testAIPackage.getOriginatedBys().clear();
//		testAIPackage.getOriginatedBys().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testAIPackage.getOriginatedBys())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.ai.AIPackage#getModelDataPreprocessings}.
	 */
	public void testAIPackagegetModelDataPreprocessings() throws InvalidSPDXAnalysisException {
		AIPackage testAIPackage = generator.builderForAIPackageTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.MODEL_DATA_PREPROCESSING_TEST_LIST1, new ArrayList<>(testAIPackage.getModelDataPreprocessings())));
		testAIPackage.getModelDataPreprocessings().clear();
		testAIPackage.getModelDataPreprocessings().addAll(TestValuesGenerator.MODEL_DATA_PREPROCESSING_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.MODEL_DATA_PREPROCESSING_TEST_LIST2, new ArrayList<>(testAIPackage.getModelDataPreprocessings())));
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.ai.AIPackage#getDomains}.
	 */
	public void testAIPackagegetDomains() throws InvalidSPDXAnalysisException {
		AIPackage testAIPackage = generator.builderForAIPackageTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.DOMAIN_TEST_LIST1, new ArrayList<>(testAIPackage.getDomains())));
		testAIPackage.getDomains().clear();
		testAIPackage.getDomains().addAll(TestValuesGenerator.DOMAIN_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.DOMAIN_TEST_LIST2, new ArrayList<>(testAIPackage.getDomains())));
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.ai.AIPackage#getAttributionTexts}.
	 */
	public void testAIPackagegetAttributionTexts() throws InvalidSPDXAnalysisException {
		AIPackage testAIPackage = generator.builderForAIPackageTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.ATTRIBUTION_TEXT_TEST_LIST1, new ArrayList<>(testAIPackage.getAttributionTexts())));
		testAIPackage.getAttributionTexts().clear();
		testAIPackage.getAttributionTexts().addAll(TestValuesGenerator.ATTRIBUTION_TEXT_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.ATTRIBUTION_TEXT_TEST_LIST2, new ArrayList<>(testAIPackage.getAttributionTexts())));
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.ai.AIPackage#getTypeOfModels}.
	 */
	public void testAIPackagegetTypeOfModels() throws InvalidSPDXAnalysisException {
		AIPackage testAIPackage = generator.builderForAIPackageTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.TYPE_OF_MODEL_TEST_LIST1, new ArrayList<>(testAIPackage.getTypeOfModels())));
		testAIPackage.getTypeOfModels().clear();
		testAIPackage.getTypeOfModels().addAll(TestValuesGenerator.TYPE_OF_MODEL_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.TYPE_OF_MODEL_TEST_LIST2, new ArrayList<>(testAIPackage.getTypeOfModels())));
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.ai.AIPackage#getStandardNames}.
	 */
	public void testAIPackagegetStandardNames() throws InvalidSPDXAnalysisException {
		AIPackage testAIPackage = generator.builderForAIPackageTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.STANDARD_NAME_TEST_LIST1, new ArrayList<>(testAIPackage.getStandardNames())));
		testAIPackage.getStandardNames().clear();
		testAIPackage.getStandardNames().addAll(TestValuesGenerator.STANDARD_NAME_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.STANDARD_NAME_TEST_LIST2, new ArrayList<>(testAIPackage.getStandardNames())));
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.ai.AIPackage#getStandardCompliances}.
	 */
	public void testAIPackagegetStandardCompliances() throws InvalidSPDXAnalysisException {
		AIPackage testAIPackage = generator.builderForAIPackageTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.STANDARD_COMPLIANCE_TEST_LIST1, new ArrayList<>(testAIPackage.getStandardCompliances())));
		testAIPackage.getStandardCompliances().clear();
		testAIPackage.getStandardCompliances().addAll(TestValuesGenerator.STANDARD_COMPLIANCE_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.STANDARD_COMPLIANCE_TEST_LIST2, new ArrayList<>(testAIPackage.getStandardCompliances())));
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.ai.AIPackage#getModelExplainabilitys}.
	 */
	public void testAIPackagegetModelExplainabilitys() throws InvalidSPDXAnalysisException {
		AIPackage testAIPackage = generator.builderForAIPackageTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.MODEL_EXPLAINABILITY_TEST_LIST1, new ArrayList<>(testAIPackage.getModelExplainabilitys())));
		testAIPackage.getModelExplainabilitys().clear();
		testAIPackage.getModelExplainabilitys().addAll(TestValuesGenerator.MODEL_EXPLAINABILITY_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.MODEL_EXPLAINABILITY_TEST_LIST2, new ArrayList<>(testAIPackage.getModelExplainabilitys())));
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.ai.AIPackage#getSupportLevel}.
	 */
	public void testAIPackagegetSupportLevels() throws InvalidSPDXAnalysisException {
		AIPackage testAIPackage = generator.builderForAIPackageTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST1, new ArrayList<>(testAIPackage.getSupportLevels())));
		testAIPackage.getSupportLevels().clear();
		testAIPackage.getSupportLevels().addAll(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST2, new ArrayList<>(testAIPackage.getSupportLevels())));
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.ai.AIPackage#getAdditionalPurpose}.
	 */
	public void testAIPackagegetAdditionalPurposes() throws InvalidSPDXAnalysisException {
		AIPackage testAIPackage = generator.builderForAIPackageTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.ADDITIONAL_PURPOSE_TEST_LIST1, new ArrayList<>(testAIPackage.getAdditionalPurposes())));
		testAIPackage.getAdditionalPurposes().clear();
		testAIPackage.getAdditionalPurposes().addAll(TestValuesGenerator.ADDITIONAL_PURPOSE_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.ADDITIONAL_PURPOSE_TEST_LIST2, new ArrayList<>(testAIPackage.getAdditionalPurposes())));
	}
}