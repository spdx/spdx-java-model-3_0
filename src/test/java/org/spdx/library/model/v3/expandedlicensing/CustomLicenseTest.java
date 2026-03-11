/**
 * SPDX-FileCopyrightText: Copyright (c) 2026 Source Auditor Inc.
 * SPDX-FileType: SOURCE
 * SPDX-License-Identifier: Apache-2.0
 */
package org.spdx.library.model.v3.expandedlicensing;

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
import junit.framework.TestCase;
import org.spdx.core.ModelRegistry;
import org.spdx.library.model.v3.MockCopyManager;
import org.spdx.library.model.v3.MockModelStore;
import org.spdx.library.model.v3.SpdxConstantsV3;
import org.spdx.library.model.v3.SpdxModelInfoV3_0;
import org.spdx.library.model.v3.TestValuesGenerator;
import org.spdx.library.model.v3.UnitTestHelper;
import org.spdx.library.model.v3.core.Agent.AgentBuilder;
import org.spdx.library.model.v3.core.CreationInfo;
import org.spdx.library.model.v3.core.Element;
import org.spdx.library.model.v3.core.ExternalIdentifier;
import org.spdx.library.model.v3.core.ExternalRef;
import org.spdx.library.model.v3.core.IntegrityMethod;
import org.spdx.library.model.v3.core.ProfileIdentifierType;
import org.spdx.library.model.v3.expandedlicensing.CustomLicense.CustomLicenseBuilder;
import org.spdx.library.model.v3.extension.Extension;

/**
 * GENERATED FILE - DO NOT MODIFY
 */
