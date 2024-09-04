/**
 * SPDX-License-Identifier: Apache-2.0
 * Copyright (c) 2024 Source Auditor Inc.
 */
package org.spdx.library.model.v3_0_1;

import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.annotation.Nullable;

import org.spdx.core.CoreModelObject;
import org.spdx.core.IModelCopyManager;
import org.spdx.core.ISpdxModelInfo;
import org.spdx.core.InvalidSPDXAnalysisException;
import org.spdx.library.model.v3_0_1.core.ExternalElement;
import org.spdx.storage.IModelStore;

/**
 * GENERATED
 *
 */
public class TestSpdxModelInfo implements ISpdxModelInfo {

	@Override
	public Map<String, Enum<?>> getUriToEnumMap() {
		return SpdxEnumFactory.uriToEnum;
	}

	@Override
	public List<String> getSpecVersions() {
		return Arrays.asList(new String[] {"SPDX-3.0", "3.0.1"});
	}

	@Override
	public CoreModelObject createExternalElement(IModelStore store, String uri,
			IModelCopyManager copyManager, Class<?> type, String specVersion)
			throws InvalidSPDXAnalysisException {
		return new ExternalElement(store, uri, copyManager, true, null);
	}

	@Override
	public @Nullable Object uriToIndividual(String uri, @Nullable Class<?> type) {
		return SpdxIndividualFactory.uriToIndividual.get(uri);
	}

	@Override
	public CoreModelObject createModelObject(IModelStore modelStore,
			String objectUri, String type, IModelCopyManager copyManager,
			String specVersion, boolean create, String idPrefix)
			throws InvalidSPDXAnalysisException {
		if (TestValuesGenerator.MOCK_TYPE_TO_CLASS.containsKey(type)) {
			Class<?> clazz = TestValuesGenerator.MOCK_TYPE_TO_CLASS.get(type);
			try {
				Constructor<?> con = clazz.getDeclaredConstructor(IModelStore.class, String.class, IModelCopyManager.class, boolean.class, String.class);
				return (ModelObjectV3)con.newInstance(modelStore, objectUri, copyManager, create, null);
			} catch (Exception e) {
				throw new InvalidSPDXAnalysisException("Error creating Mock class");
			}
		} else {
			return SpdxModelClassFactoryV3.getModelObject(modelStore, objectUri, type, copyManager, create, idPrefix);
		}
	}

	@Override
	public Map<String, Class<?>> getTypeToClassMap() {
		Map<String, Class<?>> retval = new HashMap<>();
		for (Entry<String, Class<?>> entry:SpdxModelClassFactoryV3.SPDX_TYPE_TO_CLASS_V3.entrySet()) {
			retval.put(entry.getKey(), entry.getValue());
		}
		for (Entry<String, Class<?>> entry:TestValuesGenerator.MOCK_TYPE_TO_CLASS.entrySet()) {
			retval.put(entry.getKey(), entry.getValue());
		}
		return retval;
	}
	
	@Override
	public boolean canBeExternal(Class<?> clazz) {
		return false;
	}

}
