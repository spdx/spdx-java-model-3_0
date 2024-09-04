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
 
package org.spdx.library.model.v3_0_1.core;

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
import org.spdx.library.model.v3_0_1.core.ExternalMap.ExternalMapBuilder;

/**
 * GENERATED FILE - DO NOT MODIFY
**/

public class ExternalMapTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.ExternalMap#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		ExternalMap testExternalMap = generator.builderForExternalMapTests(TEST_OBJECT_URI).build();
		List<String> result = testExternalMap.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.ExternalMap#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		ExternalMap testExternalMap = generator.builderForExternalMapTests(TEST_OBJECT_URI).build();
		assertEquals("Core.ExternalMap", testExternalMap.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.ExternalMap#Element(org.spdx.library.model.v3_0_1.core.ExternalMap.ExternalMapBuilder)}.
	 */
	public void testExternalMapExternalMapBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForExternalMapTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		ExternalMap testExternalMap = generator.builderForExternalMapTests(TEST_OBJECT_URI).build();
		ExternalMap test2ExternalMap = generator.builderForExternalMapTests("https://testObject2").build();
		assertTrue(testExternalMap.equivalent(test2ExternalMap));
		assertTrue(test2ExternalMap.equivalent(testExternalMap));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.ExternalMap#setDefiningArtifact}.
	 */
	public void testExternalMapsetDefiningArtifact() throws InvalidSPDXAnalysisException {
		ExternalMap testExternalMap = generator.builderForExternalMapTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testExternalMap.getDefiningArtifact());
//		testExternalMap.setDefiningArtifact(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testExternalMap.getDefiningArtifact());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.ExternalMap#setExternalSpdxId}.
	 */
	public void testExternalMapsetExternalSpdxId() throws InvalidSPDXAnalysisException {
		ExternalMap testExternalMap = generator.builderForExternalMapTests(TEST_OBJECT_URI).build();
		assertEquals(TestValuesGenerator.EXTERNAL_SPDX_ID_TEST_VALUE, testExternalMap.getExternalSpdxId());
		String newStringValue = "new externalSpdxId value";
		testExternalMap.setExternalSpdxId(newStringValue);
		assertEquals(newStringValue, testExternalMap.getExternalSpdxId());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.ExternalMap#setLocationHint}.
	 */
	public void testExternalMapsetLocationHint() throws InvalidSPDXAnalysisException {
		ExternalMap testExternalMap = generator.builderForExternalMapTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.LOCATION_HINT_TEST_VALUE), testExternalMap.getLocationHint());
		String newStringValue = "new locationHint value";
		testExternalMap.setLocationHint(newStringValue);
		assertEquals(Optional.of(newStringValue), testExternalMap.getLocationHint());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.ExternalMap#getVerifiedUsing}.
	 */
	public void testExternalMapgetVerifiedUsings() throws InvalidSPDXAnalysisException {
		ExternalMap testExternalMap = generator.builderForExternalMapTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testExternalMap.getVerifiedUsings())));
//		testExternalMap.getVerifiedUsings().clear();
//		testExternalMap.getVerifiedUsings().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testExternalMap.getVerifiedUsings())));
		//TODO: Implement
	}
}