public class CustomLicenseTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3.expandedlicensing.CustomLicense#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		CustomLicense testCustomLicense = generator.builderForCustomLicenseTests(TEST_OBJECT_URI).build();
		List<String> result = testCustomLicense.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.expandedlicensing.CustomLicense#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		CustomLicense testCustomLicense = generator.builderForCustomLicenseTests(TEST_OBJECT_URI).build();
		assertEquals("ExpandedLicensing.CustomLicense", testCustomLicense.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.expandedlicensing.CustomLicense#Element(org.spdx.library.model.v3.expandedlicensing.CustomLicense.CustomLicenseBuilder)}.
	 */
	public void testCustomLicenseCustomLicenseBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForCustomLicenseTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		CustomLicense testCustomLicense = generator.builderForCustomLicenseTests(TEST_OBJECT_URI).build();
		CustomLicense test2CustomLicense = generator.builderForCustomLicenseTests("https://testObject2").build();
		assertTrue(testCustomLicense.equivalent(test2CustomLicense));
		assertTrue(test2CustomLicense.equivalent(testCustomLicense));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.expandedlicensing.CustomLicense#setExtension}.
	 */
	public void testCustomLicensesetExtension() throws InvalidSPDXAnalysisException {
		CustomLicense testCustomLicense = generator.builderForCustomLicenseTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testCustomLicense.getExtension());
//		testCustomLicense.setExtension(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testCustomLicense.getExtension());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.expandedlicensing.CustomLicense#setCreationInfo}.
	 */
	public void testCustomLicensesetCreationInfo() throws InvalidSPDXAnalysisException {
		CustomLicense testCustomLicense = generator.builderForCustomLicenseTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testCustomLicense.getCreationInfo());
//		testCustomLicense.setCreationInfo(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testCustomLicense.getCreationInfo());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.expandedlicensing.CustomLicense#setIsFsfLibre}.
	 */
	public void testCustomLicensesetIsFsfLibre() throws InvalidSPDXAnalysisException {
		CustomLicense testCustomLicense = generator.builderForCustomLicenseTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(new Boolean(true)), testCustomLicense.getIsFsfLibre());
		testCustomLicense.setIsFsfLibre(false);
		assertEquals(Optional.of(new Boolean(false)), testCustomLicense.getIsFsfLibre());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.expandedlicensing.CustomLicense#setIsOsiApproved}.
	 */
	public void testCustomLicensesetIsOsiApproved() throws InvalidSPDXAnalysisException {
		CustomLicense testCustomLicense = generator.builderForCustomLicenseTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(new Boolean(true)), testCustomLicense.getIsOsiApproved());
		testCustomLicense.setIsOsiApproved(false);
		assertEquals(Optional.of(new Boolean(false)), testCustomLicense.getIsOsiApproved());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.expandedlicensing.CustomLicense#setIsDeprecatedLicenseId}.
	 */
	public void testCustomLicensesetIsDeprecatedLicenseId() throws InvalidSPDXAnalysisException {
		CustomLicense testCustomLicense = generator.builderForCustomLicenseTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(new Boolean(true)), testCustomLicense.getIsDeprecatedLicenseId());
		testCustomLicense.setIsDeprecatedLicenseId(false);
		assertEquals(Optional.of(new Boolean(false)), testCustomLicense.getIsDeprecatedLicenseId());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.expandedlicensing.CustomLicense#setDescription}.
	 */
	public void testCustomLicensesetDescription() throws InvalidSPDXAnalysisException {
		CustomLicense testCustomLicense = generator.builderForCustomLicenseTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DESCRIPTION_TEST_VALUE), testCustomLicense.getDescription());
		String newStringValue = "new description value";
		testCustomLicense.setDescription(newStringValue);
		assertEquals(Optional.of(newStringValue), testCustomLicense.getDescription());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.expandedlicensing.CustomLicense#setObsoletedBy}.
	 */
	public void testCustomLicensesetObsoletedBy() throws InvalidSPDXAnalysisException {
		CustomLicense testCustomLicense = generator.builderForCustomLicenseTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.OBSOLETED_BY_TEST_VALUE), testCustomLicense.getObsoletedBy());
		String newStringValue = "new obsoletedBy value";
		testCustomLicense.setObsoletedBy(newStringValue);
		assertEquals(Optional.of(newStringValue), testCustomLicense.getObsoletedBy());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.expandedlicensing.CustomLicense#setComment}.
	 */
	public void testCustomLicensesetComment() throws InvalidSPDXAnalysisException {
		CustomLicense testCustomLicense = generator.builderForCustomLicenseTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMMENT_TEST_VALUE), testCustomLicense.getComment());
		String newStringValue = "new comment value";
		testCustomLicense.setComment(newStringValue);
		assertEquals(Optional.of(newStringValue), testCustomLicense.getComment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.expandedlicensing.CustomLicense#setLicenseText}.
	 */
	public void testCustomLicensesetLicenseText() throws InvalidSPDXAnalysisException {
		CustomLicense testCustomLicense = generator.builderForCustomLicenseTests(TEST_OBJECT_URI).build();
		assertEquals(TestValuesGenerator.LICENSE_TEXT_TEST_VALUE, testCustomLicense.getLicenseText());
		String newStringValue = "new licenseText value";
		testCustomLicense.setLicenseText(newStringValue);
		assertEquals(newStringValue, testCustomLicense.getLicenseText());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.expandedlicensing.CustomLicense#setLicenseXml}.
	 */
	public void testCustomLicensesetLicenseXml() throws InvalidSPDXAnalysisException {
		CustomLicense testCustomLicense = generator.builderForCustomLicenseTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.LICENSE_XML_TEST_VALUE), testCustomLicense.getLicenseXml());
		String newStringValue = "new licenseXml value";
		testCustomLicense.setLicenseXml(newStringValue);
		assertEquals(Optional.of(newStringValue), testCustomLicense.getLicenseXml());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.expandedlicensing.CustomLicense#setStandardLicenseTemplate}.
	 */
	public void testCustomLicensesetStandardLicenseTemplate() throws InvalidSPDXAnalysisException {
		CustomLicense testCustomLicense = generator.builderForCustomLicenseTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.STANDARD_LICENSE_TEMPLATE_TEST_VALUE), testCustomLicense.getStandardLicenseTemplate());
		String newStringValue = "new standardLicenseTemplate value";
		testCustomLicense.setStandardLicenseTemplate(newStringValue);
		assertEquals(Optional.of(newStringValue), testCustomLicense.getStandardLicenseTemplate());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.expandedlicensing.CustomLicense#setName}.
	 */
	public void testCustomLicensesetName() throws InvalidSPDXAnalysisException {
		CustomLicense testCustomLicense = generator.builderForCustomLicenseTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.NAME_TEST_VALUE), testCustomLicense.getName());
		String newStringValue = "new name value";
		testCustomLicense.setName(newStringValue);
		assertEquals(Optional.of(newStringValue), testCustomLicense.getName());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.expandedlicensing.CustomLicense#setSummary}.
	 */
	public void testCustomLicensesetSummary() throws InvalidSPDXAnalysisException {
		CustomLicense testCustomLicense = generator.builderForCustomLicenseTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SUMMARY_TEST_VALUE), testCustomLicense.getSummary());
		String newStringValue = "new summary value";
		testCustomLicense.setSummary(newStringValue);
		assertEquals(Optional.of(newStringValue), testCustomLicense.getSummary());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.expandedlicensing.CustomLicense#setStandardLicenseHeader}.
	 */
	public void testCustomLicensesetStandardLicenseHeader() throws InvalidSPDXAnalysisException {
		CustomLicense testCustomLicense = generator.builderForCustomLicenseTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.STANDARD_LICENSE_HEADER_TEST_VALUE), testCustomLicense.getStandardLicenseHeader());
		String newStringValue = "new standardLicenseHeader value";
		testCustomLicense.setStandardLicenseHeader(newStringValue);
		assertEquals(Optional.of(newStringValue), testCustomLicense.getStandardLicenseHeader());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.expandedlicensing.CustomLicense#getVerifiedUsing}.
	 */
	public void testCustomLicensegetVerifiedUsings() throws InvalidSPDXAnalysisException {
		CustomLicense testCustomLicense = generator.builderForCustomLicenseTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testCustomLicense.getVerifiedUsings())));
