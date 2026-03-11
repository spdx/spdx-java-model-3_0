/**
 * SPDX-FileCopyrightText: Copyright (c) 2026 Source Auditor Inc.
 * SPDX-FileType: SOURCE
 * SPDX-License-Identifier: Apache-2.0
 */
package org.spdx.library.model.v3_1.core;

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
import org.spdx.library.model.v3_1.core.CreationInfo;
import org.spdx.library.model.v3_1.core.Element;
import org.spdx.library.model.v3_1.core.PhysicalLocation.PhysicalLocationBuilder;
import org.spdx.library.model.v3_1.extension.Extension;

/**
 * GENERATED FILE - DO NOT MODIFY
 */
public class PhysicalLocationTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3_1.core.PhysicalLocation#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		PhysicalLocation testPhysicalLocation = generator.builderForPhysicalLocationTests(TEST_OBJECT_URI).build();
		List<String> result = testPhysicalLocation.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_1.core.PhysicalLocation#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		PhysicalLocation testPhysicalLocation = generator.builderForPhysicalLocationTests(TEST_OBJECT_URI).build();
		assertEquals("Core.PhysicalLocation", testPhysicalLocation.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_1.core.PhysicalLocation#Element(org.spdx.library.model.v3_1.core.PhysicalLocation.PhysicalLocationBuilder)}.
	 */
	public void testPhysicalLocationPhysicalLocationBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForPhysicalLocationTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		PhysicalLocation testPhysicalLocation = generator.builderForPhysicalLocationTests(TEST_OBJECT_URI).build();
		PhysicalLocation test2PhysicalLocation = generator.builderForPhysicalLocationTests("https://testObject2").build();
		assertTrue(testPhysicalLocation.equivalent(test2PhysicalLocation));
		assertTrue(test2PhysicalLocation.equivalent(testPhysicalLocation));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.core.PhysicalLocation#setExtension}.
	 */
	public void testPhysicalLocationsetExtension() throws InvalidSPDXAnalysisException {
		PhysicalLocation testPhysicalLocation = generator.builderForPhysicalLocationTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testPhysicalLocation.getExtension());
//		testPhysicalLocation.setExtension(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testPhysicalLocation.getExtension());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.core.PhysicalLocation#setCreationInfo}.
	 */
	public void testPhysicalLocationsetCreationInfo() throws InvalidSPDXAnalysisException {
		PhysicalLocation testPhysicalLocation = generator.builderForPhysicalLocationTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testPhysicalLocation.getCreationInfo());
//		testPhysicalLocation.setCreationInfo(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testPhysicalLocation.getCreationInfo());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.core.PhysicalLocation#setCountyCode}.
	 */
	public void testPhysicalLocationsetCountyCode() throws InvalidSPDXAnalysisException {
		PhysicalLocation testPhysicalLocation = generator.builderForPhysicalLocationTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COUNTY_CODE_TEST_VALUE), testPhysicalLocation.getCountyCode());
		String newStringValue = "new countyCode value";
		testPhysicalLocation.setCountyCode(newStringValue);
		assertEquals(Optional.of(newStringValue), testPhysicalLocation.getCountyCode());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.core.PhysicalLocation#setDescription}.
	 */
	public void testPhysicalLocationsetDescription() throws InvalidSPDXAnalysisException {
		PhysicalLocation testPhysicalLocation = generator.builderForPhysicalLocationTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DESCRIPTION_TEST_VALUE), testPhysicalLocation.getDescription());
		String newStringValue = "new description value";
		testPhysicalLocation.setDescription(newStringValue);
		assertEquals(Optional.of(newStringValue), testPhysicalLocation.getDescription());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.core.PhysicalLocation#setPostOfficeBoxNumber}.
	 */
	public void testPhysicalLocationsetPostOfficeBoxNumber() throws InvalidSPDXAnalysisException {
		PhysicalLocation testPhysicalLocation = generator.builderForPhysicalLocationTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.POST_OFFICE_BOX_NUMBER_TEST_VALUE), testPhysicalLocation.getPostOfficeBoxNumber());
		String newStringValue = "new postOfficeBoxNumber value";
		testPhysicalLocation.setPostOfficeBoxNumber(newStringValue);
		assertEquals(Optional.of(newStringValue), testPhysicalLocation.getPostOfficeBoxNumber());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.core.PhysicalLocation#setCountry}.
	 */
	public void testPhysicalLocationsetCountry() throws InvalidSPDXAnalysisException {
		PhysicalLocation testPhysicalLocation = generator.builderForPhysicalLocationTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COUNTRY_TEST_VALUE), testPhysicalLocation.getCountry());
		String newStringValue = UnitTestHelper.genRandPattern("^[A-Z]{3}$");
		testPhysicalLocation.setCountry(newStringValue);
		assertEquals(Optional.of(newStringValue), testPhysicalLocation.getCountry());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.core.PhysicalLocation#setPostalCode}.
	 */
	public void testPhysicalLocationsetPostalCode() throws InvalidSPDXAnalysisException {
		PhysicalLocation testPhysicalLocation = generator.builderForPhysicalLocationTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.POSTAL_CODE_TEST_VALUE), testPhysicalLocation.getPostalCode());
		String newStringValue = "new postalCode value";
		testPhysicalLocation.setPostalCode(newStringValue);
		assertEquals(Optional.of(newStringValue), testPhysicalLocation.getPostalCode());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.core.PhysicalLocation#setPostalName}.
	 */
	public void testPhysicalLocationsetPostalName() throws InvalidSPDXAnalysisException {
		PhysicalLocation testPhysicalLocation = generator.builderForPhysicalLocationTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.POSTAL_NAME_TEST_VALUE), testPhysicalLocation.getPostalName());
		String newStringValue = "new postalName value";
		testPhysicalLocation.setPostalName(newStringValue);
		assertEquals(Optional.of(newStringValue), testPhysicalLocation.getPostalName());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.core.PhysicalLocation#setComment}.
	 */
	public void testPhysicalLocationsetComment() throws InvalidSPDXAnalysisException {
		PhysicalLocation testPhysicalLocation = generator.builderForPhysicalLocationTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMMENT_TEST_VALUE), testPhysicalLocation.getComment());
		String newStringValue = "new comment value";
		testPhysicalLocation.setComment(newStringValue);
		assertEquals(Optional.of(newStringValue), testPhysicalLocation.getComment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.core.PhysicalLocation#setProvinceStateCode}.
	 */
	public void testPhysicalLocationsetProvinceStateCode() throws InvalidSPDXAnalysisException {
		PhysicalLocation testPhysicalLocation = generator.builderForPhysicalLocationTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.PROVINCE_STATE_CODE_TEST_VALUE), testPhysicalLocation.getProvinceStateCode());
		String newStringValue = "new provinceStateCode value";
		testPhysicalLocation.setProvinceStateCode(newStringValue);
		assertEquals(Optional.of(newStringValue), testPhysicalLocation.getProvinceStateCode());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.core.PhysicalLocation#setCity}.
	 */
	public void testPhysicalLocationsetCity() throws InvalidSPDXAnalysisException {
		PhysicalLocation testPhysicalLocation = generator.builderForPhysicalLocationTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.CITY_TEST_VALUE), testPhysicalLocation.getCity());
		String newStringValue = "new city value";
		testPhysicalLocation.setCity(newStringValue);
		assertEquals(Optional.of(newStringValue), testPhysicalLocation.getCity());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.core.PhysicalLocation#setStreetAddress}.
	 */
	public void testPhysicalLocationsetStreetAddress() throws InvalidSPDXAnalysisException {
		PhysicalLocation testPhysicalLocation = generator.builderForPhysicalLocationTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.STREET_ADDRESS_TEST_VALUE), testPhysicalLocation.getStreetAddress());
		String newStringValue = "new streetAddress value";
		testPhysicalLocation.setStreetAddress(newStringValue);
		assertEquals(Optional.of(newStringValue), testPhysicalLocation.getStreetAddress());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.core.PhysicalLocation#setLocationTime}.
	 */
	public void testPhysicalLocationsetLocationTime() throws InvalidSPDXAnalysisException {
		PhysicalLocation testPhysicalLocation = generator.builderForPhysicalLocationTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.LOCATION_TIME_TEST_VALUE), testPhysicalLocation.getLocationTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testPhysicalLocation.setLocationTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testPhysicalLocation.getLocationTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.core.PhysicalLocation#setName}.
	 */
	public void testPhysicalLocationsetName() throws InvalidSPDXAnalysisException {
		PhysicalLocation testPhysicalLocation = generator.builderForPhysicalLocationTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.NAME_TEST_VALUE), testPhysicalLocation.getName());
		String newStringValue = "new name value";
		testPhysicalLocation.setName(newStringValue);
		assertEquals(Optional.of(newStringValue), testPhysicalLocation.getName());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.core.PhysicalLocation#setSummary}.
	 */
	public void testPhysicalLocationsetSummary() throws InvalidSPDXAnalysisException {
		PhysicalLocation testPhysicalLocation = generator.builderForPhysicalLocationTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SUMMARY_TEST_VALUE), testPhysicalLocation.getSummary());
		String newStringValue = "new summary value";
		testPhysicalLocation.setSummary(newStringValue);
		assertEquals(Optional.of(newStringValue), testPhysicalLocation.getSummary());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.core.PhysicalLocation#getVerifiedUsing}.
	 */
	public void testPhysicalLocationgetVerifiedUsings() throws InvalidSPDXAnalysisException {
		PhysicalLocation testPhysicalLocation = generator.builderForPhysicalLocationTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testPhysicalLocation.getVerifiedUsings())));
