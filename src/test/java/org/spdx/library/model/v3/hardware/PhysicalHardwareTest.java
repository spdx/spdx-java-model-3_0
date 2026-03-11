/**
 * SPDX-FileCopyrightText: Copyright (c) 2026 Source Auditor Inc.
 * SPDX-FileType: SOURCE
 * SPDX-License-Identifier: Apache-2.0
 */
package org.spdx.library.model.v3.hardware;

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
import org.spdx.library.model.v3.core.DefinedType;
import org.spdx.library.model.v3.core.DictionaryEntry;
import org.spdx.library.model.v3.core.Element;
import org.spdx.library.model.v3.core.ExternalIdentifier;
import org.spdx.library.model.v3.core.ExternalRef;
import org.spdx.library.model.v3.core.IntegrityMethod;
import org.spdx.library.model.v3.core.MeasureOfMass;
import org.spdx.library.model.v3.core.ProfileIdentifierType;
import org.spdx.library.model.v3.core.Specification;
import org.spdx.library.model.v3.core.SupportType;
import org.spdx.library.model.v3.extension.Extension;
import org.spdx.library.model.v3.hardware.PhysicalHardware.PhysicalHardwareBuilder;

/**
 * GENERATED FILE - DO NOT MODIFY
 */
public class PhysicalHardwareTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3.hardware.PhysicalHardware#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		PhysicalHardware testPhysicalHardware = generator.builderForPhysicalHardwareTests(TEST_OBJECT_URI).build();
		List<String> result = testPhysicalHardware.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.PhysicalHardware#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		PhysicalHardware testPhysicalHardware = generator.builderForPhysicalHardwareTests(TEST_OBJECT_URI).build();
		assertEquals("Hardware.PhysicalHardware", testPhysicalHardware.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.PhysicalHardware#Element(org.spdx.library.model.v3.hardware.PhysicalHardware.PhysicalHardwareBuilder)}.
	 */
	public void testPhysicalHardwarePhysicalHardwareBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForPhysicalHardwareTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		PhysicalHardware testPhysicalHardware = generator.builderForPhysicalHardwareTests(TEST_OBJECT_URI).build();
		PhysicalHardware test2PhysicalHardware = generator.builderForPhysicalHardwareTests("https://testObject2").build();
		assertTrue(testPhysicalHardware.equivalent(test2PhysicalHardware));
		assertTrue(test2PhysicalHardware.equivalent(testPhysicalHardware));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.PhysicalHardware#setProductAgent}.
	 */
	public void testPhysicalHardwaresetProductAgent() throws InvalidSPDXAnalysisException {
		PhysicalHardware testPhysicalHardware = generator.builderForPhysicalHardwareTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testPhysicalHardware.getProductAgent());
//		testPhysicalHardware.setProductAgent(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testPhysicalHardware.getProductAgent());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.PhysicalHardware#setSuppliedBy}.
	 */
	public void testPhysicalHardwaresetSuppliedBy() throws InvalidSPDXAnalysisException {
		PhysicalHardware testPhysicalHardware = generator.builderForPhysicalHardwareTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testPhysicalHardware.getSuppliedBy());
//		testPhysicalHardware.setSuppliedBy(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testPhysicalHardware.getSuppliedBy());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.PhysicalHardware#setDimensions}.
	 */
	public void testPhysicalHardwaresetDimensions() throws InvalidSPDXAnalysisException {
		PhysicalHardware testPhysicalHardware = generator.builderForPhysicalHardwareTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testPhysicalHardware.getDimensions());
//		testPhysicalHardware.setDimensions(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testPhysicalHardware.getDimensions());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.PhysicalHardware#setCenterOfMass}.
	 */
	public void testPhysicalHardwaresetCenterOfMass() throws InvalidSPDXAnalysisException {
		PhysicalHardware testPhysicalHardware = generator.builderForPhysicalHardwareTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testPhysicalHardware.getCenterOfMass());
//		testPhysicalHardware.setCenterOfMass(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testPhysicalHardware.getCenterOfMass());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.PhysicalHardware#setMassOfHardware}.
	 */
	public void testPhysicalHardwaresetMassOfHardware() throws InvalidSPDXAnalysisException {
		PhysicalHardware testPhysicalHardware = generator.builderForPhysicalHardwareTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testPhysicalHardware.getMassOfHardware());
//		testPhysicalHardware.setMassOfHardware(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testPhysicalHardware.getMassOfHardware());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.PhysicalHardware#setExtension}.
	 */
	public void testPhysicalHardwaresetExtension() throws InvalidSPDXAnalysisException {
		PhysicalHardware testPhysicalHardware = generator.builderForPhysicalHardwareTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testPhysicalHardware.getExtension());
//		testPhysicalHardware.setExtension(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testPhysicalHardware.getExtension());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.PhysicalHardware#setCreationInfo}.
	 */
	public void testPhysicalHardwaresetCreationInfo() throws InvalidSPDXAnalysisException {
		PhysicalHardware testPhysicalHardware = generator.builderForPhysicalHardwareTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testPhysicalHardware.getCreationInfo());
//		testPhysicalHardware.setCreationInfo(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testPhysicalHardware.getCreationInfo());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.PhysicalHardware#setBatchNumber}.
	 */
	public void testPhysicalHardwaresetBatchNumber() throws InvalidSPDXAnalysisException {
		PhysicalHardware testPhysicalHardware = generator.builderForPhysicalHardwareTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.BATCH_NUMBER_TEST_VALUE), testPhysicalHardware.getBatchNumber());
		String newStringValue = "new batchNumber value";
		testPhysicalHardware.setBatchNumber(newStringValue);
		assertEquals(Optional.of(newStringValue), testPhysicalHardware.getBatchNumber());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.PhysicalHardware#setSerialNumber}.
	 */
	public void testPhysicalHardwaresetSerialNumber() throws InvalidSPDXAnalysisException {
		PhysicalHardware testPhysicalHardware = generator.builderForPhysicalHardwareTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SERIAL_NUMBER_TEST_VALUE), testPhysicalHardware.getSerialNumber());
		String newStringValue = "new serialNumber value";
		testPhysicalHardware.setSerialNumber(newStringValue);
		assertEquals(Optional.of(newStringValue), testPhysicalHardware.getSerialNumber());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.PhysicalHardware#setIntendedUse}.
	 */
	public void testPhysicalHardwaresetIntendedUse() throws InvalidSPDXAnalysisException {
		PhysicalHardware testPhysicalHardware = generator.builderForPhysicalHardwareTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.INTENDED_USE_TEST_VALUE), testPhysicalHardware.getIntendedUse());
		String newStringValue = "new intendedUse value";
		testPhysicalHardware.setIntendedUse(newStringValue);
		assertEquals(Optional.of(newStringValue), testPhysicalHardware.getIntendedUse());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.PhysicalHardware#setDescription}.
	 */
	public void testPhysicalHardwaresetDescription() throws InvalidSPDXAnalysisException {
		PhysicalHardware testPhysicalHardware = generator.builderForPhysicalHardwareTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DESCRIPTION_TEST_VALUE), testPhysicalHardware.getDescription());
		String newStringValue = "new description value";
		testPhysicalHardware.setDescription(newStringValue);
		assertEquals(Optional.of(newStringValue), testPhysicalHardware.getDescription());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.PhysicalHardware#setBuiltTime}.
	 */
	public void testPhysicalHardwaresetBuiltTime() throws InvalidSPDXAnalysisException {
		PhysicalHardware testPhysicalHardware = generator.builderForPhysicalHardwareTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.BUILT_TIME_TEST_VALUE), testPhysicalHardware.getBuiltTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testPhysicalHardware.setBuiltTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testPhysicalHardware.getBuiltTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.PhysicalHardware#setPartNumber}.
	 */
	public void testPhysicalHardwaresetPartNumber() throws InvalidSPDXAnalysisException {
		PhysicalHardware testPhysicalHardware = generator.builderForPhysicalHardwareTests(TEST_OBJECT_URI).build();
		assertEquals(TestValuesGenerator.PART_NUMBER_TEST_VALUE, testPhysicalHardware.getPartNumber());
		String newStringValue = "new partNumber value";
		testPhysicalHardware.setPartNumber(newStringValue);
		assertEquals(newStringValue, testPhysicalHardware.getPartNumber());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.PhysicalHardware#setComment}.
	 */
	public void testPhysicalHardwaresetComment() throws InvalidSPDXAnalysisException {
		PhysicalHardware testPhysicalHardware = generator.builderForPhysicalHardwareTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMMENT_TEST_VALUE), testPhysicalHardware.getComment());
		String newStringValue = "new comment value";
		testPhysicalHardware.setComment(newStringValue);
		assertEquals(Optional.of(newStringValue), testPhysicalHardware.getComment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.PhysicalHardware#setValidUntilTime}.
	 */
	public void testPhysicalHardwaresetValidUntilTime() throws InvalidSPDXAnalysisException {
		PhysicalHardware testPhysicalHardware = generator.builderForPhysicalHardwareTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.VALID_UNTIL_TIME_TEST_VALUE), testPhysicalHardware.getValidUntilTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testPhysicalHardware.setValidUntilTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testPhysicalHardware.getValidUntilTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.PhysicalHardware#setReleaseDate}.
	 */
	public void testPhysicalHardwaresetReleaseDate() throws InvalidSPDXAnalysisException {
		PhysicalHardware testPhysicalHardware = generator.builderForPhysicalHardwareTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.RELEASE_DATE_TEST_VALUE), testPhysicalHardware.getReleaseDate());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testPhysicalHardware.setReleaseDate(newStringValue);
		assertEquals(Optional.of(newStringValue), testPhysicalHardware.getReleaseDate());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.PhysicalHardware#setName}.
	 */
	public void testPhysicalHardwaresetName() throws InvalidSPDXAnalysisException {
		PhysicalHardware testPhysicalHardware = generator.builderForPhysicalHardwareTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.NAME_TEST_VALUE), testPhysicalHardware.getName());
		String newStringValue = "new name value";
		testPhysicalHardware.setName(newStringValue);
		assertEquals(Optional.of(newStringValue), testPhysicalHardware.getName());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.PhysicalHardware#setHardwareVersion}.
	 */
	public void testPhysicalHardwaresetHardwareVersion() throws InvalidSPDXAnalysisException {
		PhysicalHardware testPhysicalHardware = generator.builderForPhysicalHardwareTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.HARDWARE_VERSION_TEST_VALUE), testPhysicalHardware.getHardwareVersion());
		String newStringValue = "new hardwareVersion value";
		testPhysicalHardware.setHardwareVersion(newStringValue);
		assertEquals(Optional.of(newStringValue), testPhysicalHardware.getHardwareVersion());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.PhysicalHardware#setReleaseTime}.
	 */
	public void testPhysicalHardwaresetReleaseTime() throws InvalidSPDXAnalysisException {
		PhysicalHardware testPhysicalHardware = generator.builderForPhysicalHardwareTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.RELEASE_TIME_TEST_VALUE), testPhysicalHardware.getReleaseTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testPhysicalHardware.setReleaseTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testPhysicalHardware.getReleaseTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.PhysicalHardware#setSummary}.
	 */
	public void testPhysicalHardwaresetSummary() throws InvalidSPDXAnalysisException {
		PhysicalHardware testPhysicalHardware = generator.builderForPhysicalHardwareTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SUMMARY_TEST_VALUE), testPhysicalHardware.getSummary());
		String newStringValue = "new summary value";
		testPhysicalHardware.setSummary(newStringValue);
		assertEquals(Optional.of(newStringValue), testPhysicalHardware.getSummary());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.PhysicalHardware#getExternalRef}.
	 */
	public void testPhysicalHardwaregetExternalRefs() throws InvalidSPDXAnalysisException {
		PhysicalHardware testPhysicalHardware = generator.builderForPhysicalHardwareTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testPhysicalHardware.getExternalRefs())));
