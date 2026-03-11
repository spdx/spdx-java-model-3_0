/**
 * SPDX-FileCopyrightText: Copyright (c) 2026 Source Auditor Inc.
 * SPDX-FileType: SOURCE
 * SPDX-License-Identifier: Apache-2.0
 */
package org.spdx.library.model.v3_1.service;

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
import org.spdx.library.model.v3_1.core.ProfileIdentifierType;
import org.spdx.library.model.v3_1.extension.Extension;
import org.spdx.library.model.v3_1.service.SoftwareService.SoftwareServiceBuilder;

/**
 * GENERATED FILE - DO NOT MODIFY
 */
public class SoftwareServiceTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3_1.service.SoftwareService#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		SoftwareService testSoftwareService = generator.builderForSoftwareServiceTests(TEST_OBJECT_URI).build();
		List<String> result = testSoftwareService.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_1.service.SoftwareService#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		SoftwareService testSoftwareService = generator.builderForSoftwareServiceTests(TEST_OBJECT_URI).build();
		assertEquals("Service.SoftwareService", testSoftwareService.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_1.service.SoftwareService#Element(org.spdx.library.model.v3_1.service.SoftwareService.SoftwareServiceBuilder)}.
	 */
	public void testSoftwareServiceSoftwareServiceBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForSoftwareServiceTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		SoftwareService testSoftwareService = generator.builderForSoftwareServiceTests(TEST_OBJECT_URI).build();
		SoftwareService test2SoftwareService = generator.builderForSoftwareServiceTests("https://testObject2").build();
		assertTrue(testSoftwareService.equivalent(test2SoftwareService));
		assertTrue(test2SoftwareService.equivalent(testSoftwareService));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.service.SoftwareService#setExtension}.
	 */
	public void testSoftwareServicesetExtension() throws InvalidSPDXAnalysisException {
		SoftwareService testSoftwareService = generator.builderForSoftwareServiceTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testSoftwareService.getExtension());
//		testSoftwareService.setExtension(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testSoftwareService.getExtension());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.service.SoftwareService#setCreationInfo}.
	 */
	public void testSoftwareServicesetCreationInfo() throws InvalidSPDXAnalysisException {
		SoftwareService testSoftwareService = generator.builderForSoftwareServiceTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testSoftwareService.getCreationInfo());
//		testSoftwareService.setCreationInfo(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testSoftwareService.getCreationInfo());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.service.SoftwareService#setDescription}.
	 */
	public void testSoftwareServicesetDescription() throws InvalidSPDXAnalysisException {
		SoftwareService testSoftwareService = generator.builderForSoftwareServiceTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DESCRIPTION_TEST_VALUE), testSoftwareService.getDescription());
		String newStringValue = "new description value";
		testSoftwareService.setDescription(newStringValue);
		assertEquals(Optional.of(newStringValue), testSoftwareService.getDescription());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.service.SoftwareService#setComment}.
	 */
	public void testSoftwareServicesetComment() throws InvalidSPDXAnalysisException {
		SoftwareService testSoftwareService = generator.builderForSoftwareServiceTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMMENT_TEST_VALUE), testSoftwareService.getComment());
		String newStringValue = "new comment value";
		testSoftwareService.setComment(newStringValue);
		assertEquals(Optional.of(newStringValue), testSoftwareService.getComment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.service.SoftwareService#setName}.
	 */
	public void testSoftwareServicesetName() throws InvalidSPDXAnalysisException {
		SoftwareService testSoftwareService = generator.builderForSoftwareServiceTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.NAME_TEST_VALUE), testSoftwareService.getName());
		String newStringValue = "new name value";
		testSoftwareService.setName(newStringValue);
		assertEquals(Optional.of(newStringValue), testSoftwareService.getName());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.service.SoftwareService#setSummary}.
	 */
	public void testSoftwareServicesetSummary() throws InvalidSPDXAnalysisException {
		SoftwareService testSoftwareService = generator.builderForSoftwareServiceTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SUMMARY_TEST_VALUE), testSoftwareService.getSummary());
		String newStringValue = "new summary value";
		testSoftwareService.setSummary(newStringValue);
		assertEquals(Optional.of(newStringValue), testSoftwareService.getSummary());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.service.SoftwareService#getProvider}.
	 */
	public void testSoftwareServicegetProviders() throws InvalidSPDXAnalysisException {
		SoftwareService testSoftwareService = generator.builderForSoftwareServiceTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testSoftwareService.getProviders())));
//		testSoftwareService.getProviders().clear();
//		testSoftwareService.getProviders().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testSoftwareService.getProviders())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.service.SoftwareService#getVerifiedUsing}.
	 */
	public void testSoftwareServicegetVerifiedUsings() throws InvalidSPDXAnalysisException {
		SoftwareService testSoftwareService = generator.builderForSoftwareServiceTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testSoftwareService.getVerifiedUsings())));
//		testSoftwareService.getVerifiedUsings().clear();
//		testSoftwareService.getVerifiedUsings().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testSoftwareService.getVerifiedUsings())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.service.SoftwareService#getExternalRef}.
	 */
	public void testSoftwareServicegetExternalRefs() throws InvalidSPDXAnalysisException {
		SoftwareService testSoftwareService = generator.builderForSoftwareServiceTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testSoftwareService.getExternalRefs())));
//		testSoftwareService.getExternalRefs().clear();
//		testSoftwareService.getExternalRefs().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testSoftwareService.getExternalRefs())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.service.SoftwareService#getExternalIdentifier}.
	 */
	public void testSoftwareServicegetExternalIdentifiers() throws InvalidSPDXAnalysisException {
		SoftwareService testSoftwareService = generator.builderForSoftwareServiceTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testSoftwareService.getExternalIdentifiers())));
//		testSoftwareService.getExternalIdentifiers().clear();
//		testSoftwareService.getExternalIdentifiers().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testSoftwareService.getExternalIdentifiers())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.service.SoftwareService#getServiceHostingCountrys}.
	 */
	public void testSoftwareServicegetServiceHostingCountrys() throws InvalidSPDXAnalysisException {
		SoftwareService testSoftwareService = generator.builderForSoftwareServiceTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SERVICE_HOSTING_COUNTRY_TEST_LIST1, new ArrayList<>(testSoftwareService.getServiceHostingCountrys())));
		testSoftwareService.getServiceHostingCountrys().clear();
		testSoftwareService.getServiceHostingCountrys().addAll(TestValuesGenerator.SERVICE_HOSTING_COUNTRY_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SERVICE_HOSTING_COUNTRY_TEST_LIST2, new ArrayList<>(testSoftwareService.getServiceHostingCountrys())));
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.service.SoftwareService#getServerAuthenticationProtocol}.
	 */
	public void testSoftwareServicegetServerAuthenticationProtocols() throws InvalidSPDXAnalysisException {
		SoftwareService testSoftwareService = generator.builderForSoftwareServiceTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SERVER_AUTHENTICATION_PROTOCOL_TEST_LIST1, new ArrayList<>(testSoftwareService.getServerAuthenticationProtocols())));
		testSoftwareService.getServerAuthenticationProtocols().clear();
		testSoftwareService.getServerAuthenticationProtocols().addAll(TestValuesGenerator.SERVER_AUTHENTICATION_PROTOCOL_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SERVER_AUTHENTICATION_PROTOCOL_TEST_LIST2, new ArrayList<>(testSoftwareService.getServerAuthenticationProtocols())));
	}
}