//		testCustomLicense.getVerifiedUsings().clear();
//		testCustomLicense.getVerifiedUsings().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testCustomLicense.getVerifiedUsings())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.expandedlicensing.CustomLicense#getExternalRef}.
	 */
	public void testCustomLicensegetExternalRefs() throws InvalidSPDXAnalysisException {
		CustomLicense testCustomLicense = generator.builderForCustomLicenseTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testCustomLicense.getExternalRefs())));
//		testCustomLicense.getExternalRefs().clear();
//		testCustomLicense.getExternalRefs().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testCustomLicense.getExternalRefs())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.expandedlicensing.CustomLicense#getExternalIdentifier}.
	 */
	public void testCustomLicensegetExternalIdentifiers() throws InvalidSPDXAnalysisException {
		CustomLicense testCustomLicense = generator.builderForCustomLicenseTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testCustomLicense.getExternalIdentifiers())));
//		testCustomLicense.getExternalIdentifiers().clear();
//		testCustomLicense.getExternalIdentifiers().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testCustomLicense.getExternalIdentifiers())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.expandedlicensing.CustomLicense#getSeeAlsos}.
	 */
	public void testCustomLicensegetSeeAlsos() throws InvalidSPDXAnalysisException {
		CustomLicense testCustomLicense = generator.builderForCustomLicenseTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SEE_ALSO_TEST_LIST1, new ArrayList<>(testCustomLicense.getSeeAlsos())));
		testCustomLicense.getSeeAlsos().clear();
		testCustomLicense.getSeeAlsos().addAll(TestValuesGenerator.SEE_ALSO_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SEE_ALSO_TEST_LIST2, new ArrayList<>(testCustomLicense.getSeeAlsos())));
	}
}
