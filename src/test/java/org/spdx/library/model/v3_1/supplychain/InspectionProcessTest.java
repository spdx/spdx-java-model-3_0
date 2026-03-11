/**
 * SPDX-FileCopyrightText: Copyright (c) 2026 Source Auditor Inc.
 * SPDX-FileType: SOURCE
 * SPDX-License-Identifier: Apache-2.0
 */
package org.spdx.library.model.v3_1.supplychain;

import javax.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.spdx.core.CoreModelObject;
import org.spdx.core.DefaultModelStore;
import org.spdx.core.InvalidSPDXAnalysisException;
import org.spdx.core.IModelCopyManager;
import org.spdx.core.IndividualUriValue;
import org.spdx.library.model.v3_1.ModelObjectV3;
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
import org.spdx.library.model.v3_1.MockCopyManager;
import org.spdx.library.model.v3_1.MockModelStore;
import org.spdx.library.model.v3_1.SpdxConstantsV3;
import org.spdx.library.model.v3_1.SpdxModelInfoV3_0;
import org.spdx.library.model.v3_1.TestValuesGenerator;
import org.spdx.library.model.v3_1.UnitTestHelper;
import org.spdx.library.model.v3_1.core.Agent.AgentBuilder;
import org.spdx.library.model.v3_1.core.Agent;
import org.spdx.library.model.v3_1.core.CreationInfo;
import org.spdx.library.model.v3_1.core.Element;
import org.spdx.library.model.v3_1.core.ExternalIdentifier;
import org.spdx.library.model.v3_1.core.ExternalRef;
import org.spdx.library.model.v3_1.core.IntegrityMethod;
import org.spdx.library.model.v3_1.core.Location;
import org.spdx.library.model.v3_1.core.ProcessReadinessType;
import org.spdx.library.model.v3_1.core.ProfileIdentifierType;
import org.spdx.library.model.v3_1.core.SupportType;
import org.spdx.library.model.v3_1.extension.Extension;
import org.spdx.library.model.v3_1.supplychain.InspectionProcess.InspectionProcessBuilder;

/**
 * GENERATED FILE - DO NOT MODIFY
 */