//		testPhysicalHardware.getExternalRefs().clear();
//		testPhysicalHardware.getExternalRefs().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testPhysicalHardware.getExternalRefs())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.PhysicalHardware#getHardwareAdditionalInformation}.
	 */
	public void testPhysicalHardwaregetHardwareAdditionalInformations() throws InvalidSPDXAnalysisException {
		PhysicalHardware testPhysicalHardware = generator.builderForPhysicalHardwareTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testPhysicalHardware.getHardwareAdditionalInformations())));
//		testPhysicalHardware.getHardwareAdditionalInformations().clear();
//		testPhysicalHardware.getHardwareAdditionalInformations().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testPhysicalHardware.getHardwareAdditionalInformations())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.PhysicalHardware#getAdditionalInformationSpecification}.
	 */
	public void testPhysicalHardwaregetAdditionalInformationSpecifications() throws InvalidSPDXAnalysisException {
		PhysicalHardware testPhysicalHardware = generator.builderForPhysicalHardwareTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testPhysicalHardware.getAdditionalInformationSpecifications())));
//		testPhysicalHardware.getAdditionalInformationSpecifications().clear();
//		testPhysicalHardware.getAdditionalInformationSpecifications().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testPhysicalHardware.getAdditionalInformationSpecifications())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.PhysicalHardware#getHazard}.
	 */
	public void testPhysicalHardwaregetHazards() throws InvalidSPDXAnalysisException {
		PhysicalHardware testPhysicalHardware = generator.builderForPhysicalHardwareTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testPhysicalHardware.getHazards())));
