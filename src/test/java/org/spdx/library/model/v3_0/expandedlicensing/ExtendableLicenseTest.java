/**
 * SPDX-FileCopyrightText: Copyright (c) 2026 Source Auditor Inc.
 * SPDX-FileType: SOURCE
 * SPDX-License-Identifier: Apache-2.0
 */
package org.spdx.library.model.v3_0.expandedlicensing;

import javax.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.spdx.core.CoreModelObject;
import org.spdx.core.DefaultModelStore;
import org.spdx.core.InvalidSPDXAnalysisException;
import org.spdx.core.IModelCopyManager;
import org.spdx.core.IndividualUriValue;
import org.spdx.library.model.v3_0.ModelObjectV3;
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
import org.spdx.library.model.v3_0.MockCopyManager;
import org.spdx.library.model.v3_0.MockModelStore;
import org.spdx.library.model.v3_0.SpdxConstantsV3;
import org.spdx.library.model.v3_0.SpdxModelInfoV3_0;
import org.spdx.library.model.v3_0.TestValuesGenerator;
import org.spdx.library.model.v3_0.UnitTestHelper;
import org.spdx.library.model.v3_0.core.Agent.AgentBuilder;
import org.spdx.library.model.v3_0.core.CreationInfo;
import org.spdx.library.model.v3_0.core.Element;
import org.spdx.library.model.v3_0.core.ExternalIdentifier;
import org.spdx.library.model.v3_0.core.ExternalRef;
import org.spdx.library.model.v3_0.core.IntegrityMethod;
import org.spdx.library.model.v3_0.core.ProfileIdentifierType;
import org.spdx.library.model.v3_0.expandedlicensing.ExtendableLicense.ExtendableLicenseBuilder;
import org.spdx.library.model.v3_0.extension.Extension;
import org.spdx.library.model.v3_0.simplelicensing.AnyLicenseInfo;

/**
 * GENERATED FILE - DO NOT MODIFY
 */
public class ExtendableLicenseTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3_0.expandedlicensing.ExtendableLicense#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		ExtendableLicense testExtendableLicense = generator.builderForExtendableLicenseTests(TEST_OBJECT_URI).build();
		List<String> result = testExtendableLicense.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_0.expandedlicensing.ExtendableLicense#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		ExtendableLicense testExtendableLicense = generator.builderForExtendableLicenseTests(TEST_OBJECT_URI).build();
		assertEquals("ExpandedLicensing.ExtendableLicense", testExtendableLicense.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_0.expandedlicensing.ExtendableLicense#Element(org.spdx.library.model.v3_0.expandedlicensing.ExtendableLicense.ExtendableLicenseBuilder)}.
	 */
	public void testExtendableLicenseExtendableLicenseBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForExtendableLicenseTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		ExtendableLicense testExtendableLicense = generator.builderForExtendableLicenseTests(TEST_OBJECT_URI).build();
		ExtendableLicense test2ExtendableLicense = generator.builderForExtendableLicenseTests("https://testObject2").build();
		assertTrue(testExtendableLicense.equivalent(test2ExtendableLicense));
		assertTrue(test2ExtendableLicense.equivalent(testExtendableLicense));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0.expandedlicensing.ExtendableLicense#setExtension}.
	 */
	public void testExtendableLicensesetExtension() throws InvalidSPDXAnalysisException {
		ExtendableLicense testExtendableLicense = generator.builderForExtendableLicenseTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testExtendableLicense.getExtension());
//		testExtendableLicense.setExtension(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testExtendableLicense.getExtension());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0.expandedlicensing.ExtendableLicense#setCreationInfo}.
	 */
	public void testExtendableLicensesetCreationInfo() throws InvalidSPDXAnalysisException {
		ExtendableLicense testExtendableLicense = generator.builderForExtendableLicenseTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testExtendableLicense.getCreationInfo());
//		testExtendableLicense.setCreationInfo(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testExtendableLicense.getCreationInfo());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0.expandedlicensing.ExtendableLicense#setName}.
	 */
	public void testExtendableLicensesetName() throws InvalidSPDXAnalysisException {
		ExtendableLicense testExtendableLicense = generator.builderForExtendableLicenseTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.NAME_TEST_VALUE), testExtendableLicense.getName());
		String newStringValue = "new name value";
		testExtendableLicense.setName(newStringValue);
		assertEquals(Optional.of(newStringValue), testExtendableLicense.getName());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0.expandedlicensing.ExtendableLicense#setDescription}.
	 */
	public void testExtendableLicensesetDescription() throws InvalidSPDXAnalysisException {
		ExtendableLicense testExtendableLicense = generator.builderForExtendableLicenseTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DESCRIPTION_TEST_VALUE), testExtendableLicense.getDescription());
		String newStringValue = "new description value";
		testExtendableLicense.setDescription(newStringValue);
		assertEquals(Optional.of(newStringValue), testExtendableLicense.getDescription());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0.expandedlicensing.ExtendableLicense#setComment}.
	 */
	public void testExtendableLicensesetComment() throws InvalidSPDXAnalysisException {
		ExtendableLicense testExtendableLicense = generator.builderForExtendableLicenseTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMMENT_TEST_VALUE), testExtendableLicense.getComment());
		String newStringValue = "new comment value";
		testExtendableLicense.setComment(newStringValue);
		assertEquals(Optional.of(newStringValue), testExtendableLicense.getComment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0.expandedlicensing.ExtendableLicense#setSummary}.
	 */
	public void testExtendableLicensesetSummary() throws InvalidSPDXAnalysisException {
		ExtendableLicense testExtendableLicense = generator.builderForExtendableLicenseTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SUMMARY_TEST_VALUE), testExtendableLicense.getSummary());
		String newStringValue = "new summary value";
		testExtendableLicense.setSummary(newStringValue);
		assertEquals(Optional.of(newStringValue), testExtendableLicense.getSummary());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0.expandedlicensing.ExtendableLicense#getExternalRef}.
	 */
	public void testExtendableLicensegetExternalRefs() throws InvalidSPDXAnalysisException {
		ExtendableLicense testExtendableLicense = generator.builderForExtendableLicenseTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testExtendableLicense.getExternalRefs())));
//		testExtendableLicense.getExternalRefs().clear();
//		testExtendableLicense.getExternalRefs().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testExtendableLicense.getExternalRefs())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0.expandedlicensing.ExtendableLicense#getVerifiedUsing}.
	 */
	public void testExtendableLicensegetVerifiedUsings() throws InvalidSPDXAnalysisException {
		ExtendableLicense testExtendableLicense = generator.builderForExtendableLicenseTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testExtendableLicense.getVerifiedUsings())));
//		testExtendableLicense.getVerifiedUsings().clear();
//		testExtendableLicense.getVerifiedUsings().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testExtendableLicense.getVerifiedUsings())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0.expandedlicensing.ExtendableLicense#getExternalIdentifier}.
	 */
	public void testExtendableLicensegetExternalIdentifiers() throws InvalidSPDXAnalysisException {
		ExtendableLicense testExtendableLicense = generator.builderForExtendableLicenseTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testExtendableLicense.getExternalIdentifiers())));
//		testExtendableLicense.getExternalIdentifiers().clear();
//		testExtendableLicense.getExternalIdentifiers().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testExtendableLicense.getExternalIdentifiers())));
		//TODO: Implement
	}
}
