/**
 * SPDX-FileCopyrightText: Copyright (c) 2026 Source Auditor Inc.
 * SPDX-FileType: SOURCE
 * SPDX-License-Identifier: Apache-2.0
 */
package org.spdx.library.model.v3.supplychain;

import javax.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.spdx.core.CoreModelObject;
import org.spdx.core.DefaultModelStore;
import org.spdx.core.InvalidSPDXAnalysisException;
import org.spdx.core.IModelCopyManager;
import org.spdx.core.IndividualUriValue;
import org.spdx.library.model.v3.ModelObjectV3;
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
import org.spdx.library.model.v3.MockCopyManager;
import org.spdx.library.model.v3.MockModelStore;
import org.spdx.library.model.v3.SpdxConstantsV3;
import org.spdx.library.model.v3.TestValuesGenerator;
import org.spdx.library.model.v3.UnitTestHelper;
import org.spdx.library.model.v3.core.Agent.AgentBuilder;
import org.spdx.library.model.v3.core.Agent;
import org.spdx.library.model.v3.core.CreationInfo;
import org.spdx.library.model.v3.core.Element;
import org.spdx.library.model.v3.core.ExternalIdentifier;
import org.spdx.library.model.v3.core.ExternalRef;
import org.spdx.library.model.v3.core.IntegrityMethod;
import org.spdx.library.model.v3.core.Location;
import org.spdx.library.model.v3.core.ProcessReadinessType;
import org.spdx.library.model.v3.core.ProfileIdentifierType;
import org.spdx.library.model.v3.core.SupportType;
import org.spdx.library.model.v3.extension.Extension;
import org.spdx.library.model.v3.supplychain.TransportProcess.TransportProcessBuilder;

/**
 * GENERATED FILE - DO NOT MODIFY
 */
