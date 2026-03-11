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
import org.spdx.library.model.v3.SpdxModelInfoV3_0;
import org.spdx.library.model.v3.TestValuesGenerator;
import org.spdx.library.model.v3.UnitTestHelper;
import org.spdx.library.model.v3.core.Agent.AgentBuilder;
import org.spdx.library.model.v3.core.Agent;
import org.spdx.library.model.v3.core.CreationInfo;
import org.spdx.library.model.v3.core.DictionaryEntry;
import org.spdx.library.model.v3.core.Element;
import org.spdx.library.model.v3.core.ExternalIdentifier;
import org.spdx.library.model.v3.core.ExternalRef;
import org.spdx.library.model.v3.core.IntegrityMethod;
import org.spdx.library.model.v3.core.Location;
import org.spdx.library.model.v3.core.ProfileIdentifierType;
import org.spdx.library.model.v3.core.SupportType;
import org.spdx.library.model.v3.extension.Extension;
import org.spdx.library.model.v3.supplychain.TransportAction.TransportActionBuilder;

/**
 * GENERATED FILE - DO NOT MODIFY
 */
public class TransportActionTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3.supplychain.TransportAction#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		TransportAction testTransportAction = generator.builderForTransportActionTests(TEST_OBJECT_URI).build();
		List<String> result = testTransportAction.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.TransportAction#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		TransportAction testTransportAction = generator.builderForTransportActionTests(TEST_OBJECT_URI).build();
		assertEquals("SupplyChain.TransportAction", testTransportAction.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.TransportAction#Element(org.spdx.library.model.v3.supplychain.TransportAction.TransportActionBuilder)}.
	 */
	public void testTransportActionTransportActionBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForTransportActionTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		TransportAction testTransportAction = generator.builderForTransportActionTests(TEST_OBJECT_URI).build();
		TransportAction test2TransportAction = generator.builderForTransportActionTests("https://testObject2").build();
		assertTrue(testTransportAction.equivalent(test2TransportAction));
		assertTrue(test2TransportAction.equivalent(testTransportAction));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.TransportAction#setSuppliedBy}.
	 */
	public void testTransportActionsetSuppliedBy() throws InvalidSPDXAnalysisException {
		TransportAction testTransportAction = generator.builderForTransportActionTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testTransportAction.getSuppliedBy());
//		testTransportAction.setSuppliedBy(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testTransportAction.getSuppliedBy());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.TransportAction#setExtension}.
	 */
	public void testTransportActionsetExtension() throws InvalidSPDXAnalysisException {
		TransportAction testTransportAction = generator.builderForTransportActionTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testTransportAction.getExtension());
//		testTransportAction.setExtension(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testTransportAction.getExtension());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.TransportAction#setCreationInfo}.
	 */
	public void testTransportActionsetCreationInfo() throws InvalidSPDXAnalysisException {
		TransportAction testTransportAction = generator.builderForTransportActionTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testTransportAction.getCreationInfo());
//		testTransportAction.setCreationInfo(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testTransportAction.getCreationInfo());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.TransportAction#setIntendedUse}.
	 */
	public void testTransportActionsetIntendedUse() throws InvalidSPDXAnalysisException {
		TransportAction testTransportAction = generator.builderForTransportActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.INTENDED_USE_TEST_VALUE), testTransportAction.getIntendedUse());
		String newStringValue = "new intendedUse value";
		testTransportAction.setIntendedUse(newStringValue);
		assertEquals(Optional.of(newStringValue), testTransportAction.getIntendedUse());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.TransportAction#setDescription}.
	 */
	public void testTransportActionsetDescription() throws InvalidSPDXAnalysisException {
		TransportAction testTransportAction = generator.builderForTransportActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DESCRIPTION_TEST_VALUE), testTransportAction.getDescription());
		String newStringValue = "new description value";
		testTransportAction.setDescription(newStringValue);
		assertEquals(Optional.of(newStringValue), testTransportAction.getDescription());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.TransportAction#setBuiltTime}.
	 */
	public void testTransportActionsetBuiltTime() throws InvalidSPDXAnalysisException {
		TransportAction testTransportAction = generator.builderForTransportActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.BUILT_TIME_TEST_VALUE), testTransportAction.getBuiltTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testTransportAction.setBuiltTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testTransportAction.getBuiltTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.TransportAction#setActionEndTime}.
	 */
	public void testTransportActionsetActionEndTime() throws InvalidSPDXAnalysisException {
		TransportAction testTransportAction = generator.builderForTransportActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.ACTION_END_TIME_TEST_VALUE), testTransportAction.getActionEndTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testTransportAction.setActionEndTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testTransportAction.getActionEndTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.TransportAction#setComment}.
	 */
	public void testTransportActionsetComment() throws InvalidSPDXAnalysisException {
		TransportAction testTransportAction = generator.builderForTransportActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMMENT_TEST_VALUE), testTransportAction.getComment());
		String newStringValue = "new comment value";
		testTransportAction.setComment(newStringValue);
		assertEquals(Optional.of(newStringValue), testTransportAction.getComment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.TransportAction#setValidUntilTime}.
	 */
	public void testTransportActionsetValidUntilTime() throws InvalidSPDXAnalysisException {
		TransportAction testTransportAction = generator.builderForTransportActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.VALID_UNTIL_TIME_TEST_VALUE), testTransportAction.getValidUntilTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testTransportAction.setValidUntilTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testTransportAction.getValidUntilTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.TransportAction#setName}.
	 */
	public void testTransportActionsetName() throws InvalidSPDXAnalysisException {
		TransportAction testTransportAction = generator.builderForTransportActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.NAME_TEST_VALUE), testTransportAction.getName());
		String newStringValue = "new name value";
		testTransportAction.setName(newStringValue);
		assertEquals(Optional.of(newStringValue), testTransportAction.getName());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.TransportAction#setReleaseTime}.
	 */
	public void testTransportActionsetReleaseTime() throws InvalidSPDXAnalysisException {
		TransportAction testTransportAction = generator.builderForTransportActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.RELEASE_TIME_TEST_VALUE), testTransportAction.getReleaseTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testTransportAction.setReleaseTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testTransportAction.getReleaseTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.TransportAction#setSummary}.
	 */
	public void testTransportActionsetSummary() throws InvalidSPDXAnalysisException {
		TransportAction testTransportAction = generator.builderForTransportActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SUMMARY_TEST_VALUE), testTransportAction.getSummary());
		String newStringValue = "new summary value";
		testTransportAction.setSummary(newStringValue);
		assertEquals(Optional.of(newStringValue), testTransportAction.getSummary());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.TransportAction#setActionStartTime}.
	 */
	public void testTransportActionsetActionStartTime() throws InvalidSPDXAnalysisException {
		TransportAction testTransportAction = generator.builderForTransportActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.ACTION_START_TIME_TEST_VALUE), testTransportAction.getActionStartTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testTransportAction.setActionStartTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testTransportAction.getActionStartTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.TransportAction#getActionLocation}.
	 */
	public void testTransportActiongetActionLocations() throws InvalidSPDXAnalysisException {
		TransportAction testTransportAction = generator.builderForTransportActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testTransportAction.getActionLocations())));