//		testPhysicalLocation.getVerifiedUsings().clear();
//		testPhysicalLocation.getVerifiedUsings().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testPhysicalLocation.getVerifiedUsings())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.core.PhysicalLocation#getExternalRef}.
	 */
	public void testPhysicalLocationgetExternalRefs() throws InvalidSPDXAnalysisException {
		PhysicalLocation testPhysicalLocation = generator.builderForPhysicalLocationTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testPhysicalLocation.getExternalRefs())));
//		testPhysicalLocation.getExternalRefs().clear();
//		testPhysicalLocation.getExternalRefs().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testPhysicalLocation.getExternalRefs())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.core.PhysicalLocation#getExternalIdentifier}.
	 */
	public void testPhysicalLocationgetExternalIdentifiers() throws InvalidSPDXAnalysisException {
		PhysicalLocation testPhysicalLocation = generator.builderForPhysicalLocationTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testPhysicalLocation.getExternalIdentifiers())));
//		testPhysicalLocation.getExternalIdentifiers().clear();
//		testPhysicalLocation.getExternalIdentifiers().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testPhysicalLocation.getExternalIdentifiers())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.core.PhysicalLocation#getGeographicPointLocations}.
	 */
	public void testPhysicalLocationgetGeographicPointLocations() throws InvalidSPDXAnalysisException {
		PhysicalLocation testPhysicalLocation = generator.builderForPhysicalLocationTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.GEOGRAPHIC_POINT_LOCATION_TEST_LIST1, new ArrayList<>(testPhysicalLocation.getGeographicPointLocations())));
		testPhysicalLocation.getGeographicPointLocations().clear();
		testPhysicalLocation.getGeographicPointLocations().addAll(TestValuesGenerator.GEOGRAPHIC_POINT_LOCATION_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.GEOGRAPHIC_POINT_LOCATION_TEST_LIST2, new ArrayList<>(testPhysicalLocation.getGeographicPointLocations())));
	}
}