public class TransportProcessTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3.supplychain.TransportProcess#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		TransportProcess testTransportProcess = generator.builderForTransportProcessTests(TEST_OBJECT_URI).build();
		List<String> result = testTransportProcess.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.TransportProcess#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		TransportProcess testTransportProcess = generator.builderForTransportProcessTests(TEST_OBJECT_URI).build();
		assertEquals("SupplyChain.TransportProcess", testTransportProcess.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.TransportProcess#Element(org.spdx.library.model.v3.supplychain.TransportProcess.TransportProcessBuilder)}.
	 */
	public void testTransportProcessTransportProcessBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForTransportProcessTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		TransportProcess testTransportProcess = generator.builderForTransportProcessTests(TEST_OBJECT_URI).build();
		TransportProcess test2TransportProcess = generator.builderForTransportProcessTests("https://testObject2").build();
		assertTrue(testTransportProcess.equivalent(test2TransportProcess));
		assertTrue(test2TransportProcess.equivalent(testTransportProcess));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.TransportProcess#setSuppliedBy}.
	 */
	public void testTransportProcesssetSuppliedBy() throws InvalidSPDXAnalysisException {
		TransportProcess testTransportProcess = generator.builderForTransportProcessTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testTransportProcess.getSuppliedBy());
//		testTransportProcess.setSuppliedBy(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testTransportProcess.getSuppliedBy());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.TransportProcess#setCreationInfo}.
	 */
	public void testTransportProcesssetCreationInfo() throws InvalidSPDXAnalysisException {
		TransportProcess testTransportProcess = generator.builderForTransportProcessTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testTransportProcess.getCreationInfo());
//		testTransportProcess.setCreationInfo(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testTransportProcess.getCreationInfo());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.TransportProcess#setProcessReadiness}.
	 */
	public void testTransportProcesssetProcessReadiness() throws InvalidSPDXAnalysisException {
		TransportProcess testTransportProcess = generator.builderForTransportProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.PROCESS_READINESS_TEST_VALUE1), testTransportProcess.getProcessReadiness());
		testTransportProcess.setProcessReadiness(TestValuesGenerator.PROCESS_READINESS_TEST_VALUE2);
		assertEquals(Optional.of(TestValuesGenerator.PROCESS_READINESS_TEST_VALUE2), testTransportProcess.getProcessReadiness());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.TransportProcess#setIntendedUse}.
	 */
	public void testTransportProcesssetIntendedUse() throws InvalidSPDXAnalysisException {
		TransportProcess testTransportProcess = generator.builderForTransportProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.INTENDED_USE_TEST_VALUE), testTransportProcess.getIntendedUse());
		String newStringValue = "new intendedUse value";
		testTransportProcess.setIntendedUse(newStringValue);
		assertEquals(Optional.of(newStringValue), testTransportProcess.getIntendedUse());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.TransportProcess#setDescription}.
	 */
	public void testTransportProcesssetDescription() throws InvalidSPDXAnalysisException {
		TransportProcess testTransportProcess = generator.builderForTransportProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DESCRIPTION_TEST_VALUE), testTransportProcess.getDescription());
		String newStringValue = "new description value";
		testTransportProcess.setDescription(newStringValue);
		assertEquals(Optional.of(newStringValue), testTransportProcess.getDescription());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.TransportProcess#setBuiltTime}.
	 */
	public void testTransportProcesssetBuiltTime() throws InvalidSPDXAnalysisException {
		TransportProcess testTransportProcess = generator.builderForTransportProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.BUILT_TIME_TEST_VALUE), testTransportProcess.getBuiltTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testTransportProcess.setBuiltTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testTransportProcess.getBuiltTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.TransportProcess#setComment}.
	 */
	public void testTransportProcesssetComment() throws InvalidSPDXAnalysisException {
		TransportProcess testTransportProcess = generator.builderForTransportProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMMENT_TEST_VALUE), testTransportProcess.getComment());
		String newStringValue = "new comment value";
		testTransportProcess.setComment(newStringValue);
		assertEquals(Optional.of(newStringValue), testTransportProcess.getComment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.TransportProcess#setProcessVersion}.
	 */
	public void testTransportProcesssetProcessVersion() throws InvalidSPDXAnalysisException {
		TransportProcess testTransportProcess = generator.builderForTransportProcessTests(TEST_OBJECT_URI).build();
		assertEquals(TestValuesGenerator.PROCESS_VERSION_TEST_VALUE, testTransportProcess.getProcessVersion());
		String newStringValue = "new processVersion value";
		testTransportProcess.setProcessVersion(newStringValue);
		assertEquals(newStringValue, testTransportProcess.getProcessVersion());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.TransportProcess#setValidUntilTime}.
	 */
	public void testTransportProcesssetValidUntilTime() throws InvalidSPDXAnalysisException {
		TransportProcess testTransportProcess = generator.builderForTransportProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.VALID_UNTIL_TIME_TEST_VALUE), testTransportProcess.getValidUntilTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testTransportProcess.setValidUntilTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testTransportProcess.getValidUntilTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.TransportProcess#setReleaseTime}.
	 */
	public void testTransportProcesssetReleaseTime() throws InvalidSPDXAnalysisException {
		TransportProcess testTransportProcess = generator.builderForTransportProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.RELEASE_TIME_TEST_VALUE), testTransportProcess.getReleaseTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testTransportProcess.setReleaseTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testTransportProcess.getReleaseTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.TransportProcess#setProcessRationale}.
	 */
	public void testTransportProcesssetProcessRationale() throws InvalidSPDXAnalysisException {
		TransportProcess testTransportProcess = generator.builderForTransportProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.PROCESS_RATIONALE_TEST_VALUE), testTransportProcess.getProcessRationale());
		String newStringValue = "new processRationale value";
		testTransportProcess.setProcessRationale(newStringValue);
		assertEquals(Optional.of(newStringValue), testTransportProcess.getProcessRationale());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.TransportProcess#setName}.
	 */
	public void testTransportProcesssetName() throws InvalidSPDXAnalysisException {
		TransportProcess testTransportProcess = generator.builderForTransportProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.NAME_TEST_VALUE), testTransportProcess.getName());
		String newStringValue = "new name value";
		testTransportProcess.setName(newStringValue);
		assertEquals(Optional.of(newStringValue), testTransportProcess.getName());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.TransportProcess#setSummary}.
	 */
	public void testTransportProcesssetSummary() throws InvalidSPDXAnalysisException {
		TransportProcess testTransportProcess = generator.builderForTransportProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SUMMARY_TEST_VALUE), testTransportProcess.getSummary());
		String newStringValue = "new summary value";
		testTransportProcess.setSummary(newStringValue);
		assertEquals(Optional.of(newStringValue), testTransportProcess.getSummary());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.TransportProcess#getForPickupLocation}.
	 */
	public void testTransportProcessgetForPickupLocations() throws InvalidSPDXAnalysisException {
		TransportProcess testTransportProcess = generator.builderForTransportProcessTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testTransportProcess.getForPickupLocations())));