//		testTransportAction.getActionLocations().clear();
//		testTransportAction.getActionLocations().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testTransportAction.getActionLocations())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.TransportAction#getExternalRef}.
	 */
	public void testTransportActiongetExternalRefs() throws InvalidSPDXAnalysisException {
		TransportAction testTransportAction = generator.builderForTransportActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testTransportAction.getExternalRefs())));
//		testTransportAction.getExternalRefs().clear();
//		testTransportAction.getExternalRefs().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testTransportAction.getExternalRefs())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.TransportAction#getDropoffLocation}.
	 */
	public void testTransportActiongetDropoffLocations() throws InvalidSPDXAnalysisException {
		TransportAction testTransportAction = generator.builderForTransportActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testTransportAction.getDropoffLocations())));
//		testTransportAction.getDropoffLocations().clear();
//		testTransportAction.getDropoffLocations().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testTransportAction.getDropoffLocations())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.TransportAction#getPickupLocation}.
	 */
	public void testTransportActiongetPickupLocations() throws InvalidSPDXAnalysisException {
		TransportAction testTransportAction = generator.builderForTransportActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testTransportAction.getPickupLocations())));
//		testTransportAction.getPickupLocations().clear();
//		testTransportAction.getPickupLocations().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testTransportAction.getPickupLocations())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.TransportAction#getVerifiedUsing}.
	 */
	public void testTransportActiongetVerifiedUsings() throws InvalidSPDXAnalysisException {
		TransportAction testTransportAction = generator.builderForTransportActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testTransportAction.getVerifiedUsings())));
