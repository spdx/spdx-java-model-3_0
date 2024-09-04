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
import java.util.Collection;
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
import org.spdx.library.model.v3_0_1.extension.CdxPropertiesExtension.CdxPropertiesExtensionBuilder;

/**
 * GENERATED FILE - DO NOT MODIFY
**/

public class CdxPropertiesExtensionTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3_0_1.extension.CdxPropertiesExtension#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		CdxPropertiesExtension testCdxPropertiesExtension = generator.builderForCdxPropertiesExtensionTests(TEST_OBJECT_URI).build();
		List<String> result = testCdxPropertiesExtension.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.extension.CdxPropertiesExtension#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		CdxPropertiesExtension testCdxPropertiesExtension = generator.builderForCdxPropertiesExtensionTests(TEST_OBJECT_URI).build();
		assertEquals("Extension.CdxPropertiesExtension", testCdxPropertiesExtension.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.extension.CdxPropertiesExtension#Element(org.spdx.library.model.v3_0_1.extension.CdxPropertiesExtension.CdxPropertiesExtensionBuilder)}.
	 */
	public void testCdxPropertiesExtensionCdxPropertiesExtensionBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForCdxPropertiesExtensionTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		CdxPropertiesExtension testCdxPropertiesExtension = generator.builderForCdxPropertiesExtensionTests(TEST_OBJECT_URI).build();
		CdxPropertiesExtension test2CdxPropertiesExtension = generator.builderForCdxPropertiesExtensionTests("https://testObject2").build();
		assertTrue(testCdxPropertiesExtension.equivalent(test2CdxPropertiesExtension));
		assertTrue(test2CdxPropertiesExtension.equivalent(testCdxPropertiesExtension));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.extension.CdxPropertiesExtension#getCdxProperty}.
	 */
	public void testCdxPropertiesExtensiongetCdxPropertys() throws InvalidSPDXAnalysisException {
		CdxPropertiesExtension testCdxPropertiesExtension = generator.builderForCdxPropertiesExtensionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testCdxPropertiesExtension.getCdxPropertys())));
//		testCdxPropertiesExtension.getCdxPropertys().clear();
//		testCdxPropertiesExtension.getCdxPropertys().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testCdxPropertiesExtension.getCdxPropertys())));
		//TODO: Implement
	}
}