public class InspectionProcessTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.InspectionProcess#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		InspectionProcess testInspectionProcess = generator.builderForInspectionProcessTests(TEST_OBJECT_URI).build();
		List<String> result = testInspectionProcess.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.InspectionProcess#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		InspectionProcess testInspectionProcess = generator.builderForInspectionProcessTests(TEST_OBJECT_URI).build();
		assertEquals("SupplyChain.InspectionProcess", testInspectionProcess.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.InspectionProcess#Element(org.spdx.library.model.v3_1.supplychain.InspectionProcess.InspectionProcessBuilder)}.
	 */
	public void testInspectionProcessInspectionProcessBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForInspectionProcessTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		InspectionProcess testInspectionProcess = generator.builderForInspectionProcessTests(TEST_OBJECT_URI).build();
		InspectionProcess test2InspectionProcess = generator.builderForInspectionProcessTests("https://testObject2").build();
		assertTrue(testInspectionProcess.equivalent(test2InspectionProcess));
		assertTrue(test2InspectionProcess.equivalent(testInspectionProcess));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.InspectionProcess#setSuppliedBy}.
	 */
	public void testInspectionProcesssetSuppliedBy() throws InvalidSPDXAnalysisException {
		InspectionProcess testInspectionProcess = generator.builderForInspectionProcessTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testInspectionProcess.getSuppliedBy());
//		testInspectionProcess.setSuppliedBy(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testInspectionProcess.getSuppliedBy());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.InspectionProcess#setExtension}.
	 */
	public void testInspectionProcesssetExtension() throws InvalidSPDXAnalysisException {
		InspectionProcess testInspectionProcess = generator.builderForInspectionProcessTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testInspectionProcess.getExtension());
//		testInspectionProcess.setExtension(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testInspectionProcess.getExtension());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.InspectionProcess#setCreationInfo}.
	 */
	public void testInspectionProcesssetCreationInfo() throws InvalidSPDXAnalysisException {
		InspectionProcess testInspectionProcess = generator.builderForInspectionProcessTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testInspectionProcess.getCreationInfo());
//		testInspectionProcess.setCreationInfo(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testInspectionProcess.getCreationInfo());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.InspectionProcess#setProcessReadiness}.
	 */
	public void testInspectionProcesssetProcessReadiness() throws InvalidSPDXAnalysisException {
		InspectionProcess testInspectionProcess = generator.builderForInspectionProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.PROCESS_READINESS_TEST_VALUE1), testInspectionProcess.getProcessReadiness());
		testInspectionProcess.setProcessReadiness(TestValuesGenerator.PROCESS_READINESS_TEST_VALUE2);
		assertEquals(Optional.of(TestValuesGenerator.PROCESS_READINESS_TEST_VALUE2), testInspectionProcess.getProcessReadiness());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.InspectionProcess#setIntendedUse}.
	 */
	public void testInspectionProcesssetIntendedUse() throws InvalidSPDXAnalysisException {
		InspectionProcess testInspectionProcess = generator.builderForInspectionProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.INTENDED_USE_TEST_VALUE), testInspectionProcess.getIntendedUse());
		String newStringValue = "new intendedUse value";
		testInspectionProcess.setIntendedUse(newStringValue);
		assertEquals(Optional.of(newStringValue), testInspectionProcess.getIntendedUse());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.InspectionProcess#setDescription}.
	 */
	public void testInspectionProcesssetDescription() throws InvalidSPDXAnalysisException {
		InspectionProcess testInspectionProcess = generator.builderForInspectionProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DESCRIPTION_TEST_VALUE), testInspectionProcess.getDescription());
		String newStringValue = "new description value";
		testInspectionProcess.setDescription(newStringValue);
		assertEquals(Optional.of(newStringValue), testInspectionProcess.getDescription());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.InspectionProcess#setBuiltTime}.
	 */
	public void testInspectionProcesssetBuiltTime() throws InvalidSPDXAnalysisException {
		InspectionProcess testInspectionProcess = generator.builderForInspectionProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.BUILT_TIME_TEST_VALUE), testInspectionProcess.getBuiltTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testInspectionProcess.setBuiltTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testInspectionProcess.getBuiltTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.InspectionProcess#setComment}.
	 */
	public void testInspectionProcesssetComment() throws InvalidSPDXAnalysisException {
		InspectionProcess testInspectionProcess = generator.builderForInspectionProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMMENT_TEST_VALUE), testInspectionProcess.getComment());
		String newStringValue = "new comment value";
		testInspectionProcess.setComment(newStringValue);
		assertEquals(Optional.of(newStringValue), testInspectionProcess.getComment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.InspectionProcess#setProcessVersion}.
	 */
	public void testInspectionProcesssetProcessVersion() throws InvalidSPDXAnalysisException {
		InspectionProcess testInspectionProcess = generator.builderForInspectionProcessTests(TEST_OBJECT_URI).build();
		assertEquals(TestValuesGenerator.PROCESS_VERSION_TEST_VALUE, testInspectionProcess.getProcessVersion());
		String newStringValue = "new processVersion value";
		testInspectionProcess.setProcessVersion(newStringValue);
		assertEquals(newStringValue, testInspectionProcess.getProcessVersion());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.InspectionProcess#setValidUntilTime}.
	 */
	public void testInspectionProcesssetValidUntilTime() throws InvalidSPDXAnalysisException {
		InspectionProcess testInspectionProcess = generator.builderForInspectionProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.VALID_UNTIL_TIME_TEST_VALUE), testInspectionProcess.getValidUntilTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testInspectionProcess.setValidUntilTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testInspectionProcess.getValidUntilTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.InspectionProcess#setReleaseTime}.
	 */
	public void testInspectionProcesssetReleaseTime() throws InvalidSPDXAnalysisException {
		InspectionProcess testInspectionProcess = generator.builderForInspectionProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.RELEASE_TIME_TEST_VALUE), testInspectionProcess.getReleaseTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testInspectionProcess.setReleaseTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testInspectionProcess.getReleaseTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.InspectionProcess#setProcessRationale}.
	 */
	public void testInspectionProcesssetProcessRationale() throws InvalidSPDXAnalysisException {
		InspectionProcess testInspectionProcess = generator.builderForInspectionProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.PROCESS_RATIONALE_TEST_VALUE), testInspectionProcess.getProcessRationale());
		String newStringValue = "new processRationale value";
		testInspectionProcess.setProcessRationale(newStringValue);
		assertEquals(Optional.of(newStringValue), testInspectionProcess.getProcessRationale());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.InspectionProcess#setName}.
	 */
	public void testInspectionProcesssetName() throws InvalidSPDXAnalysisException {
		InspectionProcess testInspectionProcess = generator.builderForInspectionProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.NAME_TEST_VALUE), testInspectionProcess.getName());
		String newStringValue = "new name value";
		testInspectionProcess.setName(newStringValue);
		assertEquals(Optional.of(newStringValue), testInspectionProcess.getName());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.InspectionProcess#setSummary}.
	 */
	public void testInspectionProcesssetSummary() throws InvalidSPDXAnalysisException {
		InspectionProcess testInspectionProcess = generator.builderForInspectionProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SUMMARY_TEST_VALUE), testInspectionProcess.getSummary());
		String newStringValue = "new summary value";
		testInspectionProcess.setSummary(newStringValue);
		assertEquals(Optional.of(newStringValue), testInspectionProcess.getSummary());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.InspectionProcess#getVerifiedUsing}.
	 */
	public void testInspectionProcessgetVerifiedUsings() throws InvalidSPDXAnalysisException {
		InspectionProcess testInspectionProcess = generator.builderForInspectionProcessTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testInspectionProcess.getVerifiedUsings())));