//		testPhysicalHardware.getHazards().clear();
//		testPhysicalHardware.getHazards().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testPhysicalHardware.getHazards())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.PhysicalHardware#getCategory}.
	 */
	public void testPhysicalHardwaregetCategorys() throws InvalidSPDXAnalysisException {
		PhysicalHardware testPhysicalHardware = generator.builderForPhysicalHardwareTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testPhysicalHardware.getCategorys())));
//		testPhysicalHardware.getCategorys().clear();
//		testPhysicalHardware.getCategorys().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testPhysicalHardware.getCategorys())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.PhysicalHardware#getVerifiedUsing}.
	 */
	public void testPhysicalHardwaregetVerifiedUsings() throws InvalidSPDXAnalysisException {
		PhysicalHardware testPhysicalHardware = generator.builderForPhysicalHardwareTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testPhysicalHardware.getVerifiedUsings())));
//		testPhysicalHardware.getVerifiedUsings().clear();
//		testPhysicalHardware.getVerifiedUsings().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testPhysicalHardware.getVerifiedUsings())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.PhysicalHardware#getOriginatedBy}.
	 */
	public void testPhysicalHardwaregetOriginatedBys() throws InvalidSPDXAnalysisException {
		PhysicalHardware testPhysicalHardware = generator.builderForPhysicalHardwareTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testPhysicalHardware.getOriginatedBys())));