//		testTransportProcess.getForPickupLocations().clear();
//		testTransportProcess.getForPickupLocations().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testTransportProcess.getForPickupLocations())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.TransportProcess#getForDropoffLocation}.
	 */
	public void testTransportProcessgetForDropoffLocations() throws InvalidSPDXAnalysisException {
		TransportProcess testTransportProcess = generator.builderForTransportProcessTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testTransportProcess.getForDropoffLocations())));
//		testTransportProcess.getForDropoffLocations().clear();
//		testTransportProcess.getForDropoffLocations().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testTransportProcess.getForDropoffLocations())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.TransportProcess#getVerifiedUsing}.
	 */
	public void testTransportProcessgetVerifiedUsings() throws InvalidSPDXAnalysisException {
		TransportProcess testTransportProcess = generator.builderForTransportProcessTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testTransportProcess.getVerifiedUsings())));
//		testTransportProcess.getVerifiedUsings().clear();
//		testTransportProcess.getVerifiedUsings().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testTransportProcess.getVerifiedUsings())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.TransportProcess#getExternalRef}.
	 */
	public void testTransportProcessgetExternalRefs() throws InvalidSPDXAnalysisException {
		TransportProcess testTransportProcess = generator.builderForTransportProcessTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testTransportProcess.getExternalRefs())));
//		testTransportProcess.getExternalRefs().clear();
//		testTransportProcess.getExternalRefs().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testTransportProcess.getExternalRefs())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.TransportProcess#getOriginatedBy}.
	 */
	public void testTransportProcessgetOriginatedBys() throws InvalidSPDXAnalysisException {
		TransportProcess testTransportProcess = generator.builderForTransportProcessTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testTransportProcess.getOriginatedBys())));
//		testTransportProcess.getOriginatedBys().clear();
//		testTransportProcess.getOriginatedBys().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testTransportProcess.getOriginatedBys())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.TransportProcess#getExternalIdentifier}.
	 */
	public void testTransportProcessgetExternalIdentifiers() throws InvalidSPDXAnalysisException {
		TransportProcess testTransportProcess = generator.builderForTransportProcessTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testTransportProcess.getExternalIdentifiers())));
//		testTransportProcess.getExternalIdentifiers().clear();
//		testTransportProcess.getExternalIdentifiers().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testTransportProcess.getExternalIdentifiers())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.TransportProcess#getExtension}.
	 */
	public void testTransportProcessgetExtensions() throws InvalidSPDXAnalysisException {
		TransportProcess testTransportProcess = generator.builderForTransportProcessTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testTransportProcess.getExtensions())));
//		testTransportProcess.getExtensions().clear();
//		testTransportProcess.getExtensions().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testTransportProcess.getExtensions())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.TransportProcess#getStandardNames}.
	 */
	public void testTransportProcessgetStandardNames() throws InvalidSPDXAnalysisException {
		TransportProcess testTransportProcess = generator.builderForTransportProcessTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.STANDARD_NAME_TEST_LIST1, new ArrayList<>(testTransportProcess.getStandardNames())));
		testTransportProcess.getStandardNames().clear();
		testTransportProcess.getStandardNames().addAll(TestValuesGenerator.STANDARD_NAME_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.STANDARD_NAME_TEST_LIST2, new ArrayList<>(testTransportProcess.getStandardNames())));
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.TransportProcess#getPlannedTransportRoutess}.
	 */
	public void testTransportProcessgetPlannedTransportRoutess() throws InvalidSPDXAnalysisException {
		TransportProcess testTransportProcess = generator.builderForTransportProcessTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.PLANNED_TRANSPORT_ROUTES_TEST_LIST1, new ArrayList<>(testTransportProcess.getPlannedTransportRoutess())));
		testTransportProcess.getPlannedTransportRoutess().clear();
		testTransportProcess.getPlannedTransportRoutess().addAll(TestValuesGenerator.PLANNED_TRANSPORT_ROUTES_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.PLANNED_TRANSPORT_ROUTES_TEST_LIST2, new ArrayList<>(testTransportProcess.getPlannedTransportRoutess())));
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.TransportProcess#getSupportLevel}.
	 */
	public void testTransportProcessgetSupportLevels() throws InvalidSPDXAnalysisException {
		TransportProcess testTransportProcess = generator.builderForTransportProcessTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST1, new ArrayList<>(testTransportProcess.getSupportLevels())));
		testTransportProcess.getSupportLevels().clear();
		testTransportProcess.getSupportLevels().addAll(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST2, new ArrayList<>(testTransportProcess.getSupportLevels())));
	}
}
