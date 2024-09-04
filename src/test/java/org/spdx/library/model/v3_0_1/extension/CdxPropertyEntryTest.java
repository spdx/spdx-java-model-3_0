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
 
package org.spdx.library.model.v3_0_1.extension;

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
import java.util.Collections;
import java.util.Objects;
import java.util.Optional;
import junit.framework.TestCase;
import org.spdx.core.ModelRegistry;
import org.spdx.library.model.v3_0_1.MockCopyManager;
import org.spdx.library.model.v3_0_1.MockModelStore;
import org.spdx.library.model.v3_0_1.SpdxConstantsV3;
import org.spdx.library.model.v3_0_1.SpdxModelInfoV3_0;
import org.spdx.library.model.v3_0_1.TestValuesGenerator;
import org.spdx.library.model.v3_0_1.UnitTestHelper;
import org.spdx.library.model.v3_0_1.core.Agent.AgentBuilder;
import org.spdx.library.model.v3_0_1.core.ProfileIdentifierType;
import org.spdx.library.model.v3_0_1.extension.CdxPropertyEntry.CdxPropertyEntryBuilder;

/**
 * GENERATED FILE - DO NOT MODIFY
**/

public class CdxPropertyEntryTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3_0_1.extension.CdxPropertyEntry#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		CdxPropertyEntry testCdxPropertyEntry = generator.builderForCdxPropertyEntryTests(TEST_OBJECT_URI).build();
		List<String> result = testCdxPropertyEntry.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.extension.CdxPropertyEntry#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		CdxPropertyEntry testCdxPropertyEntry = generator.builderForCdxPropertyEntryTests(TEST_OBJECT_URI).build();
		assertEquals("Extension.CdxPropertyEntry", testCdxPropertyEntry.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.extension.CdxPropertyEntry#Element(org.spdx.library.model.v3_0_1.extension.CdxPropertyEntry.CdxPropertyEntryBuilder)}.
	 */
	public void testCdxPropertyEntryCdxPropertyEntryBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForCdxPropertyEntryTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		CdxPropertyEntry testCdxPropertyEntry = generator.builderForCdxPropertyEntryTests(TEST_OBJECT_URI).build();
		CdxPropertyEntry test2CdxPropertyEntry = generator.builderForCdxPropertyEntryTests("https://testObject2").build();
		assertTrue(testCdxPropertyEntry.equivalent(test2CdxPropertyEntry));
		assertTrue(test2CdxPropertyEntry.equivalent(testCdxPropertyEntry));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.extension.CdxPropertyEntry#setCdxPropName}.
	 */
	public void testCdxPropertyEntrysetCdxPropName() throws InvalidSPDXAnalysisException {
		CdxPropertyEntry testCdxPropertyEntry = generator.builderForCdxPropertyEntryTests(TEST_OBJECT_URI).build();
		assertEquals(TestValuesGenerator.CDX_PROP_NAME_TEST_VALUE, testCdxPropertyEntry.getCdxPropName());
		String newStringValue = "new cdxPropName value";
		testCdxPropertyEntry.setCdxPropName(newStringValue);
		assertEquals(newStringValue, testCdxPropertyEntry.getCdxPropName());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.extension.CdxPropertyEntry#setCdxPropValue}.
	 */
	public void testCdxPropertyEntrysetCdxPropValue() throws InvalidSPDXAnalysisException {
		CdxPropertyEntry testCdxPropertyEntry = generator.builderForCdxPropertyEntryTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.CDX_PROP_VALUE_TEST_VALUE), testCdxPropertyEntry.getCdxPropValue());
		String newStringValue = "new cdxPropValue value";
		testCdxPropertyEntry.setCdxPropValue(newStringValue);
		assertEquals(Optional.of(newStringValue), testCdxPropertyEntry.getCdxPropValue());
	}
}