//		testInspectionProcess.getVerifiedUsings().clear();
//		testInspectionProcess.getVerifiedUsings().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testInspectionProcess.getVerifiedUsings())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.InspectionProcess#getExternalRef}.
	 */
	public void testInspectionProcessgetExternalRefs() throws InvalidSPDXAnalysisException {
		InspectionProcess testInspectionProcess = generator.builderForInspectionProcessTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testInspectionProcess.getExternalRefs())));
//		testInspectionProcess.getExternalRefs().clear();
//		testInspectionProcess.getExternalRefs().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testInspectionProcess.getExternalRefs())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.InspectionProcess#getOriginatedBy}.
	 */
	public void testInspectionProcessgetOriginatedBys() throws InvalidSPDXAnalysisException {
		InspectionProcess testInspectionProcess = generator.builderForInspectionProcessTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testInspectionProcess.getOriginatedBys())));
//		testInspectionProcess.getOriginatedBys().clear();
//		testInspectionProcess.getOriginatedBys().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testInspectionProcess.getOriginatedBys())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.InspectionProcess#getPlannedInspectionLocation}.
	 */
	public void testInspectionProcessgetPlannedInspectionLocations() throws InvalidSPDXAnalysisException {
		InspectionProcess testInspectionProcess = generator.builderForInspectionProcessTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testInspectionProcess.getPlannedInspectionLocations())));
//		testInspectionProcess.getPlannedInspectionLocations().clear();
//		testInspectionProcess.getPlannedInspectionLocations().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testInspectionProcess.getPlannedInspectionLocations())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.InspectionProcess#getExternalIdentifier}.
	 */
	public void testInspectionProcessgetExternalIdentifiers() throws InvalidSPDXAnalysisException {
		InspectionProcess testInspectionProcess = generator.builderForInspectionProcessTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testInspectionProcess.getExternalIdentifiers())));
//		testInspectionProcess.getExternalIdentifiers().clear();
//		testInspectionProcess.getExternalIdentifiers().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testInspectionProcess.getExternalIdentifiers())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.InspectionProcess#getStandardNames}.
	 */
	public void testInspectionProcessgetStandardNames() throws InvalidSPDXAnalysisException {
		InspectionProcess testInspectionProcess = generator.builderForInspectionProcessTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.STANDARD_NAME_TEST_LIST1, new ArrayList<>(testInspectionProcess.getStandardNames())));
		testInspectionProcess.getStandardNames().clear();
		testInspectionProcess.getStandardNames().addAll(TestValuesGenerator.STANDARD_NAME_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.STANDARD_NAME_TEST_LIST2, new ArrayList<>(testInspectionProcess.getStandardNames())));
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.InspectionProcess#getSupportLevel}.
	 */
	public void testInspectionProcessgetSupportLevels() throws InvalidSPDXAnalysisException {
		InspectionProcess testInspectionProcess = generator.builderForInspectionProcessTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST1, new ArrayList<>(testInspectionProcess.getSupportLevels())));
		testInspectionProcess.getSupportLevels().clear();
		testInspectionProcess.getSupportLevels().addAll(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST2, new ArrayList<>(testInspectionProcess.getSupportLevels())));
	}
}