//		testPhysicalHardware.getOriginatedBys().clear();
//		testPhysicalHardware.getOriginatedBys().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testPhysicalHardware.getOriginatedBys())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.PhysicalHardware#getExternalIdentifier}.
	 */
	public void testPhysicalHardwaregetExternalIdentifiers() throws InvalidSPDXAnalysisException {
		PhysicalHardware testPhysicalHardware = generator.builderForPhysicalHardwareTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testPhysicalHardware.getExternalIdentifiers())));
//		testPhysicalHardware.getExternalIdentifiers().clear();
//		testPhysicalHardware.getExternalIdentifiers().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testPhysicalHardware.getExternalIdentifiers())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.PhysicalHardware#getStandardNames}.
	 */
	public void testPhysicalHardwaregetStandardNames() throws InvalidSPDXAnalysisException {
		PhysicalHardware testPhysicalHardware = generator.builderForPhysicalHardwareTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.STANDARD_NAME_TEST_LIST1, new ArrayList<>(testPhysicalHardware.getStandardNames())));
		testPhysicalHardware.getStandardNames().clear();
		testPhysicalHardware.getStandardNames().addAll(TestValuesGenerator.STANDARD_NAME_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.STANDARD_NAME_TEST_LIST2, new ArrayList<>(testPhysicalHardware.getStandardNames())));
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.PhysicalHardware#getSupportLevel}.
	 */
	public void testPhysicalHardwaregetSupportLevels() throws InvalidSPDXAnalysisException {
		PhysicalHardware testPhysicalHardware = generator.builderForPhysicalHardwareTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST1, new ArrayList<>(testPhysicalHardware.getSupportLevels())));
		testPhysicalHardware.getSupportLevels().clear();
		testPhysicalHardware.getSupportLevels().addAll(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST2, new ArrayList<>(testPhysicalHardware.getSupportLevels())));
	}
}