//		testTransportAction.getVerifiedUsings().clear();
//		testTransportAction.getVerifiedUsings().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testTransportAction.getVerifiedUsings())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.TransportAction#getOriginatedBy}.
	 */
	public void testTransportActiongetOriginatedBys() throws InvalidSPDXAnalysisException {
		TransportAction testTransportAction = generator.builderForTransportActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testTransportAction.getOriginatedBys())));
//		testTransportAction.getOriginatedBys().clear();
//		testTransportAction.getOriginatedBys().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testTransportAction.getOriginatedBys())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.TransportAction#getExternalIdentifier}.
	 */
	public void testTransportActiongetExternalIdentifiers() throws InvalidSPDXAnalysisException {
		TransportAction testTransportAction = generator.builderForTransportActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testTransportAction.getExternalIdentifiers())));
//		testTransportAction.getExternalIdentifiers().clear();
//		testTransportAction.getExternalIdentifiers().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testTransportAction.getExternalIdentifiers())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.TransportAction#getAdditionalInformation}.
	 */
	public void testTransportActiongetAdditionalInformations() throws InvalidSPDXAnalysisException {
		TransportAction testTransportAction = generator.builderForTransportActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testTransportAction.getAdditionalInformations())));
//		testTransportAction.getAdditionalInformations().clear();
//		testTransportAction.getAdditionalInformations().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testTransportAction.getAdditionalInformations())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.TransportAction#getTransportRoutes}.
	 */
	public void testTransportActiongetTransportRoutes() throws InvalidSPDXAnalysisException {
		TransportAction testTransportAction = generator.builderForTransportActionTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.TRANSPORT_ROUTE_TEST_LIST1, new ArrayList<>(testTransportAction.getTransportRoutes())));
		testTransportAction.getTransportRoutes().clear();
		testTransportAction.getTransportRoutes().addAll(TestValuesGenerator.TRANSPORT_ROUTE_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.TRANSPORT_ROUTE_TEST_LIST2, new ArrayList<>(testTransportAction.getTransportRoutes())));
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.TransportAction#getStandardNames}.
	 */
	public void testTransportActiongetStandardNames() throws InvalidSPDXAnalysisException {
		TransportAction testTransportAction = generator.builderForTransportActionTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.STANDARD_NAME_TEST_LIST1, new ArrayList<>(testTransportAction.getStandardNames())));
		testTransportAction.getStandardNames().clear();
		testTransportAction.getStandardNames().addAll(TestValuesGenerator.STANDARD_NAME_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.STANDARD_NAME_TEST_LIST2, new ArrayList<>(testTransportAction.getStandardNames())));
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.TransportAction#getSupportLevel}.
	 */
	public void testTransportActiongetSupportLevels() throws InvalidSPDXAnalysisException {
		TransportAction testTransportAction = generator.builderForTransportActionTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST1, new ArrayList<>(testTransportAction.getSupportLevels())));
		testTransportAction.getSupportLevels().clear();
		testTransportAction.getSupportLevels().addAll(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST2, new ArrayList<>(testTransportAction.getSupportLevels())));
	}
}
